package dijkstraPath3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
    public List<Plaats> getShortestPathTo(Plaats targetVerte) {
        List<Plaats> path = new ArrayList<>();

        for (Plaats vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }
    
    public int getWholeDistance(Plaats targetVerte) {
        int distance = 0;

        for (Plaats vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
            distance+=1;
        }
;
        return distance;
    }
}
