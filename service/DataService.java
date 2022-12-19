package service;

import data.Teacher;
import data.User;

public interface DataService {
    void create(User user);
    User read(User user);

    Teacher read(Teacher user);
}
