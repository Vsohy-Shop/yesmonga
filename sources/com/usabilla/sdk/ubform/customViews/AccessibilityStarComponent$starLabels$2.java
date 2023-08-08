package com.usabilla.sdk.ubform.customViews;

import com.usabilla.sdk.ubform.C9747c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n"}, mo22516d2 = {"", "", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class AccessibilityStarComponent$starLabels$2 extends Lambda implements C11289a<String[]> {
    final /* synthetic */ AccessibilityStarComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibilityStarComponent$starLabels$2(AccessibilityStarComponent accessibilityStarComponent) {
        super(0);
        this.this$0 = accessibilityStarComponent;
    }

    @C12579k
    /* renamed from: a */
    public final String[] invoke() {
        return this.this$0.getResources().getStringArray(C9747c.C9750c.ub_element_mood_stars);
    }
}
