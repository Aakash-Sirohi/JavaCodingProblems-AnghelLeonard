package com.jcp.stringsnumbersandmath;

public class StringToIntLongFloatDouble {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "4531231231231";
    private static final String TO_FLOAT = "453.232F";
    private static final String TO_DOUBLE = "453.232323D";
    private static final String WRONG_NUMBER = "23123w";
    public static void main(String[] args) {
//        int toInt = Integer.parseInt(TO_INT);
//        long toLong = Long.parseLong(TO_LONG);
//        float toFloat = Float.parseFloat(TO_FLOAT);
//        double toDouble = Double.parseDouble(TO_DOUBLE);
        int toInt = Integer.valueOf(TO_INT);
        long toLong = Long.valueOf(TO_LONG);
        float toFloat = Float.valueOf(TO_FLOAT);
        double toDouble = Double.valueOf(TO_DOUBLE);
        System.out.println(toInt);
        System.out.println(toLong);
        System.out.println(toFloat);
        System.out.println(toDouble);

        try{
            int toInt1 = Integer.parseInt(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        //
    }

}
