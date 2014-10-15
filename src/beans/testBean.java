package beans;

public class testBean {
	private String nom;
	private String prenom;
	private boolean genius;
	
	public String getNom(){
		return nom;
	}
	public String getPrenom(){
		return prenom;
	}
	public boolean isGenius(){
		return genius;
	}
	public void setNom(String n){
		nom=n;
	}
	public void setPrenom(String p){
		prenom=p;
	}
	public void setGenius(boolean g){
		genius=g;
	}
}
