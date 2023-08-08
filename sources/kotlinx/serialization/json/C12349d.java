package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12441q;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C12441q(forClass = C12344b.class)
@C11532s0
/* renamed from: kotlinx.serialization.json.d */
public final class C12349d implements C12248g<C12344b> {
    @C12579k

    /* renamed from: a */
    public static final C12349d f30182a = new C12349d();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30183b = C12350a.f30184b;

    /* renamed from: kotlinx.serialization.json.d$a */
    public static final class C12350a implements C12217f {
        @C12579k

        /* renamed from: b */
        public static final C12350a f30184b = new C12350a();
        @C12579k

        /* renamed from: c */
        public static final String f30185c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a */
        public final /* synthetic */ C12217f f30186a = C12197a.m48809i(JsonElementSerializer.f30161a).getDescriptor();

        @C12200d
        /* renamed from: a */
        public static /* synthetic */ void m49715a() {
        }

        /* renamed from: b */
        public boolean mo24821b() {
            return this.f30186a.mo24821b();
        }

        @C12200d
        /* renamed from: c */
        public int mo24822c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return this.f30186a.mo24822c(str);
        }

        /* renamed from: d */
        public int mo24823d() {
            return this.f30186a.mo24823d();
        }

        @C12200d
        @C12579k
        /* renamed from: e */
        public String mo24824e(int i) {
            return this.f30186a.mo24824e(i);
        }

        @C12200d
        @C12579k
        /* renamed from: f */
        public List<Annotation> mo24826f(int i) {
            return this.f30186a.mo24826f(i);
        }

        @C12200d
        @C12579k
        /* renamed from: g */
        public C12217f mo24827g(int i) {
            return this.f30186a.mo24827g(i);
        }

        @C12579k
        public List<Annotation> getAnnotations() {
            return this.f30186a.getAnnotations();
        }

        @C12579k
        public C12224h getKind() {
            return this.f30186a.getKind();
        }

        @C12579k
        /* renamed from: h */
        public String mo24830h() {
            return f30185c;
        }

        @C12200d
        /* renamed from: i */
        public boolean mo24832i(int i) {
            return this.f30186a.mo24832i(i);
        }

        public boolean isInline() {
            return this.f30186a.isInline();
        }
    }

    @C12579k
    /* renamed from: a */
    public C12344b deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12407n.m50192g(eVar);
        return new C12344b((List) C12197a.m48809i(JsonElementSerializer.f30161a).deserialize(eVar));
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k C12344b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bVar, "value");
        C12407n.m50193h(gVar);
        C12197a.m48809i(JsonElementSerializer.f30161a).serialize(gVar, bVar);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30183b;
    }
}
