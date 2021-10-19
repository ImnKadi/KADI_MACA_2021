package TD2.Components;

import java.util.Objects;

public abstract class ComposantImpl implements Composant{

    private Owner owner;
    private String name;

   public ComposantImpl(String name, Owner owner){
       this.name = name;
       this.owner = owner;
   }

   public String getName(){
       return this.name;
   }
  public Owner getOwner(){
       return this.owner;
  }
   public void setOwner(Owner owner, boolean recursive){
       this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposantImpl composant = (ComposantImpl) o;
        return Objects.equals(owner, composant.owner) && Objects.equals(name, composant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, name);
    }
}
