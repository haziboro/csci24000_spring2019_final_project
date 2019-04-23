import java.util.*;

public abstract class Test {
   String testName;
   Date date;
   String doctor;
   String location;
   String comment;
   
   public String returnTestName(){
       return this.testName;
   };
   public Date returnDate(){
       return this.date;
   };
   public String returnDoctor(){
       return this.doctor;
   };
   public String returnLocation(){
       return this.location;
   };
   public String returnComment(){
       return this.comment;
   };
   
   public abstract String returnResult();
   
    public String gatherTestInfo(){
        String result = this.returnTestName() + "\n" +
        "Completed on: " + this.returnDate() + "\n" +
        "Doctor: " + this.returnDoctor() + "\n" +
        "Lab: " + this.returnLocation() + "\n" +
        "Comments: " + this.returnComment() + "\n";
        return result;
    }
   
}//end Test