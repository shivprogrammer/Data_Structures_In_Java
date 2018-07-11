package javadatastructures;

public class BasicStack<X> { // <X> is saying that we can type this class to anything generically right now but specifically later on.
    private X [] data; // Keep scope private so outside classes don't use the underlying data structure directly. Since we don't want it used we don't add any getters or setters to it.
    
    public BasicStack() {
        data = (X[]) new Object[1000];
    }
}
