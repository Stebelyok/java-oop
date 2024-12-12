public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double getScalarProduct(Vector vector) {
        return vector.x * x + vector.y * y + vector.z * z;
    }

    public double getCos(Vector vector) {
        return getScalarProduct(vector) / (getLength() * vector.getLength());
    }

    public Vector getSum(Vector vector) {
        return new Vector(
            x + vector.x,
            y + vector.y,
            z + vector.z
        );
    }

    public Vector getDiff(Vector vector) {
        return new Vector(
            x + vector.x,
            y + vector.y,
            z + vector.z
        );
    }

    public static Vector[] getVectors(int n) {
        Vector[] vectors = new Vector[n];
        
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return vectors;
    }

    public String getVectorInfo() {
        return  "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}