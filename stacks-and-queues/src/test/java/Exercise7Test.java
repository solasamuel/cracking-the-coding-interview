import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {

    @Test
    public void testRandomQueue() {
        Exercise7.AnimalShelterQueue queue = new Exercise7.AnimalShelterQueue();

        queue.enqueue(new Exercise7.Dog("Jerry"));
        queue.enqueue(new Exercise7.Cat("Kate"));
        queue.enqueue(new Exercise7.Dog("Rick"));
        queue.enqueue(new Exercise7.Cat("Morty"));

        Exercise7.Animal any = queue.dequeueAny();

        Assertions.assertEquals("Jerry", any.getName());

        Exercise7.Animal dog = queue.dequeueDogs();
        Assertions.assertEquals("Rick", dog.getName());

        Exercise7.Animal cat = queue.dequeueCats();
        Assertions.assertEquals("Kate", cat.getName());

    }

}