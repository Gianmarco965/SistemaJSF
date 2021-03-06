/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author archa
 */
@Stateless
public class DisqueraFacade extends AbstractFacade<Disquera> {

    @PersistenceContext(unitName = "SistemaJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DisqueraFacade() {
        super(Disquera.class);
    }
    
}
