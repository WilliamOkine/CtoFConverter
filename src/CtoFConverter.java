import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        while (true) {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                break; // Exit the loop if a valid input is provided
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Program terminated.");
                    return;
                }
                System.out.println("Invalid input. Please enter a valid numeric temperature value.");
            }
        }

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        // Test freezing and boiling points
        double freezingCelsius = 0;
        double boilingCelsius = 100;
        double freezingFahrenheit = (freezingCelsius * 9 / 5) + 32;
        double boilingFahrenheit = (boilingCelsius * 9 / 5) + 32;

        System.out.println("Freezing point of water: " + freezingCelsius + " degrees Celsius = " +
                freezingFahrenheit + " degrees Fahrenheit");
        System.out.println("Boiling point of water: " + boilingCelsius + " degrees Celsius = " +
                boilingFahrenheit + " degrees Fahrenheit");
    }
}

