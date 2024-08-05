package Chapter7;

public class Practice {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayBonus = new int[15];
        for (int element : arrayBonus)
            arrayBonus[element] +=1;
        int[] bestScore = new int[5];
        for (int value : bestScore)
            System.out.println(bestScore[value]);

    }
}
