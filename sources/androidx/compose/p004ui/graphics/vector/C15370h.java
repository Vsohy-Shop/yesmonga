package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.vector.C15349f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,645:1\n107#2:646\n79#2,22:647\n33#3,6:669\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n81#1:646\n81#1:647,22\n112#1:669,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.h */
public final class C15370h {
    @C12579k

    /* renamed from: a */
    public final List<C15349f> f38001a = new ArrayList();
    @C12579k

    /* renamed from: b */
    public final C15372b f38002b = new C15372b(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public final C15372b f38003c = new C15372b(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public final C15372b f38004d = new C15372b(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public final C15372b f38005e = new C15372b(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);

    /* renamed from: androidx.compose.ui.graphics.vector.h$a */
    public static final class C15371a {

        /* renamed from: a */
        public int f38006a;

        /* renamed from: b */
        public boolean f38007b;

        public C15371a() {
            this(0, false, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C15371a m67190d(C15371a aVar, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f38006a;
            }
            if ((i2 & 2) != 0) {
                z = aVar.f38007b;
            }
            return aVar.mo43511c(i, z);
        }

        /* renamed from: a */
        public final int mo43509a() {
            return this.f38006a;
        }

        /* renamed from: b */
        public final boolean mo43510b() {
            return this.f38007b;
        }

        @C12579k
        /* renamed from: c */
        public final C15371a mo43511c(int i, boolean z) {
            return new C15371a(i, z);
        }

        /* renamed from: e */
        public final int mo43512e() {
            return this.f38006a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15371a)) {
                return false;
            }
            C15371a aVar = (C15371a) obj;
            return this.f38006a == aVar.f38006a && this.f38007b == aVar.f38007b;
        }

        /* renamed from: f */
        public final boolean mo43514f() {
            return this.f38007b;
        }

        /* renamed from: g */
        public final void mo43515g(int i) {
            this.f38006a = i;
        }

        /* renamed from: h */
        public final void mo43516h(boolean z) {
            this.f38007b = z;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f38006a) * 31;
            boolean z = this.f38007b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f38006a + ", endWithNegativeOrDot=" + this.f38007b + ')';
        }

        public C15371a(int i, boolean z) {
            this.f38006a = i;
            this.f38007b = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15371a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.h$b */
    public static final class C15372b {

        /* renamed from: a */
        public float f38008a;

        /* renamed from: b */
        public float f38009b;

        public C15372b() {
            this(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C15372b m67198d(C15372b bVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.f38008a;
            }
            if ((i & 2) != 0) {
                f2 = bVar.f38009b;
            }
            return bVar.mo43521c(f, f2);
        }

        /* renamed from: a */
        public final float mo43519a() {
            return this.f38008a;
        }

        /* renamed from: b */
        public final float mo43520b() {
            return this.f38009b;
        }

        @C12579k
        /* renamed from: c */
        public final C15372b mo43521c(float f, float f2) {
            return new C15372b(f, f2);
        }

        /* renamed from: e */
        public final float mo43522e() {
            return this.f38008a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15372b)) {
                return false;
            }
            C15372b bVar = (C15372b) obj;
            return Float.compare(this.f38008a, bVar.f38008a) == 0 && Float.compare(this.f38009b, bVar.f38009b) == 0;
        }

        /* renamed from: f */
        public final float mo43524f() {
            return this.f38009b;
        }

        /* renamed from: g */
        public final void mo43525g() {
            this.f38008a = 0.0f;
            this.f38009b = 0.0f;
        }

        /* renamed from: h */
        public final void mo43526h(float f) {
            this.f38008a = f;
        }

        public int hashCode() {
            return (Float.hashCode(this.f38008a) * 31) + Float.hashCode(this.f38009b);
        }

        /* renamed from: i */
        public final void mo43528i(float f) {
            this.f38009b = f;
        }

        @C12579k
        public String toString() {
            return "PathPoint(x=" + this.f38008a + ", y=" + this.f38009b + ')';
        }

        public C15372b(float f, float f2) {
            this.f38008a = f;
            this.f38009b = f2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15372b(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    /* renamed from: E */
    public static /* synthetic */ C15231i3 m67156E(C15370h hVar, C15231i3 i3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            i3Var = C15318t0.m66550a();
        }
        return hVar.mo43479D(i3Var);
    }

    /* renamed from: A */
    public final void mo43476A(C15349f.C15366q qVar, boolean z, C15231i3 i3Var) {
        if (z) {
            this.f38005e.mo43526h(this.f38002b.mo43522e() - this.f38003c.mo43522e());
            this.f38005e.mo43528i(this.f38002b.mo43524f() - this.f38003c.mo43524f());
        } else {
            this.f38005e.mo43525g();
        }
        i3Var.mo42805f(this.f38005e.mo43522e(), this.f38005e.mo43524f(), qVar.mo43460g(), qVar.mo43461h());
        this.f38003c.mo43526h(this.f38002b.mo43522e() + this.f38005e.mo43522e());
        this.f38003c.mo43528i(this.f38002b.mo43524f() + this.f38005e.mo43524f());
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + qVar.mo43460g());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + qVar.mo43461h());
    }

    /* renamed from: B */
    public final void mo43477B(C15349f.C15367r rVar, C15231i3 i3Var) {
        i3Var.mo42821u(0.0f, rVar.mo43467f());
        C15372b bVar = this.f38002b;
        bVar.mo43528i(bVar.mo43524f() + rVar.mo43467f());
    }

    @C12579k
    /* renamed from: C */
    public final List<C15349f> mo43478C() {
        return this.f38001a;
    }

    @C12579k
    /* renamed from: D */
    public final C15231i3 mo43479D(@C12579k C15231i3 i3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "target");
        i3Var.reset();
        this.f38002b.mo43525g();
        this.f38003c.mo43525g();
        this.f38004d.mo43525g();
        this.f38005e.mo43525g();
        List<C15349f> list = this.f38001a;
        int size = list.size();
        C15349f fVar = null;
        int i = 0;
        while (i < size) {
            C15349f fVar2 = list.get(i);
            if (fVar == null) {
                fVar = fVar2;
            }
            if (fVar2 instanceof C15349f.C15351b) {
                mo43488f(i3Var);
            } else if (fVar2 instanceof C15349f.C15363n) {
                mo43506x((C15349f.C15363n) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15355f) {
                mo43496n((C15349f.C15355f) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15362m) {
                mo43505w((C15349f.C15362m) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15354e) {
                mo43495m((C15349f.C15354e) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15361l) {
                mo43504v((C15349f.C15361l) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15353d) {
                mo43494l((C15349f.C15353d) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15367r) {
                mo43477B((C15349f.C15367r) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15368s) {
                mo43482H((C15349f.C15368s) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15360k) {
                mo43503u((C15349f.C15360k) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15352c) {
                mo43490h((C15349f.C15352c) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15365p) {
                Intrinsics.checkNotNull(fVar);
                mo43508z((C15349f.C15365p) fVar2, fVar.mo43286a(), i3Var);
            } else if (fVar2 instanceof C15349f.C15357h) {
                Intrinsics.checkNotNull(fVar);
                mo43500r((C15349f.C15357h) fVar2, fVar.mo43286a(), i3Var);
            } else if (fVar2 instanceof C15349f.C15364o) {
                mo43507y((C15349f.C15364o) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15356g) {
                mo43499q((C15349f.C15356g) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15366q) {
                Intrinsics.checkNotNull(fVar);
                mo43476A((C15349f.C15366q) fVar2, fVar.mo43287b(), i3Var);
            } else if (fVar2 instanceof C15349f.C15358i) {
                Intrinsics.checkNotNull(fVar);
                mo43501s((C15349f.C15358i) fVar2, fVar.mo43287b(), i3Var);
            } else if (fVar2 instanceof C15349f.C15359j) {
                mo43502t((C15349f.C15359j) fVar2, i3Var);
            } else if (fVar2 instanceof C15349f.C15350a) {
                mo43485c((C15349f.C15350a) fVar2, i3Var);
            }
            i++;
            fVar = fVar2;
        }
        return i3Var;
    }

    /* renamed from: F */
    public final double mo43480F(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }

    /* renamed from: G */
    public final float mo43481G(float f) {
        return (f / 180.0f) * 3.1415927f;
    }

    /* renamed from: H */
    public final void mo43482H(C15349f.C15368s sVar, C15231i3 i3Var) {
        i3Var.mo42823w(this.f38002b.mo43522e(), sVar.mo43473f());
        this.f38002b.mo43528i(sVar.mo43473f());
    }

    /* renamed from: a */
    public final void mo43483a(char c, float[] fArr) {
        this.f38001a.addAll(C15369g.m67155b(c, fArr));
    }

    @C12579k
    /* renamed from: b */
    public final C15370h mo43484b(@C12579k List<? extends C15349f> list) {
        Intrinsics.checkNotNullParameter(list, "nodes");
        this.f38001a.addAll(list);
        return this;
    }

    /* renamed from: c */
    public final void mo43485c(C15349f.C15350a aVar, C15231i3 i3Var) {
        mo43491i(i3Var, (double) this.f38002b.mo43522e(), (double) this.f38002b.mo43524f(), (double) aVar.mo43298l(), (double) aVar.mo43299m(), (double) aVar.mo43300n(), (double) aVar.mo43302p(), (double) aVar.mo43301o(), aVar.mo43303q(), aVar.mo43304r());
        this.f38002b.mo43526h(aVar.mo43298l());
        this.f38002b.mo43528i(aVar.mo43299m());
        this.f38003c.mo43526h(this.f38002b.mo43522e());
        this.f38003c.mo43528i(this.f38002b.mo43524f());
    }

    /* renamed from: d */
    public final void mo43486d(C15231i3 i3Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ((double) ceil);
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / ((double) 2));
            double d31 = d11;
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            i3Var.mo42816q((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d31;
            d22 = d28;
            cos = cos;
            ceil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    /* renamed from: e */
    public final void mo43487e() {
        this.f38001a.clear();
    }

    /* renamed from: f */
    public final void mo43488f(C15231i3 i3Var) {
        this.f38002b.mo43526h(this.f38004d.mo43522e());
        this.f38002b.mo43528i(this.f38004d.mo43524f());
        this.f38003c.mo43526h(this.f38004d.mo43522e());
        this.f38003c.mo43528i(this.f38004d.mo43524f());
        i3Var.close();
        i3Var.mo42815p(this.f38002b.mo43522e(), this.f38002b.mo43524f());
    }

    /* renamed from: g */
    public final float[] mo43489g(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            C10956m.m41165Z0(fArr, fArr2, 0, i, min + i);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public final void mo43490h(C15349f.C15352c cVar, C15231i3 i3Var) {
        i3Var.mo42816q(cVar.mo43315k(), cVar.mo43318n(), cVar.mo43316l(), cVar.mo43319o(), cVar.mo43317m(), cVar.mo43320p());
        this.f38003c.mo43526h(cVar.mo43316l());
        this.f38003c.mo43528i(cVar.mo43319o());
        this.f38002b.mo43526h(cVar.mo43317m());
        this.f38002b.mo43528i(cVar.mo43320p());
    }

    /* renamed from: i */
    public final void mo43491i(C15231i3 i3Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        boolean z3;
        double d8;
        double d9;
        boolean z4;
        double d10 = d;
        double d11 = d3;
        boolean z5 = z2;
        double F = mo43480F(d7);
        double cos = Math.cos(F);
        double sin = Math.sin(F);
        double d12 = ((d10 * cos) + (d2 * sin)) / d5;
        double d13 = (((-d10) * sin) + (d2 * cos)) / d6;
        double d14 = ((d11 * cos) + (d4 * sin)) / d5;
        double d15 = (((-d11) * sin) + (d4 * cos)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (double) 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d16 * d16) + (d17 * d17);
        if (d21 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d21) / 1.99999d));
                boolean z6 = z5;
                mo43491i(i3Var, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d16 * sqrt2;
            double d24 = sqrt2 * d17;
            boolean z7 = z2;
            if (z == z7) {
                d9 = d19 - d24;
                d8 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d8 = d20 - d23;
            }
            double atan2 = Math.atan2(d13 - d8, d12 - d9);
            double atan22 = Math.atan2(d15 - d8, d14 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z7 != z4) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d9 * d5;
            double d26 = d8 * d6;
            mo43486d(i3Var, (d25 * cos) - (d26 * sin), (d25 * sin) + (d26 * cos), d5, d6, d, d2, F, atan2, atan22);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[LOOP:0: B:1:0x0008->B:31:0x0051, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[EDGE_INSN: B:35:0x0054->B:32:0x0054 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43492j(java.lang.String r9, int r10, androidx.compose.p004ui.graphics.vector.C15370h.C15371a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.mo43516h(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L_0x0008:
            int r5 = r9.length()
            if (r1 >= r5) goto L_0x0054
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L_0x0019
        L_0x0017:
            r6 = r7
            goto L_0x001f
        L_0x0019:
            r6 = 44
            if (r5 != r6) goto L_0x001e
            goto L_0x0017
        L_0x001e:
            r6 = r0
        L_0x001f:
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r2 = r0
            r4 = r7
            goto L_0x004e
        L_0x0024:
            r6 = 45
            if (r5 != r6) goto L_0x0030
            if (r1 == r10) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            r11.mo43516h(r7)
            goto L_0x0021
        L_0x0030:
            r2 = 46
            if (r5 != r2) goto L_0x003d
            if (r3 != 0) goto L_0x0039
            r2 = r0
            r3 = r7
            goto L_0x004e
        L_0x0039:
            r11.mo43516h(r7)
            goto L_0x0021
        L_0x003d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L_0x0043
        L_0x0041:
            r2 = r7
            goto L_0x0049
        L_0x0043:
            r2 = 69
            if (r5 != r2) goto L_0x0048
            goto L_0x0041
        L_0x0048:
            r2 = r0
        L_0x0049:
            if (r2 == 0) goto L_0x004d
            r2 = r7
            goto L_0x004e
        L_0x004d:
            r2 = r0
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0054:
            r11.mo43515g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.C15370h.mo43492j(java.lang.String, int, androidx.compose.ui.graphics.vector.h$a):void");
    }

    /* renamed from: k */
    public final float[] mo43493k(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        C15371a aVar = new C15371a(0, false, 3, (DefaultConstructorMarker) null);
        int length = str.length();
        int i = 1;
        int i2 = 0;
        while (i < length) {
            mo43492j(str, i, aVar);
            int e = aVar.mo43512e();
            if (i < e) {
                String substring = str.substring(i, e);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i2] = Float.parseFloat(substring);
                i2++;
            }
            if (aVar.mo43514f()) {
                i = e;
            } else {
                i = e + 1;
            }
        }
        return mo43489g(fArr, 0, i2);
    }

    /* renamed from: l */
    public final void mo43494l(C15349f.C15353d dVar, C15231i3 i3Var) {
        i3Var.mo42823w(dVar.mo43325f(), this.f38002b.mo43524f());
        this.f38002b.mo43526h(dVar.mo43325f());
    }

    /* renamed from: m */
    public final void mo43495m(C15349f.C15354e eVar, C15231i3 i3Var) {
        i3Var.mo42823w(eVar.mo43332g(), eVar.mo43333h());
        this.f38002b.mo43526h(eVar.mo43332g());
        this.f38002b.mo43528i(eVar.mo43333h());
    }

    /* renamed from: n */
    public final void mo43496n(C15349f.C15355f fVar, C15231i3 i3Var) {
        this.f38002b.mo43526h(fVar.mo43340g());
        this.f38002b.mo43528i(fVar.mo43341h());
        i3Var.mo42815p(fVar.mo43340g(), fVar.mo43341h());
        this.f38004d.mo43526h(this.f38002b.mo43522e());
        this.f38004d.mo43528i(this.f38002b.mo43524f());
    }

    /* renamed from: o */
    public final int mo43497o(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    @C12579k
    /* renamed from: p */
    public final C15370h mo43498p(@C12579k String str) {
        boolean z;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "pathData");
        this.f38001a.clear();
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            int o = mo43497o(str, i3);
            String substring = str.substring(i2, o);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length) {
                if (!z3) {
                    i = i4;
                } else {
                    i = length;
                }
                if (Intrinsics.compare((int) substring.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i4++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i4, length + 1).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo43483a(obj.charAt(0), mo43493k(obj));
            }
            i2 = o;
            i3 = o + 1;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            mo43483a(str.charAt(i2), new float[0]);
        }
        return this;
    }

    /* renamed from: q */
    public final void mo43499q(C15349f.C15356g gVar, C15231i3 i3Var) {
        i3Var.mo42804e(gVar.mo43351i(), gVar.mo43353k(), gVar.mo43352j(), gVar.mo43354l());
        this.f38003c.mo43526h(gVar.mo43351i());
        this.f38003c.mo43528i(gVar.mo43353k());
        this.f38002b.mo43526h(gVar.mo43352j());
        this.f38002b.mo43528i(gVar.mo43354l());
    }

    /* renamed from: r */
    public final void mo43500r(C15349f.C15357h hVar, boolean z, C15231i3 i3Var) {
        if (z) {
            float f = (float) 2;
            this.f38005e.mo43526h((this.f38002b.mo43522e() * f) - this.f38003c.mo43522e());
            this.f38005e.mo43528i((f * this.f38002b.mo43524f()) - this.f38003c.mo43524f());
        } else {
            this.f38005e.mo43526h(this.f38002b.mo43522e());
            this.f38005e.mo43528i(this.f38002b.mo43524f());
        }
        i3Var.mo42816q(this.f38005e.mo43522e(), this.f38005e.mo43524f(), hVar.mo43363i(), hVar.mo43365k(), hVar.mo43364j(), hVar.mo43366l());
        this.f38003c.mo43526h(hVar.mo43363i());
        this.f38003c.mo43528i(hVar.mo43365k());
        this.f38002b.mo43526h(hVar.mo43364j());
        this.f38002b.mo43528i(hVar.mo43366l());
    }

    /* renamed from: s */
    public final void mo43501s(C15349f.C15358i iVar, boolean z, C15231i3 i3Var) {
        if (z) {
            float f = (float) 2;
            this.f38005e.mo43526h((this.f38002b.mo43522e() * f) - this.f38003c.mo43522e());
            this.f38005e.mo43528i((f * this.f38002b.mo43524f()) - this.f38003c.mo43524f());
        } else {
            this.f38005e.mo43526h(this.f38002b.mo43522e());
            this.f38005e.mo43528i(this.f38002b.mo43524f());
        }
        i3Var.mo42804e(this.f38005e.mo43522e(), this.f38005e.mo43524f(), iVar.mo43372g(), iVar.mo43373h());
        this.f38003c.mo43526h(this.f38005e.mo43522e());
        this.f38003c.mo43528i(this.f38005e.mo43524f());
        this.f38002b.mo43526h(iVar.mo43372g());
        this.f38002b.mo43528i(iVar.mo43373h());
    }

    /* renamed from: t */
    public final void mo43502t(C15349f.C15359j jVar, C15231i3 i3Var) {
        float l = jVar.mo43386l() + this.f38002b.mo43522e();
        float m = jVar.mo43387m() + this.f38002b.mo43524f();
        mo43491i(i3Var, (double) this.f38002b.mo43522e(), (double) this.f38002b.mo43524f(), (double) l, (double) m, (double) jVar.mo43388n(), (double) jVar.mo43390p(), (double) jVar.mo43389o(), jVar.mo43391q(), jVar.mo43392r());
        this.f38002b.mo43526h(l);
        this.f38002b.mo43528i(m);
        this.f38003c.mo43526h(this.f38002b.mo43522e());
        this.f38003c.mo43528i(this.f38002b.mo43524f());
    }

    /* renamed from: u */
    public final void mo43503u(C15349f.C15360k kVar, C15231i3 i3Var) {
        i3Var.mo42803d(kVar.mo43403k(), kVar.mo43406n(), kVar.mo43404l(), kVar.mo43407o(), kVar.mo43405m(), kVar.mo43408p());
        this.f38003c.mo43526h(this.f38002b.mo43522e() + kVar.mo43404l());
        this.f38003c.mo43528i(this.f38002b.mo43524f() + kVar.mo43407o());
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + kVar.mo43405m());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + kVar.mo43408p());
    }

    /* renamed from: v */
    public final void mo43504v(C15349f.C15361l lVar, C15231i3 i3Var) {
        i3Var.mo42821u(lVar.mo43413f(), 0.0f);
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + lVar.mo43413f());
    }

    /* renamed from: w */
    public final void mo43505w(C15349f.C15362m mVar, C15231i3 i3Var) {
        i3Var.mo42821u(mVar.mo43420g(), mVar.mo43421h());
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + mVar.mo43420g());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + mVar.mo43421h());
    }

    /* renamed from: x */
    public final void mo43506x(C15349f.C15363n nVar, C15231i3 i3Var) {
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + nVar.mo43428g());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + nVar.mo43429h());
        i3Var.mo42801c(nVar.mo43428g(), nVar.mo43429h());
        this.f38004d.mo43526h(this.f38002b.mo43522e());
        this.f38004d.mo43528i(this.f38002b.mo43524f());
    }

    /* renamed from: y */
    public final void mo43507y(C15349f.C15364o oVar, C15231i3 i3Var) {
        i3Var.mo42805f(oVar.mo43439i(), oVar.mo43441k(), oVar.mo43440j(), oVar.mo43442l());
        this.f38003c.mo43526h(this.f38002b.mo43522e() + oVar.mo43439i());
        this.f38003c.mo43528i(this.f38002b.mo43524f() + oVar.mo43441k());
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + oVar.mo43440j());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + oVar.mo43442l());
    }

    /* renamed from: z */
    public final void mo43508z(C15349f.C15365p pVar, boolean z, C15231i3 i3Var) {
        if (z) {
            this.f38005e.mo43526h(this.f38002b.mo43522e() - this.f38003c.mo43522e());
            this.f38005e.mo43528i(this.f38002b.mo43524f() - this.f38003c.mo43524f());
        } else {
            this.f38005e.mo43525g();
        }
        i3Var.mo42803d(this.f38005e.mo43522e(), this.f38005e.mo43524f(), pVar.mo43451i(), pVar.mo43453k(), pVar.mo43452j(), pVar.mo43454l());
        this.f38003c.mo43526h(this.f38002b.mo43522e() + pVar.mo43451i());
        this.f38003c.mo43528i(this.f38002b.mo43524f() + pVar.mo43453k());
        C15372b bVar = this.f38002b;
        bVar.mo43526h(bVar.mo43522e() + pVar.mo43452j());
        C15372b bVar2 = this.f38002b;
        bVar2.mo43528i(bVar2.mo43524f() + pVar.mo43454l());
    }
}
