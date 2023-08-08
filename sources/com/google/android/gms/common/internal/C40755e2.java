package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.common.internal.e2 */
public final class C40755e2 implements Handler.Callback {

    /* renamed from: c */
    public final /* synthetic */ C40760f2 f103845c;

    public /* synthetic */ C40755e2(C40760f2 f2Var, C40746d2 d2Var) {
        this.f103845c = f2Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f103845c.f103861f) {
                C40732a2 a2Var = (C40732a2) message.obj;
                C40741c2 c2Var = (C40741c2) this.f103845c.f103861f.get(a2Var);
                if (c2Var != null && c2Var.mo134325i()) {
                    if (c2Var.mo134326j()) {
                        c2Var.mo134323g("GmsClientSupervisor");
                    }
                    this.f103845c.f103861f.remove(a2Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f103845c.f103861f) {
                C40732a2 a2Var2 = (C40732a2) message.obj;
                C40741c2 c2Var2 = (C40741c2) this.f103845c.f103861f.get(a2Var2);
                if (c2Var2 != null && c2Var2.mo134317a() == 3) {
                    String valueOf = String.valueOf(a2Var2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName b = c2Var2.mo134318b();
                    if (b == null) {
                        b = a2Var2.mo134301b();
                    }
                    if (b == null) {
                        String d = a2Var2.mo134303d();
                        C40843u.m166202l(d);
                        b = new ComponentName(d, "unknown");
                    }
                    c2Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
