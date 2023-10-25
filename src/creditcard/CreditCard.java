package creditcard;

public class CreditCard {
    //클래스변수
    private static int numOfCards = 0; //객체 생성시마다 1씩증가

    //인스턴스변수
    private String owner; //getter
    private int cardNum;  //getter
    private int limit = 0; //카드한도액   //getter, setter
    private int usedAmount = 0; //누적사용액 -> limit를 넘을 수 없음    //getter

    CreditCard() {} //기본생성자

    CreditCard(String owner, int limit){
        this.cardNum = numOfCards;
        //객체 생성시마다 1씩증가

        this.owner = owner;
        this.limit = limit;
    }

    {
        numOfCards++;
    }

    public int pay(int amount){
        //카드를 amount만큼 결재할 때 사용하는 메서드
        //pay시, usedAmount만큼 증가, limit를 초과하는 경우 카드 승인되면 안됨 -> return -1; 값변경x
        usedAmount += amount; //amount만큼 usedAmount를 증가

        if (usedAmount < limit){
            return usedAmount;
        } else {
            usedAmount -= amount;
            System.out.println("Card is delcined.");
            return -1;
        }
    }

    public String info(){
        return "owner: " + owner + ", number: " + cardNum + ", limit: " + limit + ", usedAmount: " + usedAmount;
    }

    public String getOwner() {
        return owner;
    }

    public int getCardNum() {
        return cardNum;
    }

    public int getLimit() {
        return limit;
    }

    public int getUsedAmount() {
        return usedAmount;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public static int getNumOfCards() {
        return numOfCards;
    }
}
