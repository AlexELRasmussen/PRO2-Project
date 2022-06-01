package navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private ArrayList<NavigationComponent> children = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public void addChild(NavigationComponent navigationComponent) {
        children.add(navigationComponent);
    }

    @Override
    public ArrayList<NavigationComponent> getChildren() {
        return new ArrayList<>(children);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (NavigationComponent child : children) {
            System.out.print(" ");
            child.print();
        }
    }
}
