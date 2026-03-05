//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public void sum(int a,int b){
            System.out.printf("a+b=%d",a+b);
            System.out.println("hotfix 수정중");
            System.out.println("hotfix 수정중");
            System.out.println("hotfix 수정중");
        }

    public void b(){
        System.out.println("기능 b 추가 구현");
    }

    public static void main(String[] args) {
        System.out.println("test");
        //test가 너무 많이 출력돼서 지움
        int c=3;
        int b=5;
        boolean a=true;
        System.out.println(c+b);
        for(int i=0; i>=5;i++){
            System.out.println("한번 더 간다!");
            System.out.println("추가1");
        }
        while(a){
            System.out.println("병합 충돌 테스트");
            System.out.println("병합 충돌 테스트");
            System.out.println("병합 충돌 테스트");
            System.out.println("병합 충돌 테스트");
            System.out.println("병합 충돌 테스트");
        }

        int score=77;
        String grade=switch (score/10){

            case 7->"c";

            default -> throw new IllegalStateException("Unexpected value: " + score);
        };

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}