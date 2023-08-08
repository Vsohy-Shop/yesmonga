package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.domain.extension.StoreServiceKt;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel$fetchSummary$1", mo22502f = "DriveSummaryViewModel.kt", mo22503i = {}, mo22504l = {54}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveSummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel$fetchSummary$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n766#2:106\n857#2,2:107\n1603#2,9:109\n1855#2:118\n1856#2:120\n1612#2:121\n1#3:119\n*S KotlinDebug\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel$fetchSummary$1\n*L\n57#1:106\n57#1:107,2\n60#1:109,9\n60#1:118\n60#1:120\n60#1:121\n60#1:119\n*E\n"})
public final class DriveSummaryViewModel$fetchSummary$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $anabel;
    int label;
    final /* synthetic */ DriveSummaryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveSummaryViewModel$fetchSummary$1(DriveSummaryViewModel driveSummaryViewModel, String str, C11045c<? super DriveSummaryViewModel$fetchSummary$1> cVar) {
        super(2, cVar);
        this.this$0 = driveSummaryViewModel;
        this.$anabel = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DriveSummaryViewModel$fetchSummary$1(this.this$0, this.$anabel, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ServiceGetFacilityDetailsByAnabelKeyUseCase access$getGetFacilityDetailsByAnabelKeyUseCase$p = this.this$0.getFacilityDetailsByAnabelKeyUseCase;
            String b = C38146a.m158072b(this.$anabel);
            this.label = 1;
            obj2 = access$getGetFacilityDetailsByAnabelKeyUseCase$p.m172847invoke0zxx4Q0(b, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DriveSummaryViewModel driveSummaryViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            C38163l lVar = (C38163l) obj2;
            ArrayList<StoreService> arrayList = new ArrayList<>();
            for (Object next : lVar.mo119367K()) {
                StoreService storeService = (StoreService) next;
                if (!StoreServiceKt.isDrive(storeService) || !StoreServiceKt.isDataValid(storeService)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (StoreService driveType : arrayList) {
                DriveType driveType2 = StoreServiceKt.getDriveType(driveType);
                if (driveType2 != null) {
                    arrayList2.add(driveType2);
                }
            }
            C11940j access$get_state$p = driveSummaryViewModel._state;
            if (true ^ arrayList2.isEmpty()) {
                obj3 = new C28892e.C28895c(new DriveSummaryState(lVar, arrayList2));
            } else {
                obj3 = new C28892e.C28893a((Throwable) null);
            }
            access$get_state$p.setValue(obj3);
        }
        DriveSummaryViewModel driveSummaryViewModel2 = this.this$0;
        if (Result.m38705e(obj2) != null) {
            driveSummaryViewModel2._state.setValue(new C28892e.C28893a((Throwable) null));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DriveSummaryViewModel$fetchSummary$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
