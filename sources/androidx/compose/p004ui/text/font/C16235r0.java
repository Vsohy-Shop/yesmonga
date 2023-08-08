package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.p004ui.text.font.C16242u;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0344h1
@C0376v0(28)
/* renamed from: androidx.compose.ui.text.font.r0 */
public final class C16235r0 implements C16233q0 {
    /* renamed from: e */
    public static /* synthetic */ Typeface m73143e(C16235r0 r0Var, String str, C16209i0 i0Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return r0Var.mo47002d(str, i0Var, i);
    }

    @C12579k
    /* renamed from: a */
    public Typeface mo46999a(@C12579k C16216k0 k0Var, @C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(k0Var, "name");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return mo47002d(k0Var.mo46975H(), i0Var, i);
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47000b(@C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return mo47002d((String) null, i0Var, i);
    }

    @C12580l
    /* renamed from: c */
    public Typeface mo47001c(@C12579k String str, @C12579k C16209i0 i0Var, int i, @C12579k C16201h0.C16206e eVar, @C12579k Context context) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(str, "familyName");
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C16242u.C16243a aVar = C16242u.f40340b;
        if (Intrinsics.areEqual((Object) str, (Object) aVar.mo47010d().mo46975H())) {
            typeface = mo46999a(aVar.mo47010d(), i0Var, i);
        } else if (Intrinsics.areEqual((Object) str, (Object) aVar.mo47011e().mo46975H())) {
            typeface = mo46999a(aVar.mo47011e(), i0Var, i);
        } else if (Intrinsics.areEqual((Object) str, (Object) aVar.mo47009c().mo46975H())) {
            typeface = mo46999a(aVar.mo47009c(), i0Var, i);
        } else if (Intrinsics.areEqual((Object) str, (Object) aVar.mo47007a().mo46975H())) {
            typeface = mo46999a(aVar.mo47007a(), i0Var, i);
        } else {
            typeface = mo47003f(str, i0Var, i);
        }
        return C16241t0.m73160c(typeface, eVar, context);
    }

    /* renamed from: d */
    public final Typeface mo47002d(String str, C16209i0 i0Var, int i) {
        Typeface typeface;
        boolean z;
        C16190e0.C16191a aVar = C16190e0.f40252b;
        if (C16190e0.m72951f(i, aVar.mo46883b()) && Intrinsics.areEqual((Object) i0Var, (Object) C16209i0.f40292b.mo46952m())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface2 = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(typeface2, "DEFAULT");
                return typeface2;
            }
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        Typeface a = Typeface.create(typeface, i0Var.mo46939t0(), C16190e0.m72951f(i, aVar.mo46882a()));
        Intrinsics.checkNotNullExpressionValue(a, "create(\n            fami…ontStyle.Italic\n        )");
        return a;
    }

    /* renamed from: f */
    public final Typeface mo47003f(String str, C16209i0 i0Var, int i) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Typeface d = mo47002d(str, i0Var, i);
        boolean f = C16190e0.m72951f(i, C16190e0.f40252b.mo46882a());
        C16211i1 i1Var = C16211i1.f40304a;
        Typeface typeface = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(typeface, "DEFAULT");
        if (Intrinsics.areEqual((Object) d, (Object) i1Var.mo46960a(typeface, i0Var.mo46939t0(), f)) || Intrinsics.areEqual((Object) d, (Object) mo47002d((String) null, i0Var, i))) {
            z2 = false;
        }
        if (z2) {
            return d;
        }
        return null;
    }
}
