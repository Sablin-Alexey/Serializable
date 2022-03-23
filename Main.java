import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        GameProgress gameProgress1 = new GameProgress(94, 55, 55, 77);
        GameProgress gameProgress2 = new GameProgress(55, 70, 56, 100);
        GameProgress gameProgress3 = new GameProgress(5, 1, 70, 100500);

        gameProgress1.saveGame("D://Games/savegames/save1.dat", gameProgress1);
        gameProgress2.saveGame("D://Games/savegames/save2.dat", gameProgress2);
        gameProgress3.saveGame("D://Games/savegames/save3.dat", gameProgress3);


        gameProgress1.zipFiles("D://Games/savegames/save.zip", "D://Games/savegames/save1.dat");
        gameProgress2.zipFiles("D://Games/savegames/save.zip", "D://Games/savegames/save2.dat");
        gameProgress3.zipFiles("D://Games/savegames/save.zip", "D://Games/savegames/save3.dat");

        gameProgress1.delleteFile("D://Games/savegames/save1.dat");
        gameProgress2.delleteFile("D://Games/savegames/save2.dat");
        gameProgress3.delleteFile("D://Games/savegames/save3.dat");







    }
}


