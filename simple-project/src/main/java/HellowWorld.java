import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @author Brian Pontarelli
 */
public class HellowWorld {
  public static void main(String[] args) {
    Pair<String, String> p = new ImmutablePair<String, String>("one", "two");
    System.out.println("Hello World " + p);
  }
}
