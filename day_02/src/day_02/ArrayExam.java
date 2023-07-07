package day_02;

public class ArrayExam {
	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[3];
		System.out.println(arr);	//I@3d012ddd -> I는 Int, 3d012ddd는 참조값을 나타냄
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		int[] arr2 = {100,200,300};	//선언, 대입을 한번에
		System.out.println(arr2[0]);
//		arr2 = {100,200,300};		//오류. 변수 초기화시에만 사용할 수 있는 구문
		
		
		int[] arr3 = new int[]{100,200,300};	//힙공간에 메모리가 만들어짐
		arr3 = new int[] {400,200,300};			//이렇게 쓰면 17번째 줄에서 만들었던 arr3는 GarbageCollection으로 감
		System.out.println(arr3[0]);
		
		//literal은 왼쪽처럼 쓰는것으로 타입을 값으로 표현, 얘는 재활용할 목적으로 쓰기 때문에 Method영역에 만들어짐 
//		String s = "Kim";		//new String("Kim") 원래 이렇게 만들어야됨(둘이 같은거임)
//								//new를 사용하면 heap공간에 만들어짐
//		int i = 50;
		
		System.out.println(arr3.length);
		
	}

}
