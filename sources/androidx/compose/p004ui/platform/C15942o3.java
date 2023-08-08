package androidx.compose.p004ui.platform;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15329u3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(31)
/* renamed from: androidx.compose.ui.platform.o3 */
public final class C15942o3 {
    @C12579k

    /* renamed from: a */
    public static final C15942o3 f39628a = new C15942o3();

    @C0373u
    /* renamed from: a */
    public final void mo45854a(@C12579k RenderNode renderNode, @C12580l C15329u3 u3Var) {
        RenderEffect renderEffect;
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        if (u3Var != null) {
            renderEffect = u3Var.mo43043a();
        } else {
            renderEffect = null;
        }
        boolean unused = renderNode.setRenderEffect(renderEffect);
    }
}
