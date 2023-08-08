package com.google.android.play.core.assetpacks;

import com.contentsquare.android.api.C14092c;
import com.google.android.play.core.assetpacks.model.C31957a;
import com.google.android.play.core.assetpacks.model.C31958b;

/* renamed from: com.google.android.play.core.assetpacks.h0 */
public final class C31931h0 extends AssetPackState {

    /* renamed from: a */
    public final String f77879a;

    /* renamed from: b */
    public final int f77880b;

    /* renamed from: c */
    public final int f77881c;

    /* renamed from: d */
    public final long f77882d;

    /* renamed from: e */
    public final long f77883e;

    /* renamed from: f */
    public final int f77884f;

    /* renamed from: g */
    public final int f77885g;

    /* renamed from: h */
    public final String f77886h;

    public C31931h0(String str, int i, int i2, long j, long j2, int i3, int i4, String str2) {
        if (str != null) {
            this.f77879a = str;
            this.f77880b = i;
            this.f77881c = i2;
            this.f77882d = j;
            this.f77883e = j2;
            this.f77884f = i3;
            this.f77885g = i4;
            if (str2 != null) {
                this.f77886h = str2;
                return;
            }
            throw new NullPointerException("Null versionTag");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo92460a() {
        return this.f77885g;
    }

    /* renamed from: b */
    public final String mo92461b() {
        return this.f77886h;
    }

    /* renamed from: c */
    public final long mo92462c() {
        return this.f77882d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f77879a.equals(assetPackState.mo92464g()) && this.f77880b == assetPackState.mo92465h() && this.f77881c == assetPackState.mo92463f() && this.f77882d == assetPackState.mo92462c() && this.f77883e == assetPackState.mo92466i() && this.f77884f == assetPackState.mo92467j() && this.f77885g == assetPackState.mo92460a() && this.f77886h.equals(assetPackState.mo92461b());
        }
    }

    @C31957a
    /* renamed from: f */
    public final int mo92463f() {
        return this.f77881c;
    }

    /* renamed from: g */
    public final String mo92464g() {
        return this.f77879a;
    }

    @C31958b
    /* renamed from: h */
    public final int mo92465h() {
        return this.f77880b;
    }

    public final int hashCode() {
        int hashCode = this.f77879a.hashCode();
        int i = this.f77880b;
        int i2 = this.f77881c;
        long j = this.f77882d;
        long j2 = this.f77883e;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f77884f) * 1000003) ^ this.f77885g) * 1000003) ^ this.f77886h.hashCode();
    }

    /* renamed from: i */
    public final long mo92466i() {
        return this.f77883e;
    }

    /* renamed from: j */
    public final int mo92467j() {
        return this.f77884f;
    }

    public final String toString() {
        String str = this.f77879a;
        int i = this.f77880b;
        int i2 = this.f77881c;
        long j = this.f77882d;
        long j2 = this.f77883e;
        int i3 = this.f77884f;
        int i4 = this.f77885g;
        String str2 = this.f77886h;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + C14092c.f34599f0 + str2.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", versionTag=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
