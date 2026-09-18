/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart1;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class LoginTest {
    Login instance = new Login();
    public LoginTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "lisa_";
        
        Boolean expResult = true;
        Boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Lisa@1234";
        
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellphone = "0123456789";
      
        Boolean expResult = true;
        Boolean result = instance.checkCellPhoneNumber(cellphone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "lisa_";
        String password = "Lisa@1234";
        String cellphone = "+27123456789";
        
        String expResult = "Registered";
        String result = instance.registerUser(username, password, cellphone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "lisa_";
        String password = "Lisa@1234";
        String cellphone = "+27123456789";
        Boolean expResult = true;
        instance.registerUser(username, password, cellphone);
        Boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "lisa_";
        String password = "Lisa@1234";
        String cellphone = "+27123456789";
        
        String expResult = "Login Successful";
        instance.registerUser(username, password, cellphone);
        instance.loginUser(username, password);
        String result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
      
    }
    
}
