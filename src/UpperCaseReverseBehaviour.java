import java.util.ArrayList;

public class UpperCaseReverseBehaviour implements AddBehaviour{
    @Override
    public void addWord(String word, ArrayList<String> vocab) {
        StringBuilder sb = new StringBuilder(word.toUpperCase()); // convert uppercase word to StringBuilder
        sb.reverse();   // reverse the string
        vocab.add(sb.toString());  // append it to the vocabulary
    }
}
