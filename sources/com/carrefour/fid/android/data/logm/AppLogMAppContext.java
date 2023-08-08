package com.carrefour.fid.android.data.logm;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.C13140a;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.logm.C38243b;
import com.carrefour.fid.android.logm.data.entities.AppContextAddressRequest;
import com.carrefour.fid.android.logm.data.entities.AppContextCardRequest;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAppLogMAppContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppLogMAppContext.kt\ncom/carrefour/fid/android/data/logm/AppLogMAppContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n1549#3:146\n1620#3,3:147\n1549#3:150\n1620#3,3:151\n*S KotlinDebug\n*F\n+ 1 AppLogMAppContext.kt\ncom/carrefour/fid/android/data/logm/AppLogMAppContext\n*L\n123#1:146\n123#1:147,3\n133#1:150\n133#1:151,3\n*E\n"})
public final class AppLogMAppContext implements C38243b {

    /* renamed from: b */
    public static final int f90270b = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f90271a;

    @C10267e({C10265a.class})
    @C10262b
    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/logm/AppLogMAppContext$a;", "", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "l", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "p", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "g", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.data.logm.AppLogMAppContext$a */
    public interface C36553a {
        @C12579k
        /* renamed from: a */
        AccountRepository mo33940a();

        @C12579k
        /* renamed from: g */
        C37566e0 mo33981g();

        @C12579k
        /* renamed from: l */
        LoginRepository mo34014l();

        @C12579k
        /* renamed from: p */
        C37823k mo34042p();
    }

    public AppLogMAppContext(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f90271a = C10864b0.m38748c(new AppLogMAppContext$entryPoint$2(context));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00df, code lost:
        r2.mo119790b((com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest) r14);
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e8, code lost:
        r14 = r5.mo111409q().mo34014l().mo31352d();
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r2;
        r0.label = 3;
        r14 = r5.mo111402j(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0101, code lost:
        if (r14 != r1) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0103, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        r2.mo119789a((com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest) r14);
        r14 = r5.mo111409q().mo33940a();
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = null;
        r0.label = 4;
        r14 = r14.mo31328m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        if (r14 != r1) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0121, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0122, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
        if (r14 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0125, code lost:
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r2;
        r0.label = 5;
        r14 = r5.mo111407o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        if (r14 != r1) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0135, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
        r2.mo119804o((com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest) r14);
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        r0.L$0 = r2;
        r0.L$1 = r2;
        r0.L$2 = null;
        r0.label = 6;
        r14 = r5.mo111406n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0149, code lost:
        if (r14 != r1) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        r0 = r2;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r1.mo119799j((com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest) r14);
        r14 = new com.google.gson.C33614e().mo97491z(r0.mo119791c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "Gson().toJson(appContext.build())");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0165, code lost:
        return r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111400a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.String> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLogM$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLogM$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLogM$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLogM$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLogM$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0079;
                case 2: goto L_0x0069;
                case 3: goto L_0x0058;
                case 4: goto L_0x004a;
                case 5: goto L_0x0039;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x002c:
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r1 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r0 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x014e
        L_0x0039:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r2 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r4 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r4
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r5 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r5
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0136
        L_0x004a:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r2 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r4 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r4
            kotlin.C11661u0.m45747n(r14)
            r5 = r4
            goto L_0x0123
        L_0x0058:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r2 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r4 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r4
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r5 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r5
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0105
        L_0x0069:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r2 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r4 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r4
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r5 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r5
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00df
        L_0x0079:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r2 = (com.carrefour.fid.android.logm.data.entities.AppContextRequest.C38272a) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r4 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r4
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            r5 = r4
            goto L_0x00c8
        L_0x008c:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.logm.data.entities.AppContextRequest$a r14 = new com.carrefour.fid.android.logm.data.entities.AppContextRequest$a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 15
            r11 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r2 = r13.mo111409q()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r2.mo34014l()
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r2 = r2.mo31354f()
            boolean r2 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r2)
            if (r2 == 0) goto L_0x00e6
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r2 = r13.mo111409q()
            com.carrefour.fid.android.domain.interactors.basket.e0 r2 = r2.mo33981g()
            r0.L$0 = r13
            r0.L$1 = r14
            r4 = 1
            r0.label = r4
            java.lang.Object r2 = r2.m172965invokeIoAF18A(r0)
            if (r2 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r5 = r13
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x00c8:
            boolean r14 = kotlin.Result.m38709i(r14)
            if (r14 != 0) goto L_0x00e8
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r2
            r14 = 2
            r0.label = r14
            java.lang.Object r14 = r5.mo111404l(r0)
            if (r14 != r1) goto L_0x00de
            return r1
        L_0x00de:
            r4 = r2
        L_0x00df:
            com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest r14 = (com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest) r14
            r2.mo119790b(r14)
            r2 = r4
            goto L_0x00e8
        L_0x00e6:
            r5 = r13
            r2 = r14
        L_0x00e8:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r14 = r5.mo111409q()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r14 = r14.mo34014l()
            java.lang.String r14 = r14.mo31352d()
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r2
            r4 = 3
            r0.label = r4
            java.lang.Object r14 = r5.mo111402j(r14, r0)
            if (r14 != r1) goto L_0x0104
            return r1
        L_0x0104:
            r4 = r2
        L_0x0105:
            com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest r14 = (com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest) r14
            r2.mo119789a(r14)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r14 = r5.mo111409q()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r14 = r14.mo33940a()
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r3
            r2 = 4
            r0.label = r2
            java.lang.Object r14 = r14.mo31328m(r0)
            if (r14 != r1) goto L_0x0122
            return r1
        L_0x0122:
            r2 = r4
        L_0x0123:
            if (r14 == 0) goto L_0x013c
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r2
            r14 = 5
            r0.label = r14
            java.lang.Object r14 = r5.mo111407o(r0)
            if (r14 != r1) goto L_0x0135
            return r1
        L_0x0135:
            r4 = r2
        L_0x0136:
            com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest r14 = (com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest) r14
            r2.mo119804o(r14)
            r2 = r4
        L_0x013c:
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r3
            r14 = 6
            r0.label = r14
            java.lang.Object r14 = r5.mo111406n(r0)
            if (r14 != r1) goto L_0x014c
            return r1
        L_0x014c:
            r0 = r2
            r1 = r0
        L_0x014e:
            com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest r14 = (com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest) r14
            r1.mo119799j(r14)
            com.google.gson.e r14 = new com.google.gson.e
            r14.<init>()
            com.carrefour.fid.android.logm.data.entities.AppContextRequest r0 = r0.mo119791c()
            java.lang.String r14 = r14.mo97491z(r0)
            java.lang.String r0 = "Gson().toJson(appContext.build())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111400a(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: b */
    public String mo111401b() {
        return C13140a.f32263e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111402j(java.lang.String r10, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextAccountRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextAccountRequest$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextAccountRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextAccountRequest$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextAccountRequest$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r10 = r0.L$2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r0
            kotlin.C11661u0.m45747n(r11)
            r4 = r10
            r5 = r1
            goto L_0x0074
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r2 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r2
            kotlin.C11661u0.m45747n(r11)
            goto L_0x005f
        L_0x004e:
            kotlin.C11661u0.m45747n(r11)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r9.mo111410r(r0)
            if (r11 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r9
        L_0x005f:
            java.util.List r11 = (java.util.List) r11
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r3
            java.lang.Object r0 = r2.mo111411s(r0)
            if (r0 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r5 = r10
            r4 = r11
            r11 = r0
            r0 = r2
        L_0x0074:
            r8 = r11
            java.util.List r8 = (java.util.List) r8
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r10 = r0.mo111409q()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r10 = r10.mo34014l()
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r10 = r10.mo31354f()
            boolean r6 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r10)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r10 = r0.mo111409q()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r10 = r10.mo34014l()
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r10 = r10.mo31354f()
            java.lang.String r7 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57142a(r10)
            com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest r10 = new com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111402j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final AppContextAddressRequest mo111403k(Address address) {
        return new AppContextAddressRequest(StringKt.m118901J(address.mo116677B()), StringKt.m118901J(address.mo116678C()), StringKt.m118901J(address.mo116679D()), address.mo116694S(), address.mo116683H().name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[LOOP:0: B:26:0x006c->B:28:0x0072, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111404l(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextBasketRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextBasketRequest$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextBasketRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextBasketRequest$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextBasketRequest$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r5 = r4.mo111409q()
            com.carrefour.fid.android.domain.interactors.basket.e0 r5 = r5.mo33981g()
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0053
            r5 = r1
        L_0x0053:
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            if (r5 == 0) goto L_0x005c
            java.lang.String r0 = r5.mo116822G()
            goto L_0x005d
        L_0x005c:
            r0 = r1
        L_0x005d:
            if (r5 == 0) goto L_0x0082
            java.util.List r5 = r5.mo116817B()
            if (r5 == 0) goto L_0x0082
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L_0x006c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.domain.models.offer.Offer r2 = (com.carrefour.fid.android.domain.models.offer.Offer) r2
            int r2 = r2.mo118012U()
            int r1 = r1 + r2
            goto L_0x006c
        L_0x007e:
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
        L_0x0082:
            com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest r5 = new com.carrefour.fid.android.logm.data.entities.AppContextBasketRequest
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111404l(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m */
    public final AppContextCardRequest mo111405m(UserCards userCards) {
        return new AppContextCardRequest(userCards.mo116759h(), userCards.mo116764l(), userCards.mo116763k());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111406n(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextFacilityRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextFacilityRequest$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextFacilityRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextFacilityRequest$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextFacilityRequest$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            int r1 = r0.I$1
            int r0 = r0.I$0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009d
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r2 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x005f
        L_0x0048:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r10 = r9.mo111409q()
            com.carrefour.fid.android.domain.interactors.service.k r10 = r10.mo34042p()
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r9
        L_0x005f:
            boolean r6 = kotlin.Result.m38709i(r10)
            r7 = 0
            if (r6 == 0) goto L_0x0067
            r10 = r7
        L_0x0067:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x0070
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            goto L_0x0071
        L_0x0070:
            r10 = r7
        L_0x0071:
            if (r10 == 0) goto L_0x007d
            com.carrefour.fid.android.shared.util.ServiceUtil r6 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r6 = r6.mo84133o(r10)
            if (r6 == 0) goto L_0x007d
            r6 = r5
            goto L_0x007e
        L_0x007d:
            r6 = r4
        L_0x007e:
            if (r10 == 0) goto L_0x008a
            com.carrefour.fid.android.shared.util.ServiceUtil r8 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r10 = r8.mo84132n(r10)
            if (r10 == 0) goto L_0x008a
            r10 = r5
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            r0.L$0 = r7
            r0.I$0 = r6
            r0.I$1 = r10
            r0.label = r3
            java.lang.Object r0 = r2.mo111408p(r0)
            if (r0 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r1 = r10
            r10 = r0
            r0 = r6
        L_0x009d:
            com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest r10 = (com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest) r10
            com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest r2 = new com.carrefour.fid.android.logm.data.entities.AppContextFacilityRequest
            if (r0 == 0) goto L_0x00a5
            r0 = r5
            goto L_0x00a6
        L_0x00a5:
            r0 = r4
        L_0x00a6:
            if (r1 == 0) goto L_0x00a9
            r4 = r5
        L_0x00a9:
            r2.<init>(r0, r4, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111406n(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111407o(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLoyaltyRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLoyaltyRequest$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLoyaltyRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLoyaltyRequest$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getAppContextLoyaltyRequest$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0084
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r2 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0058
        L_0x0041:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r8 = r7.mo111409q()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r8 = r8.mo33940a()
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo31329n(r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r7
        L_0x0058:
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            if (r8 == 0) goto L_0x0061
            java.util.List r8 = r8.mo116669w()
            goto L_0x0062
        L_0x0061:
            r8 = r5
        L_0x0062:
            com.carrefour.fid.android.domain.models.account.UserCards r8 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r8)
            if (r8 == 0) goto L_0x006d
            java.lang.String r8 = r8.mo116763k()
            goto L_0x006e
        L_0x006d:
            r8 = r5
        L_0x006e:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r2 = r2.mo111409q()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r2 = r2.mo33940a()
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.mo31329n(r0)
            if (r0 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0084:
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            if (r8 == 0) goto L_0x008d
            java.util.List r8 = r8.mo116669w()
            goto L_0x008e
        L_0x008d:
            r8 = r5
        L_0x008e:
            com.carrefour.fid.android.domain.models.account.UserCards r8 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r8)
            if (r8 == 0) goto L_0x0098
            java.lang.String r5 = r8.mo116759h()
        L_0x0098:
            com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyCardRequest r8 = new com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyCardRequest
            r8.<init>(r0, r5)
            com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest r0 = new com.carrefour.fid.android.logm.data.entities.AppContextLoyaltyRequest
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111407o(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111408p(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getChosenFacilityRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getChosenFacilityRequest$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getChosenFacilityRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getChosenFacilityRequest$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getChosenFacilityRequest$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0037:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r9 = r8.mo111409q()
            com.carrefour.fid.android.domain.interactors.service.k r9 = r9.mo34042p()
            r0.label = r3
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38709i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0053
            r9 = r1
        L_0x0053:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x0063
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r9.mo119354f()
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r0.mo119163G()
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            if (r9 == 0) goto L_0x0072
            com.carrefour.fid.android.domain.models.service.models.l r0 = r9.mo119352e()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r0.mo119393w()
            r4 = r0
            goto L_0x0073
        L_0x0072:
            r4 = r1
        L_0x0073:
            if (r9 == 0) goto L_0x0081
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r9.mo119354f()
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r0.mo119164H()
            r5 = r0
            goto L_0x0082
        L_0x0081:
            r5 = r1
        L_0x0082:
            if (r9 == 0) goto L_0x0090
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r9.mo119354f()
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.mo119167K()
            r7 = r0
            goto L_0x0091
        L_0x0090:
            r7 = r1
        L_0x0091:
            if (r9 == 0) goto L_0x009d
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            if (r9 == 0) goto L_0x009d
            java.lang.String r1 = r9.mo119180X()
        L_0x009d:
            r6 = r1
            com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest r9 = new com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111408p(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: q */
    public final C36553a mo111409q() {
        return (C36553a) this.f90271a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111410r(kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.logm.data.entities.AppContextAddressRequest>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getListAddresses$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getListAddresses$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getListAddresses$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getListAddresses$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getListAddresses$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r5 = r4.mo111409q()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r5.mo33940a()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo31329n(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x007b
            java.util.List r5 = r5.mo116668v()
            if (r5 == 0) goto L_0x007b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0067:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            com.carrefour.fid.android.logm.data.entities.AppContextAddressRequest r2 = r0.mo111403k(r2)
            r1.add(r2)
            goto L_0x0067
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 != 0) goto L_0x0082
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111410r(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111411s(kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.logm.data.entities.AppContextCardRequest>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.logm.AppLogMAppContext$getListCards$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getListCards$1 r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext$getListCards$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.logm.AppLogMAppContext$getListCards$1 r0 = new com.carrefour.fid.android.data.logm.AppLogMAppContext$getListCards$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.logm.AppLogMAppContext r0 = (com.carrefour.fid.android.data.logm.AppLogMAppContext) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.logm.AppLogMAppContext$a r5 = r4.mo111409q()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r5 = r5.mo33940a()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo31329n(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x007b
            java.util.List r5 = r5.mo116669w()
            if (r5 == 0) goto L_0x007b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0067:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.domain.models.account.UserCards r2 = (com.carrefour.fid.android.domain.models.account.UserCards) r2
            com.carrefour.fid.android.logm.data.entities.AppContextCardRequest r2 = r0.mo111405m(r2)
            r1.add(r2)
            goto L_0x0067
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 != 0) goto L_0x0082
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.logm.AppLogMAppContext.mo111411s(kotlin.coroutines.c):java.lang.Object");
    }
}
