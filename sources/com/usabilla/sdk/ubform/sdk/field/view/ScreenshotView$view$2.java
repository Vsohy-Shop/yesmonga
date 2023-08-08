package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo22516d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ScreenshotView$view$2 extends Lambda implements C11289a<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ScreenshotView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenshotView$view$2(Context context, ScreenshotView screenshotView) {
        super(0);
        this.$context = context;
        this.this$0 = screenshotView;
    }

    /* renamed from: a */
    public final View invoke() {
        return LayoutInflater.from(this.$context).inflate(C9747c.C9759l.ub_field_screenshot, this.this$0, false);
    }
}
