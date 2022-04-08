public class SortedSentenceGenerator extends SentenceGenerator {


    public SortedSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new SSGBehaviour();
    }


}
