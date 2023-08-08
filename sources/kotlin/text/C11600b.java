package kotlin.text;

import java.util.Locale;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11429q;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.text.b */
public class C11600b {
    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: A */
    public static final String m45169A(char c) {
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: B */
    public static final String m45170B(char c, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: C */
    public static final char m45171C(char c) {
        return Character.toUpperCase(c);
    }

    @C11532s0
    /* renamed from: a */
    public static final int m45172a(int i) {
        if (new C11466l(2, 36).mo23056Q(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C11466l(2, 36));
    }

    /* renamed from: b */
    public static final int m45173b(char c, int i) {
        return Character.digit(c, i);
    }

    @C12579k
    /* renamed from: c */
    public static final CharCategory m45174c(char c) {
        return CharCategory.f28804a.mo23307a(Character.getType(c));
    }

    @C12579k
    /* renamed from: d */
    public static final CharDirectionality m45175d(char c) {
        return CharDirectionality.f28827a.mo23310b(Character.getDirectionality(c));
    }

    @C11110f
    /* renamed from: e */
    public static final boolean m45176e(char c) {
        return Character.isDefined(c);
    }

    @C11110f
    /* renamed from: f */
    public static final boolean m45177f(char c) {
        return Character.isDigit(c);
    }

    @C11110f
    /* renamed from: g */
    public static final boolean m45178g(char c) {
        return Character.isHighSurrogate(c);
    }

    @C11110f
    /* renamed from: h */
    public static final boolean m45179h(char c) {
        return Character.isISOControl(c);
    }

    @C11110f
    /* renamed from: i */
    public static final boolean m45180i(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @C11110f
    /* renamed from: j */
    public static final boolean m45181j(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @C11110f
    /* renamed from: k */
    public static final boolean m45182k(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @C11110f
    /* renamed from: l */
    public static final boolean m45183l(char c) {
        return Character.isLetter(c);
    }

    @C11110f
    /* renamed from: m */
    public static final boolean m45184m(char c) {
        return Character.isLetterOrDigit(c);
    }

    @C11110f
    /* renamed from: n */
    public static final boolean m45185n(char c) {
        return Character.isLowSurrogate(c);
    }

    @C11110f
    /* renamed from: o */
    public static final boolean m45186o(char c) {
        return Character.isLowerCase(c);
    }

    @C11110f
    /* renamed from: p */
    public static final boolean m45187p(char c) {
        return Character.isTitleCase(c);
    }

    @C11110f
    /* renamed from: q */
    public static final boolean m45188q(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: r */
    public static final boolean m45189r(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: s */
    public static final String m45190s(char c) {
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: t */
    public static final String m45191t(char c, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: u */
    public static final char m45192u(char c) {
        return Character.toLowerCase(c);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: v */
    public static final String m45193v(char c, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String B = m45170B(c, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!Intrinsics.areEqual((Object) B, (Object) upperCase)) {
                return B;
            }
            return String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return B;
        } else {
            char charAt = B.charAt(0);
            Intrinsics.checkNotNull(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: w */
    public static final char m45194w(char c) {
        return Character.toTitleCase(c);
    }

    @C11395k(message = "Use lowercaseChar() instead.", replaceWith = @C11587t0(expression = "lowercaseChar()", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: x */
    public static final char m45195x(char c) {
        return Character.toLowerCase(c);
    }

    @C11395k(message = "Use titlecaseChar() instead.", replaceWith = @C11587t0(expression = "titlecaseChar()", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: y */
    public static final char m45196y(char c) {
        return Character.toTitleCase(c);
    }

    @C11395k(message = "Use uppercaseChar() instead.", replaceWith = @C11587t0(expression = "uppercaseChar()", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: z */
    public static final char m45197z(char c) {
        return Character.toUpperCase(c);
    }
}
