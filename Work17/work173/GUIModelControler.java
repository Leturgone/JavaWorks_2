package Work17.work173;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIModelControler {
    private GUIModelView view;
    private GUIModel model;

    public GUIModelControler(GUIModelView view, GUIModel model) {
        this.view = view;
        this.model = model;

        view.setButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setMessage("Кнопка нажата");
                view.updateLabel();
            }
        });
    }
}
