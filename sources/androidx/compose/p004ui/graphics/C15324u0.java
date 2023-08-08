package androidx.compose.p004ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.u0 */
public final class C15324u0 extends C15329u3 {
    @C12579k

    /* renamed from: b */
    public final RenderEffect f37702b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15324u0(@C12579k RenderEffect renderEffect) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(renderEffect, "androidRenderEffect");
        this.f37702b = renderEffect;
    }

    @C12579k
    /* renamed from: b */
    public RenderEffect mo42491b() {
        return this.f37702b;
    }

    @C12579k
    /* renamed from: d */
    public final RenderEffect mo43009d() {
        return this.f37702b;
    }
}
