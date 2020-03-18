package com.company;

/*

1512. The most simple code-2
See what related to constructors can be added at compilation, but is already present in this program.
Simplify the code - delete all the constructors and constructor calls of superclasses that are created and added automatically.
PS: The relationship between the objects of the classes NakedCat and NormalCat, SiamCat - Is-a (inheritance): http://en.wikipedia.org/wiki/Is-a
http://cs7002.vk.me/c7007/v7007577/1411a/_dAiEola310.jpg

Requirements:
1. The NormalCat class must be a descendant of the NakedCat class.
2. The SiamCat class must be a descendant of the NormalCat class.
3. In the NakedCat class, there should be no explicitly implemented constructors without parameters.
4. In the constructor without parameters of the NormalCat class, there should be no explicit call to the constructor of the parent class.

 */

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
//        public NakedCat() {
//            super();
//        }
    }

    public static class NormalCat extends NakedCat {
//        public NormalCat() {
//            super();
//        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
