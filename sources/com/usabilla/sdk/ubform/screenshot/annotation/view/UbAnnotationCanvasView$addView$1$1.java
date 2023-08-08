package com.usabilla.sdk.ubform.screenshot.annotation.view;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public /* synthetic */ class UbAnnotationCanvasView$addView$1$1 extends FunctionReferenceImpl implements C11304p<UbDraftView, Boolean, C11079d2> {
    public UbAnnotationCanvasView$addView$1$1(UbAnnotationCanvasView ubAnnotationCanvasView) {
        super(2, ubAnnotationCanvasView, UbAnnotationCanvasView.class, "updateTrashState", "updateTrashState(Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbDraftView;Z)V", 0);
    }

    /* renamed from: d */
    public final void mo20521d(@C12579k UbDraftView ubDraftView, boolean z) {
        Intrinsics.checkNotNullParameter(ubDraftView, "p0");
        ((UbAnnotationCanvasView) this.receiver).mo20515i(ubDraftView, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo20521d((UbDraftView) obj, ((Boolean) obj2).booleanValue());
        return C11079d2.f28267a;
    }
}
