package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8646f;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C11363r0({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,117:1\n76#2:118\n102#2,2:119\n76#2:121\n102#2,2:122\n16594#3,14:124\n1#4:138\n116#5,2:139\n33#5,6:141\n118#5:147\n480#6,4:148\n485#6:157\n480#6,4:158\n485#6:167\n122#7,5:152\n122#7,5:162\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n34#1:118\n34#1:119,2\n35#1:121\n35#1:122,2\n47#1:124,14\n51#1:139,2\n51#1:141,6\n51#1:147\n58#1:148,4\n58#1:157\n95#1:158,4\n95#1:167\n58#1:152,5\n95#1:162,5\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.p */
public final class C2608p {
    @C12579k

    /* renamed from: a */
    public final C11304p<Integer, Integer, int[]> f6924a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f6925b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f6926c;

    /* renamed from: d */
    public boolean f6927d;
    @C12580l

    /* renamed from: e */
    public Object f6928e;

    public C2608p(@C12579k int[] iArr, @C12579k int[] iArr2, @C12579k C11304p<? super Integer, ? super Integer, int[]> pVar) {
        Intrinsics.checkNotNullParameter(iArr, "initialIndices");
        Intrinsics.checkNotNullParameter(iArr2, "initialOffsets");
        Intrinsics.checkNotNullParameter(pVar, "fillIndices");
        this.f6924a = pVar;
        this.f6925b = C8539f2.m30981g(iArr, (C8410b2) null, 2, (Object) null);
        this.f6926c = C8539f2.m30981g(iArr2, (C8410b2) null, 2, (Object) null);
    }

    @C12579k
    /* renamed from: a */
    public final int[] mo9004a() {
        return (int[]) this.f6925b.getValue();
    }

    @C12579k
    /* renamed from: b */
    public final int[] mo9005b() {
        return (int[]) this.f6926c.getValue();
    }

    /* renamed from: c */
    public final void mo9006c(int i, int i2) {
        int[] invoke = this.f6924a.invoke(Integer.valueOf(i), Integer.valueOf(mo9004a().length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
        }
        mo9009f(invoke, iArr);
        this.f6928e = null;
    }

    /* renamed from: d */
    public final void mo9007d(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f6925b.setValue(iArr);
    }

    /* renamed from: e */
    public final void mo9008e(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f6926c.setValue(iArr);
    }

    /* renamed from: f */
    public final void mo9009f(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, mo9004a())) {
            mo9007d(iArr);
        }
        if (!Arrays.equals(iArr2, mo9005b())) {
            mo9008e(iArr2);
        }
    }

    /* renamed from: g */
    public final void mo9010g(@C12579k C2604l lVar) {
        boolean z;
        Object obj;
        C2596e eVar;
        C8646f p;
        boolean z2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(lVar, "measureResult");
        int[] m = lVar.mo8983m();
        if (m.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i3 = m[0];
            int Ve = ArraysKt___ArraysKt.m39459Ve(m);
            if (Ve != 0) {
                if (i3 == -1) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = i3;
                }
                C10953k0 H = new C11466l(1, Ve).iterator();
                while (H.hasNext()) {
                    int i4 = m[H.mo6374c()];
                    if (i4 == -1) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = i4;
                    }
                    if (i > i2) {
                        i3 = i4;
                        i = i2;
                    }
                }
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = 0;
            }
            List<C2596e> i5 = lVar.mo8949i();
            int size = i5.size();
            int i6 = 0;
            while (true) {
                obj = null;
                if (i6 >= size) {
                    eVar = null;
                    break;
                }
                eVar = i5.get(i6);
                if (eVar.getIndex() == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i6++;
            }
            C2596e eVar2 = eVar;
            if (eVar2 != null) {
                obj = eVar2.getKey();
            }
            this.f6928e = obj;
            if (this.f6927d || lVar.mo8945e() > 0) {
                this.f6927d = true;
                C8646f a = C8646f.f23196e.mo16621a();
                try {
                    p = a.mo16617p();
                    mo9009f(lVar.mo8983m(), lVar.mo8984n());
                    C11079d2 d2Var = C11079d2.f28267a;
                    a.mo16619w(p);
                    a.mo16415d();
                } catch (Throwable th) {
                    a.mo16415d();
                    throw th;
                }
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @C2855v
    /* renamed from: h */
    public final void mo9011h(@C12579k C2549h hVar) {
        C8646f p;
        Intrinsics.checkNotNullParameter(hVar, "itemProvider");
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            Object obj = this.f6928e;
            int i = 0;
            Integer of = ArraysKt___ArraysKt.m40059of(mo9004a(), 0);
            if (of != null) {
                i = of.intValue();
            }
            int c = C2550i.m11425c(hVar, obj, i);
            if (!ArraysKt___ArraysKt.m39324R8(mo9004a(), c)) {
                mo9009f(this.f6924a.invoke(Integer.valueOf(c), Integer.valueOf(mo9004a().length)), mo9005b());
            }
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo16619w(p);
            a.mo16415d();
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }
}
