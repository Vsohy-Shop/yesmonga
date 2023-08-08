package com.carrefour.fid.android.domain.models.product.plp;

import com.carrefour.fid.android.domain.models.C38184v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.plp.a */
public final class C38113a implements C38184v {
    @C12579k

    /* renamed from: a */
    public final String f96428a;

    /* renamed from: b */
    public final int f96429b;

    public C38113a(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "label");
        this.f96428a = str;
        this.f96429b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C38113a m157698d(C38113a aVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.f96428a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f96429b;
        }
        return aVar.mo118826c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118824a() {
        return this.f96428a;
    }

    /* renamed from: b */
    public final int mo118825b() {
        return this.f96429b;
    }

    @C12579k
    /* renamed from: c */
    public final C38113a mo118826c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "label");
        return new C38113a(str, i);
    }

    /* renamed from: e */
    public final int mo118827e() {
        return this.f96429b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38113a)) {
            return false;
        }
        C38113a aVar = (C38113a) obj;
        return Intrinsics.areEqual((Object) this.f96428a, (Object) aVar.f96428a) && this.f96429b == aVar.f96429b;
    }

    @C12579k
    /* renamed from: f */
    public final String mo118829f() {
        return this.f96428a;
    }

    public int hashCode() {
        return (this.f96428a.hashCode() * 31) + Integer.hashCode(this.f96429b);
    }

    @C12579k
    public String toString() {
        String str = this.f96428a;
        int i = this.f96429b;
        return "CategoryHeader(label=" + str + ", count=" + i + ")";
    }
}
