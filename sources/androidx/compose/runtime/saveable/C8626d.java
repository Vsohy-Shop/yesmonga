package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.C8624c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
/* renamed from: androidx.compose.runtime.saveable.d */
public final class C8626d implements C8624c {
    @C12579k

    /* renamed from: a */
    public final C11300l<Object, Boolean> f23110a;
    @C12579k

    /* renamed from: b */
    public final Map<String, List<Object>> f23111b;
    @C12579k

    /* renamed from: c */
    public final Map<String, List<C11289a<Object>>> f23112c;

    /* renamed from: androidx.compose.runtime.saveable.d$a */
    public static final class C8627a implements C8624c.C8625a {

        /* renamed from: a */
        public final /* synthetic */ C8626d f23113a;

        /* renamed from: b */
        public final /* synthetic */ String f23114b;

        /* renamed from: c */
        public final /* synthetic */ C11289a<Object> f23115c;

        public C8627a(C8626d dVar, String str, C11289a<? extends Object> aVar) {
            this.f23113a = dVar;
            this.f23114b = str;
            this.f23115c = aVar;
        }

        /* renamed from: a */
        public void mo16409a() {
            List list = (List) this.f23113a.f23112c.remove(this.f23114b);
            if (list != null) {
                list.remove(this.f23115c);
            }
            if (list != null && (!list.isEmpty())) {
                this.f23113a.f23112c.put(this.f23114b, list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = kotlin.collections.C10977s0.m41442J0(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8626d(@org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.f23110a = r3
            if (r2 == 0) goto L_0x0012
            java.util.Map r2 = kotlin.collections.C10977s0.m41442J0(r2)
            if (r2 != 0) goto L_0x0017
        L_0x0012:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x0017:
            r1.f23111b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f23112c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.C8626d.<init>(java.util.Map, kotlin.jvm.functions.l):void");
    }

    /* renamed from: a */
    public boolean mo8708a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        return this.f23110a.invoke(obj).booleanValue();
    }

    @C12579k
    /* renamed from: b */
    public C8624c.C8625a mo8709b(@C12579k String str, @C12579k C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(aVar, "valueProvider");
        if (!C11622t.isBlank(str)) {
            Map<String, List<C11289a<Object>>> map = this.f23112c;
            List<C11289a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new C8627a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @C12579k
    /* renamed from: e */
    public Map<String, List<Object>> mo8712e() {
        Map<String, List<Object>> J0 = C10977s0.m41442J0(this.f23111b);
        for (Map.Entry next : this.f23112c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C11289a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (mo8708a(invoke)) {
                    J0.put(str, CollectionsKt__CollectionsKt.m40463r(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((C11289a) list.get(i)).invoke();
                    if (invoke2 == null || mo8708a(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                J0.put(str, arrayList);
            }
        }
        return J0;
    }

    @C12580l
    /* renamed from: f */
    public Object mo8713f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        List remove = this.f23111b.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.f23111b.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }
}
