public class MixerRunner {
    public static void main(String[] args) {
        Mixer.onOrOff();            // Turn ON the mixer
        
        Mixer.increaseSpeed();      // Increase speed
        Mixer.decreaseSpeed();      // Decrease speed
        
        Mixer.increaseTimer();      // Increase timer
        Mixer.decreaseTimer();      // Decrease timer
        
        Mixer.onOrOff();            // Turn OFF the mixer
    }
}
