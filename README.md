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

