public class Product {
        private String name;
        private int price;
        private String producer;

        public Product (String name, int price, String producer) {
            this.name = name;
            this.price = price;
            this.producer = producer;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public String getProducer() {
            return producer;
        }

        @Override
        public String toString() {
            return "Товар:" + "\n"+
                    "название: "+ name + "\n" +
                    "цена: " + price + "\n" +
                    "производитель: " + producer;
        }
}
