package androidx.compose.foundation.text;

import androidx.emoji2.text.C19019f;
import java.text.BreakIterator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* renamed from: androidx.compose.foundation.text.p */
public final class C2783p {
    /* renamed from: a */
    public static final int m12638a(@C12579k String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C19019f c = m12640c();
        Integer num = null;
        if (c != null) {
            Integer valueOf = Integer.valueOf(c.mo55961e(str, i));
            if (valueOf.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* renamed from: b */
    public static final int m12639b(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C19019f c = m12640c();
        Integer num = null;
        if (c != null) {
            boolean z = false;
            Integer valueOf = Integer.valueOf(c.mo55964h(str, Math.max(0, i - 1)));
            if (valueOf.intValue() == -1) {
                z = true;
            }
            if (!z) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* renamed from: c */
    public static final C19019f m12640c() {
        if (!C19019f.m88870q()) {
            return null;
        }
        C19019f c = C19019f.m88864c();
        boolean z = true;
        if (c.mo55965i() != 1) {
            z = false;
        }
        if (z) {
            return c;
        }
        return null;
    }
}
