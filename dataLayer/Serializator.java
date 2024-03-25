package dataLayer;

import businessLayer.MenuItem;
import models.User;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Serializator {
    public void  serializare(String name, HashSet<User> users)
    {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(users);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


    public HashSet<User> deserializare(String name) throws IOException, ClassNotFoundException {

            FileInputStream fileIn = new FileInputStream(name);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            HashSet < User> users = (HashSet<User>) in.readObject();
            in.close();
            fileIn.close();
            return users;

    }


    public void serializareMeniu(String name, HashSet<MenuItem> meniu)
    {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(name);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(meniu);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


    public HashSet<MenuItem> deserializareMeniu(String name) throws IOException, ClassNotFoundException {

        FileInputStream fileIn = new FileInputStream(name);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        HashSet < MenuItem> meniu = (HashSet<MenuItem>) in.readObject();
        in.close();
        fileIn.close();

        return meniu;
    }


}
