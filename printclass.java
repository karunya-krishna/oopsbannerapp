public class printclass {

    public static void main(String[] args) {

        String[] lines = {
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     *",
            "*     * *     * *     * *      ",
            "*     * *     * *****   ***** ",
            "*     * *     * *            *",
            "*     * *     * *     * *     *",
            " *****   *****   *     * ***** "
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}