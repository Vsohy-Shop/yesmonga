package com.usabilla.sdk.ubform.sdk.page.view;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;", "V", "Landroid/view/View;", "view", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PageView$customizeButton$1 extends Lambda implements C11300l<View, C11079d2> {
    final /* synthetic */ PageView<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageView$customizeButton$1(PageView<V> pageView) {
        super(1);
        this.this$0 = pageView;
    }

    /* renamed from: a */
    public final void mo21459a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        int id = view.getId();
        if (id == C9747c.C9756i.ub_page_button_proceed) {
            this.this$0.f27686a.mo20725h();
        } else {
            boolean z = true;
            if (!(id == C9747c.C9756i.ub_page_button_cancel || id == C9747c.C9756i.ub_page_last_button_cancel)) {
                z = false;
            }
            if (z) {
                this.this$0.f27686a.mo20721e();
            }
        }
        ExtensionViewKt.m38318b(view);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo21459a((View) obj);
        return C11079d2.f28267a;
    }
}
