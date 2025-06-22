package org.dipali.patterns.creational.Builder;

public class Pizza {
        private final String base;
        private final String size;
        private final boolean cheese;
        private final boolean mushrooms;
        private final boolean pepperoni;

        // Private constructor used only by builder
        public Pizza(PizzaBuilder builder) {
            this.base = builder.getBase();
            this.size = builder.getSize();
            this.cheese = builder.hasCheese();
            this.mushrooms = builder.hasMushrooms();
            this.pepperoni = builder.hasPepperoni();
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "base='" + base + '\'' +
                    ", size='" + size + '\'' +
                    ", cheese=" + cheese +
                    ", mushrooms=" + mushrooms +
                    ", pepperoni=" + pepperoni +
                    '}';
        }
}
