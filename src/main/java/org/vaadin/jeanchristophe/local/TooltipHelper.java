package org.vaadin.jeanchristophe.local;

import com.vaadin.flow.component.Component;

public class TooltipHelper {

    public static void addTooltip(Component component, String description) {
        component.getElement().executeJs(
                "initTooltip($0, $1)",
                component.getElement(),
                description);
    }
}
