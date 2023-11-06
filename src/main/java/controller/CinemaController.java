package controller;

import model.CinemaInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class CinemaController {
    @GetMapping
    public CinemaInfo getSeatsInfo() {
        int numRows = 9;
        int numColumns = 9;
        CinemaInfo cinemaInfo = new CinemaInfo(numRows, numColumns);
        return cinemaInfo;
    }
}
