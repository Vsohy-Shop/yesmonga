package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.C11368t0;
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

@C12441q(forClass = JsonObject.class)
@C11532s0
/* renamed from: kotlinx.serialization.json.w */
public final class C12419w implements C12248g<JsonObject> {
    @C12579k

    /* renamed from: a */
    public static final C12419w f30358a = new C12419w();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30359b = C12420a.f30360b;

    /* renamed from: kotlinx.serialization.json.w$a */
    public static final class C12420a implements C12217f {
        @C12579k

        /* renamed from: b */
        public static final C12420a f30360b = new C12420a();
        @C12579k

        /* renamed from: c */
        public static final String f30361c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a */
        public final /* synthetic */ C12217f f30362a = C12197a.m48812l(C12197a.m48800F(C11368t0.f28504a), JsonElementSerializer.f30161a).getDescriptor();

        @C12200d
        /* renamed from: a */
        public static /* synthetic */ void m50225a() {
        }

        /* renamed from: b */
        public boolean mo24821b() {
            return this.f30362a.mo24821b();
        }

        @C12200d
        /* renamed from: c */
        public int mo24822c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            return this.f30362a.mo24822c(str);
        }

        /* renamed from: d */
        public int mo24823d() {
            return this.f30362a.mo24823d();
        }

        @C12200d
        @C12579k
        /* renamed from: e */
        public String mo24824e(int i) {
            return this.f30362a.mo24824e(i);
        }

        @C12200d
        @C12579k
        /* renamed from: f */
        public List<Annotation> mo24826f(int i) {
            return this.f30362a.mo24826f(i);
        }

        @C12200d
        @C12579k
        /* renamed from: g */
        public C12217f mo24827g(int i) {
            return this.f30362a.mo24827g(i);
        }

        @C12579k
        public List<Annotation> getAnnotations() {
            return this.f30362a.getAnnotations();
        }

        @C12579k
        public C12224h getKind() {
            return this.f30362a.getKind();
        }

        @C12579k
        /* renamed from: h */
        public String mo24830h() {
            return f30361c;
        }

        @C12200d
        /* renamed from: i */
        public boolean mo24832i(int i) {
            return this.f30362a.mo24832i(i);
        }

        public boolean isInline() {
            return this.f30362a.isInline();
        }
    }

    @C12579k
    /* renamed from: a */
    public JsonObject deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12407n.m50192g(eVar);
        return new JsonObject(C12197a.m48812l(C12197a.m48800F(C11368t0.f28504a), JsonElementSerializer.f30161a).deserialize(eVar));
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        C12407n.m50193h(gVar);
        C12197a.m48812l(C12197a.m48800F(C11368t0.f28504a), JsonElementSerializer.f30161a).serialize(gVar, jsonObject);
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30359b;
    }
}
