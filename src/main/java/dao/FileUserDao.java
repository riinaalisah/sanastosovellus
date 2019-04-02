package dao;

import domain.User;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileUserDao implements UserDao {

    private List<User> users;
    private String file;

    public FileUserDao(String file) throws Exception {
        users = new ArrayList<>();
        this.file = file;
        try {
            Scanner sc = new Scanner(new File(file));
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(";");
                User user = new User(parts[0], parts[1]);
                users.add(user);
            }
        } catch (Exception e) {
            FileWriter fw = new FileWriter(new File(file));
            fw.close();
        }
    }

    private void save() throws Exception {
        try (FileWriter fw = new FileWriter(new File(file))) {
            for (User user : users) {
                fw.write(user.getUsername() + ";" + user.getPassword() + "\n");
            }
        }
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User findByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername()
                .equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User create(User user) throws Exception {
        users.add(user);
        save();
        return user;
    }

}
