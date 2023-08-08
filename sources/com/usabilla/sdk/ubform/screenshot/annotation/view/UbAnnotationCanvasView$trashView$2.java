package com.usabilla.sdk.ubform.screenshot.annotation.view;

import android.content.Context;
import android.widget.ImageView;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/ImageView;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationCanvasView$trashView$2 extends Lambda implements C11289a<ImageView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UbAnnotationCanvasView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationCanvasView$trashView$2(Context context, UbAnnotationCanvasView ubAnnotationCanvasView) {
        super(0);
        this.$context = context;
        this.this$0 = ubAnnotationCanvasView;
    }

    @C12579k
    /* renamed from: a */
    public final ImageView invoke() {
        ImageView imageView = new ImageView(this.$context);
        imageView.setImageDrawable(this.this$0.mo20507d());
        imageView.setVisibility(8);
        return imageView;
    }
}
