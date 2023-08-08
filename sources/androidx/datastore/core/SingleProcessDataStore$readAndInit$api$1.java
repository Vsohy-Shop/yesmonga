package androidx.datastore.core;

import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.C12139a;

public final class SingleProcessDataStore$readAndInit$api$1 implements C18573g<T> {

    /* renamed from: a */
    public final /* synthetic */ C12139a f47416a;

    /* renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f47417b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<T> f47418c;

    /* renamed from: d */
    public final /* synthetic */ SingleProcessDataStore<T> f47419d;

    public SingleProcessDataStore$readAndInit$api$1(C12139a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f47416a = aVar;
        this.f47417b = booleanRef;
        this.f47418c = objectRef;
        this.f47419d = singleProcessDataStore;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo53573a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0076
            if (r2 == r5) goto L_0x005a
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r11 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.C12139a) r0
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x003b }
            goto L_0x00cc
        L_0x003b:
            r11 = move-exception
            goto L_0x00e1
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0046:
            java.lang.Object r11 = r0.L$2
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.C12139a) r4
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0056 }
            goto L_0x00b2
        L_0x0056:
            r11 = move-exception
            r0 = r4
            goto L_0x00e1
        L_0x005a:
            java.lang.Object r11 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.a r7 = (kotlinx.coroutines.sync.C12139a) r7
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            kotlin.C11661u0.m45747n(r12)
            r12 = r7
            r9 = r8
            r8 = r11
            r11 = r9
            goto L_0x0096
        L_0x0076:
            kotlin.C11661u0.m45747n(r12)
            kotlinx.coroutines.sync.a r12 = r10.f47416a
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.f47417b
            kotlin.jvm.internal.Ref$ObjectRef<T> r7 = r10.f47418c
            androidx.datastore.core.SingleProcessDataStore<T> r8 = r10.f47419d
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.L$3 = r7
            r0.L$4 = r8
            r0.label = r5
            java.lang.Object r5 = r12.mo24739f(r6, r0)
            if (r5 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r5 = r2
            r2 = r7
        L_0x0096:
            boolean r5 = r5.element     // Catch:{ all -> 0x00df }
            if (r5 != 0) goto L_0x00d7
            T r5 = r2.element     // Catch:{ all -> 0x00df }
            r0.L$0 = r12     // Catch:{ all -> 0x00df }
            r0.L$1 = r2     // Catch:{ all -> 0x00df }
            r0.L$2 = r8     // Catch:{ all -> 0x00df }
            r0.L$3 = r6     // Catch:{ all -> 0x00df }
            r0.L$4 = r6     // Catch:{ all -> 0x00df }
            r0.label = r4     // Catch:{ all -> 0x00df }
            java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
            if (r11 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r4 = r12
            r12 = r11
            r11 = r8
        L_0x00b2:
            T r5 = r2.element     // Catch:{ all -> 0x0056 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r5)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x00d0
            r0.L$0 = r4     // Catch:{ all -> 0x0056 }
            r0.L$1 = r2     // Catch:{ all -> 0x0056 }
            r0.L$2 = r12     // Catch:{ all -> 0x0056 }
            r0.label = r3     // Catch:{ all -> 0x0056 }
            java.lang.Object r11 = r11.mo53542A(r12, r0)     // Catch:{ all -> 0x0056 }
            if (r11 != r1) goto L_0x00c9
            return r1
        L_0x00c9:
            r11 = r12
            r1 = r2
            r0 = r4
        L_0x00cc:
            r1.element = r11     // Catch:{ all -> 0x003b }
            r2 = r1
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            T r11 = r2.element     // Catch:{ all -> 0x003b }
            r0.mo24740g(r6)
            return r11
        L_0x00d7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
            r11.<init>(r0)     // Catch:{ all -> 0x00df }
            throw r11     // Catch:{ all -> 0x00df }
        L_0x00df:
            r11 = move-exception
            r0 = r12
        L_0x00e1:
            r0.mo24740g(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.mo53573a(kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }
}
