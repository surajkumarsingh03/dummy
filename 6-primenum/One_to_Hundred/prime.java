class Main {

  static boolean isPrime(int n) {
    if (n <= 1) return false;

 
    for (int j = 2; j <= n / 2; j++) {
      if (n % j == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    if (isPrime(11)) {
      System.out.println("The number is prime");
    } 
    else {
      System.out.println("The number is not prime");
    }
  }
}
