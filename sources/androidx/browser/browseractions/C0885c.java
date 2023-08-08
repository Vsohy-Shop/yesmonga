package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.C19320c;

@Deprecated
/* renamed from: androidx.browser.browseractions.c */
public class C0885c extends Dialog {

    /* renamed from: b */
    public static final long f2743b = 250;

    /* renamed from: c */
    public static final long f2744c = 150;

    /* renamed from: a */
    public final View f2745a;

    /* renamed from: androidx.browser.browseractions.c$a */
    public class C0886a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f2746a;

        public C0886a(boolean z) {
            this.f2746a = z;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2746a) {
                C0885c.super.dismiss();
            }
        }
    }

    public C0885c(Context context, View view) {
        super(context);
        this.f2745a = view;
    }

    /* renamed from: b */
    public final void mo3855b(boolean z) {
        float f;
        long j;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        if (z) {
            j = 250;
        } else {
            j = 150;
        }
        this.f2745a.setScaleX(f);
        this.f2745a.setScaleY(f);
        this.f2745a.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new C19320c()).setListener(new C0886a(z)).start();
    }

    public void dismiss() {
        mo3855b(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        mo3855b(true);
        super.show();
    }
}
