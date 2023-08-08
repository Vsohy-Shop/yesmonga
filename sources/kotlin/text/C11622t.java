package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11429q;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.collections.C10904b;
import kotlin.collections.C10953k0;
import kotlin.collections.C10956m;
import kotlin.internal.C11110f;
import kotlin.internal.C11112h;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,825:1\n1174#2,2:826\n1#3:828\n1726#4,3:829\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:826,2\n621#1:829,3\n*E\n"})
/* renamed from: kotlin.text.t */
public class C11622t extends C11621s {
    @C11110f
    /* renamed from: A0 */
    public static final String m45324A0(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        return new String(bArr, i, i2, C11602d.f28868b);
    }

    @C11110f
    /* renamed from: B0 */
    public static final String m45325B0(byte[] bArr, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, i, i2, charset);
    }

    @C11110f
    /* renamed from: C0 */
    public static final String m45326C0(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, charset);
    }

    @C11110f
    /* renamed from: D0 */
    public static final String m45327D0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "chars");
        return new String(cArr);
    }

    @C11110f
    /* renamed from: E0 */
    public static final String m45328E0(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "chars");
        return new String(cArr, i, i2);
    }

    @C11110f
    /* renamed from: F0 */
    public static final String m45329F0(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @C11110f
    /* renamed from: G0 */
    public static final int m45330G0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i);
    }

    @C11110f
    /* renamed from: H0 */
    public static final int m45331H0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i);
    }

    @C11110f
    /* renamed from: I0 */
    public static final int m45332I0(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i, i2);
    }

    @C11110f
    /* renamed from: J0 */
    public static final boolean m45333J0(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @C11110f
    /* renamed from: K0 */
    public static final boolean m45334K0(String str, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    /* renamed from: L0 */
    public static final /* synthetic */ String m45335L0(String str, Locale locale, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, this, *args)");
        return format;
    }

    @C11110f
    /* renamed from: M0 */
    public static final String m45336M0(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    @C11110f
    /* renamed from: N0 */
    public static final String m45337N0(C11368t0 t0Var, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "format");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    /* renamed from: O0 */
    public static final /* synthetic */ String m45338O0(C11368t0 t0Var, Locale locale, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(str, "format");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    @C11110f
    @C11314h(name = "formatNullable")
    @C11665v0(version = "1.4")
    /* renamed from: P0 */
    public static final String m45339P0(String str, Locale locale, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, this, *args)");
        return format;
    }

    @C11110f
    @C11314h(name = "formatNullable")
    @C11665v0(version = "1.4")
    /* renamed from: Q0 */
    public static final String m45340Q0(C11368t0 t0Var, Locale locale, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "format");
        Intrinsics.checkNotNullParameter(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    @C11110f
    /* renamed from: R0 */
    public static final String m45341R0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String intern = str.intern();
        Intrinsics.checkNotNullExpressionValue(intern, "this as java.lang.String).intern()");
        return intern;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: S0 */
    public static final String m45342S0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: T0 */
    public static final String m45343T0(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @C11110f
    /* renamed from: U0 */
    public static final int m45344U0(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c, i);
    }

    @C11110f
    /* renamed from: V0 */
    public static final int m45345V0(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i);
    }

    @C11110f
    /* renamed from: W0 */
    public static final int m45346W0(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @C11110f
    /* renamed from: X0 */
    public static final int m45347X0(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    @C11110f
    /* renamed from: Y0 */
    public static final int m45348Y0(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    @C11110f
    /* renamed from: Z0 */
    public static final String m45349Z0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @C11110f
    /* renamed from: a1 */
    public static final String m45350a1(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @C11110f
    /* renamed from: b1 */
    public static final byte[] m45351b1(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @C11110f
    /* renamed from: c1 */
    public static final char[] m45352c1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @C11395k(message = "Use replaceFirstChar instead.", replaceWith = @C11587t0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @C11398l(warningSince = "1.5")
    @C12579k
    public static final String capitalize(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return capitalize(str, locale);
    }

    public static final int compareTo(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "other");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return compareTo(str, str2, z);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final String concatToString(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return concatToString(cArr, i, i2);
    }

    @C11665v0(version = "1.5")
    public static final boolean contentEquals(@C12580l CharSequence charSequence, @C12580l CharSequence charSequence2) {
        if (!(charSequence instanceof String) || charSequence2 == null) {
            return StringsKt__StringsKt.contentEqualsImpl(charSequence, charSequence2);
        }
        return ((String) charSequence).contentEquals(charSequence2);
    }

    @C11110f
    /* renamed from: d1 */
    public static final char[] m45353d1(String str, char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(cArr, FirebaseAnalytics.C32532b.f78977z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @C11395k(message = "Use replaceFirstChar instead.", replaceWith = @C11587t0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @C11398l(warningSince = "1.5")
    @C12579k
    public static final String decapitalize(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final String decodeToString(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, C11602d.f28868b);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return decodeToString(bArr, i, i2, z);
    }

    @C11395k(message = "Use lowercase() instead.", replaceWith = @C11587t0(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: e1 */
    public static final String m45354e1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final byte[] encodeToByteArray(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return encodeToByteArray(str, i, i2, z);
    }

    public static final boolean endsWith(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return regionMatches(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(str, str2, z);
    }

    public static final boolean equals(@C12580l String str, @C12580l String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(str, str2, z);
    }

    @C11395k(message = "Use lowercase() instead.", replaceWith = @C11587t0(expression = "lowercase(locale)", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: f1 */
    public static final String m45355f1(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @C11110f
    /* renamed from: g1 */
    public static final Pattern m45356g1(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(this, flags)");
        return compile;
    }

    @C12579k
    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(@C12579k C11368t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @C11395k(message = "Use uppercase() instead.", replaceWith = @C11587t0(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: h1 */
    public static final String m45357h1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @C11395k(message = "Use uppercase() instead.", replaceWith = @C11587t0(expression = "uppercase(locale)", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11110f
    /* renamed from: i1 */
    public static final String m45358i1(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isBlank(@org.jetbrains.annotations.C12579k java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length()
            r1 = 1
            if (r0 == 0) goto L_0x0040
            kotlin.ranges.l r0 = kotlin.text.StringsKt__StringsKt.getIndices(r4)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            r2 = r0
            kotlin.collections.k0 r2 = (kotlin.collections.C10953k0) r2
            int r2 = r2.mo6374c()
            char r2 = r4.charAt(r2)
            boolean r2 = kotlin.text.C11600b.m45189r(r2)
            if (r2 != 0) goto L_0x0024
            r4 = r3
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C11622t.isBlank(java.lang.CharSequence):boolean");
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: j1 */
    public static final String m45359j1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: k1 */
    public static final String m45360k1(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final boolean regionMatches(@C12579k CharSequence charSequence, int i, @C12579k CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return StringsKt__StringsKt.regionMatchesImpl(charSequence, i, charSequence2, i2, i3, z);
        }
        return regionMatches((String) charSequence, i, (String) charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    @C12579k
    public static final String repeat(@C12579k CharSequence charSequence, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C10953k0 H = new C11466l(1, i).iterator();
                while (H.hasNext()) {
                    H.mo6374c();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    @C12579k
    public static final String replace(@C12579k String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C11601c.m45204J(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String replace$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, c, c2, z);
    }

    @C12579k
    public static final String replaceFirst(@C12579k String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, 0, z, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange(str, indexOf$default, indexOf$default + 1, String.valueOf(c2)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, c, c2, z);
    }

    @C12579k
    public static final List<String> split(@C12579k CharSequence charSequence, @C12579k Pattern pattern, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "regex");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        String[] split = pattern.split(charSequence, i);
        Intrinsics.checkNotNullExpressionValue(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return C10956m.m41290t(split);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return split(charSequence, pattern, i);
    }

    public static final boolean startsWith(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return regionMatches(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(str, str2, z);
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final char[] toCharArray(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C10904b.f28138a.mo22055a(i, i2, str.length());
        char[] cArr = new char[(i2 - i)];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return toCharArray(str, i, i2);
    }

    public static /* synthetic */ Pattern toPattern$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(this, flags)");
        return compile;
    }

    @C11110f
    /* renamed from: x0 */
    public static final String m45361x0(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @C11110f
    /* renamed from: y0 */
    public static final String m45362y0(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "stringBuilder");
        return new String(sb);
    }

    @C11110f
    /* renamed from: z0 */
    public static final String m45363z0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        return new String(bArr, C11602d.f28868b);
    }

    @C11395k(message = "Use replaceFirstChar instead.", replaceWith = @C11587t0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11665v0(version = "1.4")
    @C11112h
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    public static final String capitalize(@C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final String concatToString(@C12579k char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        C10904b.f28138a.mo22055a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    @C11395k(message = "Use replaceFirstChar instead.", replaceWith = @C11587t0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @C11398l(warningSince = "1.5")
    @C11665v0(version = "1.4")
    @C11112h
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    public static final String decapitalize(@C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final String decodeToString(@C12579k byte[] bArr, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C10904b.f28138a.mo22055a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, C11602d.f28868b);
        }
        String charBuffer = C11602d.f28868b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        Intrinsics.checkNotNullExpressionValue(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    @C12579k
    public static final byte[] encodeToByteArray(@C12579k String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C10904b.f28138a.mo22055a(i, i2, str.length());
        if (!z) {
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C11602d.f28868b;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = C11602d.f28868b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            Intrinsics.checkNotNull(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                Intrinsics.checkNotNullExpressionValue(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return regionMatches(str, i, str2, i2, i3, z);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replace(str, str2, str3, z);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return replaceFirst(str, str2, str3, z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(str, str2, i, z);
    }

    public static /* synthetic */ char[] toCharArray$default(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(cArr, FirebaseAnalytics.C32532b.f78977z);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @C12579k
    public static final String replaceFirst(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "oldValue");
        Intrinsics.checkNotNullParameter(str3, "newValue");
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, z, 2, (Object) null);
        return indexOf$default < 0 ? str : StringsKt__StringsKt.replaceRange(str, indexOf$default, str2.length() + indexOf$default, str3).toString();
    }

    public static final boolean startsWith(@C12579k String str, @C12579k String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return regionMatches(str, i, str2, 0, str2.length(), z);
    }

    @C11665v0(version = "1.5")
    public static final boolean contentEquals(@C12580l CharSequence charSequence, @C12580l CharSequence charSequence2, boolean z) {
        if (z) {
            return StringsKt__StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    public static final boolean regionMatches(@C12579k String str, int i, @C12579k String str2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @C12579k
    public static final String replace(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "oldValue");
        Intrinsics.checkNotNullParameter(str3, "newValue");
        int i = 0;
        int indexOf = StringsKt__StringsKt.indexOf((CharSequence) str, str2, 0, z);
        if (indexOf < 0) {
            return str;
        }
        int length = str2.length();
        int u = C11479u.m44447u(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, indexOf);
                sb.append(str3);
                i = indexOf + length;
                if (indexOf >= str.length() || (indexOf = StringsKt__StringsKt.indexOf((CharSequence) str, str2, indexOf + u, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, indexOf);
                sb.append(str3);
                i = indexOf + length;
                break;
            } while ((indexOf = StringsKt__StringsKt.indexOf((CharSequence) str, str2, indexOf + u, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }
}
