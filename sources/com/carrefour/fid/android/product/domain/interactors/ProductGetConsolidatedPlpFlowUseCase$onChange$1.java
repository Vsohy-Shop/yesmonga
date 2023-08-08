package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.criteo.C38007i;
import com.carrefour.fid.android.domain.models.criteo.C38008j;
import com.carrefour.fid.android.domain.models.criteo.C38009k;
import com.carrefour.fid.android.domain.models.criteo.C38010l;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/v;", "productListElement", "a", "(Lcom/carrefour/fid/android/domain/models/v;)Lcom/carrefour/fid/android/domain/models/v;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetConsolidatedPlpFlowUseCase$onChange$1 extends Lambda implements C11300l<C38184v, C38184v> {
    final /* synthetic */ Basket $basket;
    final /* synthetic */ C38030a $shoppingList;
    final /* synthetic */ Set<Gtin> $syncingInBasket;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedPlpFlowUseCase$onChange$1(C38030a aVar, Basket basket, Set<Gtin> set) {
        super(1);
        this.$shoppingList = aVar;
        this.$basket = basket;
        this.$syncingInBasket = set;
    }

    @C12579k
    /* renamed from: a */
    public final C38184v invoke(@C12579k C38184v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "productListElement");
        if (vVar instanceof C38114b) {
            C38114b bVar = (C38114b) vVar;
            return C27662e.m116381a(bVar.mo118842j(), this.$shoppingList, this.$basket, this.$syncingInBasket, bVar.mo118845m(), bVar.mo118844l());
        } else if (vVar instanceof C38007i) {
            final C38030a aVar = this.$shoppingList;
            final Basket basket = this.$basket;
            final Set<Gtin> set = this.$syncingInBasket;
            return C38008j.m156605a((C38007i) vVar, new C11300l<List<? extends C38115c>, List<? extends C38114b>>() {
                @C12579k
                /* renamed from: a */
                public final List<C38114b> invoke(@C12579k List<C38115c> list) {
                    Intrinsics.checkNotNullParameter(list, "plpProductList");
                    Iterable<C38115c> iterable = list;
                    C38030a aVar = aVar;
                    Basket basket = basket;
                    Set<Gtin> set = set;
                    ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (C38115c b : iterable) {
                        arrayList.add(C27662e.m116382b(b, aVar, basket, set, false, false, 24, (Object) null));
                    }
                    return arrayList;
                }
            });
        } else if (!(vVar instanceof C38009k)) {
            return vVar;
        } else {
            final C38030a aVar2 = this.$shoppingList;
            final Basket basket2 = this.$basket;
            final Set<Gtin> set2 = this.$syncingInBasket;
            return C38010l.m156622a((C38009k) vVar, new C11300l<List<? extends C38115c>, List<? extends C38114b>>() {
                @C12579k
                /* renamed from: a */
                public final List<C38114b> invoke(@C12579k List<C38115c> list) {
                    Intrinsics.checkNotNullParameter(list, "plpProductList");
                    Iterable<C38115c> iterable = list;
                    C38030a aVar = aVar2;
                    Basket basket = basket2;
                    Set<Gtin> set = set2;
                    ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (C38115c b : iterable) {
                        arrayList.add(C27662e.m116382b(b, aVar, basket, set, true, false, 16, (Object) null));
                    }
                    return arrayList;
                }
            });
        }
    }
}
