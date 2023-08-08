package com.contentsquare.android.internal.features.clientmode.p024ui.fab;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.WindowManager;
import androidx.preference.C19965r;
import com.contentsquare.android.sdk.C14312ef;
import com.contentsquare.android.sdk.C14325f5;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14496l7;
import com.contentsquare.android.sdk.C14817w6;
import com.contentsquare.android.sdk.C14841we;
import com.contentsquare.android.sdk.C14898ye;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo22516d2 = {"Lcom/contentsquare/android/internal/features/clientmode/ui/fab/FabService;", "Landroid/app/Service;", "Lkotlin/d2;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "onDestroy", "rootIntent", "onTaskRemoved", "f", "e", "b", "c", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Lcom/contentsquare/android/sdk/w6;", "fabLayoutManager", "Lcom/contentsquare/android/sdk/w6;", "d", "()Lcom/contentsquare/android/sdk/w6;", "setFabLayoutManager", "(Lcom/contentsquare/android/sdk/w6;)V", "getFabLayoutManager$annotations", "()V", "<init>", "a", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.fab.FabService */
public final class FabService extends Service {

    /* renamed from: a */
    public C14496l7 f34949a;

    /* renamed from: b */
    public C14817w6 f34950b;

    /* renamed from: c */
    public WindowManager f34951c;

    /* renamed from: d */
    public final C14453jf f34952d = new C14453jf("FabService");

    /* renamed from: e */
    public C14325f5 f34953e;

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.fab.FabService$a */
    public final class C14130a implements C14325f5 {
        public C14130a() {
        }

        /* renamed from: a */
        public void mo34402a() {
            C14898ye.C14899a c = FabService.m60684a(FabService.this).mo35812c();
            if ((c instanceof C14898ye.C14899a.C14900a) || (c instanceof C14898ye.C14899a.C14909g)) {
                FabService.this.mo34395d().mo36700j(c);
            }
        }
    }

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.fab.FabService$b */
    public static final class C14131b implements C14817w6.C14818a {

        /* renamed from: a */
        public final /* synthetic */ FabService f34955a;

        public C14131b(FabService fabService) {
            this.f34955a = fabService;
        }

        /* renamed from: a */
        public void mo34403a() {
            this.f34955a.mo34395d().mo36701k(FabService.m60684a(this.f34955a).mo35811b());
            FabService.m60684a(this.f34955a).mo35810a();
        }

        /* renamed from: b */
        public void mo34404b() {
            FabService.m60684a(this.f34955a).mo35813d();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C14496l7 m60684a(FabService fabService) {
        C14496l7 l7Var = fabService.f34949a;
        if (l7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return l7Var;
    }

    /* renamed from: b */
    public final void mo34393b() {
        C14817w6 w6Var = this.f34950b;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayoutManager");
        }
        w6Var.mo36697f();
        mo34394c();
    }

    /* renamed from: c */
    public final void mo34394c() {
        C14817w6 w6Var = this.f34950b;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayoutManager");
        }
        w6Var.mo36693L();
        if (this.f34953e != null) {
            C14496l7 l7Var = this.f34949a;
            if (l7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            C14841we<C14898ye.C14899a> e = l7Var.mo35814e();
            C14325f5 f5Var = this.f34953e;
            Intrinsics.checkNotNull(f5Var);
            e.mo34978c(f5Var);
            this.f34953e = null;
        }
    }

    /* renamed from: d */
    public final C14817w6 mo34395d() {
        C14817w6 w6Var = this.f34950b;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayoutManager");
        }
        return w6Var;
    }

    /* renamed from: e */
    public final void mo34396e() {
        C14312ef b = C14312ef.m61521b(getApplication());
        Intrinsics.checkNotNullExpressionValue(b, "CsClientModeModule.getInstance(this.application)");
        C14817w6 c = b.mo35092c();
        Intrinsics.checkNotNullExpressionValue(c, "CsClientModeModule.getIn…ication).fabLayoutManager");
        c.mo36688G();
        c.mo36698g(new C14131b(this));
        C11079d2 d2Var = C11079d2.f28267a;
        this.f34950b = c;
    }

    /* renamed from: f */
    public final void mo34397f() {
        C14130a aVar = new C14130a();
        C14496l7 l7Var = this.f34949a;
        if (l7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        l7Var.mo35814e().mo34979d(aVar);
        C11079d2 d2Var = C11079d2.f28267a;
        this.f34953e = aVar;
    }

    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Object systemService = getApplication().getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        this.f34951c = (WindowManager) systemService;
        C14312ef b = C14312ef.m61521b(getApplication());
        Intrinsics.checkNotNullExpressionValue(b, "CsClientModeModule.getInstance(this.application)");
        C14496l7 d = b.mo35093d();
        Intrinsics.checkNotNullExpressionValue(d, "csClientModeModule.fabViewModel");
        this.f34949a = d;
        if (this.f34951c == null) {
            stopSelf();
            return;
        }
        mo34397f();
        mo34396e();
    }

    public void onDestroy() {
        this.f34952d.mo35681l("OnDestroy : ClientModeService is being destroyed ", new Object[0]);
        mo34393b();
        super.onDestroy();
    }

    public void onTaskRemoved(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "rootIntent");
        mo34393b();
        stopSelf();
        super.onTaskRemoved(intent);
    }
}
