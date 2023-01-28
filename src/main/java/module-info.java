module io.vproxy.vfx {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.swing;
    requires javafx.media;
    requires java.logging;
    requires java.desktop;
    requires com.github.kwhat.jnativehook;
    requires vjson;
    requires kotlin.stdlib;

    exports io.vproxy.vfx.animation;
    exports io.vproxy.vfx.component.keychooser;
    exports io.vproxy.vfx.control.click;
    exports io.vproxy.vfx.control.dialog;
    exports io.vproxy.vfx.control.drag;
    exports io.vproxy.vfx.control.globalscreen;
    exports io.vproxy.vfx.control.scroll;
    exports io.vproxy.vfx.entity;
    exports io.vproxy.vfx.entity.input;
    exports io.vproxy.vfx.manager.audio;
    exports io.vproxy.vfx.manager.font;
    exports io.vproxy.vfx.manager.image;
    exports io.vproxy.vfx.manager.internal_i18n;
    exports io.vproxy.vfx.manager.task;
    exports io.vproxy.vfx.robot;
    exports io.vproxy.vfx.theme;
    exports io.vproxy.vfx.theme.impl;
    exports io.vproxy.vfx.ui.alert;
    exports io.vproxy.vfx.ui.button;
    exports io.vproxy.vfx.ui.layout;
    exports io.vproxy.vfx.ui.loading;
    exports io.vproxy.vfx.ui.pane;
    exports io.vproxy.vfx.ui.scene;
    exports io.vproxy.vfx.ui.shapes;
    exports io.vproxy.vfx.ui.stage;
    exports io.vproxy.vfx.ui.table;
    exports io.vproxy.vfx.ui.wrapper;
    exports io.vproxy.vfx.util;
    exports io.vproxy.vfx.util.algebradata;
    exports io.vproxy.vfx.util.graph;
    exports io.vproxy.vfx.util.imagewrapper;

    opens io.vproxy.vfx.res.font;
    opens io.vproxy.vfx.res.image;
}
