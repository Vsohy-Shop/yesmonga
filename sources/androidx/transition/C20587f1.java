package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(19)
/* renamed from: androidx.transition.f1 */
public class C20587f1 extends C20655o1 {

    /* renamed from: h */
    public static boolean f53063h = true;

    /* renamed from: a */
    public void mo61685a(@C0359n0 View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo61686c(@C0359n0 View view) {
        if (f53063h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f53063h = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo61687d(@C0359n0 View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo61688g(@C0359n0 View view, float f) {
        if (f53063h) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f53063h = false;
            }
        }
        view.setAlpha(f);
    }
}
