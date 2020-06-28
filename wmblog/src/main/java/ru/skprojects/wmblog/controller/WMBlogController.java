package ru.skprojects.wmblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.skprojects.wmblog.model.Message;
import ru.skprojects.wmblog.service.MessageService;

import java.util.List;

@Controller
public class WMBlogController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/")
    public String getMainPage(Model model) {
        return "index";
    }

    @RequestMapping("/blog")
    public String getBlogPage(Model model) {
        List<Message> messages = messageService.findAll();
        //messages.stream().forEach((m) -> System.out.println(m.getTitle() + " " + m.getMessage() + " " + m.getImage()));
        model.addAttribute("messages", messages);
        return "blog";
    }

    @RequestMapping("/aboutme")
    public String getAboutMe(Model model) {
        return "aboutme";
    }

    @RequestMapping("/contacts")
    public String getContacts(Model model) {
        return "contacts";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdmin(Model model) {
        return "admin";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String addMessage(@RequestParam(value="title") String title, @RequestParam(value="image") String image, @RequestParam(value="message") String message) {
        Message newMessage = new Message();
        newMessage.setTitle(title);
        newMessage.setImage(image);
        newMessage.setMessage(message);
        this.messageService.save(newMessage);
        return "redirect:/";
    }

}
