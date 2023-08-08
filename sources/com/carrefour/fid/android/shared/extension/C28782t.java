package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.design.components.widgets.productcard.C37357d;
import com.carrefour.fid.android.shared.util.C28935i;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Double.kt\ncom/carrefour/fid/android/shared/extension/DoubleKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.t */
public final class C28782t {
    @C12579k

    /* renamed from: a */
    public static final NumberFormat f70446a;

    /* renamed from: b */
    public static final char f70447b = DecimalFormatSymbols.getInstance(Locale.FRENCH).getGroupingSeparator();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.FRANCE);
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(Locale.FRANC…ximumFractionDigits = 2\n}");
        f70446a = instance;
    }

    @C12579k
    /* renamed from: a */
    public static final String m119104a(@C12580l Double d) {
        String valueOf;
        if (d == null || (valueOf = String.valueOf(Math.abs(d.doubleValue()))) == null) {
            return "0.0";
        }
        return valueOf;
    }

    @C12579k
    /* renamed from: b */
    public static final String m119105b(@C12580l Double d) {
        if (d == null) {
            return " - ";
        }
        try {
            d.doubleValue();
            String str = m119108e(d.doubleValue()) + C37357d.f93887a;
            if (str == null) {
                return " - ";
            }
            return str;
        } catch (ArithmeticException e) {
            ArithmeticException arithmeticException = e;
            C28935i.m119704b(C28935i.f70940a, String.valueOf(arithmeticException.getMessage()), arithmeticException, 0, 4, (Object) null);
            return " - ";
        }
    }

    @C12579k
    /* renamed from: c */
    public static final String m119106c(double d) {
        int K0 = C11409d.m43849K0(d / ((double) 100));
        return K0 + C37357d.f93887a;
    }

    @C12579k
    /* renamed from: d */
    public static final String m119107d(double d) {
        int i = (int) (d % ((double) 100));
        if (i == 0) {
            return (((int) d) / 100) + "%";
        }
        return (((int) d) / 100) + "," + i + "%";
    }

    @C12579k
    /* renamed from: e */
    public static final String m119108e(double d) {
        return f70446a.format(d).toString();
    }

    /* renamed from: f */
    public static final double m119109f(double d) {
        return Double.parseDouble((((int) d) / 100) + "." + ((int) (d % ((double) 100))));
    }

    /* renamed from: g */
    public static final char m119110g() {
        return f70447b;
    }

    /* renamed from: h */
    public static final double m119111h(@C12580l Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    @C12579k
    /* renamed from: i */
    public static final String m119112i(double d) {
        String format = new DecimalFormat("0.##").format(d);
        Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"0.##\").format(this)");
        return format;
    }
}
