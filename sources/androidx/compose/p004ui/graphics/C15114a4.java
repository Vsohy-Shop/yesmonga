package androidx.compose.p004ui.graphics;

import android.graphics.RenderEffect;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15094f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(31)
/* renamed from: androidx.compose.ui.graphics.a4 */
public final class C15114a4 {
    @C12579k

    /* renamed from: a */
    public static final C15114a4 f37340a = new C15114a4();

    @C12579k
    @C0373u
    /* renamed from: a */
    public final RenderEffect mo42418a(@C12580l C15329u3 u3Var, float f, float f2, int i) {
        if (u3Var == null) {
            RenderEffect a = RenderEffect.createBlurEffect(f, f2, C15414y0.m67300b(i));
            Intrinsics.checkNotNullExpressionValue(a, "{\n            android.gr…)\n            )\n        }");
            return a;
        }
        RenderEffect a2 = RenderEffect.createBlurEffect(f, f2, u3Var.mo43043a(), C15414y0.m67300b(i));
        Intrinsics.checkNotNullExpressionValue(a2, "{\n            android.gr…)\n            )\n        }");
        return a2;
    }

    @C12579k
    @C0373u
    /* renamed from: b */
    public final RenderEffect mo42419b(@C12580l C15329u3 u3Var, long j) {
        if (u3Var == null) {
            RenderEffect a = RenderEffect.createOffsetEffect(C15094f.m64880p(j), C15094f.m64882r(j));
            Intrinsics.checkNotNullExpressionValue(a, "{\n            android.gr…et.x, offset.y)\n        }");
            return a;
        }
        RenderEffect a2 = RenderEffect.createOffsetEffect(C15094f.m64880p(j), C15094f.m64882r(j), u3Var.mo43043a());
        Intrinsics.checkNotNullExpressionValue(a2, "{\n            android.gr…)\n            )\n        }");
        return a2;
    }
}
