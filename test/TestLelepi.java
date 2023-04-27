/*
* File: ButtonPanel.java
* Author:Andó Attila
* Copyright: 2023- Andó Attila
* Group: Szoft I/1/N
* Date: 2023-04-27
* Github: https://github.com/halando/Lelepidolgozat
* Licenc: GNU GPL
*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLelepi {
    
    Lelepi lelepi;
    
    

    @BeforeEach
   public void init() {
     lelepi = new Lelepi();
    }

    @Test
    public void testSzamitLelepi() {

        double actual = lelepi.szamitTenylegesLelepi(30, 20, 10);
        assertEquals(actual, 6000.0,  "Nem 6000-t kaptam");
    }
    @Test
    public void testSzamitTenylegesLelepiSecond() {
        double actual = lelepi.szamitTenylegesLelepi(10, 12, 14);
        assertEquals(actual, 1680.0, "Nem 1680-t kaptam");
    }
    @Test
    public void testCheckInput(){
        boolean actual = lelepi.checkInput("33");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse(){
        boolean actual = lelepi.checkInput("a");
       assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial(){
        boolean actual = lelepi.checkInput("@");
        assertFalse(actual);
    }
}


