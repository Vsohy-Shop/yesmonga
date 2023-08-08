package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.internal.common.C41114p;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.f2 */
public final class C40760f2 extends C40773j {
    @GuardedBy("connectionStatus")

    /* renamed from: f */
    public final HashMap f103861f = new HashMap();

    /* renamed from: g */
    public final Context f103862g;

    /* renamed from: h */
    public volatile Handler f103863h;

    /* renamed from: i */
    public final C40755e2 f103864i;

    /* renamed from: j */
    public final C40954b f103865j;

    /* renamed from: k */
    public final long f103866k;

    /* renamed from: l */
    public final long f103867l;

    public C40760f2(Context context, Looper looper) {
        C40755e2 e2Var = new C40755e2(this, (C40746d2) null);
        this.f103864i = e2Var;
        this.f103862g = context.getApplicationContext();
        this.f103863h = new C41114p(looper, e2Var);
        this.f103865j = C40954b.m166547b();
        this.f103866k = 5000;
        this.f103867l = 300000;
    }

    /* renamed from: i */
    public final void mo134405i(C40732a2 a2Var, ServiceConnection serviceConnection, String str) {
        C40843u.m166203m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f103861f) {
            C40741c2 c2Var = (C40741c2) this.f103861f.get(a2Var);
            if (c2Var == null) {
                String obj = a2Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (c2Var.mo134324h(serviceConnection)) {
                c2Var.mo134322f(serviceConnection, str);
                if (c2Var.mo134325i()) {
                    this.f103863h.sendMessageDelayed(this.f103863h.obtainMessage(0, a2Var), this.f103866k);
                }
            } else {
                String obj2 = a2Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo134406k(C40732a2 a2Var, ServiceConnection serviceConnection, String str, @C0363p0 Executor executor) {
        boolean j;
        C40843u.m166203m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f103861f) {
            C40741c2 c2Var = (C40741c2) this.f103861f.get(a2Var);
            if (c2Var == null) {
                c2Var = new C40741c2(this, a2Var);
                c2Var.mo134320d(serviceConnection, serviceConnection, str);
                c2Var.mo134321e(str, executor);
                this.f103861f.put(a2Var, c2Var);
            } else {
                this.f103863h.removeMessages(0, a2Var);
                if (!c2Var.mo134324h(serviceConnection)) {
                    c2Var.mo134320d(serviceConnection, serviceConnection, str);
                    int a = c2Var.mo134317a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(c2Var.mo134318b(), c2Var.mo134319c());
                    } else if (a == 2) {
                        c2Var.mo134321e(str, executor);
                    }
                } else {
                    String obj = a2Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = c2Var.mo134326j();
        }
        return j;
    }

    /* renamed from: q */
    public final void mo134407q(Looper looper) {
        synchronized (this.f103861f) {
            this.f103863h = new C41114p(looper, this.f103864i);
        }
    }
}
