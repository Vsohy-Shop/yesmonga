package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2783p;
import androidx.compose.p004ui.text.C16359o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.selection.j */
public final class C2832j {
    /* renamed from: a */
    public static final long m13082a(@C12579k String str, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "text");
        if (i2 == 0) {
            return C16359o0.m73780b(i, i);
        }
        if (i == 0) {
            if (z) {
                return C16359o0.m73780b(C2783p.m12638a(str, 0), 0);
            }
            return C16359o0.m73780b(0, C2783p.m12638a(str, 0));
        } else if (i == i2) {
            if (z) {
                return C16359o0.m73780b(C2783p.m12639b(str, i2), i2);
            }
            return C16359o0.m73780b(i2, C2783p.m12639b(str, i2));
        } else if (z) {
            if (!z2) {
                return C16359o0.m73780b(C2783p.m12639b(str, i), i);
            }
            return C16359o0.m73780b(C2783p.m12638a(str, i), i);
        } else if (!z2) {
            return C16359o0.m73780b(i, C2783p.m12638a(str, i));
        } else {
            return C16359o0.m73780b(i, C2783p.m12639b(str, i));
        }
    }
}
