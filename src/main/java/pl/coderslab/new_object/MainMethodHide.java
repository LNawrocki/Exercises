package pl.coderslab.new_object;

public class MainMethodHide {
    public static void main(String[] args) {
        MethodHideParent childHM = new MethodHideChildren();
        childHM.hiddenMethod(); //nie ma polimorfizmu, metoda statyczna

        //MethodHideChildren.hiddenMethod();

        MethodHideChildren child = new MethodHideChildren();
        child.hiddenMethod(); //ukryliśmy metodę rodzica

    }
}