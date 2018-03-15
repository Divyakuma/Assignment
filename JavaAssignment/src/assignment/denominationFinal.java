package assignment;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class denominationFinal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
        String TotalAmount;
        int DecimalAmount;
        long Rupees;
        long rs100,rs500,rs1000,rs2000;
        int rs50, rs20, rs10, rs5, rs2, rs1;

        int paisa25, paisa50;

       
        System.out.println("Enter a rupees amount including paisa.");

        // read amount of rupees and paisa.
        TotalAmount = sc.nextLine().trim();
        BigDecimal bdAmount = new BigDecimal(TotalAmount);
        bdAmount = bdAmount.setScale(2, BigDecimal.ROUND_UP);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        df.setGroupingUsed(true);
        String result = df.format(bdAmount);

        
        System.out.println("Amount you entered in Rupees and Paisa: "+ result);

        Rupees = bdAmount.longValue();
        System.out.printf("\nRupees Part of Original Amount: %,d\n",Rupees);

        // extract the paisa from TotalAmount 
        BigInteger decimal = bdAmount.remainder(BigDecimal.ONE)
                .movePointRight(bdAmount.scale()).abs().toBigInteger();
        DecimalAmount = decimal.intValue();
        System.out.println("Paisa part of orginal amount: " + DecimalAmount);

        
        rs2000 = Rupees / 2000L;
        Rupees = Rupees % 2000L;
        System.out.printf("Number of 2000rs notes: %,d\n", rs2000);
        
        
        rs1000 = Rupees / 1000L;
        Rupees = Rupees % 1000L;
        System.out.printf("Number of 1000rs notes: %,d\n", rs1000);
        
        
        rs500 = Rupees / 500L;
        Rupees = Rupees % 500L;
        System.out.printf("Number of 500rs notes: %,d\n", rs500);
        
        rs100 = Rupees / 100L;
        Rupees = Rupees % 100L;
        System.out.printf("Number of 100rs notes: %,d\n", rs100);

        
        rs50 = (int) Rupees / 50;
        Rupees = Rupees % 50L;
        System.out.println("Number of 50rs notes: " + rs50);

       
        rs20 = (int) Rupees / 20;
        Rupees = Rupees % 20L;
        System.out.println("Number of 20rs notes: " + rs20);

        
        rs10 = (int) Rupees / 10;
        Rupees = Rupees % 10L;
        System.out.println("Number of 10rs notes: " + rs10);

        
        rs5 = (int) Rupees / 5;
        Rupees = Rupees % 5L;
        System.out.println("Number of 5rs notes: " + rs5);

        rs2 = (int) Rupees / 2;
        Rupees = Rupees % 2L;
        System.out.println("Number of 2rs notes: " + rs2);

        
        rs1 = (int) Rupees;
        System.out.println("Number of 1rs notes: " + rs1);

        
        
        paisa50 = DecimalAmount / 50;
        DecimalAmount = DecimalAmount % 50;
        System.out.println("Number of 50 paisa: " + paisa50);

        paisa25 = DecimalAmount / 25;
        DecimalAmount = DecimalAmount % 25;
        System.out.println("Number of 25 paisa: " + paisa25);

    }

}
