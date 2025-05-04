package Bibliowebservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import Bibliothéque.livre;
import service.livremanager;

@WebService (serviceName = "pws")

public class livrews {
livremanager manager = new livremanager();
 @WebMethod(operationName = "create")

	public livre createlivre(@WebParam(name="fonctiondupersonne")String f,@WebParam(name="nomlivre ")String n,@WebParam(name="infolivre ")String i) {
		return manager.createlivre(f, n, i);
		}
 
 @WebMethod(operationName = "livres")
 	
	public List<livre> getlivres(){
		return manager.getlivres();
	}
}
