package entities;
import enums.Pie;
import enums.Posicion;
public class Stat {
    private int jugador_id;
    private Posicion posicion;
    private Pie pie;
    private int altura;
    private int peso;
    private int ataque;
    private int defensa;
    private int pases;
    private int velocidad;
    private int tiro;
    private int valoracion;
    private int potencial;

    public Stat() {
    }

    public Stat(int jugador_id, Posicion posicion, Pie pie, int altura, int peso, int ataque, int defensa, int pases, int velocidad, int tiro, int valoracion, int potencial) {
        this.jugador_id = jugador_id;
        this.posicion = posicion;
        this.pie = pie;
        this.altura = altura;
        this.peso = peso;
        this.ataque = ataque;
        this.defensa = defensa;
        this.pases = pases;
        this.velocidad = velocidad;
        this.tiro = tiro;
        this.valoracion = valoracion;
        this.potencial = potencial;
    }

    public Stat(Posicion posicion, Pie pie, int altura, int peso, int ataque, int defensa, int pases, int velocidad, int tiro, int valoracion, int potencial) {
        this.posicion = posicion;
        this.pie = pie;
        this.altura = altura;
        this.peso = peso;
        this.ataque = ataque;
        this.defensa = defensa;
        this.pases = pases;
        this.velocidad = velocidad;
        this.tiro = tiro;
        this.valoracion = valoracion;
        this.potencial = potencial;
    }

    @Override
    public String toString() {
        return "Stat{" + "jugador_id=" + jugador_id + ", posicion=" + posicion + ", pie=" + pie + ", altura=" + altura + ", peso=" + peso + ", ataque=" + ataque + ", defensa=" + defensa + ", pases=" + pases + ", velocidad=" + velocidad + ", tiro=" + tiro + ", valoracion=" + valoracion + ", potencial=" + potencial + '}';
    }

    public int getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(int jugador_id) {
        this.jugador_id = jugador_id;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Pie getPie() {
        return pie;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getTiro() {
        return tiro;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getPotencial() {
        return potencial;
    }

    public void setPotencial(int potencial) {
        this.potencial = potencial;
    }
    
}
