package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12415t;
import kotlinx.serialization.json.C12424z;
import kotlinx.serialization.json.internal.C12383l;
import org.jetbrains.annotations.C12579k;

public final class JsonNamesMapKt {
    @C12579k

    /* renamed from: a */
    public static final C12383l.C12384a<Map<String, Integer>> f30224a = new C12383l.C12384a<>();

    @C12579k
    /* renamed from: a */
    public static final Map<String, Integer> m49826a(@C12579k C12217f fVar) {
        String[] names;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int d = fVar.mo24823d();
        Map<String, Integer> map = null;
        int i = 0;
        while (i < d) {
            int i2 = i + 1;
            ArrayList arrayList = new ArrayList();
            for (Object next : fVar.mo24826f(i)) {
                if (next instanceof C12415t) {
                    arrayList.add(next);
                }
            }
            C12415t tVar = (C12415t) CollectionsKt___CollectionsKt.m40631f5(arrayList);
            if (!(tVar == null || (names = tVar.names()) == null)) {
                int length = names.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = names[i3];
                    i3++;
                    if (map == null) {
                        map = C12381k.m50080a(fVar.mo24823d());
                    }
                    Intrinsics.checkNotNull(map);
                    m49827b(map, fVar, str, i);
                }
            }
            i = i2;
        }
        if (map == null) {
            return C10977s0.m41492z();
        }
        return map;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m49827b(java.util.Map<java.lang.String, java.lang.Integer> r3, kotlinx.serialization.descriptors.C12217f r4, java.lang.String r5, int r6) {
        /*
            boolean r0 = r3.containsKey(r5)
            if (r0 != 0) goto L_0x000e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r4)
            return
        L_0x000e:
            kotlinx.serialization.json.internal.JsonException r0 = new kotlinx.serialization.json.internal.JsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The suggested name '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "' for property "
            r1.append(r2)
            java.lang.String r6 = r4.mo24824e(r6)
            r1.append(r6)
            java.lang.String r6 = " is already one of the names for property "
            r1.append(r6)
            java.lang.Object r3 = kotlin.collections.C10977s0.m41443K(r3, r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r3 = r4.mo24824e(r3)
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonNamesMapKt.m49827b(java.util.Map, kotlinx.serialization.descriptors.f, java.lang.String, int):void");
    }

    @C12579k
    /* renamed from: c */
    public static final C12383l.C12384a<Map<String, Integer>> m49828c() {
        return f30224a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m49829d() {
    }

    /* renamed from: e */
    public static final int m49830e(@C12579k C12217f fVar, @C12579k C12341a aVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(str, "name");
        int c = fVar.mo24822c(str);
        if (c != -3 || !aVar.mo25282h().mo25366l()) {
            return c;
        }
        Integer num = (Integer) ((Map) C12424z.m50238a(aVar).mo25526b(fVar, f30224a, new JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1(fVar))).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public static final int m49831f(@C12579k C12217f fVar, @C12579k C12341a aVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(str, "name");
        int e = m49830e(fVar, aVar, str);
        if (e != -3) {
            return e;
        }
        throw new SerializationException(fVar.mo24830h() + " does not contain element with name '" + str + '\'');
    }

    /* renamed from: g */
    public static final boolean m49832g(@C12579k C12341a aVar, @C12579k C12217f fVar, @C12579k C11289a<Boolean> aVar2, @C12579k C11289a<String> aVar3, @C12579k C11289a<C11079d2> aVar4) {
        String invoke;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "elementDescriptor");
        Intrinsics.checkNotNullParameter(aVar2, "peekNull");
        Intrinsics.checkNotNullParameter(aVar3, "peekString");
        Intrinsics.checkNotNullParameter(aVar4, "onEnumCoercing");
        if (!fVar.mo24821b() && aVar2.invoke().booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) fVar.getKind(), (Object) C12224h.C12226b.f30010a) || (invoke = aVar3.invoke()) == null || m49830e(fVar, aVar, invoke) != -3) {
            return false;
        }
        aVar4.invoke();
        return true;
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m49833h(C12341a aVar, C12217f fVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, int i, Object obj) {
        String str;
        if ((i & 8) != 0) {
            aVar4 = JsonNamesMapKt$tryCoerceValue$1.f30225f;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "elementDescriptor");
        Intrinsics.checkNotNullParameter(aVar2, "peekNull");
        Intrinsics.checkNotNullParameter(aVar3, "peekString");
        Intrinsics.checkNotNullParameter(aVar4, "onEnumCoercing");
        if (!fVar.mo24821b() && ((Boolean) aVar2.invoke()).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) fVar.getKind(), (Object) C12224h.C12226b.f30010a) || (str = (String) aVar3.invoke()) == null || m49830e(fVar, aVar, str) != -3) {
            return false;
        }
        aVar4.invoke();
        return true;
    }
}
