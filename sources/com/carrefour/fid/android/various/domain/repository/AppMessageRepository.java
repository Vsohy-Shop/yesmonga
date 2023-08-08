package com.carrefour.fid.android.various.domain.repository;

import com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore;
import com.carrefour.fid.android.various.data.datastore.entities.C22765a;
import com.carrefour.fid.android.various.data.datastore.entities.C22766b;
import com.carrefour.fid.android.various.domain.model.AppMessage;
import com.carrefour.fid.android.various.domain.model.AppMessageRecurrence;
import com.carrefour.fid.android.various.domain.model.AppMessageType;
import com.google.firebase.remoteconfig.C33563l;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppMessageRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageRepository.kt\ncom/carrefour/fid/android/various/domain/repository/AppMessageRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class AppMessageRepository {
    @C12579k

    /* renamed from: a */
    public final C33563l f58355a;
    @C12579k

    /* renamed from: b */
    public final AppMessageDataStore f58356b;

    /* renamed from: com.carrefour.fid.android.various.domain.repository.AppMessageRepository$a */
    public /* synthetic */ class C22793a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.various.domain.model.AppMessageType[] r0 = com.carrefour.fid.android.various.domain.model.AppMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.various.domain.model.AppMessageType r1 = com.carrefour.fid.android.various.domain.model.AppMessageType.BROADCAST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.various.domain.model.AppMessageType r1 = com.carrefour.fid.android.various.domain.model.AppMessageType.VERSION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.repository.AppMessageRepository.C22793a.<clinit>():void");
        }
    }

    @Inject
    public AppMessageRepository(@C12579k C33563l lVar, @C12579k AppMessageDataStore appMessageDataStore) {
        Intrinsics.checkNotNullParameter(lVar, "firebaseRemoteConfig");
        Intrinsics.checkNotNullParameter(appMessageDataStore, "appMessageDataStore");
        this.f58355a = lVar;
        this.f58356b = appMessageDataStore;
    }

    /* renamed from: a */
    public final AppMessageRecurrence mo67238a(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt == 0) {
            return AppMessageRecurrence.Blocker.INSTANCE;
        }
        C11466l a = C22765a.f58296a.mo67167a();
        int r = a.mo23049r();
        boolean z = false;
        if (parseInt <= a.mo23051w() && r <= parseInt) {
            z = true;
        }
        if (z) {
            return new AppMessageRecurrence.Warning(parseInt);
        }
        if (parseInt == 999) {
            return AppMessageRecurrence.Info.INSTANCE;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67239b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.various.domain.model.AppMessageType r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.various.domain.model.AppMessage>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.various.domain.repository.AppMessageRepository$getAppMessage$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository$getAppMessage$1 r0 = (com.carrefour.fid.android.various.domain.repository.AppMessageRepository$getAppMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository$getAppMessage$1 r0 = new com.carrefour.fid.android.various.domain.repository.AppMessageRepository$getAppMessage$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.various.domain.model.AppMessage r7 = (com.carrefour.fid.android.various.domain.model.AppMessage) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0075
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.various.domain.model.AppMessage r7 = (com.carrefour.fid.android.various.domain.model.AppMessage) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x008e
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.various.domain.model.AppMessage r8 = r6.mo67240c(r7)
            if (r8 != 0) goto L_0x0059
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.various.core.NoAppNotificationThrowable r8 = new com.carrefour.fid.android.various.core.NoAppNotificationThrowable
            r8.<init>(r7)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x0059:
            int[] r2 = com.carrefour.fid.android.various.domain.repository.AppMessageRepository.C22793a.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r4) goto L_0x007e
            if (r7 != r3) goto L_0x0078
            com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore r7 = r6.f58356b
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r7.mo67158g(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0075:
            com.carrefour.fid.android.various.domain.model.AppMessage r8 = (com.carrefour.fid.android.various.domain.model.AppMessage) r8
            goto L_0x0090
        L_0x0078:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x007e:
            com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore r7 = r6.f58356b
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r7.mo67157f(r0)
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x008e:
            com.carrefour.fid.android.various.domain.model.AppMessage r8 = (com.carrefour.fid.android.various.domain.model.AppMessage) r8
        L_0x0090:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r7)
            if (r0 != 0) goto L_0x009d
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x009d:
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence r0 = r7.getRecurrence()
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence$Blocker r1 = com.carrefour.fid.android.various.domain.model.AppMessageRecurrence.Blocker.INSTANCE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00b0
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0113
        L_0x00b0:
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence$Info r1 = com.carrefour.fid.android.various.domain.model.AppMessageRecurrence.Info.INSTANCE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00c5
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.various.core.NotificationAlreadyReceivedThrowable r7 = com.carrefour.fid.android.various.core.NotificationAlreadyReceivedThrowable.f58267a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0113
        L_0x00c5:
            boolean r0 = r0 instanceof com.carrefour.fid.android.various.domain.model.AppMessageRecurrence.Warning
            if (r0 == 0) goto L_0x0114
            java.lang.Long r0 = r8.getTimestamp()
            if (r0 != 0) goto L_0x00d6
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0113
        L_0x00d6:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r0 = r0.getTime()
            long r0 = r0.getTime()
            java.lang.Long r8 = r8.getTimestamp()
            long r2 = r8.longValue()
            long r0 = r0 - r2
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r8.convert(r0, r2)
            com.carrefour.fid.android.various.domain.model.AppMessageRecurrence r8 = r7.getRecurrence()
            int r8 = r8.getDelay()
            long r2 = (long) r8
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x010d
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.various.core.NotificationAlreadyReceivedThrowable r7 = com.carrefour.fid.android.various.core.NotificationAlreadyReceivedThrowable.f58267a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0113
        L_0x010d:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x0113:
            return r7
        L_0x0114:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.repository.AppMessageRepository.mo67239b(com.carrefour.fid.android.various.domain.model.AppMessageType, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public final AppMessage mo67240c(AppMessageType appMessageType) {
        C22766b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AppMessageRecurrence a;
        int i = C22793a.$EnumSwitchMapping$0[appMessageType.ordinal()];
        if (i == 1) {
            bVar = C22766b.C22768b.f58300a;
        } else if (i == 2) {
            bVar = C22766b.C22769c.f58307a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!bVar.mo67173f(mo67241d())) {
            return null;
        }
        String str6 = mo67241d().get(bVar.mo67171d());
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = mo67241d().get(bVar.mo67168a());
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = mo67241d().get(bVar.mo67170c());
        if (str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        String str9 = mo67241d().get(bVar.mo67174g());
        if (str9 == null) {
            str4 = "";
        } else {
            str4 = str9;
        }
        String str10 = mo67241d().get(bVar.mo67172e());
        if (str10 == null) {
            str5 = "";
        } else {
            str5 = str10;
        }
        String str11 = mo67241d().get(bVar.mo67169b());
        if (str11 == null || (a = mo67238a(str11)) == null) {
            return null;
        }
        return new AppMessage(str, str2, str3, str4, str5, a, (Long) null, appMessageType);
    }

    /* renamed from: d */
    public final Map<String, String> mo67241d() {
        return C22795b.m103040a(this.f58355a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67242e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.various.domain.model.AppMessage r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.domain.repository.AppMessageRepository$markAppMessageAsRead$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository$markAppMessageAsRead$1 r0 = (com.carrefour.fid.android.various.domain.repository.AppMessageRepository$markAppMessageAsRead$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.repository.AppMessageRepository$markAppMessageAsRead$1 r0 = new com.carrefour.fid.android.various.domain.repository.AppMessageRepository$markAppMessageAsRead$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore r6 = r4.f58356b     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.mo67162k(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.repository.AppMessageRepository.mo67242e(com.carrefour.fid.android.various.domain.model.AppMessage, kotlin.coroutines.c):java.lang.Object");
    }
}
