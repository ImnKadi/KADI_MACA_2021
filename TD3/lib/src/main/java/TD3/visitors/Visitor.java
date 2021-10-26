package TD3.visitors;

public interface Visitor extends AbstractVisitor{

    public void visit(GroupeClient gc);
    public void visit(Client c);
    public void visit(Commande cm);
    public void visit(Ligne l);
}
