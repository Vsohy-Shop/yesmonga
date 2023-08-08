package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ShadowLinearLayout$radius$2 extends Lambda implements C11289a<Float> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowLinearLayout$radius$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: a */
    public final float mo19979a() {
        return ((float) this.$context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_card_radius)) / ((float) 2);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Float.valueOf(mo19979a());
    }
}
