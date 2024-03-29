package solux.baco.repository;

import solux.baco.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    //id => member_id로 변경(7/26)
    public Member findOne(Long member_id){
        return em.find(Member.class, member_id);
    }

    //이메일로 회원 조회
    public  Optional<Member> findByEmail(String email){
        return em.createQuery("select m from Member m where m.email = :email", Member.class)
                .setParameter("email", email)
                .getResultList().stream().findAny();
    }

}
