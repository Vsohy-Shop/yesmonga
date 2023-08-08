package androidx.compose.p004ui.platform;

import android.view.RenderNode;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.compose.ui.platform.s3 */
public final class C15968s3 {
    @C12579k

    /* renamed from: a */
    public static final C15968s3 f39664a = new C15968s3();

    @C0373u
    /* renamed from: a */
    public final int mo45951a(@C12579k RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @C0373u
    /* renamed from: b */
    public final int mo45952b(@C12579k RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @C0373u
    /* renamed from: c */
    public final void mo45953c(@C12579k RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    @C0373u
    /* renamed from: d */
    public final void mo45954d(@C12579k RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
