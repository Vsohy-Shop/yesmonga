package com.carrefour.fid.android.service.presentation.p044ui.drive.summary.component;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.component.PictosKt$PictoWithAnnotation$2 */
public final class PictosKt$PictoWithAnnotation$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $annotation;
    final /* synthetic */ int $resId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PictosKt$PictoWithAnnotation$2(int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i2) {
        super(2);
        this.$resId = i;
        this.$annotation = pVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PictosKt.PictoWithAnnotation(this.$resId, this.$annotation, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
