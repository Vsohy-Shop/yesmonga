package p073j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42679r;

/* renamed from: j$.time.format.h */
final class C42634h implements C42633g {

    /* renamed from: a */
    private final C42675n f107861a;

    /* renamed from: b */
    private final int f107862b;

    /* renamed from: c */
    private final int f107863c;

    /* renamed from: d */
    private final boolean f107864d;

    C42634h(C42662a aVar, int i, int i2, boolean z) {
        Objects.requireNonNull(aVar, "field");
        if (!aVar.mo138210E().mo138232g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        } else if (i2 >= i) {
            this.f107861a = aVar;
            this.f107862b = i;
            this.f107863c = i2;
            this.f107864d = z;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        C42675n nVar = this.f107861a;
        Long e = yVar.mo138185e(nVar);
        if (e == null) {
            return false;
        }
        DecimalStyle b = yVar.mo138182b();
        long longValue = e.longValue();
        C42679r E = nVar.mo138210E();
        E.mo138227b(longValue, nVar);
        BigDecimal valueOf = BigDecimal.valueOf(E.mo138229e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(E.mo138228d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z = this.f107864d;
        int i = this.f107862b;
        if (scale != 0) {
            String a = b.mo138124a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.f107863c), RoundingMode.FLOOR).toPlainString().substring(2));
            if (z) {
                sb.append(b.mo138126c());
            }
            sb.append(a);
            return true;
        } else if (i <= 0) {
            return true;
        } else {
            if (z) {
                sb.append(b.mo138126c());
            }
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(b.mo138130f());
            }
            return true;
        }
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = wVar.mo138171l() ? this.f107862b : 0;
        int i4 = wVar.mo138171l() ? this.f107863c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i3 > 0 ? ~i : i;
        }
        if (this.f107864d) {
            if (charSequence.charAt(i) != wVar.mo138166g().mo138126c()) {
                return i3 > 0 ? ~i : i;
            }
            i++;
        }
        int i5 = i;
        int i6 = i3 + i5;
        if (i6 > length) {
            return ~i5;
        }
        int min = Math.min(i4 + i5, length);
        int i7 = 0;
        int i8 = i5;
        while (true) {
            if (i8 >= min) {
                i2 = i8;
                break;
            }
            int i9 = i8 + 1;
            int b = wVar.mo138166g().mo138125b(charSequence.charAt(i8));
            if (b >= 0) {
                i7 = (i7 * 10) + b;
                i8 = i9;
            } else if (i9 < i6) {
                return ~i5;
            } else {
                i2 = i9 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i2 - i5);
        C42679r E = this.f107861a.mo138210E();
        BigDecimal valueOf = BigDecimal.valueOf(E.mo138229e());
        return wVar.mo138174o(this.f107861a, movePointLeft.multiply(BigDecimal.valueOf(E.mo138228d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i5, i2);
    }

    public final String toString() {
        String str = this.f107864d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f107861a + "," + this.f107862b + "," + this.f107863c + str + ")";
    }
}
