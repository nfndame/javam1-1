import java.util.ArrayList;
 


public class Dossier extends superclass{
	
	private ArrayList<superclass> liste;

	
	public int explore() {
		
		return 1;
	}
	
	public Dossier() {
		this.nom="";
		this.liste= new ArrayList();
	}
	
	
	public void add(superclass d) {
		this.liste.add(d);
		
	}
	
	
	public int explore(superclass d) {
		
		return 1;
		
	}
	
	public int getTaille() {
		int somme=0;
		for(int i = 0; i <this.liste.size(); i++){
			somme = somme +this.liste.get(i).getTaille();	
		}   
		return somme;
	}

    public Boolean verifProblem(superclass d) {
    	
    	if (this == d)
    		return true;
    	else 
    		return false;
    }
	public boolean verifintern () {
		
			boolean somme=false;
			for(int i = 0; i <this.liste.size(); i++){
				somme = somme && this.liste.get(i).verifProblem(this);	
			}   
			return somme;
		
		
		verif(this);
		
	}
}