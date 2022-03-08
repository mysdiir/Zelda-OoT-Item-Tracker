import controller.MergeController;
import view.GUI;

public class Application extends GUI {
    public static void main(String[] args) {

        MergeController mainController = new MergeController();

        mainController.setMergedFunctions();

    }
}
