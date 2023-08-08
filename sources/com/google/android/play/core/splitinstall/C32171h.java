package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.C32183a;
import com.google.android.play.core.splitinstall.model.C32184b;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.h */
public final class C32171h extends C32167f {

    /* renamed from: a */
    public final int f78411a;

    /* renamed from: b */
    public final int f78412b;

    /* renamed from: c */
    public final int f78413c;

    /* renamed from: d */
    public final long f78414d;

    /* renamed from: e */
    public final long f78415e;

    /* renamed from: f */
    public final List<String> f78416f;

    /* renamed from: g */
    public final List<String> f78417g;

    /* renamed from: h */
    public final PendingIntent f78418h;

    /* renamed from: i */
    public final List<Intent> f78419i;

    public C32171h(int i, int i2, int i3, long j, long j2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable PendingIntent pendingIntent, @Nullable List<Intent> list3) {
        this.f78411a = i;
        this.f78412b = i2;
        this.f78413c = i3;
        this.f78414d = j;
        this.f78415e = j2;
        this.f78416f = list;
        this.f78417g = list2;
        this.f78418h = pendingIntent;
        this.f78419i = list3;
    }

    @Nullable
    /* renamed from: a */
    public final List<String> mo92955a() {
        return this.f78416f;
    }

    @Nullable
    /* renamed from: b */
    public final List<String> mo92956b() {
        return this.f78417g;
    }

    /* renamed from: c */
    public final long mo92957c() {
        return this.f78414d;
    }

    @Nullable
    /* renamed from: d */
    public final List<Intent> mo92958d() {
        return this.f78419i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32167f) {
            C32167f fVar = (C32167f) obj;
            if (this.f78411a == fVar.mo92964l() && this.f78412b == fVar.mo92965m() && this.f78413c == fVar.mo92959g() && this.f78414d == fVar.mo92957c() && this.f78415e == fVar.mo92966n() && ((list = this.f78416f) != null ? list.equals(fVar.mo92955a()) : fVar.mo92955a() == null) && ((list2 = this.f78417g) != null ? list2.equals(fVar.mo92956b()) : fVar.mo92956b() == null) && ((pendingIntent = this.f78418h) != null ? pendingIntent.equals(fVar.mo92963k()) : fVar.mo92963k() == null)) {
                List<Intent> list3 = this.f78419i;
                List<Intent> d = fVar.mo92958d();
                if (list3 != null ? list3.equals(d) : d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @C32183a
    /* renamed from: g */
    public final int mo92959g() {
        return this.f78413c;
    }

    public final int hashCode() {
        int i = this.f78411a;
        int i2 = this.f78412b;
        int i3 = this.f78413c;
        long j = this.f78414d;
        long j2 = this.f78415e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f78416f;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f78417g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f78418h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f78419i;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    @Nullable
    @Deprecated
    /* renamed from: k */
    public final PendingIntent mo92963k() {
        return this.f78418h;
    }

    /* renamed from: l */
    public final int mo92964l() {
        return this.f78411a;
    }

    @C32184b
    /* renamed from: m */
    public final int mo92965m() {
        return this.f78412b;
    }

    /* renamed from: n */
    public final long mo92966n() {
        return this.f78415e;
    }

    public final String toString() {
        int i = this.f78411a;
        int i2 = this.f78412b;
        int i3 = this.f78413c;
        long j = this.f78414d;
        long j2 = this.f78415e;
        String valueOf = String.valueOf(this.f78416f);
        String valueOf2 = String.valueOf(this.f78417g);
        String valueOf3 = String.valueOf(this.f78418h);
        String valueOf4 = String.valueOf(this.f78419i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
