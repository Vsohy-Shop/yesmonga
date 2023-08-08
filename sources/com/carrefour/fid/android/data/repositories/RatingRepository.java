package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.google.android.play.core.review.C32121c;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class RatingRepository {

    /* renamed from: b */
    public static final int f90435b = 8;
    @C12579k

    /* renamed from: a */
    public final C32121c f90436a;

    @Inject
    public RatingRepository(@C12579k C32121c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "reviewManager");
        this.f90436a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111561a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.google.android.play.core.review.ReviewInfo>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.RatingRepository$requestReviewFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.RatingRepository$requestReviewFlow$1 r0 = (com.carrefour.fid.android.data.repositories.RatingRepository$requestReviewFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.RatingRepository$requestReviewFlow$1 r0 = new com.carrefour.fid.android.data.repositories.RatingRepository$requestReviewFlow$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.C11661u0.m45747n(r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x004a
        L_0x0029:
            r7 = move-exception
            goto L_0x0072
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            kotlin.C11661u0.m45747n(r7)
            com.google.android.play.core.review.c r7 = r6.f90436a     // Catch:{ Exception -> 0x0029 }
            com.google.android.play.core.tasks.d r7 = r7.mo92878a()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "reviewManager.requestReviewFlow()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)     // Catch:{ Exception -> 0x0029 }
            r0.label = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r7 = com.carrefour.fid.android.shared.extension.C28777r.m119101a(r7, r0)     // Catch:{ Exception -> 0x0029 }
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.google.android.play.core.review.ReviewInfo r7 = (com.google.android.play.core.review.ReviewInfo) r7     // Catch:{ Exception -> 0x0029 }
            if (r7 != 0) goto L_0x006b
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = "The result of the task cannot be empty, it may have been canceled by itself "
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0029 }
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0029 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ Exception -> 0x0029 }
            java.lang.String r0 = "The result of the task cannot be empty, it may have been canceled by itself "
            r7.<init>(r0)     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0096
        L_0x006b:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0096
        L_0x0072:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r7.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error request review "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r7)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x0096:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.RatingRepository.mo111561a(kotlin.coroutines.c):java.lang.Object");
    }
}
