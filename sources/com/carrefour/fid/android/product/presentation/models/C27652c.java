package com.carrefour.fid.android.product.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.models.c */
public final class C27652c {

    /* renamed from: b */
    public static final int f67178b = 0;
    @C12579k

    /* renamed from: a */
    public final String f67179a;

    public C27652c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "composition");
        this.f67179a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C27652c m116343c(C27652c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f67179a;
        }
        return cVar.mo80346b(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo80345a() {
        return this.f67179a;
    }

    @C12579k
    /* renamed from: b */
    public final C27652c mo80346b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "composition");
        return new C27652c(str);
    }

    @C12579k
    /* renamed from: d */
    public final String mo80347d() {
        return this.f67179a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27652c) && Intrinsics.areEqual((Object) this.f67179a, (Object) ((C27652c) obj).f67179a);
    }

    public int hashCode() {
        return this.f67179a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f67179a;
        return "Composition(composition=" + str + ")";
    }
}
