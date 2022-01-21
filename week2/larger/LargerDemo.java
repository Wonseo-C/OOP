public class LargerDemo {
    public static boolean larger(int a, int b) {
        return a > b;
    }

    public static boolean larger(double a, double b) {
        return a > b;
    }

    // 같은 이름의 함수라도 변수의 타입에 따라서 알아서 complie 해줌
    // 즉 같은 이름을 가지면서 변수 타입 또한 같으면 에러!
    // type에 매우 엄격한 프로그래밍 언어.

    public static void main(String[] args) {
        System.out.println(larger(1, 2));
        System.out.println(larger(0.1, 0.2));       
    }

    // 1. "javac LargerDemo.java" 를 통해 LargerDemo.class (class로 컴파일 해줌) 생성
    // Bytecode (C와 C++은 binary code - complie한 종류의 machine상에서만 돌아감) 이기 때문에 JVM (Java Virtual Machine) 에서 돌린다.
    // 즉 os가 다르거나 메모리 타입이 다르게 complie 되더라도 JVM을 거쳐 실행이 되기 때문에 문제가 없다. (확장성이 좋음)

    // 2. "java LargerDemo" 를 통해 실행

    // 3. static class의 경우 class의 정의 없이 실행이 가능하다.
    // 하지만 static이 아닌 class의 경우 class 정의를 하여 준 후 실행해야 된다.
    // ex.) x = Math.round(5.6); ... JAVA의 Math Class를 실행한 모습이다.
    // 만약 Math가 static class가 아니라면,
    // Math m = new Math();
    // x = m.round(5.6);

    // 대신 static이 아닌 경우 class의 내부 값들을 마음대로 커스텀 할 수 있다.
    // 즉 경우의 수가 많은 경우 static이 아닌 일반적인 class를 사용해 준다.

    // 또한, static을 붙여주는 변수는 메모리를 공유한다.
    // class와 같이 메모리를 공유한다는 측면에서 메모리를 효율적으로 쓸 수 있을 뿐 아니라,
    // 전체적으로 값을 공유한다는 점에 이득이 있다.
}
