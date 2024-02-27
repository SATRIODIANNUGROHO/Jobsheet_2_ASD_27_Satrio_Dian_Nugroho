public class Dragon27 {
    private int x;
    private int y;
    private int width;
    private int height;
    public Dragon27(int initialX, int initialY, int gameWidth, int gameHeight) {
        this.x = initialX;
        this.y = initialY;
        this.width = gameWidth;
        this.height = gameHeight;
    }
    public void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    public void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    public void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    public void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }
    public void printPosition() {
        System.out.println("Dragon Position - X: " + x + ", Y: " + y);
    }
    private void detectCollision() {
        System.out.println("Game Over");
    }
    public static void main(String[] args) {
        // Contoh penggunaan
        Dragon27 dragon = new Dragon27(5, 5, 10, 10);
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
    }
}