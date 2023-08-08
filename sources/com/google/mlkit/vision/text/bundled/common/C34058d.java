package com.google.mlkit.vision.text.bundled.common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsa;

/* renamed from: com.google.mlkit.vision.text.bundled.common.d */
public final class C34058d extends C34074t {

    /* renamed from: a */
    public final C34075u f82697a;

    /* renamed from: b */
    public final zbsa f82698b;

    /* renamed from: c */
    public final boolean f82699c;

    public C34058d(C34075u uVar, zbsa zbsa, boolean z) {
        this.f82697a = uVar;
        this.f82698b = zbsa;
        this.f82699c = z;
    }

    /* renamed from: a */
    public final zbsa mo99022a() {
        return this.f82698b;
    }

    /* renamed from: b */
    public final C34075u mo99023b() {
        return this.f82697a;
    }

    /* renamed from: c */
    public final boolean mo99024c() {
        return this.f82699c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34074t) {
            C34074t tVar = (C34074t) obj;
            if (!this.f82697a.equals(tVar.mo99023b()) || !this.f82698b.equals(tVar.mo99022a()) || this.f82699c != tVar.mo99024c()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f82697a.hashCode() ^ 1000003) * 1000003) ^ this.f82698b.hashCode()) * 1000003;
        if (true != this.f82699c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82697a);
        String valueOf2 = String.valueOf(this.f82698b);
        boolean z = this.f82699c;
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + valueOf2.length());
        sb.append("VkpResults{status=");
        sb.append(valueOf);
        sb.append(", textParcel=");
        sb.append(valueOf2);
        sb.append(", fromColdCall=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
