package androidx.compose.p004ui.text.intl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.intl.a */
public final class C16336a implements C16344g {
    @C12579k

    /* renamed from: a */
    public final Locale f40564a;

    public C16336a(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "javaLocale");
        this.f40564a = locale;
    }

    @C12579k
    /* renamed from: a */
    public String mo47347a() {
        String script = this.f40564a.getScript();
        Intrinsics.checkNotNullExpressionValue(script, "javaLocale.script");
        return script;
    }

    @C12579k
    /* renamed from: b */
    public String mo47348b() {
        String languageTag = this.f40564a.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    @C12579k
    /* renamed from: c */
    public String mo47349c() {
        String language = this.f40564a.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "javaLocale.language");
        return language;
    }

    @C12579k
    /* renamed from: d */
    public String mo47350d() {
        String country = this.f40564a.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "javaLocale.country");
        return country;
    }

    @C12579k
    /* renamed from: e */
    public final Locale mo47351e() {
        return this.f40564a;
    }
}
