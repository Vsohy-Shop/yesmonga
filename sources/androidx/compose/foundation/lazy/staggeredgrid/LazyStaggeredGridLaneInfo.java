package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.C10944i;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,207:1\n1#2:208\n388#3,7:209\n388#3,7:216\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:209,7\n187#1:216,7\n*E\n"})
public final class LazyStaggeredGridLaneInfo {
    @C12579k

    /* renamed from: d */
    public static final C2584a f6808d = new C2584a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f6809e = 131072;

    /* renamed from: f */
    public static final int f6810f = -1;

    /* renamed from: g */
    public static final int f6811g = -2;

    /* renamed from: a */
    public int f6812a;
    @C12579k

    /* renamed from: b */
    public int[] f6813b = new int[16];
    @C12579k

    /* renamed from: c */
    public final C10944i<C2585b> f6814c = new C10944i<>();

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$a */
    public static final class C2584a {
        public /* synthetic */ C2584a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C2584a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$b */
    public static final class C2585b {

        /* renamed from: a */
        public final int f6815a;
        @C12579k

        /* renamed from: b */
        public int[] f6816b;

        public C2585b(int i, @C12579k int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "gaps");
            this.f6815a = i;
            this.f6816b = iArr;
        }

        @C12579k
        /* renamed from: a */
        public final int[] mo8881a() {
            return this.f6816b;
        }

        /* renamed from: b */
        public final int mo8882b() {
            return this.f6815a;
        }

        /* renamed from: c */
        public final void mo8883c(@C12579k int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f6816b = iArr;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m11617c(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridLaneInfo.mo8870b(i, i2);
    }

    /* renamed from: a */
    public final boolean mo8869a(int i, int i2) {
        int h = mo8875h(i);
        return h == i2 || h == -1 || h == -2;
    }

    /* renamed from: b */
    public final void mo8870b(int i, int i2) {
        boolean z;
        if (i <= 131072) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = this.f6813b;
            if (iArr.length < i) {
                int length = iArr.length;
                while (length < i) {
                    length *= 2;
                }
                this.f6813b = C10956m.m41225j1(this.f6813b, new int[length], i2, 0, 0, 12, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i + " is larger than max supported: 131072!").toString());
    }

    /* renamed from: d */
    public final void mo8871d(int i) {
        boolean z;
        int i2 = this.f6812a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m11617c(this, i3 + 1, 0, 2, (Object) null);
        } else {
            int max = Math.max(i - (this.f6813b.length / 2), 0);
            this.f6812a = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                int[] iArr = this.f6813b;
                if (i4 < iArr.length) {
                    C10956m.m41171a1(iArr, iArr, 0, i4, iArr.length);
                }
                int[] iArr2 = this.f6813b;
                C10956m.m41238l2(iArr2, 0, Math.max(0, iArr2.length - i4), this.f6813b.length);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.f6813b;
                if (iArr3.length + i5 < 131072) {
                    mo8870b(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        C10956m.m41171a1(iArr3, iArr3, i5, 0, iArr3.length - i5);
                    }
                    int[] iArr4 = this.f6813b;
                    C10956m.m41238l2(iArr4, 0, 0, Math.min(iArr4.length, i5));
                }
            }
        }
        while ((!this.f6814c.isEmpty()) && this.f6814c.first().mo8882b() < mo8876i()) {
            this.f6814c.mo22306o0();
        }
        while ((!this.f6814c.isEmpty()) && this.f6814c.last().mo8882b() > mo8880m()) {
            this.f6814c.mo22310r0();
        }
    }

    /* renamed from: e */
    public final int mo8872e(int i, int i2) {
        int m = mo8880m();
        for (int i3 = i + 1; i3 < m; i3++) {
            if (mo8869a(i3, i2)) {
                return i3;
            }
        }
        return mo8880m();
    }

    /* renamed from: f */
    public final int mo8873f(int i, int i2) {
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (mo8869a(i, i2)) {
                return i;
            }
        }
    }

    @C12580l
    /* renamed from: g */
    public final int[] mo8874g(int i) {
        C10944i<C2585b> iVar = this.f6814c;
        C2585b bVar = (C2585b) CollectionsKt___CollectionsKt.m40559R2(this.f6814c, CollectionsKt__CollectionsKt.m40465t(iVar, 0, iVar.size(), new C2586x6e01acca(Integer.valueOf(i))));
        if (bVar != null) {
            return bVar.mo8881a();
        }
        return null;
    }

    /* renamed from: h */
    public final int mo8875h(int i) {
        if (i < mo8876i() || i >= mo8880m()) {
            return -1;
        }
        return this.f6813b[i - this.f6812a] - 1;
    }

    /* renamed from: i */
    public final int mo8876i() {
        return this.f6812a;
    }

    /* renamed from: j */
    public final void mo8877j() {
        C10956m.m41300u2(this.f6813b, 0, 0, 0, 6, (Object) null);
        this.f6814c.clear();
    }

    /* renamed from: k */
    public final void mo8878k(int i, @C12580l int[] iArr) {
        C10944i<C2585b> iVar = this.f6814c;
        int t = CollectionsKt__CollectionsKt.m40465t(iVar, 0, iVar.size(), new C2587x583b0d6(Integer.valueOf(i)));
        if (t < 0) {
            if (iArr != null) {
                this.f6814c.add(-(t + 1), new C2585b(i, iArr));
            }
        } else if (iArr == null) {
            this.f6814c.remove(t);
        } else {
            this.f6814c.get(t).mo8883c(iArr);
        }
    }

    /* renamed from: l */
    public final void mo8879l(int i, int i2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo8871d(i);
            this.f6813b[i - this.f6812a] = i2 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported".toString());
    }

    /* renamed from: m */
    public final int mo8880m() {
        return this.f6812a + this.f6813b.length;
    }
}
