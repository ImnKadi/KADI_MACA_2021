package TD2.Components;

import java.util.List;

public interface Composite<T>{

    List<T> getChildren();
    void addChild();
    boolean removechild(T t);
    boolean removeChildren(List<T> t);

}
