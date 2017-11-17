/* 클래스와 패키지
- 패키지를 사용하여 클래스를 분류하는 방법을 알아보자! 
- 패키지를 사용하는 이유?
*/

// 소스 파일에서 제일 처음에 패키지를 선언한다.
// 그러면 이후에 선언되는 모든 클래스들은 이 패키지에 소속된다.
package bitcamp.java100.ch01.a.b.c; // 하위 패키지는 점(.)으로 구분한다.

public class Test09_4 {
  public static void main(String[] ags) {
    System.out.println("Hello!"); 
  }
}

/*  [패키지 클래스의 소스 관리]
 *  - 소스 파일을 쉽게 관리하기 위해 
 *    보통 패키지 이름에 해당하는 폴더를 만들고
 *    그 폴더에 소스 파일을 둔다.
 *  
 */