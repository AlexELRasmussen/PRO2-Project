import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import queue.Queue;
import snacks.Limb;
import snacks.Pez;
import snackssupply.SnackBar;
import snackssupply.SnackFactory;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class SnackBarFactoryTest {

    @Test
    @Order(1)
    void test_can_sort_snacks()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        Limb limb1 = new Limb(Limb.Types.Finger);
        limb1.setWeight(20);
        Limb limb2 = new Limb(Limb.Types.Foot);
        limb2.setWeight(40);
        Limb limb3 = new Limb(Limb.Types.Hand);
        limb3.setWeight(30);
        Limb limb4 = new Limb(Limb.Types.Heel);
        Limb limb5 = new Limb(Limb.Types.Knee);
        Limb limb6 = new Limb(Limb.Types.Toe);

        Limb[] limbs = {limb1, limb2, limb3};
        SnackBar<Limb> snackBar = new SnackBar<>();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        ArrayList<Limb> limblist = snackBar.sortSnacks(limbs);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------
        assertEquals(limb1, limblist.get(0));
        assertEquals(limb3, limblist.get(1));
        assertEquals(limb2, limblist.get(2));

    }

    @Test
    @Order(2)
    void test_queue_returnsSize() {
        // --------------------------------------------------
        // Arrange
        // --------------------------------------------------
        Pez[] pez = new Pez[10];
        SnackFactory snackFactory = new SnackFactory();

        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------
        snackFactory.getNewSnacks(pez);
        for (Pez p : pez) {
            assertNotNull(p);
        }
    }
}
