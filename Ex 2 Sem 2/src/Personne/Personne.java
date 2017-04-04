package Personne;

public class Personne {
	
	private String nom;
    private String prenom;
    private String ville;
    private int age;
    private double solde;
    private boolean sexe;
    

    public Personne (){
        
    }
    
    public Personne (String nom, String prenom, String ville, int age, double solde, boolean sexe){
        this.nom = nom;
        this.prenom=prenom;
        this.ville=ville;
        this.age=age;
        this.solde=solde;
        this.sexe=sexe;
        
    }
    
    void affiche (){
        
        System.out.println(nom + " " +prenom +" "+ ville +" " + age +" " +solde + " " + sexe + " ");
        
            if (sexe) 
                
                System.out.println("F");
            else 
                
                System.out.println("M");
            
    }

    void affiche (String nom){
        
        if (this.nom == nom){
        System.out.println(prenom + " " + ville + " " + age + " " + solde+" " + sexe+ " ");
        }
    }
    
    public boolean isFille (){
        if (sexe== true)
        return true;
            return false;
        }
    
    
    public boolean match (String nom){
        if (nom == this.nom)
            return true;
                    return false;
        
        
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    
    public boolean getSexe() {
        return sexe;
    }

    
    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    
}



