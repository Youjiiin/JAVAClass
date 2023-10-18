package Work;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("영화1", "12+");
        Movie m2 = new Movie("영화2", "19+");

        int count = 0;
        while (count < 10) {
            int rating = (int)(Math.random() * 9);
            if(m1.addRating(rating) != -1){
                count++;
            }
        }
        count = 0;
        while (count < 10) {
            int rating = (int)(Math.random() * 9);
            if(m2.addRating(rating) != -1){
                count++;
            }
        }

        System.out.println(m1.getMovieTitle() + "의 영화는 " + m1.getViewingClass() + "의 관람 등급이며, " + m1.getAverage() + "의 평점 평균");
        System.out.println(m1.getRatingStatistics());
        System.out.println(m2.getMovieTitle() + "의 영화는 " + m2.getViewingClass() + "의 관람 등급이며, " + m2.getAverage() + "의 평점 평균");
        System.out.println(m2.getRatingStatistics());

    }
}
