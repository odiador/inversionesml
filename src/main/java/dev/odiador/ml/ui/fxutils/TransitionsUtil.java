package dev.odiador.ml.ui.fxutils;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class TransitionsUtil {
    public static ScaleTransition configureHoverTransition(Node node, Duration duration) {
        ScaleTransition st = new ScaleTransition(duration, node);
        st.setFromX(1);
        st.setToX(1.1);
        st.setFromY(1);
        st.setToY(1.1);
        st.setInterpolator(Interpolator.EASE_BOTH);

        node.setOnMouseEntered((e) -> {
            st.stop();
            st.setRate(1);
            st.jumpTo(Duration.ZERO);
            st.play();
        });
        node.setOnMouseExited((e) -> {
            st.stop();
            st.setRate(-1);
            st.jumpTo(duration);
            st.play();
        });
        return st;
    }
}
