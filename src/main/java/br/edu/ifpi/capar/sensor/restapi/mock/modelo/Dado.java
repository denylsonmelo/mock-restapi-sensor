package br.edu.ifpi.capar.sensor.restapi.mock.modelo;

import com.google.gson.Gson;

/**
 *
 * @author Denylson Melo
 */
public class Dado {

    private final double temperatura;
    private final double volume;
    private final double pressao;
    
    public String toJson() {
        return new Gson().toJson(this);
    }

    public Dado(double temperatura, double volume, double pressao) {
        this.temperatura = temperatura;
        this.volume = volume;
        this.pressao = pressao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getVolume() {
        return volume;
    }

    public double getPressao() {
        return pressao;
    }
}
