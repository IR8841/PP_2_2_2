package service;

import model.Car;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {

    private ArrayList<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car(1, "Lada", 41235));
        listCars.add(new Car(2, "Toyota", 5463454));
        listCars.add(new Car(3, "Mazda", 436345));
        listCars.add(new Car(4, "BMW", 75645));
        listCars.add(new Car(5, "Chevrolet", 123157));
    }


    @Override
    public String getVariableCar(int count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        if (count > 0 && count <= 5) {
            for (int i = 0; i < count; i++) {
                messages.add(listCars.get(i).toString());
            }
        } else {
            messages.add(listCars.toString());
        }
        model.addAttribute("messages", messages);
        return "car";
    }
}
