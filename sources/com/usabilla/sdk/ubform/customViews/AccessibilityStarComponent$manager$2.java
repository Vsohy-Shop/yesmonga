package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/view/accessibility/AccessibilityManager;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class AccessibilityStarComponent$manager$2 extends Lambda implements C11289a<AccessibilityManager> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibilityStarComponent$manager$2(Context context) {
        super(0);
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final AccessibilityManager invoke() {
        Object systemService = this.$context.getSystemService("accessibility");
        if (systemService != null) {
            return (AccessibilityManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}
