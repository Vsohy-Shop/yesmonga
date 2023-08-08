package com.usabilla.sdk.ubform.sdk.page.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/presenter/a;", "V", "Landroid/widget/ScrollView;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PageView$scrollView$2 extends Lambda implements C11289a<ScrollView> {
    final /* synthetic */ PageView<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageView$scrollView$2(PageView<V> pageView) {
        super(0);
        this.this$0 = pageView;
    }

    /* renamed from: c */
    public static final boolean m38156c(View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 2) {
            Intrinsics.checkNotNullExpressionValue(view, C9851c.f26937h);
            ExtensionViewKt.m38318b(view);
        }
        view.performClick();
        return false;
    }

    /* renamed from: b */
    public final ScrollView invoke() {
        ScrollView scrollView = (ScrollView) this.this$0.findViewById(C9747c.C9756i.page_scroll);
        scrollView.setFocusableInTouchMode(true);
        scrollView.setOnTouchListener(new C10076d());
        return scrollView;
    }
}
