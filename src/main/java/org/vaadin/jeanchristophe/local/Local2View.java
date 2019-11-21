package org.vaadin.jeanchristophe.local;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "local2", layout = MainLayout.class)
public class Local2View extends Div {

    public Local2View() {
        Button button = new Button("My button 2");
        add(button);
        TooltipHelper.addTooltip(button, "My tooltip");
        Button button3 = new Button("My button 3");
        add(button3);
        TooltipHelper.addTooltip(button3, "My tooltip 3");
    }
}
