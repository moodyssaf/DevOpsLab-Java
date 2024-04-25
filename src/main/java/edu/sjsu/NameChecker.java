package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // Check null and length constraints
        if (input == null || input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Regular expression to validate the name
        // ^[A-Za-z] - Must start with an alphabetic character
        // (['-]?[A-Za-z]+)* - Subsequent characters can be alphabets that may follow a single quote or a non-consecutive hyphen
        // $ - End of line
        return input.matches("^[A-Za-z](['-]?[A-Za-z]+)*$");
    }
}
