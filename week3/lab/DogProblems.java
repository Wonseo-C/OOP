public class DogProblems {

    public static boolean isValidIndex(int dogsLength, int currentDog, int neighborDog) {
            return neighborDog >= 0 && neighborDog < dogsLength && currentDog != neighborDog;
    }

    public static boolean isBigEnoughDog(Dog[] dogs, int currentDog) {
        for (int i = currentDog - 2; i < currentDog + 2; i ++){
            if (!isValidIndex(dogs.length, currentDog, i)) {
                continue;
            }
            
            if (dogs[currentDog].weightInPounds < dogs[i].weightInPounds) {
                return false;
            }
        }
        
        return true;
    }
    
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] tempanswer = new Dog[dogs.length];

        int count = 0;
        for (int i = 0; i < dogs.length; i += 1) {

            if (isBigEnoughDog(dogs, i)) {
                // count++의 경우 line에서의 명령을 수행한 후
                // 그 variable의 주소 값을 이용하여 increase 한다.

                // ++count의 경우 increase후에 line의 명령을 수행.

                tempanswer[count++] = dogs[i];
            }
        }

        Dog[] answer = new Dog[count];
        for (int i = 0; i < count; i ++) {
            answer[i] = tempanswer[i];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[] {
            new Dog(10),
            new Dog(15),
            new Dog(20),
            new Dog(15),
            new Dog(10),
            new Dog(5),
            new Dog(10),
            new Dog(15),
            new Dog(22),
            new Dog(15),
            new Dog(20)
        };

        Dog[] bigDogs1 = largerThanFourNeighbors(dogs);

        for (int k = 0; k < bigDogs1.length; k ++) {
            System.out.print(bigDogs1[k].weightInPounds + " ");
        }

        System.out.println();
    }

    
}

// class를 할당한다는 것은 메모리를 할당한다는 것.
// 따라서 class를 할당하였을 때 (=) 두 값은 같은 메모리 주소를 가진다.

// K a = new K();
// K b;
// b = a;

// 여기서 b에 의해 a가 변한다.

// data type = byte, short, int, long, float, double, boolean, char
// reference type (pointer 개념) = class, array

// 즉 위의 예제에서 b와 a는 같은 위치의 메모리 (class K가 위치한 곳) 를 가르키기 때문에
// a와 b는 같은 class를 의미하게 된다.

// golden rule
// 1. b = a ; a copies the bits from a into b
// 2. Passing Parameters copies the bit (initial value of class)