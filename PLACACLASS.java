package laboratorio;
public class PLACACLASS {
    public static String Matriculacion(String placa) {
        String ultimoDigitoS = placa.substring(placa.length() - 1);
        int ultimoDigito;
        try {
            ultimoDigito = Integer.parseInt(ultimoDigitoS);
        } catch (NumberFormatException e) {
            return "Error: La placa debe terminar con un dígito numérico";
        }
        String mesOpcional = obtenerMesOpcional(ultimoDigito);
        String mesObligatorio = obtenerMesObligatorio(ultimoDigito);
        String mesesMulta = obtenerMesesMulta(ultimoDigito);
        StringBuilder resultado = new StringBuilder();
        resultado.append("Último dígito de la placa: ").append(ultimoDigito).append("\n");
        resultado.append("Mes opcional de matrícula: ").append(mesOpcional).append("\n");
        resultado.append("Mes obligatorio de matrícula: ").append(mesObligatorio).append("\n");
        resultado.append("Mes que puede matricular con multa de $50: ").append(mesesMulta);
        return resultado.toString();
    }
    private static String obtenerMesOpcional(int digito) {
        switch (digito) {
            case 0: return "Octubre";
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            default: return "No aplica";
        }
    }
    private static String obtenerMesObligatorio(int digito) {
        switch (digito) {
            case 0: return "Noviembre";
            case 1: return "Febrero";
            case 2: return "Marzo";
            case 3: return "Abril";
            case 4: return "Mayo";
            case 5: return "Junio";
            case 6: return "Julio";
            case 7: return "Agosto";
            case 8: return "Septiembre";
            case 9: return "Octubre";
            default: return "No aplica";
        }
    }
    private static String obtenerMesesMulta(int digito) {
        switch (digito) {
            case 0: return "Noviembre y Diciembre";
            case 1: return "Marzo en adelante";
            case 2: return "Abril en adelante";
            case 3: return "Mayo en adelante";
            case 4: return "Junio en adelante";
            case 5: return "Julio en adelante";
            case 6: return "Agosto en adelante";
            case 7: return "Septiembre en adelante";
            case 8: return "Octubre en adelante";
            case 9: return "Diciembre";
            default: return "No aplica";
        }
    }
}
