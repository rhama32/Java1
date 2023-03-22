class Main {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 2; i <= 100; i += 2) {
      if(i % 2 == 0) {
          sum += i;
      }
      System.out.println("2〜100までの偶数の和は" + sum + "です。" );
    }
  }
}