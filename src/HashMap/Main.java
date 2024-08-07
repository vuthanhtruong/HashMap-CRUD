package HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap instance
    	  HashMap hashMap = new HashMap();

          // Adding elements to the HashMap using Put method
    	  HashMap map = new HashMap();

          // Thêm phần tử vào HashMap
          map.Put(1, 10);
          map.Put(2, 20);
          map.Put(3, 30);
          map.Put(4, 40);
          map.Put(5, 50);
          map.Put(6, 50);
          map.Put(7, 100);
          map.Put(8, 1000);
          System.out.println("After adding elements:");
          map.Print();

          // Thêm phần tử vào đầu HashMap
          map.PutFirt(0, 0);
          System.out.println("After adding element at the start:");
          map.Print();

          // Thêm phần tử vào chỉ số cụ thể trong HashMap
          map.PutByIndex(3, 9, 70);
          System.out.println("After adding element at index 3:");
          map.Print();

          // Xóa phần tử theo Key
          map.RemoveByKey(2);
          System.out.println("After removing element with key 2:");
          map.Print();

          // Xóa phần tử theo Value
          map.RemoveByValue(40);
          System.out.println("After removing element with value 40:");
          map.Print();

          // Xóa phần tử theo Index
          map.RemoveByIndex(2);
          System.out.println("After removing element at index 2:");
          map.Print();

          // Cập nhật Key theo Key hiện có
          map.UpdateByKey(3, 6);
          System.out.println("After updating key 3 to 6:");
          map.Print();

          // Cập nhật Value theo Value hiện có
          map.UpdateByValue(50, 55);
          System.out.println("After updating value 50 to 55:");
          map.Print();

          // Cập nhật Key theo chỉ số
          map.UpdateKeyIndex(1, 8);
          System.out.println("After updating key at index 1 to 8:");
          map.Print();

          // Cập nhật Value theo chỉ số
          map.UpdateValueIndex(1, 88);
          System.out.println("After updating value at index 1 to 88:");
          map.Print();

          // Tìm vị trí của giá trị
          HashMap locationMap = map.FindTheLocationOfValues(88);
          System.out.println("Locations of value 88:");
          locationMap.Print();

          // In ra tất cả Keys và Values
          System.out.println("All keys:");
          map.GetKeys();
          System.out.println("All values:");
          map.GetValues();

          // In kích thước của HashMap
          System.out.println("Size of HashMap: " + map.Size());
    }
}
