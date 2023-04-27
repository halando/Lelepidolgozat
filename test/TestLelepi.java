import static org.junit.Assert.assertEquals;
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
    public void testSzamitTenylegesKamat() {

        double actual = lelepi.szamitTenylegesKamat(50000, 5, 1);
        assertEquals(actual, 2500.0, 0.01, "Nem 2500-t kaptam");
    }
    @Test
    public void testSzamitTenylegesKamatSecond() {
        double actual = lelepi.szamitTenylegesKamat(50000, 3, 12);
        assertEquals(actual, 1520.7, 0.1, "Nem 1520-t kaptam");
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
}
