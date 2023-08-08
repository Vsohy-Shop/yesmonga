package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.selects.h */
public final class C12129h<P, Q> implements C12128g<P, Q> {
    @C12579k

    /* renamed from: a */
    public final Object f29890a;
    @C12579k

    /* renamed from: b */
    public final C11305q<Object, C12131j<?>, Object, C11079d2> f29891b;
    @C12579k

    /* renamed from: c */
    public final C11305q<Object, Object, Object, Object> f29892c;
    @C12580l

    /* renamed from: d */
    public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29893d;

    public C12129h(@C12579k Object obj, @C12579k C11305q<Object, ? super C12131j<?>, Object, C11079d2> qVar, @C12579k C11305q<Object, Object, Object, ? extends Object> qVar2, @C12580l C11305q<? super C12131j<?>, Object, Object, ? extends C11300l<? super Throwable, C11079d2>> qVar3) {
        this.f29890a = obj;
        this.f29891b = qVar;
        this.f29892c = qVar2;
        this.f29893d = qVar3;
    }

    @C12579k
    /* renamed from: a */
    public C11305q<Object, C12131j<?>, Object, C11079d2> mo24728a() {
        return this.f29891b;
    }

    @C12580l
    /* renamed from: b */
    public C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> mo24729b() {
        return this.f29893d;
    }

    @C12579k
    /* renamed from: c */
    public C11305q<Object, Object, Object, Object> mo24730c() {
        return this.f29892c;
    }

    @C12579k
    /* renamed from: d */
    public Object mo24731d() {
        return this.f29890a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12129h(Object obj, C11305q qVar, C11305q qVar2, C11305q qVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, qVar2, (i & 8) != 0 ? null : qVar3);
    }
}
