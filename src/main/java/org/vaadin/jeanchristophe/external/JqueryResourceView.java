package org.vaadin.jeanchristophe.external;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("jquery")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "ion-rangeslider", version = "2.3.1")
@JsModule("./src/ion-connector.js")
@JsModule("ion-rangeslider/js/ion.rangeSlider.js")
@CssImport("./styles/ion-styles.css")
@CssImport(value = "ion-rangeslider/css/ion.rangeSlider.min.css")
public class JqueryResourceView extends VerticalLayout {

    public JqueryResourceView() {
        Input input = new Input();
        input.setWidth("600px");
        input.setId("ion");
        add(input);

        input.addAttachListener(event -> {
            event.getUI().getPage().executeJs(
                    "initIon()");
        });


    }
}
