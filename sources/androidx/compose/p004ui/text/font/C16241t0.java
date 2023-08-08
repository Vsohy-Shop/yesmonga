package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16201h0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.t0 */
public final class C16241t0 {
    @C12579k
    /* renamed from: a */
    public static final C16233q0 m73158a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C16235r0();
        }
        return new C16237s0();
    }

    @C0344h1
    @C12579k
    /* renamed from: b */
    public static final String m73159b(@C12579k String str, @C12579k C16209i0 i0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        int t0 = i0Var.mo46939t0() / 100;
        boolean z4 = true;
        if (t0 < 0 || t0 >= 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str + "-thin";
        }
        if (2 > t0 || t0 >= 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return str + "-light";
        } else if (t0 == 4) {
            return str;
        } else {
            if (t0 == 5) {
                return str + "-medium";
            }
            if (6 > t0 || t0 >= 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return str;
            }
            if (8 > t0 || t0 >= 11) {
                z4 = false;
            }
            if (!z4) {
                return str;
            }
            return str + "-black";
        }
    }

    @C16259h
    @C12580l
    /* renamed from: c */
    public static final Typeface m73160c(@C12580l Typeface typeface, @C12579k C16201h0.C16206e eVar, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceCompatApi26.f40229a.mo46802a(typeface, eVar, context);
        }
        return typeface;
    }
}
