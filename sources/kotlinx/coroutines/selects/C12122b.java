package kotlinx.coroutines.selects;

import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11112h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12095s1;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.selects.b */
public interface C12122b<R> {

    /* renamed from: kotlinx.coroutines.selects.b$a */
    public static final class C12123a {
        /* renamed from: a */
        public static <R, P, Q> void m48528a(@C12579k C12122b<? super R> bVar, @C12579k C12128g<? super P, ? extends Q> gVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar) {
            bVar.mo24705c(gVar, null, pVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @C11587t0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @C12095s1
        @C11112h
        /* renamed from: b */
        public static <R> void m48529b(@C12579k C12122b<? super R> bVar, long j, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
            C12121a.m48521a(bVar, j, lVar);
        }
    }

    /* renamed from: a */
    void mo24704a(@C12579k C12124c cVar, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar);

    /* renamed from: c */
    <P, Q> void mo24705c(@C12579k C12128g<? super P, ? extends Q> gVar, P p, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar);

    @C11395k(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @C11587t0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @C12095s1
    @C11112h
    /* renamed from: d */
    void mo24706d(long j, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar);

    /* renamed from: g */
    <P, Q> void mo24709g(@C12579k C12128g<? super P, ? extends Q> gVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar);

    /* renamed from: i */
    <Q> void mo24712i(@C12579k C12126e<? extends Q> eVar, @C12579k C11304p<? super Q, ? super C11045c<? super R>, ? extends Object> pVar);
}
