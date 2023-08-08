package androidx.compose.p004ui.text.android;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.p0 */
public final class C16105p0 {
    @C12579k

    /* renamed from: a */
    public static final C16105p0 f40063a = new C16105p0();
    @C12579k

    /* renamed from: b */
    public static final Layout.Alignment f40064b;
    @C12579k

    /* renamed from: c */
    public static final Layout.Alignment f40065c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.areEqual((Object) alignment3.name(), (Object) "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual((Object) alignment3.name(), (Object) "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f40064b = alignment;
        f40065c = alignment2;
    }

    @C12579k
    /* renamed from: a */
    public final Layout.Alignment mo46526a(int i) {
        if (i == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 3) {
            return f40064b;
        }
        if (i != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return f40065c;
    }
}
