package com.draysams.controller;

import com.draysams.model.Activity;
import com.draysams.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("goal")
public class GoalController {
    @RequestMapping(value = "/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model) {
        Goal goal = new Goal();
        goal.setMinutes(10);
        model.addAttribute("goal", goal);

        return "addGoal";
    }

    @RequestMapping(value = "/addGoal", method = RequestMethod.POST)
    public String addGoal(@Valid @ModelAttribute ("goal") Goal goal, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println("System has error : " + result.hasErrors());
            return "addGoal";
        }

        return "redirect:addMinutes.html";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<>();

        Activity run = new Activity();
        run.setDescription("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDescription("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDescription("Swim");
        activities.add(swim);

        return activities;
    }
}
