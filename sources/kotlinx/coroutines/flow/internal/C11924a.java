package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.internal.C11926c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.a */
public abstract class C11924a<S extends C11926c<?>> {
    @C12580l

    /* renamed from: a */
    public S[] f29506a;

    /* renamed from: b */
    public int f29507b;

    /* renamed from: c */
    public int f29508c;
    @C12580l

    /* renamed from: d */
    public C11939o f29509d;

    @C12579k
    /* renamed from: b */
    public final C11952u<Integer> mo24259b() {
        C11939o oVar;
        synchronized (this) {
            oVar = this.f29509d;
            if (oVar == null) {
                oVar = new C11939o(this.f29507b);
                this.f29509d = oVar;
            }
        }
        return oVar;
    }

    @C12579k
    /* renamed from: i */
    public final S mo24260i() {
        S s;
        C11939o oVar;
        synchronized (this) {
            S[] sArr = this.f29506a;
            if (sArr == null) {
                sArr = mo24206k(2);
                this.f29506a = sArr;
            } else if (this.f29507b >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f29506a = (C11926c[]) copyOf;
                sArr = (C11926c[]) copyOf;
            }
            int i = this.f29508c;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo24205j();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                Intrinsics.checkNotNull(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s.mo24265a(this));
            this.f29508c = i;
            this.f29507b++;
            oVar = this.f29509d;
        }
        if (oVar != null) {
            oVar.mo24268e0(1);
        }
        return s;
    }

    @C12579k
    /* renamed from: j */
    public abstract S mo24205j();

    @C12579k
    /* renamed from: k */
    public abstract S[] mo24206k(int i);

    /* renamed from: l */
    public final void mo24261l(@C12579k C11300l<? super S, C11079d2> lVar) {
        C11926c[] h;
        if (this.f29507b != 0 && (h = this.f29506a) != null) {
            for (C11926c cVar : h) {
                if (cVar != null) {
                    lVar.invoke(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo24262m(@C12579k S s) {
        C11939o oVar;
        int i;
        C11045c[] b;
        synchronized (this) {
            int i2 = this.f29507b - 1;
            this.f29507b = i2;
            oVar = this.f29509d;
            if (i2 == 0) {
                this.f29508c = 0;
            }
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b = s.mo24266b(this);
        }
        for (C11045c cVar : b) {
            if (cVar != null) {
                Result.C10852a aVar = Result.f28060a;
                cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
        }
        if (oVar != null) {
            oVar.mo24268e0(-1);
        }
    }

    /* renamed from: n */
    public final int mo24263n() {
        return this.f29507b;
    }

    @C12580l
    /* renamed from: o */
    public final S[] mo24264o() {
        return this.f29506a;
    }
}
