/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SessionBean;

import Entity.Userreg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rahul
 */
@Stateless
public class UserregFacade extends AbstractFacade<Userreg> {

    @PersistenceContext(unitName = "SahayogMedicineDonationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserregFacade() {
        super(Userreg.class);
    }
    
}
