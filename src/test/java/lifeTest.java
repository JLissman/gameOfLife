import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class lifeTest {

    @Test
    public void EmptyBoardYSize() {
        List<List<String>> lifeList = life.generateEmptyBoard(2,5);
        assertEquals(lifeList.get(0).size(),lifeList.get(1).size());
    }
    @Test
    public void EmptyBoardXSize() {
        List<List<String>> lifeList = life.generateEmptyBoard(5,2);
        assertEquals(lifeList.size(),5);
    }
    @Test
    public void checkForLifeNoLife(){
        List<List<String>> lifeList = life.generateEmptyBoard(3,3);
        List lifePositions = life.checkForLife(lifeList);

        assertEquals(lifePositions.size(),0);
    }
    @Test
    public void checkForLifeGotLife(){
        List<List<String>> lifeList = life.generateEmptyBoard(3,3);
        lifeList.get(0).set(2,"*");
        List lifePositions = life.checkForLife(lifeList);

        List<List<Integer>> actualList = new ArrayList<>();
        actualList.add(new ArrayList<>());
        actualList.get(0).add(0);
        actualList.get(0).add(2);


        assertThat(lifePositions, is(actualList));


    }

    @Test
    public void neighborTest(){
        List<List<String>> lifeList = life.generateEmptyBoard(3,3);
        lifeList.get(0).set(2,"*");
        int neighborCount = life.checkNeighbors(0,2,lifeList);

        assertThat(0,is(neighborCount));

    }
}