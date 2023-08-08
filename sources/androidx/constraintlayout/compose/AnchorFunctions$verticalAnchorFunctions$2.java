package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, mo22516d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class AnchorFunctions$verticalAnchorFunctions$2 extends Lambda implements C11305q<ConstraintReference, Object, LayoutDirection, ConstraintReference> {

    /* renamed from: f */
    public static final AnchorFunctions$verticalAnchorFunctions$2 f41090f = new AnchorFunctions$verticalAnchorFunctions$2();

    public AnchorFunctions$verticalAnchorFunctions$2() {
        super(3);
    }

    /* renamed from: a */
    public final ConstraintReference invoke(@C12579k ConstraintReference constraintReference, @C12579k Object obj, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(constraintReference, "$this$arrayOf");
        Intrinsics.checkNotNullParameter(obj, "other");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        AnchorFunctions.f41080a.mo48141c(constraintReference, layoutDirection);
        ConstraintReference b0 = constraintReference.mo49235b0(obj);
        Intrinsics.checkNotNullExpressionValue(b0, "leftToRight(other)");
        return b0;
    }
}
