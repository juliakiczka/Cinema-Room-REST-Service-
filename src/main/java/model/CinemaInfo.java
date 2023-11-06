package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CinemaInfo {
    private int rows;
    private int columns;
    private List<Seat> seats;

    public CinemaInfo(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.seats = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                seats.add(new Seat(row, column));
            }
        }
    }
}
