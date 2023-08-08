package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016JQ\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010 J\u0006\u0010!\u001a\u00020\u0004J3\u0010\"\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0006\u0010$\u001a\u00020\u0004J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010/R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00101\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, mo22516d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "Lkotlin/d2;", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "Landroidx/compose/foundation/interaction/i$b;", "interaction", "bounded", "Landroidx/compose/ui/geometry/m;", "size", "radius", "Landroidx/compose/ui/graphics/j2;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Landroidx/compose/foundation/interaction/i$b;ZJIJFLkotlin/jvm/functions/a;)V", "e", "f", "(JIJF)V", "d", "c", "Landroidx/compose/material/ripple/l;", "a", "Landroidx/compose/material/ripple/l;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/jvm/functions/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class RippleHostView extends View {
    @C12579k

    /* renamed from: f */
    public static final C7912a f19012f = new C7912a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final long f19013g = 5;

    /* renamed from: v */
    public static final long f19014v = 50;
    @C12579k

    /* renamed from: w */
    public static final int[] f19015w = {16842919, 16842910};
    @C12579k

    /* renamed from: x */
    public static final int[] f19016x = new int[0];
    @C12580l

    /* renamed from: a */
    public C7925l f19017a;
    @C12580l

    /* renamed from: b */
    public Boolean f19018b;
    @C12580l

    /* renamed from: c */
    public Long f19019c;
    @C12580l

    /* renamed from: d */
    public Runnable f19020d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f19021e;

    /* renamed from: androidx.compose.material.ripple.RippleHostView$a */
    public static final class C7912a {
        public /* synthetic */ C7912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7912a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleHostView(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f19020d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f19019c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (z || j2 >= 5) {
            if (z) {
                iArr = f19015w;
            } else {
                iArr = f19016x;
            }
            C7925l lVar = this.f19017a;
            if (lVar != null) {
                lVar.setState(iArr);
            }
        } else {
            C7920h hVar = new C7920h(this);
            this.f19020d = hVar;
            postDelayed(hVar, 50);
        }
        this.f19019c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "this$0");
        C7925l lVar = rippleHostView.f19017a;
        if (lVar != null) {
            lVar.setState(f19016x);
        }
        rippleHostView.f19020d = null;
    }

    /* renamed from: b */
    public final void mo11036b(@C12579k C2245i.C2247b bVar, boolean z, long j, int i, long j2, float f, @C12579k C11289a<C11079d2> aVar) {
        boolean z2 = z;
        C11289a<C11079d2> aVar2 = aVar;
        C2245i.C2247b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar, "interaction");
        Intrinsics.checkNotNullParameter(aVar2, "onInvalidateRipple");
        if (this.f19017a == null || !Intrinsics.areEqual((Object) Boolean.valueOf(z), (Object) this.f19018b)) {
            mo11037c(z);
            this.f19018b = Boolean.valueOf(z);
        }
        C7925l lVar = this.f19017a;
        Intrinsics.checkNotNull(lVar);
        this.f19021e = aVar2;
        mo11040f(j, i, j2, f);
        if (z2) {
            lVar.setHotspot(C15094f.m64880p(bVar.mo7608a()), C15094f.m64882r(bVar.mo7608a()));
        } else {
            lVar.setHotspot((float) lVar.getBounds().centerX(), (float) lVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: c */
    public final void mo11037c(boolean z) {
        C7925l lVar = new C7925l(z);
        setBackground(lVar);
        this.f19017a = lVar;
    }

    /* renamed from: d */
    public final void mo11038d() {
        this.f19021e = null;
        Runnable runnable = this.f19020d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f19020d;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            C7925l lVar = this.f19017a;
            if (lVar != null) {
                lVar.setState(f19016x);
            }
        }
        C7925l lVar2 = this.f19017a;
        if (lVar2 != null) {
            lVar2.setVisible(false, false);
            unscheduleDrawable(lVar2);
        }
    }

    /* renamed from: e */
    public final void mo11039e() {
        setRippleState(false);
    }

    /* renamed from: f */
    public final void mo11040f(long j, int i, long j2, float f) {
        C7925l lVar = this.f19017a;
        if (lVar != null) {
            lVar.mo11069c(i);
            lVar.mo11068b(j2, f);
            Rect rect = new Rect(0, 0, C11409d.m43851L0(C15104m.m65023t(j)), C11409d.m43851L0(C15104m.m65016m(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            lVar.setBounds(rect);
        }
    }

    public void invalidateDrawable(@C12579k Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "who");
        C11289a<C11079d2> aVar = this.f19021e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}
