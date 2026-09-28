# PROG6112_2026_Test_MavaMgcina
//QUESTIION 1

public class ConsoleSalesReport {
    public static void main(String[] args) {
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

       
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        
        
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-12s", console);
        }
        System.out.println();

        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-12d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------\n");

        
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        for (int i = 0; i < sales.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

           
            System.out.printf("%-18s %d\n", cities[i], cityTotal);

           
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------\n");

        
        System.out.println("--------------------------------------------------");
        System.out.printf("CITY WITH THE MOST SALES: %s\n", topCity);
        System.out.println("--------------------------------------------------");
    }
}







//QUESTION 2

import java.util.Scanner;
/**
 *
 * @author emeris
 */
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


