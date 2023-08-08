package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.platform.t */
public final class C15970t {
    @C12579k

    /* renamed from: a */
    public static final C15970t f39667a = new C15970t();

    @C0376v0(29)
    @C0373u
    /* renamed from: a */
    public final void mo45955a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setForceDarkAllowed(false);
    }
}
