package dao;

import java.util.ArrayList;
import java.util.List;

import dto.RentalDTO;

public class RentalDAO {

    private List<RentalDTO> rentalList = new ArrayList<>();

    public void addRental(RentalDTO rental) {
        rentalList.add(rental);
    }

    public List<RentalDTO> getAllRentals() {
        return rentalList;
    }
}
