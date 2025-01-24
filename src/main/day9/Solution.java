package main.day9;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/+");
        List<String> pathParts = new ArrayList<>();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!pathParts.isEmpty()) {
                    pathParts.remove(pathParts.size() - 1);
                }
            } else {
                pathParts.add(part);
            }
        }
        return "/" + String.join("/", pathParts);
    }
}
