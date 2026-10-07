import java.util.ArrayList;
import java.util.HashMap;
public class Collections1 {
    public static void main(String[] args){
        ArrayList<String> tools = new ArrayList<>();
        tools.add("Selenium");
        tools.add("Postman");
        tools.add("JMeter");
        tools.add("CucumberJava");
        tools.add("GIT");

        for(String tool: tools){
            System.out.println("Tool:" + tool);
        }
        HashMap<String, Integer> years =new HashMap<>();
        years.put("Selenium", 4);
        years.put ("Postman",4);
        System.out.println("Selenium Years:" + years.get("Selenium"));
        System.out.println("Tools Size" + tools.size());
    }

}
