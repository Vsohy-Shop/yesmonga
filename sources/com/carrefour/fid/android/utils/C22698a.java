package com.carrefour.fid.android.utils;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.utils.a */
public final class C22698a {
    @C12579k

    /* renamed from: a */
    public static final C22698a f58147a = new C22698a();
    @C12579k

    /* renamed from: b */
    public static final NumberFormat f58148b;

    /* renamed from: c */
    public static final int f58149c = 8;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.FRANCE);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(Locale.FRANCE)");
        f58148b = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
    }

    @C11395k(message = "Moved as String extension.", replaceWith = @C11587t0(expression = "cents.getEurosFromCents()", imports = {}))
    /* renamed from: a */
    public final double mo67072a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "cents");
        try {
            if (C11622t.isBlank(str)) {
                str = "0";
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
                return Double.parseDouble(str);
            }
            return Double.parseDouble(str) / ((double) 100);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = e;
            C28935i.m119704b(C28935i.f70940a, String.valueOf(numberFormatException.getMessage()), numberFormatException, 0, 4, (Object) null);
            return 0.0d;
        }
    }
}
