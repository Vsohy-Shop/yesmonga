package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.o2 */
public final class C31968o2 {

    /* renamed from: a */
    public final String f78018a;

    /* renamed from: b */
    public final long f78019b;

    /* renamed from: c */
    public final int f78020c;

    /* renamed from: d */
    public final boolean f78021d;

    /* renamed from: e */
    public final boolean f78022e;

    /* renamed from: f */
    public final byte[] f78023f;

    public C31968o2() {
    }

    /* renamed from: a */
    public static C31968o2 m129601a(@Nullable String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C31968o2(str, j, i, z, z2, bArr);
    }

    /* renamed from: b */
    public final boolean mo92650b() {
        if (mo92652d() == null) {
            return false;
        }
        return mo92652d().endsWith("/");
    }

    /* renamed from: c */
    public final boolean mo92651c() {
        return mo92655f() == 0;
    }

    @Nullable
    /* renamed from: d */
    public String mo92652d() {
        return this.f78018a;
    }

    /* renamed from: e */
    public long mo92653e() {
        return this.f78019b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31968o2) {
            C31968o2 o2Var = (C31968o2) obj;
            String str = this.f78018a;
            if (str != null ? str.equals(o2Var.mo92652d()) : o2Var.mo92652d() == null) {
                return this.f78019b == o2Var.mo92653e() && this.f78020c == o2Var.mo92655f() && this.f78021d == o2Var.mo92656g() && this.f78022e == o2Var.mo92657h() && Arrays.equals(this.f78023f, o2Var.f78023f);
            }
        }
    }

    /* renamed from: f */
    public int mo92655f() {
        return this.f78020c;
    }

    /* renamed from: g */
    public boolean mo92656g() {
        return this.f78021d;
    }

    /* renamed from: h */
    public boolean mo92657h() {
        return this.f78022e;
    }

    public int hashCode() {
        String str = this.f78018a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f78019b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f78020c) * 1000003) ^ (true != this.f78021d ? 1237 : 1231)) * 1000003;
        if (true == this.f78022e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f78023f);
    }

    @Nullable
    /* renamed from: i */
    public byte[] mo92659i() {
        return this.f78023f;
    }

    public String toString() {
        String str = this.f78018a;
        long j = this.f78019b;
        int i = this.f78020c;
        boolean z = this.f78021d;
        boolean z2 = this.f78022e;
        String arrays = Arrays.toString(this.f78023f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }

    public C31968o2(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this();
        this.f78018a = str;
        this.f78019b = j;
        this.f78020c = i;
        this.f78021d = z;
        this.f78022e = z2;
        this.f78023f = bArr;
    }
}
