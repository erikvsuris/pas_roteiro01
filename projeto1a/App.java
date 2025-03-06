public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n#### System Properties ####\n");
        String version = System.getProperty("java.version");
        System.out.println(">> Running Java Version "+version+"\n");
        String osArch = System.getProperty("os.arch");
        System.out.println(">> Operating System Architecture "+version+"\n");
        String osName = System.getProperty("os.name");
        System.out.println(">> Operating System Name "+version+"\n");
        String osVersion = System.getProperty("os.version");
        System.out.println(">> Operating System Version "+version+"\n");
        String userDir = System.getProperty("user.home");
        System.out.println(">> User Home Directory "+version+"\n");
    }
}
