package androidx.compose.p004ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.key.d */
public final class C15439d {
    /* renamed from: a */
    public static final long m68273a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$key");
        return C15443h.m68290a(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m68274b(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action == 0) {
            return C15437c.f38419b.mo43929a();
        }
        if (action != 1) {
            return C15437c.f38419b.mo43931c();
        }
        return C15437c.f38419b.mo43930b();
    }

    /* renamed from: c */
    public static final int m68275c(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$utf16CodePoint");
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: d */
    public static final boolean m68276d(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isAltPressed");
        return keyEvent.isAltPressed();
    }

    /* renamed from: e */
    public static final boolean m68277e(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: f */
    public static final boolean m68278f(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isMetaPressed");
        return keyEvent.isMetaPressed();
    }

    /* renamed from: g */
    public static final boolean m68279g(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
