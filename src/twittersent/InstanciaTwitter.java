/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittersent;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * 
 * @author pedro
 */
public class InstanciaTwitter {
    public static Twitter criarinstancia(){
        
        /**
         * Basicamente cria uma instancia para autenticar no APP do twitter;
         */
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
                
        cb.setDebugEnabled(true)
         .setOAuthConsumerKey("jtNvvpTKNAG7oYq42Q7rbXNxo")
         .setOAuthConsumerSecret("aMsjpD6VD2KTRY5zMsJTzAzdUyFxghQBwefXYOxJzJGzGr9KxM")
         .setOAuthAccessToken("925190081715081216-FFpoE9MPh60rDxmkncplaaarX63y5p8")
         .setOAuthAccessTokenSecret("8YO4rzT2AIMpW24kXGw5t1LIPDaKO9b7OcjzoUDdYVY2X");
         TwitterFactory tf = new TwitterFactory(cb.build());
         Twitter twitter = tf.getInstance();
         return twitter;
    }
    
}
