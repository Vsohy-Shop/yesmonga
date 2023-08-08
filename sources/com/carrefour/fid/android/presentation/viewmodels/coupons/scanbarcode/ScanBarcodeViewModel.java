package com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.coupons.C37649g;
import com.carrefour.fid.android.domain.interactors.coupons.C37651i;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.C26330a;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0013\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR \u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/coupons/scanbarcode/ScanBarcodeViewModel;", "Landroidx/lifecycle/v0;", "", "productEan", "", "couponArticles", "Lkotlin/d2;", "j0", "Lcom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/a;", "modalBottomSheetType", "i0", "Lkotlinx/coroutines/c2;", "h0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "e0", "Lcom/carrefour/fid/android/domain/interactors/coupons/g;", "a", "Lcom/carrefour/fid/android/domain/interactors/coupons/g;", "isScanProductOnBoardingUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/i;", "b", "Lcom/carrefour/fid/android/domain/interactors/coupons/i;", "setScanProductViewedUseCase", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/scanbarcode/state/a;", "c", "Lkotlinx/coroutines/flow/j;", "_state", "Lkotlinx/coroutines/flow/u;", "d", "Lkotlinx/coroutines/flow/u;", "g0", "()Lkotlinx/coroutines/flow/u;", "state", "e", "_currentBottomSheetState", "f", "f0", "currentBottomSheetState", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/coupons/g;Lcom/carrefour/fid/android/domain/interactors/coupons/i;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nScanBarcodeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanBarcodeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/scanbarcode/ScanBarcodeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,68:1\n230#2,5:69\n230#2,5:74\n230#2,5:79\n*S KotlinDebug\n*F\n+ 1 ScanBarcodeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/scanbarcode/ScanBarcodeViewModel\n*L\n48#1:69,5\n55#1:74,5\n65#1:79,5\n*E\n"})
public final class ScanBarcodeViewModel extends C19476v0 {

    /* renamed from: g */
    public static final int f64331g = 8;
    @C12579k

    /* renamed from: a */
    public final C37649g f64332a;
    @C12579k

    /* renamed from: b */
    public final C37651i f64333b;
    @C12579k

    /* renamed from: c */
    public final C11940j<C26330a> f64334c;
    @C12579k

    /* renamed from: d */
    public final C11952u<C26330a> f64335d;
    @C12579k

    /* renamed from: e */
    public final C11940j<C23962a> f64336e;
    @C12579k

    /* renamed from: f */
    public final C11952u<C23962a> f64337f;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$1", mo22502f = "ScanBarcodeViewModel.kt", mo22503i = {}, mo22504l = {36}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$1 */
    public static final class C263221 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ ScanBarcodeViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C263221(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ScanBarcodeViewModel scanBarcodeViewModel = this.this$0;
                this.label = 1;
                if (scanBarcodeViewModel.mo76592h0(this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C263221) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    @Inject
    public ScanBarcodeViewModel(@C12579k C37649g gVar, @C12579k C37651i iVar) {
        Intrinsics.checkNotNullParameter(gVar, "isScanProductOnBoardingUseCase");
        Intrinsics.checkNotNullParameter(iVar, "setScanProductViewedUseCase");
        this.f64332a = gVar;
        this.f64333b = iVar;
        C11940j<C26330a> a = C11953v.m47628a(new C26330a(false, 1, (DefaultConstructorMarker) null));
        this.f64334c = a;
        C12074o0 a2 = C19500w0.m90846a(this);
        C11948r.C11949a aVar = C11948r.f29534a;
        this.f64335d = C11909g.m47392O1(a, a2, aVar.mo24272c(), new C26330a(false, 1, (DefaultConstructorMarker) null));
        C23962a.C23963a aVar2 = C23962a.C23963a.f60151b;
        C11940j<C23962a> a3 = C11953v.m47628a(aVar2);
        this.f64336e = a3;
        this.f64337f = C11909g.m47392O1(a3, C19500w0.m90846a(this), aVar.mo24272c(), aVar2);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C263221(this, (C11045c<? super C263221>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76589e0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$checkForOnBoarding$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$checkForOnBoarding$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$checkForOnBoarding$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$checkForOnBoarding$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel$checkForOnBoarding$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            r9.mo21858l()
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0058
        L_0x0047:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.coupons.g r9 = r8.f64332a
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r2 = r8
        L_0x0058:
            boolean r4 = kotlin.Result.m38709i(r9)
            r5 = 0
            if (r4 == 0) goto L_0x0060
            r9 = r5
        L_0x0060:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x0069
            boolean r9 = r9.booleanValue()
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.a> r4 = r2.f64334c
        L_0x006c:
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.a r7 = (com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.C26330a) r7
            com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.state.a r7 = r7.mo76602b(r9)
            boolean r6 = r4.mo24216e(r6, r7)
            if (r6 == 0) goto L_0x006c
            if (r9 != 0) goto L_0x008f
            com.carrefour.fid.android.domain.interactors.coupons.i r9 = r2.f64333b
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x008c
            return r1
        L_0x008c:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x008f:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel.mo76589e0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f0 */
    public final C11952u<C23962a> mo76590f0() {
        return this.f64337f;
    }

    @C12579k
    /* renamed from: g0 */
    public final C11952u<C26330a> mo76591g0() {
        return this.f64335d;
    }

    /* renamed from: h0 */
    public final Object mo76592h0(C11045c<? super C11723c2> cVar) {
        return C12079p0.m48266g(new ScanBarcodeViewModel$initState$2(this, (C11045c<? super ScanBarcodeViewModel$initState$2>) null), cVar);
    }

    /* renamed from: i0 */
    public final void mo76593i0(@C12579k C23962a aVar) {
        C23962a value;
        Intrinsics.checkNotNullParameter(aVar, "modalBottomSheetType");
        C11940j<C23962a> jVar = this.f64336e;
        do {
            value = jVar.getValue();
            C23962a aVar2 = value;
        } while (!jVar.mo24216e(value, aVar));
    }

    /* renamed from: j0 */
    public final void mo76594j0(@C12579k String str, @C12579k List<String> list) {
        C23962a value;
        Object obj;
        Intrinsics.checkNotNullParameter(str, "productEan");
        Intrinsics.checkNotNullParameter(list, "couponArticles");
        C11940j<C23962a> jVar = this.f64336e;
        do {
            value = jVar.getValue();
            C23962a aVar = value;
            if (list.contains(str)) {
                obj = C23962a.C23966d.f60157b;
            } else {
                obj = C23962a.C23964b.f60153b;
            }
        } while (!jVar.mo24216e(value, obj));
    }
}
