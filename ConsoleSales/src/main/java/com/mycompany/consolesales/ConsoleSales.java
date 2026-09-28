/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;
import java.util.Scanner;
/**
 *
 * @author emeris
 */

//Question 2
interface iConsole {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Console implements iConsole {
    private String consoleType;
    private String storeName;
    private int totalSales;

   
    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE TYPE : " + getConsoleType());
        System.out.println("STORE NAME   : " + getStore());
        System.out.println("TOTAL SALES  : " + getTotalSales());
        System.out.println("--------------------------------------------------");
    }
}

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a console type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.print("Enter choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); 

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "NINTENDO SWITCH";
                break;
          
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);

        report.printReport();

        input.close();
    }
}


