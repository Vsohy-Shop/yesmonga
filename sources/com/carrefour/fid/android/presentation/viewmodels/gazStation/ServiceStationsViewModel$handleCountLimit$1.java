package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import com.carrefour.fid.android.core.constants.C36185p;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.datastore.C36193a;
import java.util.Calendar;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsViewModel$handleCountLimit$1", mo22502f = "ServiceStationsViewModel.kt", mo22503i = {}, mo22504l = {34, 43}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ServiceStationsViewModel$handleCountLimit$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ServiceStationsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceStationsViewModel$handleCountLimit$1(ServiceStationsViewModel serviceStationsViewModel, C11045c<? super ServiceStationsViewModel$handleCountLimit$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceStationsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ServiceStationsViewModel$handleCountLimit$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            AppPreferencesStorage g0 = this.this$0.f64382d;
            this.label = 1;
            obj = g0.mo108080c(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            this.this$0.f64383e.mo57496r(C11064a.m42615a(true));
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C36193a aVar = (C36193a) obj;
        if (aVar.mo108117D() > 2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = ((C36185p.f89344f - (Calendar.getInstance().getTimeInMillis() - aVar.mo108118E())) > 0 ? 1 : ((C36185p.f89344f - (Calendar.getInstance().getTimeInMillis() - aVar.mo108118E())) == 0 ? 0 : -1));
        if (i2 > 0 && z) {
            this.this$0.f64383e.mo57496r(C11064a.m42615a(false));
            return C11079d2.f28267a;
        } else if (i2 >= 0 || !z) {
            this.this$0.f64383e.mo57496r(C11064a.m42615a(true));
            return C11079d2.f28267a;
        } else {
            AppPreferencesStorage g02 = this.this$0.f64382d;
            this.label = 2;
            if (g02.mo108092o(0, this) == h) {
                return h;
            }
            this.this$0.f64383e.mo57496r(C11064a.m42615a(true));
            return C11079d2.f28267a;
        }
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceStationsViewModel$handleCountLimit$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
