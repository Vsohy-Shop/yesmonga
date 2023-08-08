package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPickupCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickupCard.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/ComposableSingletons$PickupCardKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,218:1\n154#2:219\n*S KotlinDebug\n*F\n+ 1 PickupCard.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/ComposableSingletons$PickupCardKt$lambda-3$1\n*L\n176#1:219\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.ComposableSingletons$PickupCardKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$PickupCardKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$PickupCardKt$lambda3$1 f59642f = new ComposableSingletons$PickupCardKt$lambda3$1();

    public ComposableSingletons$PickupCardKt$lambda3$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(635778423, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.ComposableSingletons$PickupCardKt.lambda-3.<anonymous> (PickupCard.kt:173)");
            }
            PickupCardKt.m105037a(SizeKt.m10089E(C8767m.f23478j, C16483g.m74435M((float) 330), C16483g.m74435M((float) 172)), new C38080a(C28855a.f70690i, 0.0d, 0.0d, CollectionsKt__CollectionsKt.m40441E(), "", 2800.0f, "29 avenue de Paris", "78000 Versailles", "78000", true), "2.90", (C11300l<? super C38080a, C11079d2>) null, (C11289a<C11079d2>) null, oVar, C14092c.f34561U0, 24);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
