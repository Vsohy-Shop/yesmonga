package com.usabilla.sdk.ubform.screenshot.annotation;

import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbAnnotationCanvasView;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationView$mainDrawingView$2 extends Lambda implements C11289a<UbAnnotationCanvasView> {
    final /* synthetic */ UbAnnotationView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationView$mainDrawingView$2(UbAnnotationView ubAnnotationView) {
        super(0);
        this.this$0 = ubAnnotationView;
    }

    /* renamed from: a */
    public final UbAnnotationCanvasView invoke() {
        return (UbAnnotationCanvasView) this.this$0.findViewById(C9747c.C9756i.ub_screenshot_canvas);
    }
}
