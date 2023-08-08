package androidx.compose.p004ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.platform.f0 */
public final class C15879f0 {
    @C12579k

    /* renamed from: a */
    public static final C15879f0 f39530a = new C15879f0();

    @C0373u
    /* renamed from: a */
    public final int mo45725a(@C12579k AccessibilityManager accessibilityManager, int i, int i2) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
