package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C41993i implements C42133q {

    /* renamed from: a */
    public final Double f106199a;

    public C41993i(Double d) {
        if (d == null) {
            this.f106199a = Double.valueOf(Double.NaN);
        } else {
            this.f106199a = d;
        }
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        return new C41993i(this.f106199a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C41993i)) {
            return false;
        }
        return this.f106199a.equals(((C41993i) obj).f106199a);
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        boolean z = false;
        if (!Double.isNaN(this.f106199a.doubleValue()) && this.f106199a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final int hashCode() {
        return this.f106199a.hashCode();
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        if ("toString".equals(str)) {
            return new C42201u(mo136744k());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo136744k(), str}));
    }

    /* renamed from: j */
    public final Double mo136743j() {
        return this.f106199a;
    }

    /* renamed from: k */
    public final String mo136744k() {
        int i;
        if (Double.isNaN(this.f106199a.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(this.f106199a.doubleValue())) {
            BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f106199a.doubleValue()).stripTrailingZeros();
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (stripTrailingZeros.scale() > 0) {
                i = stripTrailingZeros.precision();
            } else {
                i = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(i - 1);
            String format = decimalFormat.format(stripTrailingZeros);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return stripTrailingZeros.toPlainString();
        } else if (this.f106199a.doubleValue() > 0.0d) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return null;
    }

    public final String toString() {
        return mo136744k();
    }
}
