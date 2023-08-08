package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.OfferDepartmentComponentKt;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.C28499q;
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
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListWithItems$1\n*L\n1#1,423:1\n365#2,4:424\n440#2,8:428\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListWithItems$1$invoke$$inlined$itemsIndexed$default$3 */
public final class C23049x976f29ae extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11300l $actioner$inlined;
    final /* synthetic */ C28499q $fragment$inlined;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23049x976f29ae(List list, C28499q qVar, C11300l lVar) {
        super(4);
        this.$items = list;
        this.$fragment$inlined = qVar;
        this.$actioner$inlined = lVar;
    }

    @C8540g
    /* renamed from: a */
    public final void mo67698a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
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
            C27670g gVar = (C27670g) this.$items.get(i);
            if (gVar instanceof C27670g.C27676f) {
                oVar.mo14918M(412638643);
                AndroidView_androidKt.m74829a(ShoppingListScreenStateFulKt$ShoppingListWithItems$1$2$1.f58695f, SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), new ShoppingListScreenStateFulKt$ShoppingListWithItems$1$2$2(gVar, this.$fragment$inlined, this.$actioner$inlined, i), oVar, 54, 0);
                oVar.mo15002m0();
            } else if (gVar instanceof C27670g.C27675e) {
                oVar.mo14918M(412643120);
                C27670g.C27675e eVar2 = (C27670g.C27675e) gVar;
                OfferDepartmentComponentKt.m104769a(eVar2.mo80406f(), eVar2.mo80404e(), oVar, 0);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(412643262);
                oVar.mo15002m0();
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
        mo67698a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
