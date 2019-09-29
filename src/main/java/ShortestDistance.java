import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;

public class ShortestDistance {
    JGraphXAdapterDemo demo;
    Graph myGraph;

    public ShortestDistance(){
        demo = new JGraphXAdapterDemo();
        myGraph = demo.getGraph();
    }

    public GraphPath getNearest() {
        //TODO
        return null;
    }

    public String getFurthest() {
        //TODO
        return null;
    }

    public GraphPath getMyShortestPath(String source, String sink) {
        //TODO
        return null;
    }

    public GraphPath getDijkstraShortestPath(String source, String sink) {
        DijkstraShortestPath shortestPath = new DijkstraShortestPath(myGraph);
        GraphPath path = shortestPath.getPath(source, sink);
        return path;
    }

    public Graph getGraph() {
        return myGraph;
    }
}
