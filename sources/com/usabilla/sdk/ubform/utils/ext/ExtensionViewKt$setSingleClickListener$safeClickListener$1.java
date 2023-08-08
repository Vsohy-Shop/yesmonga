package com.usabilla.sdk.ubform.utils.ext;

import android.view.View;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/view/View;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ExtensionViewKt$setSingleClickListener$safeClickListener$1 extends Lambda implements C11300l<View, C11079d2> {
    final /* synthetic */ C11300l<View, C11079d2> $onSafeClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionViewKt$setSingleClickListener$safeClickListener$1(C11300l<? super View, C11079d2> lVar) {
        super(1);
        this.$onSafeClick = lVar;
    }

    /* renamed from: a */
    public final void mo21577a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        this.$onSafeClick.invoke(view);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo21577a((View) obj);
        return C11079d2.f28267a;
    }
}
