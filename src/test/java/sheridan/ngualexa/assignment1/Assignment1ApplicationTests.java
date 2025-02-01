package sheridan.ngualexa.assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sheridan.ngualexa.assignment1.model.BoxGame;
import sheridan.ngualexa.assignment1.service.BoxGameService;

import java.util.List;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Assignment1ApplicationTests {

    @Autowired
    private BoxGameService boxGameService;

    @BeforeEach
    void setUp() {
        out.println("Starting new game");
        boxGameService.startGame();
    }

    @Test
    void contextLoads() {
        assertNotNull(boxGameService);
    }

    @Test
    void testGameStartsWithShuffledBoxes() {
        BoxGame game = boxGameService.getGame();
        List<String> boxes = game.getBoxes();

        assertNotNull(boxes, "Boxes list should not be null");
        assertEquals(14, boxes.size());
    }

    @Test
    void testSelectingBoxReturnsValidPrize() {
        int selectedIndex = 3;
        String selectedPrize = boxGameService.selectedBox(selectedIndex);

        assertNotNull(selectedPrize, "Selected prize should not be null");
        assertTrue(boxGameService.getGame().getBoxes().contains(selectedPrize),
                "Selected prize should be one of the available boxes");
    }
}
