package chapter09;

public class IFTest2 {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for(int i = 0; i < 12; i++) mystack1.push(i);
        for(int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack  в mystack1:");
        for(int i = 0; i <12; i++) System.out.println(mystack1.pop());

        System.out.println("Stack  в mystack2:");
        for(int i = 0; i <20; i++) System.out.println(mystack2.pop());
    }
}

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size) {
        this.stck = new int[size];
        this.tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length) {
            int temp[] = new int[stck.length * 2];
            for(int i = 0; i < stck.length;i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if(tos < 0){
            System.out.println("Стэк не загружен");
            return 0;
        } else return stck[tos--];
    }
}