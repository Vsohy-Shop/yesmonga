package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.CritizrSDK.C21423b;
import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37815d;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27121d;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27156h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11621s;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

@C10245a
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b5\u00106J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J!\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020$0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0000X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel;", "Landroidx/lifecycle/v0;", "Landroid/content/Context;", "context", "", "storeRef", "Lkotlin/d2;", "l0", "h0", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "i0", "", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "servicesList", "j0", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g0", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/d;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/d;", "fetchStoreServicesPictosUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase;", "c", "Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase;", "getStorePetrolInfoUseCase", "Lcom/CritizrSDK/c;", "d", "Lcom/CritizrSDK/c;", "critizrSDK", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/d;", "e", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "f", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/c;", "g", "Lkotlinx/coroutines/flow/j;", "k0", "()Lkotlinx/coroutines/flow/j;", "state", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;Lcom/carrefour/fid/android/domain/interactors/service/d;Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase;Lcom/CritizrSDK/c;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPhysicalStoreInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n230#2,5:170\n230#2,5:175\n230#2,5:197\n230#2,5:202\n230#2,5:207\n230#2,5:212\n230#2,5:217\n1549#3:180\n1620#3,3:181\n1855#3:184\n661#3,11:185\n1856#3:196\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel\n*L\n54#1:170,5\n119#1:175,5\n139#1:197,5\n141#1:202,5\n151#1:207,5\n163#1:212,5\n165#1:217,5\n122#1:180\n122#1:181,3\n125#1:184\n126#1:185,11\n125#1:196\n*E\n"})
public final class PhysicalStoreInfoViewModel extends C19476v0 {

    /* renamed from: h */
    public static final int f65987h = 8;
    @C12579k

    /* renamed from: a */
    public final C37832c f65988a;
    @C12579k

    /* renamed from: b */
    public final C37815d f65989b;
    @C12579k

    /* renamed from: c */
    public final GetStorePetrolInfoUseCase f65990c;
    @C12579k

    /* renamed from: d */
    public final C21424c f65991d;
    @C12579k

    /* renamed from: e */
    public final C11744g<C27121d> f65992e;
    @C12579k

    /* renamed from: f */
    public final C11907e<C27121d> f65993f;
    @C12579k

    /* renamed from: g */
    public final C11940j<C27145c> f65994g = C11953v.m47628a(new C27145c((C27164j) null, (C27152g) null, (C27160i) null, (C27156h) null, 15, (DefaultConstructorMarker) null));

    @C11363r0({"SMAP\nPhysicalStoreInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel$fetchRating$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,169:1\n230#2,5:170\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/info/PhysicalStoreInfoViewModel$fetchRating$1\n*L\n104#1:170,5\n110#1:175,5\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$a */
    public static final class C27134a implements C21423b {

        /* renamed from: a */
        public final /* synthetic */ PhysicalStoreInfoViewModel f65995a;

        public C27134a(PhysicalStoreInfoViewModel physicalStoreInfoViewModel) {
            this.f65995a = physicalStoreInfoViewModel;
        }

        /* renamed from: d0 */
        public void mo63892d0() {
            C27145c value;
            C11940j<C27145c> k0 = this.f65995a.mo78889k0();
            do {
                value = k0.getValue();
            } while (!k0.mo24216e(value, C27145c.m114705f(value, (C27164j) null, (C27152g) null, (C27160i) null, C27156h.C27157a.f66026a, 7, (Object) null)));
        }

        /* renamed from: i0 */
        public void mo63893i0(double d) {
            C27145c value;
            C11940j<C27145c> k0 = this.f65995a.mo78889k0();
            do {
                value = k0.getValue();
            } while (!k0.mo24216e(value, C27145c.m114705f(value, (C27164j) null, (C27152g) null, (C27160i) null, new C27156h.C27159c(d, 0, 2, (DefaultConstructorMarker) null), 7, (Object) null)));
        }

        /* renamed from: k0 */
        public void mo63894k0() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$b */
    public static final class C27135b implements C21423b {
        /* renamed from: d0 */
        public void mo63892d0() {
        }

        /* renamed from: i0 */
        public void mo63893i0(double d) {
        }

        /* renamed from: k0 */
        public void mo63894k0() {
        }
    }

    @Inject
    public PhysicalStoreInfoViewModel(@C12579k C37832c cVar, @C12579k C37815d dVar, @C12579k GetStorePetrolInfoUseCase getStorePetrolInfoUseCase, @C12579k C21424c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "getFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(dVar, "fetchStoreServicesPictosUseCase");
        Intrinsics.checkNotNullParameter(getStorePetrolInfoUseCase, "getStorePetrolInfoUseCase");
        Intrinsics.checkNotNullParameter(cVar2, "critizrSDK");
        this.f65988a = cVar;
        this.f65989b = dVar;
        this.f65990c = getStorePetrolInfoUseCase;
        this.f65991d = cVar2;
        C11744g<C27121d> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f65992e = d;
        this.f65993f = C11909g.m47490s1(d);
        mo78886h0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a A[SYNTHETIC, Splitter:B:25:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78884g0(com.carrefour.fid.android.domain.models.service.models.C38163l r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPetrolInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPetrolInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPetrolInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPetrolInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchPetrolInfo$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0084
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.shared.util.ServiceUtil r11 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            java.lang.String r10 = r11.mo84125g(r10)
            if (r10 != 0) goto L_0x0064
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r11 = r9.f65994g
        L_0x0048:
            java.lang.Object r10 = r11.getValue()
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r0
            r1 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$a r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g.C27153a.f66020a
            r3 = 0
            r4 = 0
            r5 = 13
            r6 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r0 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r0, r1, r2, r3, r4, r5, r6)
            boolean r10 = r11.mo24216e(r10, r0)
            if (r10 == 0) goto L_0x0048
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0064:
            com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase r11 = r9.f65990c
            com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$Params r2 = new com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$Params
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r4 = "valueOf(minefiCode)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            int r10 = r10.intValue()
            r2.<init>(r10)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.m173131invokegIAlus((com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.cms.domain.models.StorePetrolInfo>>) r0)
            if (r11 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r10 = r9
        L_0x0084:
            boolean r0 = kotlin.Result.m38710j(r11)
            if (r0 == 0) goto L_0x00cc
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00c5 }
            com.carrefour.fid.android.cms.domain.models.StorePetrolInfo r11 = (com.carrefour.fid.android.cms.domain.models.StorePetrolInfo) r11     // Catch:{ all -> 0x00c5 }
            com.carrefour.fid.android.cms.domain.models.GasStationDomain r11 = r11.getGasStation()     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00bf
            java.util.List r11 = r11.getFuelPrices()     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00bf
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r0 = r10.f65994g     // Catch:{ all -> 0x00c5 }
        L_0x009c:
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00c5 }
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r2     // Catch:{ all -> 0x00c5 }
            r3 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$c r4 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$c     // Catch:{ all -> 0x00c5 }
            r4.<init>(r11)     // Catch:{ all -> 0x00c5 }
            r5 = 0
            r6 = 0
            r7 = 13
            r8 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c5 }
            boolean r1 = r0.mo24216e(r1, r2)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x009c
            kotlin.d2 r11 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = kotlin.Result.m38702b(r11)     // Catch:{ all -> 0x00c5 }
            goto L_0x00d0
        L_0x00bf:
            java.lang.Exception r11 = new java.lang.Exception     // Catch:{ all -> 0x00c5 }
            r11.<init>()     // Catch:{ all -> 0x00c5 }
            throw r11     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
        L_0x00cc:
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x00d0:
            java.lang.Throwable r11 = kotlin.Result.m38705e(r11)
            if (r11 == 0) goto L_0x00f1
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r10 = r10.f65994g
        L_0x00d8:
            java.lang.Object r11 = r10.getValue()
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r0
            r1 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$a r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g.C27153a.f66020a
            r3 = 0
            r4 = 0
            r5 = 13
            r6 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r0 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r0, r1, r2, r3, r4, r5, r6)
            boolean r11 = r10.mo24216e(r11, r0)
            if (r11 == 0) goto L_0x00d8
        L_0x00f1:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel.mo78884g0(com.carrefour.fid.android.domain.models.service.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C11907e<C27121d> getSideEffect() {
        return this.f65993f;
    }

    /* renamed from: h0 */
    public final void mo78886h0() {
        C27145c value;
        C11940j<C27145c> jVar = this.f65994g;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, C27145c.m114705f(value, C27164j.C27166b.f66041a, (C27152g) null, (C27160i) null, (C27156h) null, 14, (Object) null)));
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2(this, (C11045c<? super PhysicalStoreInfoViewModel$fetchPhysicalStoreInfo$2>) null), 3, (Object) null);
    }

    /* renamed from: i0 */
    public final void mo78887i0(C38163l lVar) {
        String str;
        Integer intOrNull = C11621s.toIntOrNull(lVar.mo119393w());
        if (intOrNull == null || (str = intOrNull.toString()) == null) {
            str = lVar.mo119393w();
        }
        this.f65991d.mo63895d(str, new C27134a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78888j0(java.util.List<com.carrefour.fid.android.domain.models.service.models.StoreService> r40, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            boolean r3 = r2 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchServicesPictos$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchServicesPictos$1 r3 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchServicesPictos$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchServicesPictos$1 r3 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel$fetchServicesPictos$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L_0x0045
            if (r5 != r6) goto L_0x003d
            java.lang.Object r1 = r3.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r3.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel) r3
            kotlin.C11661u0.m45747n(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x0099
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            kotlin.C11661u0.m45747n(r2)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r2 = r0.f65994g
        L_0x004a:
            java.lang.Object r5 = r2.getValue()
            r7 = r5
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r7 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r7
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$b r10 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i.C27162b.f66035a
            r11 = 0
            r12 = 11
            r13 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r7 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r7, r8, r9, r10, r11, r12, r13)
            boolean r5 = r2.mo24216e(r5, r7)
            if (r5 == 0) goto L_0x004a
            com.carrefour.fid.android.domain.interactors.service.d r2 = r0.f65989b
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.C10978t.m41495Y(r5, r8)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r5.next()
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r8
            java.lang.String r8 = r8.mo119170N()
            r7.add(r8)
            goto L_0x0077
        L_0x008b:
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r6
            java.lang.Object r2 = r2.m172966invokegIAlus(r7, r3)
            if (r2 != r4) goto L_0x0098
            return r4
        L_0x0098:
            r3 = r0
        L_0x0099:
            boolean r4 = kotlin.Result.m38710j(r2)
            if (r4 == 0) goto L_0x0199
            r4 = r2
            com.carrefour.fid.android.domain.models.service.models.o r4 = (com.carrefour.fid.android.domain.models.service.models.C38168o) r4
            java.util.List r5 = kotlin.collections.C10976s.m41417i()
            java.util.List r4 = r4.mo119425f()
            if (r4 == 0) goto L_0x0177
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00b2:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0177
            java.lang.Object r7 = r4.next()
            com.carrefour.fid.android.domain.models.service.models.n r7 = (com.carrefour.fid.android.domain.models.service.models.C38167n) r7
            r8 = r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
            r10 = 0
            r11 = r9
        L_0x00c8:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x00e9
            java.lang.Object r12 = r8.next()
            r13 = r12
            com.carrefour.fid.android.domain.models.service.models.StoreService r13 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r13
            java.lang.String r13 = r13.mo119170N()
            java.lang.String r14 = r7.mo119413h()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x00c8
            if (r10 == 0) goto L_0x00e6
            goto L_0x00ed
        L_0x00e6:
            r10 = r6
            r11 = r12
            goto L_0x00c8
        L_0x00e9:
            if (r10 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r9 = r11
        L_0x00ed:
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r9
            if (r9 == 0) goto L_0x00b2
            com.carrefour.fid.android.domain.models.service.models.j r8 = r7.mo119418l()
            if (r8 == 0) goto L_0x0137
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
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
            java.lang.String r27 = r8.mo119345d()
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 67043327(0x3feffff, float:1.4987552E-36)
            r38 = 0
            r10 = r9
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = com.carrefour.fid.android.domain.models.service.models.StoreService.m157998C(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            if (r8 != 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r10 = r8
            goto L_0x0138
        L_0x0137:
            r10 = r9
        L_0x0138:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = r7.mo119415i()
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
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 67108831(0x3ffffdf, float:1.5046298E-36)
            r38 = 0
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = com.carrefour.fid.android.domain.models.service.models.StoreService.m157998C(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r5.add(r7)
            goto L_0x00b2
        L_0x0177:
            java.util.List r1 = kotlin.collections.C10976s.m41409a(r5)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r4 = r3.f65994g
        L_0x017d:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r6 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r6
            r7 = 0
            r8 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$c r9 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$c
            r9.<init>(r1)
            r10 = 0
            r11 = 11
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r6 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r6, r7, r8, r9, r10, r11, r12)
            boolean r5 = r4.mo24216e(r5, r6)
            if (r5 == 0) goto L_0x017d
        L_0x0199:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r2)
            if (r1 == 0) goto L_0x01ba
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c> r1 = r3.f65994g
        L_0x01a1:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r3 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c) r3
            r4 = 0
            r5 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.i$a r6 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i.C27161a.f66033a
            r7 = 0
            r8 = 11
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.c r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c.m114705f(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x01a1
        L_0x01ba:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel.mo78888j0(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: k0 */
    public final C11940j<C27145c> mo78889k0() {
        return this.f65994g;
    }

    /* renamed from: l0 */
    public final void mo78890l0(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "storeRef");
        this.f65991d.mo63898g(context, new C27135b(), str, (JSONObject) null);
    }
}
