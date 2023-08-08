package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.compose.ui.platform.f4 */
public final class C15883f4 {
    @C12579k

    /* renamed from: a */
    public static final C15883f4 f39531a = new C15883f4();

    @C0373u
    /* renamed from: a */
    public final void mo45726a(@C12579k View view, int i) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setOutlineAmbientShadowColor(i);
    }

    @C0373u
    /* renamed from: b */
    public final void mo45727b(@C12579k View view, int i) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setOutlineSpotShadowColor(i);
    }
}
