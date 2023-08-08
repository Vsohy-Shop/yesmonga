package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.o */
public interface C12409o extends C12244g, C12239d {

    /* renamed from: kotlinx.serialization.json.o$a */
    public static final class C12410a {
        @C12579k
        /* renamed from: a */
        public static C12239d m50205a(@C12579k C12409o oVar, @C12579k C12217f fVar, int i) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return C12244g.C12245a.m49060a(oVar, fVar, i);
        }

        @C12200d
        /* renamed from: b */
        public static void m50206b(@C12579k C12409o oVar) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            C12244g.C12245a.m49061b(oVar);
        }

        @C12200d
        /* renamed from: c */
        public static <T> void m50207c(@C12579k C12409o oVar, @C12579k C12440p<? super T> pVar, @C12580l T t) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(pVar, "serializer");
            C12244g.C12245a.m49062c(oVar, pVar, t);
        }

        /* renamed from: d */
        public static <T> void m50208d(@C12579k C12409o oVar, @C12579k C12440p<? super T> pVar, T t) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(pVar, "serializer");
            C12244g.C12245a.m49063d(oVar, pVar, t);
        }

        @C12200d
        /* renamed from: e */
        public static boolean m50209e(@C12579k C12409o oVar, @C12579k C12217f fVar, int i) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return C12239d.C12240a.m49021a(oVar, fVar, i);
        }
    }

    /* renamed from: B */
    void mo25374B(@C12579k C12403k kVar);

    @C12579k
    /* renamed from: d */
    C12341a mo25375d();
}
