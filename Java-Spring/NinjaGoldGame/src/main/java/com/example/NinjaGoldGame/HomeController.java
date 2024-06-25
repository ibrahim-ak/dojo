package com.example.NinjaGoldGame;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("array", new ArrayList<String>());
			session.setAttribute("counter", 0);
		}

		return "index.jsp";

	}

	@PostMapping("/gold")
	public String gold(@RequestParam(value = "place") String place, HttpSession session, Model model) {

		
		ArrayList<String> arrayl = (ArrayList<String>) session.getAttribute("array");
		
		if (place.equals("farm")) {
			int min = 10;
			int max = 20;
			int x = (int) (Math.random() * (max - min + 1) + min);
			int count = (int) session.getAttribute("counter");
			count += x;
			session.setAttribute("counter", count);
			String activite = "You entered a Farm and you win " + x;
			arrayl.add(0, activite);

		} else if (place.equals("cave")) {
			int min = 5;
			int max = 10;
			int x = (int) (Math.random() * (max - min + 1) + min);
			int count = (int) session.getAttribute("counter");
			String activite = "You entered a Cave and you win " + x;
			count += x;
			session.setAttribute("counter", count);
			arrayl.add(0, activite);
		} else if (place.equals("house")) {
			int min = 2;
			int max = 5;
			int x = (int) (Math.random() * (max - min + 1) + min);
			int count = (int) session.getAttribute("counter");
			String activite = "You entered a Cave and you win " + x;
			count += x;
			session.setAttribute("counter", count);
			arrayl.add(0, activite);
		} else if (place.equals("quest")) {
			int min = -50;
			int max = 50;
			int x = (int) (Math.random() * (max - min + 1) + min);
			int count = (int) session.getAttribute("counter");
			if (x > 0) {

				String activite = "You entered a Cave and you win " + x;
				arrayl.add(0, activite);
			} else {
				String activite = "You entered a Cave and you loss " + x;
				arrayl.add(0, activite);
			}

			count += x;
			session.setAttribute("counter", count);
		}

		else if (place.equals("spa")) {
			int min = -5;
			int max = -20;
			int x = (int) (Math.random() * (max - min + 1) + min);

			int count = (int) session.getAttribute("counter");
			count += x;
			String activite = "You entered a Spa and you loss " + x;
			arrayl.add(0, activite);
			session.setAttribute("counter", count);
		} else if (place.equals("clear")) {
			session.removeAttribute("counter");
			String activite = "the counter is rest";

		}
		 

		session.setAttribute("array", arrayl);
		return "redirect:/";

	}

}
