package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C30911v3 {
    @C0359n0

    /* renamed from: a */
    public final String f74018a;
    @C0359n0

    /* renamed from: b */
    public final String f74019b;

    /* renamed from: c */
    public final long f74020c;
    @C0359n0

    /* renamed from: d */
    public final Bundle f74021d;

    public C30911v3(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Bundle bundle, long j) {
        this.f74018a = str;
        this.f74019b = str2;
        this.f74021d = bundle;
        this.f74020c = j;
    }

    /* renamed from: b */
    public static C30911v3 m124271b(zzaw zzaw) {
        return new C30911v3(zzaw.f74163a, zzaw.f74165c, zzaw.f74164b.mo87634W(), zzaw.f74166d);
    }

    /* renamed from: a */
    public final zzaw mo87552a() {
        return new zzaw(this.f74018a, new zzau(new Bundle(this.f74021d)), this.f74019b, this.f74020c);
    }

    public final String toString() {
        String str = this.f74019b;
        String str2 = this.f74018a;
        String obj = this.f74021d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
