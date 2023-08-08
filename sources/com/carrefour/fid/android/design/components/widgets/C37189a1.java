package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19215c;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37072q0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0014\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/a1;", "Landroidx/fragment/app/c;", "", "getTheme", "Landroid/content/Context;", "context", "Lkotlin/d2;", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "S0", "initListeners", "numberOfStars", "a1", "b1", "c1", "Lcom/carrefour/fid/android/design/components/databinding/q0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/q0;", "_binding", "Lcom/carrefour/fid/android/design/components/widgets/a1$a;", "b", "Lcom/carrefour/fid/android/design/components/widgets/a1$a;", "listener", "c", "I", "ratingValue", "R0", "()Lcom/carrefour/fid/android/design/components/databinding/q0;", "binding", "<init>", "()V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.a1 */
public final class C37189a1 extends C19215c {

    /* renamed from: d */
    public static final int f93285d = 8;
    @C12580l

    /* renamed from: a */
    public C37072q0 f93286a;

    /* renamed from: b */
    public C37190a f93287b;

    /* renamed from: c */
    public int f93288c;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.a1$a */
    public interface C37190a {
        /* renamed from: B */
        void mo113268B();

        /* renamed from: m */
        void mo113269m();
    }

    /* renamed from: T0 */
    public static final void m152724T0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.mo113264a1(1);
    }

    /* renamed from: U0 */
    public static final void m152725U0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.mo113264a1(2);
    }

    /* renamed from: V0 */
    public static final void m152726V0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.mo113264a1(3);
    }

    /* renamed from: W0 */
    public static final void m152727W0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.mo113264a1(4);
    }

    /* renamed from: X0 */
    public static final void m152728X0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.mo113264a1(5);
    }

    /* renamed from: Y0 */
    public static final void m152729Y0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        C37190a aVar = a1Var.f93287b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C40852x.C40853a.f103958a);
            aVar = null;
        }
        aVar.mo113268B();
    }

    /* renamed from: Z0 */
    public static final void m152730Z0(C37189a1 a1Var, View view) {
        Intrinsics.checkNotNullParameter(a1Var, "this$0");
        a1Var.dismiss();
    }

    /* renamed from: R0 */
    public final C37072q0 mo113262R0() {
        C37072q0 q0Var = this.f93286a;
        Intrinsics.checkNotNull(q0Var);
        return q0Var;
    }

    /* renamed from: S0 */
    public final int mo113263S0() {
        return this.f93288c;
    }

    /* renamed from: a1 */
    public final void mo113264a1(int i) {
        this.f93288c = i;
        mo113265b1(i);
        mo113262R0().f92795k.setEnabled(true);
    }

    /* renamed from: b1 */
    public final void mo113265b1(int i) {
        if (i >= 1) {
            mo113262R0().f92791g.setActivated(true);
        }
        if (i >= 2) {
            mo113262R0().f92794j.setActivated(true);
        }
        if (i >= 3) {
            mo113262R0().f92792h.setActivated(true);
        }
        if (i >= 4) {
            mo113262R0().f92789e.setActivated(true);
        }
        if (i == 5) {
            mo113262R0().f92788d.setActivated(true);
        }
        if (i == 1) {
            mo113262R0().f92794j.setActivated(false);
        }
        if (i <= 2) {
            mo113262R0().f92792h.setActivated(false);
        }
        if (i <= 3) {
            mo113262R0().f92789e.setActivated(false);
        }
        if (i <= 4) {
            mo113262R0().f92788d.setActivated(false);
        }
    }

    /* renamed from: c1 */
    public final void mo113266c1() {
        ImageButton imageButton = mo113262R0().f92791g;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.ratingOne");
        int i = C36896b.C36912p.accessibility_rating_star;
        String string = getString(i, 1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.accessibility_rating_star, 1)");
        ViewKt.m152121c(imageButton, string, false, 2, (Object) null);
        ImageButton imageButton2 = mo113262R0().f92794j;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "binding.ratingTwo");
        String string2 = getString(i, 2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.accessibility_rating_star, 2)");
        ViewKt.m152121c(imageButton2, string2, false, 2, (Object) null);
        ImageButton imageButton3 = mo113262R0().f92792h;
        Intrinsics.checkNotNullExpressionValue(imageButton3, "binding.ratingThree");
        String string3 = getString(i, 3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.accessibility_rating_star, 3)");
        ViewKt.m152121c(imageButton3, string3, false, 2, (Object) null);
        ImageButton imageButton4 = mo113262R0().f92789e;
        Intrinsics.checkNotNullExpressionValue(imageButton4, "binding.ratingFour");
        String string4 = getString(i, 4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.accessibility_rating_star, 4)");
        ViewKt.m152121c(imageButton4, string4, false, 2, (Object) null);
        ImageButton imageButton5 = mo113262R0().f92788d;
        Intrinsics.checkNotNullExpressionValue(imageButton5, "binding.ratingFive");
        String string5 = getString(i, 5);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.accessibility_rating_star, 5)");
        ViewKt.m152121c(imageButton5, string5, false, 2, (Object) null);
    }

    public int getTheme() {
        return C36896b.C36913q.DialogStyle;
    }

    public final void initListeners() {
        mo113262R0().f92791g.setOnClickListener(new C37410t0(this));
        mo113262R0().f92794j.setOnClickListener(new C37413u0(this));
        mo113262R0().f92792h.setOnClickListener(new C37416v0(this));
        mo113262R0().f92789e.setOnClickListener(new C37420w0(this));
        mo113262R0().f92788d.setOnClickListener(new C37429x0(this));
        mo113262R0().f92795k.setOnClickListener(new C37432y0(this));
        mo113262R0().f92786b.setOnClickListener(new C37434z0(this));
    }

    public void onAttach(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        super.onAttach(context);
        try {
            this.f93287b = (C37190a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement RatingDialogListener");
        }
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.f93286a = C37072q0.m152045d(layoutInflater, viewGroup, false);
        initListeners();
        mo113266c1();
        ConstraintLayout b = mo113262R0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f93286a = null;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        super.onDismiss(dialogInterface);
        C37190a aVar = this.f93287b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C40852x.C40853a.f103958a);
            aVar = null;
        }
        aVar.mo113269m();
    }
}
