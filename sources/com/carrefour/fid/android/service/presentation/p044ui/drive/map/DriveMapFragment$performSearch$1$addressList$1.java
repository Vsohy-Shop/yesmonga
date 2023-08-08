package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$addressList$1", mo22502f = "DriveMapFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0005\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$addressList$1 */
public final class DriveMapFragment$performSearch$1$addressList$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super List<Address>>, Object> {
    final /* synthetic */ String $search;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$performSearch$1$addressList$1(DriveMapFragment driveMapFragment, String str, C11045c<? super DriveMapFragment$performSearch$1$addressList$1> cVar) {
        super(2, cVar);
        this.this$0 = driveMapFragment;
        this.$search = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DriveMapFragment$performSearch$1$addressList$1 driveMapFragment$performSearch$1$addressList$1 = new DriveMapFragment$performSearch$1$addressList$1(this.this$0, this.$search, cVar);
        driveMapFragment$performSearch$1$addressList$1.L$0 = obj;
        return driveMapFragment$performSearch$1$addressList$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            DriveMapFragment driveMapFragment = this.this$0;
            String str = this.$search;
            try {
                Result.C10852a aVar = Result.f28060a;
                Geocoder access$getGeocoder = driveMapFragment.getGeocoder();
                obj2 = Result.m38702b(access$getGeocoder.getFromLocationName(str + " france", 1));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(th));
            }
            if (Result.m38709i(obj2)) {
                return null;
            }
            return obj2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super List<Address>> cVar) {
        return ((DriveMapFragment$performSearch$1$addressList$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
