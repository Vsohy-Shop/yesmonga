package kotlinx.serialization.json;

import kotlin.C11588t1;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11627y;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.json.internal.C12388n;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.s */
public final class C12414s implements C12248g<C12413r> {
    @C12579k

    /* renamed from: a */
    public static final C12414s f30352a = new C12414s();
    @C12579k

    /* renamed from: b */
    public static final C12217f f30353b = SerialDescriptorsKt.m48841a("kotlinx.serialization.json.JsonLiteral", C12207e.C12216i.f30002a);

    @C12579k
    /* renamed from: a */
    public C12413r deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12403k g = C12407n.m50189d(eVar).mo25373g();
        if (g instanceof C12413r) {
            return (C12413r) g;
        }
        throw C12388n.m50107f(-1, Intrinsics.stringPlus("Unexpected JSON element, expected JsonLiteral, had ", C11342l0.m43547d(g.getClass())), g.toString());
    }

    /* renamed from: b */
    public void serialize(@C12579k C12244g gVar, @C12579k C12413r rVar) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(rVar, "value");
        C12407n.m50193h(gVar);
        if (rVar.mo25232h()) {
            gVar.mo24903H(rVar.mo25231e());
            return;
        }
        Long s = C12406m.m50184s(rVar);
        if (s == null) {
            C11588t1 o = C11627y.m45388o(rVar.mo25231e());
            if (o == null) {
                Double i = C12406m.m50174i(rVar);
                if (i == null) {
                    Boolean f = C12406m.m50171f(rVar);
                    if (f == null) {
                        gVar.mo24903H(rVar.mo25231e());
                    } else {
                        gVar.mo24922s(f.booleanValue());
                    }
                } else {
                    gVar.mo24910g(i.doubleValue());
                }
            } else {
                gVar.mo24916m(C12197a.m48821u(C11588t1.f28778b).getDescriptor()).mo24917n(o.mo23301j2());
            }
        } else {
            gVar.mo24917n(s.longValue());
        }
    }

    @C12579k
    public C12217f getDescriptor() {
        return f30353b;
    }
}
