package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.t */
public final class C38528t {

    /* renamed from: b */
    public static final int f97663b = 0;
    @C12579k

    /* renamed from: a */
    public final String f97664a;

    public C38528t(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        this.f97664a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C38528t m159817c(C38528t tVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tVar.f97664a;
        }
        return tVar.mo122158b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo122157a() {
        return this.f97664a;
    }

    @C12579k
    /* renamed from: b */
    public final C38528t mo122158b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        return new C38528t(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo122159d() {
        return this.f97664a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38528t) && Intrinsics.areEqual((Object) this.f97664a, (Object) ((C38528t) obj).f97664a);
    }

    public int hashCode() {
        return this.f97664a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f97664a;
        return "SuggestionFacetFilterModel(category=" + str + ")";
    }
}
