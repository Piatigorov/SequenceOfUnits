import java.io.*;

public class SequenceOfUnits {

    public static void main(String[] args) throws Exception {

        String file = "src\\input.txt";
        String line = "";
        int i = 0;
        int result = 0;
        int sequence = 0;
        int maxSequence = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            line = reader.readLine();


                while ((line = reader.readLine()) != null){
                    if (Integer.parseInt(line) == 1) {
                        result++;
                        sequence = result;
                        if (sequence > 0 && maxSequence < sequence) {
                            maxSequence = sequence;
                        }
                    }
                    else{
                        result = 0;
                    }

                }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\output.txt")))
        {
                writer.write(String.valueOf(maxSequence));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
