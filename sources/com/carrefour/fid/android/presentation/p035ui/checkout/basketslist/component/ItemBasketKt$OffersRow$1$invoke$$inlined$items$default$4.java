package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$OffersRow$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,423:1\n170#2,2:424\n172#2:427\n173#2:429\n174#2:437\n169#2,8:438\n154#3:426\n154#3:428\n36#4:430\n1114#5,6:431\n*S KotlinDebug\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$OffersRow$1\n*L\n171#1:426\n172#1:428\n173#1:430\n173#1:431,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$4 */
public final class ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$4 extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$4(List list) {
        super(4);
        this.$items = list;
    }

    @C8540g
    /* renamed from: a */
    public final void mo68726a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        ItemBasketKt$OffersRow$1$2$1$1 itemBasketKt$OffersRow$1$2$1$1;
        int i4;
        int i5;
        C2455e eVar2 = eVar;
        int i6 = i;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$items");
        if ((i2 & 14) == 0) {
            if (oVar2.mo15006n0(eVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (oVar2.mo14976f(i6)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
            }
            String str = (String) this.$items.get(i6);
            C8767m C = SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 16), 0.0f, 11, (Object) null), C16483g.m74435M((float) 32));
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(str);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                ItemBasketKt$OffersRow$1$2$1$1 itemBasketKt$OffersRow$1$2$1$12 = new ItemBasketKt$OffersRow$1$2$1$1(str);
                oVar2.mo14893C(itemBasketKt$OffersRow$1$2$1$12);
                itemBasketKt$OffersRow$1$2$1$1 = itemBasketKt$OffersRow$1$2$1$12;
            } else {
                itemBasketKt$OffersRow$1$2$1$1 = N;
            }
            oVar.mo15002m0();
            C35325c.m145647d(itemBasketKt$OffersRow$1$2$1$1, C, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, (Object) null, (Object) null, R.drawable.ds_ic_placeholder, oVar, 48, 0, 16380);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo68726a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
