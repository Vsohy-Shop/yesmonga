package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.internal.cloudmessaging.C41091f;
import com.google.firebase.messaging.C33206k0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.cloudmessaging.q */
public final class C40457q implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: c */
    public int f103087c = 0;

    /* renamed from: d */
    public final Messenger f103088d = new Messenger(new C41091f(Looper.getMainLooper(), new C40450j(this)));

    /* renamed from: e */
    public C40458r f103089e;
    @GuardedBy("this")

    /* renamed from: f */
    public final Queue<C40460t<?>> f103090f = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: g */
    public final SparseArray<C40460t<?>> f103091g = new SparseArray<>();

    /* renamed from: h */
    public final /* synthetic */ C40462v f103092h;

    public /* synthetic */ C40457q(C40462v vVar, C40456p pVar) {
        this.f103092h = vVar;
    }

    /* renamed from: a */
    public final synchronized void mo133564a(int i, @C0363p0 String str) {
        mo133565b(i, str, (Throwable) null);
    }

    /* renamed from: b */
    public final synchronized void mo133565b(int i, @C0363p0 String str, @C0363p0 Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.f103087c;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f103087c = 4;
            C40954b.m166547b().mo134752c(this.f103092h.f103100a, this);
            zzq zzq = new zzq(i, str, th);
            for (C40460t<?> c : this.f103090f) {
                c.mo133576c(zzq);
            }
            this.f103090f.clear();
            for (int i3 = 0; i3 < this.f103091g.size(); i3++) {
                this.f103091g.valueAt(i3).mo133576c(zzq);
            }
            this.f103091g.clear();
        } else if (i2 == 3) {
            this.f103087c = 4;
        }
    }

    /* renamed from: c */
    public final void mo133566c() {
        this.f103092h.f103101b.execute(new C40452l(this));
    }

    /* renamed from: d */
    public final synchronized void mo133567d() {
        if (this.f103087c == 1) {
            mo133564a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void mo133568e(int i) {
        C40460t tVar = this.f103091g.get(i);
        if (tVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            this.f103091g.remove(i);
            tVar.mo133576c(new zzq(3, "Timed out waiting for response", (Throwable) null));
            mo133569f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo133569f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f103087c     // Catch:{ all -> 0x0030 }
            r1 = 2
            if (r0 != r1) goto L_0x002e
            java.util.Queue<com.google.android.gms.cloudmessaging.t<?>> r0 = r2.f103090f     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.cloudmessaging.t<?>> r0 = r2.f103091g     // Catch:{ all -> 0x0030 }
            int r0 = r0.size()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0030 }
            r0 = 3
            r2.f103087c = r0     // Catch:{ all -> 0x0030 }
            com.google.android.gms.common.stats.b r0 = com.google.android.gms.common.stats.C40954b.m166547b()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.cloudmessaging.v r1 = r2.f103092h     // Catch:{ all -> 0x0030 }
            android.content.Context r1 = r1.f103100a     // Catch:{ all -> 0x0030 }
            r0.mo134752c(r1, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C40457q.mo133569f():void");
    }

    /* renamed from: g */
    public final synchronized boolean mo133570g(C40460t<?> tVar) {
        boolean z;
        int i = this.f103087c;
        if (i == 0) {
            this.f103090f.add(tVar);
            if (this.f103087c == 0) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166208r(z);
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f103087c = 1;
            Intent intent = new Intent(C33206k0.f80728i);
            intent.setPackage("com.google.android.gms");
            try {
                if (!C40954b.m166547b().mo134751a(this.f103092h.f103100a, intent, this, 1)) {
                    mo133564a(0, "Unable to bind to service");
                } else {
                    this.f103092h.f103101b.schedule(new C40453m(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo133565b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f103090f.add(tVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f103090f.add(tVar);
            mo133566c();
            return true;
        }
        return true;
    }

    @C0353k0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f103092h.f103101b.execute(new C40454n(this, iBinder));
    }

    @C0353k0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f103092h.f103101b.execute(new C40451k(this));
    }
}
