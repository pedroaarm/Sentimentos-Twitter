/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittersent;

import java.util.List;
import java.util.stream.Collectors;
import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 *Classe para Chamar a API do Twitter para o recebimento de menssagens.
 * @author pedro
 */
public class RecebeTwitters {
    
   private static Twitter twitter = InstanciaTwitter.criarinstancia();
   public static List<String> searchtweets() throws TwitterException {
   
    Query query = new Query();
    GeoLocation geo = new GeoLocation(-22.9035, -43.2096);
    query.setGeoCode(geo, 600, Query.Unit.km);
    query.setCount(2);
    query.setLang("pt");
    QueryResult result = twitter.search(query);
    
    List<String> retorno =  result.getTweets().stream()
      .map(item -> item.getText())
      .collect(Collectors.toList());
    
    //result.nextQuery();
    return retorno;
}
    
}
