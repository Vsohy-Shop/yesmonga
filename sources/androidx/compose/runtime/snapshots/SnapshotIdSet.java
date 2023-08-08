package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8585m0;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.collections.C10956m;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.sequences.C11563q;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
public final class SnapshotIdSet implements Iterable<Integer>, C11345a {
    @C12579k

    /* renamed from: e */
    public static final C8630a f23119e = new C8630a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final SnapshotIdSet f23120f = new SnapshotIdSet(0, 0, 0, (int[]) null);

    /* renamed from: a */
    public final long f23121a;

    /* renamed from: b */
    public final long f23122b;

    /* renamed from: c */
    public final int f23123c;
    @C12580l

    /* renamed from: d */
    public final int[] f23124d;

    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$a */
    public static final class C8630a {
        public /* synthetic */ C8630a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final SnapshotIdSet mo16447a() {
            return SnapshotIdSet.f23120f;
        }

        public C8630a() {
        }
    }

    public SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.f23121a = j;
        this.f23122b = j2;
        this.f23123c = i;
        this.f23124d = iArr;
    }

    @C12579k
    /* renamed from: H */
    public final SnapshotIdSet mo16437H(int i) {
        int[] iArr;
        int b;
        int i2 = i;
        int i3 = this.f23123c;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j = 1 << i4;
            long j2 = this.f23122b;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.f23121a, j2 & (~j), i3, this.f23124d);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j3 = 1 << (i4 - 64);
            long j4 = this.f23121a;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.f23122b, i3, this.f23124d);
            }
        } else if (i4 < 0 && (iArr = this.f23124d) != null && (b = C8660m.m31801b(iArr, i2)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f23121a, this.f23122b, this.f23123c, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (b > 0) {
                C10956m.m41171a1(iArr, iArr2, 0, 0, b);
            }
            if (b < length) {
                C10956m.m41171a1(iArr, iArr2, b, b + 1, length + 1);
            }
            return new SnapshotIdSet(this.f23121a, this.f23122b, this.f23123c, iArr2);
        }
        return this;
    }

    /* renamed from: M */
    public final void mo16438M(@C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int[] e = this.f23124d;
        if (e != null) {
            for (int valueOf : e) {
                lVar.invoke(Integer.valueOf(valueOf));
            }
        }
        if (this.f23122b != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.f23122b & (1 << i)) != 0) {
                    lVar.invoke(Integer.valueOf(this.f23123c + i));
                }
            }
        }
        if (this.f23121a != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.f23121a & (1 << i2)) != 0) {
                    lVar.invoke(Integer.valueOf(i2 + 64 + this.f23123c));
                }
            }
        }
    }

    /* renamed from: Q */
    public final boolean mo16439Q(int i) {
        int[] iArr;
        int i2 = i - this.f23123c;
        boolean z = true;
        if (i2 < 0 || i2 >= 64) {
            if (i2 < 64 || i2 >= 128) {
                if (i2 > 0 || (iArr = this.f23124d) == null) {
                    return false;
                }
                if (C8660m.m31801b(iArr, i) < 0) {
                    z = false;
                }
                return z;
            } else if (((1 << (i2 - 64)) & this.f23121a) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i2) & this.f23122b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: W */
    public final int mo16440W(int i) {
        int[] iArr = this.f23124d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f23122b;
        if (j != 0) {
            return this.f23123c + C8660m.m31802c(j);
        }
        long j2 = this.f23121a;
        if (j2 != 0) {
            return this.f23123c + 64 + C8660m.m31802c(j2);
        }
        return i;
    }

    @C12579k
    /* renamed from: X */
    public final SnapshotIdSet mo16441X(@C12579k SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f23120f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.f23123c;
        int i2 = this.f23123c;
        if (i == i2 && snapshotIdSet.f23124d == (iArr = this.f23124d)) {
            return new SnapshotIdSet(this.f23121a | snapshotIdSet.f23121a, this.f23122b | snapshotIdSet.f23122b, i2, iArr);
        }
        if (this.f23124d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.mo16442e0(((Number) it.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo16442e0(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }

    @C12579k
    /* renamed from: e0 */
    public final SnapshotIdSet mo16442e0(int i) {
        int i2;
        int[] iArr;
        int i3 = i;
        int i4 = this.f23123c;
        int i5 = i3 - i4;
        long j = 0;
        if (i5 >= 0 && i5 < 64) {
            long j2 = 1 << i5;
            long j3 = this.f23122b;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.f23121a, j3 | j2, i4, this.f23124d);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j4 = 1 << (i5 - 64);
            long j5 = this.f23121a;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.f23122b, i4, this.f23124d);
            }
        } else if (i5 < 128) {
            int[] iArr2 = this.f23124d;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.f23121a, this.f23122b, i4, new int[]{i3});
            }
            int b = C8660m.m31801b(iArr2, i3);
            if (b < 0) {
                int i6 = -(b + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                C10956m.m41171a1(iArr2, iArr3, 0, 0, i6);
                C10956m.m41171a1(iArr2, iArr3, i6 + 1, i6, length - 1);
                iArr3[i6] = i3;
                return new SnapshotIdSet(this.f23121a, this.f23122b, this.f23123c, iArr3);
            }
        } else if (!mo16439Q(i)) {
            long j6 = this.f23121a;
            long j7 = this.f23122b;
            int i7 = this.f23123c;
            int i8 = ((i3 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i7 >= i8) {
                    i2 = i7;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f23124d;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    i2 = i8;
                    j8 = j;
                    break;
                }
                i7 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (iArr = CollectionsKt___CollectionsKt.m40552P5(arrayList)) == null) {
                iArr = this.f23124d;
            }
            return new SnapshotIdSet(j9, j8, i2, iArr).mo16442e0(i3);
        }
        return this;
    }

    @C12579k
    public Iterator<Integer> iterator() {
        return C11563q.m44902b(new SnapshotIdSet$iterator$1(this, (C11045c<? super SnapshotIdSet$iterator$1>) null)).iterator();
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(C8634a.m31597k(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null));
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    @C12579k
    /* renamed from: w */
    public final SnapshotIdSet mo16445w(@C12579k SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        Intrinsics.checkNotNullParameter(snapshotIdSet2, "bits");
        SnapshotIdSet snapshotIdSet3 = f23120f;
        if (Intrinsics.areEqual((Object) snapshotIdSet2, (Object) snapshotIdSet3) || Intrinsics.areEqual((Object) this, (Object) snapshotIdSet3)) {
            return snapshotIdSet3;
        }
        int i = snapshotIdSet2.f23123c;
        int i2 = this.f23123c;
        if (i == i2 && snapshotIdSet2.f23124d == (iArr = this.f23124d)) {
            long j = this.f23121a;
            long j2 = snapshotIdSet2.f23121a;
            long j3 = this.f23122b;
            long j4 = snapshotIdSet2.f23122b;
            long j5 = j3 & j4;
            if ((j & j2) == 0 && j5 == 0 && iArr == null) {
                return snapshotIdSet3;
            }
            return new SnapshotIdSet(j2 & j, j3 & j4, i2, iArr);
        } else if (this.f23124d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (snapshotIdSet2.mo16439Q(intValue)) {
                    snapshotIdSet3 = snapshotIdSet3.mo16442e0(intValue);
                }
            }
            return snapshotIdSet3;
        } else {
            Iterator it2 = snapshotIdSet.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Number) it2.next()).intValue();
                if (mo16439Q(intValue2)) {
                    snapshotIdSet3 = snapshotIdSet3.mo16442e0(intValue2);
                }
            }
            return snapshotIdSet3;
        }
    }

    @C12579k
    /* renamed from: y */
    public final SnapshotIdSet mo16446y(@C12579k SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f23120f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.f23123c;
        int i2 = this.f23123c;
        if (i == i2 && snapshotIdSet.f23124d == (iArr = this.f23124d)) {
            return new SnapshotIdSet(this.f23121a & (~snapshotIdSet.f23121a), this.f23122b & (~snapshotIdSet.f23122b), i2, iArr);
        }
        Iterator it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo16437H(((Number) it.next()).intValue());
        }
        return snapshotIdSet3;
    }
}
