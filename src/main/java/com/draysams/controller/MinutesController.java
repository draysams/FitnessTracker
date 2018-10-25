package com.draysams.controller;

import com.draysams.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise, Model model) {
        System.out.println("Exercise : " + exercise.getMinutes());
        model.addAttribute("title", "Add Minutes");
        return "addMinutes";
    }
}
