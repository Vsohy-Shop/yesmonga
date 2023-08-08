package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.core.graphics.C17616m0;

/* renamed from: androidx.core.view.y4 */
public final class C18427y4 {

    /* renamed from: a */
    public final C18429b f47100a;

    @C0376v0(30)
    /* renamed from: androidx.core.view.y4$a */
    public static class C18428a extends C18429b {

        /* renamed from: a */
        public final WindowInsetsAnimationController f47101a;

        public C18428a(@C0359n0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f47101a = windowInsetsAnimationController;
        }

        /* renamed from: a */
        public void mo53110a(boolean z) {
            this.f47101a.finish(z);
        }

        /* renamed from: b */
        public float mo53111b() {
            return this.f47101a.getCurrentAlpha();
        }

        /* renamed from: c */
        public float mo53112c() {
            return this.f47101a.getCurrentFraction();
        }

        @C0359n0
        /* renamed from: d */
        public C17616m0 mo53113d() {
            return C17616m0.m80700g(this.f47101a.getCurrentInsets());
        }

        @C0359n0
        /* renamed from: e */
        public C17616m0 mo53114e() {
            return C17616m0.m80700g(this.f47101a.getHiddenStateInsets());
        }

        @C0359n0
        /* renamed from: f */
        public C17616m0 mo53115f() {
            return C17616m0.m80700g(this.f47101a.getShownStateInsets());
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: g */
        public int mo53116g() {
            return this.f47101a.getTypes();
        }

        /* renamed from: h */
        public boolean mo53117h() {
            return this.f47101a.isCancelled();
        }

        /* renamed from: i */
        public boolean mo53118i() {
            return this.f47101a.isFinished();
        }

        /* renamed from: j */
        public void mo53119j(@C0363p0 C17616m0 m0Var, float f, float f2) {
            this.f47101a.setInsetsAndAlpha(m0Var == null ? null : m0Var.mo52063h(), f, f2);
        }
    }

    /* renamed from: androidx.core.view.y4$b */
    public static class C18429b {
        /* renamed from: a */
        public void mo53110a(boolean z) {
        }

        /* renamed from: b */
        public float mo53111b() {
            return 0.0f;
        }

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: c */
        public float mo53112c() {
            return 0.0f;
        }

        @C0359n0
        /* renamed from: d */
        public C17616m0 mo53113d() {
            return C17616m0.f45994e;
        }

        @C0359n0
        /* renamed from: e */
        public C17616m0 mo53114e() {
            return C17616m0.f45994e;
        }

        @C0359n0
        /* renamed from: f */
        public C17616m0 mo53115f() {
            return C17616m0.f45994e;
        }

        /* renamed from: g */
        public int mo53116g() {
            return 0;
        }

        /* renamed from: h */
        public boolean mo53117h() {
            return true;
        }

        /* renamed from: i */
        public boolean mo53118i() {
            return false;
        }

        /* renamed from: j */
        public void mo53119j(@C0363p0 C17616m0 m0Var, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
        }
    }

    @C0376v0(30)
    public C18427y4(@C0359n0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f47100a = new C18428a(windowInsetsAnimationController);
    }

    /* renamed from: a */
    public void mo53099a(boolean z) {
        this.f47100a.mo53110a(z);
    }

    /* renamed from: b */
    public float mo53100b() {
        return this.f47100a.mo53111b();
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: c */
    public float mo53101c() {
        return this.f47100a.mo53112c();
    }

    @C0359n0
    /* renamed from: d */
    public C17616m0 mo53102d() {
        return this.f47100a.mo53113d();
    }

    @C0359n0
    /* renamed from: e */
    public C17616m0 mo53103e() {
        return this.f47100a.mo53114e();
    }

    @C0359n0
    /* renamed from: f */
    public C17616m0 mo53104f() {
        return this.f47100a.mo53115f();
    }

    /* renamed from: g */
    public int mo53105g() {
        return this.f47100a.mo53116g();
    }

    /* renamed from: h */
    public boolean mo53106h() {
        return this.f47100a.mo53117h();
    }

    /* renamed from: i */
    public boolean mo53107i() {
        return this.f47100a.mo53118i();
    }

    /* renamed from: j */
    public boolean mo53108j() {
        return !mo53107i() && !mo53106h();
    }

    /* renamed from: k */
    public void mo53109k(@C0363p0 C17616m0 m0Var, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
        this.f47100a.mo53119j(m0Var, f, f2);
    }
}
