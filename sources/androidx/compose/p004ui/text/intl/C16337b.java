package androidx.compose.p004ui.text.intl;

import java.util.List;
import java.util.Locale;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.intl.b */
public final class C16337b implements C16345h {
    @C12579k
    /* renamed from: a */
    public C16342f mo47352a() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return new C16342f((List<C16340e>) C10976s.m41419k(new C16340e((C16344g) new C16336a(locale))));
    }

    @C12579k
    /* renamed from: b */
    public C16344g mo47353b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new C16336a(forLanguageTag);
    }
}
