package sheridan.ngualexa.assignment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.ngualexa.assignment1.model.BoxGame;
import sheridan.ngualexa.assignment1.service.BoxGameService;


@Controller
public class BoxGameController {
    @Autowired
    private BoxGameService gameService;

    @GetMapping("/")
    public String playPage(Model model) {
        gameService.startGame();
        model.addAttribute("boxes", gameService.getGame().getBoxes());
        return "play";
    }

    @PostMapping("/prizepage")
    public String resultPage(@RequestParam("box") int boxIndex, Model model) {
        String selectedPrize = gameService.selectedBox(boxIndex);
        BoxGame game = gameService.getGame();

        model.addAttribute("selectedPrize", selectedPrize);
        model.addAttribute("allBoxes", game.getBoxes());
        return "prizepage";
    }
}