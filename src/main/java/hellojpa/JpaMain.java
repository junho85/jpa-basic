package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
//            em.persist(member);

            // 조회
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

            // 삭제
//            em.remove(findMember);

            // 수정
//            findMember.setName("HelloJPA");
            // em.persist로 저장할 필요 없음.
            // 자바 컬렉션을 다루도록 설계 되었기 때문

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA2");
//            System.out.println("=== BEFORE ===");
//            em.persist(member); // 1차 캐시에 저장
//            System.out.println("=== AFTER ===");

//            Member findMember = em.find(Member.class, 101L); // 1차 캐시에 있는 것 조회
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

//            Member findMember1 = em.find(Member.class, 101L); // DB에서 조회
//            Member findMember2 = em.find(Member.class, 101L); // 1차 캐시에 있는 것 조회
//
//            System.out.println(findMember1 == findMember2); // true

//            System.out.println("=========");
//
//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2);
//
//            System.out.println("=========");

            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZZ");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
