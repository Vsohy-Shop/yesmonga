package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.p7 */
public final class C41494p7 extends C41325i7 {

    /* renamed from: l */
    public static final Object f104859l = new Object();

    /* renamed from: m */
    public static C41494p7 f104860m;

    /* renamed from: a */
    public Context f104861a;

    /* renamed from: b */
    public C41300h6 f104862b;

    /* renamed from: c */
    public boolean f104863c = true;

    /* renamed from: d */
    public boolean f104864d = false;

    /* renamed from: e */
    public boolean f104865e = false;

    /* renamed from: f */
    public boolean f104866f = true;

    /* renamed from: g */
    public C41398l7 f104867g;

    /* renamed from: h */
    public C41517q6 f104868h;

    /* renamed from: i */
    public boolean f104869i = false;

    /* renamed from: j */
    public final C41349j7 f104870j = new C41349j7(this);

    /* renamed from: k */
    public volatile C41276g6 f104871k;

    /* renamed from: f */
    public static C41494p7 m168157f() {
        if (f104860m == null) {
            f104860m = new C41494p7();
        }
        return f104860m;
    }

    /* renamed from: a */
    public final synchronized void mo135489a() {
        if (!mo135714n()) {
            this.f104867g.zzb();
        }
    }

    /* renamed from: b */
    public final synchronized void mo135490b(boolean z) {
        mo135712j(this.f104869i, z);
    }

    /* renamed from: e */
    public final synchronized C41300h6 mo135710e() {
        if (this.f104862b == null) {
            Context context = this.f104861a;
            if (context != null) {
                this.f104862b = new C41589t6(this.f104870j, context, (byte[]) null);
            } else {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
        }
        if (this.f104867g == null) {
            C41470o7 o7Var = new C41470o7(this, (C41446n7) null);
            this.f104867g = o7Var;
            o7Var.mo135617a(1800000);
        }
        this.f104864d = true;
        if (this.f104863c) {
            mo135711i();
            this.f104863c = false;
        }
        if (this.f104868h == null) {
            C41517q6 q6Var = new C41517q6(this);
            this.f104868h = q6Var;
            Context context2 = this.f104861a;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context2.registerReceiver(q6Var, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context2.getPackageName());
            context2.registerReceiver(q6Var, intentFilter2);
        }
        return this.f104862b;
    }

    /* renamed from: i */
    public final synchronized void mo135711i() {
        if (!this.f104864d) {
            C41493p6.m168152d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f104863c = true;
        } else if (!this.f104865e) {
            this.f104865e = true;
            this.f104871k.mo135403e(new C41374k7(this));
        }
    }

    @C40974d0
    /* renamed from: j */
    public final synchronized void mo135712j(boolean z, boolean z2) {
        boolean n = mo135714n();
        this.f104869i = z;
        this.f104866f = z2;
        if (mo135714n() == n) {
            return;
        }
        if (mo135714n()) {
            this.f104867g.zza();
            C41493p6.m168152d("PowerSaveMode initiated.");
            return;
        }
        this.f104867g.mo135617a(1800000);
        C41493p6.m168152d("PowerSaveMode terminated.");
    }

    /* renamed from: m */
    public final synchronized void mo135713m(Context context, C41276g6 g6Var) {
        if (this.f104861a == null) {
            this.f104861a = context.getApplicationContext();
            if (this.f104871k == null) {
                this.f104871k = g6Var;
            }
        }
    }

    /* renamed from: n */
    public final boolean mo135714n() {
        return this.f104869i || !this.f104866f;
    }
}
