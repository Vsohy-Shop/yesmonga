package androidx.compose.material3;

import com.carrefour.fid.android.design.components.widgets.C37254k1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11607h;
import kotlin.text.C11611k;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.material3.o */
public final class C8255o {

    /* renamed from: a */
    public static final int f20388a = 7;

    /* renamed from: b */
    public static final long f20389b = 86400000;

    @C8251n0
    @C12579k
    /* renamed from: a */
    public static final C8169a0 m27418a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "localeFormat");
        String removeSuffix = StringsKt__StringsKt.removeSuffix(C11622t.replace$default(new Regex("y{1,4}").mo23336m(new Regex("M{1,2}").mo23336m(new Regex("d{1,2}").mo23336m(new Regex("[^dMy/\\-.]").mo23336m(str, ""), C37254k1.f93426c), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), (CharSequence) ".");
        C11611k d = Regex.m45042d(new Regex("[/\\-.]"), removeSuffix, 0, 2, (Object) null);
        Intrinsics.checkNotNull(d);
        C11607h hVar = d.mo23314c().get(0);
        Intrinsics.checkNotNull(hVar);
        int r = hVar.mo23392e().mo23049r();
        String substring = removeSuffix.substring(r, r + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C8169a0(removeSuffix, substring.charAt(0));
    }
}
