package utils.swing;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Validator {
    private JTextField txt;
    public Validator(JTextField txt) { this.txt = txt; }
    private boolean error(String mensaje){
        JOptionPane.showMessageDialog(txt, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        txt.selectAll();
        txt.requestFocus();
        return false;
    }
    
    public boolean length(int length){
        if(txt.getText().length() == length) return true;
        return error("Debe tener " + length + " caracteres.");
    }
    
    public boolean length (int min, int max){
        if (txt.getText().length() >= min && txt.getText().length() <= max) {
            return true;
        }
        return error("Debe tener entre " + min + " y " + max + " caracteres.");
    }
    
    public boolean isInteger(){
        try {
            Integer.parseInt(txt.getText());
            return true;
        } catch (Exception e) {
            return error("Debe ser un número entero.");
        }
    }
    
    public boolean isInteger(int min, int max){
        if(!isInteger()) return isInteger();
        int nro = Integer.parseInt(txt.getText());
        if (nro >= min && nro <= max) return true;
        return error("Debe ser un número entero entre " + min + " y " + max);
    }
    
    public boolean isValidDate(){
        int numAnio, numMes, numDia;
        String fecha = txt.getText();
        String anio = fecha.substring(6);
        String mes = fecha.substring(3,4);
        String dia = fecha.substring(0,1);
        try {
            numAnio = Integer.parseInt(anio);
            numMes = Integer.parseInt(mes);
            numDia = Integer.parseInt(dia);
        } catch (Exception e) {
            return error("El formato debe ser AAAA-MM-DD");
        }
        if (numAnio >= 1800 && numAnio <= 2100
                && numMes >= 1 && numMes <= 12
                && numDia >= 1 && numDia <= 31) return true;
        return error("El formato debe ser AAAA-MM-DD");    
    }
    
}
