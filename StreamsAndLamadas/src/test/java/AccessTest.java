import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
public class AccessTest {
Access ac =new Access(); 
  List<Integer> l1= Arrays.asList(3,4,5,6,7,800,900,321);
  List<String> l2=Arrays.asList("aaa","eeeee","ask","aeee","ask","air","lock");
  List<String> l3=Arrays.asList("aaa","asdsa","tttttttt","ssss","amma","tata","lool");
  List<String> l4=Arrays.asList("aaa","asdsa","tttttttt","ssss","amma","lool");
  List<String> l5=Arrays.asList("aaa","ask","ask","air");
  @Test
  public void testAverage() {
    assertEquals(255.75,ac.average(l1),0);
      }

  @Test
  public void testCheckLength() {
    assertEquals(l5,ac.checkLength(l2));
}

  @Test
  public void testCheckPallindrome() {
    assertEquals(l4,ac.checkPallindrome(l3));
    
  }
}