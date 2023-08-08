package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16156d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.d */
public final class C2765d {
    @C12579k

    /* renamed from: a */
    public static final String f7274a = "androidx.compose.foundation.text.inlineContent";
    @C12579k

    /* renamed from: b */
    public static final String f7275b = "�";

    /* renamed from: a */
    public static final void m12569a(@C12579k C16156d.C16157a aVar, @C12579k String str, @C12579k String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "alternateText");
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo46711p(f7274a, str);
            aVar.mo46707l(str2);
            aVar.mo46709n();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    /* renamed from: b */
    public static /* synthetic */ void m12570b(C16156d.C16157a aVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = f7275b;
        }
        m12569a(aVar, str, str2);
    }
}
