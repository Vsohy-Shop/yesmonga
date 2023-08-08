package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.platform.x */
public final class C15992x {
    @C12579k

    /* renamed from: a */
    public static final C15992x f39687a = new C15992x();

    @C0376v0(26)
    @C0373u
    /* renamed from: a */
    public final void mo45978a(@C12579k View view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
