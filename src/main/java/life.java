import java.util.*;

public class life {
    public static void main(String[] args) {
        List<List<String>> life = generateEmptyBoard(4,4);
        System.out.println(life.size()+"x"+life.get(0).size());
        System.out.println(checkForLife(life));

        life = conditionsOfLife(life);
        for (List lifeRow:life) {
            System.out.println(lifeRow);
        }
        System.out.println(checkForLife(life));
        life = conditionsOfLife(life);

    }



    static List<List<String>> generateEmptyBoard(int x, int y){
        List<List<String>> life = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            life.add(new ArrayList<>(x));
            for (int j = 0; j < y; j++) {
                life.get(i).add(".");
            }
        }
        return life;
    }


    static List<List<String>> conditionsOfLife(List<List<String>> lifeList){
        List<List<Integer>> lifePositions = checkForLife(lifeList);
        List<List<String>> tempLife = lifeList;
        if(lifePositions.size()==0){
            System.out.println("First or last generation - no life - adding some life");
            tempLife.get(1).set(2, "*");
            tempLife.get(1).set(3, "*");
            tempLife.get(2).set(3, "*");
        }
        else{
        //condition 1. Any live cell with fewer than two live neighbors dies, as if caused by underpopulation.
            int neighbors = 0;
            for (int i = 0; i < lifePositions.size(); i++) {
                int x = lifePositions.get(i).get(0);
                int y = lifePositions.get(i).get(1);


            }
        //condition 2. Any live cell with more than three live  neighbors  dies, as if by overcrowding.

        //condition 3. Any live cell with two or three live neighbors lives on to the next generation.

        //condition 4. Any dead cell with exactly three live neighbors becomes a live cell.
        }
        return tempLife;
    }

    static List<List<Integer>> checkForLife(List<List<String>> LifeList){
        List<List<Integer>> positionList = new ArrayList<>(2);
        for (int i = 0; i < LifeList.size(); i++) {
            for (int j = 0; j < LifeList.get(i).size(); j++) {
                if(LifeList.get(i).get(j).equals("*")){
                    positionList.add(new ArrayList<>());
                    positionList.get(positionList.size()-1).add(i);
                    positionList.get(positionList.size()-1).add(j);
                }
            }
        }
        return positionList;
    }


    static Integer checkNeighbors(int x, int y, List<List<String>> lifeList){
        List<List<String>> temp = lifeList;


        return 0;
    }

}
