// In com.utils module
module com.utils {
    exports com.utils;
}

// In com.greetings module
module com.greetings {
    requires com.utils;
}

// Utility class
package com.utils;
public class Util {
    public static void greet() {
        System.out.println("Hello from Utils!");
    }
}

// Greeting class
package com.greetings;
import com.utils.Util;

public class Main {
    public static void main(String[] args) {
        Util.greet();
    }
}
