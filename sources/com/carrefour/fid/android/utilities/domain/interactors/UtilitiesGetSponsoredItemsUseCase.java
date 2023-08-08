package com.carrefour.fid.android.utilities.domain.interactors;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.domain.interactors.luckycart.C37711e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import com.carrefour.fid.android.domain.models.criteo.C38001c;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.luckycart.C38048b;
import com.carrefour.fid.android.domain.utilities.C38207a;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nUtilitiesGetSponsoredItemsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilitiesGetSponsoredItemsUseCase.kt\ncom/carrefour/fid/android/utilities/domain/interactors/UtilitiesGetSponsoredItemsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class UtilitiesGetSponsoredItemsUseCase implements C37890c {
    @C12579k

    /* renamed from: a */
    public final Context f58091a;
    @C12579k

    /* renamed from: b */
    public final UtilitiesRepository f58092b;
    @C12579k

    /* renamed from: c */
    public final C37807b f58093c;
    @C12579k

    /* renamed from: d */
    public final C37668h f58094d;
    @C12579k

    /* renamed from: e */
    public final C37711e f58095e;
    @C12579k

    /* renamed from: f */
    public final C37518d f58096f;
    @C12579k

    /* renamed from: g */
    public final C37857d f58097g;
    @C12579k

    /* renamed from: v */
    public final C38328d f58098v;
    @C12579k

    /* renamed from: w */
    public final Map<C38006h, C38001c> f58099w = new LinkedHashMap();
    @C12579k

    /* renamed from: x */
    public final Map<C38048b, C38047a> f58100x = new LinkedHashMap();

    @Inject
    public UtilitiesGetSponsoredItemsUseCase(@C10255b @C12579k Context context, @C12579k UtilitiesRepository utilitiesRepository, @C12579k C37807b bVar, @C12579k C37668h hVar, @C12579k C37711e eVar, @C12579k C37518d dVar, @C12579k C37857d dVar2, @C12579k C38328d dVar3) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(utilitiesRepository, "repository");
        Intrinsics.checkNotNullParameter(bVar, "checkRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(hVar, "isCriteoPrivacyAcceptedUseCase");
        Intrinsics.checkNotNullParameter(eVar, "isPrivacyLuckyCartAcceptedUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getUserUidIamUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(dVar3, "performance");
        this.f58091a = context;
        this.f58092b = utilitiesRepository;
        this.f58093c = bVar;
        this.f58094d = hVar;
        this.f58095e = eVar;
        this.f58096f = dVar;
        this.f58097g = dVar2;
        this.f58098v = dVar3;
    }

    /* renamed from: d */
    public final C38207a mo67033d(C38207a aVar, C37890c.C37891a aVar2) {
        C38207a d;
        C38207a d2;
        C38001c cVar = this.f58099w.get(aVar2.mo115386g());
        C38047a aVar3 = this.f58100x.get(aVar2.mo115387h());
        if (!(cVar == null || (d2 = C38207a.m158440d(aVar, cVar, (C38047a) null, 2, (Object) null)) == null)) {
            aVar = d2;
        }
        if (aVar3 == null || (d = C38207a.m158440d(aVar, (C38001c) null, aVar3, 1, (Object) null)) == null) {
            return aVar;
        }
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67034e(kotlin.coroutines.C11045c<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getCriteoFeatureFlags$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getCriteoFeatureFlags$1 r0 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getCriteoFeatureFlags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getCriteoFeatureFlags$1 r0 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getCriteoFeatureFlags$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0083
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r2 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0064
        L_0x004c:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r7.f58093c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Criteo
            r2.<init>(r5)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r7
        L_0x0064:
            boolean r8 = kotlin.Result.m38710j(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r2 = r2.f58093c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r4 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.CriteoFlagship
            r4.<init>(r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.m172966invokegIAlus(r4, r0)
            if (r0 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0083:
            boolean r8 = kotlin.Result.m38710j(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase.mo67034e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67035f(kotlin.coroutines.C11045c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1 r0 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1 r0 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r6 = r5.f58093c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.LuckyCartProducts
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            boolean r6 = kotlin.Result.m38710j(r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase.mo67035f(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public final Pair<Boolean, Boolean> mo67036g(C37890c.C37891a aVar) {
        boolean z;
        C38001c cVar = this.f58099w.get(aVar.mo115386g());
        C38047a aVar2 = this.f58100x.get(aVar.mo115387h());
        boolean z2 = true;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (aVar2 != null || aVar.mo115387h() == null) {
            z2 = false;
        }
        return new Pair<>(valueOf, Boolean.valueOf(z2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67037h(kotlin.coroutines.C11045c<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.utilities.domain.interactors.C22683x1e9d3909
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getSponsoredItemsPrivacyFlags$1 r0 = (com.carrefour.fid.android.utilities.domain.interactors.C22683x1e9d3909) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getSponsoredItemsPrivacyFlags$1 r0 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$getSponsoredItemsPrivacyFlags$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            boolean r0 = r0.Z$0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x008e
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003d:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r2 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0063
        L_0x004b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.criteo.h r9 = r8.f58094d
            com.carrefour.fid.android.domain.interactors.criteo.h$a r2 = new com.carrefour.fid.android.domain.interactors.criteo.h$a
            android.content.Context r6 = r8.f58091a
            r2.<init>(r6)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r8
        L_0x0063:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            boolean r6 = kotlin.Result.m38709i(r9)
            if (r6 == 0) goto L_0x006e
            r9 = r5
        L_0x006e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.carrefour.fid.android.domain.interactors.luckycart.e r5 = r2.f58095e
            com.carrefour.fid.android.domain.interactors.luckycart.e$a r6 = new com.carrefour.fid.android.domain.interactors.luckycart.e$a
            android.content.Context r2 = r2.f58091a
            r6.<init>(r2)
            r2 = 0
            r0.L$0 = r2
            r0.Z$0 = r9
            r0.label = r4
            java.lang.Object r0 = r5.m172966invokegIAlus(r6, r0)
            if (r0 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x008e:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            boolean r2 = kotlin.Result.m38709i(r9)
            if (r2 == 0) goto L_0x0099
            r9 = r1
        L_0x0099:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r0)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r9)
            r1.<init>(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase.mo67037h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0284 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172804invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a r36, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.utilities.C38207a>> r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            boolean r2 = r1 instanceof com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$invoke$1 r2 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$invoke$1 r2 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            r9 = r2
            java.lang.Object r1 = r9.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r9.label
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            if (r3 == 0) goto L_0x00a9
            if (r3 == r10) goto L_0x0097
            if (r3 == r7) goto L_0x0084
            if (r3 == r6) goto L_0x006f
            if (r3 == r5) goto L_0x0052
            if (r3 != r4) goto L_0x004a
            java.lang.Object r2 = r9.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r2 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r2
            java.lang.Object r3 = r9.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r3 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r3
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0287
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0052:
            boolean r3 = r9.Z$4
            boolean r5 = r9.Z$3
            boolean r6 = r9.Z$2
            boolean r7 = r9.Z$1
            boolean r11 = r9.Z$0
            java.lang.Object r12 = r9.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r9.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r13 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r13
            java.lang.Object r14 = r9.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r14 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r14
            kotlin.C11661u0.m45747n(r1)
            r29 = r7
            goto L_0x0158
        L_0x006f:
            boolean r3 = r9.Z$1
            boolean r6 = r9.Z$0
            java.lang.Object r7 = r9.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r9.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r11 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r11
            java.lang.Object r12 = r9.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r12 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r12
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0117
        L_0x0084:
            java.lang.Object r3 = r9.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r9.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r7 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r7
            java.lang.Object r11 = r9.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r11 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r11
            kotlin.C11661u0.m45747n(r1)
            r12 = r11
            r11 = r7
            r7 = r3
            goto L_0x00e8
        L_0x0097:
            java.lang.Object r3 = r9.L$1
            com.carrefour.fid.android.domain.interactors.utilities.c$a r3 = (com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a) r3
            java.lang.Object r11 = r9.L$0
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase r11 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00c5
        L_0x00a9:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.performance.d r1 = r0.f58098v
            java.lang.String r3 = "get_sponsored_items"
            r1.mo121195d(r3)
            com.carrefour.fid.android.domain.interactors.slot.d r1 = r0.f58097g
            r9.L$0 = r0
            r3 = r36
            r9.L$1 = r3
            r9.label = r10
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r9)
            if (r1 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            r11 = r0
        L_0x00c5:
            boolean r12 = kotlin.Result.m38709i(r1)
            if (r12 == 0) goto L_0x00cc
            r1 = r8
        L_0x00cc:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = "1A"
        L_0x00d2:
            r9.L$0 = r11
            r9.L$1 = r3
            r9.L$2 = r1
            r9.label = r7
            java.lang.Object r7 = r11.mo67034e(r9)
            if (r7 != r2) goto L_0x00e1
            return r2
        L_0x00e1:
            r12 = r11
            r11 = r3
            r34 = r7
            r7 = r1
            r1 = r34
        L_0x00e8:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r1.mo21846a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r1 = r1.mo21847b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r9.L$0 = r12
            r9.L$1 = r11
            r9.L$2 = r7
            r9.Z$0 = r3
            r9.Z$1 = r1
            r9.label = r6
            java.lang.Object r6 = r12.mo67035f(r9)
            if (r6 != r2) goto L_0x0111
            return r2
        L_0x0111:
            r34 = r3
            r3 = r1
            r1 = r6
            r6 = r34
        L_0x0117:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            kotlin.Pair r13 = r12.mo67036g(r11)
            java.lang.Object r14 = r13.mo21846a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            java.lang.Object r13 = r13.mo21847b()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r9.L$0 = r12
            r9.L$1 = r11
            r9.L$2 = r7
            r9.Z$0 = r6
            r9.Z$1 = r3
            r9.Z$2 = r1
            r9.Z$3 = r14
            r9.Z$4 = r13
            r9.label = r5
            java.lang.Object r5 = r12.mo67037h(r9)
            if (r5 != r2) goto L_0x014e
            return r2
        L_0x014e:
            r29 = r3
            r3 = r13
            r13 = r11
            r11 = r6
            r6 = r1
            r1 = r5
            r5 = r14
            r14 = r12
            r12 = r7
        L_0x0158:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r7 = r1.mo21846a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r30 = r7.booleanValue()
            java.lang.Object r1 = r1.mo21847b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.carrefour.fid.android.domain.interactors.account.d r7 = r14.f58096f
            java.lang.String r7 = r7.invoke()
            int r15 = r7.length()
            r33 = 0
            if (r15 != 0) goto L_0x017e
            r15 = r10
            goto L_0x0180
        L_0x017e:
            r15 = r33
        L_0x0180:
            if (r15 == 0) goto L_0x0183
            r7 = r8
        L_0x0183:
            if (r11 != 0) goto L_0x0194
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r16 = "Criteo Feature Flag is disabled"
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119710r(r15, r16, r17, r18, r19, r20)
        L_0x0194:
            if (r29 != 0) goto L_0x01a5
            com.carrefour.fid.android.shared.util.i r21 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r22 = "Criteo Flagship Feature Flag is disabled"
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119710r(r21, r22, r23, r24, r25, r26)
        L_0x01a5:
            if (r6 != 0) goto L_0x01b6
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r16 = "LuckyCart Feature Flag is disabled"
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119710r(r15, r16, r17, r18, r19, r20)
        L_0x01b6:
            if (r5 != 0) goto L_0x01c7
            com.carrefour.fid.android.shared.util.i r21 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r22 = "Criteo call is disabled since cache will be used"
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r21, r22, r23, r24, r25, r26)
        L_0x01c7:
            if (r3 != 0) goto L_0x01d8
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r16 = "LuckyCart call is disabled since cache will be used"
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r15, r16, r17, r18, r19, r20)
        L_0x01d8:
            if (r30 != 0) goto L_0x01e9
            com.carrefour.fid.android.shared.util.i r21 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r22 = "Criteo consent was not accepted"
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119710r(r21, r22, r23, r24, r25, r26)
        L_0x01e9:
            if (r1 != 0) goto L_0x01fa
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r16 = "LuckyCart consent was not accepted"
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119710r(r15, r16, r17, r18, r19, r20)
        L_0x01fa:
            com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository r15 = r14.f58092b
            com.carrefour.fid.android.domain.models.criteo.h r16 = r13.mo115386g()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            if (r11 == 0) goto L_0x021e
            if (r5 == 0) goto L_0x021e
            r5 = r10
            goto L_0x0220
        L_0x021e:
            r5 = r33
        L_0x0220:
            r31 = 4095(0xfff, float:5.738E-42)
            r32 = 0
            r11 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r5
            com.carrefour.fid.android.domain.models.criteo.h r5 = com.carrefour.fid.android.domain.models.criteo.C38006h.m156554q(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.carrefour.fid.android.domain.models.luckycart.b r16 = r13.mo115387h()
            if (r16 == 0) goto L_0x0269
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            if (r6 == 0) goto L_0x025c
            if (r1 == 0) goto L_0x025c
            if (r3 == 0) goto L_0x025c
            r22 = r10
            goto L_0x025e
        L_0x025c:
            r22 = r33
        L_0x025e:
            r23 = 30
            r24 = 0
            r17 = r7
            com.carrefour.fid.android.domain.models.luckycart.b r1 = com.carrefour.fid.android.domain.models.luckycart.C38048b.m156926h(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x026a
        L_0x0269:
            r1 = r8
        L_0x026a:
            java.lang.String r6 = r13.mo115389i()
            java.lang.String r7 = r13.mo115390j()
            r9.L$0 = r14
            r9.L$1 = r13
            r9.L$2 = r8
            r9.label = r4
            r3 = r11
            r4 = r5
            r5 = r1
            r8 = r12
            java.lang.Object r1 = r3.mo67049a(r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L_0x0285
            return r2
        L_0x0285:
            r2 = r13
            r3 = r14
        L_0x0287:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 != 0) goto L_0x02a2
            com.carrefour.fid.android.domain.utilities.a r1 = (com.carrefour.fid.android.domain.utilities.C38207a) r1
            r3.mo67039j(r2, r1)
            com.carrefour.fid.android.performance.d r4 = r3.f58098v
            r4.mo121196e()
            kotlin.Result$a r4 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.utilities.a r1 = r3.mo67033d(r1, r2)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x02d9
        L_0x02a2:
            java.util.Map<com.carrefour.fid.android.domain.models.criteo.h, com.carrefour.fid.android.domain.models.criteo.c> r1 = r3.f58099w
            com.carrefour.fid.android.domain.models.criteo.h r5 = r2.mo115386g()
            java.lang.Object r1 = r1.get(r5)
            com.carrefour.fid.android.domain.models.criteo.c r1 = (com.carrefour.fid.android.domain.models.criteo.C38001c) r1
            java.util.Map<com.carrefour.fid.android.domain.models.luckycart.b, com.carrefour.fid.android.domain.models.luckycart.a> r5 = r3.f58100x
            com.carrefour.fid.android.domain.models.luckycart.b r2 = r2.mo115387h()
            java.lang.Object r2 = r5.get(r2)
            com.carrefour.fid.android.domain.models.luckycart.a r2 = (com.carrefour.fid.android.domain.models.luckycart.C38047a) r2
            com.carrefour.fid.android.performance.d r3 = r3.f58098v
            r3.mo121196e()
            if (r1 != 0) goto L_0x02ce
            if (r2 != 0) goto L_0x02ce
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x02d9
        L_0x02ce:
            kotlin.Result$a r3 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.utilities.a r3 = new com.carrefour.fid.android.domain.utilities.a
            r3.<init>(r1, r2)
            java.lang.Object r1 = kotlin.Result.m38702b(r3)
        L_0x02d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase.m172804invokegIAlus(com.carrefour.fid.android.domain.interactors.utilities.c$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j */
    public final void mo67039j(C37890c.C37891a aVar, C38207a aVar2) {
        if (aVar2.mo119628e() != null) {
            Map<C38006h, C38001c> map = this.f58099w;
            C38006h g = aVar.mo115386g();
            C38001c e = aVar2.mo119628e();
            Intrinsics.checkNotNull(e, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.criteo.CriteoDomain");
            map.put(g, e);
        }
        if (aVar.mo115387h() != null && aVar2.mo119630f() != null) {
            Map<C38048b, C38047a> map2 = this.f58100x;
            C38048b h = aVar.mo115387h();
            Intrinsics.checkNotNull(h, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.luckycart.LuckyCartParameters");
            C38047a f = aVar2.mo119630f();
            Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.luckycart.LuckyCartBannerDetails");
            map2.put(h, f);
        }
    }
}
