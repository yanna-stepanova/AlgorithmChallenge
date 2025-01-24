package main.day9;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String simplifyPath(String path) {
        String result = null;
        if (path.contains("//")) {
            result = path.replace("//", "/");
        }
        if (result.contains("/../")) {
            result.replace("/../", "/");
        }
        return result;
        //path.endsWith("/") ? path.substring(0, path.length() - 1) : null;
    }
}
