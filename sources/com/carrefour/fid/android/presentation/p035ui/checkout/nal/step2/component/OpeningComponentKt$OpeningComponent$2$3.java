package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import p073j$.time.DayOfWeek;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nOpeningComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt$OpeningComponent$2$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,184:1\n171#2,12:185\n*S KotlinDebug\n*F\n+ 1 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt$OpeningComponent$2$3\n*L\n96#1:185,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentKt$OpeningComponent$2$3 */
public final class OpeningComponentKt$OpeningComponent$2$3 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ DayOfWeek $currentDayOfWeek;
    final /* synthetic */ List<C23659a> $openings;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpeningComponentKt$OpeningComponent$2$3(List<C23659a> list, DayOfWeek dayOfWeek) {
        super(1);
        this.$openings = list;
        this.$currentDayOfWeek = dayOfWeek;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<C23659a> list = this.$openings;
        C236541 r1 = C236541.f59690f;
        lazyListScope.mo8310k(list.size(), r1 != null ? new C23651x3689d3f8(r1, list) : null, new C23652x3689d3f9(list), C8553b.m31049c(-1091073711, true, new C23653x3689d3fa(list, this.$currentDayOfWeek)));
    }
}
