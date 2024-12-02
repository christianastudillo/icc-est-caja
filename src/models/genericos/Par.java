package models.genericos;

public class Par<K, V> {
    private K clave;
    private V valor;

    // Constructor
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    // Métodos para obtener clave y valor
    public K obtenerClave() {
        return clave;
    }

    public V obtenerValor() {
        return valor;
    }

    // Métodos para establecer clave y valor
    public void establecerClave(K clave) {
        this.clave = clave;
    }

    public void establecerValor(V valor) {
        this.valor = valor;
    }
}
