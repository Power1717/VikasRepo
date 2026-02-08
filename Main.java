public class Main {
    public static void main(String[] args) {
        displayGreeting();
        System.out.println();
        displayIndianFlag();
    }

    // Display Republic Day Greeting
    public static void displayGreeting() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║      🇮🇳 HAPPY REPUBLIC DAY 2026 🇮🇳           ║");
        System.out.println("║         January 26th - Republic Day             ║");
        System.out.println("║  Celebrating India's Journey to Democracy      ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("     \"Freedom is not given, it is taken.\"");
<<<<<<< HEAD
        System.out.println("            - AP Netaji Subhas Chandra Bose");
=======
        System.out.println("            -SP Netaji Subhas Chandra Bose");
>>>>>>> d77dd826e22b3c1f91071977266f6f1f8fca6868
    }

    // Display Indian Flag using ASCII Art
    public static void displayIndianFlag() {
        System.out.println("\n" + " ".repeat(20) + "INDIAN FLAG");
        System.out.println();
        
        // Orange stripe
        for (int i = 0; i < 4; i++) {
            System.out.println("  " + "█".repeat(50) + " (Saffron - Courage & Sacrifice)");
        }

        // White stripe with Ashoka Chakra
        for (int i = 0; i < 4; i++) {
            if (i == 1 || i == 2) {
                System.out.println("  " + "█".repeat(22) + "☸" + "█".repeat(22) + " (White - Peace & Truth)");
            } else {
                System.out.println("  " + "█".repeat(50) + " (White - Peace & Truth)");
            }
        }

        // Green stripe
        for (int i = 0; i < 4; i++) {
            System.out.println("  " + "█".repeat(50) + " (Green - Fertility & Growth)");
        }
        
        System.out.println();
        System.out.println("  Legend: ☸ = Ashoka Chakra (24 spokes of righteousness)");
    }
}
