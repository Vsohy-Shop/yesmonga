package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/platform/o0;", "rn", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/o0;Landroid/graphics/Matrix;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1 */
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements C11304p<C15939o0, Matrix, C11079d2> {

    /* renamed from: f */
    public static final RenderNodeLayer$Companion$getMatrix$1 f39385f = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    /* renamed from: a */
    public final void mo45561a(@C12579k C15939o0 o0Var, @C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(o0Var, "rn");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        o0Var.mo45746C(matrix);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo45561a((C15939o0) obj, (Matrix) obj2);
        return C11079d2.f28267a;
    }
}
