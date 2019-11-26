public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(x == y || x != y && x + 2 == y || y + 2 == x);
        System.out.println((x * 9 == y * 7 - 4) || (x * 9 != y * 7 - 4 && x + y == 12) || (x - y == 12));
        System.out.println(((7 % x) != (y % x)) || (18 % (Math.sqrt(((Math.pow(5,2)) + (y * 3) + 3))) == Math.sqrt(16)));

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((z - x > 0 || x - z > 0) && (x - y == z || x + y == z));
        System.out.println(Math.sqrt(25) * y == (Math.pow(5,3) - (Math.sqrt(625))) && (y * (Math.sqrt(225)) == Math.pow(5,4) - 325));
        System.out.println(((z + y) % (z + x)) == Math.sqrt(100) || (z - y) == (24 % 7) && (Math.sqrt(25) % 6 == 1));

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println(b == b || b != b);
        System.out.println((18 % 5 == 3) == a || ((18 % 5 == 3) != a));
        System.out.println(((5 * 7) % (Math.sqrt(4)) == 3) == a || ((42 / 7) % 4 != 2) == b);


        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);
        System.out.println((((6 % 4) == (28 / 4)) == a) && (((7 * 4) == (Math.sqrt(49))) == b));
        System.out.println(((Math.pow(5,2) % 6) != (6 / 6) == b) && ((((6 * 4) == (72 / 3)) == a) == b));


        //Question 5
        a = true;
        b = false;
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
        System.out.println((Math.abs(-8 * 4) == 32) || (((8 / 4) == (34 - 2)) == b));
        System.out.println(((((Math.pow(8,2) % 5) == (Math.sqrt(16))) == a) && ((((Math.pow(7,3) / 7) == (49 * 3)) == b) == a)));
    }
}

