package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final /* synthetic */ class FlowKt__CollectionKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$a */
    public static final class C11819a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ C f29298a;

        public C11819a(C c) {
            this.f29298a = c;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            this.f29298a.add(t);
            return C11079d2.f28267a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object m47017a(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11907e<? extends T> r4, @org.jetbrains.annotations.C12579k C r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.FlowKt__CollectionKt$a r6 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$a
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__CollectionKt.m47017a(kotlinx.coroutines.flow.e, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: b */
    public static final <T> Object m47018b(@C12579k C11907e<? extends T> eVar, @C12579k List<T> list, @C12579k C11045c<? super List<? extends T>> cVar) {
        return C11909g.m47419X1(eVar, list, cVar);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m47019c(C11907e eVar, List list, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return C11909g.m47422Y1(eVar, list, cVar);
    }

    @C12580l
    /* renamed from: d */
    public static final <T> Object m47020d(@C12579k C11907e<? extends T> eVar, @C12579k Set<T> set, @C12579k C11045c<? super Set<? extends T>> cVar) {
        return C11909g.m47419X1(eVar, set, cVar);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m47021e(C11907e eVar, Set set, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return C11909g.m47429a2(eVar, set, cVar);
    }
}
