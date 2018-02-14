public class Main{
	public static void main(String[] args){
		Kuutio k = new Kuutio();
		System.out.println(k.toSting());
	}
}

interface Kappale {
	double annaAla();
	double[] annaKeskipiste();
}

class Kuutio implements Kappale{
	double sivunPituus;
	
	public Kuutio(){
		sivunPituus = 1.0;
	}
	
	public Kuutio(double sivunPituus){
		this.sivunPituus = sivunPituus;
	}
	
	public void asetaSivunPituus(double sivunPituus){
		this.sivunPituus = sivunPituus;
	}
	
	public double annaSivunPituus(){
		return sivunPituus;
	}
	
	public double annaAla(){
		return 6*sivunPituus*sivunPituus;
	}
	
	public double[] annaKeskipiste(){
		double[] piste = new double[3];
		for(int i = 0; i < 3; i++){
			piste[i] = sivunPituus/2.0;
		}
		return piste;
	}
	
	public String toSting(){
		return "Kuution sivun pituus on: " + sivunPituus + ", pinta-ala: " + annaAla() + ", ja sen keskipisteen koordinaatti on: (" + annaKeskipiste()[0] + ", " + annaKeskipiste()[1] + ", " + annaKeskipiste()[2] + ").";
	}
}