import java.io.PrintStream;

public class DragonSlaveQuest implements Quest {
    private PrintStream stream;

    DragonSlaveQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Dragon Slave Quest was embarked!");
    }
}
