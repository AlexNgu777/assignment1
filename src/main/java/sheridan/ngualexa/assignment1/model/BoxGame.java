package sheridan.ngualexa.assignment1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxGame {
    private List<String> boxes;

    public BoxGame() {
        this.boxes = new ArrayList<>();
    }

    public void randomizeBoxes() {
        List<String> prizes = List.of("Lump of coal", "$1000000", "Banjo",
                "Chromebook", "1 BTC", "Truck", "Supercar",
                "Pokemon Cards", "iPhone 16 Pro Max", "$0.25", "Happy Meal", "A House", "Yacht", "Candy");
        boxes = new ArrayList<>(prizes);
        Collections.shuffle(boxes);
    }

    public String selectBox(int boxIndex) {
        return boxes.get(boxIndex);
    }

    public List<String> getBoxes() {
        return boxes;
    }
}
