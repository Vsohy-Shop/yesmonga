package com.google.android.gms.common;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.C32488a;
import java.util.List;

/* renamed from: com.google.android.gms.common.w0 */
public final class C41004w0 {
    @C0363p0

    /* renamed from: a */
    public String f104263a = null;

    /* renamed from: b */
    public long f104264b = -1;

    /* renamed from: c */
    public zzag f104265c = zzag.m167017Q();

    /* renamed from: d */
    public zzag f104266d = zzag.m167017Q();

    @C32488a
    /* renamed from: a */
    public final C41004w0 mo134774a(long j) {
        this.f104264b = j;
        return this;
    }

    @C32488a
    /* renamed from: b */
    public final C41004w0 mo134775b(List list) {
        C40843u.m166202l(list);
        this.f104266d = zzag.m167016M(list);
        return this;
    }

    @C32488a
    /* renamed from: c */
    public final C41004w0 mo134776c(List list) {
        C40843u.m166202l(list);
        this.f104265c = zzag.m167016M(list);
        return this;
    }

    @C32488a
    /* renamed from: d */
    public final C41004w0 mo134777d(String str) {
        this.f104263a = str;
        return this;
    }

    /* renamed from: e */
    public final C41010y mo134778e() {
        if (this.f104263a == null) {
            throw new IllegalStateException("packageName must be defined");
        } else if (this.f104264b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        } else if (!this.f104265c.isEmpty() || !this.f104266d.isEmpty()) {
            return new C41010y(this.f104263a, this.f104264b, this.f104265c, this.f104266d, (C41009x) null);
        } else {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
