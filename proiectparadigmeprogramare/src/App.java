import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.io.*;

import java.util.ArrayList;

import java.util.List;

public class App {
    private JPanel panel1;
    private JTextField carName;
    private JTextField colorName;
    private JButton saveButton;
    private JTextField fabricationYear;
    private JButton cancelButton;
    private JTextField engine;
    private JTextField doorNumbers;
    private List<Car> cars;

    public App() {
        cars= new ArrayList<>();


        saveButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                register_car();
            }
        });
        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void register_car()  {

         Car newCar= new Car(carName.getText(), colorName.getText(), Integer.parseInt(fabricationYear.getText()), Double.parseDouble(engine.getText()),Integer.parseInt(doorNumbers.getText()));
         cars.add(newCar);
         String jsonString;
         ObjectMapper mapper;

        try {
             mapper = new ObjectMapper();
            jsonString = mapper.writeValueAsString(cars);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try{
            FileWriter fw = new FileWriter("data.json");
           fw.write(jsonString);
           fw.close();

            System.out.println(jsonString);
        }catch (IOException e){
            e.printStackTrace();
        }



    }


}




