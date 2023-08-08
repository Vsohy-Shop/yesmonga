package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40996v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.c2 */
public final class C40741c2 implements ServiceConnection, C40764g2 {

    /* renamed from: c */
    public final Map f103792c = new HashMap();

    /* renamed from: d */
    public int f103793d = 2;

    /* renamed from: e */
    public boolean f103794e;
    @C0363p0

    /* renamed from: f */
    public IBinder f103795f;

    /* renamed from: g */
    public final C40732a2 f103796g;

    /* renamed from: h */
    public ComponentName f103797h;

    /* renamed from: i */
    public final /* synthetic */ C40760f2 f103798i;

    public C40741c2(C40760f2 f2Var, C40732a2 a2Var) {
        this.f103798i = f2Var;
        this.f103796g = a2Var;
    }

    /* renamed from: a */
    public final int mo134317a() {
        return this.f103793d;
    }

    /* renamed from: b */
    public final ComponentName mo134318b() {
        return this.f103797h;
    }

    @C0363p0
    /* renamed from: c */
    public final IBinder mo134319c() {
        return this.f103795f;
    }

    /* renamed from: d */
    public final void mo134320d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f103792c.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo134321e(String str, @C0363p0 Executor executor) {
        this.f103793d = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C40996v.m166693r()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C40760f2 f2Var = this.f103798i;
            boolean e = f2Var.f103865j.mo134754e(f2Var.f103862g, str, this.f103796g.mo134302c(f2Var.f103862g), this, this.f103796g.mo134300a(), executor);
            this.f103794e = e;
            if (e) {
                this.f103798i.f103863h.sendMessageDelayed(this.f103798i.f103863h.obtainMessage(1, this.f103796g), this.f103798i.f103867l);
            } else {
                this.f103793d = 2;
                try {
                    C40760f2 f2Var2 = this.f103798i;
                    f2Var2.f103865j.mo134752c(f2Var2.f103862g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo134322f(ServiceConnection serviceConnection, String str) {
        this.f103792c.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo134323g(String str) {
        this.f103798i.f103863h.removeMessages(1, this.f103796g);
        C40760f2 f2Var = this.f103798i;
        f2Var.f103865j.mo134752c(f2Var.f103862g, this);
        this.f103794e = false;
        this.f103793d = 2;
    }

    /* renamed from: h */
    public final boolean mo134324h(ServiceConnection serviceConnection) {
        return this.f103792c.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo134325i() {
        return this.f103792c.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo134326j() {
        return this.f103794e;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f103798i.f103861f) {
            this.f103798i.f103863h.removeMessages(1, this.f103796g);
            this.f103795f = iBinder;
            this.f103797h = componentName;
            for (ServiceConnection onServiceConnected : this.f103792c.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f103793d = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f103798i.f103861f) {
            this.f103798i.f103863h.removeMessages(1, this.f103796g);
            this.f103795f = null;
            this.f103797h = componentName;
            for (ServiceConnection onServiceDisconnected : this.f103792c.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f103793d = 2;
        }
    }
}
