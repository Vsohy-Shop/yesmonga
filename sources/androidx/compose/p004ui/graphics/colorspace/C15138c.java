package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,796:1\n25#2,3:797\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n288#1:797,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.c */
public abstract class C15138c {
    @C12579k

    /* renamed from: d */
    public static final C15139a f37402d = new C15139a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f37403e = -1;

    /* renamed from: f */
    public static final int f37404f = 63;
    @C12579k

    /* renamed from: a */
    public final String f37405a;

    /* renamed from: b */
    public final long f37406b;

    /* renamed from: c */
    public final int f37407c;

    /* renamed from: androidx.compose.ui.graphics.colorspace.c$a */
    public static final class C15139a {
        public /* synthetic */ C15139a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15139a() {
        }
    }

    public /* synthetic */ C15138c(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    @C12579k
    /* renamed from: a */
    public final float[] mo42582a(float f, float f2, float f3) {
        float[] fArr = new float[C15135b.m65392j(this.f37406b)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return mo42507b(fArr);
    }

    @C12579k
    /* renamed from: b */
    public abstract float[] mo42507b(@C12579k float[] fArr);

    /* renamed from: c */
    public final int mo42583c() {
        return C15135b.m65392j(this.f37406b);
    }

    /* renamed from: d */
    public final int mo42584d() {
        return this.f37407c;
    }

    /* renamed from: e */
    public abstract float mo42511e(int i);

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15138c cVar = (C15138c) obj;
        if (this.f37407c == cVar.f37407c && Intrinsics.areEqual((Object) this.f37405a, (Object) cVar.f37405a)) {
            return C15135b.m65390h(this.f37406b, cVar.f37406b);
        }
        return false;
    }

    /* renamed from: f */
    public abstract float mo42514f(int i);

    /* renamed from: g */
    public final long mo42585g() {
        return this.f37406b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo42586h() {
        return this.f37405a;
    }

    public int hashCode() {
        return (((this.f37405a.hashCode() * 31) + C15135b.m65393k(this.f37406b)) * 31) + this.f37407c;
    }

    /* renamed from: i */
    public boolean mo42519i() {
        return false;
    }

    /* renamed from: j */
    public abstract boolean mo42521j();

    /* renamed from: k */
    public long mo42522k(float f, float f2, float f3) {
        float[] l = mo42587l(f, f2, f3);
        return (((long) Float.floatToIntBits(l[0])) << 32) | (((long) Float.floatToIntBits(l[1])) & 4294967295L);
    }

    @C12579k
    /* renamed from: l */
    public final float[] mo42587l(float f, float f2, float f3) {
        return mo42525m(new float[]{f, f2, f3});
    }

    @C12579k
    /* renamed from: m */
    public abstract float[] mo42525m(@C12579k float[] fArr);

    /* renamed from: n */
    public float mo42526n(float f, float f2, float f3) {
        return mo42587l(f, f2, f3)[2];
    }

    /* renamed from: o */
    public long mo42527o(float f, float f2, float f3, float f4, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        float[] a = mo42582a(f, f2, f3);
        return C15258l2.m66176a(a[0], a[1], a[2], f4, cVar);
    }

    @C12579k
    public String toString() {
        return this.f37405a + " (id=" + this.f37407c + ", model=" + C15135b.m65394l(this.f37406b) + ')';
    }

    public /* synthetic */ C15138c(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public C15138c(String str, long j, int i) {
        this.f37405a = str;
        this.f37406b = j;
        this.f37407c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public C15138c(String str, long j) {
        this(str, j, -1, (DefaultConstructorMarker) null);
    }
}
