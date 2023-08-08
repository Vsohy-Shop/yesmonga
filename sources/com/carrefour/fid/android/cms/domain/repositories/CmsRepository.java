package com.carrefour.fid.android.cms.domain.repositories;

import android.content.Context;
import com.carrefour.fid.android.cms.data.entities.DataCmsResponse;
import com.carrefour.fid.android.cms.data.extension.C40019a;
import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import com.google.gson.C33614e;
import dagger.hilt.android.qualifiers.C10255b;
import java.io.InputStream;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J!\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\bJ,\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t2\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\fJ(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\tH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\tH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0013J$\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0013J$\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0013J,\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\t2\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/repositories/CmsRepository;", "", "", "readLoyaltyCGUJsonFromAsset", "T", "fileName", "", "readCGUJsonFromAsset", "metiRef", "Lkotlin/Result;", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsCmsResponse;", "getCarouselsSlideFooter-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getCarouselsSlideFooter", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsOffersCmsResponse;", "getCarouselsOffers-gIAlu-s", "getCarouselsOffers", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "fetchPrimesFid-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "fetchPrimesFid", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "fetchLoyaltyBonus-IoAF18A", "fetchLoyaltyBonus", "fetchCguInfo-IoAF18A", "fetchCguInfo", "fetchCheckoutCgvInfo-IoAF18A", "fetchCheckoutCgvInfo", "Lcom/carrefour/fid/android/cms/data/entities/HomeNalCmsResponse;", "getHomePageNalMiniHubBlocks-gIAlu-s", "getHomePageNalMiniHubBlocks", "Lcom/carrefour/fid/android/cms/data/services/a;", "cmsApiService", "Lcom/carrefour/fid/android/cms/data/services/a;", "Lcom/carrefour/fid/android/cms/data/headers/a;", "cmsHeaders", "Lcom/carrefour/fid/android/cms/data/headers/a;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/carrefour/fid/android/cms/data/services/a;Lcom/carrefour/fid/android/cms/data/headers/a;Landroid/content/Context;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCmsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CmsRepository.kt\ncom/carrefour/fid/android/cms/domain/repositories/CmsRepository\n*L\n1#1,152:1\n122#1,12:153\n*S KotlinDebug\n*F\n+ 1 CmsRepository.kt\ncom/carrefour/fid/android/cms/domain/repositories/CmsRepository\n*L\n114#1:153,12\n*E\n"})
public final class CmsRepository {
    @C12579k
    private final Context appContext;
    /* access modifiers changed from: private */
    @C12579k
    public final C40023a cmsApiService;
    /* access modifiers changed from: private */
    @C12579k
    public final C40020a cmsHeaders;

    @Inject
    public CmsRepository(@C12579k C40023a aVar, @C12579k C40020a aVar2, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(aVar, "cmsApiService");
        Intrinsics.checkNotNullParameter(aVar2, "cmsHeaders");
        Intrinsics.checkNotNullParameter(context, "appContext");
        this.cmsApiService = aVar;
        this.cmsHeaders = aVar2;
        this.appContext = context;
    }

    private final /* synthetic */ <T> List<T> readCGUJsonFromAsset(String str) {
        try {
            InputStream open = this.appContext.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(open, "appContext.assets.open(fileName)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return (List) new C33614e().mo97480o(new String(bArr, C11602d.f28868b), new CmsRepository$readCGUJsonFromAsset$listType$1().getType());
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final String readLoyaltyCGUJsonFromAsset() {
        List list;
        try {
            InputStream open = this.appContext.getAssets().open("loyalty_cgu.json");
            Intrinsics.checkNotNullExpressionValue(open, "appContext.assets.open(fileName)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            list = (List) new C33614e().mo97480o(new String(bArr, C11602d.f28868b), new CmsRepository$readCGUJsonFromAsset$listType$1().getType());
        } catch (IllegalStateException e) {
            e.printStackTrace();
            list = null;
        }
        if (list != null) {
            return C40019a.m162992a((DataCmsResponse) CollectionsKt___CollectionsKt.m40479B2(C10976s.m41419k(new DataCmsResponse((String) null, (String) null, list, 3, (DefaultConstructorMarker) null))));
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchCguInfo-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173132fetchCguInfoIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$2 r5 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCguInfo$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173132fetchCguInfoIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchCheckoutCgvInfo-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173133fetchCheckoutCgvInfoIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$2 r5 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchCheckoutCgvInfo$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173133fetchCheckoutCgvInfoIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchLoyaltyBonus-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173134fetchLoyaltyBonusIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.domain.models.LoyaltyBonus>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$2 r5 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchLoyaltyBonus$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173134fetchLoyaltyBonusIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(message = "Please use fetchLoyaltyBonus()")
    @org.jetbrains.annotations.C12580l
    /* renamed from: fetchPrimesFid-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173135fetchPrimesFidIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$2 r5 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$fetchPrimesFid$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173135fetchPrimesFidIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getCarouselsOffers-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173136getCarouselsOffersgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.cms.data.entities.CarouselsOffersCmsResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$2 r6 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsOffers$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173136getCarouselsOffersgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getCarouselsSlideFooter-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173137getCarouselsSlideFootergIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.cms.data.entities.CarouselsCmsResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$2 r6 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getCarouselsSlideFooter$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173137getCarouselsSlideFootergIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getHomePageNalMiniHubBlocks-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m173138getHomePageNalMiniHubBlocksgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.cms.data.entities.HomeNalCmsResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$1 r0 = (com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$1 r0 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$2 r6 = new com.carrefour.fid.android.cms.domain.repositories.CmsRepository$getHomePageNalMiniHubBlocks$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.repositories.CmsRepository.m173138getHomePageNalMiniHubBlocksgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
