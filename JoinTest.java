 public class JoinTest extends Thread {

    public void run() {
      for (int j = 1; j <= 5; j++) {
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println(j);
      }
    }
  
    public static void main(String[] args) {
      JoinTest t1 = new JoinTest();
      JoinTest t2 = new JoinTest();
      JoinTest t3 = new JoinTest();
  
      t1.start();
      t2.start();
      t3.start();
  
      try {
        t1.join();
        t2.join();
        t3.join();
      } catch (Exception e) {
        System.out.println(e);
      }
  
      System.out.println("All threads finished");
    }
  }
  