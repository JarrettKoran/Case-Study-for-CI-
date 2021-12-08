//import org.junit.Assert;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameTest {
  String testString = "MiniTest";
  
  @Test
  public void testMake(){
    System.out.println("Running Test1");
    assertEquals(testString, "MiniTest", "The test failed");
  }
}
