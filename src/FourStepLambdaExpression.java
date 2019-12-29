import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FourStepLambdaExpression {
    public static void main(String[] args) throws IOException{

      //  System.out.println(FourStepLambdaExpression.processFile());
        BufferedReaderProcessor abc = (BufferedReader br) -> br.readLine();

        String oneline = processFile(abc);

        System.out.println(oneline);

    }


    public static String processFile_Original() throws IOException {

try ( BufferedReader br = new BufferedReader(new FileReader("/Users/addo/IdeaProjects/JavaBasics/data/data.txt"))){

    return br.readLine();

}

    }



    public static String processFile(BufferedReaderProcessor p)throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/addo/IdeaProjects/JavaBasics/data/data.txt"))){

            return p.process(br);

        }
    }
}
