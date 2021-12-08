import org.junit.Assert;
import org.junit.Test;
 

public class GameTest {
  String testString = "MiniTest";
  
  @Test
  public void testMake(){
    System.out.println("Running Test1");
    Assert.assertEquals(testString, "MiniTest", "The test failed");
  }
}
