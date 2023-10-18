package Work;

public class Movie {
    private String movieTitle; //영화제목
    private String viewingClass; //영화 관람 등급
    private int[] countRatings; //평점을 부여한 관객수를 저장


    Movie(){
        countRatings = new int[5];
    }

    Movie(String movieTitle, String viewingClass){
        this();
        this.movieTitle = movieTitle;
        this.viewingClass = viewingClass;
    }

    //평점추가
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
        int audience = 0;

        for (int i = 0; i< countRatings.length; i++) {
            total += (i + 1) * countRatings[i]; //평점 * 관객수
            audience += countRatings[i];
        }
        if(total == 0){
            System.out.println("아직 평점이 없습니다.");
            return 0;
        }
        return (double) total / audience;
    }

    public String getRatingStatistics(){
        String re = "";
        for (int i = 0; i < countRatings.length; i++){
            re += "평점 : " + (i + 1) + " 관객수 : " + countRatings[i] + " / ";
        }
        return re;
    }



    public String getMovieTitle() {
        return movieTitle;
    }

    public String getViewingClass() {
        return viewingClass;
    }
}
