import java.util.*;

public class life {
    public static void main(String[] args) {
        List<List<String>> life = GenerateEmptyBoard(4,4);
        System.out.println(life.size()+"x"+life.get(0).size());
        System.out.println(checkForLife(life));

    }



    static List<List<String>> GenerateEmptyBoard(int x, int y){
        List<List<String>> life = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            life.add(new ArrayList<>(x));
            for (int j = 0; j < y; j++) {
                life.get(i).add(".");
            }
        }
        return life;
    }


    static List<List<String>> conditionsOfLife(List<List<String>> LifeList){
        //condition 1


        return LifeList;
    }

    static List<String> checkForLife(List<List<String>> LifeList){
        List<String> positionList = new ArrayList<>();
        for (int i = 0; i < LifeList.size(); i++) {
            for (int j = 0; j < LifeList.get(i).size(); j++) {
                if(LifeList.get(i).get(j).equals("*")){
                    System.out.println("Found life on "+ i +","+ j);
                    positionList.add(i + "," + j);
                }
            }
        }
        return positionList;
    }

}
