package org.example.app.controller;

import org.example.app.service.UserDeleteService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.UserDeleteView;

public class UserDeleteController {
    UserDeleteService service;
    UserDeleteView view;

    public UserDeleteController(UserDeleteService service, UserDeleteView view) {
        this.service = service;
        this.view = view;
    }

    public void deleteUser() {

        String str = service.deleteUser(view.getData());

        if (str.equals(Constants.DB_ABSENT_MSG)) {

            view.getOutput(str);

            System.exit(0);
        } else {

            view.getOutput(str);

            AppStarter.startApp();
        }
    }
}
