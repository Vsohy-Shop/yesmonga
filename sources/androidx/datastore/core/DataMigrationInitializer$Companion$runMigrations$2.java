package androidx.datastore.core;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", mo22502f = "DataMigrationInitializer.kt", mo22503i = {0, 0}, mo22504l = {44, 46}, mo22505m = "invokeSuspend", mo22506n = {"migration", "data"}, mo22507s = {"L$2", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H@"}, mo22516d2 = {"T", "startingData", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements C11304p<T, C11045c<? super T>, Object> {
    final /* synthetic */ List<C11300l<C11045c<? super C11079d2>, Object>> $cleanUps;
    final /* synthetic */ List<C18569c<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends C18569c<T>> list, List<C11300l<C11045c<? super C11079d2>, Object>> list2, C11045c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(T t, @C12580l C11045c<? super T> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r10.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r10.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.C11661u0.m45747n(r11)
            r7 = r10
            goto L_0x008e
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0024:
            java.lang.Object r1 = r10.L$3
            java.lang.Object r4 = r10.L$2
            androidx.datastore.core.c r4 = (androidx.datastore.core.C18569c) r4
            java.lang.Object r5 = r10.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r10.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.C11661u0.m45747n(r11)
            r7 = r10
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x006c
        L_0x003a:
            kotlin.C11661u0.m45747n(r11)
            java.lang.Object r11 = r10.L$0
            java.util.List<androidx.datastore.core.c<T>> r1 = r10.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<kotlin.jvm.functions.l<kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object>> r4 = r10.$cleanUps
            java.util.Iterator r1 = r1.iterator()
            r5 = r10
        L_0x004a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.c r6 = (androidx.datastore.core.C18569c) r6
            r5.L$0 = r4
            r5.L$1 = r1
            r5.L$2 = r6
            r5.L$3 = r11
            r5.label = r3
            java.lang.Object r7 = r6.mo53579a(r11, r5)
            if (r7 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r9
        L_0x006c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0090
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r11 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r8 = 0
            r11.<init>(r6, r8)
            r4.add(r11)
            r7.L$0 = r4
            r7.L$1 = r5
            r7.L$2 = r8
            r7.L$3 = r8
            r7.label = r2
            java.lang.Object r11 = r6.mo53581c(r1, r7)
            if (r11 != r0) goto L_0x0091
            return r0
        L_0x008e:
            r5 = r7
            goto L_0x004a
        L_0x0090:
            r11 = r1
        L_0x0091:
            r1 = r5
            goto L_0x008e
        L_0x0093:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
