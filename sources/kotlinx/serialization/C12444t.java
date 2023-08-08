package kotlinx.serialization;

import androidx.exifinterface.media.C19135a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11498g;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11523t;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.internal.C12254a0;
import kotlinx.serialization.internal.C12255a1;
import kotlinx.serialization.internal.C12258b1;
import kotlinx.serialization.internal.C12260c0;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12286k1;
import kotlinx.serialization.internal.C12291m0;
import kotlinx.serialization.internal.C12297o0;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.t */
public final /* synthetic */ class C12444t {
    /* renamed from: a */
    public static final C12248g<? extends Object> m50332a(C12434e eVar, List<? extends C11520r> list, C11494d<Object> dVar, boolean z) {
        ArrayList arrayList;
        if (z) {
            Iterable<C11520r> iterable = list;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C11520r h : iterable) {
                arrayList.add(C12442r.m50317h(eVar, h));
            }
        } else {
            Iterable<C11520r> iterable2 = list;
            arrayList = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (C11520r m : iterable2) {
                C12248g<Object> m2 = C12442r.m50322m(eVar, m);
                if (m2 == null) {
                    return null;
                }
                arrayList.add(m2);
            }
        }
        Class<List> cls = List.class;
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(Collection.class)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(ArrayList.class))) {
            return new C12269f((C12248g) arrayList.get(0));
        }
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(HashSet.class))) {
            return new C12260c0((C12248g) arrayList.get(0));
        }
        Class<Set> cls2 = Set.class;
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls2)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls2)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(LinkedHashSet.class))) {
            return new C12297o0((C12248g) arrayList.get(0));
        }
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(HashMap.class))) {
            return new C12254a0((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
        }
        Class<Map> cls3 = Map.class;
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls3)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(cls3)) ? true : Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(LinkedHashMap.class))) {
            return new C12291m0((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
        }
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(Map.Entry.class))) {
            return C12197a.m48811k((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
        }
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(Pair.class))) {
            return C12197a.m48813m((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
        }
        if (Intrinsics.areEqual((Object) dVar, (Object) C11342l0.m43547d(Triple.class))) {
            return C12197a.m48816p((C12248g) arrayList.get(0), (C12248g) arrayList.get(1), (C12248g) arrayList.get(2));
        }
        if (C12255a1.m49219l(dVar)) {
            C11498g m3 = ((C11520r) list.get(0)).mo22759m();
            if (m3 != null) {
                return C12197a.m48801a((C11494d) m3, (C12248g) arrayList.get(0));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        }
        Object[] array = arrayList.toArray(new C12248g[0]);
        if (array != null) {
            C12248g[] gVarArr = (C12248g[]) array;
            C12248g<? extends Object> c = C12255a1.m49210c(dVar, (C12248g[]) Arrays.copyOf(gVarArr, gVarArr.length));
            return c == null ? C12442r.m50310a(eVar, dVar, arrayList) : c;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: b */
    public static final <T> C12248g<T> m50333b(C12248g<T> gVar, boolean z) {
        return z ? C12197a.m48817q(gVar) : gVar;
    }

    @C12580l
    /* renamed from: c */
    public static final <T> C12248g<T> m50334c(@C12579k C12434e eVar, @C12579k C11494d<T> dVar, @C12579k List<? extends C12248g<Object>> list) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
        C12248g<T> j = C12442r.m50319j(dVar);
        if (j == null) {
            return eVar.mo25579c(dVar, list);
        }
        return j;
    }

    @C12247f
    @C12579k
    /* renamed from: e */
    public static final <T> C12248g<T> m50336e(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C12248g<T> j = C12442r.m50319j(dVar);
        if (j != null) {
            return j;
        }
        C12258b1.m49236i(dVar);
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: f */
    public static final C12248g<Object> m50337f(@C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "type");
        return C12442r.m50317h(C12436g.m50300a(), rVar);
    }

    /* renamed from: g */
    public static final /* synthetic */ <T> C12248g<T> m50338g(C12434e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.reifiedOperationMarker(6, C19135a.f48928d5);
        return C12442r.m50317h(eVar, (C11520r) null);
    }

    @C12579k
    /* renamed from: h */
    public static final C12248g<Object> m50339h(@C12579k C12434e eVar, @C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "type");
        C12248g<Object> i = m50340i(eVar, rVar, true);
        if (i != null) {
            return i;
        }
        C12255a1.m49220m(C12258b1.m49235h(rVar));
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public static final C12248g<Object> m50340i(C12434e eVar, C11520r rVar, boolean z) {
        C12248g<? extends Object> gVar;
        C11494d h = C12258b1.m49235h(rVar);
        boolean e = rVar.mo22754e();
        Iterable<C11523t> arguments = rVar.getArguments();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(arguments, 10));
        for (C11523t g : arguments) {
            C11520r g2 = g.mo23143g();
            if (g2 != null) {
                arrayList.add(g2);
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Star projections in type arguments are not allowed, but had ", rVar).toString());
            }
        }
        if (arrayList.isEmpty()) {
            gVar = C12442r.m50319j(h);
            if (gVar == null) {
                gVar = C12434e.m50280d(eVar, h, (List) null, 2, (Object) null);
            }
        } else {
            gVar = m50332a(eVar, arrayList, h, z);
        }
        if (gVar == null) {
            gVar = null;
        }
        if (gVar == null) {
            return null;
        }
        return m50333b(gVar, e);
    }

    @C12247f
    @C12580l
    /* renamed from: j */
    public static final <T> C12248g<T> m50341j(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C12248g<T> b = C12255a1.m49209b(dVar);
        if (b == null) {
            return C12286k1.m49372b(dVar);
        }
        return b;
    }

    @C12580l
    /* renamed from: k */
    public static final C12248g<Object> m50342k(@C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "type");
        return C12442r.m50322m(C12436g.m50300a(), rVar);
    }

    @C12580l
    /* renamed from: l */
    public static final C12248g<Object> m50343l(@C12579k C12434e eVar, @C12579k C11520r rVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "type");
        return m50340i(eVar, rVar, false);
    }
}
