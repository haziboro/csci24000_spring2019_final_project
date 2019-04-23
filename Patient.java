import java.util.*;
import java.util.Scanner;

public class Patient{
    
    private String name = "Default Name";
    private String dob;
    private String ssn = "123-45-6789";
    private Vector<Test> allTests = new Vector();
    Scanner reader = new Scanner(System.in);
    

    public static void main(String[] args){

    }
    
    public Patient(String name, String dob, String ssn){
        this.name = name;
        this.dob = dob;
        this.ssn = ssn;
    }//end constructor
    
    public String returnName(){
        return this.name;
    }
    
    public String returnDob(){
        return this.dob;
    }
    
    public String returnSsn(){
        return this.ssn;
    }
    
    //returns total number of tests that this patient has
    public int numOfTests(){
        return this.allTests.size();
    }
    
    //Lists the name of all tests performed on this patient, the date they were performed and the doctor who ordered it
    public String listAll(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < allTests.size(); i++){
            Test a = this.allTests.get(i);
            String result = "Test ID: " + Integer.toString(i) + ": " + a.returnDoctor() + " " + a.returnTestName() + " " + a.returnDate() + "\n";
            sb.append(result);
        }//end for
        
        String resultList = sb.toString();
        return resultList;
    }//end listAll
    
    //Displays information on this patients choses test based on test number
    public String viewTest(int num){
        Test a = this.allTests.get(num);
        return a.returnResult();
        
    }//end viewTest
    
    //Creates an instance of the BMP test class and stores it in this Patients record
    public void addBmp(){
        
        //request user to enter values for BMP
        System.out.println("Enter test Result");
        System.out.println("BUN: ");
        int bun = reader.nextInt();
        
        System.out.println("Calcium: ");
        int calcium = reader.nextInt();
        
        System.out.println("C02: ");
        int carbonDioxide = reader.nextInt();
        
        System.out.println("Chloride: ");
        int chloride = reader.nextInt();
        
        System.out.println("Creatinine: ");
        int creatinine = reader.nextInt();
        
        System.out.println("Glucose: ");
        int glucose = reader.nextInt();
        
        System.out.println("Potassium: ");
        int potassium = reader.nextInt();
        
        System.out.println("Sodium: ");
        int sodium = reader.nextInt();
        
        //create instance of BMP with user entered values
        
        BasicMetabolicPanel bmp = new BasicMetabolicPanel(bun, calcium, carbonDioxide, chloride, creatinine, glucose, potassium, sodium);
        this.allTests.add(bmp);
    }
    
    //Creates an instance of the CMP test class and stores it in this Patients record
    public String addCmp(){
        //request user to enter values for CMP
        
        //create instance of CMP with user entered values
        
        return("This is a CMP");
    }
    
}//end Patient