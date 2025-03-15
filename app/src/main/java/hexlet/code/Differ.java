package hexlet.code;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Differ {
    public static void generate (String filepath1, String filepath2) throws Exception {
        Map m1 = getData(filepath1);
        Map m2 = getData(filepath2);
    }

    public static Map getData(String filepath) throws Exception {
        Path path = Paths.get(filepath).toAbsolutePath().normalize();

        if (!Files.exists(path)) {
            throw new Exception("File does not exist: " + filepath + " - read as " + path.toString());
        }

        List<String> content = Files.readAllLines(path);
        ObjectMapper mapper = new ObjectMapper();

        //HashMap<String, String> map = mapper.readValue(content, HashMap.class);
        //Map<String, String> map = mapper.readValue(content, Map.class);
        //Map map = mapper.readValue(new File(filepath), Map.class);
        //System.out.println(map.toString());
        return mapper.readValue(new File(filepath), Map.class);
    }
}
