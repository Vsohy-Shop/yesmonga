package com.carrefour.fid.android.design.components.compose;

import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MemoListInputComponentKt$MemoTextField$3 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ TextFieldValue $textFieldValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListInputComponentKt$MemoTextField$3(TextFieldValue textFieldValue) {
        super(3);
        this.$textFieldValue = textFieldValue;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo112229a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(pVar2, "innerTextField");
        if ((i & 14) == 0) {
            if (oVar2.mo14927P(pVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(142555021, i2, -1, "com.carrefour.fid.android.design.components.compose.MemoTextField.<anonymous> (MemoListInputComponent.kt:131)");
            }
            oVar2.mo14918M(-576899374);
            if (this.$textFieldValue.mo47115i().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 = i2;
                TextKt.m14196c(C16018i.m71858d(C36896b.C36912p.hub_memo_search_bar_hint, oVar2, 0), (C8767m) null, C37475b.f94185a.mo114258z(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65530);
            } else {
                i3 = i2;
            }
            oVar.mo15002m0();
            pVar2.invoke(oVar, Integer.valueOf(i3 & 14));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo112229a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
