package com.usabilla.sdk.ubform.screenshot.annotation;

import android.widget.ImageView;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo22516d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationView$imagePreview$2 extends Lambda implements C11289a<ImageView> {
    final /* synthetic */ UbAnnotationView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationView$imagePreview$2(UbAnnotationView ubAnnotationView) {
        super(0);
        this.this$0 = ubAnnotationView;
    }

    /* renamed from: a */
    public final ImageView invoke() {
        return (ImageView) this.this$0.findViewById(C9747c.C9756i.ub_screenshot_preview);
    }
}