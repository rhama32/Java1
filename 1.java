class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了
      if(i % 5 == 0) {
      break;
      }
      
      System.out.println(i);
      i++;
    }