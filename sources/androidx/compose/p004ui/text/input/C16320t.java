package androidx.compose.p004ui.text.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.window.C16542c;
import androidx.core.view.C18184g6;
import androidx.core.view.C18436z4;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(30)
@C11363r0({"SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.t */
public final class C16320t implements C16322u {
    @C12579k

    /* renamed from: a */
    public final View f40543a;
    @C12580l

    /* renamed from: b */
    public C16318s f40544b;

    public C16320t(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f40543a = view;
    }

    @C0373u
    /* renamed from: a */
    public void mo47309a(@C12579k InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        C18184g6 f = mo47316f();
        if (f != null) {
            f.mo52847d(C18436z4.C18449m.m83505d());
        } else {
            mo47315e().mo47309a(inputMethodManager);
        }
    }

    @C0373u
    /* renamed from: b */
    public void mo47310b(@C12579k InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "imm");
        C18184g6 f = mo47316f();
        if (f != null) {
            f.mo52854k(C18436z4.C18449m.m83505d());
        } else {
            mo47315e().mo47310b(inputMethodManager);
        }
    }

    /* renamed from: c */
    public final Window mo47313c(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "baseContext");
        }
        return ((Activity) context).getWindow();
    }

    /* renamed from: d */
    public final Window mo47314d(View view) {
        View view2;
        while (!(view instanceof C16542c)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 == null) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Window c = mo47313c(context);
                if (c == null) {
                    return null;
                }
                View decorView = c.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "windowFromContext.decorView");
                if (decorView == view) {
                    return c;
                }
                return null;
            }
            view = view2;
        }
        return ((C16542c) view).getWindow();
    }

    /* renamed from: e */
    public final C16318s mo47315e() {
        C16318s sVar = this.f40544b;
        if (sVar != null) {
            return sVar;
        }
        C16318s sVar2 = new C16318s(this.f40543a);
        this.f40544b = sVar2;
        return sVar2;
    }

    /* renamed from: f */
    public final C18184g6 mo47316f() {
        Window d = mo47314d(this.f40543a);
        if (d != null) {
            return new C18184g6(d, this.f40543a);
        }
        return null;
    }
}
