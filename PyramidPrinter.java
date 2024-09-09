public class PyramidPrinter implements Runnable {

    private final int rows;

    public PyramidPrinter(int rows) {
        this.rows = rows;
    }

    @Override
    public void run() {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Thread(new PyramidPrinter(5)).start();
    }
}