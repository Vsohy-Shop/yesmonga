package com.urbanairship.android.layout.p053ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0475e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18026a4;
import androidx.lifecycle.C19501x;
import com.urbanairship.C36059m;
import com.urbanairship.android.layout.C35573b;
import com.urbanairship.android.layout.C35576d;
import com.urbanairship.android.layout.C35581e;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.ModelFactoryException;
import com.urbanairship.android.layout.display.C35578a;
import com.urbanairship.android.layout.display.DisplayArgsLoader;
import com.urbanairship.android.layout.environment.C35596f;
import com.urbanairship.android.layout.environment.C35598h;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35606m;
import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35841l;
import com.urbanairship.android.layout.property.Orientation;
import com.urbanairship.android.layout.reporting.C35868d;
import com.urbanairship.android.layout.reporting.DisplayTimer;
import com.urbanairship.android.layout.view.ModalView;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)¨\u0006/"}, mo22516d2 = {"Lcom/urbanairship/android/layout/ui/ModalActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "onDestroy", "outState", "onSaveInstanceState", "onBackPressed", "Lkotlinx/coroutines/flow/e;", "Lcom/urbanairship/android/layout/environment/LayoutEvent;", "events", "Lkotlinx/coroutines/c2;", "V0", "Lcom/urbanairship/android/layout/reporting/d;", "state", "X0", "Lcom/urbanairship/android/layout/property/l;", "placement", "Z0", "Lcom/urbanairship/android/layout/ui/d;", "U0", "Lkotlin/z;", "()Lcom/urbanairship/android/layout/ui/d;", "viewModel", "Lcom/urbanairship/android/layout/display/DisplayArgsLoader;", "Lcom/urbanairship/android/layout/display/DisplayArgsLoader;", "loader", "Lcom/urbanairship/android/layout/k;", "W0", "Lcom/urbanairship/android/layout/k;", "externalListener", "Lcom/urbanairship/android/layout/environment/m;", "Lcom/urbanairship/android/layout/environment/m;", "reporter", "Lcom/urbanairship/android/layout/reporting/DisplayTimer;", "Y0", "Lcom/urbanairship/android/layout/reporting/DisplayTimer;", "displayTimer", "", "Z", "disableBackButton", "<init>", "()V", "a1", "a", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
/* renamed from: com.urbanairship.android.layout.ui.ModalActivity */
public final class ModalActivity extends C0475e {
    @C12579k

    /* renamed from: a1 */
    public static final C35878a f88738a1 = new C35878a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b1 */
    public static final String f88739b1 = "com.urbanairship.android.layout.ui.EXTRA_DISPLAY_ARGS_LOADER";
    @C12579k

    /* renamed from: c1 */
    public static final String f88740c1 = "display_time";
    @C12579k

    /* renamed from: U0 */
    public final C11677z f88741U0 = C10864b0.m38748c(new ModalActivity$viewModel$2(this));

    /* renamed from: V0 */
    public DisplayArgsLoader f88742V0;

    /* renamed from: W0 */
    public C35700k f88743W0;

    /* renamed from: X0 */
    public C35606m f88744X0;

    /* renamed from: Y0 */
    public DisplayTimer f88745Y0;

    /* renamed from: Z0 */
    public boolean f88746Z0;

    /* renamed from: com.urbanairship.android.layout.ui.ModalActivity$a */
    public static final class C35878a {
        public /* synthetic */ C35878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35878a() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ModalActivity$b */
    public /* synthetic */ class C35879b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.PORTRAIT.ordinal()] = 1;
            iArr[Orientation.LANDSCAPE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: W0 */
    public static final void m147981W0(ModalActivity modalActivity, View view) {
        Intrinsics.checkNotNullParameter(modalActivity, "this$0");
        m147982Y0(modalActivity, (C35868d) null, 1, (Object) null);
        modalActivity.finish();
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m147982Y0(ModalActivity modalActivity, C35868d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = C35868d.m147936b();
            Intrinsics.checkNotNullExpressionValue(dVar, "empty()");
        }
        modalActivity.mo107500X0(dVar);
    }

    /* renamed from: U0 */
    public final C35895d mo107498U0() {
        return (C35895d) this.f88741U0.getValue();
    }

    /* renamed from: V0 */
    public final C11723c2 mo107499V0(C11907e<? extends LayoutEvent> eVar) {
        return C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ModalActivity$observeLayoutEvents$1(eVar, this, (C11045c<? super ModalActivity$observeLayoutEvents$1>) null), 3, (Object) null);
    }

    /* renamed from: X0 */
    public final void mo107500X0(C35868d dVar) {
        C35606m mVar = this.f88744X0;
        DisplayTimer displayTimer = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporter");
            mVar = null;
        }
        DisplayTimer displayTimer2 = this.f88745Y0;
        if (displayTimer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("displayTimer");
        } else {
            displayTimer = displayTimer2;
        }
        mVar.mo106647a(new ReportingEvent.C35617c(displayTimer.mo107378b()), dVar);
    }

    /* renamed from: Z0 */
    public final void mo107501Z0(C35841l lVar) {
        int i;
        try {
            if (lVar.mo107350e() == null) {
                return;
            }
            if (Build.VERSION.SDK_INT != 26) {
                Orientation e = lVar.mo107350e();
                if (e == null) {
                    i = -1;
                } else {
                    i = C35879b.$EnumSwitchMapping$0[e.ordinal()];
                }
                if (i == 1) {
                    setRequestedOrientation(1);
                } else if (i == 2) {
                    setRequestedOrientation(0);
                }
            } else {
                setRequestedOrientation(3);
            }
        } catch (Exception e2) {
            C36059m.m148411g(e2, "Unable to set orientation lock.", new Object[0]);
        }
    }

    public void onBackPressed() {
        if (!this.f88746Z0) {
            super.onBackPressed();
            m147982Y0(this, (C35868d) null, 1, (Object) null);
        }
    }

    public void onCreate(@C12580l Bundle bundle) {
        Object obj;
        long j;
        C35576d dVar;
        C35606m mVar;
        C35700k kVar;
        DisplayTimer displayTimer;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = getIntent().getParcelableExtra(f88739b1, DisplayArgsLoader.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra(f88739b1);
            if (!(parcelableExtra instanceof DisplayArgsLoader)) {
                parcelableExtra = null;
            }
            obj = (DisplayArgsLoader) parcelableExtra;
        }
        DisplayArgsLoader displayArgsLoader = (DisplayArgsLoader) obj;
        if (displayArgsLoader == null) {
            C36059m.m148409e("Missing layout args loader", new Object[0]);
            finish();
            return;
        }
        this.f88742V0 = displayArgsLoader;
        if (bundle2 != null) {
            j = bundle2.getLong("display_time");
        } else {
            j = 0;
        }
        this.f88745Y0 = new DisplayTimer(this, j);
        try {
            DisplayArgsLoader displayArgsLoader2 = this.f88742V0;
            if (displayArgsLoader2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loader");
                displayArgsLoader2 = null;
            }
            C35578a b = displayArgsLoader2.mo106587b();
            Intrinsics.checkNotNullExpressionValue(b, "loader.displayArgs");
            C35700k c = b.mo106596c();
            Intrinsics.checkNotNullExpressionValue(c, "args.listener");
            this.f88743W0 = c;
            if (c == null) {
                Intrinsics.throwUninitializedPropertyAccessException("externalListener");
                c = null;
            }
            this.f88744X0 = new C35598h(c);
            C35573b f = b.mo106597d().mo106855f();
            if (f instanceof C35576d) {
                dVar = (C35576d) f;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                C36059m.m148409e("Not a modal presentation", new Object[0]);
                finish();
                return;
            }
            this.f88746Z0 = dVar.mo106584g();
            C35841l f2 = dVar.mo106583f(this);
            Intrinsics.checkNotNullExpressionValue(f2, "presentation.getResolvedPlacement(this)");
            mo107501Z0(f2);
            if (f2.mo107236a()) {
                C18026a4.m81880c(getWindow(), false);
                Window window = getWindow();
                int i = C35625g.C35630e.system_bar_scrim_dark;
                window.setStatusBarColor(i);
                getWindow().setNavigationBarColor(i);
            }
            C35895d U0 = mo107498U0();
            C35606m mVar2 = this.f88744X0;
            if (mVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reporter");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            C35700k kVar2 = this.f88743W0;
            if (kVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("externalListener");
                kVar = null;
            } else {
                kVar = kVar2;
            }
            DisplayTimer displayTimer2 = this.f88745Y0;
            if (displayTimer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("displayTimer");
                displayTimer = null;
            } else {
                displayTimer = displayTimer2;
            }
            ModelEnvironment e0 = C35895d.m148014e0(U0, mVar, kVar, displayTimer, (C35603k) null, 8, (Object) null);
            BaseModel h0 = C35895d.m148015h0(mo107498U0(), b.mo106597d().mo106857h(), e0, (C35581e) null, 4, (Object) null);
            mo107499V0(e0.mo106631e());
            ModalView modalView = new ModalView(this, h0, dVar, new C35596f(this, b.mo106595b(), b.mo106598e(), b.mo106594a(), f2.mo107236a()));
            modalView.setId(mo107498U0().mo107534i0());
            modalView.setLayoutParams(new ConstraintLayout.C16926b(-1, -1));
            if (dVar.mo106585h()) {
                modalView.setOnClickOutsideListener(new C35897f(this));
            }
            setContentView((View) modalView);
        } catch (DisplayArgsLoader.LoadException e) {
            C36059m.m148411g(e, "Failed to load model!", new Object[0]);
            finish();
        } catch (ModelFactoryException e2) {
            C36059m.m148411g(e2, "Failed to load model!", new Object[0]);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            DisplayArgsLoader displayArgsLoader = this.f88742V0;
            if (displayArgsLoader == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loader");
                displayArgsLoader = null;
            }
            displayArgsLoader.mo106586a();
        }
    }

    public void onSaveInstanceState(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        DisplayTimer displayTimer = this.f88745Y0;
        if (displayTimer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("displayTimer");
            displayTimer = null;
        }
        bundle.putLong("display_time", displayTimer.mo107378b());
    }
}
