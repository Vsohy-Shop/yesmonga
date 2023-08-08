package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.n */
public final class C38167n {
    @C12579k

    /* renamed from: a */
    public final String f96688a;
    @C12579k

    /* renamed from: b */
    public final String f96689b;
    @C12579k

    /* renamed from: c */
    public final String f96690c;
    @C12579k

    /* renamed from: d */
    public final String f96691d;
    @C12580l

    /* renamed from: e */
    public final C38161j f96692e;

    public C38167n() {
        this((String) null, (String) null, (String) null, (String) null, (C38161j) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C38167n m158221g(C38167n nVar, String str, String str2, String str3, String str4, C38161j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.f96688a;
        }
        if ((i & 2) != 0) {
            str2 = nVar.f96689b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nVar.f96690c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = nVar.f96691d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            jVar = nVar.f96692e;
        }
        return nVar.mo119412f(str, str5, str6, str7, jVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo119406a() {
        return this.f96688a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119407b() {
        return this.f96689b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo119408c() {
        return this.f96690c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo119409d() {
        return this.f96691d;
    }

    @C12580l
    /* renamed from: e */
    public final C38161j mo119410e() {
        return this.f96692e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38167n)) {
            return false;
        }
        C38167n nVar = (C38167n) obj;
        return Intrinsics.areEqual((Object) this.f96688a, (Object) nVar.f96688a) && Intrinsics.areEqual((Object) this.f96689b, (Object) nVar.f96689b) && Intrinsics.areEqual((Object) this.f96690c, (Object) nVar.f96690c) && Intrinsics.areEqual((Object) this.f96691d, (Object) nVar.f96691d) && Intrinsics.areEqual((Object) this.f96692e, (Object) nVar.f96692e);
    }

    @C12579k
    /* renamed from: f */
    public final C38167n mo119412f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l C38161j jVar) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "code");
        return new C38167n(str, str2, str3, str4, jVar);
    }

    @C12579k
    /* renamed from: h */
    public final String mo119413h() {
        return this.f96691d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f96688a.hashCode() * 31) + this.f96689b.hashCode()) * 31) + this.f96690c.hashCode()) * 31) + this.f96691d.hashCode()) * 31;
        C38161j jVar = this.f96692e;
        return hashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    @C12579k
    /* renamed from: i */
    public final String mo119415i() {
        return this.f96690c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119416j() {
        return this.f96688a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo119417k() {
        return this.f96689b;
    }

    @C12580l
    /* renamed from: l */
    public final C38161j mo119418l() {
        return this.f96692e;
    }

    @C12579k
    public String toString() {
        String str = this.f96688a;
        String str2 = this.f96689b;
        String str3 = this.f96690c;
        String str4 = this.f96691d;
        C38161j jVar = this.f96692e;
        return "StoreServiceWithUrl(id=" + str + ", label=" + str2 + ", description=" + str3 + ", code=" + str4 + ", picto=" + jVar + ")";
    }

    public C38167n(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l C38161j jVar) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "code");
        this.f96688a = str;
        this.f96689b = str2;
        this.f96690c = str3;
        this.f96691d = str4;
        this.f96692e = jVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38167n(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.carrefour.fid.android.domain.models.service.models.C38161j r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.service.models.C38167n.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.service.models.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
