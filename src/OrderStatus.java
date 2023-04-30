/*
 enum
 문자와 숫자로 OrderStatus 를 표현하면 읽기는 좋은데
 허용하는 타입을 벗어날 경우가 있어서 타입방어를 해야함.
 오로직 OrderStatus에서 지원하는 값만 입력하도록 하는게 enum 타입

 과제: ENUMSET, ENUMMAP 에서 키를 사용해보자
 */
public enum OrderStatus {

    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERRED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }
}
