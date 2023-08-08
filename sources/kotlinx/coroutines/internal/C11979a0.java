package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.C12064m2;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.a0 */
public final class C11979a0 {
    @C12579k

    /* renamed from: a */
    public static final C11979a0 f29571a;

    /* renamed from: b */
    public static final boolean f29572b = C12016r0.m47949f(C11982b0.f29578a, true);
    @C12579k
    @C11287e

    /* renamed from: c */
    public static final C12064m2 f29573c;

    static {
        C11979a0 a0Var = new C11979a0();
        f29571a = a0Var;
        f29573c = a0Var.mo24332a();
    }

    /* renamed from: a */
    public final C12064m2 mo24332a() {
        List<C12033z> list;
        Object obj;
        C12064m2 f;
        Class cls = C12033z.class;
        try {
            if (f29572b) {
                list = C12004m.f29608a.mo24386d();
            } else {
                list = SequencesKt___SequencesKt.m44731c3(SequencesKt__SequencesKt.m44588e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c = ((C12033z) obj).mo23717c();
                    do {
                        Object next = it.next();
                        int c2 = ((C12033z) next).mo23717c();
                        if (c < c2) {
                            obj = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            C12033z zVar = (C12033z) obj;
            if (zVar == null || (f = C11982b0.m47784f(zVar, list)) == null) {
                return C11982b0.m47780b((Throwable) null, (String) null, 3, (Object) null);
            }
            return f;
        } catch (Throwable th) {
            return C11982b0.m47780b(th, (String) null, 2, (Object) null);
        }
    }
}
