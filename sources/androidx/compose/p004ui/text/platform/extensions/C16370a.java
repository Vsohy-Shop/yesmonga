package androidx.compose.p004ui.text.platform.extensions;

import androidx.compose.p004ui.text.intl.C16336a;
import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16344g;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.platform.extensions.a */
public final class C16370a {
    @C12579k
    /* renamed from: a */
    public static final Locale m73908a(@C12579k C16340e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C16344g b = eVar.mo47355b();
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((C16336a) b).mo47351e();
    }
}
