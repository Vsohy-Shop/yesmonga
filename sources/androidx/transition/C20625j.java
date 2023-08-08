package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j */
public class C20625j extends C20665q1 {

    /* renamed from: d */
    public float f53205d = 3.0f;

    /* renamed from: h */
    public static float m95914h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo61672c(ViewGroup viewGroup, C20606h0 h0Var, C20657p0 p0Var, C20657p0 p0Var2) {
        int i;
        int i2;
        int i3;
        if (p0Var == null && p0Var2 == null) {
            return 0;
        }
        if (p0Var2 == null || mo61878e(p0Var) == 0) {
            i = -1;
        } else {
            p0Var = p0Var2;
            i = 1;
        }
        int f = mo61879f(p0Var);
        int g = mo61880g(p0Var);
        Rect R = h0Var.mo61726R();
        if (R != null) {
            i3 = R.centerX();
            i2 = R.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m95914h((float) f, (float) g, (float) i3, (float) i2) / m95914h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long P = h0Var.mo61723P();
        if (P < 0) {
            P = 300;
        }
        return (long) Math.round((((float) (P * ((long) i))) / this.f53205d) * h);
    }

    /* renamed from: i */
    public void mo61812i(float f) {
        if (f != 0.0f) {
            this.f53205d = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
