package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.v */
public final class C2848v {
    /* renamed from: a */
    public static final boolean m13132a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isTypedEvent");
        if (keyEvent.getAction() != 0 || keyEvent.getUnicodeChar() == 0) {
            return false;
        }
        return true;
    }
}
