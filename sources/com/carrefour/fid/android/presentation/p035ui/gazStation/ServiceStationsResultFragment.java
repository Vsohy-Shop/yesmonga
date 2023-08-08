package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36185p;
import com.carrefour.fid.android.databinding.C36812r3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.models.C38527s;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel;
import com.carrefour.fid.android.shared.p046io.GazStationLimitExceedThrowable;
import com.carrefour.fid.android.shared.p046io.GazStationPostTicketThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0013\u0010\u0016\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\u0019\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020#H\u0016J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020\u0003H\u0016R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010L\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsResultFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/r3;", "Lkotlin/d2;", "p1", "", "isSuccess", "isTicketAlreadyUsed", "", "moreInformation", "B1", "r1", "isLimitExceed", "x1", "D1", "t1", "E1", "h1", "()Lkotlin/d2;", "s1", "q1", "u1", "v1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "A1", "loading", "l1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/presentation/models/s;", "serviceStationModel", "n1", "", "throwable", "m1", "o1", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onStart", "onPause", "onStop", "Lcom/carrefour/fid/android/presentation/ui/gazStation/x;", "f", "Landroidx/navigation/m;", "j1", "()Lcom/carrefour/fid/android/presentation/ui/gazStation/x;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsResultViewModel;", "g", "Lkotlin/z;", "k1", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsResultViewModel;", "serviceStationsResultViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "i1", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "w1", "(Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;)V", "analyticsViewModel", "Landroid/os/CountDownTimer;", "w", "Landroid/os/CountDownTimer;", "mCountDownTimer", "x", "Z", "mTimerRunning", "y", "stoppedTimer", "", "z", "J", "mTimeLeftInMillis", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceStationsResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceStationsResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsResultFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,303:1\n42#2,3:304\n106#3,15:307\n*S KotlinDebug\n*F\n+ 1 ServiceStationsResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsResultFragment\n*L\n37#1:304,3\n38#1:307,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment */
public final class ServiceStationsResultFragment extends C24028g<C36812r3> {

    /* renamed from: X */
    public static final int f60227X = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f60228f = new C19766m(C11342l0.m43547d(C24051x.class), new ServiceStationsResultFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f60229g;
    @Inject

    /* renamed from: v */
    public C26350a f60230v;
    @C12580l

    /* renamed from: w */
    public CountDownTimer f60231w;

    /* renamed from: x */
    public boolean f60232x;

    /* renamed from: y */
    public boolean f60233y;

    /* renamed from: z */
    public long f60234z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment$a */
    public /* synthetic */ class C24009a implements C19426h0, C11379z {
        public C24009a() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            ServiceStationsResultFragment.this.mo70240l1(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ServiceStationsResultFragment.this, ServiceStationsResultFragment.class, "handleBasketLoading", "handleBasketLoading(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment$b */
    public /* synthetic */ class C24010b implements C19426h0, C11379z {
        public C24010b() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            ServiceStationsResultFragment.this.mo70241m1(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ServiceStationsResultFragment.this, ServiceStationsResultFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment$c */
    public /* synthetic */ class C24011c implements C19426h0, C11379z {
        public C24011c() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12579k C38527s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "p0");
            ServiceStationsResultFragment.this.mo70242n1(sVar);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ServiceStationsResultFragment.this, ServiceStationsResultFragment.class, "handleSuccessServiceStation", "handleSuccessServiceStation(Lcom/carrefour/fid/android/presentation/models/ServiceStationModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment$d */
    public static final class C24012d extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ ServiceStationsResultFragment f60239a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24012d(ServiceStationsResultFragment serviceStationsResultFragment, long j) {
            super(j, 1000);
            this.f60239a = serviceStationsResultFragment;
        }

        public void onFinish() {
            this.f60239a.mo70248t1();
        }

        public void onTick(long j) {
            if (j <= 0) {
                this.f60239a.mo70248t1();
                return;
            }
            this.f60239a.f60234z = j;
            this.f60239a.mo70235E1();
        }
    }

    public ServiceStationsResultFragment() {
        super(C240081.f60235a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24014x303656e9(new C24013x303656e8(this)));
        this.f60229g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ServiceStationsResultViewModel.class), new C24015x303656ea(b), new C24016x303656eb((C11289a) null, b), new C24017x303656ec(this, b));
        this.f60234z = C36185p.f89344f;
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m105992C1(ServiceStationsResultFragment serviceStationsResultFragment, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        serviceStationsResultFragment.mo70233B1(z, z2, str);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m106010y1(ServiceStationsResultFragment serviceStationsResultFragment, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        serviceStationsResultFragment.mo70252x1(z, z2, z3);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [androidx.fragment.app.h] */
    /* JADX WARNING: type inference failed for: r2v7, types: [androidx.fragment.app.h] */
    /* JADX WARNING: type inference failed for: r2v9, types: [androidx.fragment.app.h] */
    /* JADX WARNING: type inference failed for: r2v11, types: [androidx.fragment.app.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106011z1(boolean r2, boolean r3, com.carrefour.fid.android.presentation.p035ui.gazStation.ServiceStationsResultFragment r4, boolean r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            r6 = 0
            if (r2 == 0) goto L_0x0023
            if (r3 == 0) goto L_0x0023
            androidx.fragment.app.h r2 = r4.getActivity()
            boolean r3 = r2 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r3 == 0) goto L_0x0015
            r6 = r2
            com.carrefour.fid.android.navigation.BottomNavActivity r6 = (com.carrefour.fid.android.navigation.BottomNavActivity) r6
        L_0x0015:
            if (r6 == 0) goto L_0x001a
            r6.mo121118U1()
        L_0x001a:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.a r2 = r4.mo70237i1()
            r2.mo76669l()
            goto L_0x008f
        L_0x0023:
            if (r2 == 0) goto L_0x003d
            androidx.fragment.app.h r2 = r4.getActivity()
            boolean r3 = r2 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r3 == 0) goto L_0x0030
            r6 = r2
            com.carrefour.fid.android.navigation.BottomNavActivity r6 = (com.carrefour.fid.android.navigation.BottomNavActivity) r6
        L_0x0030:
            if (r6 == 0) goto L_0x0035
            r6.mo121118U1()
        L_0x0035:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.a r2 = r4.mo70237i1()
            r2.mo76667j()
            goto L_0x008f
        L_0x003d:
            r2 = 0
            if (r5 == 0) goto L_0x005f
            long r0 = r4.f60234z
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            androidx.fragment.app.h r2 = r4.getActivity()
            boolean r3 = r2 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r3 == 0) goto L_0x0052
            r6 = r2
            com.carrefour.fid.android.navigation.BottomNavActivity r6 = (com.carrefour.fid.android.navigation.BottomNavActivity) r6
        L_0x0052:
            if (r6 == 0) goto L_0x0057
            r6.mo121096G2()
        L_0x0057:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.a r2 = r4.mo70237i1()
            r2.mo76668k()
            goto L_0x008f
        L_0x005f:
            if (r5 == 0) goto L_0x007f
            long r0 = r4.f60234z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            androidx.fragment.app.h r2 = r4.getActivity()
            boolean r3 = r2 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r3 == 0) goto L_0x0072
            r6 = r2
            com.carrefour.fid.android.navigation.BottomNavActivity r6 = (com.carrefour.fid.android.navigation.BottomNavActivity) r6
        L_0x0072:
            if (r6 == 0) goto L_0x0077
            r6.mo121120W1()
        L_0x0077:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.a r2 = r4.mo70237i1()
            r2.mo76668k()
            goto L_0x008f
        L_0x007f:
            androidx.fragment.app.h r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0088
            r2.onBackPressed()
        L_0x0088:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.a r2 = r4.mo70237i1()
            r2.mo76668k()
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.gazStation.ServiceStationsResultFragment.m106011z1(boolean, boolean, com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsResultFragment, boolean, android.view.View):void");
    }

    /* renamed from: A1 */
    public final void mo70232A1() {
        mo70243o1();
        ((C36812r3) getBinding()).f91573c.f91152c.setImageResource(R.drawable.ic_service_stations_error);
        ((C36812r3) getBinding()).f91573c.f91154e.setText(getString(R.string.service_stations_result_title_limit_exceed));
        ((C36812r3) getBinding()).f91573c.f91151b.setText(getString(R.string.service_stations_result_button_error_ok));
        ((C36812r3) getBinding()).f91573c.f91153d.setVisibility(4);
        ((C36812r3) getBinding()).f91573c.getRoot().setVisibility(0);
        ((C36812r3) getBinding()).f91573c.f91155f.setVisibility(0);
    }

    /* renamed from: B1 */
    public final void mo70233B1(boolean z, boolean z2, String str) {
        int i;
        ((C36812r3) getBinding()).f91573c.getRoot().setVisibility(0);
        TextView textView = ((C36812r3) getBinding()).f91573c.f91153d;
        if (z && !z2) {
            str = getString(R.string.service_stations_result_success_subtitle);
        }
        textView.setText(str);
        TextView textView2 = ((C36812r3) getBinding()).f91573c.f91154e;
        if (z2) {
            i = R.string.service_stations_ticket_already_used;
        } else {
            i = R.string.service_stations_result_success_title;
        }
        textView2.setText(getString(i));
        if (!z) {
            ((C36812r3) getBinding()).f91573c.f91152c.setImageResource(R.drawable.ic_service_stations_error);
            ((C36812r3) getBinding()).f91573c.f91154e.setText(getString(R.string.service_stations_result_title_error));
            ((C36812r3) getBinding()).f91573c.f91151b.setText(getString(R.string.service_stations_result_button_error));
            mo70237i1().mo76665h();
            return;
        }
        mo70237i1().mo76666i();
    }

    /* renamed from: D1 */
    public final void mo70234D1() {
        this.f60231w = new C24012d(this, this.f60234z).start();
        this.f60232x = true;
    }

    /* renamed from: E1 */
    public final void mo70235E1() {
        long j = this.f60234z;
        if (j <= 0) {
            ((C36812r3) getBinding()).f91573c.f91155f.setText(getString(R.string.service_stations_counter_text, "00:00"));
            return;
        }
        long j2 = (long) 1000;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((int) (j / j2)) / 60), Integer.valueOf(((int) (j / j2)) % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        ((C36812r3) getBinding()).f91573c.f91155f.setText(getString(R.string.service_stations_counter_text, format));
    }

    /* renamed from: h1 */
    public final C11079d2 mo70236h1() {
        CountDownTimer countDownTimer = this.f60231w;
        if (countDownTimer == null) {
            return null;
        }
        countDownTimer.cancel();
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: i1 */
    public final C26350a mo70237i1() {
        C26350a aVar = this.f60230v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: j1 */
    public final C24051x mo70238j1() {
        return (C24051x) this.f60228f.getValue();
    }

    /* renamed from: k1 */
    public final ServiceStationsResultViewModel mo70239k1() {
        return (ServiceStationsResultViewModel) this.f60229g.getValue();
    }

    /* renamed from: l1 */
    public final void mo70240l1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            showLoading();
        } else {
            hideLoading();
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36812r3) getBinding()).f91572b;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.serviceResultShimmerContainer");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo70241m1(Throwable th) {
        String str;
        String str2;
        if (th instanceof GazStationLimitExceedThrowable) {
            mo70246r1();
            return;
        }
        String str3 = "";
        if (th instanceof GazStationPostTicketThrowable) {
            m106010y1(this, false, false, false, 2, (Object) null);
            String a = ((GazStationPostTicketThrowable) th).mo83796a();
            if (a == null) {
                str2 = str3;
            } else {
                str2 = a;
            }
            m105992C1(this, false, false, str2, 2, (Object) null);
            return;
        }
        C28935i iVar = C28935i.f70940a;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        if (str != null) {
            str3 = str;
        }
        C28935i.m119705e(iVar, str3, th, 0, 4, (Object) null);
    }

    /* renamed from: n1 */
    public final void mo70242n1(C38527s sVar) {
        if (!sVar.mo122154h()) {
            mo70243o1();
        }
        m106010y1(this, true, false, sVar.mo122154h(), 2, (Object) null);
        mo70233B1(true, sVar.mo122154h(), sVar.mo122152f());
    }

    /* renamed from: o1 */
    public final void mo70243o1() {
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.m158944r0(M1, false, (C11300l) null, false, 6, (Object) null);
        }
    }

    public void onPause() {
        super.onPause();
        this.f60232x = false;
        this.f60233y = true;
        mo70236h1();
    }

    public void onStart() {
        super.onStart();
        mo70249u1();
    }

    public void onStop() {
        super.onStop();
        this.f60232x = false;
        this.f60233y = true;
        mo70236h1();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo70244p1();
        ServiceStationsResultViewModel k1 = mo70239k1();
        k1.mo83419d0().mo57491k(getViewLifecycleOwner(), new C24009a());
        k1.mo83418c0().mo57491k(getViewLifecycleOwner(), new C24010b());
        k1.mo76645n0().mo57491k(getViewLifecycleOwner(), new C24011c());
        showLoading();
        mo70245q1();
    }

    /* renamed from: p1 */
    public final void mo70244p1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.service_stations_toolbar_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, ServiceStationsResultFragment$initToolbar$1$1.f60240f, 1, (Object) null);
        }
    }

    /* renamed from: q1 */
    public final void mo70245q1() {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsResultFragment$manageLimitExceeded$1(this, (C11045c<? super ServiceStationsResultFragment$manageLimitExceeded$1>) null), 3, (Object) null);
    }

    /* renamed from: r1 */
    public final void mo70246r1() {
        mo70247s1();
        hideLoading();
        mo70232A1();
        m106010y1(this, false, true, false, 4, (Object) null);
        mo70235E1();
        mo70234D1();
    }

    /* renamed from: s1 */
    public final void mo70247s1() {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsResultFragment$manageTimeLeftCounter$1(this, (C11045c<? super ServiceStationsResultFragment$manageTimeLeftCounter$1>) null), 3, (Object) null);
    }

    /* renamed from: t1 */
    public final void mo70248t1() {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsResultFragment$onCountDownFinished$1(this, (C11045c<? super ServiceStationsResultFragment$onCountDownFinished$1>) null), 3, (Object) null);
    }

    /* renamed from: u1 */
    public final void mo70249u1() {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsResultFragment$resumeTimer$1(this, (C11045c<? super ServiceStationsResultFragment$resumeTimer$1>) null), 3, (Object) null);
    }

    /* renamed from: v1 */
    public final Object mo70250v1(C11045c<? super C11079d2> cVar) {
        Object u0;
        String e = mo70238j1().mo70359e();
        if (e == null || (u0 = mo70239k1().mo76651u0(e, cVar)) != C11063b.m42612h()) {
            return C11079d2.f28267a;
        }
        return u0;
    }

    /* renamed from: w1 */
    public final void mo70251w1(@C12579k C26350a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f60230v = aVar;
    }

    /* renamed from: x1 */
    public final void mo70252x1(boolean z, boolean z2, boolean z3) {
        ((C36812r3) getBinding()).f91573c.f91151b.setOnClickListener(new C24050w(z, z3, this, z2));
    }
}
