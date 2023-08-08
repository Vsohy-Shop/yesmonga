package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.contentsquare.android.sdk.f4 */
public class C14322f4 {

    /* renamed from: a */
    public final C14772u7 f35361a;

    /* renamed from: b */
    public final Context f35362b;

    /* renamed from: c */
    public final C14779ud f35363c;

    /* renamed from: d */
    public VelocityTracker f35364d;

    /* renamed from: e */
    public double f35365e;

    /* renamed from: f */
    public int f35366f;

    /* renamed from: g */
    public int f35367g;

    /* renamed from: h */
    public int f35368h;

    /* renamed from: i */
    public int f35369i;

    /* renamed from: j */
    public long f35370j = Long.MIN_VALUE;

    /* renamed from: k */
    public double f35371k;

    /* renamed from: l */
    public long f35372l;

    /* renamed from: m */
    public C14366g5<View> f35373m;

    /* renamed from: n */
    public C14324b f35374n;

    /* renamed from: com.contentsquare.android.sdk.f4$a */
    public class C14323a implements C14663r3<View> {
        public C14323a() {
        }

        /* renamed from: a */
        public boolean mo34386b(View view) {
            return view.isClickable();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f4$b */
    public interface C14324b {
        /* renamed from: a */
        void mo35131a(C14522m7 m7Var);
    }

    public C14322f4(Application application, C14779ud udVar, C14772u7 u7Var) {
        this.f35362b = application;
        this.f35363c = udVar;
        this.f35361a = u7Var;
    }

    /* renamed from: a */
    public final int mo35115a(float f, float f2, float f3, float f4) {
        float f5 = f2 - f;
        float f6 = f4 - f3;
        return Math.abs(f5) > Math.abs(f6) ? f5 > 0.0f ? 4 : 3 : f6 > 0.0f ? 2 : 1;
    }

    /* renamed from: b */
    public final View mo35116b(C14366g5<View> g5Var) {
        return g5Var.mo35342b(new C14323a(), 1);
    }

    /* renamed from: c */
    public final C14250c9 mo35117c(View view) {
        if (view != null) {
            return new C14691s0(view);
        }
        return null;
    }

    /* renamed from: d */
    public void mo35118d() {
        C14366g5<View> g5Var = this.f35373m;
        if (g5Var != null) {
            g5Var.mo35343c();
        }
    }

    /* renamed from: e */
    public final void mo35119e(int i) {
        VelocityTracker velocityTracker = this.f35364d;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            int b = C14921z6.m64196b(this.f35364d.getXVelocity(i));
            int b2 = C14921z6.m64196b(this.f35364d.getYVelocity(i));
            this.f35365e = Math.sqrt(Math.pow((double) C14413i3.m62074a(b, this.f35362b), 2.0d) + Math.pow((double) C14413i3.m62074a(b2, this.f35362b), 2.0d));
        }
    }

    /* renamed from: f */
    public final void mo35120f(int i, int i2) {
        this.f35368h = C14413i3.m62074a(i, this.f35362b);
        int a = C14413i3.m62074a(i2, this.f35362b);
        this.f35369i = a;
        this.f35371k = C14921z6.m64195a((float) this.f35366f, (float) this.f35367g, (float) this.f35368h, (float) a);
        this.f35372l = this.f35361a.mo36566b() - this.f35370j;
    }

    /* renamed from: g */
    public final void mo35121g(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f35364d;
        if (velocityTracker == null) {
            this.f35364d = mo35125k();
        } else {
            velocityTracker.clear();
        }
        this.f35364d.addMovement(motionEvent);
    }

    /* renamed from: h */
    public final void mo35122h(MotionEvent motionEvent, ViewGroup viewGroup) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        this.f35373m = this.f35363c.mo36580a(viewGroup, rawX, rawY);
        this.f35366f = C14413i3.m62074a(rawX, this.f35362b);
        this.f35367g = C14413i3.m62074a(rawY, this.f35362b);
        this.f35370j = this.f35361a.mo36566b();
    }

    /* renamed from: i */
    public void mo35123i(C14324b bVar) {
        this.f35374n = bVar;
    }

    /* renamed from: j */
    public final void mo35124j(C14522m7 m7Var) {
        C14366g5<View> g5Var = this.f35373m;
        if (g5Var != null) {
            View b = mo35116b(g5Var);
            if (b != null) {
                m7Var.f35925c = mo35117c(b);
                m7Var.f35923a = !b.hasOnClickListeners();
                return;
            }
            m7Var.f35925c = mo35117c(this.f35373m.mo35346f());
            m7Var.f35923a = true;
        }
    }

    /* renamed from: k */
    public VelocityTracker mo35125k() {
        return VelocityTracker.obtain();
    }

    /* renamed from: l */
    public void mo35126l(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f35364d;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    /* renamed from: m */
    public void mo35127m(MotionEvent motionEvent, ViewGroup viewGroup) {
        mo35122h(motionEvent, viewGroup);
        mo35121g(motionEvent);
    }

    /* renamed from: n */
    public final void mo35128n() {
        C14522m7 m7Var = new C14522m7();
        double d = this.f35371k;
        m7Var.f35927e = d;
        double d2 = this.f35365e;
        m7Var.f35928f = d2;
        if (d > 24.0d) {
            m7Var.f35924b = d2 > 1000.0d ? 10 : 9;
            m7Var.f35926d = mo35115a((float) this.f35366f, (float) this.f35368h, (float) this.f35367g, (float) this.f35369i);
        } else {
            m7Var.f35924b = this.f35372l < 500 ? 6 : 8;
        }
        mo35124j(m7Var);
        C14324b bVar = this.f35374n;
        if (bVar != null) {
            bVar.mo35131a(m7Var);
        }
    }

    /* renamed from: o */
    public void mo35129o(MotionEvent motionEvent) {
        mo35119e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        mo35120f((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        mo35128n();
        mo35118d();
    }
}
