package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.google.accompanist.pager.C15029c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPickupListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupListComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupListComponentKt$PickupListComponent$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,65:1\n154#2:66\n*S KotlinDebug\n*F\n+ 1 PickupListComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/PickupListComponentKt$PickupListComponent$3\n*L\n58#1:66\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponentKt$PickupListComponent$3 */
public final class PickupListComponentKt$PickupListComponent$3 extends Lambda implements C11306r<C15029c, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ float $itemWidth;
    final /* synthetic */ C11300l<C38080a, C11079d2> $onPickupSelected;
    final /* synthetic */ C11300l<C38080a, C11079d2> $onSeeOpenings;
    final /* synthetic */ List<C38080a> $pickupList;
    final /* synthetic */ C11300l<C38080a, String> $priceFormatter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupListComponentKt$PickupListComponent$3(List<C38080a> list, float f, C11300l<? super C38080a, String> lVar, C11300l<? super C38080a, C11079d2> lVar2, int i, C11300l<? super C38080a, C11079d2> lVar3) {
        super(4);
        this.$pickupList = list;
        this.$itemWidth = f;
        this.$priceFormatter = lVar;
        this.$onPickupSelected = lVar2;
        this.$$dirty = i;
        this.$onSeeOpenings = lVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C15029c) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C15029c cVar, final int i, @C12580l C8592o oVar, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(cVar, "$this$HorizontalPager");
        if ((i2 & 112) == 0) {
            i3 = (oVar.mo14976f(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-889703315, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponent.<anonymous> (PickupListComponent.kt:54)");
            }
            C38080a aVar = this.$pickupList.get(i);
            C11300l<C38080a, C11079d2> lVar = this.$onPickupSelected;
            final C11300l<C38080a, C11079d2> lVar2 = this.$onSeeOpenings;
            final List<C38080a> list = this.$pickupList;
            PickupCardKt.m105037a(SizeKt.m10089E(C8767m.f23478j, this.$itemWidth, C16483g.m74435M((float) 172)), aVar, this.$priceFormatter.invoke(aVar), lVar, new C11289a<C11079d2>() {
                public final void invoke() {
                    lVar2.invoke(list.get(i));
                }
            }, oVar, ((this.$$dirty >> 3) & 7168) | 70, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
