package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
public final class C42158r7 implements C42124p7 {

    /* renamed from: c */
    public static final C42124p7 f106380c = C42141q7.f106367a;

    /* renamed from: a */
    public volatile C42124p7 f106381a;
    @CheckForNull

    /* renamed from: b */
    public Object f106382b;

    public C42158r7(C42124p7 p7Var) {
        p7Var.getClass();
        this.f106381a = p7Var;
    }

    public final String toString() {
        Object obj = this.f106381a;
        if (obj == f106380c) {
            obj = "<supplier that returned " + String.valueOf(this.f106382b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    public final Object zza() {
        C42124p7 p7Var = this.f106381a;
        C42124p7 p7Var2 = f106380c;
        if (p7Var != p7Var2) {
            synchronized (this) {
                if (this.f106381a != p7Var2) {
                    Object zza = this.f106381a.zza();
                    this.f106382b = zza;
                    this.f106381a = p7Var2;
                    return zza;
                }
            }
        }
        return this.f106382b;
    }
}
