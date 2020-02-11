import java.io.*;
import org.lwjgl.util.vector

public class OBJLoader {
    public static RawModel loadObjModel(String fileName, Loader loader){
        try(FileReader fr = new FileReader(new File("models/"+fileName+".obj"));
        BufferedReader br = new BufferedReader (fr);{
        String line;
        List<Vector3f> vertices = new ArrayList<Vector3f>();
        } catch (FileNotFoundException e) {
            System.err.println("Couldn't load file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
