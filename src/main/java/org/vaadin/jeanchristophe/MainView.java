package org.vaadin.jeanchristophe;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import org.vaadin.jeanchristophe.external.ExternalResourceView;
import org.vaadin.jeanchristophe.global.WindowResourceView;
import org.vaadin.jeanchristophe.local.Local2View;
import org.vaadin.jeanchristophe.local.LocalView;

@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        RouterLink linkExternal = new RouterLink("external", ExternalResourceView.class);
        RouterLink linkGlobal = new RouterLink("global", WindowResourceView.class);
        RouterLink linkLocal1 = new RouterLink("local1", LocalView.class);
        RouterLink linkLocal2 = new RouterLink("local2", Local2View.class);

        add(linkExternal, linkGlobal, linkLocal1, linkLocal2);
    }
}
