package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.C32022b;

/* renamed from: com.google.android.play.core.appupdate.x */
public final class C31891x extends C31870e {

    /* renamed from: a */
    public final int f77783a;

    /* renamed from: b */
    public final boolean f77784b;

    public /* synthetic */ C31891x(int i, boolean z) {
        this.f77783a = i;
        this.f77784b = z;
    }

    /* renamed from: a */
    public final boolean mo92409a() {
        return this.f77784b;
    }

    @C32022b
    /* renamed from: b */
    public final int mo92410b() {
        return this.f77783a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31870e) {
            C31870e eVar = (C31870e) obj;
            return this.f77783a == eVar.mo92410b() && this.f77784b == eVar.mo92409a();
        }
    }

    public final int hashCode() {
        return ((this.f77783a ^ 1000003) * 1000003) ^ (true != this.f77784b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f77783a;
        boolean z = this.f77784b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
