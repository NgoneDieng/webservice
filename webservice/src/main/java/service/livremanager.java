package service;
import java.util.ArrayList;
import java.util.List;

import Bibliothéque.livre;
public class livremanager {
	List<livre> livres = new ArrayList<>();
 public livre createlivre(String f,String n,String i) {
	 livre l = new livre(f,n,i);
	 livres.add(l);
	 return l;
	
}
 public List<livre> getlivres() {
	 return livres; 
	 
 }
}