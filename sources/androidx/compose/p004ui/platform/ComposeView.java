package androidx.compose.p004ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR'\u0010\t\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0002\b\b0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, mo22516d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/d2;", "c", "(Landroidx/compose/runtime/o;I)V", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Landroidx/compose/runtime/g;", "content", "setContent", "(Lkotlin/jvm/functions/p;)V", "Landroidx/compose/runtime/z0;", "x", "Landroidx/compose/runtime/z0;", "", "<set-?>", "y", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.platform.ComposeView */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: z */
    public static final int f39316z = 8;
    @C12579k

    /* renamed from: x */
    public final C8700z0<C11304p<C8592o, Integer, C11079d2>> f39317x;

    /* renamed from: y */
    public boolean f39318y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ComposeView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @C8540g
    /* renamed from: c */
    public void mo10810c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(420213850);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        C11304p value = this.f39317x.getValue();
        if (value != null) {
            value.invoke(o, 0);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ComposeView$Content$1(this, i));
        }
    }

    @C12579k
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "javaClass.name");
        return name;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f39318y;
    }

    @C8544h(scheme = "[0[0]]")
    public final void setContent(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        this.f39318y = true;
        this.f39317x.setValue(pVar);
        if (isAttachedToWindow()) {
            mo45281f();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ComposeView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ComposeView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f39317x = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    }
}
