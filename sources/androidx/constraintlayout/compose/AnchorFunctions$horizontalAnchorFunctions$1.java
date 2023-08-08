package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, mo22516d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class AnchorFunctions$horizontalAnchorFunctions$1 extends Lambda implements C11304p<ConstraintReference, Object, ConstraintReference> {

    /* renamed from: f */
    public static final AnchorFunctions$horizontalAnchorFunctions$1 f41085f = new AnchorFunctions$horizontalAnchorFunctions$1();

    public AnchorFunctions$horizontalAnchorFunctions$1() {
        super(2);
    }

    /* renamed from: a */
    public final ConstraintReference invoke(@C12579k ConstraintReference constraintReference, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(constraintReference, "$this$arrayOf");
        Intrinsics.checkNotNullParameter(obj, "other");
        constraintReference.mo49201D0((Object) null);
        constraintReference.mo49253k((Object) null);
        ConstraintReference E0 = constraintReference.mo49203E0(obj);
        Intrinsics.checkNotNullExpressionValue(E0, "topToTop(other)");
        return E0;
    }
}
