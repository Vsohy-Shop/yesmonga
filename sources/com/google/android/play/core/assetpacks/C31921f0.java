package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
public final class C31921f0 extends C31894a {

    /* renamed from: a */
    public final String f77847a;

    /* renamed from: b */
    public final long f77848b;

    /* renamed from: c */
    public final long f77849c;

    public C31921f0(String str, long j, long j2) {
        if (str != null) {
            this.f77847a = str;
            this.f77848b = j;
            this.f77849c = j2;
            return;
        }
        throw new NullPointerException("Null path");
    }

    /* renamed from: b */
    public final long mo92476b() {
        return this.f77848b;
    }

    /* renamed from: c */
    public final String mo92477c() {
        return this.f77847a;
    }

    /* renamed from: d */
    public final long mo92478d() {
        return this.f77849c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31894a) {
            C31894a aVar = (C31894a) obj;
            return this.f77847a.equals(aVar.mo92477c()) && this.f77848b == aVar.mo92476b() && this.f77849c == aVar.mo92478d();
        }
    }

    public final int hashCode() {
        int hashCode = this.f77847a.hashCode();
        long j = this.f77848b;
        long j2 = this.f77849c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f77847a;
        long j = this.f77848b;
        long j2 = this.f77849c;
        StringBuilder sb = new StringBuilder(str.length() + 76);
        sb.append("AssetLocation{path=");
        sb.append(str);
        sb.append(", offset=");
        sb.append(j);
        sb.append(", size=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
