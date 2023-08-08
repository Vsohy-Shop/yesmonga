package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.i */
public interface C12356i extends C12241e, C12236c {

    /* renamed from: kotlinx.serialization.json.i$a */
    public static final class C12357a {
        /* renamed from: a */
        public static int m49771a(@C12579k C12356i iVar, @C12579k C12217f fVar) {
            Intrinsics.checkNotNullParameter(iVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return C12236c.C12238b.m49002a(iVar, fVar);
        }

        @C12580l
        @C12200d
        /* renamed from: b */
        public static <T> T m49772b(@C12579k C12356i iVar, @C12579k C12199c<T> cVar) {
            Intrinsics.checkNotNullParameter(iVar, "this");
            Intrinsics.checkNotNullParameter(cVar, "deserializer");
            return C12241e.C12242a.m49039a(iVar, cVar);
        }

        @C12200d
        /* renamed from: c */
        public static boolean m49773c(@C12579k C12356i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "this");
            return C12236c.C12238b.m49004c(iVar);
        }

        /* renamed from: d */
        public static <T> T m49774d(@C12579k C12356i iVar, @C12579k C12199c<T> cVar) {
            Intrinsics.checkNotNullParameter(iVar, "this");
            Intrinsics.checkNotNullParameter(cVar, "deserializer");
            return C12241e.C12242a.m49040b(iVar, cVar);
        }
    }

    @C12579k
    /* renamed from: d */
    C12341a mo25372d();

    @C12579k
    /* renamed from: g */
    C12403k mo25373g();
}
