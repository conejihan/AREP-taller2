import java.net.MalformedURLException;
import java.net.URL;

public class URLParser {
    public static void main(String[] args){
        try{
            URL googleURL = new URL("https://practice.geeksforgeeks.org/courses/competitive-programming-live/?utm_source=geeksforgeeks&utm_medium=subment&utm_campaign=GFG_Submenu_CP#Holax");
            System.out.println("Protocol: "+ googleURL.getProtocol());
            System.out.println("Host: "+ googleURL.getHost());
            System.out.println("Port: "+ googleURL.getPort());
            System.out.println("Authority: "+ googleURL.getAuthority());
            System.out.println("Path: "+ googleURL.getPath());
            System.out.println("Query: "+ googleURL.getQuery());
            System.out.println("File: "+ googleURL.getFile());
            System.out.println("Ref: "+ googleURL.getRef());


        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
