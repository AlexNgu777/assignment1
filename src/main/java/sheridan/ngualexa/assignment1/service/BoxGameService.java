package sheridan.ngualexa.assignment1.service;

import org.springframework.stereotype.Service;
import sheridan.ngualexa.assignment1.model.BoxGame;

@Service
public class BoxGameService {
    private BoxGame boxGame;

    public BoxGame startGame() {
        boxGame = new BoxGame();
        boxGame.randomizeBoxes();
        return boxGame;
    }

    public String selectedBox(int boxIndex) {
        return boxGame.selectedBox(boxIndex);
    }

    public BoxGame getGame() {
        return boxGame;
    }
}
