package androidx.compose.p004ui.platform;

import android.graphics.RenderEffect;
import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15329u3;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(31)
/* renamed from: androidx.compose.ui.platform.h4 */
public final class C15896h4 {
    @C12579k

    /* renamed from: a */
    public static final C15896h4 f39600a = new C15896h4();

    @C0373u
    /* renamed from: a */
    public final void mo45810a(@C12579k View view, @C12580l C15329u3 u3Var) {
        RenderEffect renderEffect;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (u3Var != null) {
            renderEffect = u3Var.mo43043a();
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }
}
