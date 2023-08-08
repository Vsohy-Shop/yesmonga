package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.selects.d */
public final class C12125d implements C12124c {
    @C12579k

    /* renamed from: a */
    public final Object f29882a;
    @C12579k

    /* renamed from: b */
    public final C11305q<Object, C12131j<?>, Object, C11079d2> f29883b;
    @C12580l

    /* renamed from: c */
    public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29884c;
    @C12579k

    /* renamed from: d */
    public final C11305q<Object, Object, Object, Object> f29885d;

    public C12125d(@C12579k Object obj, @C12579k C11305q<Object, ? super C12131j<?>, Object, C11079d2> qVar, @C12580l C11305q<? super C12131j<?>, Object, Object, ? extends C11300l<? super Throwable, C11079d2>> qVar2) {
        this.f29882a = obj;
        this.f29883b = qVar;
        this.f29884c = qVar2;
        this.f29885d = SelectKt.f29865a;
    }

    @C12579k
    /* renamed from: a */
    public C11305q<Object, C12131j<?>, Object, C11079d2> mo24728a() {
        return this.f29883b;
    }

    @C12580l
    /* renamed from: b */
    public C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> mo24729b() {
        return this.f29884c;
    }

    @C12579k
    /* renamed from: c */
    public C11305q<Object, Object, Object, Object> mo24730c() {
        return this.f29885d;
    }

    @C12579k
    /* renamed from: d */
    public Object mo24731d() {
        return this.f29882a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12125d(Object obj, C11305q qVar, C11305q qVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, (i & 4) != 0 ? null : qVar2);
    }
}
