package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.domain.models.pickup.C38081b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onMapReady$3", mo22502f = "PickupPointsMapFragment.kt", mo22503i = {}, mo22504l = {259}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onMapReady$3 */
public final class PickupPointsMapFragment$onMapReady$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ PickupPointsMapFragment this$0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment$onMapReady$3$a */
    public static final class C23689a implements C11908f<C38081b> {

        /* renamed from: a */
        public final /* synthetic */ PickupPointsMapFragment f59756a;

        public C23689a(PickupPointsMapFragment pickupPointsMapFragment) {
            this.f59756a = pickupPointsMapFragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C38081b bVar, @C12579k C11045c<? super C11079d2> cVar) {
            C38080a aVar;
            this.f59756a.mo69425c1(bVar.mo118301f());
            if (bVar.mo118299e() && (aVar = (C38080a) CollectionsKt___CollectionsKt.m40479B2(bVar.mo118301f())) != null) {
                this.f59756a.mo69424a1(aVar, false);
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupPointsMapFragment$onMapReady$3(PickupPointsMapFragment pickupPointsMapFragment, C11045c<? super PickupPointsMapFragment$onMapReady$3> cVar) {
        super(2, cVar);
        this.this$0 = pickupPointsMapFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PickupPointsMapFragment$onMapReady$3(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11952u<C38081b> e0 = this.this$0.mo69439i1().mo76068e0();
            C23689a aVar = new C23689a(this.this$0);
            this.label = 1;
            if (e0.collect(aVar, this) == h) {
                return h;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C11661u0.m45747n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PickupPointsMapFragment$onMapReady$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
