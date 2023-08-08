package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
/* renamed from: kotlinx.coroutines.b0 */
public final class C11716b0 {
    @C12580l
    @C11287e

    /* renamed from: a */
    public final Object f29052a;
    @C12580l
    @C11287e

    /* renamed from: b */
    public final C12060m f29053b;
    @C12580l
    @C11287e

    /* renamed from: c */
    public final C11300l<Throwable, C11079d2> f29054c;
    @C12580l
    @C11287e

    /* renamed from: d */
    public final Object f29055d;
    @C12580l
    @C11287e

    /* renamed from: e */
    public final Throwable f29056e;

    public C11716b0(@C12580l Object obj, @C12580l C12060m mVar, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12580l Object obj2, @C12580l Throwable th) {
        this.f29052a = obj;
        this.f29053b = mVar;
        this.f29054c = lVar;
        this.f29055d = obj2;
        this.f29056e = th;
    }

    /* renamed from: g */
    public static /* synthetic */ C11716b0 m46135g(C11716b0 b0Var, Object obj, C12060m mVar, C11300l<Throwable, C11079d2> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = b0Var.f29052a;
        }
        if ((i & 2) != 0) {
            mVar = b0Var.f29053b;
        }
        C12060m mVar2 = mVar;
        if ((i & 4) != 0) {
            lVar = b0Var.f29054c;
        }
        C11300l<Throwable, C11079d2> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = b0Var.f29055d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = b0Var.f29056e;
        }
        return b0Var.mo23739f(obj, mVar2, lVar2, obj4, th);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo23733a() {
        return this.f29052a;
    }

    @C12580l
    /* renamed from: b */
    public final C12060m mo23734b() {
        return this.f29053b;
    }

    @C12580l
    /* renamed from: c */
    public final C11300l<Throwable, C11079d2> mo23735c() {
        return this.f29054c;
    }

    @C12580l
    /* renamed from: d */
    public final Object mo23736d() {
        return this.f29055d;
    }

    @C12580l
    /* renamed from: e */
    public final Throwable mo23737e() {
        return this.f29056e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11716b0)) {
            return false;
        }
        C11716b0 b0Var = (C11716b0) obj;
        return Intrinsics.areEqual(this.f29052a, b0Var.f29052a) && Intrinsics.areEqual((Object) this.f29053b, (Object) b0Var.f29053b) && Intrinsics.areEqual((Object) this.f29054c, (Object) b0Var.f29054c) && Intrinsics.areEqual(this.f29055d, b0Var.f29055d) && Intrinsics.areEqual((Object) this.f29056e, (Object) b0Var.f29056e);
    }

    @C12579k
    /* renamed from: f */
    public final C11716b0 mo23739f(@C12580l Object obj, @C12580l C12060m mVar, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12580l Object obj2, @C12580l Throwable th) {
        return new C11716b0(obj, mVar, lVar, obj2, th);
    }

    /* renamed from: h */
    public final boolean mo23740h() {
        return this.f29056e != null;
    }

    public int hashCode() {
        Object obj = this.f29052a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C12060m mVar = this.f29053b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        C11300l<Throwable, C11079d2> lVar = this.f29054c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f29055d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f29056e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final void mo23742i(@C12579k C12078p<?> pVar, @C12579k Throwable th) {
        C12060m mVar = this.f29053b;
        if (mVar != null) {
            pVar.mo24562n(mVar, th);
        }
        C11300l<Throwable, C11079d2> lVar = this.f29054c;
        if (lVar != null) {
            pVar.mo24564q(lVar, th);
        }
    }

    @C12579k
    public String toString() {
        return "CompletedContinuation(result=" + this.f29052a + ", cancelHandler=" + this.f29053b + ", onCancellation=" + this.f29054c + ", idempotentResume=" + this.f29055d + ", cancelCause=" + this.f29056e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11716b0(Object obj, C12060m mVar, C11300l lVar, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : mVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
