package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.C36458a0;
import com.carrefour.fid.android.data.entities.mapper.C36537w;
import com.carrefour.fid.android.data.entities.mapper.C36544y;
import com.carrefour.fid.android.data.logm.ParsingWithLog;
import com.carrefour.fid.android.data.provider.headers.C36577s;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.repositories.C38201i;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C8567o(parameters = 0)
public final class APIMProductsRepository implements C38201i, ParsingWithLog {

    /* renamed from: h */
    public static final int f90352h = 8;
    @C12579k

    /* renamed from: a */
    public final C36621b f90353a;
    @C12579k

    /* renamed from: b */
    public final C36544y f90354b;
    @C12579k

    /* renamed from: c */
    public final C36537w f90355c;
    @C12579k

    /* renamed from: d */
    public final C36458a0 f90356d;
    @C12579k

    /* renamed from: e */
    public final C36577s f90357e;
    @C12579k

    /* renamed from: f */
    public final C37694a f90358f;

    /* renamed from: g */
    public C13091w<?> f90359g;

    @Inject
    public APIMProductsRepository(@C12579k C36621b bVar, @C12579k C36544y yVar, @C12579k C36537w wVar, @C12579k C36458a0 a0Var, @C12579k C36577s sVar, @C12579k C37694a aVar) {
        Intrinsics.checkNotNullParameter(bVar, "productsService");
        Intrinsics.checkNotNullParameter(yVar, "requestParamMapper");
        Intrinsics.checkNotNullParameter(wVar, "productsAPIMapper");
        Intrinsics.checkNotNullParameter(a0Var, "suggestionMapper");
        Intrinsics.checkNotNullParameter(sVar, "searchHeaders");
        Intrinsics.checkNotNullParameter(aVar, "remoteLogUseCase");
        this.f90353a = bVar;
        this.f90354b = yVar;
        this.f90355c = wVar;
        this.f90356d = a0Var;
        this.f90357e = sVar;
        this.f90358f = aVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo111413a(@C12579k C37694a aVar, @C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        return ParsingWithLog.DefaultImpls.m149880a(this, aVar, str, cVar);
    }

    /* renamed from: b */
    public void mo111414b(@C12579k C13091w<?> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f90359g = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111477c(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12580l java.lang.Integer r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C37941a0>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$1 r0 = (com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$1 r0 = new com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$2 r14 = new com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.APIMProductsRepository.mo111477c(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111478d(boolean r20, @org.jetbrains.annotations.C12579k java.lang.String r21, @org.jetbrains.annotations.C12579k java.lang.String r22, @org.jetbrains.annotations.C12579k java.util.List<? extends com.carrefour.fid.android.domain.models.ProductListFilter> r23, int r24, @org.jetbrains.annotations.C12580l java.lang.Integer r25, @org.jetbrains.annotations.C12580l java.lang.String r26, @org.jetbrains.annotations.C12580l java.lang.String r27, @org.jetbrains.annotations.C12580l java.lang.String r28, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.models.SortModel r29, @org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.presentation.models.FacetModel> r30, @org.jetbrains.annotations.C12580l kotlin.Pair<java.lang.String, java.lang.String> r31, boolean r32, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38185w>> r33) {
        /*
            r19 = this;
            r0 = r33
            boolean r1 = r0 instanceof com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$1 r1 = (com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r15 = r19
            goto L_0x001e
        L_0x0017:
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$1 r1 = new com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$1
            r15 = r19
            r1.<init>(r15, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r14 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r13 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r13) goto L_0x0035
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0076
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$2 r0 = new com.carrefour.fid.android.data.repositories.APIMProductsRepository$fetchOffers$2
            r17 = 0
            r2 = r0
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r33 = r0
            r0 = r13
            r13 = r30
            r18 = r14
            r14 = r31
            r15 = r20
            r16 = r32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.label = r0
            r0 = r33
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            r1 = r18
            if (r0 != r1) goto L_0x0076
            return r1
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.APIMProductsRepository.mo111478d(boolean, java.lang.String, java.lang.String, java.util.List, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.presentation.models.SortModel, java.util.List, kotlin.Pair, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public C13091w<?> getResponse() {
        C13091w<?> wVar = this.f90359g;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }
}
