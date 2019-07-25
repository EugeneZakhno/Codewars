import java.util.Arrays;

public class SmashWords {
    //  Sentence Smash
    //  Write a method smash that takes an array of words and smashes them together into a sentence and returns the sentence.
    //  You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
    //  Be careful, there shouldn"t be a space at the beginning or the end of the sentence!

    // Напишите метод smash, который принимает массив слов, разбивает их вместе в предложение и возвращает предложение.
    // Вы можете игнорировать необходимость очистки слов или добавления знаков препинания, но вы должны добавлять пробелы между каждым словом.
    // Будьте осторожны, в начале или в конце предложения не должно быть пробела!
    //var words = ["hello", "world", "this", "is", "great"];

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String str = String.join(" ", words);
        return str;
    }
    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(SmashWords.smash(words));
    }
}