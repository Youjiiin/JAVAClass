package Work;
class Movie1{
    private String movieTitle;
    private String viewingClass;
    private int[] countRatings = new int[5];

    Movie1() {} //기본생성자

    Movie1(String movieTitle, String viewingClass) {
        this();
        this.movieTitle = movieTitle;
        this.viewingClass = viewingClass;
    }

    public int addRating(int rating){
        if(1 <= rating && rating <= 5){
            countRatings[rating - 1]++;
            return countRatings[rating - 1];
        } else {
            System.out.println(rating);
            System.out.println("평점은 1~5사이의 정수로 입력해 주세요");
            return -1;
        }
    }

    public double getAverage(){
        int total = 0;
        int people = 0;
        for (int i = 0; i < countRatings.length; i++){
            total += (i + 1) * countRatings[i];
            people += countRatings[i];
        }
        if(total == 0){
            System.out.println("아직 평점이 없습니다.");
            return 0;
        }
        double average = (double)(total / people);
        return average;
    }

    public String getRatingStatistics() {
        String a = "";
        for (int i = 0; i< countRatings.length; i++){
             a += "평점" + (i + 1) + " 관객수" + countRatings[i] + " / ";
        }
        return a;
    }

    public String getMovieTitle() {
        return movieTitle;
    }
    public String getViewingClass() {
        return viewingClass;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Movie1 m1 = new Movie1("영화1", "15+");
        Movie1 m2 = new Movie1("양화2", "19+");
        int count = 0;
        while (count < 10) {
            int rating1 = (int)(Math.random() * 9);
            if(m1.addRating(rating1) != -1){
                count++;
            }
        }
        int count2 = 0;
        while (count2 < 10) {
            int rating2 = (int)(Math.random() * 9);
            if(m2.addRating(rating2) != -1){
                count2++;
            }
        }

        System.out.println("영화제목 : " + m1.getMovieTitle() + "영화 등급" + m1.getViewingClass()
         + m1.getRatingStatistics() + m1.getAverage());
        System.out.println("영화제목 : " + m2.getMovieTitle() + "영화 등급" + m2.getViewingClass()
                + m2.getRatingStatistics() + m2.getAverage());
    }
}
