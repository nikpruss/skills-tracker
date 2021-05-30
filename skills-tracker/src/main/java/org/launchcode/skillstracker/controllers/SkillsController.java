package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String mainForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<ol>" +
                        "<li>C++</li>" +
                        "<li>Java</li>" +
                        "<li>Pascal</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String rateForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h2>Name:</h2>" +
                        "<form method = 'post' action = 'form'>" +
                        "<input type = 'text' name = 'name' />" +
                        "<br>" +
                        "<label>My favorite language</label>" +
                        "<br>" +
                        "<select name='first'>" +
                        "<option>C++</option>" +
                        "<option>Java</option>" +
                        "<option>Pascal</option>" +
                        "</select>" +
                        "<br>" +
                        "<label>My second favorite language</label>" +
                        "<br>" +
                        "<select name='second'>" +
                        "<option>C++</option>" +
                        "<option>Java</option>" +
                        "<option>Pascal</option>" +
                        "</select>" +
                        "<br>" +
                        "<label>My third favorite language</label>" +
                        "<br>" +
                        "<select name='third'>" +
                        "<option>C++</option>" +
                        "<option>Java</option>" +
                        "<option>Pascal</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String updateForm(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + first + "</li>" +
                        "<li>" + second + "</li>" +
                        "<li>" + third + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
