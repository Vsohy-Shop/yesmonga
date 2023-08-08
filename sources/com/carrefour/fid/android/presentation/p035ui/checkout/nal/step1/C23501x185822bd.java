package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2\n*L\n1#1,423:1\n362#2,2:424\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$invoke$lambda$1$$inlined$itemsIndexed$default$3 */
public final class C23501x185822bd extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ C11300l $actioner$inlined;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23501x185822bd(List list, C11300l lVar, int i) {
        super(4);
        this.$items = list;
        this.$actioner$inlined = lVar;
        this.$$dirty$inlined = i;
    }

    @C8540g
    /* renamed from: a */
    public final void mo68864a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(eVar, "$this$items");
        if ((i2 & 14) == 0) {
            if (oVar.mo15006n0(eVar)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (oVar.mo14976f(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
            }
            NonFoodCheckoutStep1StatefulKt.m104669e((OfferProductModel) this.$items.get(i), this.$actioner$inlined, oVar, ((this.$$dirty$inlined >> 12) & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo68864a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
