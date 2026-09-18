/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;

/**
 *
 * @author student
 */
public class Login {
    String userName;
    String passWord;
    String cellPhone;
    
    Boolean checkUserName(String username){
        return username.contains("_") && username.length()<=5;
    }
   public boolean checkPasswordComplexity(String password) {
    // Rule 1: Check if null or less than 8 characters
    if (password == null || password.length() < 8) {
        return false;
    }

    // Initialize flags to track the presence of required characters
    boolean hasCapital = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;

    // Iterate through every character in the password string
    for (char c : password.toCharArray()) {
        
        // Rule 2: Check for a capital letter
        if (Character.isUpperCase(c)) {
            hasCapital = true;
        }
        // Rule 3: Check for a number
        else if (Character.isDigit(c)) {
            hasNumber = true;
        }
        // Rule 4: Check for a special character
        // We define special as anything that is NOT a letter or a digit
        else if (!Character.isLetterOrDigit(c)) {
            hasSpecial = true;
        }

        // Optimization: If all rules are satisfied, we can stop checking early
        if (hasCapital && hasNumber && hasSpecial) {
            return true;
        }
    }

    // Return true only if all flags were set to true during the loop
    return hasCapital && hasNumber && hasSpecial;
}
   
   Boolean checkCellPhoneNumber(String cellphone){
       Boolean cellLength = false;
       Boolean ContainsInternational = false;
       Boolean startWithZero = false;
       if(cellphone.length()==12 || cellphone.length() == 10)
       {
           cellLength = true;
       }
       if(cellphone.startsWith("+27"))
       {
           ContainsInternational = true;
       }
       if(cellphone.startsWith("0")){
           startWithZero = true;
       }
       if(cellLength && ContainsInternational || startWithZero){
           return true;
       }else{
           return false;
       }
   }
   
   String registerUser(String username, String password, String cellphone){
       Boolean user = checkUserName(username);
       Boolean pass = checkPasswordComplexity(password);
       Boolean cell = checkCellPhoneNumber(cellphone);
       
       String error = "";
       
       if(user && pass && cell){
           this.userName = username;
           this.passWord = password;
           this.cellPhone = cellphone;
           return "Registered";
       }else{
           if(!user){
               error += "username is not corretly formatted, Please ensure username conatins an underscore and is no more than 5 characters in length. \n";
           }
           if(!pass){
               error += "Pasword is not correctly formatted, Please ensure password conatins atleast 8 charaters, capital letter a number and a special character. \n";
           }
           if(cell){
               error += "Celphone Number incoreectly formatted or does not contain international code. \n";
           }
           return error + "Failed To Register";
       }
       
       
   }
   
   Boolean loginUser(String username, String password){
       return this.userName.matches(username) && this.passWord.matches(password);
   }
   
   String returnLoginStatus(String username, String password){
       if(loginUser(username,password)){
           return "Login Successful";
       }else{
           return "Login Failed";
       }
   }
}
