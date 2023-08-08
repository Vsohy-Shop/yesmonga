package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import com.carrefour.fid.android.shared.p046io.UpdateCouponFromDetailsException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nUpdateCouponFromDetailsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCouponFromDetailsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponFromDetailsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n819#2:52\n847#2,2:53\n1#3:55\n1109#4,2:56\n*S KotlinDebug\n*F\n+ 1 UpdateCouponFromDetailsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/UpdateCouponFromDetailsUseCase\n*L\n23#1:52\n23#1:53,2\n45#1:56,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.k */
public final class C37653k implements C37679f<C37654a, C37643a> {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.coupons.k$a */
    public static final class C37654a {

        /* renamed from: c */
        public static final int f94484c = 8;
        @C12579k

        /* renamed from: a */
        public final C37643a f94485a;
        @C12579k

        /* renamed from: b */
        public final CouponDetailsResult f94486b;

        public C37654a(@C12579k C37643a aVar, @C12579k CouponDetailsResult couponDetailsResult) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupon");
            Intrinsics.checkNotNullParameter(couponDetailsResult, "couponDetailsResult");
            this.f94485a = aVar;
            this.f94486b = couponDetailsResult;
        }

        /* renamed from: d */
        public static /* synthetic */ C37654a m154361d(C37654a aVar, C37643a aVar2, CouponDetailsResult couponDetailsResult, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f94485a;
            }
            if ((i & 2) != 0) {
                couponDetailsResult = aVar.f94486b;
            }
            return aVar.mo114633c(aVar2, couponDetailsResult);
        }

        @C12579k
        /* renamed from: a */
        public final C37643a mo114631a() {
            return this.f94485a;
        }

        @C12579k
        /* renamed from: b */
        public final CouponDetailsResult mo114632b() {
            return this.f94486b;
        }

        @C12579k
        /* renamed from: c */
        public final C37654a mo114633c(@C12579k C37643a aVar, @C12579k CouponDetailsResult couponDetailsResult) {
            Intrinsics.checkNotNullParameter(aVar, "currentCoupon");
            Intrinsics.checkNotNullParameter(couponDetailsResult, "couponDetailsResult");
            return new C37654a(aVar, couponDetailsResult);
        }

        @C12579k
        /* renamed from: e */
        public final CouponDetailsResult mo114634e() {
            return this.f94486b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37654a)) {
                return false;
            }
            C37654a aVar = (C37654a) obj;
            return Intrinsics.areEqual((Object) this.f94485a, (Object) aVar.f94485a) && Intrinsics.areEqual((Object) this.f94486b, (Object) aVar.f94486b);
        }

        @C12579k
        /* renamed from: f */
        public final C37643a mo114636f() {
            return this.f94485a;
        }

        public int hashCode() {
            return (this.f94485a.hashCode() * 31) + this.f94486b.hashCode();
        }

        @C12579k
        public String toString() {
            C37643a aVar = this.f94485a;
            CouponDetailsResult couponDetailsResult = this.f94486b;
            return "Params(currentCoupon=" + aVar + ", couponDetailsResult=" + couponDetailsResult + ")";
        }
    }

    /* renamed from: a */
    public final int mo114628a(List<CouponModel> list, String str) {
        Object obj;
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((CouponModel) obj).mo121396L(), (Object) str)) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.m40594Y2(list, obj);
    }

    @C12580l
    /* renamed from: b */
    public Object m172957invokegIAlus(@C12579k C37654a aVar, @C12579k C11045c<? super Result<C37643a>> cVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : aVar.mo114636f().mo114618i()) {
            if (((CouponModel) next).mo121403S() == CouponStatus.INBASKET) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        int a = mo114628a(arrayList, aVar.mo114634e().mo121375e());
        if (a != -1) {
            CouponModel c = mo114630c(aVar.mo114636f().mo114618i(), a, aVar.mo114634e());
            if (c == null) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(C11661u0.m45734a(new IllegalStateException()));
            }
            List T5 = CollectionsKt___CollectionsKt.m40572T5(aVar.mo114636f().mo114618i());
            T5.set(a, c);
            C37643a f = C37643a.m154327f(aVar.mo114636f(), (List) null, CollectionsKt___CollectionsKt.m40557Q5(T5), (List) null, (List) null, 13, (Object) null);
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(f);
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new UpdateCouponFromDetailsException()));
    }

    /* renamed from: c */
    public final CouponModel mo114630c(List<CouponModel> list, int i, CouponDetailsResult couponDetailsResult) {
        CouponModel couponModel;
        CouponModel.State state;
        if (list == null || (couponModel = (CouponModel) CollectionsKt___CollectionsKt.m40559R2(list, i)) == null) {
            return null;
        }
        for (CouponStatus couponStatus : CouponStatus.values()) {
            if (Intrinsics.areEqual((Object) couponStatus.getType(), (Object) couponDetailsResult.mo121377f())) {
                if (Intrinsics.areEqual((Object) couponDetailsResult.mo121377f(), (Object) CouponStatus.LOADEDTOCARD.getType())) {
                    state = CouponModel.State.ACTIVATED;
                } else {
                    state = CouponModel.State.NEUTRAL;
                }
                return CouponModel.m159022x(couponModel, 0, (String) null, (String) null, (String) null, (CouponType) null, (String) null, (String) null, 0, (String) null, (List) null, (String) null, (Double) null, (DiscountType) null, (String) null, couponStatus, (Image) null, (List) null, (String) null, (Facility) null, (String) null, state, (String) null, 3129343, (Object) null);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
