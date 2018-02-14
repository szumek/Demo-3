public class Main{
	public static void main(String[] args){
		
		Vasara vasara = new Vasara();
		Hiomakone hiomakone = new Hiomakone();
		Kirves kirves = new Kirves();
		Puukko puukko = new Puukko();
		Sahkosaha sahkosaha = new Sahkosaha();
		
		Tyokalupakki[] tyokalu = new Tyokalupakki[5];
		
		tyokalu[0] = vasara;
		tyokalu[1] = hiomakone;
		tyokalu[2] = kirves;
		tyokalu[3] = puukko;
		tyokalu[4] = sahkosaha;
		
		for(int i = 0; i < tyokalu.length; i++){
			if(tyokalu[i].isTerottava()){
				System.out.println(tyokalu[i] + " ladataan");
			}else{
				System.out.println(tyokalu[i] + " terotetaan");
			}
		}
		System.out.println("Työkalut valmiina!");
		for(int i = 0; i < tyokalu.length; i++){
			System.out.println(tyokalu[i].useTool());
		}
	}
}

abstract class Tyokalupakki{
	
	public abstract boolean isTerottava(); 
	public abstract String useTool();
}

class Vasara extends Tyokalupakki{
	
	private boolean terottava;
	
	public Vasara(){
		terottava = true;
	}
	
	public boolean isTerottava(){
		return terottava;
	}
	public String useTool(){
		return "melu";
	}
	public String toString(){
		return "Vasara";
	}
}
class Hiomakone extends Tyokalupakki{
	
	private boolean terottava;
	
	public Hiomakone(){
		terottava = false;
	}
	
	public boolean isTerottava(){
		return terottava;
	}
	public String useTool(){
		return "melu";
	}
	public String toString(){
		return "Hiomakone";
	}
}

class Kirves extends Tyokalupakki{
	private boolean terottava;
	
	public Kirves(){
		terottava = true;
	}
	
	public boolean isTerottava(){
		return terottava;
	}
	public String useTool(){
		return "melu";
	}
	public String toString(){
		return "Kirves";
	}
}

class Puukko extends Tyokalupakki{
	private boolean terottava;
	
	public Puukko(){
		terottava = true;
	}
	
	public boolean isTerottava(){
		return terottava;
	}
	public String useTool(){
		return "melu";
	}
	public String toString(){
		return "Puukko";
	}
}

class Sahkosaha extends Tyokalupakki{
	private boolean terottava;
	
	public Sahkosaha(){
		terottava = false;
	}
	
	public boolean isTerottava(){
		return terottava;
	}
	public String useTool(){
		return "melu";
	}
	public String toString(){
		return "Sahkosaha";
	}
}

