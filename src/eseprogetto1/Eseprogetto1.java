package eseprogetto1;
import rubrica.*;
public class Eseprogetto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rubrica miaRubrica = new Rubrica();
		Menu mioMenu = new Menu();
		int scelta;
		scelta = mioMenu.scelta();
		System.out.println("Inserire numero di scelta ");
		while(scelta != 4){
			switch(scelta){
			
			case 1:
				Voce v = new Voce("Luca", "075987387");
				miaRubrica.aggiungiVoce(v);
				break;
			case 2:
				int indice = mioMenu.leggiIndice();
				miaRubrica.eliminaVoce(indice);
				break;
			case 3:
				miaRubrica.visualizza();
				break;
				
				default:
					break;
				
			}
			scelta=mioMenu.scelta();
		}
		System.out.println("\nFine programma.");

	}

}
