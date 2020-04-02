public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 5);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 7);
        myList.add(4, 8);
        myList.add(5, 9);
//        MyList<Integer> myList1 = (MyList<Integer>) myList.clone();
        myList.remove(1);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.contains(2));
        System.out.println(myList.indexOf(5));
    }
}