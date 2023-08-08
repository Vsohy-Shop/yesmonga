package com.carrefour.fid.android.shared.util;

import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import p073j$.util.DesugarTimeZone;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.w */
public final class C28956w {
    @C12579k

    /* renamed from: a */
    public static final C28957a f70984a = new C28957a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70985b = 0;

    @C11363r0({"SMAP\nXRequestIdGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XRequestIdGenerator.kt\ncom/carrefour/fid/android/shared/util/XRequestIdGenerator$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,52:1\n37#2,2:53\n*S KotlinDebug\n*F\n+ 1 XRequestIdGenerator.kt\ncom/carrefour/fid/android/shared/util/XRequestIdGenerator$Companion\n*L\n41#1:53,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.util.w$a */
    public static final class C28957a {
        public /* synthetic */ C28957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final String mo84288a() {
            Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"), Locale.FRANCE);
            int i = (instance.get(2) + 1) * C16717v.C16718a.f42168q;
            int i2 = (instance.get(4) + 1) * 678;
            int i3 = (((instance.get(7) + 5) % 7) + 1) * 572;
            Random random = new Random();
            C11368t0 t0Var = C11368t0.f28504a;
            String format = String.format("%03x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            if (random.nextBoolean()) {
                format = new StringBuilder(format).reverse().toString();
                Intrinsics.checkNotNullExpressionValue(format, "StringBuilder(hexMoy).reverse().toString()");
            }
            String format2 = String.format("%03x", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            if (random.nextBoolean()) {
                format2 = new StringBuilder(format2).reverse().toString();
                Intrinsics.checkNotNullExpressionValue(format2, "StringBuilder(hexWom).reverse().toString()");
            }
            String format3 = String.format("%03x", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
            if (random.nextBoolean()) {
                format3 = new StringBuilder(format3).reverse().toString();
                Intrinsics.checkNotNullExpressionValue(format3, "StringBuilder(hexDow).reverse().toString()");
            }
            String str = UUID.randomUUID().toString() + UUID.randomUUID();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String replace$default = C11622t.replace$default(lowerCase, "-", "", false, 4, (Object) null);
            int nextInt = random.nextInt(((replace$default.length() - 6) - 3) + 1) + 3;
            Integer[] numArr = {Integer.valueOf(random.nextInt((nextInt - 3) + 1)), Integer.valueOf(nextInt), Integer.valueOf(random.nextInt(((replace$default.length() - 3) - (nextInt + 3)) + 1) + nextInt + 3)};
            List P = CollectionsKt__CollectionsKt.m40452P(numArr);
            Collections.shuffle(P);
            P.toArray(new Integer[0][]);
            String sb = new StringBuilder(replace$default).replace(numArr[0].intValue(), numArr[0].intValue() + 3, format).toString();
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder(hash).repl…] + 3, hexMoy).toString()");
            String sb2 = new StringBuilder(sb).replace(numArr[1].intValue(), numArr[1].intValue() + 3, format2).toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(hash).repl…] + 3, hexWom).toString()");
            String sb3 = new StringBuilder(sb2).replace(numArr[2].intValue(), numArr[2].intValue() + 3, format3).toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(hash).repl…] + 3, hexDow).toString()");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            String upperCase = sb3.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }

        public C28957a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final String m119766a() {
        return f70984a.mo84288a();
    }
}
