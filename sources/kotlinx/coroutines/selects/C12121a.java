package kotlinx.coroutines.selects;

import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.selects.a */
public final class C12121a {
    @C12095s1
    /* renamed from: a */
    public static final <R> void m48521a(@C12579k C12122b<? super R> bVar, long j, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        bVar.mo24704a(new OnTimeout(j).mo24686b(), lVar);
    }

    @C12095s1
    /* renamed from: b */
    public static final <R> void m48522b(@C12579k C12122b<? super R> bVar, long j, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        m48521a(bVar, DelayKt.m45928e(j), lVar);
    }
}
