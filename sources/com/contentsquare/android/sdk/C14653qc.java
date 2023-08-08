package com.contentsquare.android.sdk;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.qc */
public final class C14653qc extends Handler {

    /* renamed from: b */
    public static final ThreadLocal<WeakReference<C14653qc>> f36302b = new ThreadLocal<>();

    /* renamed from: a */
    public final C14384h<C14325f5, Object> f36303a = new C14384h<>();

    /* renamed from: a */
    public static C14653qc m63204a() {
        ThreadLocal<WeakReference<C14653qc>> threadLocal = f36302b;
        WeakReference weakReference = threadLocal.get();
        C14653qc qcVar = weakReference != null ? (C14653qc) weakReference.get() : null;
        if (qcVar != null) {
            return qcVar;
        }
        C14653qc qcVar2 = new C14653qc();
        threadLocal.set(new WeakReference(qcVar2));
        return qcVar2;
    }

    /* renamed from: b */
    public synchronized void mo36260b(C14325f5 f5Var, Object obj) {
        this.f36303a.mo35410c(f5Var, obj);
    }

    /* renamed from: c */
    public synchronized void mo36261c(C14325f5 f5Var, Object obj) {
        if (this.f36303a.mo35409b(f5Var, obj)) {
            obtainMessage(3, f5Var).sendToTarget();
        }
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((C14869xe) message.obj).mo35377h();
        } else if (i == 1) {
            ((C14869xe) message.obj).mo35378i();
        } else if (i == 2) {
            ((C14869xe) message.obj).mo36861j();
        } else if (i == 3) {
            C14325f5 f5Var = (C14325f5) message.obj;
            if (this.f36303a.mo35408a(f5Var)) {
                f5Var.mo34402a();
            }
        } else if (i == 4) {
            ((C14736t4) message.obj).mo36477M();
        } else if (i == 5) {
            ((C14736t4) message.obj).mo36471G();
        }
    }
}
