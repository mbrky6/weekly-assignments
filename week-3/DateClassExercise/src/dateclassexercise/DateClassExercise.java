package dateclassexercise;

import java.util.HashSet;

public class DateClassExercise {

    public static void main(String[] args) {
        MyDate currentDay = new MyDate(); // Whatever the current date is when the program is run (assuming it's not being run hundreds of millions of years in the future when the number of milliseconds it's been since 1970 is greater than the long limit.)
        MyDate mysteryDate = new MyDate(34355555133101L); // 07 Sep, 3058 (the undefined date in the textbook)
        MyDate theDateIGaveYouMyHeart = new MyDate(2021, 11, 25); // 25 Dec, 2021 (last Christmas)
        
        System.out.println(currentDay.toString());
        System.out.println(mysteryDate.toString());
        System.out.println(theDateIGaveYouMyHeart.toString());
        
        mysteryDate.setDate(561555550000L); // 18 Oct 1987 (the defined date in the textbook)
        System.out.println(mysteryDate.toString());
        
    } // + void main
} // + class DateClassExercise
