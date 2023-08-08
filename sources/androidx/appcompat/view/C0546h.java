package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18402w3;
import androidx.core.view.C18416x3;
import androidx.core.view.C18426y3;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.h */
public class C0546h {

    /* renamed from: a */
    public final ArrayList<C18402w3> f1468a = new ArrayList<>();

    /* renamed from: b */
    public long f1469b = -1;

    /* renamed from: c */
    public Interpolator f1470c;

    /* renamed from: d */
    public C18416x3 f1471d;

    /* renamed from: e */
    public boolean f1472e;

    /* renamed from: f */
    public final C18426y3 f1473f = new C0547a();

    /* renamed from: androidx.appcompat.view.h$a */
    public class C0547a extends C18426y3 {

        /* renamed from: a */
        public boolean f1474a = false;

        /* renamed from: b */
        public int f1475b = 0;

        public C0547a() {
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            int i = this.f1475b + 1;
            this.f1475b = i;
            if (i == C0546h.this.f1468a.size()) {
                C18416x3 x3Var = C0546h.this.f1471d;
                if (x3Var != null) {
                    x3Var.mo1198b((View) null);
                }
                mo1814d();
            }
        }

        /* renamed from: c */
        public void mo1199c(View view) {
            if (!this.f1474a) {
                this.f1474a = true;
                C18416x3 x3Var = C0546h.this.f1471d;
                if (x3Var != null) {
                    x3Var.mo1199c((View) null);
                }
            }
        }

        /* renamed from: d */
        public void mo1814d() {
            this.f1475b = 0;
            this.f1474a = false;
            C0546h.this.mo1807b();
        }
    }

    /* renamed from: a */
    public void mo1806a() {
        if (this.f1472e) {
            Iterator<C18402w3> it = this.f1468a.iterator();
            while (it.hasNext()) {
                it.next().mo53060d();
            }
            this.f1472e = false;
        }
    }

    /* renamed from: b */
    public void mo1807b() {
        this.f1472e = false;
    }

    /* renamed from: c */
    public C0546h mo1808c(C18402w3 w3Var) {
        if (!this.f1472e) {
            this.f1468a.add(w3Var);
        }
        return this;
    }

    /* renamed from: d */
    public C0546h mo1809d(C18402w3 w3Var, C18402w3 w3Var2) {
        this.f1468a.add(w3Var);
        w3Var2.mo53078w(w3Var.mo53061e());
        this.f1468a.add(w3Var2);
        return this;
    }

    /* renamed from: e */
    public C0546h mo1810e(long j) {
        if (!this.f1472e) {
            this.f1469b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0546h mo1811f(Interpolator interpolator) {
        if (!this.f1472e) {
            this.f1470c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0546h mo1812g(C18416x3 x3Var) {
        if (!this.f1472e) {
            this.f1471d = x3Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo1813h() {
        if (!this.f1472e) {
            Iterator<C18402w3> it = this.f1468a.iterator();
            while (it.hasNext()) {
                C18402w3 next = it.next();
                long j = this.f1469b;
                if (j >= 0) {
                    next.mo53074s(j);
                }
                Interpolator interpolator = this.f1470c;
                if (interpolator != null) {
                    next.mo53075t(interpolator);
                }
                if (this.f1471d != null) {
                    next.mo53076u(this.f1473f);
                }
                next.mo53080y();
            }
            this.f1472e = true;
        }
    }
}
