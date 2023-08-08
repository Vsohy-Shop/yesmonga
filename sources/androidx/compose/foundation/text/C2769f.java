package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.f */
public final class C2769f {
    /* renamed from: a */
    public static final boolean m12573a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$cancelsTextSelection");
        if (keyEvent.getKeyCode() != 4 || !C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43930b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final void m12574b() {
    }
}
