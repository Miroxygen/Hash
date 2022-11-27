import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
  
  public static void main(String[] args) {
    UniformityTest uf = new UniformityTest();
    FixedWordDic fwd = new FixedWordDic();
    Hash hasher = new Hash();
    String myString = "Rund";
    String mySecondString = "Hund";
    ArrayList<String> randomStrings = uf.createTestStringArray(21550);
    ArrayList<Integer> hashesForRandomWords = uf.createHashFromTestString(randomStrings);
    List<String> fixedStrings = new ArrayList<String>(Arrays.asList(fwd.getWords()));
    ArrayList<Integer> hashefForFixedWords = uf.createHashFromTestString((ArrayList<String>) fixedStrings);
    System.out.println("Random strings size : " + randomStrings.size());
    System.out.println("Unique Hashes for random strings size : " + hashesForRandomWords.size());
    System.out.println("Fixed strings size : " + fixedStrings.size());
    System.out.println("Unique Hashes for fixed strings size : " + hashefForFixedWords.size());
    System.out.println("First word : " + myString);
    System.out.println("Hashed first word : " + hasher.createHash(myString));
    System.out.println("Second string : " + mySecondString);
    System.out.println("Hashed second string : " + hasher.createHash(mySecondString));
  }
}
