package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.v3 */
public final /* synthetic */ class C18395v3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C18435z3 f47071a;

    /* renamed from: b */
    public final /* synthetic */ View f47072b;

    public /* synthetic */ C18395v3(C18435z3 z3Var, View view) {
        this.f47071a = z3Var;
        this.f47072b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f47071a.mo1451a(this.f47072b);
    }
}
