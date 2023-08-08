package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.encoding.g */
public interface C12244g {

    /* renamed from: kotlinx.serialization.encoding.g$a */
    public static final class C12245a {
        @C12579k
        /* renamed from: a */
        public static C12239d m49060a(@C12579k C12244g gVar, @C12579k C12217f fVar, int i) {
            Intrinsics.checkNotNullParameter(gVar, "this");
            Intrinsics.checkNotNullParameter(fVar, "descriptor");
            return gVar.mo24906b(fVar);
        }

        @C12200d
        /* renamed from: b */
        public static void m49061b(@C12579k C12244g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "this");
        }

        @C12200d
        /* renamed from: c */
        public static <T> void m49062c(@C12579k C12244g gVar, @C12579k C12440p<? super T> pVar, @C12580l T t) {
            Intrinsics.checkNotNullParameter(gVar, "this");
            Intrinsics.checkNotNullParameter(pVar, "serializer");
            if (pVar.getDescriptor().mo24821b()) {
                gVar.mo24908e(pVar, t);
            } else if (t == null) {
                gVar.mo24919p();
            } else {
                gVar.mo24926w();
                gVar.mo24908e(pVar, t);
            }
        }

        /* renamed from: d */
        public static <T> void m49063d(@C12579k C12244g gVar, @C12579k C12440p<? super T> pVar, T t) {
            Intrinsics.checkNotNullParameter(gVar, "this");
            Intrinsics.checkNotNullParameter(pVar, "serializer");
            pVar.serialize(gVar, t);
        }
    }

    /* renamed from: C */
    void mo24898C(int i);

    /* renamed from: H */
    void mo24903H(@C12579k String str);

    @C12579k
    /* renamed from: a */
    C12434e mo24934a();

    @C12579k
    /* renamed from: b */
    C12239d mo24906b(@C12579k C12217f fVar);

    /* renamed from: e */
    <T> void mo24908e(@C12579k C12440p<? super T> pVar, T t);

    /* renamed from: g */
    void mo24910g(double d);

    /* renamed from: h */
    void mo24911h(byte b);

    @C12579k
    /* renamed from: j */
    C12239d mo24913j(@C12579k C12217f fVar, int i);

    /* renamed from: k */
    void mo24914k(@C12579k C12217f fVar, int i);

    @C12200d
    /* renamed from: l */
    <T> void mo24915l(@C12579k C12440p<? super T> pVar, @C12580l T t);

    @C12200d
    @C12579k
    /* renamed from: m */
    C12244g mo24916m(@C12579k C12217f fVar);

    /* renamed from: n */
    void mo24917n(long j);

    @C12200d
    /* renamed from: p */
    void mo24919p();

    /* renamed from: r */
    void mo24921r(short s);

    /* renamed from: s */
    void mo24922s(boolean z);

    /* renamed from: u */
    void mo24924u(float f);

    /* renamed from: v */
    void mo24925v(char c);

    @C12200d
    /* renamed from: w */
    void mo24926w();
}
