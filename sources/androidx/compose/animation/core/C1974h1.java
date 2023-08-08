package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import java.util.Iterator;
import kotlin.collections.C10953k0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1855#2,2:814\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n804#1:814,2\n*E\n"})
/* renamed from: androidx.compose.animation.core.h1 */
public final class C1974h1<V extends C1997o> implements C1970g1<V> {

    /* renamed from: e */
    public static final int f5492e = 8;
    @C12579k

    /* renamed from: a */
    public final C2003q f5493a;

    /* renamed from: b */
    public V f5494b;

    /* renamed from: c */
    public V f5495c;

    /* renamed from: d */
    public V f5496d;

    /* renamed from: androidx.compose.animation.core.h1$a */
    public static final class C1975a implements C2003q {

        /* renamed from: a */
        public final /* synthetic */ C1961e0 f5497a;

        public C1975a(C1961e0 e0Var) {
            this.f5497a = e0Var;
        }

        @C12579k
        public C1961e0 get(int i) {
            return this.f5497a;
        }
    }

    public C1974h1(@C12579k C2003q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "anims");
        this.f5493a = qVar;
    }

    /* renamed from: b */
    public long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        Iterator it = C11479u.m44378W1(0, v.mo6867b()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int c = ((C10953k0) it).mo6374c();
            j = Math.max(j, this.f5493a.get(c).mo6816f(v.mo6866a(c), v2.mo6866a(c), v3.mo6866a(c)));
        }
        return j;
    }

    @C12579k
    /* renamed from: f */
    public V mo6803f(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        if (this.f5496d == null) {
            this.f5496d = C2000p.m8571g(v3);
        }
        V v4 = this.f5496d;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v4 = null;
        }
        int b = v4.mo6867b();
        for (int i = 0; i < b; i++) {
            V v5 = this.f5496d;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v5 = null;
            }
            v5.mo6870e(i, this.f5493a.get(i).mo6813c(v.mo6866a(i), v2.mo6866a(i), v3.mo6866a(i)));
        }
        V v6 = this.f5496d;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @C12579k
    /* renamed from: j */
    public V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        Intrinsics.checkNotNullParameter(v4, "initialValue");
        Intrinsics.checkNotNullParameter(v5, "targetValue");
        Intrinsics.checkNotNullParameter(v6, "initialVelocity");
        if (this.f5495c == null) {
            this.f5495c = C2000p.m8571g(v3);
        }
        V v7 = this.f5495c;
        if (v7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v7 = null;
        }
        int b = v7.mo6867b();
        for (int i = 0; i < b; i++) {
            V v8 = this.f5495c;
            if (v8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v8 = null;
            }
            v8.mo6870e(i, this.f5493a.get(i).mo6815e(j, v4.mo6866a(i), v5.mo6866a(i), v6.mo6866a(i)));
        }
        V v9 = this.f5495c;
        if (v9 != null) {
            return v9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @C12579k
    /* renamed from: m */
    public V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        Intrinsics.checkNotNullParameter(v4, "initialValue");
        Intrinsics.checkNotNullParameter(v5, "targetValue");
        Intrinsics.checkNotNullParameter(v6, "initialVelocity");
        if (this.f5494b == null) {
            this.f5494b = C2000p.m8571g(v);
        }
        V v7 = this.f5494b;
        if (v7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v7 = null;
        }
        int b = v7.mo6867b();
        for (int i = 0; i < b; i++) {
            V v8 = this.f5494b;
            if (v8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v8 = null;
            }
            v8.mo6870e(i, this.f5493a.get(i).mo6814d(j, v4.mo6866a(i), v5.mo6866a(i), v6.mo6866a(i)));
        }
        V v9 = this.f5494b;
        if (v9 != null) {
            return v9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1974h1(@C12579k C1961e0 e0Var) {
        this((C2003q) new C1975a(e0Var));
        Intrinsics.checkNotNullParameter(e0Var, "anim");
    }
}
