package main.compileError;

import java.util.*;

public class CompileErrors {
    private static HashMap<Integer, ArrayList<String>> errors = new HashMap<>();;
    
    public static boolean hasErrors() {
        return !errors.isEmpty();
    }
    
    public static void addError(Integer line, String errorMessage) {
        ArrayList<String> lineErrors;
        if (errors.containsKey(line)) {
            lineErrors = errors.get(line);
        } else {
            lineErrors = new ArrayList<String>();
        }
        lineErrors.add(errorMessage);
        errors.put(line, lineErrors);
    }

    

    public static void printErrors() {
        SortedSet<Integer> lines = new TreeSet<>(errors.keySet());
        for (Integer line : lines) {
            ArrayList<String> lineErrors = errors.get(line);
            // Collections.sort(lineErrors, new ErrorSorter());
            for (String errorMessage : lineErrors) {
                System.out.println("Line:" + line + ":" + errorMessage);
            }
        }
    }
}