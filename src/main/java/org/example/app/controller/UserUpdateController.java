package org.example.app.controller;

import org.example.app.service.UserUpdateService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.UserUpdateView;

public class UserUpdateController {
    UserUpdateService service;
    UserUpdateView view;

    public UserUpdateController(UserUpdateService service, UserUpdateView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUser() {

        String str = service.updateUser(view.getData());

        if (str.equals(Constants.DB_ABSENT_MSG)) {

            view.getOutput(str);

            System.exit(0);
        } else {

            view.getOutput(str);

            AppStarter.startApp();
        }
    }
}
