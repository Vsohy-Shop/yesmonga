package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.tagmanager.C31020t;
import java.util.Date;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.a6 */
public final class C41132a6 implements C40979g {

    /* renamed from: a */
    public final Bundle f104427a;

    /* renamed from: b */
    public final String f104428b;

    /* renamed from: c */
    public final Date f104429c;

    /* renamed from: d */
    public final String f104430d;

    /* renamed from: e */
    public Map<String, Object> f104431e;

    /* renamed from: f */
    public boolean f104432f;

    /* renamed from: g */
    public final C31020t f104433g;

    @C40974d0
    public C41132a6(@C0363p0 String str, @C0363p0 Bundle bundle, String str2, Date date, boolean z, C31020t tVar) {
        this.f104428b = str;
        this.f104427a = bundle == null ? new Bundle() : bundle;
        this.f104429c = date;
        this.f104430d = str2;
        this.f104432f = z;
        this.f104433g = tVar;
    }

    /* renamed from: a */
    public final long mo134768a() {
        return this.f104429c.getTime();
    }

    /* renamed from: b */
    public final long mo134769b() {
        return SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: c */
    public final long mo134770c() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final Bundle mo134997d() {
        return this.f104427a;
    }

    /* renamed from: e */
    public final String mo134998e() {
        return this.f104428b;
    }

    /* renamed from: f */
    public final String mo134999f() {
        return this.f104430d;
    }

    @C0348i1
    /* renamed from: g */
    public final Map<String, Object> mo135000g() {
        String str;
        if (this.f104431e == null) {
            try {
                this.f104431e = this.f104433g.zzb();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Error calling measurement proxy:".concat(valueOf);
                } else {
                    str = new String("Error calling measurement proxy:");
                }
                C41493p6.m168149a(str);
            }
        }
        return this.f104431e;
    }

    /* renamed from: h */
    public final void mo135001h(boolean z) {
        this.f104432f = false;
    }

    /* renamed from: i */
    public final boolean mo135002i() {
        return this.f104432f;
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
