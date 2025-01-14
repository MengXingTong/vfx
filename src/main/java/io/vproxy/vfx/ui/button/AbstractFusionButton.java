package io.vproxy.vfx.ui.button;

import io.vproxy.vfx.theme.Theme;
import io.vproxy.vfx.ui.pane.AbstractFusionPane;
import javafx.scene.paint.Color;

public abstract class AbstractFusionButton extends AbstractFusionPane {
    protected abstract void onMouseClicked();

    private Color normalColor = Theme.current().fusionButtonNormalBackgroundColor();
    @Override
    protected Color normalColor() {
        if(normalColor == null) {
            normalColor = Theme.current().fusionButtonNormalBackgroundColor();
        }
        return normalColor;
    }
    @Override
    public void setNormalColor(Color color) {
        normalColor = color;
        super.setNormalColor(color);
    }

    private Color hoverColor = Theme.current().fusionButtonHoverBackgroundColor();
    @Override
    protected Color hoverColor() {
        if(hoverColor == null) {
            hoverColor = Theme.current().fusionButtonHoverBackgroundColor();
        }
        return hoverColor;
    }
    @Override
    public void setHoverColor(Color color){
        hoverColor = color;
        super.setHoverColor(color);
    }

    private Color downColor = Theme.current().fusionButtonDownBackgroundColor();
    @Override
    protected Color downColor() {
        if(downColor == null) {
            downColor = Theme.current().fusionButtonDownBackgroundColor();
        }
        return downColor;
    }
    @Override
    public void setDownColor(Color color){
        downColor = color;
        super.setDownColor(color);
    }
}
