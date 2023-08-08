package androidx.compose.p004ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.C8762h;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.events.C9175a;
import java.lang.ref.WeakReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010Y\u001a\u00020X\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z\u0012\b\b\u0002\u0010\\\u001a\u00020\u0012¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0004J7\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0012\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u0012H\u0016J\"\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016J\u001c\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J$\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J$\u0010-\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0014J,\u0010-\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020\u0018H\u0014J\b\u0010/\u001a\u00020\u0018H\u0016R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R(\u0010:\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0002@BX\u000e¢\u0006\f\n\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010<R(\u0010A\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00048\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010>\"\u0004\b?\u0010@R$\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0003\u0010C\u0012\u0004\bD\u0010ER0\u0010M\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00188F@FX\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010G\u0012\u0004\bL\u0010E\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u0016\u0010P\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010GR\u0018\u0010S\u001a\u00020\u0018*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00188TX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010IR\u0011\u0010W\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bV\u0010I¨\u0006_"}, mo22516d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lkotlin/d2;", "e", "Landroidx/compose/runtime/q;", "d", "l", "h", "parent", "setParentCompositionContext", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "c", "(Landroidx/compose/runtime/o;I)V", "f", "g", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "j", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "i", "(ZIIII)V", "layoutDirection", "onRtlPropertiesChanged", "isTransitionGroup", "setTransitionGroup", "Landroid/view/View;", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "b", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Landroidx/compose/runtime/p;", "Landroidx/compose/runtime/p;", "composition", "Landroidx/compose/runtime/q;", "setParentContext", "(Landroidx/compose/runtime/q;)V", "parentContext", "Lkotlin/Function0;", "Lkotlin/jvm/functions/a;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "creatingComposition", "v", "isTransitionGroupSet", "k", "(Landroidx/compose/runtime/q;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: w */
    public static final int f39099w = 8;
    @C12580l

    /* renamed from: a */
    public WeakReference<C8602q> f39100a;
    @C12580l

    /* renamed from: b */
    public IBinder f39101b;
    @C12580l

    /* renamed from: c */
    public C8598p f39102c;
    @C12580l

    /* renamed from: d */
    public C8602q f39103d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f39104e;

    /* renamed from: f */
    public boolean f39105f;

    /* renamed from: g */
    public boolean f39106g;

    /* renamed from: v */
    public boolean f39107v;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AbstractComposeView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @C8762h
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(C8602q qVar) {
        if (this.f39103d != qVar) {
            this.f39103d = qVar;
            if (qVar != null) {
                this.f39100a = null;
            }
            C8598p pVar = this.f39102c;
            if (pVar != null) {
                pVar.mo16284g();
                this.f39102c = null;
                if (isAttachedToWindow()) {
                    mo45285h();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f39101b != iBinder) {
            this.f39101b = iBinder;
            this.f39100a = null;
        }
    }

    public void addView(@C12580l View view) {
        mo45280e();
        super.addView(view);
    }

    public boolean addViewInLayout(@C12580l View view, int i, @C12580l ViewGroup.LayoutParams layoutParams) {
        mo45280e();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @C8540g
    @C8782q
    /* renamed from: c */
    public abstract void mo10810c(@C12580l C8592o oVar, int i);

    /* renamed from: d */
    public final C8602q mo45279d(C8602q qVar) {
        C8602q qVar2;
        if (mo45289k(qVar)) {
            qVar2 = qVar;
        } else {
            qVar2 = null;
        }
        if (qVar2 != null) {
            this.f39100a = new WeakReference<>(qVar2);
        }
        return qVar;
    }

    /* renamed from: e */
    public final void mo45280e() {
        if (!this.f39106g) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* renamed from: f */
    public final void mo45281f() {
        boolean z;
        if (this.f39103d != null || isAttachedToWindow()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo45285h();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    /* renamed from: g */
    public final void mo45282g() {
        C8598p pVar = this.f39102c;
        if (pVar != null) {
            pVar.mo16284g();
        }
        this.f39102c = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.f39102c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f39105f;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo45285h() {
        if (this.f39102c == null) {
            try {
                this.f39106g = true;
                this.f39102c = C15969s4.m71744e(this, mo45290l(), C8553b.m31049c(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
                this.f39106g = false;
            } catch (Throwable th) {
                this.f39106g = false;
                throw th;
            }
        }
    }

    /* renamed from: i */
    public void mo45286i(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public boolean isTransitionGroup() {
        return !this.f39107v || super.isTransitionGroup();
    }

    /* renamed from: j */
    public void mo45288j(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: k */
    public final boolean mo45289k(C8602q qVar) {
        return !(qVar instanceof Recomposer) || ((Recomposer) qVar).mo15249p0().getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    /* renamed from: l */
    public final C8602q mo45290l() {
        C8602q qVar;
        C8602q qVar2;
        C8602q qVar3 = this.f39103d;
        if (qVar3 != null) {
            return qVar3;
        }
        C8602q d = WindowRecomposer_androidKt.m71145d(this);
        C8602q qVar4 = null;
        if (d != null) {
            qVar = mo45279d(d);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return qVar;
        }
        WeakReference<C8602q> weakReference = this.f39100a;
        if (!(weakReference == null || (qVar2 = weakReference.get()) == null || !mo45289k(qVar2))) {
            qVar4 = qVar2;
        }
        C8602q qVar5 = qVar4;
        if (qVar5 == null) {
            return mo45279d(WindowRecomposer_androidKt.m71149h(this));
        }
        return qVar5;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            mo45285h();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo45286i(z, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        mo45285h();
        mo45288j(i, i2);
    }

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(@C12580l C8602q qVar) {
        setParentContext(qVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f39105f = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((C15675c1) childAt).setShowLayoutBounds(z);
        }
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f39107v = true;
    }

    public final void setViewCompositionStrategy(@C12579k ViewCompositionStrategy viewCompositionStrategy) {
        Intrinsics.checkNotNullParameter(viewCompositionStrategy, "strategy");
        C11289a<C11079d2> aVar = this.f39104e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f39104e = viewCompositionStrategy.mo45563a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AbstractComposeView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void addView(@C12580l View view, int i) {
        mo45280e();
        super.addView(view, i);
    }

    public boolean addViewInLayout(@C12580l View view, int i, @C12580l ViewGroup.LayoutParams layoutParams, boolean z) {
        mo45280e();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public AbstractComposeView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setClipChildren(false);
        setClipToPadding(false);
        this.f39104e = ViewCompositionStrategy.f39389a.mo45571a().mo45563a(this);
    }

    public void addView(@C12580l View view, int i, int i2) {
        mo45280e();
        super.addView(view, i, i2);
    }

    public void addView(@C12580l View view, @C12580l ViewGroup.LayoutParams layoutParams) {
        mo45280e();
        super.addView(view, layoutParams);
    }

    public void addView(@C12580l View view, int i, @C12580l ViewGroup.LayoutParams layoutParams) {
        mo45280e();
        super.addView(view, i, layoutParams);
    }
}
