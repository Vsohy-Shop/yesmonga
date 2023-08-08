package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/foundation/layout/k;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/layout/k;ZLandroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.design.components.compose.ComposableSingletons$ExpandableComponentKt$lambda-5$1  reason: invalid class name */
public final class ComposableSingletons$ExpandableComponentKt$lambda5$1 extends Lambda implements C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$ExpandableComponentKt$lambda5$1 f92186f = new ComposableSingletons$ExpandableComponentKt$lambda5$1();

    public ComposableSingletons$ExpandableComponentKt$lambda5$1() {
        super(4);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo112066a(@C12579k C2373k kVar, boolean z, @C12580l C8592o oVar, int i) {
        int i2 = i;
        Intrinsics.checkNotNullParameter(kVar, "$this$ExpandableComponent");
        if ((i2 & 641) != 128 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(583625015, i2, -1, "com.carrefour.fid.android.design.components.compose.ComposableSingletons$ExpandableComponentKt.lambda-5.<anonymous> (ExpandableComponent.kt:183)");
            }
            TextKt.m14196c("Content", (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 6, 0, 131070);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo112066a((C2373k) obj, ((Boolean) obj2).booleanValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
