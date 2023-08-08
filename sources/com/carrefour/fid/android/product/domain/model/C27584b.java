package com.carrefour.fid.android.product.domain.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.domain.model.b */
public final class C27584b {

    /* renamed from: i */
    public static final int f66997i = 8;
    @C12579k

    /* renamed from: a */
    public final List<C38115c> f66998a;

    /* renamed from: b */
    public final int f66999b;

    /* renamed from: c */
    public final int f67000c;

    /* renamed from: d */
    public final int f67001d;
    @C12580l

    /* renamed from: e */
    public final Integer f67002e;
    @C12580l

    /* renamed from: f */
    public final Integer f67003f;
    @C12580l

    /* renamed from: g */
    public final Facet f67004g;
    @C12580l

    /* renamed from: h */
    public final Integer f67005h;

    public C27584b(@C12579k List<C38115c> list, int i, int i2, int i3, @C12580l Integer num, @C12580l Integer num2, @C12580l Facet facet, @C12580l Integer num3) {
        Intrinsics.checkNotNullParameter(list, "products");
        this.f66998a = list;
        this.f66999b = i;
        this.f67000c = i2;
        this.f67001d = i3;
        this.f67002e = num;
        this.f67003f = num2;
        this.f67004g = facet;
        this.f67005h = num3;
    }

    /* renamed from: j */
    public static /* synthetic */ C27584b m116029j(C27584b bVar, List list, int i, int i2, int i3, Integer num, Integer num2, Facet facet, Integer num3, int i4, Object obj) {
        C27584b bVar2 = bVar;
        int i5 = i4;
        return bVar.mo80072i((i5 & 1) != 0 ? bVar2.f66998a : list, (i5 & 2) != 0 ? bVar2.f66999b : i, (i5 & 4) != 0 ? bVar2.f67000c : i2, (i5 & 8) != 0 ? bVar2.f67001d : i3, (i5 & 16) != 0 ? bVar2.f67002e : num, (i5 & 32) != 0 ? bVar2.f67003f : num2, (i5 & 64) != 0 ? bVar2.f67004g : facet, (i5 & 128) != 0 ? bVar2.f67005h : num3);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38115c> mo80062a() {
        return this.f66998a;
    }

    /* renamed from: b */
    public final int mo80063b() {
        return this.f66999b;
    }

    /* renamed from: c */
    public final int mo80064c() {
        return this.f67000c;
    }

    /* renamed from: d */
    public final int mo80065d() {
        return this.f67001d;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo80066e() {
        return this.f67002e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27584b)) {
            return false;
        }
        C27584b bVar = (C27584b) obj;
        return Intrinsics.areEqual((Object) this.f66998a, (Object) bVar.f66998a) && this.f66999b == bVar.f66999b && this.f67000c == bVar.f67000c && this.f67001d == bVar.f67001d && Intrinsics.areEqual((Object) this.f67002e, (Object) bVar.f67002e) && Intrinsics.areEqual((Object) this.f67003f, (Object) bVar.f67003f) && Intrinsics.areEqual((Object) this.f67004g, (Object) bVar.f67004g) && Intrinsics.areEqual((Object) this.f67005h, (Object) bVar.f67005h);
    }

    @C12580l
    /* renamed from: f */
    public final Integer mo80068f() {
        return this.f67003f;
    }

    @C12580l
    /* renamed from: g */
    public final Facet mo80069g() {
        return this.f67004g;
    }

    @C12580l
    /* renamed from: h */
    public final Integer mo80070h() {
        return this.f67005h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66998a.hashCode() * 31) + Integer.hashCode(this.f66999b)) * 31) + Integer.hashCode(this.f67000c)) * 31) + Integer.hashCode(this.f67001d)) * 31;
        Integer num = this.f67002e;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f67003f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Facet facet = this.f67004g;
        int hashCode4 = (hashCode3 + (facet == null ? 0 : facet.hashCode())) * 31;
        Integer num3 = this.f67005h;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    /* renamed from: i */
    public final C27584b mo80072i(@C12579k List<C38115c> list, int i, int i2, int i3, @C12580l Integer num, @C12580l Integer num2, @C12580l Facet facet, @C12580l Integer num3) {
        Intrinsics.checkNotNullParameter(list, "products");
        return new C27584b(list, i, i2, i3, num, num2, facet, num3);
    }

    /* renamed from: k */
    public final int mo80073k() {
        return this.f66999b;
    }

    @C12580l
    /* renamed from: l */
    public final Facet mo80074l() {
        return this.f67004g;
    }

    @C12580l
    /* renamed from: m */
    public final Integer mo80075m() {
        return this.f67002e;
    }

    /* renamed from: n */
    public final int mo80076n() {
        return this.f67000c;
    }

    @C12580l
    /* renamed from: o */
    public final Integer mo80077o() {
        return this.f67003f;
    }

    @C12579k
    /* renamed from: p */
    public final List<C38115c> mo80078p() {
        return this.f66998a;
    }

    @C12580l
    /* renamed from: q */
    public final Integer mo80079q() {
        return this.f67005h;
    }

    /* renamed from: r */
    public final int mo80080r() {
        return this.f67001d;
    }

    @C12579k
    public String toString() {
        List<C38115c> list = this.f66998a;
        int i = this.f66999b;
        int i2 = this.f67000c;
        int i3 = this.f67001d;
        Integer num = this.f67002e;
        Integer num2 = this.f67003f;
        Facet facet = this.f67004g;
        Integer num3 = this.f67005h;
        return "PlpProductResult(products=" + list + ", currentPage=" + i + ", pageCount=" + i2 + ", totalProductCount=" + i3 + ", nextPage=" + num + ", previousPage=" + num2 + ", facets=" + facet + ", topResultsCategoryId=" + num3 + ")";
    }
}
