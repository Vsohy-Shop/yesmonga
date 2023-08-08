package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
public class C31599b {

    /* renamed from: e */
    public static final int f76689e = 0;

    /* renamed from: f */
    public static final int f76690f = 1500;

    /* renamed from: g */
    public static final int f76691g = 2750;

    /* renamed from: h */
    public static C31599b f76692h;
    @C0359n0

    /* renamed from: a */
    public final Object f76693a = new Object();
    @C0359n0

    /* renamed from: b */
    public final Handler f76694b = new Handler(Looper.getMainLooper(), new C31600a());
    @C0363p0

    /* renamed from: c */
    public C31602c f76695c;
    @C0363p0

    /* renamed from: d */
    public C31602c f76696d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    public class C31600a implements Handler.Callback {
        public C31600a() {
        }

        public boolean handleMessage(@C0359n0 Message message) {
            if (message.what != 0) {
                return false;
            }
            C31599b.this.mo91249d((C31602c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    public interface C31601b {
        /* renamed from: a */
        void mo91202a();

        /* renamed from: b */
        void mo91203b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    public static class C31602c {
        @C0359n0

        /* renamed from: a */
        public final WeakReference<C31601b> f76698a;

        /* renamed from: b */
        public int f76699b;

        /* renamed from: c */
        public boolean f76700c;

        public C31602c(int i, C31601b bVar) {
            this.f76698a = new WeakReference<>(bVar);
            this.f76699b = i;
        }

        /* renamed from: a */
        public boolean mo91262a(@C0363p0 C31601b bVar) {
            return bVar != null && this.f76698a.get() == bVar;
        }
    }

    /* renamed from: c */
    public static C31599b m128000c() {
        if (f76692h == null) {
            f76692h = new C31599b();
        }
        return f76692h;
    }

    /* renamed from: a */
    public final boolean mo91247a(@C0359n0 C31602c cVar, int i) {
        C31601b bVar = cVar.f76698a.get();
        if (bVar == null) {
            return false;
        }
        this.f76694b.removeCallbacksAndMessages(cVar);
        bVar.mo91203b(i);
        return true;
    }

    /* renamed from: b */
    public void mo91248b(C31601b bVar, int i) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                mo91247a(this.f76695c, i);
            } else if (mo91253h(bVar)) {
                mo91247a(this.f76696d, i);
            }
        }
    }

    /* renamed from: d */
    public void mo91249d(@C0359n0 C31602c cVar) {
        synchronized (this.f76693a) {
            if (this.f76695c == cVar || this.f76696d == cVar) {
                mo91247a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo91250e(C31601b bVar) {
        boolean g;
        synchronized (this.f76693a) {
            g = mo91252g(bVar);
        }
        return g;
    }

    /* renamed from: f */
    public boolean mo91251f(C31601b bVar) {
        boolean z;
        synchronized (this.f76693a) {
            if (!mo91252g(bVar)) {
                if (!mo91253h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo91252g(C31601b bVar) {
        C31602c cVar = this.f76695c;
        return cVar != null && cVar.mo91262a(bVar);
    }

    /* renamed from: h */
    public final boolean mo91253h(C31601b bVar) {
        C31602c cVar = this.f76696d;
        return cVar != null && cVar.mo91262a(bVar);
    }

    /* renamed from: i */
    public void mo91254i(C31601b bVar) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                this.f76695c = null;
                if (this.f76696d != null) {
                    mo91260o();
                }
            }
        }
    }

    /* renamed from: j */
    public void mo91255j(C31601b bVar) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                mo91258m(this.f76695c);
            }
        }
    }

    /* renamed from: k */
    public void mo91256k(C31601b bVar) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                C31602c cVar = this.f76695c;
                if (!cVar.f76700c) {
                    cVar.f76700c = true;
                    this.f76694b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo91257l(C31601b bVar) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                C31602c cVar = this.f76695c;
                if (cVar.f76700c) {
                    cVar.f76700c = false;
                    mo91258m(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo91258m(@C0359n0 C31602c cVar) {
        int i = cVar.f76699b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = 1500;
                } else {
                    i = f76691g;
                }
            }
            this.f76694b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f76694b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: n */
    public void mo91259n(int i, C31601b bVar) {
        synchronized (this.f76693a) {
            if (mo91252g(bVar)) {
                C31602c cVar = this.f76695c;
                cVar.f76699b = i;
                this.f76694b.removeCallbacksAndMessages(cVar);
                mo91258m(this.f76695c);
                return;
            }
            if (mo91253h(bVar)) {
                this.f76696d.f76699b = i;
            } else {
                this.f76696d = new C31602c(i, bVar);
            }
            C31602c cVar2 = this.f76695c;
            if (cVar2 == null || !mo91247a(cVar2, 4)) {
                this.f76695c = null;
                mo91260o();
            }
        }
    }

    /* renamed from: o */
    public final void mo91260o() {
        C31602c cVar = this.f76696d;
        if (cVar != null) {
            this.f76695c = cVar;
            this.f76696d = null;
            C31601b bVar = cVar.f76698a.get();
            if (bVar != null) {
                bVar.mo91202a();
            } else {
                this.f76695c = null;
            }
        }
    }
}
