package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.selects.f */
public final class C12127f<Q> implements C12126e<Q> {
    @C12579k

    /* renamed from: a */
    public final Object f29886a;
    @C12579k

    /* renamed from: b */
    public final C11305q<Object, C12131j<?>, Object, C11079d2> f29887b;
    @C12579k

    /* renamed from: c */
    public final C11305q<Object, Object, Object, Object> f29888c;
    @C12580l

    /* renamed from: d */
    public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29889d;

    public C12127f(@C12579k Object obj, @C12579k C11305q<Object, ? super C12131j<?>, Object, C11079d2> qVar, @C12579k C11305q<Object, Object, Object, ? extends Object> qVar2, @C12580l C11305q<? super C12131j<?>, Object, Object, ? extends C11300l<? super Throwable, C11079d2>> qVar3) {
        this.f29886a = obj;
        this.f29887b = qVar;
        this.f29888c = qVar2;
        this.f29889d = qVar3;
    }

    @C12579k
    /* renamed from: a */
    public C11305q<Object, C12131j<?>, Object, C11079d2> mo24728a() {
        return this.f29887b;
    }

    @C12580l
    /* renamed from: b */
    public C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> mo24729b() {
        return this.f29889d;
    }

    @C12579k
    /* renamed from: c */
    public C11305q<Object, Object, Object, Object> mo24730c() {
        return this.f29888c;
    }

    @C12579k
    /* renamed from: d */
    public Object mo24731d() {
        return this.f29886a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12127f(Object obj, C11305q qVar, C11305q qVar2, C11305q qVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, qVar2, (i & 8) != 0 ? null : qVar3);
    }
}
