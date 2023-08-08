package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.n */
public final class C12407n {

    /* renamed from: kotlinx.serialization.json.n$a */
    public static final class C12408a implements C12217f {
        @C12579k

        /* renamed from: a */
        public final C11677z f30346a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C12217f> f30347b;

        public C12408a(C11289a<? extends C12217f> aVar) {
            this.f30347b = aVar;
            this.f30346a = C10864b0.m38748c(aVar);
        }

        /* renamed from: a */
        public final C12217f mo25550a() {
            return (C12217f) this.f30346a.getValue();
        }

        /* renamed from: b */
        public boolean mo24821b() {
            return C12217f.C12218a.m48902h(this);
        }

        /* renamed from: c */
        public int mo24822c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return mo25550a().mo24822c(str);
        }

        /* renamed from: d */
        public int mo24823d() {
            return mo25550a().mo24823d();
        }

        @C12579k
        /* renamed from: e */
        public String mo24824e(int i) {
            return mo25550a().mo24824e(i);
        }

        @C12579k
        /* renamed from: f */
        public List<Annotation> mo24826f(int i) {
            return mo25550a().mo24826f(i);
        }

        @C12579k
        /* renamed from: g */
        public C12217f mo24827g(int i) {
            return mo25550a().mo24827g(i);
        }

        @C12579k
        public List<Annotation> getAnnotations() {
            return C12217f.C12218a.m48895a(this);
        }

        @C12579k
        public C12224h getKind() {
            return mo25550a().getKind();
        }

        @C12579k
        /* renamed from: h */
        public String mo24830h() {
            return mo25550a().mo24830h();
        }

        /* renamed from: i */
        public boolean mo24832i(int i) {
            return mo25550a().mo24832i(i);
        }

        public boolean isInline() {
            return C12217f.C12218a.m48900f(this);
        }
    }

    @C12579k
    /* renamed from: d */
    public static final C12356i m50189d(@C12579k C12241e eVar) {
        C12356i iVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof C12356i) {
            iVar = (C12356i) eVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", C11342l0.m43547d(eVar.getClass())));
    }

    @C12579k
    /* renamed from: e */
    public static final C12409o m50190e(@C12579k C12244g gVar) {
        C12409o oVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof C12409o) {
            oVar = (C12409o) gVar;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", C11342l0.m43547d(gVar.getClass())));
    }

    /* renamed from: f */
    public static final C12217f m50191f(C11289a<? extends C12217f> aVar) {
        return new C12408a(aVar);
    }

    /* renamed from: g */
    public static final void m50192g(C12241e eVar) {
        m50189d(eVar);
    }

    /* renamed from: h */
    public static final void m50193h(C12244g gVar) {
        m50190e(gVar);
    }
}
