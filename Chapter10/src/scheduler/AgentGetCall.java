//나혼자코딩 내용
package scheduler;

public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담원이 다음 전화 요청");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}
}
