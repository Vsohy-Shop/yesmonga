package com.usabilla.sdk.ubform.screenshot.annotation;

import android.view.MenuItem;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbAnnotationFragment$initializeAnnotationView$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ UbAnnotationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbAnnotationFragment$initializeAnnotationView$1(UbAnnotationFragment ubAnnotationFragment) {
        super(1);
        this.this$0 = ubAnnotationFragment;
    }

    /* renamed from: a */
    public final void mo20388a(boolean z) {
        MenuItem M0 = this.this$0.f27122v;
        if (M0 != null) {
            M0.setEnabled(z);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("menuUndo");
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20388a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
