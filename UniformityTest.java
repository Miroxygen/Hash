import java.util.ArrayList;

public class UniformityTest {
  RandomStringGenerator rsg;
  Hash hasher;
  
  public ArrayList<String> createTestStringArray(int numberOfStrings) {
    rsg = new RandomStringGenerator();
    ArrayList<String> testStrings = new ArrayList<String>();
    for(int i = 0; i < numberOfStrings; i++) {
      String testString = rsg.getRandomString();
      if(!testStrings.contains(testString)) {
        testStrings.add(testString);
      }
    }
    return testStrings;
  }

  public ArrayList<Integer> createHashFromTestString(ArrayList<String> strings) {
    hasher = new Hash();
    ArrayList<Integer> hashes = new ArrayList<Integer>();
    for(int i = 0; i < strings.size(); i++) {
      int newHash = hasher.createHash(strings.get(i));
      if(!hashes.contains(newHash)) {
        hashes.add(newHash);
      }
    }
    return hashes;
  }
}
