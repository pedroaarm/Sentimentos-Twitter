/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittersent;

import java.util.List;
import twitter4j.Twitter;

/**
 *
 * @author pedro
 */
public class Utils {
    
    public static String FormataTwitter(List<String> twitter){
        
        System.out.println("Recedigo: "+twitter);
        String recebe = String.valueOf(twitter);
        String va1 = recebe.replace("[", "");
        String va2 = va1.replace("]","");
        
        System.out.println("Saido: "+ va2);
        
        return va2;
    }
    
    public static boolean verificaRT(List<String> twitter){
        System.out.println("Tamanho = "+ twitter.size());
        if(twitter.size() > 0 ){
        String recebe = String.valueOf(twitter);
        String va1 = recebe.replace("[", "");
        String va2 = va1.replace("]","");
        String verifica = va2.substring(0, 2);
            System.out.println("Esta assim: " + verifica );
          if(verifica.equals("RT")){
              return true;
          }else{
              String va3 = verifica.substring(0,1);
              if(va3.equals("@")){
                  return true;
              }else{
              return false;
              }
          }
    }else{
            return true;
        }
        
    
}
}
