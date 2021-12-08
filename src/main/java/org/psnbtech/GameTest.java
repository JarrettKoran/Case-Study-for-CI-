import org.junit.Assert;
import org.junit.Test;
 

public class GameTest {
  String testString = "MiniTest";
  
  @Test
  public void testMake(){
    System.out.println("Running Test1");
    Assertions.assertEquals(testString, "MiniTest", "The test failed");
  }
}
