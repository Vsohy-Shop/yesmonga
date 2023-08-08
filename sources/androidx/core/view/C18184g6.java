package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.collection.C1886l;
import androidx.compose.runtime.C8698y1;

/* renamed from: androidx.core.view.g6 */
public final class C18184g6 {

    /* renamed from: b */
    public static final int f46787b = 0;

    /* renamed from: c */
    public static final int f46788c = 1;

    /* renamed from: d */
    public static final int f46789d = 2;

    /* renamed from: a */
    public final C18190e f46790a;

    @C0376v0(20)
    /* renamed from: androidx.core.view.g6$a */
    public static class C18185a extends C18190e {
        @C0359n0

        /* renamed from: a */
        public final Window f46791a;
        @C0359n0

        /* renamed from: b */
        public final View f46792b;

        public C18185a(@C0359n0 Window window, @C0359n0 View view) {
            this.f46791a = window;
            this.f46792b = view;
        }

        /* renamed from: a */
        public void mo52855a(C18191f fVar) {
        }

        /* renamed from: b */
        public void mo52856b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, C18368s4 s4Var) {
        }

        /* renamed from: c */
        public int mo52857c() {
            return 0;
        }

        /* renamed from: d */
        public void mo52858d(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    mo52862m(i2);
                }
            }
        }

        /* renamed from: g */
        public void mo52859g(@C0359n0 C18191f fVar) {
        }

        /* renamed from: j */
        public void mo52860j(int i) {
            if (i == 0) {
                mo52866r(6144);
            } else if (i == 1) {
                mo52866r(4096);
                mo52863o(2048);
            } else if (i == 2) {
                mo52866r(2048);
                mo52863o(4096);
            }
        }

        /* renamed from: k */
        public void mo52861k(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    mo52865q(i2);
                }
            }
        }

        /* renamed from: m */
        public final void mo52862m(int i) {
            if (i == 1) {
                mo52863o(4);
            } else if (i == 2) {
                mo52863o(2);
            } else if (i == 8) {
                ((InputMethodManager) this.f46791a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f46791a.getDecorView().getWindowToken(), 0);
            }
        }

        /* renamed from: o */
        public void mo52863o(int i) {
            View decorView = this.f46791a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: p */
        public void mo52864p(int i) {
            this.f46791a.addFlags(i);
        }

        /* renamed from: q */
        public final void mo52865q(int i) {
            if (i == 1) {
                mo52866r(4);
                mo52867s(1024);
            } else if (i == 2) {
                mo52866r(2);
            } else if (i == 8) {
                View view = this.f46792b;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f46791a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f46791a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new C18176f6(view));
                }
            }
        }

        /* renamed from: r */
        public void mo52866r(int i) {
            View decorView = this.f46791a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: s */
        public void mo52867s(int i) {
            this.f46791a.clearFlags(i);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.view.g6$b */
    public static class C18186b extends C18185a {
        public C18186b(@C0359n0 Window window, @C0363p0 View view) {
            super(window, view);
        }

        /* renamed from: f */
        public boolean mo52868f() {
            return (this.f46791a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        /* renamed from: i */
        public void mo52869i(boolean z) {
            if (z) {
                mo52867s(C8698y1.f23302n);
                mo52864p(Integer.MIN_VALUE);
                mo52863o(8192);
                return;
            }
            mo52866r(8192);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.view.g6$c */
    public static class C18187c extends C18186b {
        public C18187c(@C0359n0 Window window, @C0363p0 View view) {
            super(window, view);
        }

        /* renamed from: e */
        public boolean mo52870e() {
            return (this.f46791a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        /* renamed from: h */
        public void mo52871h(boolean z) {
            if (z) {
                mo52867s(C8698y1.f23301m);
                mo52864p(Integer.MIN_VALUE);
                mo52863o(16);
                return;
            }
            mo52866r(16);
        }
    }

    /* renamed from: androidx.core.view.g6$e */
    public static class C18190e {
        /* renamed from: a */
        public void mo52855a(C18191f fVar) {
        }

        /* renamed from: b */
        public void mo52856b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, C18368s4 s4Var) {
        }

        /* renamed from: c */
        public int mo52857c() {
            return 0;
        }

        /* renamed from: d */
        public void mo52858d(int i) {
        }

        /* renamed from: e */
        public boolean mo52870e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo52868f() {
            return false;
        }

        /* renamed from: g */
        public void mo52859g(@C0359n0 C18191f fVar) {
        }

        /* renamed from: h */
        public void mo52871h(boolean z) {
        }

        /* renamed from: i */
        public void mo52869i(boolean z) {
        }

        /* renamed from: j */
        public void mo52860j(int i) {
        }

        /* renamed from: k */
        public void mo52861k(int i) {
        }
    }

    /* renamed from: androidx.core.view.g6$f */
    public interface C18191f {
        /* renamed from: a */
        void mo52877a(@C0359n0 C18184g6 g6Var, int i);
    }

    @C0376v0(30)
    @Deprecated
    public C18184g6(@C0359n0 WindowInsetsController windowInsetsController) {
        this.f46790a = new C18188d(windowInsetsController, this);
    }

    @C0359n0
    @C0376v0(30)
    @Deprecated
    /* renamed from: l */
    public static C18184g6 m82404l(@C0359n0 WindowInsetsController windowInsetsController) {
        return new C18184g6(windowInsetsController);
    }

    /* renamed from: a */
    public void mo52844a(@C0359n0 C18191f fVar) {
        this.f46790a.mo52855a(fVar);
    }

    /* renamed from: b */
    public void mo52845b(int i, long j, @C0363p0 Interpolator interpolator, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C18368s4 s4Var) {
        this.f46790a.mo52856b(i, j, interpolator, cancellationSignal, s4Var);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: c */
    public int mo52846c() {
        return this.f46790a.mo52857c();
    }

    /* renamed from: d */
    public void mo52847d(int i) {
        this.f46790a.mo52858d(i);
    }

    /* renamed from: e */
    public boolean mo52848e() {
        return this.f46790a.mo52870e();
    }

    /* renamed from: f */
    public boolean mo52849f() {
        return this.f46790a.mo52868f();
    }

    /* renamed from: g */
    public void mo52850g(@C0359n0 C18191f fVar) {
        this.f46790a.mo52859g(fVar);
    }

    /* renamed from: h */
    public void mo52851h(boolean z) {
        this.f46790a.mo52871h(z);
    }

    /* renamed from: i */
    public void mo52852i(boolean z) {
        this.f46790a.mo52869i(z);
    }

    /* renamed from: j */
    public void mo52853j(int i) {
        this.f46790a.mo52860j(i);
    }

    /* renamed from: k */
    public void mo52854k(int i) {
        this.f46790a.mo52861k(i);
    }

    @C0376v0(30)
    /* renamed from: androidx.core.view.g6$d */
    public static class C18188d extends C18190e {

        /* renamed from: a */
        public final C18184g6 f46793a;

        /* renamed from: b */
        public final WindowInsetsController f46794b;

        /* renamed from: c */
        public final C1886l<C18191f, WindowInsetsController.OnControllableInsetsChangedListener> f46795c;

        /* renamed from: d */
        public Window f46796d;

        /* renamed from: androidx.core.view.g6$d$a */
        public class C18189a implements WindowInsetsAnimationControlListener {

            /* renamed from: a */
            public C18427y4 f46797a = null;

            /* renamed from: b */
            public final /* synthetic */ C18368s4 f46798b;

            public C18189a(C18368s4 s4Var) {
                this.f46798b = s4Var;
            }

            public void onCancelled(@C0363p0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f46798b.mo53030a(windowInsetsAnimationController == null ? null : this.f46797a);
            }

            public void onFinished(@C0359n0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f46798b.mo53032c(this.f46797a);
            }

            public void onReady(@C0359n0 WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                C18427y4 y4Var = new C18427y4(windowInsetsAnimationController);
                this.f46797a = y4Var;
                this.f46798b.mo53031b(y4Var, i);
            }
        }

        public C18188d(@C0359n0 Window window, @C0359n0 C18184g6 g6Var) {
            this(window.getInsetsController(), g6Var);
            this.f46796d = window;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m82436m(C18191f fVar, WindowInsetsController windowInsetsController, int i) {
            if (this.f46794b == windowInsetsController) {
                fVar.mo52877a(this.f46793a, i);
            }
        }

        /* renamed from: a */
        public void mo52855a(@C0359n0 C18191f fVar) {
            if (!this.f46795c.containsKey(fVar)) {
                C18360r6 r6Var = new C18360r6(this, fVar);
                this.f46795c.put(fVar, r6Var);
                this.f46794b.addOnControllableInsetsChangedListener(r6Var);
            }
        }

        /* renamed from: b */
        public void mo52856b(int i, long j, @C0363p0 Interpolator interpolator, @C0363p0 CancellationSignal cancellationSignal, @C0359n0 C18368s4 s4Var) {
            this.f46794b.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new C18189a(s4Var));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: c */
        public int mo52857c() {
            return this.f46794b.getSystemBarsBehavior();
        }

        /* renamed from: d */
        public void mo52858d(int i) {
            this.f46794b.hide(i);
        }

        /* renamed from: e */
        public boolean mo52870e() {
            return (C18304l6.m82986a(this.f46794b) & 16) != 0;
        }

        /* renamed from: f */
        public boolean mo52868f() {
            return (C18304l6.m82986a(this.f46794b) & 8) != 0;
        }

        /* renamed from: g */
        public void mo52859g(@C0359n0 C18191f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener a = C18238i6.m82830a(this.f46795c.remove(fVar));
            if (a != null) {
                this.f46794b.removeOnControllableInsetsChangedListener(a);
            }
        }

        /* renamed from: h */
        public void mo52871h(boolean z) {
            if (z) {
                if (this.f46796d != null) {
                    mo52872n(16);
                }
                this.f46794b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f46796d != null) {
                mo52873o(16);
            }
            this.f46794b.setSystemBarsAppearance(0, 16);
        }

        /* renamed from: i */
        public void mo52869i(boolean z) {
            if (z) {
                if (this.f46796d != null) {
                    mo52872n(8192);
                }
                this.f46794b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f46796d != null) {
                mo52873o(8192);
            }
            this.f46794b.setSystemBarsAppearance(0, 8);
        }

        /* renamed from: j */
        public void mo52860j(int i) {
            this.f46794b.setSystemBarsBehavior(i);
        }

        /* renamed from: k */
        public void mo52861k(int i) {
            Window window = this.f46796d;
            if (!(window == null || (i & 8) == 0 || Build.VERSION.SDK_INT >= 32)) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f46794b.show(i);
        }

        /* renamed from: n */
        public void mo52872n(int i) {
            View decorView = this.f46796d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: o */
        public void mo52873o(int i) {
            View decorView = this.f46796d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C18188d(@C0359n0 WindowInsetsController windowInsetsController, @C0359n0 C18184g6 g6Var) {
            this.f46795c = new C1886l<>();
            this.f46794b = windowInsetsController;
            this.f46793a = g6Var;
        }
    }

    public C18184g6(@C0359n0 Window window, @C0359n0 View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f46790a = new C18188d(window, this);
        } else if (i >= 26) {
            this.f46790a = new C18187c(window, view);
        } else {
            this.f46790a = new C18186b(window, view);
        }
    }
}
