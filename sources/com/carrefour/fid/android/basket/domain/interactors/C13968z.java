package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37600u;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import java.util.Collection;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketMarketPlaceBasketExistsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketMarketPlaceBasketExistsUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketMarketPlaceBasketExistsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1747#2,3:16\n*S KotlinDebug\n*F\n+ 1 BasketMarketPlaceBasketExistsUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/BasketMarketPlaceBasketExistsUseCase\n*L\n12#1:16,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.z */
public final class C13968z implements C37600u {
    @C12579k

    /* renamed from: a */
    public final BasketRepository f34096a;

    @Inject
    public C13968z(@C12579k BasketRepository basketRepository) {
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        this.f34096a = basketRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172799invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        boolean z;
        Result.C10852a aVar = Result.f28060a;
        Iterable value = this.f34096a.mo33394r().getValue();
        boolean z2 = false;
        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
            Iterator it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BasketType) it.next()) == BasketType.BASKET_V4_MARKETPLACE) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Result.m38702b(C11064a.m42615a(z2));
    }
}
