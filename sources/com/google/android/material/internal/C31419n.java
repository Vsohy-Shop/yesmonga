package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.transition.C20606h0;
import androidx.transition.C20657p0;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.n */
public class C31419n extends C20606h0 {

    /* renamed from: k1 */
    public static final String f75957k1 = "android:textscale:scale";

    /* renamed from: com.google.android.material.internal.n$a */
    public class C31420a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f75958a;

        public C31420a(TextView textView) {
            this.f75958a = textView;
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f75958a.setScaleX(floatValue);
            this.f75958a.setScaleY(floatValue);
        }
    }

    /* renamed from: V0 */
    public final void mo90172V0(@C0359n0 C20657p0 p0Var) {
        View view = p0Var.f53280b;
        if (view instanceof TextView) {
            p0Var.f53279a.put(f75957k1, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo90172V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo90172V0(p0Var);
    }

    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        float f;
        if (p0Var == null || p0Var2 == null || !(p0Var.f53280b instanceof TextView)) {
            return null;
        }
        View view = p0Var2.f53280b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = p0Var.f53279a;
        Map<String, Object> map2 = p0Var2.f53279a;
        float f2 = 1.0f;
        if (map.get(f75957k1) != null) {
            f = ((Float) map.get(f75957k1)).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get(f75957k1) != null) {
            f2 = ((Float) map2.get(f75957k1)).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C31420a(textView));
        return ofFloat;
    }
}
