package org.vaadin.jeanchristophe.global;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("global")
@NpmPackage(value = "tooltip.js", version = "1.3.3")
@JsModule("./src/tooltip-loader.js")
@CssImport("./styles/tooltip.css")
public class WindowResourceView extends VerticalLayout {

    public WindowResourceView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        button.setId("hello-world");
        button.getElement().setAttribute("data-tooltip", "My tooltip");
        add(button);

        UI.getCurrent().getPage().executeJs(" var referenceElement = document.getElementById(\"hello-world\");\n" +
                "    /* 2/3. Create a new Tooltip.js instance */\n" +
                "    var instance = new TooltipGlobal(referenceElement, {\n" +
                "      title: referenceElement.getAttribute('data-tooltip'),\n" +
                "      trigger: \"hover\",\n" +
                "      placement: \"top\",\n" +
                "      /* more option her */\n" +
                "      /* #list of options: */\n" +
                "      /* https://popper.js.org/tooltip-documentation.html#new_Tooltip_new*/\n" +
                "    });");
    }
}
