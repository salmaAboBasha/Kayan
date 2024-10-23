package ebi.alex.Kayan.Repo;


import ebi.alex.Kayan.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepoInt extends JpaRepository<CustomerEntity, Long> {
    @Query(value = "SELECT * FROM  customer_entity c WHERE c.email =:email", nativeQuery = true)
    CustomerEntity findByEmail(String email);
    CustomerEntity findByEmailAndPassword(String email,String password);
}
