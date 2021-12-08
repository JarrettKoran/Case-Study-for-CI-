import junit.Assert;
import junit.Test;

public class GameTest {
  String testString = "MiniTest";
  
  @Test
  public void testMake(){
    System.out.println("Running Test1");
    Assertions.assertEquals(testString, "MiniTest", "The", "The test failed");
  }
}
