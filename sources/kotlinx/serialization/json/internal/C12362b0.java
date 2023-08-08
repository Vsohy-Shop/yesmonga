package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12250i;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.internal.C12256b;
import kotlinx.serialization.internal.C12282j0;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12352f;
import kotlinx.serialization.json.C12356i;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12406m;
import kotlinx.serialization.json.C12409o;
import kotlinx.serialization.json.C12421x;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.b0 */
public final class C12362b0 {
    /* renamed from: b */
    public static final void m49915b(@C12579k C12224h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "kind");
        if (hVar instanceof C12224h.C12226b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (hVar instanceof C12207e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        } else if (hVar instanceof C12204d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    @C12579k
    /* renamed from: c */
    public static final String m49916c(@C12579k C12217f fVar, @C12579k C12341a aVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "json");
        for (Annotation next : fVar.getAnnotations()) {
            if (next instanceof C12352f) {
                return ((C12352f) next).discriminator();
            }
        }
        return aVar.mo25282h().mo25359c();
    }

    /* renamed from: d */
    public static final <T> T m49917d(@C12579k C12356i iVar, @C12579k C12199c<T> cVar) {
        C12421x q;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        if (!(cVar instanceof C12256b) || iVar.mo25372d().mo25282h().mo25367m()) {
            return cVar.deserialize(iVar);
        }
        C12403k g = iVar.mo25373g();
        C12217f descriptor = cVar.getDescriptor();
        if (g instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) g;
            String c = m49916c(cVar.getDescriptor(), iVar.mo25372d());
            C12403k kVar = (C12403k) jsonObject.get(c);
            String str = null;
            if (!(kVar == null || (q = C12406m.m50182q(kVar)) == null)) {
                str = q.mo25231e();
            }
            C12199c b = ((C12256b) cVar).mo24811b(iVar, str);
            if (b != null) {
                return C12385l0.m50092b(iVar.mo25372d(), c, jsonObject, b);
            }
            m49919f(str, jsonObject);
            throw new KotlinNothingValueException();
        }
        throw C12388n.m50106e(-1, "Expected " + C11342l0.m43547d(JsonObject.class) + " as the serialized body of " + descriptor.mo24830h() + ", but had " + C11342l0.m43547d(g.getClass()));
    }

    /* renamed from: e */
    public static final <T> void m49918e(@C12579k C12409o oVar, @C12579k C12440p<? super T> pVar, T t, @C12579k C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        Intrinsics.checkNotNullParameter(lVar, "ifPolymorphic");
        if (!(pVar instanceof C12256b) || oVar.mo25375d().mo25282h().mo25367m()) {
            pVar.serialize(oVar, t);
            return;
        }
        C12256b bVar = (C12256b) pVar;
        String c = m49916c(pVar.getDescriptor(), oVar.mo25375d());
        if (t != null) {
            C12440p b = C12250i.m49068b(bVar, oVar, t);
            m49920g(bVar, b, c);
            m49915b(b.getDescriptor().getKind());
            lVar.invoke(c);
            b.serialize(oVar, t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    /* renamed from: f */
    public static final Void m49919f(String str, JsonObject jsonObject) {
        String str2;
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw C12388n.m50107f(-1, Intrinsics.stringPlus("Polymorphic serializer was not found for ", str2), jsonObject.toString());
    }

    /* renamed from: g */
    public static final void m49920g(C12440p<?> pVar, C12440p<Object> pVar2, String str) {
        if ((pVar instanceof SealedClassSerializer) && C12282j0.m49344a(pVar2.getDescriptor()).contains(str)) {
            String h = pVar.getDescriptor().mo24830h();
            String h2 = pVar2.getDescriptor().mo24830h();
            throw new IllegalStateException(("Sealed class '" + h2 + "' cannot be serialized as base class '" + h + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
