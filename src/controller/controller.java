package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class controller {

    @RequestMapping(value = "selectAll.form")
    public String user(Model model,String text){
        model.addAttribute("text",text);
        return "success";
    }
}
