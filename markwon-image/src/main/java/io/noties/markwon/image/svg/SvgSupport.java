package io.noties.markwon.image.svg;

/**
 * @since 4.0.0
 */
public abstract class SvgSupport {

    private static final boolean HAS_SVG;

    static {
        boolean result;
        try {
            com.caverock.androidsvg.SVG.class.getName();
            result = true;
        } catch (Throwable t) {
            //  @since 4.1.1-SNAPSHOT do not print stacktrace (it can become noisy)
//            t.printStackTrace();
            result = false;
        }
        HAS_SVG = result;
    }

    public static boolean hasSvgSupport() {
        return HAS_SVG;
    }

    private SvgSupport() {
    }
}
