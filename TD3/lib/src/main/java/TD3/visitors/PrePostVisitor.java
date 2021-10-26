package TD3.visitors;

public interface PrePostVisitor extends AbstractVisitor {

    public void preVisit(GroupeClient gc);
    public void preVisit(Client c);
    public void preVisit(Commande cm);
    public void preVisit(Ligne l);
    public void postVisit(Client c);
    public void postVisit(Commande cm);
    public void postVisit(Ligne l);




}
