package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.material.DividerKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.cms.domain.models.FuelPriceDomain;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStorePetrolComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n232#2:424\n233#2,3:426\n231#2,11:429\n154#3:425\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1\n*L\n232#1:425\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$invoke$$inlined$itemsIndexed$default$3 */
public final class C25301x718f5eaa extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ List $items;
    final /* synthetic */ C27152g $petrolState$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25301x718f5eaa(List list, C27152g gVar) {
        super(4);
        this.$items = list;
        this.$petrolState$inlined = gVar;
    }

    @C8540g
    /* renamed from: a */
    public final void mo73793a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
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
            FuelPriceDomain fuelPriceDomain = (FuelPriceDomain) this.$items.get(i);
            C8767m m = PaddingKt.m10026m(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 8), 1, (Object) null);
            String price = fuelPriceDomain.getPrice();
            PhysicalStorePetrolComponentKt.m109647a(m, fuelPriceDomain.getCode(), fuelPriceDomain.getName(), price, oVar, 6, 0);
            if (i < CollectionsKt__CollectionsKt.m40443G(((C27152g.C27155c) this.$petrolState$inlined).mo78938d())) {
                DividerKt.m13428a((C8767m) null, C37475b.f94185a.mo114239g(), 0.0f, 0.0f, oVar, 0, 13);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo73793a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
