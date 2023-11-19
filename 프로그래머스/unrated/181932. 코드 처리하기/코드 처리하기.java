// class Solution {
//     public String solution(String code) {
//         StringBuilder sb = new StringBuilder();
//         int mode = 0;
//         for (int i = 0; i < code.length(); i++) {
//             char current = code.charAt(i);
//             if (current == '1') {
//                 mode = mode == 0 ? 1 : 0;
//                 continue;
//             } // if

//             if (i % 2 == mode) {
//                 sb.append(current);
//             } // if
//         } // for
        
//         return sb.length() == 0 ? "EMPTY" : sb.toString();
//     } // main
// } // calss


class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";

        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                mode = 1 - mode;
            } else if (mode == 0 && idx % 2 == 0) {
                ret += code.charAt(idx);
            } else if (mode == 1 && idx % 2 == 1) {
                ret += code.charAt(idx);
            } // else-if
        } // for
        
        if (ret.equals("")) {
            return "EMPTY";
        } else {
            return ret;
        } // if-else
        
    } // main
} // class