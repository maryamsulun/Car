public class arrays {
    public static void main(String[] args) {
        int tab[] = new int[10];
 //
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab.length - 1 - i;
        }
        System.out.println();
        for (int x : tab) {
            {
                System.out.println("arrays[" + x + "] = " + tab[x]);
            }
        }
    }
}
