package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;
import com.google.android.play.core.assetpacks.model.C31959c;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
public final class C31926g0 extends C31899b {

    /* renamed from: b */
    public final int f77862b;

    /* renamed from: c */
    public final String f77863c;

    /* renamed from: d */
    public final String f77864d;

    public C31926g0(int i, @Nullable String str, @Nullable String str2) {
        this.f77862b = i;
        this.f77863c = str;
        this.f77864d = str2;
    }

    @Nullable
    /* renamed from: b */
    public final String mo92482b() {
        return this.f77864d;
    }

    @C31959c
    /* renamed from: d */
    public final int mo92483d() {
        return this.f77862b;
    }

    @Nullable
    /* renamed from: e */
    public final String mo92484e() {
        return this.f77863c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31899b) {
            C31899b bVar = (C31899b) obj;
            if (this.f77862b == bVar.mo92483d() && ((str = this.f77863c) != null ? str.equals(bVar.mo92484e()) : bVar.mo92484e() == null)) {
                String str2 = this.f77864d;
                String b = bVar.mo92482b();
                if (str2 != null ? str2.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f77862b ^ 1000003) * 1000003;
        String str = this.f77863c;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f77864d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f77862b;
        String str = this.f77863c;
        String str2 = this.f77864d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
