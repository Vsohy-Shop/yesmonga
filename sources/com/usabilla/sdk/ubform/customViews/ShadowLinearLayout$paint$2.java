package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.Paint;
import androidx.core.content.C17318d;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ShadowLinearLayout$paint$2 extends Lambda implements C11289a<Paint> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ShadowLinearLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowLinearLayout$paint$2(ShadowLinearLayout shadowLinearLayout, Context context) {
        super(0);
        this.this$0 = shadowLinearLayout;
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setShadowLayer(this.this$0.getResources().getDimension(C9747c.C9754g.ub_banner_shadow_radius), 0.0f, 0.0f, C17318d.m79723f(this.$context, C9747c.C9753f.ub_shadow));
        return paint;
    }
}
