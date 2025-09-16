// Heart class
class Heart {
    public void beat() {
        System.out.println("Heart is beating...");
    }
}

// Human class contains a Heart object (composition)
class Human {
    private Heart heart;

    // Constructor creates a new Heart object for each Human
    public Human() {
        heart = new Heart();
    }

    public void startHeart() {
        heart.beat();
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.startHeart(); // Output will be "Heart is beating..."
    }
}
