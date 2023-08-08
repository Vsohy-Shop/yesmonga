package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AnchorFunctions {
    @C12579k

    /* renamed from: a */
    public static final AnchorFunctions f41080a = new AnchorFunctions();
    @C12579k

    /* renamed from: b */
    public static final C11305q<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] f41081b = {new C11305q[]{AnchorFunctions$verticalAnchorFunctions$1.f41089f, AnchorFunctions$verticalAnchorFunctions$2.f41090f}, new C11305q[]{AnchorFunctions$verticalAnchorFunctions$3.f41091f, AnchorFunctions$verticalAnchorFunctions$4.f41092f}};
    @C12579k

    /* renamed from: c */
    public static final C11304p<ConstraintReference, Object, ConstraintReference>[][] f41082c = {new C11304p[]{AnchorFunctions$horizontalAnchorFunctions$1.f41085f, AnchorFunctions$horizontalAnchorFunctions$2.f41086f}, new C11304p[]{AnchorFunctions$horizontalAnchorFunctions$3.f41087f, AnchorFunctions$horizontalAnchorFunctions$4.f41088f}};
    @C12579k

    /* renamed from: d */
    public static final C11304p<ConstraintReference, Object, ConstraintReference> f41083d = AnchorFunctions$baselineAnchorFunction$1.f41084f;

    /* renamed from: androidx.constraintlayout.compose.AnchorFunctions$a */
    public /* synthetic */ class C16565a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: c */
    public final void mo48141c(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.mo49233a0((Object) null);
        constraintReference.mo49235b0((Object) null);
        int i = C16565a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.mo49197B0((Object) null);
            constraintReference.mo49195A0((Object) null);
        } else if (i == 2) {
            constraintReference.mo49196B((Object) null);
            constraintReference.mo49194A((Object) null);
        }
    }

    /* renamed from: d */
    public final void mo48142d(ConstraintReference constraintReference, LayoutDirection layoutDirection) {
        constraintReference.mo49252j0((Object) null);
        constraintReference.mo49254k0((Object) null);
        int i = C16565a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            constraintReference.mo49196B((Object) null);
            constraintReference.mo49194A((Object) null);
        } else if (i == 2) {
            constraintReference.mo49197B0((Object) null);
            constraintReference.mo49195A0((Object) null);
        }
    }

    @C12579k
    /* renamed from: e */
    public final C11304p<ConstraintReference, Object, ConstraintReference> mo48143e() {
        return f41083d;
    }

    @C12579k
    /* renamed from: f */
    public final C11304p<ConstraintReference, Object, ConstraintReference>[][] mo48144f() {
        return f41082c;
    }

    @C12579k
    /* renamed from: g */
    public final C11305q<ConstraintReference, Object, LayoutDirection, ConstraintReference>[][] mo48145g() {
        return f41081b;
    }

    /* renamed from: h */
    public final int mo48146h(int i, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (i >= 0) {
            return i;
        }
        if (layoutDirection == LayoutDirection.Ltr) {
            return i + 2;
        }
        return (-i) - 1;
    }
}
