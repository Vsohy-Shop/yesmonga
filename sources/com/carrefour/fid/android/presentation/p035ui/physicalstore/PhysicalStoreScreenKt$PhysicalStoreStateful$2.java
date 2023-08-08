package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.content.Context;
import android.view.Window;
import androidx.appcompat.app.C0475e;
import com.carrefour.fid.android.shared.base.C28512v;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$2 */
public final class PhysicalStoreScreenKt$PhysicalStoreStateful$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C0475e $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreStateful$2(C0475e eVar) {
        super(0);
        this.$activity = eVar;
    }

    public final void invoke() {
        C0475e eVar = this.$activity;
        Window window = eVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "it.window");
        C28512v.m118431c(window);
        Window window2 = eVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "it.window");
        Context applicationContext = eVar.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
        C28512v.m118433e(window2, applicationContext);
    }
}
