//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Задача 1
    System.out.println("\t\nЗадача №1\n");
    int[] intArray = new int[3];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;

    double[] doubleArray = {1.57, 7.654, 9.986};

    int[] arbitraryArray = {10, 20, 30, 40, 50};

    // Задача 2
    System.out.println("\t\nЗадача №2\n");
    printArray(intArray);
    printArray(doubleArray);
    printArray(arbitraryArray);

    // Задача 3
    System.out.println("\t\nЗадача №3\n");
    printArrayReverse(intArray);
    printArrayReverse(doubleArray);
    printArrayReverse(arbitraryArray);

    // Задача 4
    System.out.println("\t\nЗадача №4\n");
    for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] % 2 != 0) {
            intArray[i] += 1;
        }
    }
    System.out.println(Arrays.toString(intArray));
}

public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();
}

public static void printArray(double[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();
}

public static void printArrayReverse(int[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i]);
        if (i > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
}

public static void printArrayReverse(double[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i]);
        if (i > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
}