package eventos;

import entidad.TipoEntidad;
import java.util.ArrayList;
import java.util.List;
import javax.vecmath.Vector3f;

public class Evento implements Comparable {

    /* Target to send */
    private TipoEntidad tipoObjetivo = null;
    private List<Integer> objetivos = new ArrayList<Integer>();
    private long tiempo = 0;
    private Integer emisor = -1;

    /* Event actions */
    private String command = null;
    private ArrayList<String> params = new ArrayList<String>();

    /* Data */
    private double valor = 0.0;
    private Vector3f vector = new Vector3f();

    /* Constructor */
    // Hey, where is the constructor?

    /* Methods */
    public Evento a�adirObjetivo(Integer id) {
        objetivos.add(id);
        return this;
    }

    public Evento a�adirParametro(String p) {
        params.add(p);
        return this;
    }

    public Evento setObjetivo(Integer id) {
        emisor = id;
        return this;
    }

    public Integer getSource() {
        return emisor;
    }

    public List<Integer> getTargets() {
        return objetivos;
    }

    public Evento setTargets(List<Integer> targets) {
        this.objetivos = targets;
        return this;
    }

    public long getTiempo() {
        return tiempo;
    }

    public Evento setTiempo(long time) {
        this.tiempo = time;
        return this;
    }

    public String getCommando() {
        return command;
    }

    public Evento setCommando(String commando) {
        this.command = commando;
        return this;
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public Evento setParams(ArrayList<String> params) {
        this.params = params;
        return this;
    }

    public double getValor() {
        return valor;
    }

    public Evento setValor(double valor) {
        this.valor = valor;
        return this;
    }

    public Vector3f getVector() {
        return vector;
    }

    public Evento setVector(Vector3f vector) {
        this.vector = vector;
        return this;
    }

    @Override
    public int compareTo(Object o) {
        long oTime = ((Evento) o).getTiempo();
        if (tiempo < oTime) {
            return -1;
        } else if (tiempo == oTime) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Evento\n\t[Target type: " + tipoObjetivo + ",\n\tObjetivos: " + objetivos.toString() + ",\n\tTiempo: " + tiempo + ",\n\tComando: " + command + ",\n\tPar�metros: " + params.toString() + "]";
    }

    public Evento setTipoObjetivo(TipoEntidad tipo) {
        this.tipoObjetivo = tipo;
        return this;
    }

    public TipoEntidad getTipoObjetivo() {
        return tipoObjetivo;
    }
}