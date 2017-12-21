package ru.rgs.APITests.Logic;

public class Application {

    private HttpHelper httpHelper;

    public Application(){
        httpHelper = new HttpHelper(this);
    }

    public HttpHelper httpHelp() {
        return httpHelper;
    }
}
