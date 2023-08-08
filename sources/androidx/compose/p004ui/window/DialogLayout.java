package androidx.compose.p004ui.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.p004ui.platform.AbstractComposeView;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.C16934c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:457\n216#1:458,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.DialogLayout */
public final class DialogLayout extends AbstractComposeView implements C16542c {

    /* renamed from: E0 */
    public boolean f40995E0;
    @C12579k

    /* renamed from: x */
    public final Window f40996x;
    @C12579k

    /* renamed from: y */
    public final C8700z0 f40997y = C8539f2.m30981g(ComposableSingletons$AndroidDialog_androidKt.f40989a.mo48024a(), (C8410b2) null, 2, (Object) null);

    /* renamed from: z */
    public boolean f40998z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(@C12579k Context context, @C12579k Window window) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(window, "window");
        this.f40996x = window;
    }

    @C8540g
    /* renamed from: c */
    public void mo10810c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1735448596);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:266)");
        }
        getContent().invoke(o, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogLayout$Content$4(this, i));
        }
    }

    public final C11304p<C8592o, Integer, C11079d2> getContent() {
        return (C11304p) this.f40997y.getValue();
    }

    public final int getDisplayHeight() {
        return C11409d.m43851L0(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public final int getDisplayWidth() {
        return C11409d.m43851L0(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f40995E0;
    }

    @C12579k
    public Window getWindow() {
        return this.f40996x;
    }

    /* renamed from: i */
    public void mo45286i(boolean z, int i, int i2, int i3, int i4) {
        super.mo45286i(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    /* renamed from: j */
    public void mo45288j(int i, int i2) {
        if (this.f40998z) {
            super.mo45288j(i, i2);
        } else {
            super.mo45288j(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    /* renamed from: m */
    public final boolean mo48032m() {
        return this.f40998z;
    }

    /* renamed from: n */
    public final void mo48033n(boolean z) {
        this.f40998z = z;
    }

    public final void setContent(C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        this.f40997y.setValue(pVar);
    }

    public final void setContent(@C12579k C8602q qVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(pVar, "content");
        setParentCompositionContext(qVar);
        setContent(pVar);
        this.f40995E0 = true;
        mo45281f();
    }
}
