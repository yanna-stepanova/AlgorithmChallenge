package main.day9;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        // Используем стек для обработки директорий
        Stack<String> stack = new Stack<>();

        // Разделяем путь по "/"
        String[] components = path.split("/");

        for (String component : components) {
            // Если компонент - это "..", переходим на уровень выше
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                // Если компонент не "." или пуст, добавляем его в стек
                stack.push(component);
            }
        }

        // Формируем нормализованный путь из стека
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println("Example 1:");
        System.out.println("Input: path = \"//home/\"");
        System.out.println("Output: " + simplifyPath("/home/"));

        System.out.println("\nExample 2:");
        System.out.println("Input: path = \"/home//foo/\"");
        System.out.println("Output: " + simplifyPath("/home//foo/"));

        System.out.println("\nExample 3:");
        System.out.println("Input: path = \"/home/user/Documents/../Pictures\"");
        System.out.println("Output: " + simplifyPath("/home/user/Documents/../Pictures"));

        System.out.println("\nExample 4:");
        System.out.println("Input: path = \"/../\"");
        System.out.println("Output: " + simplifyPath("/../"));
    }
}
