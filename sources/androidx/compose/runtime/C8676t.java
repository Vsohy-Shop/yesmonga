package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.collection.C8419d;
import androidx.constraintlayout.widget.C16934c;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1257:1\n1549#2:1258\n1620#2,3:1259\n1#3:1262\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n*L\n1227#1:1258\n1227#1:1259,3\n*E\n"})
/* renamed from: androidx.compose.runtime.t */
public final class C8676t {
    @C12579k

    /* renamed from: a */
    public static final Object f23239a = new Object();

    @C12579k
    /* renamed from: a */
    public static final C8598p m31865a(@C12579k C8428d<?> dVar, @C12579k C8602q qVar) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        return new C8613s(qVar, dVar, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
    }

    @C8541g0
    @C12579k
    /* renamed from: b */
    public static final C8598p m31866b(@C12579k C8428d<?> dVar, @C12579k C8602q qVar, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(coroutineContext, "recomposeCoroutineContext");
        return new C8613s(qVar, dVar, coroutineContext);
    }

    @C12579k
    /* renamed from: c */
    public static final C8696y m31867c(@C12579k C8428d<?> dVar, @C12579k C8602q qVar) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        return new C8613s(qVar, dVar, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
    }

    @C8541g0
    @C12579k
    /* renamed from: d */
    public static final C8696y m31868d(@C12579k C8428d<?> dVar, @C12579k C8602q qVar, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(coroutineContext, "recomposeCoroutineContext");
        return new C8613s(qVar, dVar, coroutineContext);
    }

    /* renamed from: g */
    public static final <K, V> void m31871g(C8418c<K, C8419d<V>> cVar, K k, V v) {
        if (cVar.mo15358b(k)) {
            C8419d f = cVar.mo15362f(k);
            if (f != null) {
                f.add(v);
                return;
            }
            return;
        }
        C8419d dVar = new C8419d();
        dVar.add(v);
        C11079d2 d2Var = C11079d2.f28267a;
        cVar.mo15371o(k, dVar);
    }

    /* renamed from: h */
    public static final void m31872h() {
        C8580l0.f23016a.mo16252a();
    }

    @C12579k
    /* renamed from: i */
    public static final List<Pair<Exception, Boolean>> m31873i() {
        Iterable<C8596o1> b = C8580l0.f23016a.mo16253b();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(b, 10));
        for (C8596o1 o1Var : b) {
            arrayList.add(C11078d1.m42659a(o1Var.mo15270a(), Boolean.valueOf(o1Var.mo15271b())));
        }
        return arrayList;
    }

    @C8541g0
    @C12579k
    /* renamed from: j */
    public static final CoroutineContext m31874j(@C12579k C8696y yVar) {
        C8613s sVar;
        CoroutineContext I;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof C8613s) {
            sVar = (C8613s) yVar;
        } else {
            sVar = null;
        }
        if (sVar == null || (I = sVar.mo16337I()) == null) {
            return EmptyCoroutineContext.f28243a;
        }
        return I;
    }

    @C8541g0
    /* renamed from: k */
    public static /* synthetic */ void m31875k(C8696y yVar) {
    }

    /* renamed from: l */
    public static final void m31876l(int i) {
        C8580l0.f23016a.mo16254c(i);
    }

    /* renamed from: m */
    public static final <E> void m31877m(HashSet<E> hashSet, C11300l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    /* renamed from: n */
    public static final void m31878n(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, C9175a.f24932Y);
        C8580l0.f23016a.mo16257f(obj);
    }
}
