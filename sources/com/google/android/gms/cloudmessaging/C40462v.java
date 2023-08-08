package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.concurrent.C40970b;
import com.google.android.gms.internal.cloudmessaging.C41090e;
import com.google.android.gms.tasks.C31047k;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.cloudmessaging.v */
public final class C40462v {
    @C0363p0
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    public static C40462v f103099e;

    /* renamed from: a */
    public final Context f103100a;

    /* renamed from: b */
    public final ScheduledExecutorService f103101b;
    @GuardedBy("this")

    /* renamed from: c */
    public C40457q f103102c = new C40457q(this, (C40456p) null);
    @GuardedBy("this")

    /* renamed from: d */
    public int f103103d = 1;

    @C0344h1
    public C40462v(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f103101b = scheduledExecutorService;
        this.f103100a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C40462v m164630b(Context context) {
        C40462v vVar;
        synchronized (C40462v.class) {
            if (f103099e == null) {
                C41090e.m166955a();
                f103099e = new C40462v(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C40970b("MessengerIpcClient"))));
            }
            vVar = f103099e;
        }
        return vVar;
    }

    /* renamed from: c */
    public final C31047k<Void> mo133579c(int i, Bundle bundle) {
        return mo133582g(new C40459s(mo133581f(), 2, bundle));
    }

    /* renamed from: d */
    public final C31047k<Bundle> mo133580d(int i, Bundle bundle) {
        return mo133582g(new C40461u(mo133581f(), 1, bundle));
    }

    /* renamed from: f */
    public final synchronized int mo133581f() {
        int i;
        i = this.f103103d;
        this.f103103d = i + 1;
        return i;
    }

    /* renamed from: g */
    public final synchronized <T> C31047k<T> mo133582g(C40460t<T> tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.f103102c.mo133570g(tVar)) {
            C40457q qVar = new C40457q(this, (C40456p) null);
            this.f103102c = qVar;
            qVar.mo133570g(tVar);
        }
        return tVar.f103096b.mo87741a();
    }
}
