package org.vaadin.jeanchristophe.local;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;

@NpmPackage(value = "tooltip.js", version = "1.3.3")
@JsModule("./src/tooltip-connector.js")
@CssImport("./styles/tooltip.css")
public class MainLayout extends Div implements RouterLayout {

}
