import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class GameProgress implements Serializable {

    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    public String saveGame(String path, GameProgress point) {


        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(point);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String zipFiles(String pathZip, String pathFile ){
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathZip));
             FileInputStream fis = new FileInputStream(pathFile)) {
            ZipEntry entry = new ZipEntry("packed_notes.txt");
            zout.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String delleteFile(String pathFile){
        File file = new File(pathFile);
        file.delete();

        return null;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}

