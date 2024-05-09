package amoa.server;

import amoa.webservices.ProductsManagerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.Endpoint;

public class ServerPublisher {
    private static Logger logger = LoggerFactory.getLogger(ServerPublisher.class);

    public static void main(String[] args){
        logger.info("Starting server");
        Endpoint.publish("http://localhost:2020/webservices/ProductsManager", new ProductsManagerImpl());
        logger.info("Server started");
    }
}
//Etapes à suivre:
//1-run to classPublisher ==> generates an URL
//2-Url+?wsdl
//3-fichier word contenant le fichier généré  et puis on va à soap ui et on teste le code et on copie au fihcier
//on fait le rapport avec les screens
//4-Générer le client: (le code sur tp) ==> chercher sur internet comment générer le client qui va appeler le webservice

//QCM sur cours + Exercice