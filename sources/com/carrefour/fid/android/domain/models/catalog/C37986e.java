package com.carrefour.fid.android.domain.models.catalog;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.catalog.e */
public final class C37986e extends C37976a {
    @C12579k

    /* renamed from: a */
    public final String f95594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37986e(@C12579k String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "url");
        this.f95594a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C37986e m156313c(C37986e eVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f95594a;
        }
        return eVar.mo117203b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117202a() {
        return this.f95594a;
    }

    @C12579k
    /* renamed from: b */
    public final C37986e mo117203b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new C37986e(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo117204d() {
        return this.f95594a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37986e) && Intrinsics.areEqual((Object) this.f95594a, (Object) ((C37986e) obj).f95594a);
    }

    public int hashCode() {
        return this.f95594a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95594a;
        return "OpenWebviewActionDomain(url=" + str + ")";
    }
}
