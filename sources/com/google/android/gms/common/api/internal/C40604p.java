package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40773j;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.C40843u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.p */
public final class C40604p implements C40477a.C40489f, ServiceConnection {

    /* renamed from: n */
    public static final String f103522n = "p";
    @C0363p0

    /* renamed from: c */
    public final String f103523c;
    @C0363p0

    /* renamed from: d */
    public final String f103524d;
    @C0363p0

    /* renamed from: e */
    public final ComponentName f103525e;

    /* renamed from: f */
    public final Context f103526f;

    /* renamed from: g */
    public final C40546f f103527g;

    /* renamed from: h */
    public final Handler f103528h;

    /* renamed from: i */
    public final C40609q f103529i;
    @C0363p0

    /* renamed from: j */
    public IBinder f103530j;

    /* renamed from: k */
    public boolean f103531k;
    @C0363p0

    /* renamed from: l */
    public String f103532l;
    @C0363p0

    /* renamed from: m */
    public String f103533m;

    @C40473a
    public C40604p(@C0359n0 Context context, @C0359n0 Looper looper, @C0359n0 ComponentName componentName, @C0359n0 C40546f fVar, @C0359n0 C40609q qVar) {
        this(context, looper, (String) null, (String) null, componentName, fVar, qVar);
    }

    /* renamed from: A */
    public final void mo134003A(@C0363p0 String str) {
        this.f103533m = str;
    }

    @C0348i1
    /* renamed from: B */
    public final void mo134004B() {
        if (Thread.currentThread() != this.f103528h.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @C0348i1
    /* renamed from: a */
    public final boolean mo133669a() {
        mo134004B();
        return this.f103530j != null;
    }

    /* renamed from: b */
    public final boolean mo133670b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo133671c() {
        return false;
    }

    @C0348i1
    /* renamed from: d */
    public final void mo133672d(@C0359n0 String str) {
        mo134004B();
        this.f103532l = str;
        mo133674f();
    }

    @C0348i1
    /* renamed from: e */
    public final boolean mo133673e() {
        mo134004B();
        return this.f103531k;
    }

    @C0348i1
    /* renamed from: f */
    public final void mo133674f() {
        mo134004B();
        String.valueOf(this.f103530j);
        try {
            this.f103526f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f103531k = false;
        this.f103530j = null;
    }

    @C0359n0
    /* renamed from: g */
    public final String mo133675g() {
        String str = this.f103523c;
        if (str != null) {
            return str;
        }
        C40843u.m166202l(this.f103525e);
        return this.f103525e.getPackageName();
    }

    @C0348i1
    /* renamed from: h */
    public final void mo133676h(@C0359n0 C40747e.C40750c cVar) {
        mo134004B();
        String.valueOf(this.f103530j);
        if (mo133669a()) {
            try {
                mo133672d("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f103525e;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f103523c).setAction(this.f103524d);
            }
            boolean bindService = this.f103526f.bindService(intent, this, C40773j.m165913c());
            this.f103531k = bindService;
            if (!bindService) {
                this.f103530j = null;
                this.f103529i.mo133896O0(new ConnectionResult(16));
            }
            String.valueOf(this.f103530j);
        } catch (SecurityException e) {
            this.f103531k = false;
            this.f103530j = null;
            throw e;
        }
    }

    @C0359n0
    /* renamed from: j */
    public final Feature[] mo133677j() {
        return new Feature[0];
    }

    /* renamed from: k */
    public final /* synthetic */ void mo134005k() {
        this.f103531k = false;
        this.f103530j = null;
        this.f103527g.mo133865H0(1);
    }

    /* renamed from: l */
    public final boolean mo133678l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo87660m() {
        return false;
    }

    @C0363p0
    /* renamed from: n */
    public final IBinder mo133679n() {
        return null;
    }

    @C0359n0
    /* renamed from: o */
    public final Set<Scope> mo133680o() {
        return Collections.emptySet();
    }

    public final void onServiceConnected(@C0359n0 ComponentName componentName, @C0359n0 IBinder iBinder) {
        this.f103528h.post(new C40590m2(this, iBinder));
    }

    public final void onServiceDisconnected(@C0359n0 ComponentName componentName) {
        this.f103528h.post(new C40585l2(this));
    }

    /* renamed from: p */
    public final void mo133681p(@C0363p0 C40785m mVar, @C0363p0 Set<Scope> set) {
    }

    /* renamed from: q */
    public final void mo133682q(@C0359n0 C40747e.C40752e eVar) {
    }

    /* renamed from: r */
    public final void mo133683r(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
    }

    /* renamed from: t */
    public final int mo87439t() {
        return 0;
    }

    @C0359n0
    /* renamed from: u */
    public final Feature[] mo133684u() {
        return new Feature[0];
    }

    @C0363p0
    /* renamed from: w */
    public final String mo133685w() {
        return this.f103532l;
    }

    @C0359n0
    /* renamed from: x */
    public final Intent mo133686x() {
        return new Intent();
    }

    @C0348i1
    @C0363p0
    @C40473a
    /* renamed from: y */
    public IBinder mo134008y() {
        mo134004B();
        return this.f103530j;
    }

    /* renamed from: z */
    public final /* synthetic */ void mo134009z(IBinder iBinder) {
        this.f103531k = false;
        this.f103530j = iBinder;
        String.valueOf(iBinder);
        this.f103527g.mo133866m0(new Bundle());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r6 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40604p(android.content.Context r2, android.os.Looper r3, @androidx.annotation.C0363p0 java.lang.String r4, @androidx.annotation.C0363p0 java.lang.String r5, @androidx.annotation.C0363p0 android.content.ComponentName r6, com.google.android.gms.common.api.internal.C40546f r7, com.google.android.gms.common.api.internal.C40609q r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f103531k = r0
            r0 = 0
            r1.f103532l = r0
            r1.f103526f = r2
            com.google.android.gms.internal.base.u r2 = new com.google.android.gms.internal.base.u
            r2.<init>(r3)
            r1.f103528h = r2
            r1.f103527g = r7
            r1.f103529i = r8
            if (r4 == 0) goto L_0x001e
            if (r5 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0027
            r6 = r0
            goto L_0x0020
        L_0x001e:
            if (r6 == 0) goto L_0x0027
        L_0x0020:
            r1.f103523c = r4
            r1.f103524d = r5
            r1.f103525e = r6
            return
        L_0x0027:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C40604p.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.q):void");
    }

    @C40473a
    public C40604p(@C0359n0 Context context, @C0359n0 Looper looper, @C0359n0 String str, @C0359n0 String str2, @C0359n0 C40546f fVar, @C0359n0 C40609q qVar) {
        this(context, looper, str, str2, (ComponentName) null, fVar, qVar);
    }
}
