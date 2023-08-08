package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
public final class C31941j0 extends C31920f {

    /* renamed from: a */
    public final long f77923a;

    /* renamed from: b */
    public final Map<String, AssetPackState> f77924b;

    public C31941j0(long j, Map<String, AssetPackState> map) {
        this.f77923a = j;
        this.f77924b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31920f) {
            C31920f fVar = (C31920f) obj;
            return this.f77923a == fVar.mo92555g() && this.f77924b.equals(fVar.mo92554f());
        }
    }

    /* renamed from: f */
    public final Map<String, AssetPackState> mo92554f() {
        return this.f77924b;
    }

    /* renamed from: g */
    public final long mo92555g() {
        return this.f77923a;
    }

    public final int hashCode() {
        long j = this.f77923a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f77924b.hashCode();
    }

    public final String toString() {
        long j = this.f77923a;
        String valueOf = String.valueOf(this.f77924b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
