package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
public final class C41982h6 extends C41929e7 {

    /* renamed from: a */
    public final Context f106175a;

    /* renamed from: b */
    public final C42124p7 f106176b;

    public C41982h6(Context context, @Nullable C42124p7 p7Var) {
        this.f106175a = context;
        this.f106176b = p7Var;
    }

    /* renamed from: a */
    public final Context mo136712a() {
        return this.f106175a;
    }

    @Nullable
    /* renamed from: b */
    public final C42124p7 mo136713b() {
        return this.f106176b;
    }

    public final boolean equals(Object obj) {
        C42124p7 p7Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41929e7) {
            C41929e7 e7Var = (C41929e7) obj;
            if (!this.f106175a.equals(e7Var.mo136712a()) || ((p7Var = this.f106176b) != null ? !p7Var.equals(e7Var.mo136713b()) : e7Var.mo136713b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f106175a.hashCode() ^ 1000003;
        C42124p7 p7Var = this.f106176b;
        if (p7Var == null) {
            i = 0;
        } else {
            i = p7Var.hashCode();
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String obj = this.f106175a.toString();
        String valueOf = String.valueOf(this.f106176b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
