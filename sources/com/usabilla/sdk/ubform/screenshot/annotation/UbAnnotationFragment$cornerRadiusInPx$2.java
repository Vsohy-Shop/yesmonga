package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationFragment$cornerRadiusInPx$2 extends Lambda implements C11289a<Float> {
    final /* synthetic */ UbAnnotationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationFragment$cornerRadiusInPx$2(UbAnnotationFragment ubAnnotationFragment) {
        super(0);
        this.this$0 = ubAnnotationFragment;
    }

    /* renamed from: a */
    public final float mo20387a() {
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return (float) Intrinsics.checkNotNullParameter(requireContext, "<this>");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Float.valueOf(mo20387a());
    }
}
