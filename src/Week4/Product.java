package Week4;

public class Product {
    static int count = 0;
    int serialNo;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 초기화 블록
    {
        ++count;
        serialNo = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public Product() {
        // 기본 생성자. 별도의 로직이 필요하다면 여기에 추가.
    }

    public Product(String color) {
        this.color = color;
    }

    public int getSerialNo(){
        return serialNo;
    }
}
