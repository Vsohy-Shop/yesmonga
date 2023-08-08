package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.a */
public final class C39398a {
    @C33608c("x")

    /* renamed from: a */
    public final int f100755a;
    @C33608c("y")

    /* renamed from: b */
    public final int f100756b;
    @C33608c("height")

    /* renamed from: c */
    public final int f100757c;
    @C33608c("width")

    /* renamed from: d */
    public final int f100758d;
    @C33608c("product")
    @C12580l

    /* renamed from: e */
    public final C39400c f100759e;

    public C39398a() {
        this(0, 0, 0, 0, (C39400c) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C39398a m161455g(C39398a aVar, int i, int i2, int i3, int i4, C39400c cVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aVar.f100755a;
        }
        if ((i5 & 2) != 0) {
            i2 = aVar.f100756b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = aVar.f100757c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = aVar.f100758d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            cVar = aVar.f100759e;
        }
        return aVar.mo130410f(i, i6, i7, i8, cVar);
    }

    /* renamed from: a */
    public final int mo130404a() {
        return this.f100755a;
    }

    /* renamed from: b */
    public final int mo130405b() {
        return this.f100756b;
    }

    /* renamed from: c */
    public final int mo130406c() {
        return this.f100757c;
    }

    /* renamed from: d */
    public final int mo130407d() {
        return this.f100758d;
    }

    @C12580l
    /* renamed from: e */
    public final C39400c mo130408e() {
        return this.f100759e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39398a)) {
            return false;
        }
        C39398a aVar = (C39398a) obj;
        return this.f100755a == aVar.f100755a && this.f100756b == aVar.f100756b && this.f100757c == aVar.f100757c && this.f100758d == aVar.f100758d && Intrinsics.areEqual((Object) this.f100759e, (Object) aVar.f100759e);
    }

    @C12579k
    /* renamed from: f */
    public final C39398a mo130410f(int i, int i2, int i3, int i4, @C12580l C39400c cVar) {
        return new C39398a(i, i2, i3, i4, cVar);
    }

    /* renamed from: h */
    public final int mo130411h() {
        return this.f100757c;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f100755a) * 31) + Integer.hashCode(this.f100756b)) * 31) + Integer.hashCode(this.f100757c)) * 31) + Integer.hashCode(this.f100758d)) * 31;
        C39400c cVar = this.f100759e;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @C12580l
    /* renamed from: i */
    public final C39400c mo130413i() {
        return this.f100759e;
    }

    /* renamed from: j */
    public final int mo130414j() {
        return this.f100758d;
    }

    /* renamed from: k */
    public final int mo130415k() {
        return this.f100755a;
    }

    /* renamed from: l */
    public final int mo130416l() {
        return this.f100756b;
    }

    @C12579k
    public String toString() {
        int i = this.f100755a;
        int i2 = this.f100756b;
        int i3 = this.f100757c;
        int i4 = this.f100758d;
        C39400c cVar = this.f100759e;
        return "CatalogAreaResponse(x=" + i + ", y=" + i2 + ", height=" + i3 + ", width=" + i4 + ", product=" + cVar + ")";
    }

    public C39398a(int i, int i2, int i3, int i4, @C12580l C39400c cVar) {
        this.f100755a = i;
        this.f100756b = i2;
        this.f100757c = i3;
        this.f100758d = i4;
        this.f100759e = cVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39398a(int r4, int r5, int r6, int r7, com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39400c r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r7
        L_0x001c:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.C39398a.<init>(int, int, int, int, com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
