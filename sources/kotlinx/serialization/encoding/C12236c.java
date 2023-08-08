package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.encoding.c */
public interface C12236c {
    @C12579k

    /* renamed from: a */
    public static final C12237a f30017a = C12237a.f30020a;

    /* renamed from: b */
    public static final int f30018b = -1;

    /* renamed from: c */
    public static final int f30019c = -3;

    /* renamed from: kotlinx.serialization.encoding.c$a */
    public static final class C12237a {

        /* renamed from: a */
        public static final /* synthetic */ C12237a f30020a = new C12237a();

        /* renamed from: b */
        public static final int f30021b = -1;

        /* renamed from: c */
        public static final int f30022c = -3;
    }

    /* renamed from: kotlinx.serialization.encoding.c$b */
    public static final class C12238b {
        /* renamed from: a */
        public static int m49002a(@C12579k C12236c cVar, @C12579k C12217f fVar) {
            Intrinsics.checkNotNullParameter(cVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static /* synthetic */ Object m49003b(C12236c cVar, C12217f fVar, int i, C12199c cVar2, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return cVar.mo24885n(fVar, i, cVar2, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
        }

        @C12200d
        /* renamed from: c */
        public static boolean m49004c(@C12579k C12236c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "this");
            return false;
        }

        /* renamed from: d */
        public static /* synthetic */ Object m49005d(C12236c cVar, C12217f fVar, int i, C12199c cVar2, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return cVar.mo24895y(fVar, i, cVar2, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    /* renamed from: A */
    char mo24864A(@C12579k C12217f fVar, int i);

    /* renamed from: B */
    byte mo24865B(@C12579k C12217f fVar, int i);

    /* renamed from: C */
    boolean mo24866C(@C12579k C12217f fVar, int i);

    /* renamed from: E */
    short mo24868E(@C12579k C12217f fVar, int i);

    /* renamed from: F */
    double mo24869F(@C12579k C12217f fVar, int i);

    @C12579k
    /* renamed from: a */
    C12434e mo24930a();

    /* renamed from: c */
    void mo24876c(@C12579k C12217f fVar);

    /* renamed from: f */
    long mo24878f(@C12579k C12217f fVar, int i);

    /* renamed from: i */
    int mo24880i(@C12579k C12217f fVar, int i);

    /* renamed from: k */
    int mo24882k(@C12579k C12217f fVar);

    @C12579k
    /* renamed from: m */
    String mo24884m(@C12579k C12217f fVar, int i);

    @C12580l
    @C12200d
    /* renamed from: n */
    <T> T mo24885n(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t);

    /* renamed from: o */
    int mo24931o(@C12579k C12217f fVar);

    @C12200d
    /* renamed from: p */
    boolean mo24886p();

    @C12200d
    @C12579k
    /* renamed from: r */
    C12241e mo24888r(@C12579k C12217f fVar, int i);

    /* renamed from: u */
    float mo24891u(@C12579k C12217f fVar, int i);

    /* renamed from: y */
    <T> T mo24895y(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t);
}
