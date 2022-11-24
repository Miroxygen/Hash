public class App {
  
  public static void main(String[] args) {

    Hash hash = new Hash();
    int newHash = hash.createHash("Muranda");
    int newHash1 = hash.createHash("12345678901011112131255");
    int newHash2 = hash.createHash("miranda");
    System.out.println(newHash);
    System.out.println(newHash1);
    System.out.println(newHash2);
  }
}
