package androidx.compose.runtime;

import androidx.compose.runtime.C8592o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3459\n4513#2,5:3465\n4513#2,5:3470\n4513#2,5:3475\n4513#2,5:3480\n4513#2,5:3485\n4513#2,5:3490\n4513#2,5:3495\n4513#2,5:3500\n4513#2,5:3505\n4513#2,5:3510\n4513#2,5:3515\n4513#2,5:3520\n4513#2,5:3525\n4513#2,5:3530\n4513#2,5:3543\n4513#2,5:3562\n4513#2,5:3567\n4513#2,5:3572\n1#3:3464\n162#4,8:3535\n162#4,8:3548\n3323#5,6:3556\n33#6,6:3577\n82#6,3:3583\n33#6,4:3586\n85#6,2:3590\n38#6:3592\n87#6:3593\n231#6,3:3594\n64#6,4:3597\n234#6,2:3601\n69#6:3603\n236#6:3604\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1346#1:3444,5\n1370#1:3449,5\n1383#1:3454,5\n1386#1:3459,5\n1426#1:3465,5\n1441#1:3470,5\n1488#1:3475,5\n1493#1:3480,5\n1533#1:3485,5\n1544#1:3490,5\n1671#1:3495,5\n1747#1:3500,5\n1752#1:3505,5\n1784#1:3510,5\n1827#1:3515,5\n1828#1:3520,5\n1841#1:3525,5\n1935#1:3530,5\n2210#1:3543,5\n2500#1:3562,5\n2512#1:3567,5\n2703#1:3572,5\n2193#1:3535,8\n2282#1:3548,8\n2302#1:3556,6\n2799#1:3577,6\n2969#1:3583,3\n2969#1:3586,4\n2969#1:3590,2\n2969#1:3592\n2969#1:3593\n2972#1:3594,3\n2972#1:3597,4\n2972#1:3601,2\n2972#1:3603\n2972#1:3604\n*E\n"})
/* renamed from: androidx.compose.runtime.z1 */
public final class C8701z1 {
    @C12579k

    /* renamed from: v */
    public static final C8702a f23312v = new C8702a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C8692w1 f23313a;
    @C12579k

    /* renamed from: b */
    public int[] f23314b;
    @C12579k

    /* renamed from: c */
    public Object[] f23315c;
    @C12579k

    /* renamed from: d */
    public ArrayList<C8412c> f23316d;

    /* renamed from: e */
    public int f23317e;

    /* renamed from: f */
    public int f23318f;

    /* renamed from: g */
    public int f23319g;

    /* renamed from: h */
    public int f23320h;

    /* renamed from: i */
    public int f23321i;

    /* renamed from: j */
    public int f23322j;

    /* renamed from: k */
    public int f23323k;

    /* renamed from: l */
    public int f23324l;

    /* renamed from: m */
    public int f23325m;

    /* renamed from: n */
    public int f23326n;
    @C12579k

    /* renamed from: o */
    public final C8589n0 f23327o = new C8589n0();
    @C12579k

    /* renamed from: p */
    public final C8589n0 f23328p = new C8589n0();
    @C12579k

    /* renamed from: q */
    public final C8589n0 f23329q = new C8589n0();

    /* renamed from: r */
    public int f23330r;

    /* renamed from: s */
    public int f23331s = -1;

    /* renamed from: t */
    public boolean f23332t;
    @C12580l

    /* renamed from: u */
    public C8538f1 f23333u;

    @C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.z1$a */
    public static final class C8702a {
        public /* synthetic */ C8702a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List<C8412c> mo16995b(C8701z1 z1Var, int i, C8701z1 z1Var2, boolean z, boolean z2) {
            int i2;
            ArrayList arrayList;
            boolean z3;
            int i3;
            C8701z1 z1Var3 = z1Var;
            int i4 = i;
            C8701z1 z1Var4 = z1Var2;
            int i0 = z1Var.mo16959i0(i);
            int i5 = i4 + i0;
            int b = z1Var.mo16916M(i);
            int b2 = z1Var3.mo16916M(i5);
            int i6 = b2 - b;
            boolean a = z1Var.mo16910J(i);
            z1Var4.mo16973p0(i0);
            z1Var4.mo16977r0(i6, z1Var2.mo16940Y());
            if (z1Var.f23317e < i5) {
                z1Var3.mo16896B0(i5);
            }
            if (z1Var.f23322j < b2) {
                z1Var3.mo16899D0(b2, i5);
            }
            int[] i7 = z1Var2.f23314b;
            int Y = z1Var2.mo16940Y();
            C10956m.m41171a1(z1Var.f23314b, i7, Y * 5, i4 * 5, i5 * 5);
            Object[] k = z1Var2.f23315c;
            int g = z1Var2.f23320h;
            C10956m.m41183c1(z1Var.f23315c, k, g, b, b2);
            int Z = z1Var2.mo16942Z();
            C8698y1.m32123t0(i7, Y, Z);
            int i8 = Y - i4;
            int i9 = Y + i0;
            int c = g - z1Var4.mo16918N(i7, Y);
            int m = z1Var2.f23324l;
            int i10 = Z;
            int l = z1Var2.f23323k;
            int length = k.length;
            boolean z4 = a;
            int i11 = m;
            int i12 = g;
            int i13 = Y;
            while (true) {
                i2 = 0;
                if (i13 >= i9) {
                    break;
                }
                if (i13 != Y) {
                    i3 = i9;
                    C8698y1.m32123t0(i7, i13, C8698y1.m32099h0(i7, i13) + i8);
                } else {
                    i3 = i9;
                }
                int c2 = z1Var4.mo16918N(i7, i13) + c;
                if (i11 >= i13) {
                    i2 = z1Var2.f23322j;
                }
                int i14 = c;
                C8698y1.m32113o0(i7, i13, z1Var4.mo16922P(c2, i2, l, length));
                if (i13 == i11) {
                    i11++;
                }
                i13++;
                c = i14;
                i9 = i3;
            }
            int i15 = i9;
            z1Var4.f23324l = i11;
            int r = C8698y1.m32087b0(z1Var.f23316d, i4, z1Var.mo16944a0());
            int r2 = C8698y1.m32087b0(z1Var.f23316d, i5, z1Var.mo16944a0());
            if (r < r2) {
                ArrayList f = z1Var.f23316d;
                ArrayList arrayList2 = new ArrayList(r2 - r);
                for (int i16 = r; i16 < r2; i16++) {
                    Object obj = f.get(i16);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    C8412c cVar = (C8412c) obj;
                    cVar.mo15340c(cVar.mo15338a() + i8);
                    arrayList2.add(cVar);
                }
                z1Var2.f23316d.addAll(C8698y1.m32087b0(z1Var2.f23316d, z1Var2.mo16940Y(), z1Var2.mo16944a0()), arrayList2);
                f.subList(r, r2).clear();
                arrayList = arrayList2;
            } else {
                arrayList = CollectionsKt__CollectionsKt.m40441E();
            }
            int J0 = z1Var.mo16911J0(i);
            int i17 = 1;
            if (z) {
                if (J0 >= 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    z1Var.mo16958h1();
                    z1Var3.mo16893A(J0 - z1Var.mo16940Y());
                    z1Var.mo16958h1();
                }
                z1Var3.mo16893A(i4 - z1Var.mo16940Y());
                z3 = z1Var.mo16925Q0();
                if (i2 != 0) {
                    z1Var.mo16947b1();
                    z1Var.mo16926R();
                    z1Var.mo16947b1();
                    z1Var.mo16926R();
                }
            } else {
                boolean s = z1Var3.mo16927R0(i4, i0);
                z1Var3.mo16929S0(b, i6, i4 - 1);
                z3 = s;
            }
            if (!z3) {
                int j = z1Var2.f23326n;
                if (!C8698y1.m32081X(i7, Y)) {
                    i17 = C8698y1.m32089c0(i7, Y);
                }
                z1Var4.f23326n = j + i17;
                if (z2) {
                    z1Var4.f23330r = i15;
                    z1Var4.f23320h = i12 + i6;
                }
                if (z4) {
                    z1Var4.mo16976q1(i10);
                }
                return arrayList;
            }
            ComposerKt.m29774A("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }

        public C8702a() {
        }
    }

    /* renamed from: androidx.compose.runtime.z1$b */
    public static final class C8703b implements Iterator<Object>, C11345a {

        /* renamed from: a */
        public int f23334a;

        /* renamed from: b */
        public final /* synthetic */ int f23335b;

        /* renamed from: c */
        public final /* synthetic */ C8701z1 f23336c;

        public C8703b(int i, int i2, C8701z1 z1Var) {
            this.f23335b = i2;
            this.f23336c = z1Var;
            this.f23334a = i;
        }

        /* renamed from: b */
        public final int mo16996b() {
            return this.f23334a;
        }

        /* renamed from: c */
        public final void mo16997c(int i) {
            this.f23334a = i;
        }

        public boolean hasNext() {
            return this.f23334a < this.f23335b;
        }

        @C12580l
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] k = this.f23336c.f23315c;
            C8701z1 z1Var = this.f23336c;
            int i = this.f23334a;
            this.f23334a = i + 1;
            return k[z1Var.mo16920O(i)];
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8701z1(@C12579k C8692w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "table");
        this.f23313a = w1Var;
        this.f23314b = w1Var.mo16859p0();
        this.f23315c = w1Var.mo16861s0();
        this.f23316d = w1Var.mo16858o0();
        this.f23317e = w1Var.mo16860r0();
        this.f23318f = (this.f23314b.length / 5) - w1Var.mo16860r0();
        this.f23319g = w1Var.mo16860r0();
        this.f23322j = w1Var.mo16847W();
        this.f23323k = this.f23315c.length - w1Var.mo16847W();
        this.f23324l = w1Var.mo16860r0();
    }

    /* renamed from: C */
    public static /* synthetic */ C8412c m32138C(C8701z1 z1Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = z1Var.f23330r;
        }
        return z1Var.mo16895B(i);
    }

    /* renamed from: d0 */
    public static final boolean m32143d0(C8701z1 z1Var, int i) {
        if (i >= z1Var.f23330r || (i != z1Var.f23331s && z1Var.f23327o.mo16268c(i) < 0 && !m32143d0(z1Var, z1Var.mo16911J0(i)))) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m32164x0(C8701z1 z1Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = z1Var.f23331s;
        }
        z1Var.mo16988w0(i);
    }

    /* renamed from: A */
    public final void mo16893A(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f23325m <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i != 0) {
                int i2 = this.f23330r + i;
                if (i2 < this.f23331s || i2 > this.f23319g) {
                    z3 = false;
                }
                if (z3) {
                    this.f23330r = i2;
                    int N = mo16918N(this.f23314b, mo16953f0(i2));
                    this.f23320h = N;
                    this.f23321i = N;
                    return;
                }
                ComposerKt.m29774A(("Cannot seek outside the current group (" + this.f23331s + '-' + this.f23319g + ')').toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.m29774A("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: A0 */
    public final void mo16894A0(int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        if (this.f23325m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ComposerKt.m29774A("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            } else if (i != 0) {
                int i3 = this.f23330r;
                int i4 = this.f23331s;
                int i5 = this.f23319g;
                int i6 = i;
                int i7 = i3;
                while (i6 > 0) {
                    i7 += C8698y1.m32074Q(this.f23314b, mo16953f0(i7));
                    if (i7 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i6--;
                    } else {
                        ComposerKt.m29774A("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                int i8 = C8698y1.m32074Q(this.f23314b, mo16953f0(i7));
                int i9 = this.f23320h;
                int N = mo16918N(this.f23314b, mo16953f0(i7));
                int i10 = i7 + i8;
                int N2 = mo16918N(this.f23314b, mo16953f0(i10));
                int i11 = N2 - N;
                mo16977r0(i11, Math.max(this.f23330r - 1, 0));
                mo16973p0(i8);
                int[] iArr = this.f23314b;
                int f0 = mo16953f0(i10) * 5;
                C10956m.m41171a1(iArr, iArr, mo16953f0(i3) * 5, f0, (i8 * 5) + f0);
                if (i11 > 0) {
                    Object[] objArr = this.f23315c;
                    C10956m.m41183c1(objArr, objArr, i9, mo16920O(N + i11), mo16920O(N2 + i11));
                }
                int i12 = N + i11;
                int i13 = i12 - i9;
                int i14 = this.f23322j;
                int i15 = this.f23323k;
                int length = this.f23315c.length;
                int i16 = this.f23324l;
                int i17 = i3 + i8;
                int i18 = i3;
                while (i18 < i17) {
                    int f02 = mo16953f0(i18);
                    int i19 = i14;
                    int N3 = mo16918N(iArr, f02) - i13;
                    int i20 = i13;
                    if (i16 < f02) {
                        i2 = 0;
                    } else {
                        i2 = i19;
                    }
                    mo16980s1(iArr, f02, mo16922P(N3, i2, i15, length));
                    i18++;
                    i14 = i19;
                    i13 = i20;
                }
                mo16991y0(i10, i3, i8);
                if (!mo16927R0(i10, i8)) {
                    mo16934V(i4, this.f23319g, i3);
                    if (i11 > 0) {
                        mo16929S0(i12, i11, i10 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.m29774A("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.m29774A("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: B */
    public final C8412c mo16895B(int i) {
        ArrayList<C8412c> arrayList = this.f23316d;
        int y = C8698y1.m32105k0(arrayList, i, mo16944a0());
        if (y < 0) {
            if (i > this.f23317e) {
                i = -(mo16944a0() - i);
            }
            C8412c cVar = new C8412c(i);
            arrayList.add(-(y + 1), cVar);
            return cVar;
        }
        C8412c cVar2 = arrayList.get(y);
        Intrinsics.checkNotNullExpressionValue(cVar2, "get(location)");
        return cVar2;
    }

    /* renamed from: B0 */
    public final void mo16896B0(int i) {
        int i2;
        int i3 = this.f23318f;
        int i4 = this.f23317e;
        if (i4 != i) {
            boolean z = true;
            if (!this.f23316d.isEmpty()) {
                mo16972o1(i4, i);
            }
            if (i3 > 0) {
                int[] iArr = this.f23314b;
                int i5 = i * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i < i4) {
                    C10956m.m41171a1(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    C10956m.m41171a1(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int W = mo16936W();
            if (i2 >= W) {
                z = false;
            }
            ComposerKt.m29833q0(z);
            while (i2 < W) {
                int w = C8698y1.m32099h0(this.f23314b, i2);
                int N0 = mo16919N0(mo16917M0(w), i);
                if (N0 != w) {
                    C8698y1.m32123t0(this.f23314b, i2, N0);
                }
                i2++;
                if (i2 == i) {
                    i2 += i3;
                }
            }
        }
        this.f23317e = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (mo16959i0(r9.f23330r + r10) == 1) goto L_0x0015;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.compose.runtime.C8412c> mo16897C0(int r10, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8692w1 r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r9.f23325m
            if (r0 > 0) goto L_0x0014
            int r0 = r9.f23330r
            int r0 = r0 + r10
            int r0 = r9.mo16959i0(r0)
            r1 = 1
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            androidx.compose.runtime.ComposerKt.m29833q0(r1)
            int r0 = r9.f23330r
            int r1 = r9.f23320h
            int r2 = r9.f23321i
            r9.mo16893A(r10)
            r9.mo16958h1()
            r9.mo16904G()
            androidx.compose.runtime.z1 r10 = r11.mo16837G0()
            androidx.compose.runtime.z1$a r3 = f23312v     // Catch:{ all -> 0x0046 }
            r7 = 0
            r8 = 1
            r4 = r10
            r5 = r12
            r6 = r9
            java.util.List r11 = r3.mo16995b(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0046 }
            r10.mo16908I()
            r9.mo16928S()
            r9.mo16926R()
            r9.f23330r = r0
            r9.f23320h = r1
            r9.f23321i = r2
            return r11
        L_0x0046:
            r11 = move-exception
            r10.mo16908I()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8701z1.mo16897C0(int, androidx.compose.runtime.w1, int):java.util.List");
    }

    /* renamed from: D */
    public final int mo16898D(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        int a = cVar.mo15338a();
        if (a < 0) {
            return a + mo16944a0();
        }
        return a;
    }

    /* renamed from: D0 */
    public final void mo16899D0(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.f23323k;
        int i4 = this.f23322j;
        int i5 = this.f23324l;
        if (i4 != i) {
            Object[] objArr = this.f23315c;
            if (i < i4) {
                C10956m.m41183c1(objArr, objArr, i + i3, i, i4);
            } else {
                C10956m.m41183c1(objArr, objArr, i4, i4 + i3, i + i3);
            }
            C10956m.m41251n2(objArr, null, i, i + i3);
        }
        int min = Math.min(i2 + 1, mo16944a0());
        if (i5 != min) {
            int length = this.f23315c.length - i3;
            if (min < i5) {
                int f0 = mo16953f0(min);
                int f02 = mo16953f0(i5);
                int i6 = this.f23317e;
                while (f0 < f02) {
                    int f = C8698y1.m32069L(this.f23314b, f0);
                    if (f >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C8698y1.m32113o0(this.f23314b, f0, -((length - f) + 1));
                        f0++;
                        if (f0 == i6) {
                            f0 += this.f23318f;
                        }
                    } else {
                        ComposerKt.m29774A("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int f03 = mo16953f0(i5);
                int f04 = mo16953f0(min);
                while (f03 < f04) {
                    int f2 = C8698y1.m32069L(this.f23314b, f03);
                    if (f2 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C8698y1.m32113o0(this.f23314b, f03, f2 + length + 1);
                        f03++;
                        if (f03 == this.f23317e) {
                            f03 += this.f23318f;
                        }
                    } else {
                        ComposerKt.m29774A("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f23324l = min;
        }
        this.f23322j = i;
    }

    /* renamed from: E */
    public final int mo16900E(int[] iArr, int i) {
        return mo16918N(iArr, i) + C8698y1.m32068K(C8698y1.m32073P(iArr, i) >> 29);
    }

    @C12579k
    /* renamed from: E0 */
    public final List<C8412c> mo16901E0(@C12579k C8412c cVar, int i, @C12579k C8701z1 z1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        Intrinsics.checkNotNullParameter(z1Var, "writer");
        boolean z5 = true;
        if (z1Var.f23325m > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m29833q0(z);
        if (this.f23325m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerKt.m29833q0(z2);
        ComposerKt.m29833q0(cVar.mo15339b());
        int D = mo16898D(cVar) + i;
        int i3 = this.f23330r;
        if (i3 > D || D >= this.f23319g) {
            z3 = false;
        } else {
            z3 = true;
        }
        ComposerKt.m29833q0(z3);
        int J0 = mo16911J0(D);
        int i0 = mo16959i0(D);
        if (mo16984u0(D)) {
            i2 = 1;
        } else {
            i2 = mo16907H0(D);
        }
        List<C8412c> a = f23312v.mo16995b(this, D, z1Var, false, false);
        mo16976q1(J0);
        if (i2 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (J0 >= i3) {
            int f0 = mo16953f0(J0);
            int[] iArr = this.f23314b;
            C8698y1.m32117q0(iArr, f0, C8698y1.m32074Q(iArr, f0) - i0);
            if (z4) {
                if (C8698y1.m32081X(this.f23314b, f0)) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.f23314b;
                    C8698y1.m32121s0(iArr2, f0, C8698y1.m32089c0(iArr2, f0) - i2);
                }
            }
            J0 = mo16911J0(J0);
        }
        if (z4) {
            if (this.f23326n < i2) {
                z5 = false;
            }
            ComposerKt.m29833q0(z5);
            this.f23326n -= i2;
        }
        return a;
    }

    /* renamed from: F */
    public final void mo16902F() {
        mo16958h1();
        while (!mo16979s0()) {
            mo16975q0(-3);
            mo16945a1();
        }
        mo16926R();
    }

    @C12580l
    /* renamed from: F0 */
    public final Object mo16903F0(int i) {
        int f0 = mo16953f0(i);
        if (C8698y1.m32081X(this.f23314b, f0)) {
            return this.f23315c[mo16920O(mo16909I0(this.f23314b, f0))];
        }
        return null;
    }

    /* renamed from: G */
    public final void mo16904G() {
        int i = this.f23325m;
        this.f23325m = i + 1;
        if (i == 0) {
            mo16935V0();
        }
    }

    @C12580l
    /* renamed from: G0 */
    public final Object mo16905G0(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        return mo16903F0(cVar.mo15342e(this));
    }

    /* renamed from: H */
    public final boolean mo16906H(int i) {
        int i2 = i + 1;
        int i0 = i + mo16959i0(i);
        while (i2 < i0) {
            if (C8698y1.m32066I(this.f23314b, mo16953f0(i2))) {
                return true;
            }
            i2 += mo16959i0(i2);
        }
        return false;
    }

    /* renamed from: H0 */
    public final int mo16907H0(int i) {
        return C8698y1.m32089c0(this.f23314b, mo16953f0(i));
    }

    /* renamed from: I */
    public final void mo16908I() {
        this.f23332t = true;
        if (this.f23327o.mo16269d()) {
            mo16896B0(mo16944a0());
            mo16899D0(this.f23315c.length - this.f23323k, this.f23317e);
            mo16921O0();
        }
        this.f23313a.mo16851h0(this, this.f23314b, this.f23317e, this.f23315c, this.f23322j, this.f23316d);
    }

    /* renamed from: I0 */
    public final int mo16909I0(int[] iArr, int i) {
        return mo16918N(iArr, i);
    }

    /* renamed from: J */
    public final boolean mo16910J(int i) {
        return i >= 0 && C8698y1.m32066I(this.f23314b, mo16953f0(i));
    }

    /* renamed from: J0 */
    public final int mo16911J0(int i) {
        return mo16915L0(this.f23314b, i);
    }

    /* renamed from: K */
    public final boolean mo16912K(int i) {
        return i >= 0 && C8698y1.m32067J(this.f23314b, mo16953f0(i));
    }

    /* renamed from: K0 */
    public final int mo16913K0(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        if (cVar.mo15339b()) {
            return mo16915L0(this.f23314b, mo16898D(cVar));
        }
        return -1;
    }

    /* renamed from: L */
    public final int mo16914L(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* renamed from: L0 */
    public final int mo16915L0(int[] iArr, int i) {
        return mo16917M0(C8698y1.m32099h0(iArr, mo16953f0(i)));
    }

    /* renamed from: M */
    public final int mo16916M(int i) {
        return mo16918N(this.f23314b, mo16953f0(i));
    }

    /* renamed from: M0 */
    public final int mo16917M0(int i) {
        return i > -2 ? i : mo16944a0() + i + 2;
    }

    /* renamed from: N */
    public final int mo16918N(int[] iArr, int i) {
        if (i >= mo16936W()) {
            return this.f23315c.length - this.f23323k;
        }
        return mo16914L(C8698y1.m32069L(iArr, i), this.f23323k, this.f23315c.length);
    }

    /* renamed from: N0 */
    public final int mo16919N0(int i, int i2) {
        return i < i2 ? i : -((mo16944a0() - i) + 2);
    }

    /* renamed from: O */
    public final int mo16920O(int i) {
        return i < this.f23322j ? i : i + this.f23323k;
    }

    /* renamed from: O0 */
    public final void mo16921O0() {
        C8538f1 f1Var = this.f23333u;
        if (f1Var != null) {
            while (f1Var.mo16124c()) {
                mo16978r1(f1Var.mo16126e(), f1Var);
            }
        }
    }

    /* renamed from: P */
    public final int mo16922P(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* renamed from: P0 */
    public final boolean mo16923P0(int i, int i2) {
        int i3 = i2 + i;
        int r = C8698y1.m32087b0(this.f23316d, i3, mo16936W() - this.f23318f);
        if (r >= this.f23316d.size()) {
            r--;
        }
        int i4 = r + 1;
        boolean z = false;
        int i5 = 0;
        while (r >= 0) {
            C8412c cVar = this.f23316d.get(r);
            Intrinsics.checkNotNullExpressionValue(cVar, "anchors[index]");
            C8412c cVar2 = cVar;
            int D = mo16898D(cVar2);
            if (D < i) {
                break;
            }
            if (D < i3) {
                cVar2.mo15340c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = r + 1;
                }
                i4 = r;
            }
            r--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.f23316d.subList(i4, i5).clear();
        }
        return z;
    }

    /* renamed from: Q */
    public final List<Integer> mo16924Q(int[] iArr) {
        List N = C8698y1.m32071N(this.f23314b, 0, 1, (Object) null);
        List y4 = CollectionsKt___CollectionsKt.m40718y4(CollectionsKt___CollectionsKt.m40641h5(N, C11479u.m44378W1(0, this.f23317e)), CollectionsKt___CollectionsKt.m40641h5(N, C11479u.m44378W1(this.f23317e + this.f23318f, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(y4.size());
        int size = y4.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(mo16914L(((Number) y4.get(i)).intValue(), this.f23323k, this.f23315c.length)));
        }
        return arrayList;
    }

    /* renamed from: Q0 */
    public final boolean mo16925Q0() {
        boolean z;
        if (this.f23325m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f23330r;
            int i2 = this.f23320h;
            int a1 = mo16945a1();
            C8538f1 f1Var = this.f23333u;
            if (f1Var != null) {
                while (f1Var.mo16124c() && f1Var.mo16125d() >= i) {
                    f1Var.mo16126e();
                }
            }
            boolean R0 = mo16927R0(i, this.f23330r - i);
            mo16929S0(i2, this.f23320h - i2, i - 1);
            this.f23330r = i;
            this.f23320h = i2;
            this.f23326n -= a1;
            return R0;
        }
        ComposerKt.m29774A("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: R */
    public final int mo16926R() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.f23325m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f23330r;
        int i5 = this.f23319g;
        int i6 = this.f23331s;
        int f0 = mo16953f0(i6);
        int i7 = this.f23326n;
        int i8 = i4 - i6;
        boolean o = C8698y1.m32081X(this.f23314b, f0);
        if (z) {
            C8698y1.m32117q0(this.f23314b, f0, i8);
            C8698y1.m32121s0(this.f23314b, f0, i7);
            int i9 = this.f23329q.mo16274i();
            if (!o) {
                i2 = i7;
            }
            this.f23326n = i9 + i2;
            this.f23331s = mo16915L0(this.f23314b, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                int i10 = C8698y1.m32074Q(this.f23314b, f0);
                int s = C8698y1.m32089c0(this.f23314b, f0);
                C8698y1.m32117q0(this.f23314b, f0, i8);
                C8698y1.m32121s0(this.f23314b, f0, i7);
                int i11 = this.f23327o.mo16274i();
                mo16933U0();
                this.f23331s = i11;
                int L0 = mo16915L0(this.f23314b, i6);
                int i12 = this.f23329q.mo16274i();
                this.f23326n = i12;
                if (L0 == i11) {
                    if (!o) {
                        i3 = i7 - s;
                    }
                    this.f23326n = i12 + i3;
                } else {
                    int i13 = i8 - i10;
                    if (o) {
                        i = 0;
                    } else {
                        i = i7 - s;
                    }
                    if (!(i13 == 0 && i == 0)) {
                        while (L0 != 0 && L0 != i11 && (i != 0 || i13 != 0)) {
                            int f02 = mo16953f0(L0);
                            if (i13 != 0) {
                                C8698y1.m32117q0(this.f23314b, f02, C8698y1.m32074Q(this.f23314b, f02) + i13);
                            }
                            if (i != 0) {
                                int[] iArr = this.f23314b;
                                C8698y1.m32121s0(iArr, f02, C8698y1.m32089c0(iArr, f02) + i);
                            }
                            if (C8698y1.m32081X(this.f23314b, f02)) {
                                i = 0;
                            }
                            L0 = mo16915L0(this.f23314b, L0);
                        }
                    }
                    this.f23326n += i;
                }
            } else {
                ComposerKt.m29774A("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    /* renamed from: R0 */
    public final boolean mo16927R0(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<C8412c> arrayList = this.f23316d;
            mo16896B0(i);
            if (!arrayList.isEmpty()) {
                z = mo16923P0(i, i2);
            }
            this.f23317e = i;
            this.f23318f += i2;
            int i3 = this.f23324l;
            if (i3 > i) {
                this.f23324l = Math.max(i, i3 - i2);
            }
            int i4 = this.f23319g;
            if (i4 >= this.f23317e) {
                this.f23319g = i4 - i2;
            }
            if (mo16912K(this.f23331s)) {
                mo16976q1(this.f23331s);
            }
        }
        return z;
    }

    /* renamed from: S */
    public final void mo16928S() {
        boolean z;
        int i = this.f23325m;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f23325m = i2;
            if (i2 == 0) {
                if (this.f23329q.mo16267b() != this.f23327o.mo16267b()) {
                    z2 = false;
                }
                if (z2) {
                    mo16933U0();
                } else {
                    ComposerKt.m29774A("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    /* renamed from: S0 */
    public final void mo16929S0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f23323k;
            int i5 = i + i2;
            mo16899D0(i5, i3);
            this.f23322j = i;
            this.f23323k = i4 + i2;
            C10956m.m41251n2(this.f23315c, null, i, i5);
            int i6 = this.f23321i;
            if (i6 >= i) {
                this.f23321i = i6 - i2;
            }
        }
    }

    /* renamed from: T */
    public final void mo16930T(int i) {
        boolean z;
        boolean z2 = true;
        if (this.f23325m <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f23331s;
            if (i2 != i) {
                if (i < i2 || i >= this.f23319g) {
                    z2 = false;
                }
                if (z2) {
                    int i3 = this.f23330r;
                    int i4 = this.f23320h;
                    int i5 = this.f23321i;
                    this.f23330r = i;
                    mo16958h1();
                    this.f23330r = i3;
                    this.f23320h = i4;
                    this.f23321i = i5;
                    return;
                }
                ComposerKt.m29774A(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        ComposerKt.m29774A("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: T0 */
    public final void mo16931T0() {
        boolean z;
        if (this.f23325m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo16921O0();
            this.f23330r = 0;
            this.f23319g = mo16936W() - this.f23318f;
            this.f23320h = 0;
            this.f23321i = 0;
            this.f23326n = 0;
            return;
        }
        ComposerKt.m29774A("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: U */
    public final void mo16932U(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        mo16930T(cVar.mo15342e(this));
    }

    /* renamed from: U0 */
    public final int mo16933U0() {
        int W = (mo16936W() - this.f23318f) - this.f23328p.mo16274i();
        this.f23319g = W;
        return W;
    }

    /* renamed from: V */
    public final void mo16934V(int i, int i2, int i3) {
        int N0 = mo16919N0(i, this.f23317e);
        while (i3 < i2) {
            C8698y1.m32123t0(this.f23314b, mo16953f0(i3), N0);
            int i4 = C8698y1.m32074Q(this.f23314b, mo16953f0(i3)) + i3;
            mo16934V(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* renamed from: V0 */
    public final void mo16935V0() {
        this.f23328p.mo16275j((mo16936W() - this.f23318f) - this.f23319g);
    }

    /* renamed from: W */
    public final int mo16936W() {
        return this.f23314b.length / 5;
    }

    /* renamed from: W0 */
    public final void mo16937W0(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        mo16893A(cVar.mo15342e(this) - this.f23330r);
    }

    /* renamed from: X */
    public final boolean mo16938X() {
        return this.f23332t;
    }

    @C12580l
    /* renamed from: X0 */
    public final Object mo16939X0(int i, @C12580l Object obj) {
        int e1 = mo16952e1(this.f23314b, mo16953f0(this.f23330r));
        boolean z = true;
        int N = mo16918N(this.f23314b, mo16953f0(this.f23330r + 1));
        int i2 = e1 + i;
        if (i2 < e1 || i2 >= N) {
            z = false;
        }
        if (z) {
            int O = mo16920O(i2);
            Object[] objArr = this.f23315c;
            Object obj2 = objArr[O];
            objArr[O] = obj;
            return obj2;
        }
        ComposerKt.m29774A(("Write to an invalid slot index " + i + " for group " + this.f23330r).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: Y */
    public final int mo16940Y() {
        return this.f23330r;
    }

    /* renamed from: Y0 */
    public final void mo16941Y0(@C12580l Object obj) {
        boolean z;
        int i = this.f23320h;
        if (i <= this.f23321i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f23315c[mo16920O(i - 1)] = obj;
        } else {
            ComposerKt.m29774A("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: Z */
    public final int mo16942Z() {
        return this.f23331s;
    }

    @C12580l
    /* renamed from: Z0 */
    public final Object mo16943Z0() {
        if (this.f23325m > 0) {
            mo16977r0(1, this.f23331s);
        }
        Object[] objArr = this.f23315c;
        int i = this.f23320h;
        this.f23320h = i + 1;
        return objArr[mo16920O(i)];
    }

    /* renamed from: a0 */
    public final int mo16944a0() {
        return mo16936W() - this.f23318f;
    }

    /* renamed from: a1 */
    public final int mo16945a1() {
        int f0 = mo16953f0(this.f23330r);
        int i = this.f23330r + C8698y1.m32074Q(this.f23314b, f0);
        this.f23330r = i;
        this.f23320h = mo16918N(this.f23314b, mo16953f0(i));
        if (C8698y1.m32081X(this.f23314b, f0)) {
            return 1;
        }
        return C8698y1.m32089c0(this.f23314b, f0);
    }

    @C12579k
    /* renamed from: b0 */
    public final C8692w1 mo16946b0() {
        return this.f23313a;
    }

    /* renamed from: b1 */
    public final void mo16947b1() {
        int i = this.f23319g;
        this.f23330r = i;
        this.f23320h = mo16918N(this.f23314b, mo16953f0(i));
    }

    /* renamed from: c0 */
    public final void mo16948c0(StringBuilder sb, int i) {
        int f0 = mo16953f0(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (f0 != i) {
            sb.append("(");
            sb.append(f0);
            sb.append(")");
        }
        sb.append('#');
        sb.append(C8698y1.m32074Q(this.f23314b, f0));
        boolean d0 = m32143d0(this, i);
        if (d0) {
            sb.append('?');
        }
        sb.append('^');
        sb.append(mo16917M0(C8698y1.m32099h0(this.f23314b, f0)));
        sb.append(": key=");
        sb.append(C8698y1.m32082Y(this.f23314b, f0));
        sb.append(", nodes=");
        sb.append(C8698y1.m32089c0(this.f23314b, f0));
        if (d0) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        sb.append(C8698y1.m32069L(this.f23314b, f0));
        sb.append(", parentAnchor=");
        sb.append(C8698y1.m32099h0(this.f23314b, f0));
        if (C8698y1.m32081X(this.f23314b, f0)) {
            sb.append(", node=" + this.f23315c[mo16920O(mo16909I0(this.f23314b, f0))]);
        }
        int e1 = mo16952e1(this.f23314b, f0);
        int N = mo16918N(this.f23314b, f0 + 1);
        if (N > e1) {
            sb.append(", [");
            for (int i2 = e1; i2 < N; i2++) {
                if (i2 != e1) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.f23315c[mo16920O(i2)]));
            }
            sb.append(C12361b.f30261l);
        }
        sb.append(")");
    }

    @C12580l
    /* renamed from: c1 */
    public final Object mo16949c1(int i, int i2) {
        int e1 = mo16952e1(this.f23314b, mo16953f0(i));
        boolean z = true;
        int N = mo16918N(this.f23314b, mo16953f0(i + 1));
        int i3 = i2 + e1;
        if (e1 > i3 || i3 >= N) {
            z = false;
        }
        if (!z) {
            return C8592o.f23032a.mo16277a();
        }
        return this.f23315c[mo16920O(i3)];
    }

    @C12580l
    /* renamed from: d1 */
    public final Object mo16950d1(@C12579k C8412c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        return mo16949c1(mo16898D(cVar), i);
    }

    @C12580l
    /* renamed from: e0 */
    public final Object mo16951e0(int i) {
        int f0 = mo16953f0(i);
        if (C8698y1.m32077T(this.f23314b, f0)) {
            return this.f23315c[mo16900E(this.f23314b, f0)];
        }
        return C8592o.f23032a.mo16277a();
    }

    /* renamed from: e1 */
    public final int mo16952e1(int[] iArr, int i) {
        if (i >= mo16936W()) {
            return this.f23315c.length - this.f23323k;
        }
        return mo16914L(C8698y1.m32109m0(iArr, i), this.f23323k, this.f23315c.length);
    }

    /* renamed from: f0 */
    public final int mo16953f0(int i) {
        return i < this.f23317e ? i : i + this.f23318f;
    }

    /* renamed from: f1 */
    public final void mo16954f1(int i, @C12580l Object obj) {
        mo16964k1(i, C8592o.f23032a.mo16277a(), false, obj);
    }

    /* renamed from: g0 */
    public final int mo16955g0(int i) {
        return C8698y1.m32082Y(this.f23314b, mo16953f0(i));
    }

    /* renamed from: g1 */
    public final void mo16956g1(int i, @C12580l Object obj, @C12580l Object obj2) {
        mo16964k1(i, obj, false, obj2);
    }

    @C12580l
    /* renamed from: h0 */
    public final Object mo16957h0(int i) {
        int f0 = mo16953f0(i);
        if (C8698y1.m32079V(this.f23314b, f0)) {
            return this.f23315c[C8698y1.m32097g0(this.f23314b, f0)];
        }
        return null;
    }

    /* renamed from: h1 */
    public final void mo16958h1() {
        boolean z;
        if (this.f23325m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8592o.C8593a aVar = C8592o.f23032a;
            mo16964k1(0, aVar.mo16277a(), false, aVar.mo16277a());
            return;
        }
        ComposerKt.m29774A("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: i0 */
    public final int mo16959i0(int i) {
        return C8698y1.m32074Q(this.f23314b, mo16953f0(i));
    }

    /* renamed from: i1 */
    public final void mo16960i1(int i) {
        C8592o.C8593a aVar = C8592o.f23032a;
        mo16964k1(i, aVar.mo16277a(), false, aVar.mo16277a());
    }

    @C12579k
    /* renamed from: j0 */
    public final Iterator<Object> mo16961j0() {
        int N = mo16918N(this.f23314b, mo16953f0(this.f23330r));
        int[] iArr = this.f23314b;
        int i = this.f23330r;
        return new C8703b(N, mo16918N(iArr, mo16953f0(i + mo16959i0(i))), this);
    }

    /* renamed from: j1 */
    public final void mo16962j1(int i, @C12580l Object obj) {
        mo16964k1(i, obj, false, C8592o.f23032a.mo16277a());
    }

    @C12579k
    /* renamed from: k0 */
    public final String mo16963k0() {
        StringBuilder sb = new StringBuilder();
        int a0 = mo16944a0();
        for (int i = 0; i < a0; i++) {
            mo16948c0(sb, i);
            sb.append(10);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: k1 */
    public final void mo16964k1(int i, Object obj, boolean z, Object obj2) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.f23325m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f23329q.mo16275j(this.f23326n);
        if (z2) {
            mo16973p0(1);
            int i3 = this.f23330r;
            int f0 = mo16953f0(i3);
            C8592o.C8593a aVar = C8592o.f23032a;
            if (obj3 != aVar.mo16277a()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z || obj4 == aVar.mo16277a()) {
                z4 = false;
            } else {
                z4 = true;
            }
            C8698y1.m32080W(this.f23314b, f0, i, z, z3, z4, this.f23331s, this.f23320h);
            this.f23321i = this.f23320h;
            int i4 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z4 ? 1 : 0);
            if (i4 > 0) {
                mo16977r0(i4, i3);
                Object[] objArr = this.f23315c;
                int i5 = this.f23320h;
                if (z) {
                    objArr[i5] = obj4;
                    i5++;
                }
                if (z3) {
                    objArr[i5] = obj3;
                    i5++;
                }
                if (z4) {
                    objArr[i5] = obj4;
                    i5++;
                }
                this.f23320h = i5;
            }
            this.f23326n = 0;
            i2 = i3 + 1;
            this.f23331s = i3;
            this.f23330r = i2;
        } else {
            this.f23327o.mo16275j(this.f23331s);
            mo16935V0();
            int i6 = this.f23330r;
            int f02 = mo16953f0(i6);
            if (!Intrinsics.areEqual(obj4, C8592o.f23032a.mo16277a())) {
                if (z) {
                    mo16985u1(obj4);
                } else {
                    mo16974p1(obj4);
                }
            }
            this.f23320h = mo16952e1(this.f23314b, f02);
            this.f23321i = mo16918N(this.f23314b, mo16953f0(this.f23330r + 1));
            this.f23326n = C8698y1.m32089c0(this.f23314b, f02);
            this.f23331s = i6;
            this.f23330r = i6 + 1;
            i2 = i6 + C8698y1.m32074Q(this.f23314b, f02);
        }
        this.f23319g = i2;
    }

    /* renamed from: l0 */
    public final boolean mo16965l0(int i) {
        return mo16967m0(i, this.f23330r);
    }

    /* renamed from: l1 */
    public final void mo16966l1(int i, @C12580l Object obj) {
        mo16964k1(i, obj, true, C8592o.f23032a.mo16277a());
    }

    /* renamed from: m0 */
    public final boolean mo16967m0(int i, int i2) {
        int i3;
        int i0;
        if (i2 == this.f23331s) {
            i3 = this.f23319g;
        } else {
            if (i2 > this.f23327o.mo16273h(0)) {
                i0 = mo16959i0(i2);
            } else {
                int c = this.f23327o.mo16268c(i2);
                if (c < 0) {
                    i0 = mo16959i0(i2);
                } else {
                    i3 = (mo16936W() - this.f23318f) - this.f23328p.mo16272g(c);
                }
            }
            i3 = i0 + i2;
        }
        if (i <= i2 || i >= i3) {
            return false;
        }
        return true;
    }

    /* renamed from: m1 */
    public final void mo16968m1(int i, @C12580l Object obj, @C12580l Object obj2) {
        mo16964k1(i, obj, true, obj2);
    }

    /* renamed from: n0 */
    public final boolean mo16969n0(int i) {
        int i2 = this.f23331s;
        return (i > i2 && i < this.f23319g) || (i2 == 0 && i == 0);
    }

    @C12580l
    /* renamed from: n1 */
    public final Object mo16970n1(@C12580l Object obj) {
        Object Z0 = mo16943Z0();
        mo16941Y0(obj);
        return Z0;
    }

    /* renamed from: o0 */
    public final void mo16971o0(@C12580l Object obj) {
        boolean z;
        boolean z2 = false;
        if (this.f23325m >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f23331s;
            int f0 = mo16953f0(i);
            if (!C8698y1.m32077T(this.f23314b, f0)) {
                mo16977r0(1, i);
                int E = mo16900E(this.f23314b, f0);
                int O = mo16920O(E);
                int i2 = this.f23320h;
                if (i2 > E) {
                    int i3 = i2 - E;
                    if (i3 < 3) {
                        z2 = true;
                    }
                    if (z2) {
                        if (i3 > 1) {
                            Object[] objArr = this.f23315c;
                            objArr[O + 2] = objArr[O + 1];
                        }
                        Object[] objArr2 = this.f23315c;
                        objArr2[O + 1] = objArr2[O];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                C8698y1.m32064G(this.f23314b, f0);
                this.f23315c[O] = obj;
                this.f23320h++;
                return;
            }
            ComposerKt.m29774A("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.m29774A("Cannot insert auxiliary data when not inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: o1 */
    public final void mo16972o1(int i, int i2) {
        int i3;
        int W = mo16936W() - this.f23318f;
        if (i < i2) {
            int r = C8698y1.m32087b0(this.f23316d, i, W);
            while (r < this.f23316d.size()) {
                C8412c cVar = this.f23316d.get(r);
                Intrinsics.checkNotNullExpressionValue(cVar, "anchors[index]");
                C8412c cVar2 = cVar;
                int a = cVar2.mo15338a();
                if (a < 0 && (i3 = a + W) < i2) {
                    cVar2.mo15340c(i3);
                    r++;
                } else {
                    return;
                }
            }
            return;
        }
        int r2 = C8698y1.m32087b0(this.f23316d, i2, W);
        while (r2 < this.f23316d.size()) {
            C8412c cVar3 = this.f23316d.get(r2);
            Intrinsics.checkNotNullExpressionValue(cVar3, "anchors[index]");
            C8412c cVar4 = cVar3;
            int a2 = cVar4.mo15338a();
            if (a2 >= 0) {
                cVar4.mo15340c(-(W - a2));
                r2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p0 */
    public final void mo16973p0(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f23330r;
            mo16896B0(i3);
            int i4 = this.f23317e;
            int i5 = this.f23318f;
            int[] iArr = this.f23314b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                C10956m.m41171a1(iArr, iArr2, 0, 0, i4 * 5);
                C10956m.m41171a1(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.f23314b = iArr2;
                i5 = i8;
            }
            int i9 = this.f23319g;
            if (i9 >= i4) {
                this.f23319g = i9 + i;
            }
            int i10 = i4 + i;
            this.f23317e = i10;
            this.f23318f = i5 - i;
            if (i6 > 0) {
                i2 = mo16916M(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.f23324l >= i4) {
                i7 = this.f23322j;
            }
            int P = mo16922P(i2, i7, this.f23323k, this.f23315c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                C8698y1.m32113o0(this.f23314b, i11, P);
            }
            int i12 = this.f23324l;
            if (i12 >= i4) {
                this.f23324l = i12 + i;
            }
        }
    }

    /* renamed from: p1 */
    public final void mo16974p1(@C12580l Object obj) {
        int f0 = mo16953f0(this.f23330r);
        if (C8698y1.m32077T(this.f23314b, f0)) {
            this.f23315c[mo16920O(mo16900E(this.f23314b, f0))] = obj;
        } else {
            ComposerKt.m29774A("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: q0 */
    public final void mo16975q0(int i) {
        boolean z;
        int i2 = 0;
        if (this.f23325m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ComposerKt.m29774A("Writer cannot be inserting".toString());
            throw new KotlinNothingValueException();
        } else if (mo16979s0()) {
            mo16904G();
            mo16960i1(i);
            mo16926R();
            mo16928S();
        } else {
            int i3 = this.f23330r;
            int L0 = mo16915L0(this.f23314b, i3);
            int i0 = L0 + mo16959i0(L0);
            int i4 = i0 - i3;
            int i5 = i3;
            while (i5 < i0) {
                int f0 = mo16953f0(i5);
                i2 += C8698y1.m32089c0(this.f23314b, f0);
                i5 += C8698y1.m32074Q(this.f23314b, f0);
            }
            int f = C8698y1.m32069L(this.f23314b, mo16953f0(i3));
            mo16904G();
            mo16973p0(1);
            mo16928S();
            int f02 = mo16953f0(i3);
            C8698y1.m32080W(this.f23314b, f02, i, false, false, false, L0, f);
            C8698y1.m32117q0(this.f23314b, f02, i4 + 1);
            C8698y1.m32121s0(this.f23314b, f02, i2);
            mo16993z(mo16953f0(L0), 1);
            mo16934V(L0, i0, i3);
            this.f23330r = i0;
        }
    }

    /* renamed from: q1 */
    public final void mo16976q1(int i) {
        if (i >= 0) {
            C8538f1 f1Var = this.f23333u;
            if (f1Var == null) {
                f1Var = new C8538f1((List) null, 1, (DefaultConstructorMarker) null);
                this.f23333u = f1Var;
            }
            f1Var.mo16122a(i);
        }
    }

    /* renamed from: r0 */
    public final void mo16977r0(int i, int i2) {
        if (i > 0) {
            mo16899D0(this.f23320h, i2);
            int i3 = this.f23322j;
            int i4 = this.f23323k;
            if (i4 < i) {
                Object[] objArr = this.f23315c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C10956m.m41183c1(objArr, objArr2, 0, 0, i3);
                C10956m.m41183c1(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f23315c = objArr2;
                i4 = i7;
            }
            int i8 = this.f23321i;
            if (i8 >= i3) {
                this.f23321i = i8 + i;
            }
            this.f23322j = i3 + i;
            this.f23323k = i4 - i;
        }
    }

    /* renamed from: r1 */
    public final void mo16978r1(int i, C8538f1 f1Var) {
        boolean z;
        int f0 = mo16953f0(i);
        boolean H = mo16906H(i);
        if (C8698y1.m32067J(this.f23314b, f0) != H) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8698y1.m32111n0(this.f23314b, f0, H);
            int J0 = mo16911J0(i);
            if (J0 >= 0) {
                f1Var.mo16122a(J0);
            }
        }
    }

    /* renamed from: s0 */
    public final boolean mo16979s0() {
        return this.f23330r == this.f23319g;
    }

    /* renamed from: s1 */
    public final void mo16980s1(int[] iArr, int i, int i2) {
        C8698y1.m32113o0(iArr, i, mo16922P(i2, this.f23322j, this.f23323k, this.f23315c.length));
    }

    /* renamed from: t0 */
    public final boolean mo16981t0() {
        int i = this.f23330r;
        return i < this.f23319g && C8698y1.m32081X(this.f23314b, mo16953f0(i));
    }

    /* renamed from: t1 */
    public final void mo16982t1(@C12579k C8412c cVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        mo16987v1(cVar.mo15342e(this), obj);
    }

    @C12579k
    public String toString() {
        return "SlotWriter(current = " + this.f23330r + " end=" + this.f23319g + " size = " + mo16944a0() + " gap=" + this.f23317e + '-' + (this.f23317e + this.f23318f) + ')';
    }

    /* renamed from: u0 */
    public final boolean mo16984u0(int i) {
        return C8698y1.m32081X(this.f23314b, mo16953f0(i));
    }

    /* renamed from: u1 */
    public final void mo16985u1(@C12580l Object obj) {
        mo16987v1(this.f23330r, obj);
    }

    /* renamed from: v0 */
    public final List<Integer> mo16986v0() {
        boolean z;
        List a0 = C8698y1.m32085a0(this.f23314b, 0, 1, (Object) null);
        ArrayList arrayList = new ArrayList(a0.size());
        int size = a0.size();
        for (int i = 0; i < size; i++) {
            Object obj = a0.get(i);
            ((Number) obj).intValue();
            int i2 = this.f23317e;
            if (i < i2 || i >= i2 + this.f23318f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: v1 */
    public final void mo16987v1(int i, Object obj) {
        boolean z;
        int f0 = mo16953f0(i);
        int[] iArr = this.f23314b;
        if (f0 >= iArr.length || !C8698y1.m32081X(iArr, f0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f23315c[mo16920O(mo16909I0(this.f23314b, f0))] = obj;
            return;
        }
        ComposerKt.m29774A(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: w0 */
    public final void mo16988w0(int i) {
        int f0 = mo16953f0(i);
        if (!C8698y1.m32078U(this.f23314b, f0)) {
            C8698y1.m32119r0(this.f23314b, f0, true);
            if (!C8698y1.m32067J(this.f23314b, f0)) {
                mo16976q1(mo16911J0(i));
            }
        }
    }

    /* renamed from: w1 */
    public final void mo16989w1(@C12580l Object obj) {
        mo16987v1(this.f23331s, obj);
    }

    /* renamed from: x1 */
    public final void mo16990x1() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f23324l;
        int length = this.f23315c.length - this.f23323k;
        int a0 = mo16944a0();
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (i2 < a0) {
            int f0 = mo16953f0(i2);
            int f = C8698y1.m32069L(this.f23314b, f0);
            int N = mo16918N(this.f23314b, f0);
            if (N >= i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (N <= length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (f < 0 && !z4) {
                        if (i == i2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                        }
                    }
                    i2++;
                    i3 = N;
                } else {
                    throw new IllegalStateException(("Data index, " + N + ", out of bound at " + i2).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + N).toString());
            }
        }
    }

    /* renamed from: y0 */
    public final void mo16991y0(int i, int i2, int i3) {
        int i4 = i3 + i;
        int a0 = mo16944a0();
        int r = C8698y1.m32087b0(this.f23316d, i, a0);
        ArrayList arrayList = new ArrayList();
        if (r >= 0) {
            while (r < this.f23316d.size()) {
                C8412c cVar = this.f23316d.get(r);
                Intrinsics.checkNotNullExpressionValue(cVar, "anchors[index]");
                C8412c cVar2 = cVar;
                int D = mo16898D(cVar2);
                if (D < i || D >= i4) {
                    break;
                }
                arrayList.add(cVar2);
                this.f23316d.remove(r);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C8412c cVar3 = (C8412c) arrayList.get(i6);
            int D2 = mo16898D(cVar3) + i5;
            if (D2 >= this.f23317e) {
                cVar3.mo15340c(-(a0 - D2));
            } else {
                cVar3.mo15340c(D2);
            }
            this.f23316d.add(C8698y1.m32087b0(this.f23316d, D2, a0), cVar3);
        }
    }

    /* renamed from: y1 */
    public final void mo16992y1() {
        boolean z;
        boolean z2;
        int i = this.f23317e;
        int i2 = this.f23318f;
        int W = mo16936W();
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < i) {
                if (C8698y1.m32099h0(this.f23314b, i3) <= -2) {
                    z3 = false;
                }
                if (z3) {
                    i3++;
                } else {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
                }
            } else {
                for (int i4 = i2 + i; i4 < W; i4++) {
                    int w = C8698y1.m32099h0(this.f23314b, i4);
                    if (mo16917M0(w) < i) {
                        if (w > -2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                        }
                    } else {
                        if (w <= -2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
                        }
                    }
                }
                return;
            }
        }
    }

    /* renamed from: z */
    public final void mo16993z(int i, int i2) {
        while (i > 0) {
            int[] iArr = this.f23314b;
            C8698y1.m32117q0(iArr, i, C8698y1.m32074Q(iArr, i) + i2);
            i = mo16953f0(mo16917M0(C8698y1.m32099h0(this.f23314b, i)));
        }
    }

    @C12579k
    /* renamed from: z0 */
    public final List<C8412c> mo16994z0(@C12579k C8692w1 w1Var, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(w1Var, "table");
        if (this.f23325m > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m29833q0(z);
        if (i == 0 && this.f23330r == 0 && this.f23313a.mo16860r0() == 0) {
            int[] iArr = this.f23314b;
            Object[] objArr = this.f23315c;
            ArrayList<C8412c> arrayList = this.f23316d;
            int[] p0 = w1Var.mo16859p0();
            int r0 = w1Var.mo16860r0();
            Object[] s0 = w1Var.mo16861s0();
            int W = w1Var.mo16847W();
            this.f23314b = p0;
            this.f23315c = s0;
            this.f23316d = w1Var.mo16858o0();
            this.f23317e = r0;
            this.f23318f = (p0.length / 5) - r0;
            this.f23322j = W;
            this.f23323k = s0.length - W;
            this.f23324l = r0;
            w1Var.mo16842L0(iArr, 0, objArr, 0, arrayList);
            return this.f23316d;
        }
        C8701z1 G0 = w1Var.mo16837G0();
        try {
            return f23312v.mo16995b(G0, i, this, true, true);
        } finally {
            G0.mo16908I();
        }
    }
}
