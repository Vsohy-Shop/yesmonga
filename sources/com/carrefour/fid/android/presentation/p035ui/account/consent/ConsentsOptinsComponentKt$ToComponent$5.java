package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ToComponent$5 */
public final class ConsentsOptinsComponentKt$ToComponent$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C22934l, C11079d2> $actioner;
    final /* synthetic */ int $textResId;
    final /* synthetic */ List<ConsentOptIn> $this_ToComponent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentsOptinsComponentKt$ToComponent$5(List<ConsentOptIn> list, int i, C11300l<? super C22934l, C11079d2> lVar, int i2) {
        super(2);
        this.$this_ToComponent = list;
        this.$textResId = i;
        this.$actioner = lVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ConsentsOptinsComponentKt.m103251l(this.$this_ToComponent, this.$textResId, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
