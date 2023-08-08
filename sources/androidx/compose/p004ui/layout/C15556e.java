package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.unit.C16476b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.e */
public final class C15556e implements C15557e0 {
    @C12579k

    /* renamed from: a */
    public final C15580l f38712a;
    @C12579k

    /* renamed from: b */
    public final IntrinsicMinMax f38713b;
    @C12579k

    /* renamed from: c */
    public final IntrinsicWidthHeight f38714c;

    public C15556e(@C12579k C15580l lVar, @C12579k IntrinsicMinMax intrinsicMinMax, @C12579k IntrinsicWidthHeight intrinsicWidthHeight) {
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        Intrinsics.checkNotNullParameter(intrinsicMinMax, "minMax");
        Intrinsics.checkNotNullParameter(intrinsicWidthHeight, "widthHeight");
        this.f38712a = lVar;
        this.f38713b = intrinsicMinMax;
        this.f38714c = intrinsicWidthHeight;
    }

    @C12579k
    /* renamed from: a */
    public final C15580l mo44386a() {
        return this.f38712a;
    }

    /* renamed from: a0 */
    public int mo44317a0(int i) {
        return this.f38712a.mo44317a0(i);
    }

    @C12579k
    /* renamed from: b */
    public final IntrinsicMinMax mo44387b() {
        return this.f38713b;
    }

    @C12580l
    /* renamed from: c */
    public Object mo44319c() {
        return this.f38712a.mo44319c();
    }

    /* renamed from: d */
    public int mo44320d(int i) {
        return this.f38712a.mo44320d(i);
    }

    @C12579k
    /* renamed from: e */
    public final IntrinsicWidthHeight mo44388e() {
        return this.f38714c;
    }

    /* renamed from: o0 */
    public int mo44322o0(int i) {
        return this.f38712a.mo44322o0(i);
    }

    /* renamed from: p0 */
    public int mo44323p0(int i) {
        return this.f38712a.mo44323p0(i);
    }

    @C12579k
    /* renamed from: t0 */
    public C15611w0 mo44324t0(long j) {
        int i;
        int i2;
        if (this.f38714c == IntrinsicWidthHeight.Width) {
            if (this.f38713b == IntrinsicMinMax.Max) {
                i2 = this.f38712a.mo44323p0(C16476b.m74361o(j));
            } else {
                i2 = this.f38712a.mo44322o0(C16476b.m74361o(j));
            }
            return new C15567h(i2, C16476b.m74361o(j));
        }
        if (this.f38713b == IntrinsicMinMax.Max) {
            i = this.f38712a.mo44320d(C16476b.m74362p(j));
        } else {
            i = this.f38712a.mo44317a0(C16476b.m74362p(j));
        }
        return new C15567h(C16476b.m74362p(j), i);
    }
}
