import ca.pfv.spmf.algorithms.classifiers.naive_bayes_text_classifier.AlgoNaiveBayesClassifier;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        AlgoNaiveBayesClassifier nbClassifier=new AlgoNaiveBayesClassifier();
        try {
            String outputDirPath = "./Izlaz/";
            File outputDir = new File(outputDirPath);
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }
            nbClassifier.runAlgorithm("./Trening","./Testiranje",outputDirPath,true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
