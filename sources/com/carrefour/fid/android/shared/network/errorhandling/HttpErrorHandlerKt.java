package com.carrefour.fid.android.shared.network.errorhandling;

public final class HttpErrorHandlerKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m119234a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.coroutines.C11045c<? super kotlin.Result<? extends T>>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends T>> r5) {
        /*
            boolean r0 = r5 instanceof com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt$runSafeApiCall$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt$runSafeApiCall$1 r0 = (com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt$runSafeApiCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt$runSafeApiCall$1 r0 = new com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt$runSafeApiCall$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x003f
        L_0x0029:
            r4 = move-exception
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r4.invoke(r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlin.Result r5 = (kotlin.Result) r5     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r5.mo21858l()     // Catch:{ all -> 0x0029 }
            goto L_0x00ac
        L_0x0046:
            boolean r5 = r4 instanceof java.io.IOException
            if (r5 == 0) goto L_0x0062
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.NetWorkResponseThrowable r5 = new com.carrefour.fid.android.shared.io.NetWorkResponseThrowable
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L_0x0056
            java.lang.String r4 = "Unknown IO Exception"
        L_0x0056:
            r5.<init>(r4)
            java.lang.Object r4 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r4 = kotlin.Result.m38702b(r4)
            goto L_0x00ac
        L_0x0062:
            boolean r5 = r4 instanceof retrofit2.HttpException
            if (r5 == 0) goto L_0x00a2
            r5 = r4
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5
            int r0 = r5.mo30431a()
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L_0x0075
            java.lang.String r4 = "Unknown HttpException Exception"
        L_0x0075:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "HttpException: code:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", message: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = new com.carrefour.fid.android.shared.io.ResponseThrowable
            int r5 = r5.mo30431a()
            r0.<init>(r5, r4)
            java.lang.Object r4 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r4 = kotlin.Result.m38702b(r4)
            goto L_0x00ac
        L_0x00a2:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r4 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r4 = kotlin.Result.m38702b(r4)
        L_0x00ac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }
}
