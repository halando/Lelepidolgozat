/*
* File: ButtonPanel.java
* Author:Andó Attila
* Copyright: 2023- Andó Attila
* Group: Szoft I/1/N
* Date: 2023-04-27
* Github: https://github.com/halando/Lelepidolgozat
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class Lelepi {

    public Lelepi() {
    }
    public void startLelepi(){
        double terfogat = this.bekerDatas();
        nyomtat(terfogat);
    }
    private void nyomtat(double terfogat){
        System.out.println(terfogat);
    }
    private double bekerDatas() {
        String aoldalStr = beker("A oldal:");
        if(!this.checkInput(aoldalStr)){
            System.err.println("Hiba! Csak számot lehet beírni.");
            throw new NumberFormatException("Csak szám");
        }
       
        String boldalStr = beker("B oldal:");
        if(!this.checkInput(boldalStr)){
            System.err.println("Hiba! Csak számot lehet beírni.");
            throw new NumberFormatException("Csak szám");
        }
        
        String coldalStr = beker("C oldal:");
        if(!this.checkInput(coldalStr)){
            System.err.println("Hiba! Csak számot lehet beírni.");
            throw new NumberFormatException("Csak szám");
        }
        

       
      

        double aoldal = Double.parseDouble(aoldalStr);
        double boldal = Double.parseDouble(boldalStr);
        double coldal= Double.parseDouble(coldalStr);
       double terfogat = this.szamitTenylegesLelepi(aoldal, boldal, coldal);
       return terfogat;
    }

    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
        
    }
    public double szamitTenylegesLelepi(double aoldal, double boldal, double coldal){
        double terfogat = aoldal * boldal *coldal;

        return terfogat;

    }
       
    
    public boolean checkInput(String input){
       if( input.matches("[0-9.,]+")) {
        return true;
       }else{
        return false;
       }
    }
}
