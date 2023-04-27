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
        String boldalStr = beker("B oldal:");
        String coldalStr = beker("C oldal:");
      

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
    public double szamitTenylegesLelepi(double betet, double nevleges,double tokesites_szam){
        double tenyleges = (Math.pow((
            1 + (nevleges/(100.*tokesites_szam))
        ),tokesites_szam)-1)*betet;
        return tenyleges;
    }
    public boolean checkInput(String input){
       if( input.matches("[0-9.,]+")) {
        return true;
       }else{
        return false;
       }
    }
}
}