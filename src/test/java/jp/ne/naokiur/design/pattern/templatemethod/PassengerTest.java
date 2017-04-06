package jp.ne.naokiur.design.pattern.templatemethod;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PassengerTest {

    @Test
    public void usingSuica() {
        assertThat(new Passenger(new Suica()).touchGate(), is("Suicaを使って、改札を通りました。"));
    }

    @Test
    public void usingPasmo() {
        assertThat(new Passenger(new Pasmo()).touchGate(), is("Pasmoを使って、改札を通りました。"));
    }

    @Test
    public void changeSuicaToPasmo() {
        Passenger passenger = new Passenger(new Suica());
        assertThat(passenger.touchGate(), is("Suicaを使って、改札を通りました。"));

        passenger.changeCard(new Pasmo());
        assertThat(passenger.touchGate(), is("Pasmoを使って、改札を通りました。"));
    }
}
