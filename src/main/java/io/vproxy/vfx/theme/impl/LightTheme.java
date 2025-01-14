package io.vproxy.vfx.theme.impl;

import io.vproxy.vfx.manager.font.FontProvider;
import io.vproxy.vfx.manager.image.ImageManager;
import io.vproxy.vfx.theme.Theme;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class LightTheme extends Theme {
    private final FontProvider __fontProvider = new DarkThemeFontProvider();

    public LightTheme() {
    }

    public FontProvider fontProvider() {
        return this.__fontProvider;
    }

    public Color normalTextColor() {
        return new Color(0, 0, 0, 1.0);
    }

    public Color borderColor() {
        return this.borderColorLight();
    }

    public Color borderColorLight() {
        return new Color(0.5, 0.5, 0.5, 1.0);
    }

    public Color borderColorDark() {
        return this.sceneBackgroundColor();
    }

    public Color sceneBackgroundColor() {
        return new Color(1, 1, 1, 1.0);
    }

    public Color subSceneBackgroundColor() {
        return new Color(0.09019607843137255, 0.10588235294117647, 0.11764705882352941, 1.0);
    }

    public Image windowCloseButtonNormalImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/close.png:red");
    }

    public Image windowCloseButtonHoverImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/close.png:red");
    }

    public Image windowMaximizeButtonNormalImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/maximize.png:green");
    }

    public Image windowMaximizeButtonHoverImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/maximize.png:green");
    }

    public Image windowResetWindowSizeButtonNormalImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/reset-window-size.png:green");
    }

    public Image windowResetWindowSizeButtonHoverImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/reset-window-size.png:green");
    }

    public Image windowIconifyButtonNormalImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/iconify.png:yellow");
    }

    public Image windowIconifyButtonHoverImage() {
        return ImageManager.get().load("io/vproxy/vfx/res/image/iconify.png:yellow");
    }

    public Color fusionButtonHoverBackgroundColor() {
        return new Color(0.9, 0.9, 0.9, 1.0);
    }

    public Color fusionButtonDownBackgroundColor() {
        return new Color(0.8, 0.8, 0.8, 1.0);
    }

    public Color fusionButtonAnimatingBorderLightColor() {
        return new Color(0.30196078431372547, 0.43137254901960786, 0.7450980392156863, 1.0);
    }

    public Color transparentFusionButtonDownBackgroundColor() {
        return new Color(0.10196078431372549, 0.11764705882352941, 0.12941176470588237, 0.3);
    }

    public Color fusionPaneHoverBackgroundColor() {
        return new Color(0.19215686274509805, 0.21568627450980393, 0.23921568627450981, 1.0);
    }

    public Color fusionPaneBorderColor() {
        return new Color(0.6235294117647059, 0.6235294117647059, 0.6235294117647059, 1.0);
    }

    public Color transparentFusionPaneHoverBackgroundColor() {
        return new Color(0.19215686274509805, 0.21568627450980393, 0.23921568627450981, 0.3);
    }

    public Color scrollBarColor() {
        return new Color(0.7647058823529411, 0.7647058823529411, 0.7647058823529411, 1.0);
    }

    public Color fusionButtonDisabledTextColor() {
        return new Color(0.5137254901960784, 0.5137254901960784, 0.5137254901960784, 1.0);
    }

    public Color coverBackgroundColor() {
        return new Color(1.0, 1.0, 1.0, 0.1);
    }

    public Color tableSortLabelColor() {
        return Color.GRAY;
    }

    public Color tableCellSelectedBackgroundColor() {
        return new Color(0.25098039215686274, 0.28627450980392155, 0.3215686274509804, 1.0);
    }

    public Color tableCellBackgroundColor2() {
        return new Color(0.1607843137254902, 0.18823529411764706, 0.21176470588235294, 1.0);
    }

    public Color tableHeaderTopBackgroundColor() {
        return new Color(0.10196078431372549, 0.12156862745098039, 0.12941176470588237, 1.0);
    }

    public Color tableHeaderBottomBackgroundColor() {
        return new Color(0.10588235294117647, 0.12549019607843137, 0.13725490196078433, 1.0);
    }

    public Color progressBarProgressColor() {
        return new Color(0.34901960784313724, 0.7137254901960784, 0.3333333333333333, 1.0);
    }

    public Color progressBarBackgroundColor() {
        return new Color(0.25098039215686274, 0.28627450980392155, 0.3215686274509804, 1.0);
    }

    public Color toggleSwitchSelectedButtonColor() {
        return this.toggleSwitchBorderColor();
    }

    public Color toggleSwitchUnselectedTrayColor() {
        return new Color(0.25098039215686274, 0.28627450980392155, 0.3215686274509804, 1.0);
    }

    public Color toggleSwitchSelectedTrayColor() {
        return new Color(0.36470588235294116, 0.4, 0.43137254901960786, 1.0);
    }
}
