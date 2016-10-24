import java.util.Objects;

class automata {
    static boolean afdUno(String cadena) {
        boolean isValid = false;
        int status = 0;
        if (Objects.equals(cadena, ""))
            isValid = true;
        for (int i = 0; i < cadena.length(); i++) {
            Character c = cadena.charAt(i);
            if (status == 0) {
                if (c == 'a')
                    isValid = true;
                else {
                    status = 1;
                }
            } else {
                isValid = false;
            }
        }
        return isValid;
    }

    static boolean afdDos(String cadena){
        boolean isValid;
        int status = 0;
        for (int i = 0; i < cadena.length(); i++) {
            Character c = cadena.charAt(i);
            if (status == 0) {
                if (c == 'a') {
                    status = 1;
                }
            }
            else if (status == 1){
                if (c != 'a'){
                    status = 2;
                }
            }
        }
        isValid = status == 1;
        return isValid;
    }

    static boolean afdTres(String cadena){
        int status = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (status == 0) {
                if (c != 'a' && c != 'b' && c != 'c') {
                    status = -1;
                } else {
                    if (cadena.charAt(0) == 'c')
                        status = -1;
                    else if (c == 'c'){
                        status = 1;
                    }
                }
            }
            else if (status == 1 && i < cadena.length())
                status = 2;
        }
        return status == 1;
    }
}
