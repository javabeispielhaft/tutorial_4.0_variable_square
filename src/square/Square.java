package square;

public class Square {
    public void print(int width) {
        for (int i = 0; i < width; i++) {
            printLine(width);
        }
    }

    private void printLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
