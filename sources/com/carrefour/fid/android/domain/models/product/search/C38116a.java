package com.carrefour.fid.android.domain.models.product.search;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.search.a */
public final class C38116a {
    @C12580l

    /* renamed from: a */
    public final List<C38117b> f96455a;
    @C12580l

    /* renamed from: b */
    public final List<C38117b> f96456b;

    public C38116a(@C12580l List<C38117b> list, @C12580l List<C38117b> list2) {
        this.f96455a = list;
        this.f96456b = list2;
    }

    /* renamed from: d */
    public static /* synthetic */ C38116a m157758d(C38116a aVar, List<C38117b> list, List<C38117b> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f96455a;
        }
        if ((i & 2) != 0) {
            list2 = aVar.f96456b;
        }
        return aVar.mo118892c(list, list2);
    }

    @C12580l
    /* renamed from: a */
    public final List<C38117b> mo118890a() {
        return this.f96455a;
    }

    @C12580l
    /* renamed from: b */
    public final List<C38117b> mo118891b() {
        return this.f96456b;
    }

    @C12579k
    /* renamed from: c */
    public final C38116a mo118892c(@C12580l List<C38117b> list, @C12580l List<C38117b> list2) {
        return new C38116a(list, list2);
    }

    @C12580l
    /* renamed from: e */
    public final List<C38117b> mo118893e() {
        return this.f96455a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38116a)) {
            return false;
        }
        C38116a aVar = (C38116a) obj;
        return Intrinsics.areEqual((Object) this.f96455a, (Object) aVar.f96455a) && Intrinsics.areEqual((Object) this.f96456b, (Object) aVar.f96456b);
    }

    @C12580l
    /* renamed from: f */
    public final List<C38117b> mo118895f() {
        return this.f96456b;
    }

    public int hashCode() {
        List<C38117b> list = this.f96455a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C38117b> list2 = this.f96456b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<C38117b> list = this.f96455a;
        List<C38117b> list2 = this.f96456b;
        return "SearchSuggestionData(filteredSuggestion=" + list + ", suggestions=" + list2 + ")";
    }
}
