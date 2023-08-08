package com.carrefour.fid.android.presentation.p035ui.home.toolbar;

import com.carrefour.fid.android.presentation.p035ui.home.toolbar.C24216a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHomeStateful$1$1 */
public final class ToolbarHomeKt$ToolbarHomeStateful$1$1 extends Lambda implements C11300l<C24216a, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onAccountClick;
    final /* synthetic */ C11289a<C11079d2> $onScanClick;
    final /* synthetic */ C11289a<C11079d2> $onSearchClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToolbarHomeKt$ToolbarHomeStateful$1$1(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3) {
        super(1);
        this.$onAccountClick = aVar;
        this.$onSearchClick = aVar2;
        this.$onScanClick = aVar3;
    }

    /* renamed from: a */
    public final void mo70847a(@C12579k C24216a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C24216a.C24217a.f60552a)) {
            this.$onAccountClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24216a.C24219c.f60556a)) {
            this.$onSearchClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24216a.C24218b.f60554a)) {
            this.$onScanClick.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70847a((C24216a) obj);
        return C11079d2.f28267a;
    }
}
