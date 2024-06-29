package com.example.OmikujiForm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
//@RequestMapping("/omikuji")
public class HomeController {

     @RequestMapping(value = "/play", method = RequestMethod.POST)
     public String index(@RequestParam(value = "num") Integer num,
               @RequestParam(value = "city") String city,
               @RequestParam(value = "name") String name,
               @RequestParam(value = "hobby") String hobby,
               @RequestParam(value = "typeOfLiving") String typeOfLiving,
               @RequestParam(value = "smth") String smth, HttpSession session)

     {
          session.setAttribute("num", num);
          session.setAttribute("city", city);
          session.setAttribute("name", name);
          session.setAttribute("hobby", hobby);
          session.setAttribute("typeOfLiving", typeOfLiving);
          session.setAttribute("smth", smth);

          return "redirect:/omikuji/show";
     }

     @RequestMapping("/omikuji")
     public String index() {

          return "index.jsp";
     }

     @RequestMapping("/omikuji/show")
          public String show(){
               return "show.jsp";
          } 
     }

