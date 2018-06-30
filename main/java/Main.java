import com.sun.jna.Native;

public class Main {
    private static final String PATH_TO_LIB = "/Users/glebkalinin/IdeaProjects/labX/src/main/resources/libF90Dyn.dylib";

    interface F95Test extends com.sun.jna.Library {
        F95Test lib = (F95Test) Native.loadLibrary(PATH_TO_LIB, F95Test.class);

        void fooprime(int num_primes);
    }

    public static void main(String[] args) {
        F95Test.lib.fooprime(Integer.parseInt(args[0]));
    }
}
