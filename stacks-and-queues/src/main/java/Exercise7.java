import java.util.LinkedList;

public class Exercise7 {

    public abstract static class Animal {
        private int order;
        protected String name;

        public Animal(String n) {
            name = n;
        }

        public void setOrder(int ord) {
            order = ord;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }

        public boolean isOlderThan(Animal a) {
            return this.order < a.getOrder();
        }
    }

    public static class AnimalShelterQueue {
        LinkedList<Dog> dogs = new LinkedList<Dog>();
        LinkedList<Cat> cats = new LinkedList<Cat>();
        private int order = 0; // acts as timestamp;

        public void enqueue(Animal a) {
            /* Order is used as a sort of timestamp, so that we can
            * compare the insertion order of a dog to a cat. */
            a.setOrder(order);
            order++;

            if (a instanceof Dog) dogs.addLast((Dog) a);
            else if (a instanceof Cat) cats.addLast((Cat) a);
        }

        public Animal dequeueAny() {
            /* Look at tops of dog and cat queues, and pop the stack
            * with the oldest value */
            if (dogs.size() == 0) {
                return dequeueCats();
            } else if (cats.size() == 0) {
                return dequeueDogs();
            }

            Dog dog = dogs.peek();
            Cat cat = cats.peek();

            if (dog.isOlderThan(cat)) {
                return dequeueDogs();
            } else {
                return dequeueCats();
            }
        }

        public Dog dequeueDogs() {
            return dogs.poll();
        }

        public Cat dequeueCats() {
            return cats.poll();
        }
    }

    public static class Dog extends Animal {
        public Dog(String n) {
            super(n);
        }
    }

    public static class Cat extends Animal {
        public Cat(String n) {
            super (n);
        }
    }

}
