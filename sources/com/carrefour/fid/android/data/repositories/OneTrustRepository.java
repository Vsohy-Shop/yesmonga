package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38183u;
import com.carrefour.fid.android.domain.repositories.C38198g;
import com.onetrust.otpublishers.headless.Public.OTCallback;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class OneTrustRepository implements C38198g {

    /* renamed from: b */
    public static final int f90397b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90398a;

    /* renamed from: com.carrefour.fid.android.data.repositories.OneTrustRepository$a */
    public static final class C36586a implements OTCallback {

        /* renamed from: a */
        public final /* synthetic */ C11045c<Result<C38183u>> f90399a;

        /* renamed from: b */
        public final /* synthetic */ OTPublishersHeadlessSDK f90400b;

        public C36586a(C11045c<? super Result<C38183u>> cVar, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
            this.f90399a = cVar;
            this.f90400b = oTPublishersHeadlessSDK;
        }

        public void onFailure(@C0359n0 @C12579k OTResponse oTResponse) {
            Intrinsics.checkNotNullParameter(oTResponse, "otErrorResponse");
            C11045c<Result<C38183u>> cVar = this.f90399a;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(Result.m38701a(Result.m38702b(C11661u0.m45734a(new Throwable(oTResponse.getResponseMessage()))))));
        }

        public void onSuccess(@C0359n0 @C12579k OTResponse oTResponse) {
            Intrinsics.checkNotNullParameter(oTResponse, "otSuccessResponse");
            C11045c<Result<C38183u>> cVar = this.f90399a;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(Result.m38701a(Result.m38702b(new C38183u(this.f90400b.shouldShowBanner())))));
        }
    }

    @Inject
    public OneTrustRepository(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f90398a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111524a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38183u>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.repositories.OneTrustRepository$init$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.repositories.OneTrustRepository$init$1 r0 = (com.carrefour.fid.android.data.repositories.OneTrustRepository$init$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OneTrustRepository$init$1 r0 = new com.carrefour.fid.android.data.repositories.OneTrustRepository$init$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.repositories.OneTrustRepository r0 = (com.carrefour.fid.android.data.repositories.OneTrustRepository) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0035:
            kotlin.C11661u0.m45747n(r10)
            r0.L$0 = r9
            r0.label = r3
            kotlin.coroutines.h r10 = new kotlin.coroutines.h
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)
            r10.<init>(r2)
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r3 = new com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK
            android.content.Context r2 = r9.f90398a
            r3.<init>(r2)
            android.content.Context r2 = r9.f90398a
            r4 = 2131953252(0x7f130664, float:1.954297E38)
            java.lang.String r4 = r2.getString(r4)
            android.content.Context r2 = r9.f90398a
            r5 = 2131953250(0x7f130662, float:1.9542966E38)
            java.lang.String r5 = r2.getString(r5)
            android.content.Context r2 = r9.f90398a
            r6 = 2131953251(0x7f130663, float:1.9542968E38)
            java.lang.String r6 = r2.getString(r6)
            r7 = 0
            com.carrefour.fid.android.data.repositories.OneTrustRepository$a r8 = new com.carrefour.fid.android.data.repositories.OneTrustRepository$a
            r8.<init>(r10, r3)
            r3.startSDK(r4, r5, r6, r7, r8)
            java.lang.Object r10 = r10.mo22492a()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r10 != r2) goto L_0x007d
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x007d:
            if (r10 != r1) goto L_0x0080
            return r1
        L_0x0080:
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OneTrustRepository.mo111524a(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: b */
    public final Context mo111525b() {
        return this.f90398a;
    }
}
