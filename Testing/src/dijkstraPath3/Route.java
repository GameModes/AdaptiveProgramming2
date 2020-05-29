package dijkstraPath3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
    double distance = 0;
    List<Plaats> path = new ArrayList<>();
    
    
    public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<Plaats> getPath() {
		return path;
	}

	public void setPath(List<Plaats> path) {
		this.path = path;
	}

	public String toString() {
		String routebeschrijving = "Van " + path.get(0) + " naar " + path.get(path.size()-1) + " neem de route: ";
		for(int c = 0; c < path.size(); c++){
			routebeschrijving += path.get(c) + ", ";
		}
		routebeschrijving+= "met de afstand: " + distance;
		return routebeschrijving;
    }
}
