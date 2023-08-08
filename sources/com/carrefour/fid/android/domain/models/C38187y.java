package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.y */
public final class C38187y {

    /* renamed from: e */
    public static final int f96751e = 8;
    @C12579k

    /* renamed from: a */
    public final String f96752a;
    @C12579k

    /* renamed from: b */
    public final String f96753b;
    @C12580l

    /* renamed from: c */
    public final List<String> f96754c;
    @C12580l

    /* renamed from: d */
    public final C38188z f96755d;

    public C38187y(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l C38188z zVar) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        this.f96752a = str;
        this.f96753b = str2;
        this.f96754c = list;
        this.f96755d = zVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C38187y m158376f(C38187y yVar, String str, String str2, List<String> list, C38188z zVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yVar.f96752a;
        }
        if ((i & 2) != 0) {
            str2 = yVar.f96753b;
        }
        if ((i & 4) != 0) {
            list = yVar.f96754c;
        }
        if ((i & 8) != 0) {
            zVar = yVar.f96755d;
        }
        return yVar.mo119596e(str, str2, list, zVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo119592a() {
        return this.f96752a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo119593b() {
        return this.f96753b;
    }

    @C12580l
    /* renamed from: c */
    public final List<String> mo119594c() {
        return this.f96754c;
    }

    @C12580l
    /* renamed from: d */
    public final C38188z mo119595d() {
        return this.f96755d;
    }

    @C12579k
    /* renamed from: e */
    public final C38187y mo119596e(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l C38188z zVar) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        return new C38187y(str, str2, list, zVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38187y)) {
            return false;
        }
        C38187y yVar = (C38187y) obj;
        return Intrinsics.areEqual((Object) this.f96752a, (Object) yVar.f96752a) && Intrinsics.areEqual((Object) this.f96753b, (Object) yVar.f96753b) && Intrinsics.areEqual((Object) this.f96754c, (Object) yVar.f96754c) && Intrinsics.areEqual((Object) this.f96755d, (Object) yVar.f96755d);
    }

    @C12580l
    /* renamed from: g */
    public final C38188z mo119598g() {
        return this.f96755d;
    }

    @C12579k
    /* renamed from: h */
    public final String mo119599h() {
        return this.f96752a;
    }

    public int hashCode() {
        int hashCode = ((this.f96752a.hashCode() * 31) + this.f96753b.hashCode()) * 31;
        List<String> list = this.f96754c;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        C38188z zVar = this.f96755d;
        if (zVar != null) {
            i = zVar.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final List<String> mo119601i() {
        return this.f96754c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119602j() {
        return this.f96753b;
    }

    @C12579k
    public String toString() {
        String str = this.f96752a;
        String str2 = this.f96753b;
        List<String> list = this.f96754c;
        C38188z zVar = this.f96755d;
        return "SuggestionDomain(highlight=" + str + ", text=" + str2 + ", matches=" + list + ", facetFilter=" + zVar + ")";
    }
}
