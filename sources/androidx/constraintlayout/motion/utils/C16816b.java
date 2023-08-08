package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.C16708p;
import androidx.constraintlayout.core.motion.utils.C16710r;
import androidx.constraintlayout.core.motion.utils.C16711s;
import androidx.constraintlayout.motion.widget.C16898q;

/* renamed from: androidx.constraintlayout.motion.utils.b */
public class C16816b extends C16898q {

    /* renamed from: a */
    public C16711s f43167a;

    /* renamed from: b */
    public C16708p f43168b;

    /* renamed from: c */
    public C16710r f43169c;

    public C16816b() {
        C16711s sVar = new C16711s();
        this.f43167a = sVar;
        this.f43169c = sVar;
    }

    /* renamed from: a */
    public float mo49931a() {
        return this.f43169c.mo49083a();
    }

    /* renamed from: b */
    public void mo49932b(float f, float f2, float f3, float f4, float f5, float f6) {
        C16711s sVar = this.f43167a;
        this.f43169c = sVar;
        sVar.mo49093f(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public String mo49933c(String str, float f) {
        return this.f43169c.mo49085c(str, f);
    }

    /* renamed from: d */
    public float mo49934d(float f) {
        return this.f43169c.mo49084b(f);
    }

    /* renamed from: e */
    public boolean mo49935e() {
        return this.f43169c.mo49086d();
    }

    /* renamed from: f */
    public void mo49936f(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f43168b == null) {
            this.f43168b = new C16708p();
        }
        C16708p pVar = this.f43168b;
        this.f43169c = pVar;
        pVar.mo49091h(f, f2, f3, f4, f5, f6, f7, i);
    }

    public float getInterpolation(float f) {
        return this.f43169c.getInterpolation(f);
    }
}
