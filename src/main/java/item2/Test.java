package item2;

public class Test {
    public static void main(String[] arg) {
        NutritionFacts coca = new NutritionFacts.Builder(230,8)
                .carbohydrate(100)
                .sodium(35)
                .carbohydrate(27)
                .fat(888)
                .build();

        System.out.println("-----");
        System.out.println(coca.getFat());
    }


}
