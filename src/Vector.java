import java.util.Arrays;
import java.util.Random;

public class Vector {

    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] CreateArrayVector(int N) {

        Vector[] arrayVector = new Vector[N];

        Random random = new Random(50);
        for (int i = 0; i < N; i++) {

            int x = random.nextInt(50);
            int y = random.nextInt(50);
            int z = random.nextInt(50);

            arrayVector[i] = new Vector(x, y, z);

        }

        return arrayVector;

    }

    public double LengthVector() {
        double lengthVector;
        lengthVector = Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
        return lengthVector;
    }

    public double ScalarProduct(Vector vector) {
        double scalarProduct;
        scalarProduct = this.x * vector.x + this.y * vector.y + this.z * vector.z;
        return scalarProduct;
    }

    public Vector VectorProduct(Vector vector) {

        double xC, yC, zC;

        xC = this.y * vector.z - this.z * vector.y;
        yC = this.z * vector.x - this.x * vector.z;
        zC = this.x * vector.y - this.y * vector.x;

        return new Vector(xC, yC, zC);

    }

    public double CosAngle(Vector vector) {
        double cosAngle;
        cosAngle = ScalarProduct(vector) / Math.abs(LengthVector()) + Math.abs(vector.LengthVector());
        return cosAngle;
    }

    public Vector SumVector(Vector vector) {

        double xN = this.x + vector.x;
        double yN = this.y + vector.y;
        double zN = this.z + vector.z;

        return new Vector(xN, yN, zN);

    }

    public Vector DifVector(Vector vector) {

        double xN = this.x - vector.x;
        double yN = this.y - vector.y;
        double zN = this.z - vector.z;

        return new Vector(xN, yN, zN);

    }

    @Override
    public String toString() {
        return "Vector {" + "x=" + this.x + ", y=" + this.y + ", z=" + this.z + "}";
    }

}

class Run {

    public static void main(String[] args) {

        int N = 2;
        Vector arrayVector[] = Vector.CreateArrayVector(N);

        for (int i = 0; i < N; i++) {
            System.out.println(i+1 + ". " + arrayVector[i]);
            System.out.println("Length vector " + i + ": " + arrayVector[i].LengthVector());
        }

        System.out.println("Scalar product V1 and V2: " + arrayVector[0].ScalarProduct(arrayVector[1]));
        System.out.println("Vector product V1 and V2: " + arrayVector[0].VectorProduct(arrayVector[1]));
        System.out.println("The cosine of the angle between V1, V2: " + arrayVector[0].CosAngle(arrayVector[1]));

        System.out.println("Sum of V1 and V2: " + arrayVector[0].SumVector(arrayVector[1]));
        System.out.println("Difference V1 and V2: " + arrayVector[0].DifVector(arrayVector[1]));

    }

}
