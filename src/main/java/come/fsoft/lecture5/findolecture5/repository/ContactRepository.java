package come.fsoft.lecture5.findolecture5.repository;

import come.fsoft.lecture5.findolecture5.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository  extends JpaRepository<Contact, String> {
}
