public class WorkControl {

    public static void main(String args[]) {

        /**
         * Insert client description, him name, what store and him request detailed.
         */

        Client client = new Client();

        client.setName("Pedro");
        System.out.println("Name: " + client.getName());

        client.setStore("Rock Jeans");
        System.out.println("Store: " + client.getStore());

        client.setRequest("Shorts jeans");
        System.out.println("Request: " + client.getRequest());

        /**
         * Insert Type of washing, and the batch number to identity him product.
         */

        WashingType washing = new WashingType();

        washing.setWashingName("Omega");
        System.out.println("Washing name: " + washing.getWashingName());

        washing.setNumBatch(10001);
        System.out.println("Batch number: " + washing.getNumBatch());

    }
}
