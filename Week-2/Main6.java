
// String Operations


public class Main6 {
    public static void main(String[] args) {

        String str = "Apple";
        String str2 = "Banan";
        System.out.println("String 1: " + str);
        System.out.println("String 2: " + str2);

        System.out.println("Length: " + str.length());
        System.out.println("First character(charAt()): " + str.charAt(0));
        System.out.println("Last character(charAt()): " + str.charAt(str.length()-1));
        System.out.println("Index of: " + str.indexOf('A'));
        System.out.println("Last index of: " + str.lastIndexOf('A'));
        System.out.println("Trimmed string: " + str.trim());
        System.out.println("Starts with: " + str.startsWith("A"));
        System.out.println("Ends with: " + str.endsWith("A"));
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("EqualsIgnoreCase: " + str.equalsIgnoreCase(str2));
        System.out.println("CompareTo: " + str.compareTo(str2));
        System.out.println("CompareToIgnoreCase: " + str.compareToIgnoreCase(str2));
        System.out.println("Concat: " + str.concat(str2));
        System.out.println("IsEmpty: " + str.isEmpty());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Contains 'abc': " + str.contains("abc"));
        System.out.println("Replace 'abc' with 'xyz': " + str.replace("abc", "xyz"));

        System.out.println("");
        String words[] = str.split(" ");
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("");
        System.out.println("IsBlank: " + str.isBlank());
        System.out.println("IsAlphabetic: " + str.chars().allMatch(Character::isAlphabetic));
        System.out.println("IsNumeric: " + str.chars().allMatch(Character::isDigit));
        System.out.println("IsAlphanumeric: " + str.chars().allMatch(Character::isLetterOrDigit));
        System.out.println("IsWhitespace: " + str.chars().allMatch(Character::isWhitespace));
        System.out.println("IsPrintable: " + str.chars().allMatch(Character::isDefined));
        System.out.println("IsUpperCase: " + str.chars().allMatch(Character::isUpperCase));
        System.out.println("IsLowerCase: " + str.chars().allMatch(Character::isLowerCase));
        System.out.println("IsTitleCase: " + str.chars().allMatch(Character::isTitleCase));
        
    }
}
