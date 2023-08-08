package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.w3 */
public final class C18402w3 {

    /* renamed from: e */
    public static final int f47078e = 2113929216;

    /* renamed from: a */
    public final WeakReference<View> f47079a;

    /* renamed from: b */
    public Runnable f47080b = null;

    /* renamed from: c */
    public Runnable f47081c = null;

    /* renamed from: d */
    public int f47082d = -1;

    /* renamed from: androidx.core.view.w3$a */
    public class C18403a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C18416x3 f47083a;

        /* renamed from: b */
        public final /* synthetic */ View f47084b;

        public C18403a(C18416x3 x3Var, View view) {
            this.f47083a = x3Var;
            this.f47084b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f47083a.mo3258a(this.f47084b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f47083a.mo1198b(this.f47084b);
        }

        public void onAnimationStart(Animator animator) {
            this.f47083a.mo1199c(this.f47084b);
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.view.w3$b */
    public static class C18404b {
        @C0373u
        /* renamed from: a */
        public static ViewPropertyAnimator m83260a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @C0373u
        /* renamed from: b */
        public static ViewPropertyAnimator m83261b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @C0373u
        /* renamed from: c */
        public static ViewPropertyAnimator m83262c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.core.view.w3$c */
    public static class C18405c {
        @C0373u
        /* renamed from: a */
        public static Interpolator m83263a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.w3$d */
    public static class C18406d {
        @C0373u
        /* renamed from: a */
        public static ViewPropertyAnimator m83264a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.view.w3$e */
    public static class C18407e {
        @C0373u
        /* renamed from: a */
        public static ViewPropertyAnimator m83265a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @C0373u
        /* renamed from: b */
        public static ViewPropertyAnimator m83266b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @C0373u
        /* renamed from: c */
        public static ViewPropertyAnimator m83267c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @C0373u
        /* renamed from: d */
        public static ViewPropertyAnimator m83268d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    /* renamed from: androidx.core.view.w3$f */
    public static class C18408f implements C18416x3 {

        /* renamed from: a */
        public C18402w3 f47086a;

        /* renamed from: b */
        public boolean f47087b;

        public C18408f(C18402w3 w3Var) {
            this.f47086a = w3Var;
        }

        /* renamed from: a */
        public void mo3258a(@C0359n0 View view) {
            C18416x3 x3Var;
            Object tag = view.getTag(C18402w3.f47078e);
            if (tag instanceof C18416x3) {
                x3Var = (C18416x3) tag;
            } else {
                x3Var = null;
            }
            if (x3Var != null) {
                x3Var.mo3258a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.core.view.x3} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1198b(@androidx.annotation.C0359n0 android.view.View r4) {
            /*
                r3 = this;
                androidx.core.view.w3 r0 = r3.f47086a
                int r0 = r0.f47082d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r4.setLayerType(r0, r1)
                androidx.core.view.w3 r0 = r3.f47086a
                r0.f47082d = r2
            L_0x000f:
                androidx.core.view.w3 r0 = r3.f47086a
                java.lang.Runnable r2 = r0.f47081c
                if (r2 == 0) goto L_0x001a
                r0.f47081c = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.C18416x3
                if (r2 == 0) goto L_0x0027
                r1 = r0
                androidx.core.view.x3 r1 = (androidx.core.view.C18416x3) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo1198b(r4)
            L_0x002c:
                r4 = 1
                r3.f47087b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C18402w3.C18408f.mo1198b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.core.view.x3} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1199c(@androidx.annotation.C0359n0 android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f47087b = r0
                androidx.core.view.w3 r0 = r3.f47086a
                int r0 = r0.f47082d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r2)
            L_0x000f:
                androidx.core.view.w3 r0 = r3.f47086a
                java.lang.Runnable r1 = r0.f47080b
                if (r1 == 0) goto L_0x001a
                r0.f47080b = r2
                r1.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.C18416x3
                if (r1 == 0) goto L_0x0027
                r2 = r0
                androidx.core.view.x3 r2 = (androidx.core.view.C18416x3) r2
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r2.mo1199c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C18402w3.C18408f.mo1199c(android.view.View):void");
        }
    }

    public C18402w3(View view) {
        this.f47079a = new WeakReference<>(view);
    }

    @C0359n0
    /* renamed from: A */
    public C18402w3 mo53044A(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: B */
    public C18402w3 mo53045B(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: C */
    public C18402w3 mo53046C(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: D */
    public C18402w3 mo53047D(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            C18407e.m83265a(view.animate(), f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: E */
    public C18402w3 mo53048E(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            C18407e.m83266b(view.animate(), f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: F */
    public C18402w3 mo53049F(@C0359n0 Runnable runnable) {
        View view = this.f47079a.get();
        if (view != null) {
            C18404b.m83260a(view.animate(), runnable);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    @C0359n0
    /* renamed from: G */
    public C18402w3 mo53050G() {
        View view = this.f47079a.get();
        if (view != null) {
            C18404b.m83261b(view.animate());
        }
        return this;
    }

    @C0359n0
    /* renamed from: H */
    public C18402w3 mo53051H(@C0359n0 Runnable runnable) {
        View view = this.f47079a.get();
        if (view != null) {
            C18404b.m83262c(view.animate(), runnable);
        }
        return this;
    }

    @C0359n0
    /* renamed from: I */
    public C18402w3 mo53052I(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: J */
    public C18402w3 mo53053J(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: K */
    public C18402w3 mo53054K(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: L */
    public C18402w3 mo53055L(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: M */
    public C18402w3 mo53056M(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            C18407e.m83267c(view.animate(), f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: N */
    public C18402w3 mo53057N(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            C18407e.m83268d(view.animate(), f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public C18402w3 mo53058b(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public C18402w3 mo53059c(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    /* renamed from: d */
    public void mo53060d() {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: e */
    public long mo53061e() {
        View view = this.f47079a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    @C0363p0
    /* renamed from: f */
    public Interpolator mo53062f() {
        View view = this.f47079a.get();
        if (view != null) {
            return C18405c.m83263a(view.animate());
        }
        return null;
    }

    /* renamed from: g */
    public long mo53063g() {
        View view = this.f47079a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: i */
    public C18402w3 mo53064i(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public C18402w3 mo53065j(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C18402w3 mo53066k(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C18402w3 mo53067l(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C18402w3 mo53068m(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C18402w3 mo53069n(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C18402w3 mo53070o(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C18402w3 mo53071p(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public C18402w3 mo53072q(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public C18402w3 mo53073r(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public C18402w3 mo53074s(long j) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @C0359n0
    /* renamed from: t */
    public C18402w3 mo53075t(@C0363p0 Interpolator interpolator) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @C0359n0
    /* renamed from: u */
    public C18402w3 mo53076u(@C0363p0 C18416x3 x3Var) {
        View view = this.f47079a.get();
        if (view != null) {
            mo53077v(view, x3Var);
        }
        return this;
    }

    /* renamed from: v */
    public final void mo53077v(View view, C18416x3 x3Var) {
        if (x3Var != null) {
            view.animate().setListener(new C18403a(x3Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    @C0359n0
    /* renamed from: w */
    public C18402w3 mo53078w(long j) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @C0359n0
    /* renamed from: x */
    public C18402w3 mo53079x(@C0363p0 C18435z3 z3Var) {
        C18395v3 v3Var;
        View view = this.f47079a.get();
        if (view != null) {
            if (z3Var != null) {
                v3Var = new C18395v3(z3Var, view);
            } else {
                v3Var = null;
            }
            C18406d.m83264a(view.animate(), v3Var);
        }
        return this;
    }

    /* renamed from: y */
    public void mo53080y() {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @C0359n0
    /* renamed from: z */
    public C18402w3 mo53081z(float f) {
        View view = this.f47079a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }
}
