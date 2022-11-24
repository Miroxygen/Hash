
public class Hash {

  public int createHash(String s) {
    int hashNum = 7;
    for(int i = 0; i < s.length(); i++) {
      hashNum = hashNum * 37 + s.charAt(i);
    }
    hashNum |= 0;
    hashNum = hashNum % 256;
    return hashNum;
  }
}