package ChangeBy;

public class byReference {
    public static void main(String[] args) {

        pointer first = new pointer(5,8);
        System.out.println(first);
        move(first);
        System.out.println(first);
    }
    public static void move(pointer p){
        // if objects are passed though parameter, there are not copied as variables,
        // but their reference is forwarded, so move() method has updated the first object properties
        p.a++;
        p.b++;
        System.out.println(p);
    }

    public static class pointer{
    int a ;
    int b ;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("pointer{");
            sb.append("a=").append(a);
            sb.append(", b=").append(b);
            sb.append('}');
            return sb.toString();
        }

        public pointer(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
