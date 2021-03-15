/*
 * Untuk mengubah header lisensi ini, pilih License Headers di Project Properties.
 * Untuk mengubah file template ini, pilih Tools | Template
 * dan buka template di editor.
 */

/**
 *
 * @author Fauzan Maulana Alfany
 */
public class TestSimpleCircle {

    /**
     * @param args argumen baris perintah
     */
    public static void main(String args[]) {
        //radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        //radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        //radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " +  circle3.getArea());
        
        //memodifikasi
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " +  circle2.radius  + " is " + circle2.getArea());
    }  
}
class SimpleCircle {
    float radius = 1;
    
    SimpleCircle() {
    }
    SimpleCircle(float newRadius) {
        radius = newRadius;
    }
    //Area kembali 
    double getArea() {
        return radius * radius * Math.PI;
    }
    //atur radius baru
    float setRadius(float newRadius) {
        return radius = newRadius;
    }

}



