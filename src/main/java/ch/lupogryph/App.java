package ch.lupogryph;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import ch.lupogryph.entity.*;

@Path("")
public class App {

    @Inject
    EntityManager em;

    @GET
    public AppUser[] getUsers() {
        return em.createNamedQuery("AppUser.findAll", AppUser.class)
        .getResultList().toArray(new AppUser[0]);
    }

    @Transactional
    @POST
    public void createUser(AppUser user) {
        var newAppUser = new AppUser();
        newAppUser.setEmail(user.getEmail());
        newAppUser.setPassword("*******");
        newAppUser.setRole(user.getRole());
        em.persist(newAppUser);
    }

}
