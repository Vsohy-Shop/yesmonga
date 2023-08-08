package androidx.compose.p004ui.text.platform;

import androidx.compose.p004ui.text.C16461z;
import androidx.compose.p004ui.text.intl.C16336a;
import androidx.compose.p004ui.text.intl.C16344g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.j */
public final class C16381j implements C16461z {
    @C12579k
    /* renamed from: a */
    public String mo47543a(@C12579k String str, @C12579k C16344g gVar) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(gVar, "locale");
        String lowerCase = str.toLowerCase(((C16336a) gVar).mo47351e());
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @C12579k
    /* renamed from: b */
    public String mo47544b(@C12579k String str, @C12579k C16344g gVar) {
        boolean z;
        String str2;
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(gVar, "locale");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            str2 = C11600b.m45193v(charAt, ((C16336a) gVar).mo47351e());
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @C12579k
    /* renamed from: c */
    public String mo47545c(@C12579k String str, @C12579k C16344g gVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(gVar, "locale");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C11600b.m45191t(str.charAt(0), ((C16336a) gVar).mo47351e()));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @C12579k
    /* renamed from: d */
    public String mo47546d(@C12579k String str, @C12579k C16344g gVar) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Intrinsics.checkNotNullParameter(gVar, "locale");
        String upperCase = str.toUpperCase(((C16336a) gVar).mo47351e());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
