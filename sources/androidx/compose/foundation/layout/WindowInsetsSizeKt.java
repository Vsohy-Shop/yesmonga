package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,217:1\n135#2:218\n135#2:219\n135#2:220\n135#2:221\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n51#1:218\n77#1:219\n101#1:220\n121#1:221\n*E\n"})
public final class WindowInsetsSizeKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m10292a(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2333x993d91c4(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new DerivedHeightModifier(e1Var, lVar, WindowInsetsSizeKt$windowInsetsBottomHeight$2.f6224f));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m10293b(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2334xaf5f9f7d(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new DerivedWidthModifier(e1Var, lVar, WindowInsetsSizeKt$windowInsetsEndWidth$2.f6225f));
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C8767m m10294c(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2335x85553816(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new DerivedWidthModifier(e1Var, lVar, WindowInsetsSizeKt$windowInsetsStartWidth$2.f6226f));
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C8767m m10295d(@C12579k C8767m mVar, @C12579k C2354e1 e1Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2336x4005a8ba(e1Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new DerivedHeightModifier(e1Var, lVar, WindowInsetsSizeKt$windowInsetsTopHeight$2.f6227f));
    }
}
