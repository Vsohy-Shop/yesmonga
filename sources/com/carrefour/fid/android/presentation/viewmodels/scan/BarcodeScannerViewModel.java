package com.carrefour.fid.android.presentation.viewmodels.scan;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a;
import com.carrefour.fid.android.scan.domain.interactors.GetScanTutorialHasBeenShownUseCase;
import com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/scan/BarcodeScannerViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/mvi/a$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/scan/mvi/a$c;", "intent", "Lkotlin/d2;", "l0", "(Lcom/carrefour/fid/android/presentation/viewmodels/scan/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "ean", "facilityServiceId", "j0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "i0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "k0", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;", "getOfferProductListUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "b", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/scan/domain/interactors/UpdateScanTutorialHasBeenShownUseCase;", "c", "Lcom/carrefour/fid/android/scan/domain/interactors/UpdateScanTutorialHasBeenShownUseCase;", "updateScanTutorialHasBeenShownUseCase", "Lcom/carrefour/fid/android/scan/domain/interactors/GetScanTutorialHasBeenShownUseCase;", "d", "Lcom/carrefour/fid/android/scan/domain/interactors/GetScanTutorialHasBeenShownUseCase;", "getScanTutorialHasBeenShownUseCase", "Lcom/carrefour/fid/android/domain/interactors/additionalorder/a;", "e", "Lcom/carrefour/fid/android/domain/interactors/additionalorder/a;", "getAdditionalOrderContextUseCase", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "f", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "checkRemoteConfigUseCase", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/list/GetOfferProductListUseCase;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/scan/domain/interactors/UpdateScanTutorialHasBeenShownUseCase;Lcom/carrefour/fid/android/scan/domain/interactors/GetScanTutorialHasBeenShownUseCase;Lcom/carrefour/fid/android/domain/interactors/additionalorder/a;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class BarcodeScannerViewModel extends BaseMVIViewModel<C27402a.C27407b, C27402a.C27413c> {

    /* renamed from: g */
    public static final int f66463g = 8;
    @C12579k

    /* renamed from: a */
    public final GetOfferProductListUseCase f66464a;
    @C12579k

    /* renamed from: b */
    public final LoyaltyPreferencesStorage f66465b;
    @C12579k

    /* renamed from: c */
    public final UpdateScanTutorialHasBeenShownUseCase f66466c;
    @C12579k

    /* renamed from: d */
    public final GetScanTutorialHasBeenShownUseCase f66467d;
    @C12579k

    /* renamed from: e */
    public final C37540a f66468e;
    @C12579k

    /* renamed from: f */
    public final C37807b f66469f;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$1", mo22502f = "BarcodeScannerViewModel.kt", mo22503i = {}, mo22504l = {35}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$1 */
    public static final class C273931 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ BarcodeScannerViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C273931(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object obj2;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                GetScanTutorialHasBeenShownUseCase e0 = this.this$0.f66467d;
                this.label = 1;
                obj2 = e0.m172824invokeIoAF18A(this);
                if (obj2 == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
                obj2 = ((Result) obj).mo21858l();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (Result.m38709i(obj2)) {
                obj2 = null;
            }
            if (Intrinsics.areEqual(obj2, (Object) C11064a.m42615a(false))) {
                this.this$0.publishState(C27402a.C27407b.C27410c.f66493b);
            } else {
                this.this$0.publishState(C27402a.C27407b.C27412e.f66497b);
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C273931) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BarcodeScannerViewModel(@C12579k GetOfferProductListUseCase getOfferProductListUseCase, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k UpdateScanTutorialHasBeenShownUseCase updateScanTutorialHasBeenShownUseCase, @C12579k GetScanTutorialHasBeenShownUseCase getScanTutorialHasBeenShownUseCase, @C12579k C37540a aVar, @C12579k C37807b bVar) {
        super(C27402a.C27407b.C27409b.f66491b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getOfferProductListUseCase, "getOfferProductListUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(updateScanTutorialHasBeenShownUseCase, "updateScanTutorialHasBeenShownUseCase");
        Intrinsics.checkNotNullParameter(getScanTutorialHasBeenShownUseCase, "getScanTutorialHasBeenShownUseCase");
        Intrinsics.checkNotNullParameter(aVar, "getAdditionalOrderContextUseCase");
        Intrinsics.checkNotNullParameter(bVar, "checkRemoteConfigUseCase");
        this.f66464a = getOfferProductListUseCase;
        this.f66465b = loyaltyPreferencesStorage;
        this.f66466c = updateScanTutorialHasBeenShownUseCase;
        this.f66467d = getScanTutorialHasBeenShownUseCase;
        this.f66468e = aVar;
        this.f66469f = bVar;
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C273931(this, (C11045c<? super C273931>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79686i0(kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$facilityServiceId$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$facilityServiceId$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$facilityServiceId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$facilityServiceId$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$facilityServiceId$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.additionalorder.a r5 = r4.f66468e
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r5 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.additionalorder.a r5 = (com.carrefour.fid.android.domain.models.additionalorder.C37952a) r5
            if (r5 == 0) goto L_0x0055
            java.lang.String r1 = r5.mo116800g()
        L_0x0055:
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = ""
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel.mo79686i0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79687j0(java.lang.String r9, java.lang.String r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$getProductOfferByEan$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$getProductOfferByEan$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$getProductOfferByEan$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$getProductOfferByEan$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$getProductOfferByEan$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel) r9
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r10 = r11.mo21858l()
            goto L_0x009f
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r10 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel) r4
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0082
        L_0x0053:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.shared.base.u$d r11 = r8.getCurrentState()
            boolean r11 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27412e
            if (r11 != 0) goto L_0x0061
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0061:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$b r11 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27409b.f66491b
            r8.publishState(r11)
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r11 = r8.f66464a
            java.util.List r9 = kotlin.collections.C10976s.m41419k(r9)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r2 = r8.mo79688k0(r0)
            if (r2 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r4 = r8
            r7 = r2
            r2 = r10
            r10 = r11
            r11 = r7
        L_0x0082:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r6 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r6.<init>(r9, r11, r2)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r10 = r10.m172988invokegIAlus(r6, r0)
            if (r10 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r9 = r4
        L_0x009f:
            java.lang.Throwable r11 = kotlin.Result.m38705e(r10)
            if (r11 == 0) goto L_0x00bc
            boolean r0 = r11 instanceof com.carrefour.fid.android.shared.p046io.ProductDetailsThrowable
            if (r0 == 0) goto L_0x00af
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$d r11 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27411d.f66495b
            r9.publishState(r11)
            goto L_0x00bc
        L_0x00af:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$a r0 = new com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$a
            r0.<init>(r11)
            r9.emitEvent(r0)
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$e r11 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27412e.f66497b
            r9.publishState(r11)
        L_0x00bc:
            boolean r11 = kotlin.Result.m38710j(r10)
            if (r11 == 0) goto L_0x00f0
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r10)
            com.carrefour.fid.android.domain.models.OfferProductDomain r10 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r10
            if (r10 == 0) goto L_0x00da
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$c r11 = new com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$c
            com.carrefour.fid.android.presentation.models.OfferProductModel r10 = com.carrefour.fid.android.domain.extension.C37507h.m153956h(r10)
            r11.<init>(r10)
            r9.emitEvent(r11)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
        L_0x00da:
            if (r5 != 0) goto L_0x00eb
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$a r10 = new com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$a
            java.lang.Throwable r11 = new java.lang.Throwable
            java.lang.String r0 = "There is no product?!"
            r11.<init>(r0)
            r10.<init>(r11)
            r9.emitEvent(r10)
        L_0x00eb:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$e r10 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27412e.f66497b
            r9.publishState(r10)
        L_0x00f0:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel.mo79687j0(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k0 */
    public final Object mo79688k0(C11045c<? super Boolean> cVar) {
        return this.f66465b.hasLoyaltyCard(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel$processIntent$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x00a1
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007b
        L_0x0044:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006b
        L_0x0050:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27414a
            if (r8 == 0) goto L_0x007e
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$a r7 = (com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27414a) r7
            java.lang.String r7 = r7.mo79721d()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.mo79686i0(r0)
            if (r8 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r6
        L_0x006b:
            java.lang.String r8 = (java.lang.String) r8
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r7 = r2.mo79687j0(r7, r8, r0)
            if (r7 != r1) goto L_0x007b
            return r1
        L_0x007b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x007e:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$b r8 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27415b.f66501a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00a7
            com.carrefour.fid.android.shared.base.u$d r7 = r6.getCurrentState()
            boolean r7 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27410c
            if (r7 == 0) goto L_0x00a0
            com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase r7 = r6.f66466c
            com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$a r8 = new com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$a
            r8.<init>(r5)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172825invokegIAlus(r8, r0)
            if (r7 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r7 = r6
        L_0x00a1:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$e r8 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27412e.f66497b
            r7.publishState(r8)
            goto L_0x00d7
        L_0x00a7:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$d r8 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27417d.f66505a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x00b5
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$c r7 = com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27407b.C27410c.f66493b
            r6.publishState(r7)
            goto L_0x00d7
        L_0x00b5:
            boolean r8 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27416c
            if (r8 == 0) goto L_0x00d7
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$c r7 = (com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a.C27413c.C27416c) r7
            com.carrefour.fid.android.presentation.models.OfferProductModel r8 = r7.mo79727d()
            com.carrefour.fid.android.presentation.models.ProductModel r8 = r8.mo121517o0()
            if (r8 == 0) goto L_0x00ca
            boolean r8 = r8.mo121867A()
            goto L_0x00cb
        L_0x00ca:
            r8 = 0
        L_0x00cb:
            com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$b r0 = new com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$b
            com.carrefour.fid.android.presentation.models.OfferProductModel r7 = r7.mo79727d()
            r0.<init>(r7, r8)
            r6.emitEvent(r0)
        L_0x00d7:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c, kotlin.coroutines.c):java.lang.Object");
    }
}
