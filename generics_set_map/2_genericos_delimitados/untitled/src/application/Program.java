package application;

import model.entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

  public static void main(String[] args) {
      Locale.setDefault(Locale.US);

      List<Product> list = new ArrayList<>();
      String path = "A:\\Curso java\\generics_set_map\\2_genericos_delimitados\\in.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
          String line = br.readLine();
          while (line != null) {
              String[] fields = line.split(",");
              list.add(new Product(fields[0], Double.parseDouble(fields[1])));
              line = br.readLine();
          }
          Product x = CalculationService.max(list);
          System.out.print("Max: ");
          System.out.println(x);
      } catch(IOException e) {
          e.getMessage();
      }

  }

}
