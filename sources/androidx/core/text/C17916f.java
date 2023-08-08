package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.C0376v0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.text.f */
public final class C17916f {
    @C0376v0(17)
    /* renamed from: a */
    public static final int m81507a(@C12579k Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
