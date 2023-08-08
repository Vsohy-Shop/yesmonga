package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* renamed from: androidx.compose.material.ripple.g */
public final class C7919g {
    @C12579k

    /* renamed from: a */
    public final Map<AndroidRippleIndicationInstance, RippleHostView> f19042a = new LinkedHashMap();
    @C12579k

    /* renamed from: b */
    public final Map<RippleHostView, AndroidRippleIndicationInstance> f19043b = new LinkedHashMap();

    @C12580l
    /* renamed from: a */
    public final AndroidRippleIndicationInstance mo11058a(@C12579k RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return this.f19043b.get(rippleHostView);
    }

    @C12580l
    /* renamed from: b */
    public final RippleHostView mo11059b(@C12579k AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "indicationInstance");
        return this.f19042a.get(androidRippleIndicationInstance);
    }

    /* renamed from: c */
    public final void mo11060c(@C12579k AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.f19042a.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            AndroidRippleIndicationInstance remove = this.f19043b.remove(rippleHostView);
        }
        this.f19042a.remove(androidRippleIndicationInstance);
    }

    /* renamed from: d */
    public final void mo11061d(@C12579k AndroidRippleIndicationInstance androidRippleIndicationInstance, @C12579k RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f19042a.put(androidRippleIndicationInstance, rippleHostView);
        this.f19043b.put(rippleHostView, androidRippleIndicationInstance);
    }
}
