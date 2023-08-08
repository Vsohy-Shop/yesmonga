package com.usabilla.sdk.ubform.screenshot.annotation.view;

import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationCanvasView$trashIconSize$2 extends Lambda implements C11289a<Integer> {
    final /* synthetic */ UbAnnotationCanvasView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationCanvasView$trashIconSize$2(UbAnnotationCanvasView ubAnnotationCanvasView) {
        super(0);
        this.this$0 = ubAnnotationCanvasView;
    }

    /* renamed from: a */
    public final int mo20522a() {
        return this.this$0.getResources().getDimensionPixelSize(C9747c.C9754g.ub_trash_icon_margin) + this.this$0.getResources().getDimensionPixelSize(C9747c.C9754g.ub_trash_icon_size);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(mo20522a());
    }
}
