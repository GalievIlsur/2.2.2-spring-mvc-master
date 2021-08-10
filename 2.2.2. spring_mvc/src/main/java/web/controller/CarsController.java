package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String showSomeCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        if (count >= 5) {
            model.addAttribute("cars", carServiceImp.allCarsPage());
            return "cars/cars";
        }
        model.addAttribute("cars", carServiceImp.showSomeCars(count));

        return "cars/cars";
    }

}
