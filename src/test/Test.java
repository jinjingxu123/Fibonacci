package test;

public class Test {  
    // �������鷽��  
    public static void main(String[] args) {  
        long arr[] = new long[200];  
        arr[0] = arr[1] = 1;  
        for (int i = 2; i < arr.length; i++) {  
            arr[i] = arr[i - 1] + arr[i - 2];  
        }  
        System.out.println("쳲��������е�ǰ200��������ʾ��");  
        for (int i = 0; i < arr.length; i++) {  
            if (i % 5 == 0) {
            	System.out.println();  
            } else {
            	System.out.print(arr[i] + "\t");  
            }
        } 
    }   
} 

