package org.vaadin.jeanchristophe.jquery;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("trumbowyg")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "trumbowyg", version = "2.21.0")
@JsModule("./src/trumbowyg-connector.js")
@CssImport("trumbowyg/dist/ui/trumbowyg.css")
public class TrumbowygResourceView extends VerticalLayout {

    public TrumbowygResourceView() {
        Div div = new Div();
        add(div);

        div.addAttachListener(event -> {
            event.getUI().getPage().executeJs(
                    "initTrumbowyg($0);", div.getElement());
        });


    }
}
