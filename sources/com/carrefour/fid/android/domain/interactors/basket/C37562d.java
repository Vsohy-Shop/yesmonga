package com.carrefour.fid.android.domain.interactors.basket;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.models.C38454b;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.interactors.basket.d */
public final class C37562d {

    /* renamed from: e */
    public static final int f94328e = 8;
    @C12579k

    /* renamed from: a */
    public final Basket f94329a;
    @C12579k

    /* renamed from: b */
    public final List<C38454b> f94330b;
    @C12579k

    /* renamed from: c */
    public final Map<String, List<OfferProductModel>> f94331c;

    /* renamed from: d */
    public final int f94332d;

    public C37562d(@C12579k Basket basket, @C12579k List<C38454b> list, @C12579k Map<String, ? extends List<? extends OfferProductModel>> map, int i) {
        Intrinsics.checkNotNullParameter(basket, "basket");
        Intrinsics.checkNotNullParameter(list, "bundles");
        Intrinsics.checkNotNullParameter(map, "offerProductModelsByCategory");
        this.f94329a = basket;
        this.f94330b = list;
        this.f94331c = map;
        this.f94332d = i;
    }

    /* renamed from: f */
    public static /* synthetic */ C37562d m154101f(C37562d dVar, Basket basket, List<C38454b> list, Map<String, List<OfferProductModel>> map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            basket = dVar.f94329a;
        }
        if ((i2 & 2) != 0) {
            list = dVar.f94330b;
        }
        if ((i2 & 4) != 0) {
            map = dVar.f94331c;
        }
        if ((i2 & 8) != 0) {
            i = dVar.f94332d;
        }
        return dVar.mo114364e(basket, list, map, i);
    }

    @C12579k
    /* renamed from: a */
    public final Basket mo114360a() {
        return this.f94329a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38454b> mo114361b() {
        return this.f94330b;
    }

    @C12579k
    /* renamed from: c */
    public final Map<String, List<OfferProductModel>> mo114362c() {
        return this.f94331c;
    }

    /* renamed from: d */
    public final int mo114363d() {
        return this.f94332d;
    }

    @C12579k
    /* renamed from: e */
    public final C37562d mo114364e(@C12579k Basket basket, @C12579k List<C38454b> list, @C12579k Map<String, ? extends List<? extends OfferProductModel>> map, int i) {
        Intrinsics.checkNotNullParameter(basket, "basket");
        Intrinsics.checkNotNullParameter(list, "bundles");
        Intrinsics.checkNotNullParameter(map, "offerProductModelsByCategory");
        return new C37562d(basket, list, map, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37562d)) {
            return false;
        }
        C37562d dVar = (C37562d) obj;
        return Intrinsics.areEqual((Object) this.f94329a, (Object) dVar.f94329a) && Intrinsics.areEqual((Object) this.f94330b, (Object) dVar.f94330b) && Intrinsics.areEqual((Object) this.f94331c, (Object) dVar.f94331c) && this.f94332d == dVar.f94332d;
    }

    @C12579k
    /* renamed from: g */
    public final Basket mo114366g() {
        return this.f94329a;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38454b> mo114367h() {
        return this.f94330b;
    }

    public int hashCode() {
        return (((((this.f94329a.hashCode() * 31) + this.f94330b.hashCode()) * 31) + this.f94331c.hashCode()) * 31) + Integer.hashCode(this.f94332d);
    }

    /* renamed from: i */
    public final int mo114369i() {
        return this.f94332d;
    }

    @C12579k
    /* renamed from: j */
    public final Map<String, List<OfferProductModel>> mo114370j() {
        return this.f94331c;
    }

    @C12579k
    public String toString() {
        Basket basket = this.f94329a;
        List<C38454b> list = this.f94330b;
        Map<String, List<OfferProductModel>> map = this.f94331c;
        int i = this.f94332d;
        return "BasketAndOffers(basket=" + basket + ", bundles=" + list + ", offerProductModelsByCategory=" + map + ", numberOfBaskets=" + i + ")";
    }
}
