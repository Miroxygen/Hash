import java.util.Random;

public class RandomStringGenerator {

  String getRandomString() {
    Random random = new Random();
    int leftLimit = 97;
    int rightLimit = 122;
    int targetStringLength = random.nextInt(20);
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
    return generatedString;
  }
  
}
