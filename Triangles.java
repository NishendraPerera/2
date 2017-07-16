//  *
//  * *
//  * * *
//  * * * *
//  * * * * *

class Triangle1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

//  * * * * *
//  * * * *
//  * * *
//  * *
//  *

class Triangle2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

class Triangle3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

class Triangle4 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 5 - i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

class Triangle5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 5 - i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
