package search;




// 선형 검색(linear search)
// 배열에서 맨 앞부터 순차적으로 요소를 검색하는 알고리즘
public class SeqSearch {
    // 배열 a에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int key) {
        for(int i = 0; i < a.length; i++) {
            if(key == a[i]) {
                return i;   // 찾으면 찾는 idx 반환
            }
        }
        return -1;  // 못찾으면 -1 반환
    }

    public static void main(String[] args) {
        int[] arrInt = {1,2,4,6,29,30,11,27,8};
        int searchNum = 5;

        int searchIdx = SeqSearch.seqSearch(arrInt, searchNum);

        if(searchIdx == -1) {
            System.out.println("찾으시는 숫자는 없습니다.");
        } else {
            System.out.println("찾으시는 숫자는 arrInt[" + searchIdx + "] 위치에 있습니다.");
        }

    }
}
