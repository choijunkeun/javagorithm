package search;


import java.lang.reflect.Array;
import java.util.Arrays;

// 이진 검색
// 전제 조건 : 데이터가 정렬되어 있어야함
public class BinarySearch {

    // a는 검색할 배열, key는 찾는 숫자
    static int binSearch(int[] a, int key) {
        int pointLeft = 0;              // 검색 범위의 첫 인덱스
        int pointRight = a.length - 1;  // 검색 범위의 끝 인덱스

        do {
            int pointCenter = (pointLeft + pointRight) / 2; // 중앙요소의 인덱스
            if(a[pointCenter] == key) { // 중앙 요소 인덱스가 찾는 값일 경우는 그 인덱스 반환
                return pointCenter;
            } else if(a[pointCenter] < key) {   // 중앙요소 인덱스가 찾는값보다 작으면,
                pointLeft = pointCenter + 1;
            } else {
                pointRight = pointCenter - 1;
            }
        } while(pointLeft <= pointRight);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,10,11,13,15,17,18,20,21,23,30};
        int searchNum = 30;
        int result = BinarySearch.binSearch(arr, searchNum);

        System.out.println("찾는 값의 인덱스 = " + result);

        int result2 = Arrays.binarySearch(arr, searchNum);  // Arrays 클래스에 정의된 이진탐색 메서드
        System.out.println("찾는 값의 인덱스2 = " + result2);

    }
}
