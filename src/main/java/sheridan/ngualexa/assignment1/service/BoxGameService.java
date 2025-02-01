package sheridan.ngualexa.assignment1.service;

import org.springframework.stereotype.Service;
import sheridan.ngualexa.assignment1.model.BoxGame;

@Service
public class BoxGameService {
    private BoxGame boxGame;

    public void startGame() {
        boxGame = new BoxGame();
        boxGame.randomizeBoxes();
    }

    public String selectedBox(int boxIndex) {
        if (boxGame == null) {
            startGame();
        }
        return boxGame.selectBox(boxIndex);
    }

    public BoxGame getGame() {
        if (boxGame == null) {
            startGame();
        }
        return boxGame;
    }
}
