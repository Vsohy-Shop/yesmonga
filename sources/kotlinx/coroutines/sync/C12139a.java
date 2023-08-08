package kotlinx.coroutines.sync;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlinx.coroutines.selects.C12128g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.sync.a */
public interface C12139a {

    /* renamed from: kotlinx.coroutines.sync.a$a */
    public static final class C12140a {
        @C11395k(level = DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        /* renamed from: a */
        public static /* synthetic */ void m48647a() {
        }

        /* renamed from: b */
        public static /* synthetic */ Object m48648b(C12139a aVar, Object obj, C11045c cVar, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return aVar.mo24739f(obj, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m48649c(C12139a aVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return aVar.mo24737c(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: d */
        public static /* synthetic */ void m48650d(C12139a aVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                aVar.mo24740g(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    /* renamed from: c */
    boolean mo24737c(@C12580l Object obj);

    /* renamed from: d */
    boolean mo24738d();

    @C12580l
    /* renamed from: f */
    Object mo24739f(@C12580l Object obj, @C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: g */
    void mo24740g(@C12580l Object obj);

    /* renamed from: h */
    boolean mo24741h(@C12579k Object obj);

    @C12579k
    /* renamed from: i */
    C12128g<Object, C12139a> mo24742i();
}
