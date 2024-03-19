package bt12;

public class MyListTest {
    public static void main(String[] args) {
        // Test MyList class
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println("Size of myList: " + myList.size());//Kích thước của danh sách

        System.out.println("Index of element 2: " + myList.indexOf(2));//Chỉ số của phần tử 2

        System.out.println("Contains element 3: " + myList.contains(3));//Chứa phần tử 3

        System.out.println("Element at index 1: " + myList.get(1));//Phần tử ở chỉ số 1

        myList.remove(0);//xoa
        System.out.println("Size of myList after removing element at index 0: " + myList.size());//Kích thước myList sau khi loại bỏ phần tử ở chỉ số 0:

        System.out.println("Clearing myList...");//Xóa danh sách của tôi
        myList.clear();
        System.out.println("Size of myList after clearing: " + myList.size());//Kích thước của myList sau khi xóa
    }
}

