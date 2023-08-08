package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.contentsquare.android.sdk.C14211b6;
import com.contentsquare.android.sdk.C14742t9;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.contentsquare.android.sdk.wa */
public class C14832wa {

    /* renamed from: a */
    public final C14213b7 f36775a;

    /* renamed from: b */
    public final C14587o9 f36776b;

    /* renamed from: c */
    public final C14757u0 f36777c;

    /* renamed from: d */
    public final C14208b4 f36778d;

    /* renamed from: e */
    public final C14512m0 f36779e;

    /* renamed from: f */
    public final C14211b6.C14212a f36780f;

    /* renamed from: g */
    public final C14317f1 f36781g;

    /* renamed from: h */
    public final C14285e0 f36782h;

    /* renamed from: i */
    public final C14626q f36783i;

    /* renamed from: j */
    public final C14305ea f36784j;

    public C14832wa(C14213b7 b7Var, C14417i6 i6Var) {
        this(new C14587o9(), new C14757u0(), new C14208b4(), new C14512m0(), new C14211b6.C14212a(), new C14317f1(), new C14285e0(), b7Var, m63902a(b7Var, i6Var), new C14305ea());
    }

    /* renamed from: a */
    public static C14626q m63902a(C14213b7 b7Var, C14417i6 i6Var) {
        return b7Var.mo34676h(C14477k8.SESSION_REPLAY_NEW_MASKING, false) ? new C14433ig(new C14855x9(1, 1), i6Var) : new C14798v8();
    }

    /* renamed from: b */
    public final C14211b6 mo36731b(Bitmap bitmap, C14507le leVar) {
        boolean z = leVar.mo35838I() != null && leVar.mo35838I().length() <= 3;
        int i = 4;
        int i2 = z ? 4 : 8;
        if (!z) {
            i = 8;
        }
        this.f36776b.mo36052d(bitmap, Math.min(i2, bitmap.getWidth()), Math.min(i, bitmap.getHeight()));
        return this.f36780f.mo34668a(this.f36776b.mo36049a(), this.f36781g);
    }

    /* renamed from: c */
    public void mo36732c() {
        this.f36779e.mo35883a();
    }

    /* renamed from: d */
    public final void mo36733d(C14424i9 i9Var, C14507le leVar, Bitmap bitmap, C14211b6 b6Var) {
        if (!mo36742m(leVar, b6Var)) {
            if (b6Var.mo34664c() == 1) {
                mo36741l(leVar, b6Var);
            } else if (mo36739j(b6Var.mo34662a())) {
                mo36734e(leVar);
            } else {
                mo36736g(leVar, bitmap, i9Var);
            }
        }
    }

    /* renamed from: e */
    public final void mo36734e(C14507le leVar) {
        mo36735f(leVar, 0);
    }

    /* renamed from: f */
    public final void mo36735f(C14507le leVar, int i) {
        leVar.mo35851c(i);
        leVar.mo35853e((C14464k3) null);
        leVar.mo35857i((byte[]) null);
    }

    /* renamed from: g */
    public final void mo36736g(C14507le leVar, Bitmap bitmap, C14424i9 i9Var) {
        C14464k3 K = leVar.mo35840K();
        if (K == null) {
            return;
        }
        if (this.f36778d.mo34651c(K.mo35706c())) {
            leVar.mo35857i((byte[]) null);
            return;
        }
        leVar.mo35857i(this.f36782h.mo35009b(leVar, bitmap));
        this.f36778d.mo34650b(K.mo35706c());
    }

    /* renamed from: h */
    public final void mo36737h(C14507le leVar, C14211b6 b6Var) {
        leVar.mo35853e(new C14464k3(this.f36777c.mo36544a(b6Var), leVar, b6Var));
        this.f36779e.mo35885c(leVar);
        this.f36779e.mo35884b(leVar.mo35837H(), leVar.mo35840K());
        leVar.mo35864q(C14917z3.m64188a(leVar, b6Var));
    }

    /* renamed from: i */
    public void mo36738i(C14507le leVar, C14742t9.C14746d dVar, C14424i9 i9Var) {
        LinkedList<C14507le> a = C14259cf.m61353a(leVar);
        this.f36783i.mo35558a(dVar, a);
        Iterator<C14507le> it = a.iterator();
        while (it.hasNext()) {
            C14507le next = it.next();
            Bitmap a2 = dVar.mo36511a(next);
            C14211b6 b = mo36731b(a2, next);
            Bitmap b2 = this.f36783i.mo35559b(this.f36784j.mo35076a(a2, b), next, this.f36776b);
            mo36737h(next, b);
            mo36733d(i9Var, next, b2, b);
        }
        this.f36779e.mo35886d();
    }

    /* renamed from: j */
    public final boolean mo36739j(int i) {
        return (i >>> 24) == 0;
    }

    /* renamed from: k */
    public void mo36740k() {
        this.f36778d.mo34649a();
    }

    /* renamed from: l */
    public final void mo36741l(C14507le leVar, C14211b6 b6Var) {
        mo36735f(leVar, b6Var.mo34662a() | -16777216);
    }

    /* renamed from: m */
    public final boolean mo36742m(C14507le leVar, C14211b6 b6Var) {
        int i;
        if (this.f36775a.mo34676h(C14477k8.DEVELOPER_SESSION_REPLAY_DEBUG_HIGHLIGHT_NON_CACHEABLE_VIEWS, false)) {
            if (leVar.mo35874z() != 0.0f) {
                i = Color.rgb(((int) (leVar.mo35874z() * 128.0f)) + 127, 0, 0);
            } else if (b6Var.mo34665d() != 0.0f) {
                i = Color.rgb(0, ((int) (b6Var.mo34665d() * 128.0f)) + 127, 0);
            } else if (leVar.mo35843N()) {
                i = -16776961;
            }
            mo36735f(leVar, i);
            return true;
        }
        return false;
    }

    public C14832wa(C14587o9 o9Var, C14757u0 u0Var, C14208b4 b4Var, C14512m0 m0Var, C14211b6.C14212a aVar, C14317f1 f1Var, C14285e0 e0Var, C14213b7 b7Var, C14626q qVar, C14305ea eaVar) {
        this.f36776b = o9Var;
        this.f36777c = u0Var;
        this.f36778d = b4Var;
        this.f36779e = m0Var;
        this.f36780f = aVar;
        this.f36781g = f1Var;
        this.f36775a = b7Var;
        this.f36782h = e0Var;
        this.f36783i = qVar;
        this.f36784j = eaVar;
    }
}
