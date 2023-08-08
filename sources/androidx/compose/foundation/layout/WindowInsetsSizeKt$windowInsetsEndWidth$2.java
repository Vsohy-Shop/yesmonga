package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroidx/compose/foundation/layout/e1;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "", "a", "(Landroidx/compose/foundation/layout/e1;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/d;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends Lambda implements C11305q<C2354e1, LayoutDirection, C16479d, Integer> {

    /* renamed from: f */
    public static final WindowInsetsSizeKt$windowInsetsEndWidth$2 f6225f = new WindowInsetsSizeKt$windowInsetsEndWidth$2();

    public WindowInsetsSizeKt$windowInsetsEndWidth$2() {
        super(3);
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(@C12579k C2354e1 e1Var, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        int i;
        Intrinsics.checkNotNullParameter(e1Var, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        if (layoutDirection == LayoutDirection.Rtl) {
            i = e1Var.mo7987d(dVar, layoutDirection);
        } else {
            i = e1Var.mo7985b(dVar, layoutDirection);
        }
        return Integer.valueOf(i);
    }
}
