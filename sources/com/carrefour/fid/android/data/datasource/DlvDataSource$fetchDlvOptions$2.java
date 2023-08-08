package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.dlv.DlvOption;
import com.carrefour.fid.android.data.entities.dlv.DlvRequest;
import com.carrefour.fid.android.data.entities.dlv.DlvResponse;
import com.carrefour.fid.android.data.entities.mapper.C36485f0;
import com.carrefour.fid.android.data.service.C36629h;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38020e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.DlvDataSource$fetchDlvOptions$2", mo22502f = "DlvDataSource.kt", mo22503i = {}, mo22504l = {22}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/delivery/b;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDlvDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlvDataSource.kt\ncom/carrefour/fid/android/data/datasource/DlvDataSource$fetchDlvOptions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 DlvDataSource.kt\ncom/carrefour/fid/android/data/datasource/DlvDataSource$fetchDlvOptions$2\n*L\n28#1:42\n28#1:43,3\n*E\n"})
public final class DlvDataSource$fetchDlvOptions$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends C38017b>>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ List<C38020e> $gtins;
    int label;
    final /* synthetic */ DlvDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlvDataSource$fetchDlvOptions$2(DlvDataSource dlvDataSource, String str, List<C38020e> list, C11045c<? super DlvDataSource$fetchDlvOptions$2> cVar) {
        super(1, cVar);
        this.this$0 = dlvDataSource;
        this.$facilityServiceId = str;
        this.$gtins = list;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new DlvDataSource$fetchDlvOptions$2(this.this$0, this.$facilityServiceId, this.$gtins, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            DlvRequest b = this.this$0.mo108664d(this.$facilityServiceId, this.$gtins);
            C36629h a = this.this$0.f90012a;
            this.label = 1;
            obj = a.mo111643a(b, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            DlvResponse dlvResponse = (DlvResponse) wVar.mo30572a();
            if (dlvResponse == null) {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error getting delivery options (empty body)")));
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                Iterable<DlvOption> deliveryOptions = dlvResponse.getDeliveryOptions();
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(deliveryOptions, 10));
                for (DlvOption d : deliveryOptions) {
                    arrayList.add(C36485f0.m149653d(d));
                }
                obj2 = Result.m38702b(arrayList);
            }
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            int b2 = wVar.mo30573b();
            String h2 = wVar.mo30577h();
            obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error getting delivery options (error " + b2 + " ; " + h2 + ")")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<? extends C38017b>>> cVar) {
        return ((DlvDataSource$fetchDlvOptions$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
