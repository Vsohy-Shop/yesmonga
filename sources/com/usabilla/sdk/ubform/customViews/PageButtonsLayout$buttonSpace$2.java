package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/widget/Space;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PageButtonsLayout$buttonSpace$2 extends Lambda implements C11289a<Space> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageButtonsLayout$buttonSpace$2(Context context) {
        super(0);
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final Space invoke() {
        Space space = new Space(this.$context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, 1, 1.0f));
        return space;
    }
}
