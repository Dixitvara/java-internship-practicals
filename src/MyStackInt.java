public class MyStackInt {
    private final int[] contents;
    private int tos;
    private int tos2;
    private final int[] contents2;

    public MyStackInt(int capacity, int contents2) {
        this.contents = new int[capacity];
        this.contents2 = new int[contents2];
        this.tos = 0;
        this.tos2 = -1;
    }

    public void push(int element) {
        tos++;
        contents[tos] = element;
    }

    // modified push method Q1
    public void pushQ1(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        if (!isFull()) {
            contents[tos] = element;
            tos++;
        }
    }

    // modified push method Q2
    public void pushNew(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        if (!isFull()) {
            contents[tos] = element;
            System.out.println(contents[tos]);
            System.out.println("success");
            tos++;
        }
    }

    // modified push method Q2
    public void pushQ3(int element) {
        if (isFull()) {
            tos2++;
//            System.out.println("array is full");
//            System.out.println("creating and assigning new array");
            contents2[tos2] = element;
        }
        if (!isFull()) {
            contents[tos] = element;
            System.out.println(contents[tos]);
            System.out.println("success");
            tos++;
        }
    }

    public void showArr() {
        for (int content : contents2) {
            System.out.println(content);
        }
    }

    public void pop() {
        System.out.println("deleted");
        --tos;
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isFull() {
        return tos == contents.length;
    }

    public boolean ifEmpty() {
        return tos < 0;
    }
}