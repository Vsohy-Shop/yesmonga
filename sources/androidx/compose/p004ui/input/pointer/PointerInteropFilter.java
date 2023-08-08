package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p004ui.C8761g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter */
public final class PointerInteropFilter implements C15469d0 {

    /* renamed from: a */
    public C11300l<? super MotionEvent, Boolean> f38445a;
    @C12580l

    /* renamed from: b */
    public C15488l0 f38446b;

    /* renamed from: c */
    public boolean f38447c;
    @C12579k

    /* renamed from: d */
    public final C15467c0 f38448d = new PointerInteropFilter$pointerInputFilter$1(this);

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState */
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @C12579k
    /* renamed from: C4 */
    public C15467c0 mo43971C4() {
        return this.f38448d;
    }

    /* renamed from: a */
    public final boolean mo43972a() {
        return this.f38447c;
    }

    @C12579k
    /* renamed from: b */
    public final C11300l<MotionEvent, Boolean> mo43973b() {
        C11300l<? super MotionEvent, Boolean> lVar = this.f38445a;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @C12580l
    /* renamed from: e */
    public final C15488l0 mo43974e() {
        return this.f38446b;
    }

    /* renamed from: g */
    public final void mo43975g(boolean z) {
        this.f38447c = z;
    }

    /* renamed from: l */
    public final void mo43976l(@C12579k C11300l<? super MotionEvent, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f38445a = lVar;
    }

    /* renamed from: m */
    public final void mo43977m(@C12580l C15488l0 l0Var) {
        C15488l0 l0Var2 = this.f38446b;
        if (l0Var2 != null) {
            l0Var2.mo44098c((PointerInteropFilter) null);
        }
        this.f38446b = l0Var;
        if (l0Var != null) {
            l0Var.mo44098c(this);
        }
    }
}
