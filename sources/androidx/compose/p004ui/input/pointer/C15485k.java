package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15096g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.input.pointer.k */
public final class C15485k {
    @C12579k

    /* renamed from: a */
    public static final C15485k f38507a = new C15485k();

    @C0373u
    /* renamed from: a */
    public final long mo44079a(@C12579k MotionEvent motionEvent, int i) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        return C15096g.m64898a(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
