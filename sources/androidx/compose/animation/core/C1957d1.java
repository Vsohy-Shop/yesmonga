package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.d1 */
public final class C1957d1 {

    /* renamed from: a */
    public static final int f5472a = Integer.MAX_VALUE;

    @C11363r0({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1549#2:814\n1620#2,3:815\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1\n*L\n671#1:814\n671#1:815,3\n*E\n"})
    /* renamed from: androidx.compose.animation.core.d1$a */
    public static final class C1958a implements C2003q {
        @C12579k

        /* renamed from: a */
        public final List<C1977i0> f5473a;

        public C1958a(V v, float f, float f2) {
            C11466l W1 = C11479u.m44378W1(0, v.mo6867b());
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1977i0(f, f2, v.mo6866a(((C10953k0) it).mo6374c())));
            }
            this.f5473a = arrayList;
        }

        @C12579k
        /* renamed from: a */
        public C1977i0 get(int i) {
            return this.f5473a.get(i);
        }
    }

    /* renamed from: androidx.compose.animation.core.d1$b */
    public static final class C1959b implements C2003q {
        @C12579k

        /* renamed from: a */
        public final C1977i0 f5474a;

        public C1959b(float f, float f2) {
            this.f5474a = new C1977i0(f, f2, 0.0f, 4, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: a */
        public C1977i0 get(int i) {
            return this.f5474a;
        }
    }

    /* renamed from: c */
    public static final long m8315c(C1966f1<?> f1Var, long j) {
        return C11479u.m44340K(j - ((long) f1Var.mo6843e()), 0, (long) f1Var.mo6844g());
    }

    /* renamed from: d */
    public static final <V extends C1997o> C2003q m8316d(V v, float f, float f2) {
        if (v != null) {
            return new C1958a(v, f, f2);
        }
        return new C1959b(f, f2);
    }

    /* renamed from: e */
    public static final <V extends C1997o> long m8317e(@C12579k C1953c1<V> c1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return c1Var.mo6802b(v, v2, v3) / 1000000;
    }

    @C12579k
    /* renamed from: f */
    public static final <V extends C1997o> V m8318f(@C12579k C1953c1<V> c1Var, long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(v, "start");
        Intrinsics.checkNotNullParameter(v2, "end");
        Intrinsics.checkNotNullParameter(v3, "startVelocity");
        return c1Var.mo6805m(j * 1000000, v, v2, v3);
    }
}
