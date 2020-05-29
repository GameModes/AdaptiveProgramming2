package dijkstraPath3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
    int distance = 0;
    List<Plaats> path = new ArrayList<>();
    


    public int getWholeDistance(Plaats targetVerte) {
        for (Plaats vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
            distance+=1;
        }
        
        return distance;
    }
    
    public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public List<Plaats> getPath() {
		return path;
	}

	public void setPath(List<Plaats> path) {
		this.path = path;
	}

	public String toString() {
		String routebeschrijving = "Neem de route: ";
		for(int c = 0; c < path.size(); c++){
			routebeschrijving += path.get(c) + ", ";
		}
		routebeschrijving+= "met de afstand: " + distance;
		return routebeschrijving;
    }
}
