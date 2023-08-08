package p073j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j$.time.format.DecimalStyle */
public final class DecimalStyle {

    /* renamed from: e */
    public static final DecimalStyle f107840e = new DecimalStyle('0', '-', '.');

    /* renamed from: f */
    private static final ConcurrentMap f107841f = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    private final char f107842a;

    /* renamed from: b */
    private final char f107843b = '+';

    /* renamed from: c */
    private final char f107844c;

    /* renamed from: d */
    private final char f107845d;

    private DecimalStyle(char c, char c2, char c3) {
        this.f107842a = c;
        this.f107844c = c2;
        this.f107845d = c3;
    }

    /* renamed from: of */
    public static DecimalStyle m172334of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f107841f;
        DecimalStyle decimalStyle = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = instance.getZeroDigit();
        char minusSign = instance.getMinusSign();
        char decimalSeparator = instance.getDecimalSeparator();
        concurrentHashMap.putIfAbsent(locale, (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? f107840e : new DecimalStyle(zeroDigit, minusSign, decimalSeparator));
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo138124a(String str) {
        char c = this.f107842a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo138125b(char c) {
        int i = c - this.f107842a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    /* renamed from: c */
    public final char mo138126c() {
        return this.f107845d;
    }

    /* renamed from: d */
    public final char mo138127d() {
        return this.f107844c;
    }

    /* renamed from: e */
    public final char mo138128e() {
        return this.f107843b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f107842a == decimalStyle.f107842a && this.f107843b == decimalStyle.f107843b && this.f107844c == decimalStyle.f107844c && this.f107845d == decimalStyle.f107845d;
    }

    /* renamed from: f */
    public final char mo138130f() {
        return this.f107842a;
    }

    public final int hashCode() {
        return this.f107842a + this.f107843b + this.f107844c + this.f107845d;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f107842a + this.f107843b + this.f107844c + this.f107845d + "]";
    }
}
