import java.util.Objects;

class automataUno {
    static boolean afd(String cadena) {
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
}
