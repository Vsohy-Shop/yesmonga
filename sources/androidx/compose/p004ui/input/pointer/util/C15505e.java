package androidx.compose.p004ui.input.pointer.util;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15471e;
import androidx.compose.p004ui.input.pointer.C15492p;
import androidx.compose.p004ui.input.pointer.C15507w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.util.e */
public final class C15505e {

    /* renamed from: a */
    public static final int f38564a = 40;

    /* renamed from: b */
    public static final int f38565b = 20;

    /* renamed from: c */
    public static final int f38566c = 100;

    /* renamed from: d */
    public static final float f38567d = 1.0f;

    /* renamed from: c */
    public static final void m68781c(@C12579k C15504d dVar, @C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(wVar, "event");
        if (C15492p.m68683c(wVar)) {
            dVar.mo44161e(wVar.mo44177q());
            dVar.mo44160d();
        }
        long u = wVar.mo44181u();
        List<C15471e> n = wVar.mo44175n();
        int size = n.size();
        int i = 0;
        while (i < size) {
            C15471e eVar = n.get(i);
            long u2 = C15094f.m64885u(eVar.mo44040a(), u);
            long a = eVar.mo44040a();
            dVar.mo44161e(C15094f.m64886v(dVar.mo44159c(), u2));
            dVar.mo44157a(eVar.mo44041b(), dVar.mo44159c());
            i++;
            u = a;
        }
        dVar.mo44161e(C15094f.m64886v(dVar.mo44159c(), C15094f.m64885u(wVar.mo44177q(), u)));
        dVar.mo44157a(wVar.mo44186z(), dVar.mo44159c());
    }

    /* renamed from: d */
    public static final float m68782d(List<Float> list, List<Float> list2, boolean z) {
        boolean z2;
        float f;
        boolean z3;
        float f2;
        int size = list.size();
        float f3 = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return 0.0f;
            }
            if (z) {
                f2 = list.get(0).floatValue();
            } else {
                f2 = list.get(0).floatValue() - list.get(1).floatValue();
            }
            return f2 / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i = size - 1;
        for (int i2 = i; i2 > 0; i2--) {
            int i3 = i2 - 1;
            if (list2.get(i2).floatValue() == list2.get(i3).floatValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float e = m68783e(f3);
                if (z) {
                    f = -list.get(i3).floatValue();
                } else {
                    f = list.get(i2).floatValue() - list.get(i3).floatValue();
                }
                float floatValue = f / (list2.get(i2).floatValue() - list2.get(i3).floatValue());
                f3 += (floatValue - e) * Math.abs(floatValue);
                if (i2 == i) {
                    f3 *= 0.5f;
                }
            }
        }
        return m68783e(f3);
    }

    /* renamed from: e */
    public static final float m68783e(float f) {
        return Math.signum(f) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f))));
    }

    @C12579k
    /* renamed from: f */
    public static final List<Float> m68784f(@C12579k List<Float> list, @C12579k List<Float> list2, int i) {
        int i2;
        float f;
        List<Float> list3 = list;
        List<Float> list4 = list2;
        int i3 = i;
        Intrinsics.checkNotNullParameter(list3, "x");
        Intrinsics.checkNotNullParameter(list4, "y");
        if (i3 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            if (i3 >= list.size()) {
                i2 = list.size() - 1;
            } else {
                i2 = i3;
            }
            int i4 = i3 + 1;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            int size = list.size();
            int i6 = i2 + 1;
            C15502b bVar = new C15502b(i6, size);
            for (int i7 = 0; i7 < size; i7++) {
                bVar.mo44150c(0, i7, 1.0f);
                for (int i8 = 1; i8 < i6; i8++) {
                    bVar.mo44150c(i8, i7, bVar.mo44148a(i8 - 1, i7) * list3.get(i7).floatValue());
                }
            }
            C15502b bVar2 = new C15502b(i6, size);
            C15502b bVar3 = new C15502b(i6, i6);
            int i9 = 0;
            while (i9 < i6) {
                for (int i10 = 0; i10 < size; i10++) {
                    bVar2.mo44150c(i9, i10, bVar.mo44148a(i9, i10));
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    float f2 = bVar2.mo44149b(i9).mo44156f(bVar2.mo44149b(i11));
                    for (int i12 = 0; i12 < size; i12++) {
                        bVar2.mo44150c(i9, i12, bVar2.mo44148a(i9, i12) - (bVar2.mo44148a(i11, i12) * f2));
                    }
                }
                float d = bVar2.mo44149b(i9).mo44154d();
                if (((double) d) >= 1.0E-6d) {
                    float f3 = 1.0f / d;
                    for (int i13 = 0; i13 < size; i13++) {
                        bVar2.mo44150c(i9, i13, bVar2.mo44148a(i9, i13) * f3);
                    }
                    for (int i14 = 0; i14 < i6; i14++) {
                        if (i14 < i9) {
                            f = 0.0f;
                        } else {
                            f = bVar2.mo44149b(i9).mo44156f(bVar.mo44149b(i14));
                        }
                        bVar3.mo44150c(i9, i14, f);
                    }
                    i9++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            C15503c cVar = new C15503c(size);
            for (int i15 = 0; i15 < size; i15++) {
                cVar.mo44155e(i15, list4.get(i15).floatValue() * 1.0f);
            }
            int i16 = i6 - 1;
            for (int i17 = i16; -1 < i17; i17--) {
                arrayList.set(i17, Float.valueOf(bVar2.mo44149b(i17).mo44156f(cVar)));
                int i18 = i17 + 1;
                if (i18 <= i16) {
                    int i19 = i16;
                    while (true) {
                        arrayList.set(i17, Float.valueOf(((Number) arrayList.get(i17)).floatValue() - (bVar3.mo44148a(i17, i19) * ((Number) arrayList.get(i19)).floatValue())));
                        if (i19 == i18) {
                            break;
                        }
                        i19--;
                    }
                }
                arrayList.set(i17, Float.valueOf(((Number) arrayList.get(i17)).floatValue() / bVar3.mo44148a(i17, i17)));
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    /* renamed from: g */
    public static final void m68785g(C15501a[] aVarArr, int i, long j, float f) {
        C15501a aVar = aVarArr[i];
        if (aVar == null) {
            aVarArr[i] = new C15501a(j, f);
            return;
        }
        aVar.mo44145h(j);
        aVar.mo44144g(f);
    }
}
