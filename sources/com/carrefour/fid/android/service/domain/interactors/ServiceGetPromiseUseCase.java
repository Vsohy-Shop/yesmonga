package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetPromiseUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "Lcom/carrefour/fid/android/domain/interactors/service/g$a;", "param", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/service/models/k;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/service/g$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "remoteConfigRepository", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nServiceGetPromiseUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceGetPromiseUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceGetPromiseUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1#2:38\n288#3,2:39\n*S KotlinDebug\n*F\n+ 1 ServiceGetPromiseUseCase.kt\ncom/carrefour/fid/android/service/domain/interactors/ServiceGetPromiseUseCase\n*L\n21#1:39,2\n*E\n"})
public final class ServiceGetPromiseUseCase implements C37818g {
    @C12579k
    private final C37807b remoteConfigRepository;

    @Inject
    public ServiceGetPromiseUseCase(@C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.remoteConfigRepository = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172852invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38162k>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.domain.interactors.service.g$a r11 = (com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a) r11
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0052
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r12 = r10.remoteConfigRepository
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.OmrLad
            r2.<init>(r4)
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = r12.m172966invokegIAlus(r2, r0)
            if (r12 != r1) goto L_0x0052
            return r1
        L_0x0052:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r12)
            r1 = 0
            if (r0 != 0) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r1)
        L_0x005e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r0 = 0
            if (r12 == 0) goto L_0x0074
            boolean r12 = r11.mo115239h()
            if (r12 == 0) goto L_0x0074
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.Result.m38702b(r0)
            return r11
        L_0x0074:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.m r12 = r11.mo115238g()
            if (r12 == 0) goto L_0x00df
            java.util.List r12 = r12.mo119402d()
            if (r12 == 0) goto L_0x00df
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0088:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r12.next()
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            java.util.List r4 = r2.mo119367K()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x009e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r6
            com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$2$1$selector$1 r7 = new com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase$invoke$2$1$selector$1
            r7.<init>(r11)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r8 = r6.mo119176T()
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r9 = r11.mo115237f()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x00cc
            java.lang.Object r6 = r7.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00cc
            r6 = r3
            goto L_0x00cd
        L_0x00cc:
            r6 = r1
        L_0x00cd:
            if (r6 == 0) goto L_0x009e
            goto L_0x00d1
        L_0x00d0:
            r5 = r0
        L_0x00d1:
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r5
            if (r5 == 0) goto L_0x00db
            com.carrefour.fid.android.domain.models.service.models.k r4 = new com.carrefour.fid.android.domain.models.service.models.k
            r4.<init>(r2, r5)
            goto L_0x00dc
        L_0x00db:
            r4 = r0
        L_0x00dc:
            if (r4 == 0) goto L_0x0088
            r0 = r4
        L_0x00df:
            java.lang.Object r11 = kotlin.Result.m38702b(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase.m172852invokegIAlus(com.carrefour.fid.android.domain.interactors.service.g$a, kotlin.coroutines.c):java.lang.Object");
    }
}
