package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    //private static List<String> events = new ArrayList<>();
    @GetMapping
    public String displayAllEvents(Model model) {
        /*List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");
        model.addAttribute("events", events);
        return "events/index";*/
        Map<String,String> events = new HashMap<>();
        events.put("Code with a cause",
                "During this 48-hour event, teams of technologists (developers, designers, project managers)" +
                        " are partnered with a nonprofit that has pre-identified a specific software need. " +
                        "At the end of the hackathon, the project is then given to the " +
                        "nonprofit to implement within their organization.");
        events.put("Capture the flag","Capture the Flag (CTF) is a special kind of information " +
                "security competitions. There are three common types of CTFs: Jeopardy, " +
                "Attack-Defence and mixed.\n" +
                "\n" +
                "Jeopardy-style CTFs has a couple of questions (tasks) in range of categories." +
                "For example, Web, Forensic, Crypto, Binary or something else. Team" +
                " can gain some points for every solved task. " +
                "More points for more complicated tasks usually. " +
                "The next task in chain can be opened only after some team solve previous task. " +
                "Then the game time is over sum of points shows you a CTF winner. " +
                "Famous example of such CTF is DEF CON CTF quals.\n" +
                "\n" +
                "Well, attack-defence is another interesting kind of competitions. " +
                "Here every team has own network(or only one host) with vulnarable services. Your team has time for patching your services and developing exploits usually. So, then organizers connects participants of competition and the wargame starts! You should protect own services for defence points and hack opponents for attack points. Historically this is a first type of CTFs, everybody knows about DEF CON CTF - something like a World Cup of all other competitions.\n" +
                "\n" +
                "Mixed competitions may vary possible formats." +
                " It may be something like wargame with special time for task-based elements (e.g. UCSB iCTF).\n" +
                "\n" +
                "CTF games often touch on many other aspects of information security: " +
                "cryptography, stego, binary analysis, reverse engeneering, mobile security and others." +
                " Good teams generally have strong skills and experience in all these issues.");
        events.put("Hour of Code","one-hour introduction to computer science, " +
                "designed to demystify \"code\", to show that anybody can learn " +
                "the basics, and to broaden participation in the field of computer science." +
                "It celebrates computer science, starting with 1-hour coding activities but expanding " +
                "to all sorts of community efforts.");
        model.addAttribute("events",events);
        return "events/index";
    }

}
