package androidx.compose.p004ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.colorspace.C15144g;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.compose.ui.graphics.t1 */
public final class C15319t1 {
    @C12579k

    /* renamed from: a */
    public static final C15319t1 f37700a = new C15319t1();

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: a */
    public static final C15138c m66553a(@C12579k Bitmap bitmap) {
        C15138c b;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ColorSpace a = bitmap.getColorSpace();
        if (a == null || (b = m66554b(a)) == null) {
            return C15144g.f37408a.mo42612x();
        }
        return b;
    }

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: b */
    public static final C15138c m66554b(@C12579k ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.SRGB))) {
            return C15144g.f37408a.mo42612x();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.ACES))) {
            return C15144g.f37408a.mo42593e();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return C15144g.f37408a.mo42594f();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return C15144g.f37408a.mo42595g();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.BT2020))) {
            return C15144g.f37408a.mo42596h();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.BT709))) {
            return C15144g.f37408a.mo42597i();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return C15144g.f37408a.mo42598j();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return C15144g.f37408a.mo42599k();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return C15144g.f37408a.mo42602n();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return C15144g.f37408a.mo42603o();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return C15144g.f37408a.mo42604p();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return C15144g.f37408a.mo42605q();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return C15144g.f37408a.mo42606r();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return C15144g.f37408a.mo42607s();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return C15144g.f37408a.mo42610v();
        }
        if (Intrinsics.areEqual((Object) colorSpace, (Object) ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            return C15144g.f37408a.mo42611w();
        }
        return C15144g.f37408a.mo42612x();
    }

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: c */
    public static final Bitmap m66555c(int i, int i2, int i3, boolean z, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        Bitmap a = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C15247k0.m66140d(i3), z, m66556d(cVar));
        Intrinsics.checkNotNullExpressionValue(a, "createBitmap(\n          …orkColorSpace()\n        )");
        return a;
    }

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: d */
    public static final ColorSpace m66556d(@C12579k C15138c cVar) {
        ColorSpace.Named named;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C15144g gVar = C15144g.f37408a;
        if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42612x())) {
            named = ColorSpace.Named.SRGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42593e())) {
            named = ColorSpace.Named.ACES;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42594f())) {
            named = ColorSpace.Named.ACESCG;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42595g())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42596h())) {
            named = ColorSpace.Named.BT2020;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42597i())) {
            named = ColorSpace.Named.BT709;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42598j())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42599k())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42602n())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42603o())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42604p())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42605q())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42606r())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42607s())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42610v())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) gVar.mo42611w())) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        ColorSpace a = ColorSpace.get(named);
        Intrinsics.checkNotNullExpressionValue(a, "get(frameworkNamedSpace)");
        return a;
    }
}
