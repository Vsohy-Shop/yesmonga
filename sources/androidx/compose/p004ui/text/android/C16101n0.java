package androidx.compose.p004ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.n0 */
public final class C16101n0 {
    @C12579k

    /* renamed from: a */
    public final CharSequence f40033a;

    /* renamed from: b */
    public final int f40034b;

    /* renamed from: c */
    public final int f40035c;
    @C12579k

    /* renamed from: d */
    public final TextPaint f40036d;

    /* renamed from: e */
    public final int f40037e;
    @C12579k

    /* renamed from: f */
    public final TextDirectionHeuristic f40038f;
    @C12579k

    /* renamed from: g */
    public final Layout.Alignment f40039g;

    /* renamed from: h */
    public final int f40040h;
    @C12580l

    /* renamed from: i */
    public final TextUtils.TruncateAt f40041i;

    /* renamed from: j */
    public final int f40042j;

    /* renamed from: k */
    public final float f40043k;

    /* renamed from: l */
    public final float f40044l;

    /* renamed from: m */
    public final int f40045m;

    /* renamed from: n */
    public final boolean f40046n;

    /* renamed from: o */
    public final boolean f40047o;

    /* renamed from: p */
    public final int f40048p;

    /* renamed from: q */
    public final int f40049q;

    /* renamed from: r */
    public final int f40050r;

    /* renamed from: s */
    public final int f40051s;
    @C12580l

    /* renamed from: t */
    public final int[] f40052t;
    @C12580l

    /* renamed from: u */
    public final int[] f40053u;

    public C16101n0(@C12579k CharSequence charSequence, int i, int i2, @C12579k TextPaint textPaint, int i3, @C12579k TextDirectionHeuristic textDirectionHeuristic, @C12579k Layout.Alignment alignment, int i4, @C12580l TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, @C12580l int[] iArr, @C12580l int[] iArr2) {
        int i11 = i;
        int i12 = i2;
        TextPaint textPaint2 = textPaint;
        int i13 = i3;
        TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
        Layout.Alignment alignment2 = alignment;
        int i14 = i4;
        int i15 = i5;
        float f3 = f;
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint2, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic2, "textDir");
        Intrinsics.checkNotNullParameter(alignment2, C9168d0.f24891y);
        this.f40033a = charSequence;
        this.f40034b = i11;
        this.f40035c = i12;
        this.f40036d = textPaint2;
        this.f40037e = i13;
        this.f40038f = textDirectionHeuristic2;
        this.f40039g = alignment2;
        this.f40040h = i14;
        this.f40041i = truncateAt;
        this.f40042j = i15;
        this.f40043k = f3;
        this.f40044l = f2;
        this.f40045m = i6;
        this.f40046n = z;
        this.f40047o = z2;
        this.f40048p = i7;
        this.f40049q = i8;
        this.f40050r = i9;
        this.f40051s = i10;
        this.f40052t = iArr;
        this.f40053u = iArr2;
        boolean z3 = true;
        if (i11 >= 0 && i11 <= i12) {
            if (i12 >= 0 && i12 <= charSequence.length()) {
                if (i14 >= 0) {
                    if (i13 >= 0) {
                        if (i15 >= 0) {
                            if (!(f3 < 0.0f ? false : z3)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C12579k
    /* renamed from: a */
    public final Layout.Alignment mo46502a() {
        return this.f40039g;
    }

    /* renamed from: b */
    public final int mo46503b() {
        return this.f40048p;
    }

    @C12580l
    /* renamed from: c */
    public final TextUtils.TruncateAt mo46504c() {
        return this.f40041i;
    }

    /* renamed from: d */
    public final int mo46505d() {
        return this.f40042j;
    }

    /* renamed from: e */
    public final int mo46506e() {
        return this.f40035c;
    }

    /* renamed from: f */
    public final int mo46507f() {
        return this.f40051s;
    }

    /* renamed from: g */
    public final boolean mo46508g() {
        return this.f40046n;
    }

    /* renamed from: h */
    public final int mo46509h() {
        return this.f40045m;
    }

    @C12580l
    /* renamed from: i */
    public final int[] mo46510i() {
        return this.f40052t;
    }

    /* renamed from: j */
    public final int mo46511j() {
        return this.f40049q;
    }

    /* renamed from: k */
    public final int mo46512k() {
        return this.f40050r;
    }

    /* renamed from: l */
    public final float mo46513l() {
        return this.f40044l;
    }

    /* renamed from: m */
    public final float mo46514m() {
        return this.f40043k;
    }

    /* renamed from: n */
    public final int mo46515n() {
        return this.f40040h;
    }

    @C12579k
    /* renamed from: o */
    public final TextPaint mo46516o() {
        return this.f40036d;
    }

    @C12580l
    /* renamed from: p */
    public final int[] mo46517p() {
        return this.f40053u;
    }

    /* renamed from: q */
    public final int mo46518q() {
        return this.f40034b;
    }

    @C12579k
    /* renamed from: r */
    public final CharSequence mo46519r() {
        return this.f40033a;
    }

    @C12579k
    /* renamed from: s */
    public final TextDirectionHeuristic mo46520s() {
        return this.f40038f;
    }

    /* renamed from: t */
    public final boolean mo46521t() {
        return this.f40047o;
    }

    /* renamed from: u */
    public final int mo46522u() {
        return this.f40037e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16101n0(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i11 & 2) != 0 ? 0 : i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
    }
}
