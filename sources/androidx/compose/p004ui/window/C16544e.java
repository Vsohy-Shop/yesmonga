package androidx.compose.p004ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.C0376v0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.window.e */
public final class C16544e extends C16545f {
    /* renamed from: c */
    public void mo48083c(@C12579k View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "composeView");
        view.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.m40452P(new Rect(0, 0, i, i2)));
    }
}
