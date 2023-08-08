package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n135#2:437\n135#2:442\n135#2:445\n135#2:446\n135#2:447\n155#3:438\n155#3:439\n155#3:440\n155#3:441\n155#3:443\n155#3:444\n155#3:448\n155#3:449\n155#3:450\n155#3:451\n155#3:452\n155#3:453\n155#3:454\n155#3:455\n155#3:456\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n62#1:437\n95#1:442\n123#1:445\n146#1:446\n178#1:447\n51#1:438\n52#1:439\n53#1:440\n54#1:441\n86#1:443\n87#1:444\n167#1:448\n168#1:449\n169#1:450\n170#1:451\n286#1:452\n296#1:453\n297#1:454\n298#1:455\n299#1:456\n*E\n"})
public final class PaddingKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C2366i0 m10014a(float f) {
        return new C2375k0(f, f, f, f, (DefaultConstructorMarker) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C2366i0 m10015b(float f, float f2) {
        return new C2375k0(f, f2, f, f2, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C2366i0 m10016c(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        return m10015b(f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C2366i0 m10017d(float f, float f2, float f3, float f4) {
        return new C2375k0(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C2366i0 m10018e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return m10017d(f, f2, f3, f4);
    }

    @C8547h2
    @C12579k
    /* renamed from: f */
    public static final C8767m m10019f(@C12579k C8767m mVar, float f, float f2, float f3, float f4) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$absolutePadding");
        if (InspectableValueKt.m71063e()) {
            lVar = new PaddingKt$absolutePaddingqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new PaddingModifier(f, f2, f3, f4, false, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: g */
    public static /* synthetic */ C8767m m10020g(C8767m mVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return m10019f(mVar, f, f2, f3, f4);
    }

    @C8547h2
    /* renamed from: h */
    public static final float m10021h(@C12579k C2366i0 i0Var, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return i0Var.mo8092c(layoutDirection);
        }
        return i0Var.mo8091b(layoutDirection);
    }

    @C8547h2
    /* renamed from: i */
    public static final float m10022i(@C12579k C2366i0 i0Var, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return i0Var.mo8091b(layoutDirection);
        }
        return i0Var.mo8092c(layoutDirection);
    }

    @C8547h2
    @C12579k
    /* renamed from: j */
    public static final C8767m m10023j(@C12579k C8767m mVar, @C12579k C2366i0 i0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if (InspectableValueKt.m71063e()) {
            lVar = new PaddingKt$padding$$inlined$debugInspectorInfo$1(i0Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new PaddingValuesModifier(i0Var, lVar));
    }

    @C8547h2
    @C12579k
    /* renamed from: k */
    public static final C8767m m10024k(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$padding");
        if (InspectableValueKt.m71063e()) {
            lVar = new PaddingKt$padding3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new PaddingModifier(f, f, f, f, true, lVar, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: l */
    public static final C8767m m10025l(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$padding");
        if (InspectableValueKt.m71063e()) {
            lVar = new PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new PaddingModifier(f, f2, f, f2, true, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: m */
    public static /* synthetic */ C8767m m10026m(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        return m10025l(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: n */
    public static final C8767m m10027n(@C12579k C8767m mVar, float f, float f2, float f3, float f4) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$padding");
        if (InspectableValueKt.m71063e()) {
            lVar = new PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new PaddingModifier(f, f2, f3, f4, true, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: o */
    public static /* synthetic */ C8767m m10028o(C8767m mVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return m10027n(mVar, f, f2, f3, f4);
    }
}
