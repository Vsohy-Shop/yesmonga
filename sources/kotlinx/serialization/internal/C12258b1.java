package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11498g;
import kotlin.reflect.C11520r;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.b1 */
public final class C12258b1 {
    @C12579k

    /* renamed from: a */
    public static final C12217f[] f30054a = new C12217f[0];

    @C12579k
    /* renamed from: a */
    public static final Set<String> m49228a(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof C12290m) {
            return ((C12290m) fVar).mo24820a();
        }
        HashSet hashSet = new HashSet(fVar.mo24823d());
        int d = fVar.mo24823d();
        for (int i = 0; i < d; i++) {
            hashSet.add(fVar.mo24824e(i));
        }
        return hashSet;
    }

    @C12579k
    @C11532s0
    /* renamed from: b */
    public static final <T> C12199c<T> m49229b(@C12579k C12199c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar;
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public static final <T> C12248g<T> m49230c(@C12579k C12248g<?> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar;
    }

    @C12579k
    @C11532s0
    /* renamed from: d */
    public static final <T> C12440p<T> m49231d(@C12579k C12440p<?> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return pVar;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.C12217f[] m49232e(@org.jetbrains.annotations.C12580l java.util.List<? extends kotlinx.serialization.descriptors.C12217f> r3) {
        /*
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 != 0) goto L_0x0018
            goto L_0x0025
        L_0x0018:
            java.util.Collection r3 = (java.util.Collection) r3
            kotlinx.serialization.descriptors.f[] r0 = new kotlinx.serialization.descriptors.C12217f[r1]
            java.lang.Object[] r3 = r3.toArray(r0)
            if (r3 == 0) goto L_0x002a
            r2 = r3
            kotlinx.serialization.descriptors.f[] r2 = (kotlinx.serialization.descriptors.C12217f[]) r2
        L_0x0025:
            if (r2 != 0) goto L_0x0029
            kotlinx.serialization.descriptors.f[] r2 = f30054a
        L_0x0029:
            return r2
        L_0x002a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.C12258b1.m49232e(java.util.List):kotlinx.serialization.descriptors.f[]");
    }

    /* renamed from: f */
    public static final <T, K> int m49233f(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar) {
        int i;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i2 = 1;
        for (Object invoke : iterable) {
            int i3 = i2 * 31;
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 == null) {
                i = 0;
            } else {
                i = invoke2.hashCode();
            }
            i2 = i3 + i;
        }
        return i2;
    }

    /* renamed from: g */
    public static /* synthetic */ void m49234g() {
    }

    @C12579k
    /* renamed from: h */
    public static final C11494d<Object> m49235h(@C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        C11498g m = rVar.mo22759m();
        if (m instanceof C11494d) {
            return (C11494d) m;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Only KClass supported as classifier, got ", m).toString());
    }

    @C12579k
    /* renamed from: i */
    public static final Void m49236i(@C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        throw new SerializationException("Serializer for class '" + dVar.mo22848s() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
