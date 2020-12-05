//Lab7Ex3
//Corey Dennison T00185828  
/*This program takes in the weight of 5 people from the user using a while loop and 
displays the average weight of the inputs and the percentage of weight that were at le 80kg*/

import java.util.Scanner;
public class Lab7Ex3 {
    public static void main(String args[]) {
        
        float weight, totalWeight=0, atLeast80=0;
        int people=5, count=0;

        Scanner input = new Scanner(System.in);

        while(count <= people){
            System.out.print("Please enter the weight of person " + count+1 + ": ");
            weight = input.nextFloat();

            if(weight >= 80)
                atLeast80++;
            
            totalWeight += weight;

            count++;
        }

        System.out.println("Results" + "\nAverage weight: " + String.format("%.2f", totalWeight/people));
    }
}
