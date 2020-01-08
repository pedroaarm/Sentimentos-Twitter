/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittersent;

import static java.lang.Thread.sleep;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.*;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


/**
 *
 * @author pedro
 */

 
public class TwitterSent {

    /**
     * @param args the command line arguments
     * 
     */
 
    public static void main(String[] args) throws TwitterException, InterruptedException {
       Utils util = new Utils();
       RecebeTwitters recebe = new RecebeTwitters();
        
        
        do{
                    List<String> twitter = recebe.searchtweets();
                    boolean verificaRT = Utils.verificaRT(twitter);
                    
                    if(verificaRT){
                        System.out.println("é Retuiter::::::::" + twitter);
                    }else{
                                              System.out.println("não é ::::::::" + twitter);
                    }
                  
                    
                    sleep(1000);
        }while(true);
   
   

        
        
        

    }
    
    

    
}
