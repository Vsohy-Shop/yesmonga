package com.carrefour.fid.android.domain.models.product.search;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.search.c */
public final class C38118c {
    @C12580l

    /* renamed from: a */
    public final String f96461a;

    public C38118c(@C12580l String str) {
        this.f96461a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C38118c m157774c(C38118c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f96461a;
        }
        return cVar.mo118911b(str);
    }

    @C12580l
    /* renamed from: a */
    public final String mo118910a() {
        return this.f96461a;
    }

    @C12579k
    /* renamed from: b */
    public final C38118c mo118911b(@C12580l String str) {
        return new C38118c(str);
    }

    @C12580l
    /* renamed from: d */
    public final String mo118912d() {
        return this.f96461a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38118c) && Intrinsics.areEqual((Object) this.f96461a, (Object) ((C38118c) obj).f96461a);
    }

    public int hashCode() {
        String str = this.f96461a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f96461a;
        return "SuggestionFacetFilterData(category=" + str + ")";
    }
}
