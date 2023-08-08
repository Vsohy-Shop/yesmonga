package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.a0 */
public final class C37941a0 {

    /* renamed from: c */
    public static final int f95392c = 8;
    @C12580l

    /* renamed from: a */
    public final List<C38187y> f95393a;
    @C12580l

    /* renamed from: b */
    public final List<C38187y> f95394b;

    public C37941a0(@C12580l List<C38187y> list, @C12580l List<C38187y> list2) {
        this.f95393a = list;
        this.f95394b = list2;
    }

    /* renamed from: d */
    public static /* synthetic */ C37941a0 m155835d(C37941a0 a0Var, List<C38187y> list, List<C38187y> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = a0Var.f95393a;
        }
        if ((i & 2) != 0) {
            list2 = a0Var.f95394b;
        }
        return a0Var.mo116638c(list, list2);
    }

    @C12580l
    /* renamed from: a */
    public final List<C38187y> mo116636a() {
        return this.f95393a;
    }

    @C12580l
    /* renamed from: b */
    public final List<C38187y> mo116637b() {
        return this.f95394b;
    }

    @C12579k
    /* renamed from: c */
    public final C37941a0 mo116638c(@C12580l List<C38187y> list, @C12580l List<C38187y> list2) {
        return new C37941a0(list, list2);
    }

    @C12580l
    /* renamed from: e */
    public final List<C38187y> mo116639e() {
        return this.f95393a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37941a0)) {
            return false;
        }
        C37941a0 a0Var = (C37941a0) obj;
        return Intrinsics.areEqual((Object) this.f95393a, (Object) a0Var.f95393a) && Intrinsics.areEqual((Object) this.f95394b, (Object) a0Var.f95394b);
    }

    @C12580l
    /* renamed from: f */
    public final List<C38187y> mo116641f() {
        return this.f95394b;
    }

    public int hashCode() {
        List<C38187y> list = this.f95393a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C38187y> list2 = this.f95394b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<C38187y> list = this.f95393a;
        List<C38187y> list2 = this.f95394b;
        return "SuggestionListDomain(filteredSuggestion=" + list + ", suggestions=" + list2 + ")";
    }
}
