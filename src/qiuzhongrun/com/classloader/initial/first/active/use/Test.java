package qiuzhongrun.com.classloader.initial.first.active.use;

/**
 *  first active use occasions:
 *      1. a class with main method
 *      2. a new instance of a class is created
 *         A. new(new)
 *         B. reflection
 *         C. cloning
 *         D. deserialization
 *      3. static access
 *         A field get(getstatic)
 *         B filed set(putstatic)
 *         C method invoke(invokestatic)
 *      4. the initialization of a subclass of a class
 */
public interface Test {
}
