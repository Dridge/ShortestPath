import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestShortestPath {
    ShortestDistance shortestDistance = new ShortestDistance();
    Graph testGraph;

    @Before
    public void setUp() {
        testGraph = shortestDistance.getGraph();
    }

    @Test
    public void testDijkstaApproach() {
        List<String> expectedPath = new ArrayList<String>();
        expectedPath.add("v1");
        expectedPath.add("v2");
        expectedPath.add("v3");
        GraphPath path = shortestDistance.getDijkstraShortestPath("v1","v3");
        if (path == null) fail();
        List<String> shortestPath = path.getVertexList();
        assertEquals(expectedPath, shortestPath);
    }

    @Test
    public void testDijkstaApproachAgain() {
        List<String> expectedPath = new ArrayList<String>();
        expectedPath.add("v4");
        expectedPath.add("v3");
        expectedPath.add("v6");
        GraphPath path = shortestDistance.getDijkstraShortestPath("v4","v6");
        if (path == null) fail();
        List<String> shortestPath = path.getVertexList();
        assertEquals(expectedPath, shortestPath);
    }

    //what about longest path?

    //what about forcing through a certain area? required path?
}
