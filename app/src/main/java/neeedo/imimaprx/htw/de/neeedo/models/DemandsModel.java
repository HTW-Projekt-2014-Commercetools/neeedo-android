package neeedo.imimaprx.htw.de.neeedo.models;


import java.util.ArrayList;

import neeedo.imimaprx.htw.de.neeedo.entities.Demand;
import neeedo.imimaprx.htw.de.neeedo.entities.Demands;
import neeedo.imimaprx.htw.de.neeedo.entities.SingleDemand;

public class DemandsModel {

    private Demands demands;
    private SingleDemand singleDemand;
    private Demand postDemand;

    public static DemandsModel getInstance() {
        if (demandsModel == null)
            demandsModel = new DemandsModel();
        return demandsModel;
    }

    private DemandsModel() {
    }

    private static DemandsModel demandsModel;

    public Demands getDemands() {
        if(demands == null){
            demands = new Demands();
            demands.setDemands(new ArrayList<Demand>());
        }
        return demands;
    }

    public void setDemands(Demands demands) {
        this.demands = demands;
    }

    public SingleDemand getSingleDemand() {
        return singleDemand;
    }

    public void setSingleDemand(SingleDemand singleDemand) {
        this.singleDemand = singleDemand;
    }

    public Demand getPostDemand() {
        return postDemand;
    }

    public void setPostDemand(Demand postDemand) {
        this.postDemand = postDemand;
    }
}
