package androidx.compose.p004ui.platform;

import android.view.RenderNode;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
/* renamed from: androidx.compose.ui.platform.r3 */
public final class C15960r3 {
    @C12579k

    /* renamed from: a */
    public static final C15960r3 f39660a = new C15960r3();

    @C0373u
    /* renamed from: a */
    public final void mo45948a(@C12579k RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
