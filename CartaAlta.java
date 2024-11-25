package CartaAlta;
import java.util.Random;

public class CartaAlta {
    public static void main(String[] args) {
        String[] cartas = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };

        Random random = new Random();

        String cartaJugador1 = cartas[random.nextInt(cartas.length)];
        String cartaJugador2 = cartas[random.nextInt(cartas.length)];

        System.out.println("Jugador 1 ha sacado: " + cartaJugador1);
        System.out.println("Jugador 2 ha sacado: " + cartaJugador2);

        int valorCartaJugador1 = obtenerValorCarta(cartaJugador1);
        int valorCartaJugador2 = obtenerValorCarta(cartaJugador2);

        if (valorCartaJugador1 > valorCartaJugador2) {
            System.out.println("Jugador 1 gana!");
        } else if (valorCartaJugador2 > valorCartaJugador1) {
            System.out.println("Jugador 2 gana!");
        } else {
            System.out.println("Empate!");
        }
    }

    private static int obtenerValorCarta(String carta) {
        switch (carta) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return 0;
        }
    }
}