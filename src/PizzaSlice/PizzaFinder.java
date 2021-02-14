package PizzaSlice;

import java.util.*;

class PizzaFinder{
    int max = 0;
    int [][] pizzaMatrix;
    int highestScoring;
    int highestX;
    int highestY;

    public int numberOfDeliveries(int t2, int t3, int t4, int noPizzas){

        int noDeliveries = 0;
        while(noPizzas>0){
            if(noPizzas >1 && t2>=1){
                t2-=1;
                noPizzas -= 2;
                noDeliveries++;
            }
            if(noPizzas>2 && t3>=1){
                t3-=1;
                noPizzas -= 3;
                noDeliveries++;
            }
            if(noPizzas>3 && t4>=1){
                t4-=1;
                noPizzas -= 4;
                noDeliveries++;
            }
        }
        return noDeliveries;
    }

    //Find which pizza deliver the highest score
    public void find(Pizza [] pizzas, int n){
        int max = -1;
        int index1=0;
        int index2=0;
        pizzaMatrix = new int [n][n];

        highestScoring = 0;
        highestX=0;
        highestY=0;

        for(int i=0; i<n; i++){
            int length1 = pizzas[i].getToppings().length;
            Set<String> set1 = new HashSet<String>(Arrays.asList(pizzas[i].getToppings()));
            for (int j = i+1; j<n; j++){
                Set<String> set2 = new HashSet<String>(Arrays.asList(pizzas[j].getToppings()));
                int length2 = pizzas[j].getToppings().length;
                set2.retainAll(set1); // stores the intersection of s1 and s2 in s2
                int total = length1 + length2 - set2.size();
                pizzaMatrix[i][j] = length1 + length2 - set2.size(); // s2 contains the intersection
                if (total > max){
                    max = total;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        pizzaMatrix[index1][index2] = 0;

        for (int i=0; i< n; i++){
            for (int j = i+1; j<n; j++){
                System.out.println("The score of pizza" + i + " with pizza" + j + " is " + pizzaMatrix[i][j] + " ");
                if(highestScoring< pizzaMatrix[i][j]){
                    highestScoring = pizzaMatrix[i][j];
                    highestX =i;
                    highestY =j;
                }
            }
        }
        System.out.println();
        System.out.println("The highest scoring pizza is: pizza" + highestX + " pizza" + highestY);
    }
}
