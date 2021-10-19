package TD2.Components;

public final class FSFactory {

    public static final FSFactory INSTANCE = new FSFactory();



    public static FSFactory getInstance(){
        return INSTANCE;
    }

    /*public Composant createComposant(ComposantType type, String name, Owner owner) {
    }
    */


}
