public class OrderedSentenceGenerator extends SentenceGenerator {


    public OrderedSentenceGenerator(Subject generator) {
        super(generator);
        genBehaviour = new OSGBehaviour();
    }


}
