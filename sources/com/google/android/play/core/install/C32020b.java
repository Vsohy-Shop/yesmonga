package com.google.android.play.core.install;

import com.google.android.play.core.install.model.C32023c;
import com.google.android.play.core.install.model.C32024d;

/* renamed from: com.google.android.play.core.install.b */
public final class C32020b extends InstallState {

    /* renamed from: a */
    public final int f78216a;

    /* renamed from: b */
    public final long f78217b;

    /* renamed from: c */
    public final long f78218c;

    /* renamed from: d */
    public final int f78219d;

    /* renamed from: e */
    public final String f78220e;

    public C32020b(int i, long j, long j2, int i2, String str) {
        this.f78216a = i;
        this.f78217b = j;
        this.f78218c = j2;
        this.f78219d = i2;
        if (str != null) {
            this.f78220e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: b */
    public final long mo92717b() {
        return this.f78217b;
    }

    @C32023c
    /* renamed from: c */
    public final int mo92718c() {
        return this.f78219d;
    }

    @C32024d
    /* renamed from: d */
    public final int mo92719d() {
        return this.f78216a;
    }

    /* renamed from: e */
    public final String mo92720e() {
        return this.f78220e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f78216a == installState.mo92719d() && this.f78217b == installState.mo92717b() && this.f78218c == installState.mo92721f() && this.f78219d == installState.mo92718c() && this.f78220e.equals(installState.mo92720e());
        }
    }

    /* renamed from: f */
    public final long mo92721f() {
        return this.f78218c;
    }

    public final int hashCode() {
        int i = this.f78216a;
        long j = this.f78217b;
        long j2 = this.f78218c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f78219d) * 1000003) ^ this.f78220e.hashCode();
    }

    public final String toString() {
        int i = this.f78216a;
        long j = this.f78217b;
        long j2 = this.f78218c;
        int i2 = this.f78219d;
        String str = this.f78220e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
