/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mycompany.customerservice.PurchaseOrder;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Geertjan
 */
@Stateless
@Path("com.mycompany.customerservice.purchaseorder")
public class PurchaseOrderFacadeREST extends AbstractFacade<PurchaseOrder> {
    @PersistenceContext(unitName = "com.mycompany_CustomerService_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public PurchaseOrderFacadeREST() {
        super(PurchaseOrder.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(PurchaseOrder entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(PurchaseOrder entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public PurchaseOrder find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<PurchaseOrder> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<PurchaseOrder> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
