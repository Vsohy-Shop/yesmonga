package androidx.compose.material3;

import android.content.res.Configuration;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.compose.material3.C8181c1;
import androidx.compose.material3.C8249n;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.core.p027os.C17785f;
import java.util.Locale;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,76:1\n76#2:77\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n*L\n74#1:77\n*E\n"})
/* renamed from: androidx.compose.material3.p */
public final class C8260p {
    @C8251n0
    @C12579k
    /* renamed from: a */
    public static final C8244m m27432a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C8249n();
        }
        return new C8181c1();
    }

    @C8251n0
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: b */
    public static final Locale m27433b(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(895332416, i, -1, "androidx.compose.material3.defaultLocale (CalendarModel.android.kt:72)");
        }
        Locale d = C17785f.m81175a((Configuration) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).mo52233d(0);
        if (d == null) {
            d = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(d, "getDefault()");
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return d;
    }

    @C8251n0
    @C12579k
    /* renamed from: c */
    public static final String m27434c(long j, @C12579k String str, @C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(str, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
        if (Build.VERSION.SDK_INT >= 26) {
            C8249n.C8250a aVar = C8249n.f20370c;
            Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "pattern");
            return aVar.mo12865a(j, bestDateTimePattern, locale);
        }
        C8181c1.C8182a aVar2 = C8181c1.f20030c;
        Intrinsics.checkNotNullExpressionValue(bestDateTimePattern, "pattern");
        return aVar2.mo12503a(j, bestDateTimePattern, locale);
    }

    /* renamed from: d */
    public static /* synthetic */ String m27435d(long j, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "m epoch)\n * ");
        }
        return m27434c(j, str, locale);
    }
}
