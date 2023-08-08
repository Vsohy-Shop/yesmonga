package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.core.view.C18196h2;

/* renamed from: androidx.transition.l */
public class C20633l extends C20658p1 {

    /* renamed from: r1 */
    public static final String f53221r1 = "android:fade:transitionAlpha";

    /* renamed from: s1 */
    public static final String f53222s1 = "Fade";

    /* renamed from: t1 */
    public static final int f53223t1 = 1;

    /* renamed from: u1 */
    public static final int f53224u1 = 2;

    /* renamed from: androidx.transition.l$a */
    public class C20634a extends C20626j0 {

        /* renamed from: a */
        public final /* synthetic */ View f53225a;

        public C20634a(View view) {
            this.f53225a = view;
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            C20554c1.m95691h(this.f53225a, 1.0f);
            C20554c1.m95684a(this.f53225a);
            h0Var.mo61767z0(this);
        }
    }

    /* renamed from: androidx.transition.l$b */
    public static class C20635b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f53227a;

        /* renamed from: b */
        public boolean f53228b = false;

        public C20635b(View view) {
            this.f53227a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C20554c1.m95691h(this.f53227a, 1.0f);
            if (this.f53228b) {
                this.f53227a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C18196h2.m82512L0(this.f53227a) && this.f53227a.getLayerType() == 0) {
                this.f53228b = true;
                this.f53227a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C20633l(int i) {
        mo61871d1(i);
    }

    /* renamed from: f1 */
    public static float m95947f1(C20657p0 p0Var, float f) {
        Float f2;
        if (p0Var == null || (f2 = (Float) p0Var.f53279a.get(f53221r1)) == null) {
            return f;
        }
        return f2.floatValue();
    }

    @C0363p0
    /* renamed from: Z0 */
    public Animator mo61679Z0(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        float f = 0.0f;
        float f1 = m95947f1(p0Var, 0.0f);
        if (f1 != 1.0f) {
            f = f1;
        }
        return mo61823e1(view, f, 1.0f);
    }

    @C0363p0
    /* renamed from: b1 */
    public Animator mo61680b1(ViewGroup viewGroup, View view, C20657p0 p0Var, C20657p0 p0Var2) {
        C20554c1.m95688e(view);
        return mo61823e1(view, m95947f1(p0Var, 1.0f), 0.0f);
    }

    /* renamed from: e1 */
    public final Animator mo61823e1(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C20554c1.m95691h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C20554c1.f52992c, new float[]{f2});
        ofFloat.addListener(new C20635b(view));
        mo61737b(new C20634a(view));
        return ofFloat;
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        super.mo61636s(p0Var);
        p0Var.f53279a.put(f53221r1, Float.valueOf(C20554c1.m95686c(p0Var.f53280b)));
    }

    public C20633l() {
    }

    @SuppressLint({"RestrictedApi"})
    public C20633l(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53075f);
        mo61871d1(C17483q.m80235k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo61866W0()));
        obtainStyledAttributes.recycle();
    }
}
