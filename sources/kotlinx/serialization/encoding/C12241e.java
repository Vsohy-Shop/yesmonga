package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.encoding.e */
public interface C12241e {

    /* renamed from: kotlinx.serialization.encoding.e$a */
    public static final class C12242a {
        @C12580l
        @C12200d
        /* renamed from: a */
        public static <T> T m49039a(@C12579k C12241e eVar, @C12579k C12199c<T> cVar) {
            Intrinsics.checkNotNullParameter(eVar, "this");
            Intrinsics.checkNotNullParameter(cVar, "deserializer");
            if (cVar.getDescriptor().mo24821b() || eVar.mo24867D()) {
                return eVar.mo24870G(cVar);
            }
            return eVar.mo24881j();
        }

        /* renamed from: b */
        public static <T> T m49040b(@C12579k C12241e eVar, @C12579k C12199c<T> cVar) {
            Intrinsics.checkNotNullParameter(eVar, "this");
            Intrinsics.checkNotNullParameter(cVar, "deserializer");
            return cVar.deserialize(eVar);
        }
    }

    @C12200d
    /* renamed from: D */
    boolean mo24867D();

    /* renamed from: G */
    <T> T mo24870G(@C12579k C12199c<T> cVar);

    /* renamed from: H */
    byte mo24871H();

    @C12580l
    @C12200d
    /* renamed from: I */
    <T> T mo24872I(@C12579k C12199c<T> cVar);

    @C12579k
    /* renamed from: a */
    C12434e mo24933a();

    @C12579k
    /* renamed from: b */
    C12236c mo24875b(@C12579k C12217f fVar);

    /* renamed from: e */
    int mo24877e(@C12579k C12217f fVar);

    /* renamed from: h */
    int mo24879h();

    @C12580l
    @C12200d
    /* renamed from: j */
    Void mo24881j();

    /* renamed from: l */
    long mo24883l();

    @C12200d
    @C12579k
    /* renamed from: q */
    C12241e mo24887q(@C12579k C12217f fVar);

    /* renamed from: s */
    short mo24889s();

    /* renamed from: t */
    float mo24890t();

    /* renamed from: v */
    double mo24892v();

    /* renamed from: w */
    boolean mo24893w();

    /* renamed from: x */
    char mo24894x();

    @C12579k
    /* renamed from: z */
    String mo24896z();
}
