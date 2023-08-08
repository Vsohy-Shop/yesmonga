package com.carrefour.fid.android.account.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.headers.C13198c;
import com.carrefour.fid.android.account.data.service.C13210b;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.google.firebase.installations.local.C33093b;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nDQEAddressesRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DQEAddressesRepository.kt\ncom/carrefour/fid/android/account/data/repositories/DQEAddressesRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n*L\n1#1,110:1\n766#2:111\n857#2,2:112\n766#2:114\n857#2,2:115\n1549#2:117\n1620#2,3:118\n3#3:121\n*S KotlinDebug\n*F\n+ 1 DQEAddressesRepository.kt\ncom/carrefour/fid/android/account/data/repositories/DQEAddressesRepository\n*L\n29#1:111\n29#1:112,2\n50#1:114\n50#1:115,2\n78#1:117\n78#1:118,3\n78#1:121\n*E\n"})
public final class DQEAddressesRepository {

    /* renamed from: c */
    public static final int f32378c = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C13210b f32379a;
    @C12579k

    /* renamed from: b */
    public final C13198c f32380b;

    @Inject
    public DQEAddressesRepository(@C12579k C13210b bVar, @C12579k C13198c cVar) {
        Intrinsics.checkNotNullParameter(bVar, "dqeAddressesApiService");
        Intrinsics.checkNotNullParameter(cVar, "dqeAddressHeaders");
        this.f32379a = bVar;
        this.f32380b = cVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m57220c(DQEAddressesRepository dQEAddressesRepository, String str, String str2, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return dQEAddressesRepository.mo31345b(str, str2, cVar);
    }

    /* renamed from: a */
    public final String mo31344a(Address address) {
        String B = address.mo116677B();
        String S = address.mo116694S();
        String I = address.mo116684I();
        return C33093b.f80279g + B + "||" + S + C33093b.f80279g + I;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[Catch:{ Exception -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc A[Catch:{ Exception -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31345b(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12580l java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.LatLon>>> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocation$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocation$1 r3 = (com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocation$1 r3 = new com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocation$1
            r3.<init>(r0, r2)
        L_0x001e:
            r12 = r3
            java.lang.Object r2 = r12.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r12.label
            r5 = 1
            java.lang.String r15 = "Error during fetching DQE addresses"
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.C11661u0.m45747n(r2)     // Catch:{ Exception -> 0x00eb }
            goto L_0x0082
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r2)
            com.carrefour.fid.android.account.data.service.b r4 = r0.f32379a     // Catch:{ Exception -> 0x00eb }
            com.carrefour.fid.android.account.data.headers.c r2 = r0.f32380b     // Catch:{ Exception -> 0x00eb }
            java.util.HashMap r2 = r2.mo31318a()     // Catch:{ Exception -> 0x00eb }
            r6 = 0
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r8.<init>()     // Catch:{ Exception -> 0x00eb }
            r9 = r17
            r8.append(r9)     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x0067
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r9.<init>()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r10 = " "
            r9.append(r10)     // Catch:{ Exception -> 0x00eb }
            r9.append(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x00eb }
            r8.append(r1)     // Catch:{ Exception -> 0x00eb }
        L_0x0067:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ Exception -> 0x00eb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)     // Catch:{ Exception -> 0x00eb }
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 118(0x76, float:1.65E-43)
            r14 = 0
            r12.label = r5     // Catch:{ Exception -> 0x00eb }
            r5 = r2
            java.lang.Object r2 = com.carrefour.fid.android.account.data.service.C13210b.C13211a.m57257c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00eb }
            if (r2 != r3) goto L_0x0082
            return r3
        L_0x0082:
            retrofit2.w r2 = (retrofit2.C13091w) r2     // Catch:{ Exception -> 0x00eb }
            boolean r1 = r2.mo30576g()     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r2.mo30572a()     // Catch:{ Exception -> 0x00eb }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00cc
            java.util.Collection r1 = r1.values()     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00cc
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00eb }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r1)     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00cc
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00eb }
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r3)     // Catch:{ Exception -> 0x00eb }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00eb }
        L_0x00b1:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x00eb }
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x00eb }
            com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity r3 = (com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity) r3     // Catch:{ Exception -> 0x00eb }
            com.carrefour.fid.android.domain.models.LatLon r3 = com.carrefour.fid.android.account.data.entities.extentions.C13183f.m57151c(r3)     // Catch:{ Exception -> 0x00eb }
            r2.add(r3)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00b1
        L_0x00c5:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r1 = kotlin.Result.m38702b(r2)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fa
        L_0x00cc:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00eb }
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ Exception -> 0x00eb }
            r1.<init>(r15)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fa
        L_0x00dc:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00eb }
            com.carrefour.fid.android.shared.io.ResponseThrowable r1 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r2, r15)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fa
        L_0x00eb:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r15)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository.mo31345b(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31346d(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.LatLon>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocationFromPostalCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocationFromPostalCode$1 r0 = (com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocationFromPostalCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocationFromPostalCode$1 r0 = new com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getGeolocationFromPostalCode$1
            r0.<init>(r11, r13)
        L_0x0018:
            r7 = r0
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            java.lang.String r10 = "Error during fetching DQE addresses"
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            kotlin.C11661u0.m45747n(r13)     // Catch:{ Exception -> 0x008e }
            goto L_0x0050
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0034:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.account.data.service.b r1 = r11.f32379a     // Catch:{ Exception -> 0x008e }
            com.carrefour.fid.android.account.data.headers.c r13 = r11.f32380b     // Catch:{ Exception -> 0x008e }
            java.util.HashMap r13 = r13.mo31318a()     // Catch:{ Exception -> 0x008e }
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 22
            r9 = 0
            r7.label = r2     // Catch:{ Exception -> 0x008e }
            r2 = r13
            r5 = r12
            java.lang.Object r13 = com.carrefour.fid.android.account.data.service.C13210b.C13211a.m57255a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x008e }
            if (r13 != r0) goto L_0x0050
            return r0
        L_0x0050:
            retrofit2.w r13 = (retrofit2.C13091w) r13     // Catch:{ Exception -> 0x008e }
            boolean r12 = r13.mo30576g()     // Catch:{ Exception -> 0x008e }
            if (r12 == 0) goto L_0x007f
            java.lang.Object r12 = r13.mo30572a()     // Catch:{ Exception -> 0x008e }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ Exception -> 0x008e }
            if (r12 == 0) goto L_0x006d
            java.util.Collection r12 = r12.values()     // Catch:{ Exception -> 0x008e }
            if (r12 == 0) goto L_0x006d
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ Exception -> 0x008e }
            java.util.List r12 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r12)     // Catch:{ Exception -> 0x008e }
            goto L_0x006e
        L_0x006d:
            r12 = 0
        L_0x006e:
            if (r12 != 0) goto L_0x0074
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ Exception -> 0x008e }
        L_0x0074:
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x008e }
            java.util.List r12 = com.carrefour.fid.android.account.data.entities.extentions.C13184g.m57152a(r12)     // Catch:{ Exception -> 0x008e }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x007f:
            kotlin.Result$a r12 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x008e }
            com.carrefour.fid.android.shared.io.ResponseThrowable r12 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r13, r10)     // Catch:{ Exception -> 0x008e }
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)     // Catch:{ Exception -> 0x008e }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Throwable r12 = new java.lang.Throwable
            r12.<init>(r10)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x009d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository.mo31346d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31347e(@org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.account.domain.models.DQEAddressDomain>>> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getSuggestions$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getSuggestions$1 r2 = (com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getSuggestions$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getSuggestions$1 r2 = new com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$getSuggestions$1
            r2.<init>(r0, r1)
        L_0x001c:
            r11 = r2
            java.lang.Object r1 = r11.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r11.label
            java.lang.String r14 = "Error during fetching DQE addresses"
            r15 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r15) goto L_0x0030
            kotlin.C11661u0.m45747n(r1)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0056
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.account.data.service.b r3 = r0.f32379a     // Catch:{ Exception -> 0x00ba }
            com.carrefour.fid.android.account.data.headers.c r1 = r0.f32380b     // Catch:{ Exception -> 0x00ba }
            java.util.HashMap r4 = r1.mo31318a()     // Catch:{ Exception -> 0x00ba }
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 118(0x76, float:1.65E-43)
            r13 = 0
            r11.label = r15     // Catch:{ Exception -> 0x00ba }
            r7 = r17
            java.lang.Object r1 = com.carrefour.fid.android.account.data.service.C13210b.C13211a.m57256b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00ba }
            if (r1 != r2) goto L_0x0056
            return r2
        L_0x0056:
            retrofit2.w r1 = (retrofit2.C13091w) r1     // Catch:{ Exception -> 0x00ba }
            boolean r2 = r1.mo30576g()     // Catch:{ Exception -> 0x00ba }
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r1 = r1.mo30572a()     // Catch:{ Exception -> 0x00ba }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0098
            java.util.Collection r1 = r1.values()     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0098
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00ba }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x0077:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x0099
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x00ba }
            r4 = r3
            com.carrefour.fid.android.data.entities.DQEAddressSuggestionEntity r4 = (com.carrefour.fid.android.data.entities.DQEAddressSuggestionEntity) r4     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = r4.getAddress()     // Catch:{ Exception -> 0x00ba }
            r5 = 0
            if (r4 == 0) goto L_0x0092
            int r4 = r4.length()     // Catch:{ Exception -> 0x00ba }
            if (r4 <= 0) goto L_0x0092
            r5 = r15
        L_0x0092:
            if (r5 == 0) goto L_0x0077
            r2.add(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0077
        L_0x0098:
            r2 = 0
        L_0x0099:
            if (r2 != 0) goto L_0x009f
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ Exception -> 0x00ba }
        L_0x009f:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00ba }
            java.util.List r1 = com.carrefour.fid.android.account.data.entities.extentions.C13182e.m57148a(r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c9
        L_0x00aa:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00ba }
            com.carrefour.fid.android.account.io.DQEAddressThrowable r1 = new com.carrefour.fid.android.account.io.DQEAddressThrowable     // Catch:{ Exception -> 0x00ba }
            r1.<init>(r14)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c9
        L_0x00ba:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.DQEAddressThrowable r1 = new com.carrefour.fid.android.account.io.DQEAddressThrowable
            r1.<init>(r14)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository.mo31347e(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ Exception -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb A[Catch:{ Exception -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31348f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.Address r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.account.domain.models.DQEAddressDomain>>> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$verifyAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$verifyAddress$1 r2 = (com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$verifyAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$verifyAddress$1 r2 = new com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository$verifyAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            r11 = r2
            java.lang.Object r1 = r11.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r11.label
            java.lang.String r14 = "Error during fetching DQE addresses"
            r15 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r15) goto L_0x0030
            kotlin.C11661u0.m45747n(r1)     // Catch:{ Exception -> 0x00ca }
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.account.data.service.b r3 = r0.f32379a     // Catch:{ Exception -> 0x00ca }
            com.carrefour.fid.android.account.data.headers.c r1 = r0.f32380b     // Catch:{ Exception -> 0x00ca }
            java.util.HashMap r4 = r1.mo31318a()     // Catch:{ Exception -> 0x00ca }
            r5 = 0
            r6 = 0
            java.lang.String r7 = r16.mo31344a(r17)     // Catch:{ Exception -> 0x00ca }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 118(0x76, float:1.65E-43)
            r13 = 0
            r11.label = r15     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r1 = com.carrefour.fid.android.account.data.service.C13210b.C13211a.m57257c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00ca }
            if (r1 != r2) goto L_0x0058
            return r2
        L_0x0058:
            retrofit2.w r1 = (retrofit2.C13091w) r1     // Catch:{ Exception -> 0x00ca }
            boolean r2 = r1.mo30576g()     // Catch:{ Exception -> 0x00ca }
            if (r2 == 0) goto L_0x00bb
            java.lang.Object r1 = r1.mo30572a()     // Catch:{ Exception -> 0x00ca }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x00ca }
            if (r1 == 0) goto L_0x00a9
            java.util.Collection r1 = r1.values()     // Catch:{ Exception -> 0x00ca }
            if (r1 == 0) goto L_0x00a9
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x00ca }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ca }
            r2.<init>()     // Catch:{ Exception -> 0x00ca }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00ca }
        L_0x0079:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x00ca }
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x00ca }
            r4 = r3
            com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity r4 = (com.carrefour.fid.android.data.entities.DQEAddressVerificationEntity) r4     // Catch:{ Exception -> 0x00ca }
            java.lang.String r5 = r4.getAddress()     // Catch:{ Exception -> 0x00ca }
            r6 = 0
            if (r5 == 0) goto L_0x0095
            int r5 = r5.length()     // Catch:{ Exception -> 0x00ca }
            if (r5 <= 0) goto L_0x0095
            r5 = r15
            goto L_0x0096
        L_0x0095:
            r5 = r6
        L_0x0096:
            if (r5 == 0) goto L_0x00a3
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r4 = com.carrefour.fid.android.account.data.entities.extentions.C13183f.m57149a(r4)     // Catch:{ Exception -> 0x00ca }
            boolean r4 = com.carrefour.fid.android.account.domain.extension.C13244b.m57381b(r4)     // Catch:{ Exception -> 0x00ca }
            if (r4 == 0) goto L_0x00a3
            r6 = r15
        L_0x00a3:
            if (r6 == 0) goto L_0x0079
            r2.add(r3)     // Catch:{ Exception -> 0x00ca }
            goto L_0x0079
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            if (r2 != 0) goto L_0x00b0
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ Exception -> 0x00ca }
        L_0x00b0:
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00ca }
            java.util.List r1 = com.carrefour.fid.android.account.data.entities.extentions.C13183f.m57150b(r2)     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d9
        L_0x00bb:
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00ca }
            com.carrefour.fid.android.shared.io.ResponseThrowable r1 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r1, r14)     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r1 = kotlin.Result.m38702b(r1)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d9
        L_0x00ca:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r14)
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository.mo31348f(com.carrefour.fid.android.domain.models.account.Address, kotlin.coroutines.c):java.lang.Object");
    }
}
