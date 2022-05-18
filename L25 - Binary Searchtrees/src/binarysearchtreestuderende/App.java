package binarysearchtreestuderende;

public class App {
    /**
     * Opgave 1
     * I den første opgave i opgavesættet, arbejdede vi sammen i bordgruppen
     * Vi tegnede de 3 træer på papir, hvorfor jeg har vedlagt 3 billeder, der viser hver sin del af opgaven.
     *
     * I opgave 1.1 tilføjede vi tallene til træet i den givne rækkefølge, hvilket ikke gav et særligt balanceret træ
     * - Se billede "Opgave 1.1"
     *
     * I opgave 1.2 forsøgte vi at tilføje tallene i den bedst mulige rækkefølge for at skabe et balanceret træ. Da der
     * er 10 elementer i dette tilfælde, er det ikke muligt at lave et perfekt balanceret træ, men vi formåede at komme så tæt på
     * som muligt. - Se billed "Opgave 1.2"
     *
     * I sidste del af opgave 1, skulle vi forsøge at lave så højt et træ som muligt. Vi valgte at starte med det højeste tal
     * og derefter tilføjge det tal der nu var det højeste. Dette skaber effektivt bare en form for linked list, i stedet for et træ.
     * Altså kan vi konkludere at alle linked lister er træer, men ikke alle træer er linked lister.
     * - Se billed "Opgave 1.3"
     */

    /**
     * Opgave 2 main metoden
     */
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(45);
        tree.add(22);
        tree.add(11);
        tree.add(15);
        tree.add(30);
        tree.add(25);
        tree.add(77);
        tree.add(90);
        tree.add(88);

        tree.print();

        System.out.println(tree.findMax());
        System.out.println();
        System.out.println(tree.findMin());
        System.out.println(tree.removeMin());
        tree.print();
        System.out.println(tree.removeMax());
        tree.print();

    }
}
