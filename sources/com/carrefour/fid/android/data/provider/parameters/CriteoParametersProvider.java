package com.carrefour.fid.android.data.provider.parameters;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.utilities.data.provider.C22678a;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoParametersProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoParametersProvider.kt\ncom/carrefour/fid/android/data/provider/parameters/CriteoParametersProvider\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n457#2:77\n403#2:78\n1238#3,4:79\n*S KotlinDebug\n*F\n+ 1 CriteoParametersProvider.kt\ncom/carrefour/fid/android/data/provider/parameters/CriteoParametersProvider\n*L\n30#1:77\n30#1:78\n30#1:79,4\n*E\n"})
public final class CriteoParametersProvider implements C22678a {

    /* renamed from: g */
    public static final int f90332g = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90333a;
    @C12579k

    /* renamed from: b */
    public final AppEnvironment f90334b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f90335c;
    @C12579k

    /* renamed from: d */
    public final AccountRepository f90336d;
    @C12579k

    /* renamed from: e */
    public final C37824l f90337e;

    /* renamed from: f */
    public CriteoParametersBuilder f90338f;

    @Inject
    public CriteoParametersProvider(@C10255b @C12579k Context context, @C12579k AppEnvironment appEnvironment, @C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository, @C12579k C37824l lVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(lVar, "getStoreRefUseCase");
        this.f90333a = context;
        this.f90334b = appEnvironment;
        this.f90335c = loginRepository;
        this.f90336d = accountRepository;
        this.f90337e = lVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m149972c(CriteoParametersProvider criteoParametersProvider, C38006h hVar, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return criteoParametersProvider.mo111472b(hVar, z, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c A[LOOP:0: B:16:0x0056->B:18:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo67021a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.Map<java.lang.String, java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoBffHeaders$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoBffHeaders$1 r0 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoBffHeaders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoBffHeaders$1 r0 = new com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoBffHeaders$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            r0.label = r3
            java.lang.Object r6 = r4.mo111472b(r5, r3, r0)
            if (r6 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.util.Map r6 = (java.util.Map) r6
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r0 = r6.size()
            int r0 = kotlin.collections.C10975r0.m41400j(r0)
            r5.<init>(r0)
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0056:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "criteo-"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r0 = r0.getValue()
            r5.put(r1, r0)
            goto L_0x0056
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider.mo67021a(com.carrefour.fid.android.domain.models.criteo.h, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111472b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r17, boolean r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.Map<java.lang.String, java.lang.String>> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoParameters$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoParameters$1 r2 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoParameters$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoParameters$1 r2 = new com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider$getCriteoParameters$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            java.lang.String r7 = "parametersBuilder"
            r8 = 0
            if (r4 == 0) goto L_0x004c
            if (r4 == r6) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.models.criteo.h r2 = (com.carrefour.fid.android.domain.models.criteo.C38006h) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x011d
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.criteo.h r4 = (com.carrefour.fid.android.domain.models.criteo.C38006h) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider r6 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider) r6
            kotlin.C11661u0.m45747n(r1)
            goto L_0x009e
        L_0x004c:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = new com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder
            android.content.Context r10 = r0.f90333a
            com.carrefour.fid.android.shared.util.environment.AppEnvironment r11 = r0.f90334b
            com.carrefour.fid.android.account.data.repositories.LoginRepository r12 = r0.f90335c
            com.carrefour.fid.android.account.data.repositories.AccountRepository r13 = r0.f90336d
            com.carrefour.fid.android.domain.interactors.service.l r14 = r0.f90337e
            r9 = r1
            r15 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.f90338f = r1
            boolean r1 = r17.mo117470D()
            if (r1 != 0) goto L_0x0074
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r0.f90338f
            if (r1 != 0) goto L_0x0071
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x0071:
            r1.mo111455b()
        L_0x0074:
            com.carrefour.fid.android.account.data.repositories.LoginRepository r1 = r0.f90335c
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r1 = r1.mo31354f()
            boolean r1 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r1)
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r17.mo117470D()
            if (r1 == 0) goto L_0x00a4
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r0.f90338f
            if (r1 != 0) goto L_0x008e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x008e:
            r2.L$0 = r0
            r4 = r17
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = r1.mo111469p(r2)
            if (r1 != r3) goto L_0x009d
            return r3
        L_0x009d:
            r6 = r0
        L_0x009e:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder) r1
            r1.mo111457d()
            goto L_0x00a7
        L_0x00a4:
            r4 = r17
            r6 = r0
        L_0x00a7:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r6.f90338f
            if (r1 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x00af:
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r6 = r4.mo117500z()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111463j(r6)
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r6 = r4.mo117493t()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111458e(r6)
            java.lang.String r6 = r4.mo117496v()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111460g(r6)
            java.util.List r6 = r4.mo117495u()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111459f(r6)
            java.util.List r6 = r4.mo117492s()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111456c(r6)
            java.util.List r6 = r4.mo117467A()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111465l(r6)
            java.util.List r6 = r4.mo117497w()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111461h(r6)
            java.util.List r6 = r4.mo117468B()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111466m(r6)
            java.lang.Integer r6 = r4.mo117498x()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111462i(r6)
            java.lang.Integer r6 = r4.mo117499y()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111464k(r6)
            java.lang.Boolean r6 = r4.mo117491r()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111454a(r6)
            java.lang.String r6 = r4.mo117469C()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111468o(r6)
            r2.L$0 = r4
            r2.L$1 = r8
            r2.label = r5
            java.lang.Object r1 = r1.mo111467n(r2)
            if (r1 != r3) goto L_0x011c
            return r3
        L_0x011c:
            r2 = r4
        L_0x011d:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder) r1
            boolean r2 = r2.mo117470D()
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r1 = r1.mo111470q(r2)
            java.util.HashMap r1 = r1.mo111471r()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider.mo111472b(com.carrefour.fid.android.domain.models.criteo.h, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
