package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.play.core.install.model.C32024d;
import com.google.android.play.core.install.model.C32025e;

/* renamed from: com.google.android.play.core.appupdate.v */
public final class C31889v extends C31865a {

    /* renamed from: a */
    public final String f77767a;

    /* renamed from: b */
    public final int f77768b;

    /* renamed from: c */
    public final int f77769c;

    /* renamed from: d */
    public final int f77770d;

    /* renamed from: e */
    public final Integer f77771e;

    /* renamed from: f */
    public final int f77772f;

    /* renamed from: g */
    public final long f77773g;

    /* renamed from: h */
    public final long f77774h;

    /* renamed from: i */
    public final long f77775i;

    /* renamed from: j */
    public final long f77776j;

    /* renamed from: k */
    public final PendingIntent f77777k;

    /* renamed from: l */
    public final PendingIntent f77778l;

    /* renamed from: m */
    public final PendingIntent f77779m;

    /* renamed from: n */
    public final PendingIntent f77780n;

    public C31889v(String str, int i, int i2, int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        String str2 = str;
        if (str2 != null) {
            this.f77767a = str2;
            this.f77768b = i;
            this.f77769c = i2;
            this.f77770d = i3;
            this.f77771e = num;
            this.f77772f = i4;
            this.f77773g = j;
            this.f77774h = j2;
            this.f77775i = j3;
            this.f77776j = j4;
            this.f77777k = pendingIntent;
            this.f77778l = pendingIntent2;
            this.f77779m = pendingIntent3;
            this.f77780n = pendingIntent4;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: b */
    public final int mo92380b() {
        return this.f77768b;
    }

    /* renamed from: c */
    public final long mo92381c() {
        return this.f77775i;
    }

    /* renamed from: d */
    public final long mo92382d() {
        return this.f77773g;
    }

    /* renamed from: e */
    public final long mo92383e() {
        return this.f77776j;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31865a) {
            C31865a aVar = (C31865a) obj;
            if (this.f77767a.equals(aVar.mo92394p()) && this.f77768b == aVar.mo92380b() && this.f77769c == aVar.mo92396r() && this.f77770d == aVar.mo92391m() && ((num = this.f77771e) != null ? num.equals(aVar.mo92384f()) : aVar.mo92384f() == null) && this.f77772f == aVar.mo92397s() && this.f77773g == aVar.mo92382d() && this.f77774h == aVar.mo92395q() && this.f77775i == aVar.mo92381c() && this.f77776j == aVar.mo92383e() && ((pendingIntent = this.f77777k) != null ? pendingIntent.equals(aVar.mo92385g()) : aVar.mo92385g() == null) && ((pendingIntent2 = this.f77778l) != null ? pendingIntent2.equals(aVar.mo92386h()) : aVar.mo92386h() == null) && ((pendingIntent3 = this.f77779m) != null ? pendingIntent3.equals(aVar.mo92387i()) : aVar.mo92387i() == null)) {
                PendingIntent pendingIntent4 = this.f77780n;
                PendingIntent j = aVar.mo92388j();
                if (pendingIntent4 != null ? pendingIntent4.equals(j) : j == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final Integer mo92384f() {
        return this.f77771e;
    }

    @Nullable
    /* renamed from: g */
    public final PendingIntent mo92385g() {
        return this.f77777k;
    }

    @Nullable
    /* renamed from: h */
    public final PendingIntent mo92386h() {
        return this.f77778l;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f77767a.hashCode() ^ 1000003) * 1000003) ^ this.f77768b) * 1000003) ^ this.f77769c) * 1000003) ^ this.f77770d) * 1000003;
        Integer num = this.f77771e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f77772f;
        long j = this.f77773g;
        long j2 = this.f77774h;
        long j3 = this.f77775i;
        long j4 = this.f77776j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f77777k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f77778l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f77779m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f77780n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Nullable
    /* renamed from: i */
    public final PendingIntent mo92387i() {
        return this.f77779m;
    }

    @Nullable
    /* renamed from: j */
    public final PendingIntent mo92388j() {
        return this.f77780n;
    }

    @C32024d
    /* renamed from: m */
    public final int mo92391m() {
        return this.f77770d;
    }

    @NonNull
    /* renamed from: p */
    public final String mo92394p() {
        return this.f77767a;
    }

    /* renamed from: q */
    public final long mo92395q() {
        return this.f77774h;
    }

    @C32025e
    /* renamed from: r */
    public final int mo92396r() {
        return this.f77769c;
    }

    /* renamed from: s */
    public final int mo92397s() {
        return this.f77772f;
    }

    public final String toString() {
        String str = this.f77767a;
        int i = this.f77768b;
        int i2 = this.f77769c;
        int i3 = this.f77770d;
        String valueOf = String.valueOf(this.f77771e);
        int i4 = this.f77772f;
        long j = this.f77773g;
        long j2 = this.f77774h;
        long j3 = this.f77775i;
        long j4 = this.f77776j;
        String valueOf2 = String.valueOf(this.f77777k);
        long j5 = j4;
        String valueOf3 = String.valueOf(this.f77778l);
        String valueOf4 = String.valueOf(this.f77779m);
        long j6 = j3;
        String valueOf5 = String.valueOf(this.f77780n);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j6);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
