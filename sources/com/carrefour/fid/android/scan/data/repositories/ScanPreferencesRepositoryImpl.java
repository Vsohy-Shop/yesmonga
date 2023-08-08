package com.carrefour.fid.android.scan.data.repositories;

import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
public final class ScanPreferencesRepositoryImpl implements C28267a {
    @C12579k

    /* renamed from: a */
    public final ScanPreferencesStorage f68419a;

    @Inject
    public ScanPreferencesRepositoryImpl(@C12579k ScanPreferencesStorage scanPreferencesStorage) {
        Intrinsics.checkNotNullParameter(scanPreferencesStorage, "scanPreferencesStorage");
        this.f68419a = scanPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo82214a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$hasBeenShown$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$hasBeenShown$1 r0 = (com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$hasBeenShown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$hasBeenShown$1 r0 = new com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$hasBeenShown$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0050 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0050 }
            com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage r5 = r4.f68419a     // Catch:{ all -> 0x0050 }
            r0.label = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r5.mo82194b(r0)     // Catch:{ all -> 0x0050 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.carrefour.fid.android.scan.core.datastore.a r5 = (com.carrefour.fid.android.scan.core.datastore.C28259a) r5     // Catch:{ all -> 0x0050 }
            boolean r5 = r5.mo82200d()     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl.mo82214a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[Catch:{ all -> 0x0071 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo82215b(boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1 r0 = (com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1 r0 = new com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0071 }
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl r6 = (com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl) r6
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage r7 = r5.f68419a     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x0047
            r6 = r4
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            r0.L$0 = r5     // Catch:{ all -> 0x0071 }
            r0.label = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r6 = r7.mo82195c(r6, r0)     // Catch:{ all -> 0x0071 }
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r6 = r5
        L_0x0054:
            com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage r6 = r6.f68419a     // Catch:{ all -> 0x0071 }
            r7 = 0
            r0.L$0 = r7     // Catch:{ all -> 0x0071 }
            r0.label = r3     // Catch:{ all -> 0x0071 }
            java.lang.Object r7 = r6.mo82194b(r0)     // Catch:{ all -> 0x0071 }
            if (r7 != r1) goto L_0x0062
            return r1
        L_0x0062:
            com.carrefour.fid.android.scan.core.datastore.a r7 = (com.carrefour.fid.android.scan.core.datastore.C28259a) r7     // Catch:{ all -> 0x0071 }
            boolean r6 = r7.mo82200d()     // Catch:{ all -> 0x0071 }
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)     // Catch:{ all -> 0x0071 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0071 }
            goto L_0x007c
        L_0x0071:
            r6 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x007c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl.mo82215b(boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
