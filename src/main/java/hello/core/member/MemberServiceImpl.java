package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //클래스 이름은 1개만 있을 경우 관용적으로 마지막에 Impl을 붙여줌
    //실제 repository에 구현된 메소드를 실행하여 데이터 저장하는 부분 구현
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long MemberId) {
        return memberRepository.findById(MemberId);
    }
}
