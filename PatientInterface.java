import java.util.*;
import java.util.Scanner;

public class PatientInterface{
    private Vector<Patient> patients = new Vector();
    Scanner reader = new Scanner(System.in);
    Scanner intReader = new Scanner(System.in);
    
    public static void main(String[] args){

    }
    
    public PatientInterface(){
        System.out.println("Welcome to the Patient Interface!");
        this.printOptions();
    }//end constructor
    
    //adds new patient to the patient database
    public void addPatient(){
        System.out.println("Adding new Patient to database...");
        
        System.out.println("Enter new Patient's name");
        String name = reader.nextLine();
        System.out.println("Enter new Patient's Date of Birth");
        String dob = reader.nextLine();
        System.out.println("Enter new Patient's Social Security Number");
        String ssn = reader.nextLine();
        
        System.out.println("Name: " + name + " DOB: " + dob + " SSN: " + ssn);
        System.out.println("Is the Above information correct?\n1. Yes \n2. No\n" );
        int response = intReader.nextInt();
        
        if(response == 1){
            Patient a = new Patient(name,dob,ssn);
            this.patients.add(a);
            System.out.println("Patient " + a.returnName() + " sucessfully added!\n");
            this.printOptions();
        }
        else if(response == 2){
            System.out.println("Please resubmit Patient information");
            this.addPatient();
        }
        else{
            System.out.println("Please only enter 1 or 2 as response \n Please try again");
            this.addPatient();
        }
    }//end addPatient
    
    
    public void listPatients(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Listing Patients...\n");
        for(int i=0; i < patients.size(); i++){
            Patient a = this.patients.get(i);
            String b = "Patient ID: " + Integer.toString(i) +" Name: " + a.returnName() + " DOB: " + a.returnDob() + " SSN: " + a.returnSsn() + "\n";
            sb.append(b);
        }//end for
        String patientList = sb.toString();
        System.out.println(patientList + "\n");
        this.printOptions();
        
    }//end listPatients
    
    
    public void printOptions(){
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. List all patients");
        System.out.println("2. Add new patient");
        System.out.println("3. View patient labs");
        System.out.println("4. Quit");
        int i = intReader.nextInt();
        if(i == 1){
            this.listPatients();
        }
        else if(i == 2){
            this.addPatient();
        }
        else if(i == 3){
            this.labOptions();
        }
        else if(i == 4){
            System.out.println("Goodbye!");
        }
        else{
            System.out.println("Please enter a valid option");
            this.printOptions();
        }
        
    }//end printOptions
    
    //Allows the viewing and input of patient labs
    public void labOptions(){
        System.out.println("\nPlease Enter the Patient ID");
        int i = intReader.nextInt();
        if(i >= patients.size()){
            System.out.println("Invalid Patient ID");
            this.labOptions();
        }//end if
        else{
            Patient a = this.patients.get(i);
            System.out.print("Patient ID: " + Integer.toString(i) +" Name: " + a.returnName() + " DOB: " + a.returnDob() + " SSN: " + a.returnSsn() + "\n");
            System.out.print("1. View all performed tests\n");
            System.out.print("2. List specific test details\n");
            System.out.print("3. Add new test\n");
            System.out.print("4. Return to main menu\n");
            
            int choice = intReader.nextInt();
            if(choice == 1){
                System.out.println(a.listAll());
            }//end choice 1
             
            else if(choice == 2){
                System.out.println("Enter test ID:");
                int testId = intReader.nextInt();
                if(testId <= a.numOfTests()){
                    System.out.println(a.viewTest(testId));
                    this.labOptions();
                }//end if
                else{
                    System.out.println("Invalid Test ID entered, please try again\n");
                    this.labOptions();
                }//end else
                
            }//end choice 2
            
            else if(choice == 3){
                System.out.println("Choose Test to add\n");
                System.out.println("1. BMP\n");
                System.out.println("2. Quit");
                int testChoice = intReader.nextInt();
                if(testChoice == 1){
                    a.addBmp();
                }
                else if(testChoice == 2){
                    this.labOptions();
                }
                else{
                    System.out.println("Invalid Choice\n");
                    this.labOptions();
                }
            }//end choice 3
            
            else if(choice == 4){
                System.out.println("Returning to Main Menu \n");
                this.printOptions();
            }//end choice 4
            
            else{
                System.out.println("Please Enter a valid choice\n");
                this.labOptions();
            }//end else
            
            this.printOptions();
        }//end else
    }//end labOptions
    
    
}//end PatientInterface