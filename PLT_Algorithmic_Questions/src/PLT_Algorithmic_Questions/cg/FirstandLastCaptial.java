package PLT_Algorithmic_Questions.cg;

public class FirstandLastCaptial {
	public static String capitalizeFirstAndLastCharacter(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            if (word.length() >= 2) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                String middlePart = word.substring(1, word.length() - 1);
                result.append(firstChar).append(middlePart).append(lastChar).append(" ");
            } else {
                // If the word has less than two characters, just append it as it is.
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String result = capitalizeFirstAndLastCharacter(input);
        System.out.println(result); // Output: "HEllO WORlD"
    }








}
