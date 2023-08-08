package com.carrefour.fid.android.shared.util;

import androidx.compose.runtime.internal.C8567o;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.v */
public final class C28954v {
    @C12579k

    /* renamed from: a */
    public static final C28955a f70982a = new C28955a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70983b = 0;

    /* renamed from: com.carrefour.fid.android.shared.util.v$a */
    public static final class C28955a {
        public /* synthetic */ C28955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final String mo84287a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "requestId");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            try {
                String substring = str.substring(0, 8);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int a = C28953u.m119763a(substring, 16);
                C11368t0 t0Var = C11368t0.f28504a;
                String format = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(a ^ 1805526396)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                String substring2 = uuid.substring(8);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                String str2 = format + substring2;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = str2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return upperCase;
            } catch (Exception unused) {
                return "";
            }
        }

        public C28955a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final String m119764a(@C12579k String str) {
        return f70982a.mo84287a(str);
    }
}
