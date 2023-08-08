package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import com.carrefour.fid.android.shared.extension.C28752e0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreate$1", mo22502f = "DriveMapFragment.kt", mo22503i = {}, mo22504l = {159}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreate$1 */
public final class DriveMapFragment$onCreate$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ DriveMapFragment this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreate$1$1", mo22502f = "DriveMapFragment.kt", mo22503i = {}, mo22504l = {160}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onCreate$1$1 */
    public static final class C284071 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C284071(driveMapFragment, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<DriveMapViewModel.C28436Event> events = driveMapFragment.getViewModel().getEvents();
                final DriveMapFragment driveMapFragment = driveMapFragment;
                C284081 r1 = new C11908f<DriveMapViewModel.C28436Event>() {
                    @C12580l
                    public final Object emit(@C12579k DriveMapViewModel.C28436Event event, @C12579k C11045c<? super C11079d2> cVar) {
                        DriveMapViewModel.C28436Event event2 = event;
                        if (Intrinsics.areEqual((Object) event2, (Object) DriveMapViewModel.C28436Event.DataFetchError.INSTANCE)) {
                            DriveMapFragment driveMapFragment = driveMapFragment;
                            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                            String string = driveMapFragment.getString(C28330R.string.general_error_parameters_server_not_responding_03);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_03)");
                            FragmentKt.m118811B(driveMapFragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                        } else if (event2 instanceof DriveMapViewModel.C28436Event.NavigateToBillingAddress) {
                            DriveMapViewModel.C28436Event.NavigateToBillingAddress navigateToBillingAddress = (DriveMapViewModel.C28436Event.NavigateToBillingAddress) event2;
                            C28796c.C28797a.m119187a(driveMapFragment.getNavigator(), C19736g.m91827a(driveMapFragment), false, false, navigateToBillingAddress.getBillingAddress(), navigateToBillingAddress.getDeliveryAddress(), (String) null, 38, (Object) null);
                        } else if (event2 instanceof DriveMapViewModel.C28436Event.NavigateToSummary) {
                            DriveMapViewModel.C28436Event.NavigateToSummary navigateToSummary = (DriveMapViewModel.C28436Event.NavigateToSummary) event2;
                            C28752e0.m119044c(C19736g.m91827a(driveMapFragment), DriveMapFragmentDirections.Companion.actionDriveMapFragmentToDriveSummaryFragment(navigateToSummary.getStoreId(), navigateToSummary.getDistanceMeters()));
                        } else if (Intrinsics.areEqual((Object) event2, (Object) DriveMapViewModel.C28436Event.NavigateToHome.INSTANCE)) {
                            C19736g.m91827a(driveMapFragment).mo58152q0();
                        }
                        return C11079d2.f28267a;
                    }
                };
                this.label = 1;
                if (events.collect(r1, this) == h) {
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
            return ((C284071) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$onCreate$1(DriveMapFragment driveMapFragment, C11045c<? super DriveMapFragment$onCreate$1> cVar) {
        super(2, cVar);
        this.this$0 = driveMapFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DriveMapFragment$onCreate$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final DriveMapFragment driveMapFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C284071 r3 = new C284071((C11045c<? super C284071>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90582b(driveMapFragment, state, r3, this) == h) {
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
        return ((DriveMapFragment$onCreate$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
