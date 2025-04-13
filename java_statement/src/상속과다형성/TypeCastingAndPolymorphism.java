package 상속과다형성;

// // 부모 클래스
// class Animal {
// public void sound() {
// System.out.println("동물이 소리를 냅니다.");
// }
// }

// // 자식 클래스
// class Dog extends Animal {
// @Override
// public void sound() {
// System.out.println("강아지가 멍멍 짖습니다.");
// }

// public void wagTail() {
// System.out.println("강아지가 꼬리를 흔듭니다.");
// }
// }

// public class TypeCastingAndPolymorphism {
// public static void main(String[] args) {
// Animal animal = new Dog(); // 업캐스팅
// animal.sound(); // 다형성: 자식 클래스의 메서드 호출

// if (animal instanceof Dog) {
// Dog dog = (Dog) animal; // 다운캐스팅
// dog.wagTail();
// }
// }
// }

// 부모 클래스
class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public void sleep() {
        System.out.println("동물이 잠을 잡니다.");
    }
}

// 자식 클래스 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("강아지가 멍멍 짖습니다.");
    }

    public void wagTail() {
        System.out.println("강아지가 꼬리를 흔듭니다.");
    }
}

// 자식 클래스 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("고양이가 야옹합니다.");
    }

    public void purr() {
        System.out.println("고양이가 골골 소리를 냅니다.");
    }
}

public class TypeCastingAndPolymorphism {
    public static void main(String[] args) {
        // 업캐스팅: 자식 객체를 부모 타입으로 참조
        Animal dogAnimal = new Dog();
        Animal catAnimal = new Cat();

        // 다형성: 부모 타입으로 호출하지만, 실제 객체의 메서드가 실행됨
        dogAnimal.sound(); // Dog의 sound() 호출
        catAnimal.sound(); // Cat의 sound() 호출

        // 부모 클래스의 공통 메서드 호출
        dogAnimal.sleep();
        catAnimal.sleep();

        System.out.println();

        // 다운캐스팅: 부모 타입을 자식 타입으로 변환
        if (dogAnimal instanceof Dog) {
            Dog dog = (Dog) dogAnimal;
            dog.wagTail(); // Dog 클래스의 고유 메서드 호출
        }

        if (catAnimal instanceof Cat) {
            Cat cat = (Cat) catAnimal;
            cat.purr(); // Cat 클래스의 고유 메서드 호출
        }

        System.out.println();

        // 배열을 사용한 다형성 예제
        Animal[] animals = { new Dog(), new Cat(), new Dog() };

        for (Animal animal : animals) {
            animal.sound(); // 각 객체의 재정의된 sound() 호출

            // 다운캐스팅을 통해 고유 메서드 호출
            if (animal instanceof Dog) {
                ((Dog) animal).wagTail();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }
        }
    }
}

/*
 * 이론 설명:
 * 1. 업캐스팅(Upcasting):
 * - 자식 클래스의 객체를 부모 클래스 타입으로 변환.
 * - 부모 클래스의 참조 변수로 자식 클래스의 객체를 참조할 수 있습니다.
 * - 예: `Animal animal = new Dog();`
 * - 장점: 부모 클래스의 공통된 메서드를 호출할 수 있습니다.
 * 
 * 2. 다운캐스팅(Downcasting):
 * - 부모 클래스 타입을 자식 클래스 타입으로 변환.
 * - 반드시 `instanceof` 연산자를 사용하여 타입을 확인한 후 변환해야 합니다.
 * - 예: `if (animal instanceof Dog) { Dog dog = (Dog) animal; }`
 * 
 * 3. 다형성(Polymorphism):
 * - 동일한 부모 클래스를 상속받은 객체가 서로 다른 동작을 수행할 수 있는 특성.
 * - 메서드 재정의와 타입 변환을 통해 구현됩니다.
 * - 예: 부모 클래스의 `sound()` 메서드를 자식 클래스에서 재정의하여 각기 다른 동작을 수행.
 * 
 * 4. 배열을 사용한 다형성:
 * - 부모 클래스 타입의 배열에 자식 클래스 객체를 저장하여 반복적으로 다형성을 활용할 수 있습니다.
 * - 예: `Animal[] animals = { new Dog(), new Cat() };`
 * 
 * 5. 코드 설명:
 * - `Animal` 클래스는 공통 메서드(`sound`, `sleep`)를 정의합니다.
 * - `Dog`와 `Cat` 클래스는 `Animal`을 상속받아 `sound()`를 재정의하고, 고유 메서드(`wagTail`,
 * `purr`)를 추가합니다.
 * - 업캐스팅을 통해 부모 클래스의 메서드를 호출하고, 다운캐스팅을 통해 자식 클래스의 고유 메서드를 호출합니다.
 * - 배열을 사용하여 여러 자식 객체를 다형적으로 처리합니다.
 */
/*
 * 이론 설명:
 * 1. 업캐스팅(Upcasting):
 * - 자식 클래스의 객체를 부모 클래스 타입으로 변환.
 * - 예: `Animal animal = new Dog();`
 * 
 * 2. 다운캐스팅(Downcasting):
 * - 부모 클래스 타입을 자식 클래스 타입으로 변환.
 * - 반드시 `instanceof` 연산자를 사용하여 타입을 확인한 후 변환해야 합니다.
 * 
 * 3. 다형성(Polymorphism):
 * - 동일한 부모 클래스를 상속받은 객체가 서로 다른 동작을 수행할 수 있는 특성.
 * - 메서드 재정의와 타입 변환을 통해 구현됩니다.
 */