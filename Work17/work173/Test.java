package Work17.work173;

public class Test {
    public static void main(String[] args) {
        GUIModelView view = new GUIModelView();
        GUIModel model = new GUIModel();
        GUIModelControler controller = new GUIModelControler(view, model);
    }
}
