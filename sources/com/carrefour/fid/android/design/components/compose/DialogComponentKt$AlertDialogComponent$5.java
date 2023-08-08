package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.design.components.compose.C36984f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DialogComponentKt$AlertDialogComponent$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C36984f.C36985a $data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogComponentKt$AlertDialogComponent$5(C36984f.C36985a aVar, int i) {
        super(2);
        this.$data = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DialogComponentKt.m151478a(this.$data, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
