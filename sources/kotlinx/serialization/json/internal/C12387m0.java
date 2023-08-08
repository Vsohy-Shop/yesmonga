package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12202b;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.m0 */
public final class C12387m0 {
    @C12579k
    /* renamed from: a */
    public static final C12217f m50099a(@C12579k C12217f fVar, @C12579k C12434e eVar) {
        C12217f a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "module");
        if (Intrinsics.areEqual((Object) fVar.getKind(), (Object) C12224h.C12225a.f30009a)) {
            C12217f c = C12202b.m48876c(eVar, fVar);
            if (c == null || (a = m50099a(c, eVar)) == null) {
                return fVar;
            }
            return a;
        } else if (fVar.isInline()) {
            return m50099a(fVar.mo24827g(0), eVar);
        } else {
            return fVar;
        }
    }

    /* renamed from: b */
    public static final <T, R1 extends T, R2 extends T> T m50100b(@C12579k C12341a aVar, @C12579k C12217f fVar, @C12579k C11289a<? extends R1> aVar2, @C12579k C11289a<? extends R2> aVar3) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "mapDescriptor");
        Intrinsics.checkNotNullParameter(aVar2, "ifMap");
        Intrinsics.checkNotNullParameter(aVar3, "ifList");
        C12217f a = m50099a(fVar.mo24827g(0), aVar.mo25277a());
        C12224h kind = a.getKind();
        if ((kind instanceof C12207e) || Intrinsics.areEqual((Object) kind, (Object) C12224h.C12226b.f30010a)) {
            return aVar2.invoke();
        }
        if (aVar.mo25282h().mo25358b()) {
            return aVar3.invoke();
        }
        throw C12388n.m50105d(a);
    }

    @C12579k
    /* renamed from: c */
    public static final WriteMode m50101c(@C12579k C12341a aVar, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "desc");
        C12224h kind = fVar.getKind();
        if (kind instanceof C12204d) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12229b.f30012a)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual((Object) kind, (Object) C12227i.C12230c.f30013a)) {
            return WriteMode.OBJ;
        }
        C12217f a = m50099a(fVar.mo24827g(0), aVar.mo25277a());
        C12224h kind2 = a.getKind();
        if ((kind2 instanceof C12207e) || Intrinsics.areEqual((Object) kind2, (Object) C12224h.C12226b.f30010a)) {
            return WriteMode.MAP;
        }
        if (aVar.mo25282h().mo25358b()) {
            return WriteMode.LIST;
        }
        throw C12388n.m50105d(a);
    }
}
