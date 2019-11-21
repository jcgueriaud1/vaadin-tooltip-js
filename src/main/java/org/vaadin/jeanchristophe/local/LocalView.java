package org.vaadin.jeanchristophe.local;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "local", layout = MainLayout.class)
public class LocalView extends Div {

    public LocalView() {
        Button button = new Button("My button");
        add(button);
        TooltipHelper.addTooltip(button, "My tooltip");
    }
}
