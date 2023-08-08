package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.C40473a;
import com.google.mlkit.common.internal.model.C33904c;

/* renamed from: com.google.mlkit.common.internal.model.b */
public final class C33903b extends C33904c.C33906b {

    /* renamed from: a */
    public final long f82285a;

    /* renamed from: b */
    public final String f82286b;

    /* renamed from: c */
    public final boolean f82287c;

    public C33903b(long j, String str, boolean z) {
        this.f82285a = j;
        this.f82286b = str;
        this.f82287c = z;
    }

    @C40473a
    /* renamed from: a */
    public String mo98636a() {
        return this.f82286b;
    }

    @C40473a
    /* renamed from: b */
    public long mo98637b() {
        return this.f82285a;
    }

    @C40473a
    /* renamed from: c */
    public boolean mo98638c() {
        return this.f82287c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33904c.C33906b) {
            C33904c.C33906b bVar = (C33904c.C33906b) obj;
            if (this.f82285a == bVar.mo98637b() && this.f82286b.equals(bVar.mo98636a()) && this.f82287c == bVar.mo98638c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.f82285a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f82286b.hashCode()) * 1000003;
        if (true != this.f82287c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        long j = this.f82285a;
        String str = this.f82286b;
        boolean z = this.f82287c;
        StringBuilder sb = new StringBuilder(str.length() + 71);
        sb.append("ModelLoggingInfo{size=");
        sb.append(j);
        sb.append(", hash=");
        sb.append(str);
        sb.append(", manifestModel=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
