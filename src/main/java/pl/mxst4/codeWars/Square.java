package pl.mxst4.codeWars;

class Square {

    public static boolean isSquare(int n) {
        return Double.compare(Math.sqrt(n), (int) Math.sqrt(n)) == 0;
    }

}
