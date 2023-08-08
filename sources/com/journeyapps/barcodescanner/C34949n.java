package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.zxing.C34752e;
import com.google.zxing.C34761k;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.camera.C34918h;
import com.journeyapps.barcodescanner.camera.C34934r;

/* renamed from: com.journeyapps.barcodescanner.n */
public class C34949n {

    /* renamed from: k */
    public static final String f85020k = "n";

    /* renamed from: a */
    public C34918h f85021a;

    /* renamed from: b */
    public HandlerThread f85022b;

    /* renamed from: c */
    public Handler f85023c;

    /* renamed from: d */
    public C34946k f85024d;

    /* renamed from: e */
    public Handler f85025e;

    /* renamed from: f */
    public Rect f85026f;

    /* renamed from: g */
    public boolean f85027g = false;

    /* renamed from: h */
    public final Object f85028h = new Object();

    /* renamed from: i */
    public final Handler.Callback f85029i = new C34950a();

    /* renamed from: j */
    public final C34934r f85030j = new C34951b();

    /* renamed from: com.journeyapps.barcodescanner.n$a */
    public class C34950a implements Handler.Callback {
        public C34950a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C34661l.C34666e.zxing_decode) {
                C34949n.this.mo103533g((C34960v) message.obj);
                return true;
            } else if (i != C34661l.C34666e.zxing_preview_failed) {
                return true;
            } else {
                C34949n.this.mo103536j();
                return true;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.n$b */
    public class C34951b implements C34934r {
        public C34951b() {
        }

        /* renamed from: a */
        public void mo103495a(C34960v vVar) {
            synchronized (C34949n.this.f85028h) {
                if (C34949n.this.f85027g) {
                    C34949n.this.f85023c.obtainMessage(C34661l.C34666e.zxing_decode, vVar).sendToTarget();
                }
            }
        }

        /* renamed from: b */
        public void mo103496b(Exception exc) {
            synchronized (C34949n.this.f85028h) {
                if (C34949n.this.f85027g) {
                    C34949n.this.f85023c.obtainMessage(C34661l.C34666e.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public C34949n(C34918h hVar, C34946k kVar, Handler handler) {
        C34961w.m142988a();
        this.f85021a = hVar;
        this.f85024d = kVar;
        this.f85025e = handler;
    }

    /* renamed from: f */
    public C34752e mo103532f(C34960v vVar) {
        if (this.f85026f == null) {
            return null;
        }
        return vVar.mo103560a();
    }

    /* renamed from: g */
    public final void mo103533g(C34960v vVar) {
        C34761k kVar;
        long currentTimeMillis = System.currentTimeMillis();
        vVar.mo103572m(this.f85026f);
        C34752e f = mo103532f(vVar);
        if (f != null) {
            kVar = this.f85024d.mo103525c(f);
        } else {
            kVar = null;
        }
        if (kVar != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Found barcode in ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(" ms");
            if (this.f85025e != null) {
                Message obtain = Message.obtain(this.f85025e, C34661l.C34666e.zxing_decode_succeeded, new C34908c(kVar, vVar));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f85025e;
            if (handler != null) {
                Message.obtain(handler, C34661l.C34666e.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f85025e != null) {
            Message.obtain(this.f85025e, C34661l.C34666e.zxing_possible_result_points, C34908c.m142713m(this.f85024d.mo103526d(), vVar)).sendToTarget();
        }
        mo103536j();
    }

    /* renamed from: h */
    public Rect mo103534h() {
        return this.f85026f;
    }

    /* renamed from: i */
    public C34946k mo103535i() {
        return this.f85024d;
    }

    /* renamed from: j */
    public final void mo103536j() {
        this.f85021a.mo103419E(this.f85030j);
    }

    /* renamed from: k */
    public void mo103537k(Rect rect) {
        this.f85026f = rect;
    }

    /* renamed from: l */
    public void mo103538l(C34946k kVar) {
        this.f85024d = kVar;
    }

    /* renamed from: m */
    public void mo103539m() {
        C34961w.m142988a();
        HandlerThread handlerThread = new HandlerThread(f85020k);
        this.f85022b = handlerThread;
        handlerThread.start();
        this.f85023c = new Handler(this.f85022b.getLooper(), this.f85029i);
        this.f85027g = true;
        mo103536j();
    }

    /* renamed from: n */
    public void mo103540n() {
        C34961w.m142988a();
        synchronized (this.f85028h) {
            this.f85027g = false;
            this.f85023c.removeCallbacksAndMessages((Object) null);
            this.f85022b.quit();
        }
    }
}
