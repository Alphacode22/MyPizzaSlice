package PizzaSlice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

class InputOutput {
// file reader + scanner (Alex)
// read first line of file 
// get noOfPizza (int) teams of 2 3 4 (ints)
// always on its own line
    int noOfPizzas;
    int teamsOf2;
    int teamsOf3;
    int teamsOf4;
    Pizza [] pizzas;

    boolean nextPizza = false;


    public void readFile(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] splitted = line.split(" ");
            noOfPizzas = Integer.parseInt(splitted[0]);
            teamsOf2 = Integer.parseInt(splitted[1]);
            teamsOf3 = Integer.parseInt(splitted[2]);
            teamsOf4 = Integer.parseInt(splitted[3]);
            int index = 0;
            pizzas = new Pizza[noOfPizzas];
            while(index<noOfPizzas){
                int n = scanner.nextInt();
                String [] ingredients = new String[n];
                for(int i=0; i<n; i++){
                    ingredients[i] = scanner.next();
                }
                Pizza p = new Pizza(index, n, ingredients);
                pizzas[index] = p;
                index++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Optional file " + path + " was not found."+ ex);
        }
    }

    public void writeFile(String path){
        try{
            File file = new File(path);

            // Read in what file
            FileWriter myWriter = new FileWriter(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




//pizzas int noOfIngredients Ingredients - seperated by spaces of size noOfIngredients (Alex Bang)
// can go over multiple lines
// make pizzaObject
//int index =0;
//int noOfIngredients;

//while(scanner.nextLine()){
    //if(index==1){

    // }

//}
}