package sheridan.ngualexa.assignment1.model;

import java.util.ArrayList;
import java.util.List;

public class BoxGame {

    private List<String> boxes;
    private String userPrize;

    public BoxGame() {
        this.boxes = new ArrayList<>();
    }

    public void randomizeBoxes() {
        List<String> prizes = List.of("1","2","3");
        boxes = new ArrayList<>(prizes);

    }

    public String selectedBox(int boxIndex) {
        this.userPrize = boxes.get(boxIndex);
        return userPrize;
    }

    public List<String> getBoxes() {
        return boxes;
    }
}
