package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.z */
public final class C38188z {

    /* renamed from: b */
    public static final int f96756b = 0;
    @C12580l

    /* renamed from: a */
    public final String f96757a;

    public C38188z(@C12580l String str) {
        this.f96757a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C38188z m158386c(C38188z zVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zVar.f96757a;
        }
        return zVar.mo119605b(str);
    }

    @C12580l
    /* renamed from: a */
    public final String mo119604a() {
        return this.f96757a;
    }

    @C12579k
    /* renamed from: b */
    public final C38188z mo119605b(@C12580l String str) {
        return new C38188z(str);
    }

    @C12580l
    /* renamed from: d */
    public final String mo119606d() {
        return this.f96757a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38188z) && Intrinsics.areEqual((Object) this.f96757a, (Object) ((C38188z) obj).f96757a);
    }

    public int hashCode() {
        String str = this.f96757a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f96757a;
        return "SuggestionFacetFilterDomain(category=" + str + ")";
    }
}
