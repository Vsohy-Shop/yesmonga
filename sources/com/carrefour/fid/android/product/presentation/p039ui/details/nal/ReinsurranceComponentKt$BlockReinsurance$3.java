package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsurranceComponentKt$BlockReinsurance$3 */
public final class ReinsurranceComponentKt$BlockReinsurance$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11289a<C11079d2> $blockClicked;
    final /* synthetic */ int $drawableId;
    final /* synthetic */ String $text;
    final /* synthetic */ C2411u0 $this_BlockReinsurance;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsurranceComponentKt$BlockReinsurance$3(C2411u0 u0Var, int i, String str, C11289a<C11079d2> aVar, int i2) {
        super(2);
        this.$this_BlockReinsurance = u0Var;
        this.$drawableId = i;
        this.$text = str;
        this.$blockClicked = aVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ReinsurranceComponentKt.m116916a(this.$this_BlockReinsurance, this.$drawableId, this.$text, this.$blockClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
