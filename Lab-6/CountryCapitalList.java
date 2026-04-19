package Lab06;
/*Develop a Swing program in Java to add the countries USA, India, Vietnam,
Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on
the list.
o/p
Capital of USA is: Washington D.C.
Capital of India is: New Delhi
Capital of Vietnam is: Hanoi
Capital of Denmark is: Copenhagen
Capital of Africa is: Addis Ababa
Capital of Japan is: Tokyo
Capital of Greenland is: Nuuk
Capital of Singapore is: Singapore*/
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private DefaultListModel<String> listModel;

    // Map to store country → capital
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {

        setTitle("Country Capital JList Example");

        // Initialize map
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // List model
        listModel = new DefaultListModel<>();

        for (String country : capitalMap.keySet()) {
            listModel.addElement(country);
        }

        countryList = new JList<>(listModel);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Selection listener
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCountry = countryList.getSelectedValue();

                if (selectedCountry != null) {
                    String capital = capitalMap.get(selectedCountry);
                    System.out.println("Capital of " + selectedCountry + " is: " + capital);
                }
            }
        });

        add(new JScrollPane(countryList));

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}