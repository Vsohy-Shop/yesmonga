package androidx.compose.p004ui.graphics;

import android.graphics.Canvas;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.graphics.h2 */
public final class C15222h2 {
    @C12579k

    /* renamed from: a */
    public static final C15222h2 f37529a = new C15222h2();

    @C0373u
    /* renamed from: a */
    public final void mo42774a(@C12579k Canvas canvas, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
