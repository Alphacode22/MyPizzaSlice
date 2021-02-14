package PizzaSlice;

class Main {
    //Pizza [] pizzas;
    //int numOfPizzas;
    public static void main(String[] args) {
        InputOutput in = new InputOutput();
        in.readFile("a_example.in");
        PizzaFinder pf = new PizzaFinder();
        int d = pf.numberOfDeliveries(in.teamsOf2,in.teamsOf3,in.teamsOf4,in.noOfPizzas);
        System.out.println("The number of deliveries is: " + d);


        pf.find(in.pizzas, in.noOfPizzas);

        in.writeFile("a_exampleOut.txt");
    }
}