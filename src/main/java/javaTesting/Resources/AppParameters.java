package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "80";

    //public static final Object DB_CON = new ClaseConexioBD();
    //public static Object MESSAGES TRANSLATIONS:

    // Implementar SINGLETON PATTERN
    private static AppParameters instance;
    private AppParameters(){
    }

    private void initApp(){
        // codi necessari per la inicialitzacio de l'app
    }

    public void resetApp(){
        // codi per reconfigurar l'App
    }
    public static AppParameters getInstance(){
        if (instance == null)
            instance = new AppParameters();
        return instance;
    }

    public static String getURL() {
        return "https://" + DOMAIN + ":" + PORT;
    }

}
