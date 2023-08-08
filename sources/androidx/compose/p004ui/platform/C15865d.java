package androidx.compose.p004ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.platform.d */
public final class C15865d {
    @C12579k

    /* renamed from: a */
    public static final C15865d f39518a = new C15865d();

    @C0376v0(26)
    @C0373u
    /* renamed from: a */
    public final void mo45710a(@C12579k AccessibilityNodeInfo accessibilityNodeInfo, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "node");
        Intrinsics.checkNotNullParameter(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
