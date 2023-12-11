package Work.Work4;
import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {

//        HashMap 타입 선언 및 생성
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
//        put 메서드 사용해 저장
        javaScore.put("A", 55);
        javaScore.put("B", 100);
        javaScore.put("C", 87);
        javaScore.put("D", 78);
        javaScore.put("E", 86);
//        해쉬맵 크기 출력
        System.out.println("size: " + javaScore.size());
//        keySet() 메서드 사용
        Set<String> keys = javaScore.keySet();
//        iterator 메서드 사용
        Iterator<String> it = keys.iterator();
//        전체 조회
        while (it.hasNext()) {
            String name = it.next();
            Integer integer = javaScore.get(name);
            System.out.println(name + ": " + integer);
        }
//        배열 타입 변환
        String[] array = keys.toArray(new String[0]);
//        List 타입 변환
        List<String> objects = Arrays.asList(array);
//        정렬 기능
        Collections.sort(objects);
        System.out.println("Sort: " + objects);
//        binarySearch 기능
        int A = Collections.binarySearch(objects, "A");
        int D = Collections.binarySearch(objects, "D");
        System.out.println("A의 위치: " + A + "\nD의 위치: " + D);
//        reverse 기능
        Collections.reverse(objects);
        System.out.println("Reverse: " + objects);
    }

}
