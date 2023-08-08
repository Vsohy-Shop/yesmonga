package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20538b0;
import androidx.transition.C20606h0;

/* renamed from: androidx.transition.r0 */
public class C20668r0 {

    /* renamed from: androidx.transition.r0$a */
    public static class C20669a extends AnimatorListenerAdapter implements C20606h0.C20614h {

        /* renamed from: a */
        public final View f53327a;

        /* renamed from: b */
        public final View f53328b;

        /* renamed from: c */
        public final int f53329c;

        /* renamed from: d */
        public final int f53330d;

        /* renamed from: e */
        public int[] f53331e;

        /* renamed from: f */
        public float f53332f;

        /* renamed from: g */
        public float f53333g;

        /* renamed from: h */
        public final float f53334h;

        /* renamed from: i */
        public final float f53335i;

        public C20669a(View view, View view2, int i, int i2, float f, float f2) {
            this.f53328b = view;
            this.f53327a = view2;
            this.f53329c = i - Math.round(view.getTranslationX());
            this.f53330d = i2 - Math.round(view.getTranslationY());
            this.f53334h = f;
            this.f53335i = f2;
            int i3 = C20538b0.C20545g.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f53331e = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo61665a(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: c */
        public void mo61666c(@C0359n0 C20606h0 h0Var) {
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            this.f53328b.setTranslationX(this.f53334h);
            this.f53328b.setTranslationY(this.f53335i);
            h0Var.mo61767z0(this);
        }

        /* renamed from: e */
        public void mo61668e(@C0359n0 C20606h0 h0Var) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f53331e == null) {
                this.f53331e = new int[2];
            }
            this.f53331e[0] = Math.round(((float) this.f53329c) + this.f53328b.getTranslationX());
            this.f53331e[1] = Math.round(((float) this.f53330d) + this.f53328b.getTranslationY());
            this.f53327a.setTag(C20538b0.C20545g.transition_position, this.f53331e);
        }

        public void onAnimationPause(Animator animator) {
            this.f53332f = this.f53328b.getTranslationX();
            this.f53333g = this.f53328b.getTranslationY();
            this.f53328b.setTranslationX(this.f53334h);
            this.f53328b.setTranslationY(this.f53335i);
        }

        public void onAnimationResume(Animator animator) {
            this.f53328b.setTranslationX(this.f53332f);
            this.f53328b.setTranslationY(this.f53333g);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Animator m96120a(@C0359n0 View view, @C0359n0 C20657p0 p0Var, int i, int i2, float f, float f2, float f3, float f4, @C0363p0 TimeInterpolator timeInterpolator, @C0359n0 C20606h0 h0Var) {
        float f5;
        float f6;
        View view2 = view;
        C20657p0 p0Var2 = p0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) p0Var2.f53280b.getTag(C20538b0.C20545g.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C20669a aVar = new C20669a(view, p0Var2.f53280b, round, round2, translationX, translationY);
        h0Var.mo61737b(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C20533a.m95666a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
