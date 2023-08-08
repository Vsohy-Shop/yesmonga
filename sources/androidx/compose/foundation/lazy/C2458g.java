package androidx.compose.foundation.lazy;

import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.g */
public final class C2458g {
    @C12579k

    /* renamed from: a */
    public final C8423g<C2459a> f6473a = new C8423g<>(new C2459a[16], 0);

    /* renamed from: androidx.compose.foundation.lazy.g$a */
    public static final class C2459a {

        /* renamed from: a */
        public final int f6474a;

        /* renamed from: b */
        public final int f6475b;

        public C2459a(int i, int i2) {
            boolean z;
            this.f6474a = i;
            this.f6475b = i2;
            boolean z2 = true;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!(i2 < i ? false : z2)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: d */
        public static /* synthetic */ C2459a m10957d(C2459a aVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = aVar.f6474a;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.f6475b;
            }
            return aVar.mo8400c(i, i2);
        }

        /* renamed from: a */
        public final int mo8398a() {
            return this.f6474a;
        }

        /* renamed from: b */
        public final int mo8399b() {
            return this.f6475b;
        }

        @C12579k
        /* renamed from: c */
        public final C2459a mo8400c(int i, int i2) {
            return new C2459a(i, i2);
        }

        /* renamed from: e */
        public final int mo8401e() {
            return this.f6475b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2459a)) {
                return false;
            }
            C2459a aVar = (C2459a) obj;
            return this.f6474a == aVar.f6474a && this.f6475b == aVar.f6475b;
        }

        /* renamed from: f */
        public final int mo8403f() {
            return this.f6474a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f6474a) * 31) + Integer.hashCode(this.f6475b);
        }

        @C12579k
        public String toString() {
            return "Interval(start=" + this.f6474a + ", end=" + this.f6475b + ')';
        }
    }

    @C12579k
    /* renamed from: a */
    public final C2459a mo8393a(int i, int i2) {
        C2459a aVar = new C2459a(i, i2);
        this.f6473a.mo15463e(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final int mo8394b() {
        int e = this.f6473a.mo15446K().mo8401e();
        C8423g<C2459a> gVar = this.f6473a;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                C2459a aVar = (C2459a) d0[i];
                if (aVar.mo8401e() > e) {
                    e = aVar.mo8401e();
                }
                i++;
            } while (i < h0);
        }
        return e;
    }

    /* renamed from: c */
    public final int mo8395c() {
        int f = this.f6473a.mo15446K().mo8403f();
        C8423g<C2459a> gVar = this.f6473a;
        int h0 = gVar.mo15469h0();
        boolean z = false;
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                C2459a aVar = (C2459a) d0[i];
                if (aVar.mo8403f() < f) {
                    f = aVar.mo8403f();
                }
                i++;
            } while (i < h0);
        }
        if (f >= 0) {
            z = true;
        }
        if (z) {
            return f;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public final boolean mo8396d() {
        return this.f6473a.mo15477m0();
    }

    /* renamed from: e */
    public final void mo8397e(@C12579k C2459a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "interval");
        this.f6473a.mo15495z0(aVar);
    }
}
