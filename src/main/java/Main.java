import array.SimpleSummater;

/**
 * Main application entry point
 */
public final class Main {
    private Main() {

    }
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String[] args) {
        SimpleSummater summater = new SimpleSummater();
        final int[] array = {1, 2, 3, 4};
        System.out.println(summater.sum(array));
    }
}
