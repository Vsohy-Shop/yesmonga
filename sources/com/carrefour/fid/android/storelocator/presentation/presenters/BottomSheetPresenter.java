package com.carrefour.fid.android.storelocator.presentation.presenters;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.OneAppApplication;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.util.C13757a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.ServiceUtil;
import com.carrefour.fid.android.storelocator.p048ui.contracts.C28969b;
import com.carrefour.fid.android.storelocator.presentation.contracts.C28959a;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public class BottomSheetPresenter implements C28959a {

    /* renamed from: e */
    public static final int f70994e = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f70995a;

    /* renamed from: b */
    public C28969b f70996b;
    @C12579k

    /* renamed from: c */
    public String f70997c;
    @C12579k

    /* renamed from: d */
    public final C11677z f70998d;

    @C10267e({C10265a.class})
    @C10262b
    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/presentation/presenters/BottomSheetPresenter$a;", "", "Lcom/carrefour/fid/android/tracking/a;", "h", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "o", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "b", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$a */
    public interface C28962a {
        @C12579k
        /* renamed from: a */
        AccountRepository mo33940a();

        @C12579k
        /* renamed from: b */
        C37816e mo33947b();

        @C12579k
        /* renamed from: h */
        C28994a mo33988h();

        @C12579k
        /* renamed from: o */
        C37833d mo34035o();
    }

    public BottomSheetPresenter() {
        this((C13783a) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m119788j(com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter r29, com.carrefour.fid.android.domain.models.service.models.C38163l r30, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r31) {
        /*
            r0 = r29
            r1 = r31
            boolean r2 = r1 instanceof com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$setStoreAsFavorite$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$setStoreAsFavorite$1 r2 = (com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$setStoreAsFavorite$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$setStoreAsFavorite$1 r2 = new com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$setStoreAsFavorite$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x005f
            if (r4 == r7) goto L_0x0047
            if (r4 != r6) goto L_0x003f
            java.lang.Object r0 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.l r0 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r0
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter r2 = (com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x00d3
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.Object r0 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.l r0 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r0
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter r4 = (com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r28 = r1
            r1 = r0
            r0 = r4
            r4 = r28
            goto L_0x0087
        L_0x005f:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$a r1 = r29.mo84312f()
            com.carrefour.fid.android.domain.interactors.service.e r1 = r1.mo33947b()
            java.lang.String r4 = r30.mo119393w()
            java.lang.String r4 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r4)
            com.carrefour.fid.android.domain.models.service.models.a r4 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r4)
            r2.L$0 = r0
            r8 = r30
            r2.L$1 = r8
            r2.label = r7
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0085
            return r3
        L_0x0085:
            r4 = r1
            r1 = r8
        L_0x0087:
            boolean r7 = kotlin.Result.m38709i(r4)
            if (r7 == 0) goto L_0x008e
            r4 = r5
        L_0x008e:
            com.carrefour.fid.android.domain.models.service.models.l r4 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r4
            if (r4 == 0) goto L_0x00bb
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.util.List r18 = r4.mo119367K()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 261119(0x3fbff, float:3.65906E-40)
            r27 = 0
            r7 = r1
            com.carrefour.fid.android.domain.models.service.models.l r4 = com.carrefour.fid.android.domain.models.service.models.C38163l.m158177u(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00bc
        L_0x00bb:
            r4 = r1
        L_0x00bc:
            com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter$a r7 = r0.mo84312f()
            com.carrefour.fid.android.domain.interactors.service.physicalstore.d r7 = r7.mo34035o()
            r2.L$0 = r0
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r2 = r7.m172966invokegIAlus(r4, r2)
            if (r2 != r3) goto L_0x00d1
            return r3
        L_0x00d1:
            r2 = r0
            r0 = r1
        L_0x00d3:
            r2.mo84314h(r0)
            com.carrefour.fid.android.storelocator.ui.contracts.b r0 = r2.f70996b
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "mView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x00e1
        L_0x00e0:
            r5 = r0
        L_0x00e1:
            r5.mo84353H()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter.m119788j(com.carrefour.fid.android.storelocator.presentation.presenters.BottomSheetPresenter, com.carrefour.fid.android.domain.models.service.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public void mo84289a(@C12579k C28969b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40383c.f102945c);
        this.f70996b = bVar;
    }

    @C12580l
    /* renamed from: b */
    public Object mo84290b(@C12579k C38163l lVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m119788j(this, lVar, cVar);
    }

    /* renamed from: c */
    public void mo84291c(@C12579k C38157h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "storeOpeningPattern");
        ServiceUtil serviceUtil = ServiceUtil.f70805a;
        List<List<C38147b>> i = serviceUtil.mo84127i(hVar);
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(7) - 1;
        if (i.size() > i2) {
            ServiceUtil.OpeningStatus j = serviceUtil.mo84128j(i.get(i2));
            C28969b bVar = null;
            if (j == ServiceUtil.OpeningStatus.BEFORE || j == ServiceUtil.OpeningStatus.UNKNOWN) {
                C28969b bVar2 = this.f70996b;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    bVar2 = null;
                }
                Intrinsics.checkNotNullExpressionValue(instance, "calendar");
                bVar2.mo84358h(i.get(i2), instance);
            }
            if (j == ServiceUtil.OpeningStatus.OPEN) {
                C28969b bVar3 = this.f70996b;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    bVar3 = null;
                }
                bVar3.mo84359l(i.get(i2));
            }
            if (j == ServiceUtil.OpeningStatus.AFTER && i.size() > i2) {
                instance.add(5, 1);
                int i3 = i2 + 1;
                if (i.size() <= i3) {
                    i3 = 0;
                }
                C28969b bVar4 = this.f70996b;
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                } else {
                    bVar = bVar4;
                }
                Intrinsics.checkNotNullExpressionValue(instance, "calendar");
                bVar.mo84358h(i.get(i3), instance);
            }
        }
    }

    /* renamed from: d */
    public void mo84292d(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        this.f70995a.mo32708k(C10977s0.m41446M(C11078d1.m42659a(C28564m1.f69577k, lVar.mo119393w()), C11078d1.m42659a(C28564m1.f69579m, StringKt.m118908Q(lVar.mo119357A()))));
        C13783a.m58668o(this.f70995a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, this.f70997c), C11078d1.m42659a("screen_name", "magasin"), C11078d1.m42659a(C28526d.f68929i, this.f70997c), C11078d1.m42659a(C28526d.f68933j, "choisir-magasin"), C11078d1.m42659a(C28526d.f68937k, lVar.mo119359C())), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo84293e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeID");
        C13783a.m58668o(this.f70995a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, this.f70997c), C11078d1.m42659a("screen_name", "magasin"), C11078d1.m42659a(C28526d.f68929i, this.f70997c), C11078d1.m42659a(C28526d.f68933j, "itineraire"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final C28962a mo84312f() {
        return (C28962a) this.f70998d.getValue();
    }

    @C12579k
    /* renamed from: g */
    public final C13783a mo84313g() {
        return this.f70995a;
    }

    /* renamed from: h */
    public final void mo84314h(C38163l lVar) {
        mo84312f().mo33988h().mo32670e(C10977s0.m41456W(C11078d1.m42659a(C13758b.f33461n0, C13757a.f33400a), C11078d1.m42659a(C13758b.f33463o0, lVar.mo119361E()), C11078d1.m42659a(C13758b.f33465p0, lVar.mo119357A())));
    }

    /* renamed from: i */
    public final void mo84315i(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f70995a = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f70995a, "store-locator", "magasin", (Map) null, false, false, false, 60, (Object) null);
    }

    public BottomSheetPresenter(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f70995a = aVar;
        this.f70997c = "store-locator";
        this.f70998d = C10864b0.m38748c(BottomSheetPresenter$entryPoint$2.f70999f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetPresenter(C13783a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OneAppApplication.f32244w.mo30856a().mo30844d() : aVar);
    }
}
