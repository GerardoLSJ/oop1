import java.io.*; 
import java.util.*;

public class Data extends Login {

    Map map = new HashMap();
    /*
    // Put elements to the map
    map.put("Ram", new Double(3434.34));
    map.put("Krishna", new Double(123.22));
    map.put("Hary", new Double(1378.00));
    //to get elements
    map.get("Krishna"); # =123.22
    map.get("Hary"); # = 1378.00 
    */
    public static void main(String[] args){
        Data init = new Data();
        init.load();
        Login frame = new Login();
    }

    public void load(){
        try {
        String linea = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("archivo.txt" )));
        while( (linea = br.readLine()) != null )
        {
        String[] line = linea.split(",");
        map.put(line[0],line[1]);
        System.out.println( "s: " + line[1]  );
        }
        
        br.close();
        
            } catch(IOException e){
                System.out.println( e );

        }

    }

    
}