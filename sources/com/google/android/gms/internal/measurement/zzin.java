package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;

final class zzin implements Serializable, C42124p7 {

    /* renamed from: a */
    public volatile transient boolean f106689a;
    @CheckForNull

    /* renamed from: b */
    public transient Object f106690b;
    final C42124p7 zza;

    public zzin(C42124p7 p7Var) {
        p7Var.getClass();
        this.zza = p7Var;
    }

    public final String toString() {
        Object obj;
        if (this.f106689a) {
            obj = "<supplier that returned " + String.valueOf(this.f106690b) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    public final Object zza() {
        if (!this.f106689a) {
            synchronized (this) {
                if (!this.f106689a) {
                    Object zza2 = this.zza.zza();
                    this.f106690b = zza2;
                    this.f106689a = true;
                    return zza2;
                }
            }
        }
        return this.f106690b;
    }
}
