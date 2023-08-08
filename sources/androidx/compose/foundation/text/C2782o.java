package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16359o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.o */
public final class C2782o {
    /* renamed from: a */
    public static final int m12635a(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = i + 1; i2 < length; i2++) {
            if (charSequence.charAt(i2) == 10) {
                return i2;
            }
        }
        return charSequence.length();
    }

    /* renamed from: b */
    public static final int m12636b(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i2 = i - 1; i2 > 0; i2--) {
            if (charSequence.charAt(i2 - 1) == 10) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static final long m12637c(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return C16359o0.m73780b(m12636b(charSequence, i), m12635a(charSequence, i));
    }
}
