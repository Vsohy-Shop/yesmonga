package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n82#2,3:3444\n33#2,4:3447\n85#2,2:3451\n38#2:3453\n87#2:3454\n1#3:3455\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3246#1:3444,3\n3246#1:3447,4\n3246#1:3451,2\n3246#1:3453\n3246#1:3454\n*E\n"})
/* renamed from: androidx.compose.runtime.y1 */
public final class C8698y1 {

    /* renamed from: a */
    public static final int f23289a = -2;

    /* renamed from: b */
    public static final int f23290b = 0;

    /* renamed from: c */
    public static final int f23291c = 1;

    /* renamed from: d */
    public static final int f23292d = 2;

    /* renamed from: e */
    public static final int f23293e = 3;

    /* renamed from: f */
    public static final int f23294f = 4;

    /* renamed from: g */
    public static final int f23295g = 5;

    /* renamed from: h */
    public static final int f23296h = 1073741824;

    /* renamed from: i */
    public static final int f23297i = 536870912;

    /* renamed from: j */
    public static final int f23298j = 29;

    /* renamed from: k */
    public static final int f23299k = 268435456;

    /* renamed from: l */
    public static final int f23300l = 28;

    /* renamed from: m */
    public static final int f23301m = 134217728;

    /* renamed from: n */
    public static final int f23302n = 67108864;

    /* renamed from: o */
    public static final int f23303o = 28;

    /* renamed from: p */
    public static final int f23304p = 67108863;

    /* renamed from: q */
    public static final int f23305q = 32;

    /* renamed from: r */
    public static final int f23306r = 32;

    /* renamed from: G */
    public static final void m32064G(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | 268435456;
    }

    /* renamed from: H */
    public static final int m32065H(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m32068K(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* renamed from: I */
    public static final boolean m32066I(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    /* renamed from: J */
    public static final boolean m32067J(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & f23302n) != 0;
    }

    /* renamed from: K */
    public static final int m32068K(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: L */
    public static final int m32069L(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: M */
    public static final List<Integer> m32070M(int[] iArr, int i) {
        return m32107l0(iArr, C11479u.m44315B1(C11479u.m44378W1(4, i), 5));
    }

    /* renamed from: N */
    public static /* synthetic */ List m32071N(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return m32070M(iArr, i);
    }

    /* renamed from: O */
    public static final C8412c m32072O(ArrayList<C8412c> arrayList, int i, int i2, C11289a<C8412c> aVar) {
        int y = m32105k0(arrayList, i, i2);
        if (y < 0) {
            C8412c invoke = aVar.invoke();
            arrayList.add(-(y + 1), invoke);
            return invoke;
        }
        C8412c cVar = arrayList.get(y);
        Intrinsics.checkNotNullExpressionValue(cVar, "get(location)");
        return cVar;
    }

    /* renamed from: P */
    public static final int m32073P(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* renamed from: Q */
    public static final int m32074Q(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: R */
    public static final List<Integer> m32075R(int[] iArr, int i) {
        return m32107l0(iArr, C11479u.m44315B1(C11479u.m44378W1(3, i), 5));
    }

    /* renamed from: S */
    public static /* synthetic */ List m32076S(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return m32075R(iArr, i);
    }

    /* renamed from: T */
    public static final boolean m32077T(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* renamed from: U */
    public static final boolean m32078U(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & f23301m) != 0;
    }

    /* renamed from: V */
    public static final boolean m32079V(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* renamed from: W */
    public static final void m32080W(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = 536870912;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = 268435456;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* renamed from: X */
    public static final boolean m32081X(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: Y */
    public static final int m32082Y(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* renamed from: Z */
    public static final List<Integer> m32083Z(int[] iArr, int i) {
        return m32107l0(iArr, C11479u.m44315B1(C11479u.m44378W1(0, i), 5));
    }

    /* renamed from: a0 */
    public static /* synthetic */ List m32085a0(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return m32083Z(iArr, i);
    }

    /* renamed from: b0 */
    public static final int m32087b0(ArrayList<C8412c> arrayList, int i, int i2) {
        int k0 = m32105k0(arrayList, i, i2);
        return k0 >= 0 ? k0 : -(k0 + 1);
    }

    /* renamed from: c0 */
    public static final int m32089c0(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & f23304p;
    }

    /* renamed from: d0 */
    public static final List<Integer> m32091d0(int[] iArr, int i) {
        List<Integer> l0 = m32107l0(iArr, C11479u.m44315B1(C11479u.m44378W1(1, i), 5));
        ArrayList arrayList = new ArrayList(l0.size());
        int size = l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(l0.get(i2).intValue() & f23304p));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static /* synthetic */ List m32093e0(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return m32091d0(iArr, i);
    }

    /* renamed from: f0 */
    public static final int m32095f0(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: g0 */
    public static final int m32097g0(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m32068K(iArr[i2 + 1] >> 30);
    }

    /* renamed from: h0 */
    public static final int m32099h0(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* renamed from: i0 */
    public static final List<Integer> m32101i0(int[] iArr, int i) {
        return m32107l0(iArr, C11479u.m44315B1(C11479u.m44378W1(2, i), 5));
    }

    /* renamed from: j0 */
    public static /* synthetic */ List m32103j0(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return m32101i0(iArr, i);
    }

    /* renamed from: k0 */
    public static final int m32105k0(ArrayList<C8412c> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int a = arrayList.get(i4).mo15338a();
            if (a < 0) {
                a += i2;
            }
            int compare = Intrinsics.compare(a, i);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: l0 */
    public static final List<Integer> m32107l0(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : iterable) {
            arrayList.add(Integer.valueOf(iArr[intValue.intValue()]));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static final int m32109m0(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m32068K(iArr[i2 + 1] >> 28);
    }

    /* renamed from: n0 */
    public static final void m32111n0(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | f23302n;
        } else {
            iArr[i2] = iArr[i2] & -67108865;
        }
    }

    /* renamed from: o0 */
    public static final void m32113o0(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* renamed from: p0 */
    public static final void m32115p0(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 0] = i2;
    }

    /* renamed from: q0 */
    public static final void m32117q0(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m29833q0(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* renamed from: r0 */
    public static final void m32119r0(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | f23301m;
        } else {
            iArr[i2] = iArr[i2] & -134217729;
        }
    }

    /* renamed from: s0 */
    public static final void m32121s0(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 < 0 || i2 >= 67108863) {
            z = false;
        } else {
            z = true;
        }
        ComposerKt.m29833q0(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & -67108864);
    }

    /* renamed from: t0 */
    public static final void m32123t0(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
