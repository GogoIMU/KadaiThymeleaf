package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        // previousの値をModelに追加
        model.addAttribute("previous", previous);
        // input.htmlに画面遷移
        return "input";
    }

}

