package timecapsule.ui;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import timecapsule.domain.Letter;
import timecapsule.repository.LetterRepository;

@Controller
@RequiredArgsConstructor
public class LetterController {

    private final LetterRepository letterRepository;

    @GetMapping("/letters")
    public String letters(Model model) {
        model.addAttribute("letters", letterRepository.findAll());
        return "letter";
    }

    @GetMapping("/letters/form")
    public String form() {
        return "form";
    }

    @PostMapping("/letters")
    public String save(Letter letter) {
        letterRepository.save(letter);
        return "redirect:/";
    }

    @GetMapping("/letters/{id}")
    public String letter(@PathVariable Long id, Model model) {
        model.addAttribute("letter", model.addAttribute(letterRepository.findById(id)));
        return "content";
    }
}
