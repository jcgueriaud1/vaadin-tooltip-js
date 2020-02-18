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
@StyleSheet("https://cdnjs.cloudflare.com/ajax/libs/ion-rangeslider/2.3.1/css/ion.rangeSlider.min.css")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "ion-rangeslider", version = "2.3.1")
@JsModule("./src/jquery-loader.js")
@JsModule("ion-rangeslider/js/ion.rangeSlider.js")
@CssImport("./styles/ion-styles.css")
public class JqueryResourceView extends VerticalLayout {

    public JqueryResourceView() {
        Input input = new Input();
        input.setWidth("600px");
        input.setId("example_id");
        add(input);

        input.addAttachListener(event -> {
            event.getUI().getPage().executeJs(
                    "$(\"#example_id\").ionRangeSlider({" +
                    "    min: 0,\n" +
                    "    max: 10000,\n" +
                    "    from: 1000,\n" +
                    "    to: 9000,\n" +
                    "    type: 'double',\n" +
                    "    prefix: \"$\",\n" +
                    "    grid: true,\n" +
                    "    grid_num: 10});");
        });


    }
}
