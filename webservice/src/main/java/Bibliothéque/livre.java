package Bibliothéque;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class livre {
	private String fonctiondupersonne;
	private String nomlivre ;
	private String infolivre ;
	public livre() {
		
	}
	
	public livre(String fonctiondupersonne, String nomlivre, String infolivre) {
		super();
		this.fonctiondupersonne = fonctiondupersonne;
		this.nomlivre = nomlivre;
		this.infolivre = infolivre;
	}
	public String getFonctiondupersonne() {
		return fonctiondupersonne;
	}
	public void setFonctiondupersonne(String fonctiondupersonne) {
		this.fonctiondupersonne = fonctiondupersonne;
	}
	public String getNomlivre() {
		return nomlivre;
	}
	public void setNomlivre(String nomlivre) {
		this.nomlivre = nomlivre;
	}
	public String getInfolivre() {
		return infolivre;
	}
	public void setInfolivre(String infolivre) {
		this.infolivre = infolivre;
	}
	

}
