package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.content.Context;
import android.view.Window;
import androidx.appcompat.app.C0475e;
import com.carrefour.fid.android.shared.base.C28504t;
import com.carrefour.fid.android.shared.base.C28512v;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$1 */
public final class PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C0475e $activity;
    final /* synthetic */ C29018a $analytics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$1(C29018a aVar, C0475e eVar) {
        super(0);
        this.$analytics = aVar;
        this.$activity = eVar;
    }

    public final void invoke() {
        this.$analytics.mo84458r();
        C0475e eVar = this.$activity;
        Window window = eVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "it.window");
        C28512v.m118429a(window);
        Window window2 = eVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "it.window");
        Context applicationContext = eVar.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
        C28512v.m118430b(window2, applicationContext);
        C0475e eVar2 = this.$activity;
        C28504t tVar = eVar2 instanceof C28504t ? (C28504t) eVar2 : null;
        if (tVar != null) {
            tVar.mo83423j();
        }
    }
}
