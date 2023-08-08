package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.j */
public final class C38040j {

    /* renamed from: g */
    public static final int f95886g = 8;
    @C12579k

    /* renamed from: a */
    public final String f95887a;
    @C12579k

    /* renamed from: b */
    public final String f95888b;

    /* renamed from: c */
    public final int f95889c;
    @C12579k

    /* renamed from: d */
    public final List<C37954b0> f95890d;
    @C12579k

    /* renamed from: e */
    public final String f95891e;

    /* renamed from: f */
    public final boolean f95892f;

    public C38040j(@C12579k String str, @C12579k String str2, int i, @C12579k List<C37954b0> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        this.f95887a = str;
        this.f95888b = str2;
        this.f95889c = i;
        this.f95890d = list;
        this.f95891e = str3;
        this.f95892f = z;
    }

    /* renamed from: h */
    public static /* synthetic */ C38040j m156850h(C38040j jVar, String str, String str2, int i, List<C37954b0> list, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jVar.f95887a;
        }
        if ((i2 & 2) != 0) {
            str2 = jVar.f95888b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = jVar.f95889c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = jVar.f95890d;
        }
        List<C37954b0> list2 = list;
        if ((i2 & 16) != 0) {
            str3 = jVar.f95891e;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            z = jVar.f95892f;
        }
        return jVar.mo117771g(str, str4, i3, list2, str5, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117764a() {
        return this.f95887a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117765b() {
        return this.f95888b;
    }

    /* renamed from: c */
    public final int mo117766c() {
        return this.f95889c;
    }

    @C12579k
    /* renamed from: d */
    public final List<C37954b0> mo117767d() {
        return this.f95890d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117768e() {
        return this.f95891e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38040j)) {
            return false;
        }
        C38040j jVar = (C38040j) obj;
        return Intrinsics.areEqual((Object) this.f95887a, (Object) jVar.f95887a) && Intrinsics.areEqual((Object) this.f95888b, (Object) jVar.f95888b) && this.f95889c == jVar.f95889c && Intrinsics.areEqual((Object) this.f95890d, (Object) jVar.f95890d) && Intrinsics.areEqual((Object) this.f95891e, (Object) jVar.f95891e) && this.f95892f == jVar.f95892f;
    }

    /* renamed from: f */
    public final boolean mo117770f() {
        return this.f95892f;
    }

    @C12579k
    /* renamed from: g */
    public final C38040j mo117771g(@C12579k String str, @C12579k String str2, int i, @C12579k List<C37954b0> list, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(list, "topTerms");
        Intrinsics.checkNotNullParameter(str3, "field");
        return new C38040j(str, str2, i, list, str3, z);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f95887a.hashCode() * 31) + this.f95888b.hashCode()) * 31) + Integer.hashCode(this.f95889c)) * 31) + this.f95890d.hashCode()) * 31) + this.f95891e.hashCode()) * 31;
        boolean z = this.f95892f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo117773i() {
        return this.f95891e;
    }

    @C12579k
    /* renamed from: j */
    public final String mo117774j() {
        return this.f95887a;
    }

    /* renamed from: k */
    public final boolean mo117775k() {
        return this.f95892f;
    }

    @C12579k
    /* renamed from: l */
    public final List<C37954b0> mo117776l() {
        return this.f95890d;
    }

    /* renamed from: m */
    public final int mo117777m() {
        return this.f95889c;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117778n() {
        return this.f95888b;
    }

    @C12579k
    public String toString() {
        String str = this.f95887a;
        String str2 = this.f95888b;
        int i = this.f95889c;
        List<C37954b0> list = this.f95890d;
        String str3 = this.f95891e;
        boolean z = this.f95892f;
        return "FacetDomain(name=" + str + ", type=" + str2 + ", totalTerms=" + i + ", topTerms=" + list + ", field=" + str3 + ", selected=" + z + ")";
    }
}
