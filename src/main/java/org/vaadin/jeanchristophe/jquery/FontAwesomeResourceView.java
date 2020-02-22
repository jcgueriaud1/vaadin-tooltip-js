package org.vaadin.jeanchristophe.jquery;

import com.vaadin.flow.component.Html;
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
@Route("fontawesome")
@NpmPackage(value = "@fortawesome/fontawesome-free", version = "5.12.1")
@JsModule("@fortawesome/fontawesome-free/js/fontawesome")
@JsModule("@fortawesome/fontawesome-free/js/solid")
@JsModule("@fortawesome/fontawesome-free/js/brands")
public class FontAwesomeResourceView extends VerticalLayout {

    public FontAwesomeResourceView() {
        Html html = new Html("<span><i class=\"fa fa-camera-retro fa-lg\"></i> fa-lg\n" +
                "<i class=\"fas fa-camera-retro fa-2x\"></i> fa-2x\n" +
                "<i class=\"fas fa-camera-retro fa-3x\"></i> fa-3x\n" +
                "<i class=\"fas fa-camera-retro fa-4x\"></i> fa-4x\n" +
                "<i class=\"fas fa-camera-retro fa-5x\"></i></span>");
        add(html);
        Html htmlb = new Html("<span><i class=\"fab fa-font-awesome fa-lg\"></i> fa-lg\n" +
                "<i class=\"fab fa-font-awesome fa-2x\"></i> fa-2x\n" +
                "<i class=\"fab fa-font-awesome fa-3x\"></i> fa-3x\n" +
                "<i class=\"fab fa-font-awesome fa-4x\"></i> fa-4x\n" +
                "<i class=\"fab fa-font-awesome fa-5x\"></i></span>");
        add(htmlb);
    }
}
