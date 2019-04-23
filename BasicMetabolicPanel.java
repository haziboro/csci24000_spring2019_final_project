import java.util.*;

public class BasicMetabolicPanel extends Test{
    
    private double bun = 0.0;
    private double calcium = 0.0;
    private double carbonDioxide = 0.0;
    private double chloride = 0.0;
    private double creatinine = 0.0;
    private double glucose = 0.0;
    private double potassium = 0.0;
    private double sodium = 0.0;
     
    public static void main(String[] args){

    }
    
    //requires 8 result parameters
    public BasicMetabolicPanel(int bun, int calcium, int carbonDioxide, int chloride, int creatinine, int glucose, int potassium, int sodium){
        this.bun = bun;
        this.calcium = calcium;
        this.carbonDioxide = carbonDioxide;
        this.chloride = chloride;
        this.creatinine = creatinine;
        this.glucose = glucose;
        this.potassium = potassium;
        this.sodium = sodium;
        
        Date today = Calendar.getInstance().getTime();
        this.testName = "Basic Metabolic Panel";
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
        "Sodium: " + Double.toString(sodium) + "\n";
        
        String result3 = result1 += result2;
        return(result3);
    };
    
}//end BasicMetabolicPanel