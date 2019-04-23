import java.util.*;

public class ComprehensiveMetabolicPanel extends Test {
    
    private double bun = 0.0;
    private double calcium = 0.0;
    private double carbonDioxide = 0.0;
    private double chloride = 0.0;
    private double creatinine = 0.0;
    private double glucose = 0.0;
    private double potassium = 0.0;
    private double sodium = 0.0;
    private double albumin = 0.0;
    private double tBilirubin = 0.0;
    private double tProtein = 0.0;
    private double alt = 0.0;
    private double alp = 0.0;
    private double ast = 0.0;
    
    public static void main(String[] args){

    }
    
    //reqires 14 result parameters
    public ComprehensiveMetabolicPanel(int bun, int calcium, int carbonDioxide, int chloride, int creatinine, int glucose, int potassium, int sodium, int albumin, int tBilirubin, int tProtein, int alt, int alp, int ast){
        this.bun = bun;
        this.calcium = calcium;
        this.carbonDioxide = carbonDioxide;
        this.chloride = chloride;
        this.creatinine = creatinine;
        this.glucose = glucose;
        this.potassium = potassium;
        this.sodium = sodium;
        this.albumin = albumin;
        this.tBilirubin = tBilirubin;
        this.tProtein = tProtein;
        this.alt = alt;
        this.alp = alp;
        this.ast = ast;
        
        Date today = Calendar.getInstance().getTime();
        this.testName = "Comprehensive Metabolic Panel";
        this.date = today;
        this.doctor = "Dr. Default";
        this.location = "Default Location";
        this.comment = "No Comment";
    }//end constructor
    
    public String returnResult(){
        String result1 = this.gatherTestInfo();
        String result2 = "\nBUN: " + Double.toString(bun) + "\n" +
        "Calcium: " + Double.toString(calcium) + "\n" +
        "Carbon Dioxide: " + Double.toString(carbonDioxide) + "\n" +
        "Chloride: " + Double.toString(chloride) + "\n" +
        "Creatinine: " + Double.toString(creatinine) + "\n" +
        "Glucose: " + Double.toString(glucose) + "\n" +
        "Potassium: " + Double.toString(potassium) + "\n" +
        "Sodium: " + Double.toString(sodium) + "\n" +
        "Albumin: " + Double.toString(albumin) + "\n" +
        "Total Bilirubin: " + Double.toString(tBilirubin) + "\n" +
        "Total Protein: " + Double.toString(tProtein) + "\n" +
        "ALT: " + Double.toString(alt) + "\n" +
        "ALP: " + Double.toString(alp) + "\n" +
        "AST: " + Double.toString(ast) + "\n";
        
        String result3 = result1 += result2;
        return(result3);
    };
    
    
}//end ComprehensiveMetabolicPanel