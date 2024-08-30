package org.example.domain.DAO;



import lombok.Getter;
import lombok.Setter;
import org.example.domain.Country;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
@Getter
@Setter
public class CountryDAO {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll() {
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("select c from Country c join fetch c.languages", Country.class);
        return query.list();
    }
}
