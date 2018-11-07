/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author calvi
 */
public abstract class Tools {
    public static String delim ="---split---";
    public static void writeToFile(String fileName, String toWrite, boolean append){        
        try {
            // Assume default encoding.            
            FileWriter fileWriter =
                new FileWriter(fileName,append);//add true to append
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(toWrite);
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    public static void saveToDB(Vector<Link> hitLinks, String DB_URL) {
        //sort hitLinks
        Collections.sort(hitLinks);
        try {
            Connection conn = DriverManager.getConnection(DB_URL, "calvin", "2255");
            PreparedStatement dlt = conn.prepareStatement("DELETE FROM LINKS WHERE 1=1");
            dlt.executeUpdate();
            PreparedStatement ps = conn.prepareStatement("insert into LINKS(RELEVANCE,URL)"
                        + "values(?,?)");
            
            for(Link l : hitLinks){                
                ps.setDouble(1, l.getRelevance());                    
                //ps.setInt(2, l.errors());
                //ps.setBoolean(3, l.isFailed());
                ps.setString(2, l.getHyperlink());
                //System.out.println(ps.executeUpdate());
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BackgroundRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void saveToCSV(Vector<Link> hitLinks, String forClassifier){
         FileWriter fileWriter =
                    null;
        try {
            fileWriter = new FileWriter(forClassifier,false); //add true to append
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            for(Link l : hitLinks){
                bufferedWriter.write(Tools.delim+l.getRelevance()+Tools.delim);  //delim -s ','            
                bufferedWriter.write(l.getHyperlink()+Tools.delim);
                bufferedWriter.write(l.getText()+"\n");             
            }
            bufferedWriter.close();
            fileWriter.close();
        } 
        catch (IOException ex) {
            Logger.getLogger(BackgroundRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void saveToHTML(Vector<Link> hitLinks, String finalHTML, String searchFor){
        //Collections.sort(hitLinks);
        Vector<Link> copy = new Vector(hitLinks);
        Collections.sort(copy);
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n" +
"<html>\n" +
"	<head>\n" +
"		<title>StoryGrab</title>\n" +
"		<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\n" +
"	</head>\n" +
"	<body>\n" +
"		<div class=\"gee\">\n" +
"			<span class=\"title1\">StoryGrab</span>\n" +
                "<span class=\"hits\">Hits: "+copy.size()+" - Search Term: \""+
                        searchFor+"\"</span>"+ 
"		</div>\n" +
"		<div class=\"heading\">			\n" +
"			\n" +
"		</div>\n" +
"		<div class=\"out\">\n" +
"			<span class=\"txt\">");
        Collections.reverse(copy);
        for(int i = 0; i<copy.size();i++){
            sb.append("Frequency: "+copy.get(i).getTermFreq()+
                    " - <a href=\""+copy.get(i).getHyperlink()+"\">"+
                    copy.get(i).getTitle()+"</a><br>\n");
        }
        sb.append("			</span>\n" +
"		</div>\n" +
"	</body>\n" +
"</html>");
        Collections.sort(copy);
        //sb.append("</body>\n</html>");
        
        FileWriter fileWriter =
                    null;
        try {
            fileWriter = new FileWriter(finalHTML,false); //add true to append
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);            
            bufferedWriter.write(sb.toString());
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException ex){
            System.out.println("no html");
        }
    }
}