package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TelephoneNumberComponentKt$TelephoneNumber$1 */
public final class TelephoneNumberComponentKt$TelephoneNumber$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ String $number;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelephoneNumberComponentKt$TelephoneNumber$1(String str) {
        super(2);
        this.$number = str;
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
                ComposerKt.m29845w0(-493833810, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TelephoneNumber.<anonymous> (TelephoneNumberComponent.kt:180)");
            }
            TextKt.m14196c(CollectionsKt___CollectionsKt.m40639h3(StringsKt___StringsKt.chunked(this.$number, 2), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null), (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar, C7933t0.f19076b)), oVar, 0, 0, 65534);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
