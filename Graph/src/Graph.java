import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> adlList= new HashMap<>();

    public boolean addVertex(String vertex) {
         if(adlList.get(vertex)==null) {
             adlList.put(vertex, new ArrayList<>());
             return true;
         }
     return false;
    }
public  boolean addEdge(String vertex1, String vertex2) {

        if(adlList.get(vertex1)!=null&&adlList.get(vertex2)!=null) {
            adlList.get(vertex1).add(vertex2);
            adlList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
}
public boolean removeEdge(String vertex1, String vertex2) {
        if(adlList.get(vertex1)!=null&&adlList.get(vertex2)!=null) {
            adlList.get(vertex1).remove(vertex2);
            adlList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
}

public boolean removeVertex(String vertex) {
        if(adlList.get(vertex)==null) {
            return false;
        }
        for(String v: adlList.get(vertex)) {
            adlList.get(v).remove(vertex);
        }
        adlList.remove(vertex);
        return true;
}
    public void printGraph() {
        System.out.println(adlList);
    }

}
