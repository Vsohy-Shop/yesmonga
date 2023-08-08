package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.C0327c1;
import androidx.annotation.C0346i;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20435d;
import androidx.savedstate.C20437e;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.p */
public class C0249p extends Dialog implements C19499w, C0213a0, C20437e {
    @C12580l

    /* renamed from: a */
    public C19512y f741a;
    @C12579k

    /* renamed from: b */
    public final C20435d f742b;
    @C12579k

    /* renamed from: c */
    public final OnBackPressedDispatcher f743c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C0249p(@C12579k Context context) {
        this(context, 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: e */
    public static /* synthetic */ void m1337e() {
    }

    /* renamed from: g */
    public static final void m1338g(C0249p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "this$0");
        super.onBackPressed();
    }

    @C12579k
    /* renamed from: Z */
    public final OnBackPressedDispatcher mo702Z() {
        return this.f743c;
    }

    public void addContentView(@C12579k View view, @C12580l ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        mo837f();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: d */
    public final C19512y mo836d() {
        C19512y yVar = this.f741a;
        if (yVar != null) {
            return yVar;
        }
        C19512y yVar2 = new C19512y(this);
        this.f741a = yVar2;
        return yVar2;
    }

    /* renamed from: f */
    public final void mo837f() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.m90621b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.m1268b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.m95252b(decorView3, this);
    }

    @C12579k
    public Lifecycle getLifecycle() {
        return mo836d();
    }

    @C12579k
    public C20431c getSavedStateRegistry() {
        return this.f742b.mo61295b();
    }

    @C0346i
    public void onBackPressed() {
        this.f743c.mo767f();
    }

    @C0346i
    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f743c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.mo768g(onBackInvokedDispatcher);
        }
        this.f742b.mo61297d(bundle);
        mo836d().mo57705l(Lifecycle.C19372Event.ON_CREATE);
    }

    @C12579k
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f742b.mo61298e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @C0346i
    public void onStart() {
        super.onStart();
        mo836d().mo57705l(Lifecycle.C19372Event.ON_RESUME);
    }

    @C0346i
    public void onStop() {
        mo836d().mo57705l(Lifecycle.C19372Event.ON_DESTROY);
        this.f741a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        mo837f();
        super.setContentView(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0249p(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public C0249p(@C12579k Context context, @C0327c1 int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f742b = C20435d.f52691d.mo61299a(this);
        this.f743c = new OnBackPressedDispatcher(new C0248o(this));
    }

    public void setContentView(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        mo837f();
        super.setContentView(view);
    }

    public void setContentView(@C12579k View view, @C12580l ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        mo837f();
        super.setContentView(view, layoutParams);
    }
}
