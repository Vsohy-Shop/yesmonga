package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.p004ui.text.font.C16242u;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0344h1
/* renamed from: androidx.compose.ui.text.font.s0 */
public final class C16237s0 implements C16233q0 {
    /* renamed from: e */
    public static /* synthetic */ Typeface m73149e(C16237s0 s0Var, String str, C16209i0 i0Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i2 & 4) != 0) {
            i = C16190e0.f40252b.mo46883b();
        }
        return s0Var.mo47004d(str, i0Var, i);
    }

    @C12579k
    /* renamed from: a */
    public Typeface mo46999a(@C12579k C16216k0 k0Var, @C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(k0Var, "name");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        Typeface f = mo47005f(C16241t0.m73159b(k0Var.mo46975H(), i0Var), i0Var, i);
        if (f == null) {
            return mo47004d(k0Var.mo46975H(), i0Var, i);
        }
        return f;
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47000b(@C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return mo47004d((String) null, i0Var, i);
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
            typeface = mo47005f(str, i0Var, i);
        }
        return C16241t0.m73160c(typeface, eVar, context);
    }

    /* renamed from: d */
    public final Typeface mo47004d(String str, C16209i0 i0Var, int i) {
        boolean z;
        boolean z2 = false;
        if (C16190e0.m72951f(i, C16190e0.f40252b.mo46883b()) && Intrinsics.areEqual((Object) i0Var, (Object) C16209i0.f40292b.mo46952m())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c = C16200h.m72990c(i0Var, i);
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: f */
    public final Typeface mo47005f(String str, C16209i0 i0Var, int i) {
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
        Typeface d = mo47004d(str, i0Var, i);
        if (Intrinsics.areEqual((Object) d, (Object) Typeface.create(Typeface.DEFAULT, C16200h.m72990c(i0Var, i))) || Intrinsics.areEqual((Object) d, (Object) mo47004d((String) null, i0Var, i))) {
            z2 = false;
        }
        if (z2) {
            return d;
        }
        return null;
    }
}
