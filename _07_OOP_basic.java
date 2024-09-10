/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducpv
 */
class OOPbasic {

    public int n;

    /*
     * constructor:
     * className([parameterList]) {}
     */
    OOPbasic(int n) {
        this.n = n;
    }

    // copy constructor
    OOPbasic(OOPbasic other) {
        // copy smth of other obj
        this.n = other.n;
    }

    /*
     * Access Modifiers:
     * - public: erverywhere in the application
     * - protected: same package, subclass(inside or outside the package)
     * - private: same class
     * - default: within the package
     * | public | protected | default | private
     * same class | yes | yes | yes | yes
     * ----------------------------------------------------
     * same package| yes | yes | yes | no
     * subclass | | | |
     * ----------------------------------------------------
     * same package| yes | yes | yes | no
     * non-subclass| | | |
     * ----------------------------------------------------
     * different | | | |
     * pagkage | yes | yes | no | no
     * subclass | | | |
     * ----------------------------------------------------
     * different | | | |
     * pagkage | yes | no | no | no
     * non-subclass| | | |
     */
    public void publicHelloWorld() { // public
        System.out.println("(public) Hello world!");
    }

    protected void protectedHelloWorld() { // protected
        System.out.println("(protected) Hello world!");
    }

    private void privateHelloWorld() { // private
        System.out.println("(private) Hello world!");
    }

    void defaultHelloWorld() { // default
        System.out.println("(default) Hello world!");
    }

    void callPrivateHelloWorld() {
        privateHelloWorld();
    }
}

public class _07_OOP_basic {

    public static void main(String[] args) {
        /*
         * (obj1, obj2...) + |behaviors = class
         * |properties
         * objects share common
         */
        // syntax to create a new class:
        OOPbasic obj = new OOPbasic(5);
        // className object = new className()
        // syntax 2:
        // OOPbasic obj2 = (OOPbasic) Class.forName("OOPbasic").newInstance();

        // class member: obj.member
        obj.publicHelloWorld();
        obj.protectedHelloWorld();
        obj.defaultHelloWorld();
        // obj.privateHelloWorld(); // error: accessing private member
        obj.callPrivateHelloWorld();

        // copy an existing object:
        OOPbasic refObj = obj;
        // refObj is not a copy of obj, it's obj
        refObj.n = 50; // => obj.n become to 50
        System.out.println(refObj.n + " " + obj.n); // 50 50

        // using copy constructor
        OOPbasic copyObj = new OOPbasic(obj); // deep copy
        copyObj.n = 100; // obj.n = 50
        System.out.println(copyObj.n + " " + obj.n); // 100 50
    }
}
