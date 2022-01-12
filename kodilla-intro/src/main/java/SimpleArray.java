public class SimpleArray {
        public static void main(String[] args) {
            String[] names = new String[] {"Maciek", "Jarek", "Oskar", "Anna","Karolina"};
            String name = names [2];
            System.out.println(name);
            int numberOfElements = names.length;
            System.out.println("Moja tabliaca ma");
            System.out.println(numberOfElements);
            System.out.println("elementów");
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }

        }
    }
