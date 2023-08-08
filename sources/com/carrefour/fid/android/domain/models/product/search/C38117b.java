package com.carrefour.fid.android.domain.models.product.search;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.search.b */
public final class C38117b {
    @C12579k

    /* renamed from: a */
    public final String f96457a;
    @C12579k

    /* renamed from: b */
    public final String f96458b;
    @C12580l

    /* renamed from: c */
    public final List<String> f96459c;
    @C12580l

    /* renamed from: d */
    public final C38118c f96460d;

    public C38117b(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l C38118c cVar) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        this.f96457a = str;
        this.f96458b = str2;
        this.f96459c = list;
        this.f96460d = cVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C38117b m157764f(C38117b bVar, String str, String str2, List<String> list, C38118c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f96457a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f96458b;
        }
        if ((i & 4) != 0) {
            list = bVar.f96459c;
        }
        if ((i & 8) != 0) {
            cVar = bVar.f96460d;
        }
        return bVar.mo118902e(str, str2, list, cVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118898a() {
        return this.f96457a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118899b() {
        return this.f96458b;
    }

    @C12580l
    /* renamed from: c */
    public final List<String> mo118900c() {
        return this.f96459c;
    }

    @C12580l
    /* renamed from: d */
    public final C38118c mo118901d() {
        return this.f96460d;
    }

    @C12579k
    /* renamed from: e */
    public final C38117b mo118902e(@C12579k String str, @C12579k String str2, @C12580l List<String> list, @C12580l C38118c cVar) {
        Intrinsics.checkNotNullParameter(str, "highlight");
        Intrinsics.checkNotNullParameter(str2, "text");
        return new C38117b(str, str2, list, cVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38117b)) {
            return false;
        }
        C38117b bVar = (C38117b) obj;
        return Intrinsics.areEqual((Object) this.f96457a, (Object) bVar.f96457a) && Intrinsics.areEqual((Object) this.f96458b, (Object) bVar.f96458b) && Intrinsics.areEqual((Object) this.f96459c, (Object) bVar.f96459c) && Intrinsics.areEqual((Object) this.f96460d, (Object) bVar.f96460d);
    }

    @C12580l
    /* renamed from: g */
    public final C38118c mo118904g() {
        return this.f96460d;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118905h() {
        return this.f96457a;
    }

    public int hashCode() {
        int hashCode = ((this.f96457a.hashCode() * 31) + this.f96458b.hashCode()) * 31;
        List<String> list = this.f96459c;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        C38118c cVar = this.f96460d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final List<String> mo118907i() {
        return this.f96459c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo118908j() {
        return this.f96458b;
    }

    @C12579k
    public String toString() {
        String str = this.f96457a;
        String str2 = this.f96458b;
        List<String> list = this.f96459c;
        C38118c cVar = this.f96460d;
        return "SuggestionData(highlight=" + str + ", text=" + str2 + ", matches=" + list + ", facetFilter=" + cVar + ")";
    }
}
