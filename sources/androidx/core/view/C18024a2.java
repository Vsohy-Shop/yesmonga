package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.view.a2 */
public final class C18024a2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f46539a;

    /* renamed from: b */
    public ViewTreeObserver f46540b;

    /* renamed from: c */
    public final Runnable f46541c;

    public C18024a2(View view, Runnable runnable) {
        this.f46539a = view;
        this.f46540b = view.getViewTreeObserver();
        this.f46541c = runnable;
    }

    @C0359n0
    /* renamed from: a */
    public static C18024a2 m81875a(@C0359n0 View view, @C0359n0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C18024a2 a2Var = new C18024a2(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(a2Var);
            view.addOnAttachStateChangeListener(a2Var);
            return a2Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo52507b() {
        if (this.f46540b.isAlive()) {
            this.f46540b.removeOnPreDrawListener(this);
        } else {
            this.f46539a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f46539a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo52507b();
        this.f46541c.run();
        return true;
    }

    public void onViewAttachedToWindow(@C0359n0 View view) {
        this.f46540b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(@C0359n0 View view) {
        mo52507b();
    }
}
