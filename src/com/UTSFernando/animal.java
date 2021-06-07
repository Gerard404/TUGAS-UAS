package com.UTSFernando;

abstract class Animal {
    abstract void makeNoise();
}
class Hippo extends Animal {
    void makeNoise() {
        System.out.println("Hrrrrr");
    }
}

class Dog extends Animal {
    void makeNoise() {
        System.out.println("Gug Gug");
    }
}


class Vet {
    public void giveShot(Animal a) {
        a.makeNoise();
    }
}

class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}

