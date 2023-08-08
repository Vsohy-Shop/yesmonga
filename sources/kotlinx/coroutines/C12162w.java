package kotlinx.coroutines;

import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@C12177y1
/* renamed from: kotlinx.coroutines.w */
public interface C12162w extends C11723c2 {

    /* renamed from: kotlinx.coroutines.w$a */
    public static final class C12163a {
        /* renamed from: b */
        public static <R> R m48725b(@C12579k C12162w wVar, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11723c2.C11724a.m46186d(wVar, r, pVar);
        }

        @C12580l
        /* renamed from: c */
        public static <E extends CoroutineContext.C11040a> E m48726c(@C12579k C12162w wVar, @C12579k CoroutineContext.C11042b<E> bVar) {
            return C11723c2.C11724a.m46187e(wVar, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m48727d(@C12579k C12162w wVar, @C12579k CoroutineContext.C11042b<?> bVar) {
            return C11723c2.C11724a.m46190h(wVar, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static CoroutineContext m48728e(@C12579k C12162w wVar, @C12579k CoroutineContext coroutineContext) {
            return C11723c2.C11724a.m46191i(wVar, coroutineContext);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @C12579k
        /* renamed from: f */
        public static C11723c2 m48729f(@C12579k C12162w wVar, @C12579k C11723c2 c2Var) {
            return C11723c2.C11724a.m46192j(wVar, c2Var);
        }
    }

    @C12177y1
    /* renamed from: x */
    void mo23660x(@C12579k C12096s2 s2Var);
}
