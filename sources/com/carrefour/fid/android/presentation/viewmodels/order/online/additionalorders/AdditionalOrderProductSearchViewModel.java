package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.lifecycle.C10245a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"StaticFieldLeak"})
@C10245a
@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B=\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderProductSearchViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/c$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/c$c;", "intent", "Lkotlin/d2;", "l0", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/c$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "terms", "h0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "i0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "keyword", "k0", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;", "getProductSearchSuggestionsUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;", "addSearchHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;", "clearSearchHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;", "getSearchHistoryUseCase", "Landroid/content/Context;", "e", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/search/GetProductSearchSuggestionsUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/AddSearchHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/ClearSearchHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchHistoryUseCase;Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderProductSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderProductSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderProductSearchViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n11335#2:138\n11670#2,3:139\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderProductSearchViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderProductSearchViewModel\n*L\n105#1:138\n105#1:139,3\n*E\n"})
public final class AdditionalOrderProductSearchViewModel extends BaseMVIViewModel<C26866c.C26869b, C26866c.C26870c> {

    /* renamed from: f */
    public static final int f65214f = 8;
    @C12579k

    /* renamed from: a */
    public final GetProductSearchSuggestionsUseCase f65215a;
    @C12579k

    /* renamed from: b */
    public final AddSearchHistoryUseCase f65216b;
    @C12579k

    /* renamed from: c */
    public final ClearSearchHistoryUseCase f65217c;
    @C12579k

    /* renamed from: d */
    public final GetSearchHistoryUseCase f65218d;
    @C12579k

    /* renamed from: e */
    public final Context f65219e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AdditionalOrderProductSearchViewModel(@C12579k GetProductSearchSuggestionsUseCase getProductSearchSuggestionsUseCase, @C12579k AddSearchHistoryUseCase addSearchHistoryUseCase, @C12579k ClearSearchHistoryUseCase clearSearchHistoryUseCase, @C12579k GetSearchHistoryUseCase getSearchHistoryUseCase, @C10255b @C12579k Context context, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        super(new C26866c.C26869b(false, (C38529u) null, 3, (DefaultConstructorMarker) null), coroutineDispatcher, (C19456p0) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getProductSearchSuggestionsUseCase, "getProductSearchSuggestionsUseCase");
        Intrinsics.checkNotNullParameter(addSearchHistoryUseCase, "addSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(clearSearchHistoryUseCase, "clearSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(getSearchHistoryUseCase, "getSearchHistoryUseCase");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f65215a = getProductSearchSuggestionsUseCase;
        this.f65216b = addSearchHistoryUseCase;
        this.f65217c = clearSearchHistoryUseCase;
        this.f65218d = getSearchHistoryUseCase;
        this.f65219e = context;
        sendIntent(C26866c.C26870c.C26874d.f65494a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77663h0(java.lang.String r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$addTermsToSearchHistory$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$addTermsToSearchHistory$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$addTermsToSearchHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$addTermsToSearchHistory$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$addTermsToSearchHistory$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r6) goto L_0x003a
            if (r2 != r5) goto L_0x0032
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0094
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0081
        L_0x0048:
            kotlin.C11661u0.m45747n(r9)
            java.lang.CharSequence r9 = kotlin.text.StringsKt__StringsKt.trim(r8)
            java.lang.String r9 = r9.toString()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x005b
            r9 = r6
            goto L_0x005c
        L_0x005b:
            r9 = r3
        L_0x005c:
            if (r9 == 0) goto L_0x0061
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0061:
            com.carrefour.fid.android.shared.base.u$d r9 = r7.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r9 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r9, r6, r4, r5, r4)
            r7.publishState(r9)
            com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase r9 = r7.f65216b
            com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase$a
            r2.<init>(r8)
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r9 = r9.m172994invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r8 = r7
        L_0x0081:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 == 0) goto L_0x0094
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r9 = r8.mo77665j0(r0)
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r9
            boolean r9 = r9.mo78022i()
            if (r9 == 0) goto L_0x00ad
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r9 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r9
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r9 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r9, r3, r4, r5, r4)
            r8.publishState(r9)
        L_0x00ad:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel.mo77663h0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77664i0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$clearSearchHistory$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$clearSearchHistory$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$clearSearchHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$clearSearchHistory$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$clearSearchHistory$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L_0x0049
            if (r2 == r3) goto L_0x003b
            if (r2 != r5) goto L_0x0033
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x007f
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0067
        L_0x0049:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r6.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r7
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r7 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r7, r3, r4, r5, r4)
            r6.publishState(r7)
            com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase r7 = r6.f65217c
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172995invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            boolean r3 = kotlin.Result.m38710j(r7)
            if (r3 == 0) goto L_0x0081
            r3 = r7
            kotlin.d2 r3 = (kotlin.C11079d2) r3
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r0 = r2.mo77665j0(r0)
            if (r0 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r1 = r7
            r0 = r2
        L_0x007f:
            r2 = r0
            r7 = r1
        L_0x0081:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x008f
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a
            r0.<init>(r7)
            r2.emitEvent(r0)
        L_0x008f:
            com.carrefour.fid.android.shared.base.u$d r7 = r2.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r7
            boolean r7 = r7.mo78022i()
            if (r7 == 0) goto L_0x00a9
            com.carrefour.fid.android.shared.base.u$d r7 = r2.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r7
            r0 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r7 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r7, r0, r4, r5, r4)
            r2.publishState(r7)
        L_0x00a9:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel.mo77664i0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9 A[LOOP:0: B:33:0x00b7->B:34:0x00b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77665j0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26725xdce342de
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getLatestOrFrequentSuggestions$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26725xdce342de) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getLatestOrFrequentSuggestions$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getLatestOrFrequentSuggestions$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0040
            if (r4 != r6) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x006b
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r18.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r1 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r1
            boolean r1 = r1.mo78022i()
            if (r1 != 0) goto L_0x005d
            com.carrefour.fid.android.shared.base.u$d r1 = r18.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r1 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r1
            r4 = 2
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r1 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r1, r6, r5, r4, r5)
            r0.publishState(r1)
        L_0x005d:
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase r1 = r0.f65218d
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.m172997invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x006a
            return r3
        L_0x006a:
            r2 = r0
        L_0x006b:
            boolean r3 = kotlin.Result.m38709i(r1)
            if (r3 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r5 = r1
        L_0x0073:
            com.carrefour.fid.android.presentation.models.u r5 = (com.carrefour.fid.android.presentation.models.C38529u) r5
            boolean r1 = kotlin.Result.m38710j(r1)
            r3 = 0
            if (r1 == 0) goto L_0x009a
            if (r5 == 0) goto L_0x008e
            java.util.List r1 = r5.mo122169g()
            if (r1 == 0) goto L_0x008e
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 != r6) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r6 = r3
        L_0x008f:
            if (r6 == 0) goto L_0x009a
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r1 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b
            r1.<init>(r3, r5)
            r2.publishState(r1)
            goto L_0x00e5
        L_0x009a:
            com.carrefour.fid.android.presentation.models.SuggestionType r7 = com.carrefour.fid.android.presentation.models.SuggestionType.FREQUENT
            r8 = 0
            android.content.Context r1 = r2.f65219e
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2130903046(0x7f030006, float:1.7412899E38)
            java.lang.String[] r1 = r1.getStringArray(r4)
            java.lang.String r4 = "context.resources.getStr…rray.default_search_list)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r4 = r1.length
            r9.<init>(r4)
            int r4 = r1.length
            r5 = r3
        L_0x00b7:
            if (r5 >= r4) goto L_0x00d5
            r12 = r1[r5]
            com.carrefour.fid.android.presentation.models.v r6 = new com.carrefour.fid.android.presentation.models.v
            com.carrefour.fid.android.presentation.models.SuggestionType r11 = com.carrefour.fid.android.presentation.models.SuggestionType.FREQUENT
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r10)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 28
            r17 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r9.add(r6)
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00d5:
            r10 = 2
            r11 = 0
            com.carrefour.fid.android.presentation.models.u r1 = new com.carrefour.fid.android.presentation.models.u
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r4 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b
            r4.<init>(r3, r1)
            r2.publishState(r4)
        L_0x00e5:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel.mo77665j0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77666k0(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getSuggestionsFromTerms$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getSuggestionsFromTerms$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getSuggestionsFromTerms$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getSuggestionsFromTerms$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getSuggestionsFromTerms$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0078
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = kotlin.text.C11622t.isBlank(r7)
            if (r8 == 0) goto L_0x0058
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a r7 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a
            java.lang.Throwable r8 = new java.lang.Throwable
            java.lang.String r0 = "Search terms are empty or blank"
            r8.<init>(r0)
            r7.<init>(r8)
            r6.emitEvent(r7)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0058:
            com.carrefour.fid.android.shared.base.u$d r8 = r6.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r8
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r8 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r8, r4, r5, r3, r5)
            r6.publishState(r8)
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase r8 = r6.f65215a
            com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase$a
            r2.<init>(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r8.m172996invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r7 = r6
        L_0x0078:
            boolean r0 = kotlin.Result.m38710j(r8)
            r1 = 0
            if (r0 == 0) goto L_0x008f
            r0 = r8
            com.carrefour.fid.android.presentation.models.u r0 = (com.carrefour.fid.android.presentation.models.C38529u) r0
            com.carrefour.fid.android.shared.base.u$d r2 = r7.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r2 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r2
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r0 = r2.mo78020g(r1, r0)
            r7.publishState(r0)
        L_0x008f:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x00aa
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a r0 = new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a
            r0.<init>(r8)
            r7.emitEvent(r0)
            com.carrefour.fid.android.shared.base.u$d r8 = r7.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r8 = (com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b) r8
            com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b r8 = com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c.C26869b.m113917h(r8, r1, r5, r3, r5)
            r7.publishState(r8)
        L_0x00aa:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel.mo77666k0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: l0 */
    public Object processIntent(@C12579k C26866c.C26870c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C26866c.C26870c.C26871a) {
            Object h0 = mo77663h0(((C26866c.C26870c.C26871a) cVar).mo78027d(), cVar2);
            if (h0 == C11063b.m42612h()) {
                return h0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26866c.C26870c.C26872b) {
            Object i0 = mo77664i0(cVar2);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C26866c.C26870c.C26873c) {
            Object k0 = mo77666k0(((C26866c.C26870c.C26873c) cVar).mo78033d(), cVar2);
            if (k0 == C11063b.m42612h()) {
                return k0;
            }
            return C11079d2.f28267a;
        } else if (!Intrinsics.areEqual((Object) cVar, (Object) C26866c.C26870c.C26874d.f65494a)) {
            return C11079d2.f28267a;
        } else {
            Object j0 = mo77665j0(cVar2);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        }
    }
}
