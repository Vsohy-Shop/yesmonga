package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.encoding.d */
public interface C12239d {

    /* renamed from: kotlinx.serialization.encoding.d$a */
    public static final class C12240a {
        @C12200d
        /* renamed from: a */
        public static boolean m49021a(@C12579k C12239d dVar, @C12579k C12217f fVar, int i) {
            Intrinsics.checkNotNullParameter(dVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return true;
        }
    }

    @C12200d
    /* renamed from: A */
    boolean mo24897A(@C12579k C12217f fVar, int i);

    /* renamed from: D */
    <T> void mo24899D(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, T t);

    /* renamed from: E */
    void mo24900E(@C12579k C12217f fVar, int i, short s);

    /* renamed from: F */
    void mo24901F(@C12579k C12217f fVar, int i, double d);

    /* renamed from: G */
    void mo24902G(@C12579k C12217f fVar, int i, long j);

    @C12579k
    /* renamed from: a */
    C12434e mo24932a();

    /* renamed from: c */
    void mo24907c(@C12579k C12217f fVar);

    @C12200d
    @C12579k
    /* renamed from: f */
    C12244g mo24909f(@C12579k C12217f fVar, int i);

    @C12200d
    /* renamed from: i */
    <T> void mo24912i(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, @C12580l T t);

    /* renamed from: o */
    void mo24918o(@C12579k C12217f fVar, int i, char c);

    /* renamed from: q */
    void mo24920q(@C12579k C12217f fVar, int i, byte b);

    /* renamed from: t */
    void mo24923t(@C12579k C12217f fVar, int i, float f);

    /* renamed from: x */
    void mo24927x(@C12579k C12217f fVar, int i, int i2);

    /* renamed from: y */
    void mo24928y(@C12579k C12217f fVar, int i, boolean z);

    /* renamed from: z */
    void mo24929z(@C12579k C12217f fVar, int i, @C12579k String str);
}
