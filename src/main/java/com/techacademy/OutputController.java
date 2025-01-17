package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam(name = "val") String val, @RequestParam(name = "previous", required = false) String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        model.addAttribute("previous", previous); // previousの値を追加
        // output.htmlに画面遷移
        return "output";
    }
}