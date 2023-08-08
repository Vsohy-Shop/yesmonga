package androidx.work.impl;

import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.work.impl.w */
public final class C21362w {
    @C12579k

    /* renamed from: a */
    public final Object f55085a = new Object();
    @C12579k

    /* renamed from: b */
    public final Map<C21237m, C21361v> f55086b = new LinkedHashMap();

    /* renamed from: a */
    public final boolean mo63719a(@C12579k C21237m mVar) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(mVar, "id");
        synchronized (this.f55085a) {
            containsKey = this.f55086b.containsKey(mVar);
        }
        return containsKey;
    }

    @C12580l
    /* renamed from: b */
    public final C21361v mo63720b(@C12579k C21237m mVar) {
        C21361v remove;
        Intrinsics.checkNotNullParameter(mVar, "id");
        synchronized (this.f55085a) {
            remove = this.f55086b.remove(mVar);
        }
        return remove;
    }

    @C12580l
    /* renamed from: c */
    public final C21361v mo63721c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "spec");
        return mo63720b(C21273x.m98280a(uVar));
    }

    @C12579k
    /* renamed from: d */
    public final List<C21361v> mo63722d(@C12579k String str) {
        List<C21361v> Q5;
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        synchronized (this.f55085a) {
            Map<C21237m, C21361v> map = this.f55086b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                if (Intrinsics.areEqual((Object) ((C21237m) next.getKey()).mo63437f(), (Object) str)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            for (C21237m remove : linkedHashMap.keySet()) {
                this.f55086b.remove(remove);
            }
            Q5 = CollectionsKt___CollectionsKt.m40557Q5(linkedHashMap.values());
        }
        return Q5;
    }

    @C12579k
    /* renamed from: e */
    public final C21361v mo63723e(@C12579k C21237m mVar) {
        C21361v vVar;
        Intrinsics.checkNotNullParameter(mVar, "id");
        synchronized (this.f55085a) {
            Map<C21237m, C21361v> map = this.f55086b;
            C21361v vVar2 = map.get(mVar);
            if (vVar2 == null) {
                vVar2 = new C21361v(mVar);
                map.put(mVar, vVar2);
            }
            vVar = vVar2;
        }
        return vVar;
    }

    @C12579k
    /* renamed from: f */
    public final C21361v mo63724f(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "spec");
        return mo63723e(C21273x.m98280a(uVar));
    }
}
