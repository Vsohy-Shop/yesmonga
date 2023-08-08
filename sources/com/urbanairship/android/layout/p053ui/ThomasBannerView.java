package com.urbanairship.android.layout.p053ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.C0322b;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18196h2;
import androidx.customview.widget.C18553d;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.C35572a;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35828a;
import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.property.C35843n;
import com.urbanairship.android.layout.property.ConstrainedSize;
import com.urbanairship.android.layout.property.VerticalPosition;
import com.urbanairship.android.layout.util.C35908c;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.util.C35923o;
import com.urbanairship.android.layout.widget.ConstrainedFrameLayout;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0003(,0B3\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0012\u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"j\u0002`#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u0002H\u0003R \u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"j\u0002`#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00107\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010JR$\u0010P\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010OR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010V\u001a\u00020/2\u0006\u0010S\u001a\u00020/8G@GX\u000e¢\u0006\f\u001a\u0004\bT\u00102\"\u0004\bU\u00104R$\u0010Y\u001a\u00020/2\u0006\u0010S\u001a\u00020/8G@GX\u000e¢\u0006\f\u001a\u0004\bW\u00102\"\u0004\bX\u00104¨\u0006]"}, mo22516d2 = {"Lcom/urbanairship/android/layout/ui/ThomasBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "G", "F", "B", "", "animate", "isInternal", "A", "", "animationIn", "animationOut", "setAnimations", "Lcom/urbanairship/android/layout/ui/ThomasBannerView$c;", "listener", "setListener", "computeScroll", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "onTouchEvent", "Lcom/urbanairship/android/layout/property/VerticalPosition;", "placement", "setPlacement", "Landroid/content/Context;", "context", "C", "z", "Lcom/urbanairship/android/layout/property/ConstrainedSize;", "size", "Lcom/urbanairship/android/layout/widget/ConstrainedFrameLayout;", "E", "H", "Lcom/urbanairship/android/layout/model/BaseModel;", "Lcom/urbanairship/android/layout/model/AnyModel;", "a", "Lcom/urbanairship/android/layout/model/BaseModel;", "model", "Lcom/urbanairship/android/layout/a;", "b", "Lcom/urbanairship/android/layout/a;", "presentation", "Lcom/urbanairship/android/layout/environment/p;", "c", "Lcom/urbanairship/android/layout/environment/p;", "environment", "", "d", "getMinFlingVelocity", "()F", "setMinFlingVelocity", "(F)V", "minFlingVelocity", "e", "overDragAmount", "f", "Lcom/urbanairship/android/layout/property/VerticalPosition;", "Landroidx/customview/widget/d;", "g", "Landroidx/customview/widget/d;", "dragHelper", "v", "Lcom/urbanairship/android/layout/widget/ConstrainedFrameLayout;", "bannerFrame", "Lcom/urbanairship/android/layout/util/o;", "w", "Lcom/urbanairship/android/layout/util/o;", "getDisplayTimer", "()Lcom/urbanairship/android/layout/util/o;", "displayTimer", "x", "I", "y", "Z", "isDismissed", "<set-?>", "E0", "D", "()Z", "isResumed", "F0", "Lcom/urbanairship/android/layout/ui/ThomasBannerView$c;", "value", "getYFraction", "setYFraction", "yFraction", "getXFraction", "setXFraction", "xFraction", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/BaseModel;Lcom/urbanairship/android/layout/a;Lcom/urbanairship/android/layout/environment/p;)V", "G0", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
/* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView */
public final class ThomasBannerView extends ConstraintLayout {
    @C12579k

    /* renamed from: G0 */
    public static final C35885b f88750G0 = new C35885b((DefaultConstructorMarker) null);

    /* renamed from: H0 */
    public static final float f88751H0 = 0.4f;

    /* renamed from: I0 */
    public static final float f88752I0 = 0.1f;

    /* renamed from: J0 */
    public static final int f88753J0 = 24;

    /* renamed from: E0 */
    public boolean f88754E0;
    @C12580l

    /* renamed from: F0 */
    public C35886c f88755F0;
    @C12579k

    /* renamed from: a */
    public final BaseModel<?, ?> f88756a;
    @C12579k

    /* renamed from: b */
    public final C35572a f88757b;
    @C12579k

    /* renamed from: c */
    public final C35614p f88758c;

    /* renamed from: d */
    public float f88759d;

    /* renamed from: e */
    public float f88760e;
    @C12579k

    /* renamed from: f */
    public VerticalPosition f88761f = VerticalPosition.BOTTOM;
    @C12580l

    /* renamed from: g */
    public C18553d f88762g;
    @C12580l

    /* renamed from: v */
    public ConstrainedFrameLayout f88763v;
    @C12579k

    /* renamed from: w */
    public final C35923o f88764w;
    @C0322b

    /* renamed from: x */
    public int f88765x;
    @C0322b

    /* renamed from: y */
    public int f88766y;

    /* renamed from: z */
    public boolean f88767z;

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$a */
    public static final class C35884a extends C35923o {

        /* renamed from: g */
        public final /* synthetic */ ThomasBannerView f88768g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35884a(ThomasBannerView thomasBannerView, long j) {
            super(j);
            this.f88768g = thomasBannerView;
        }

        /* renamed from: c */
        public void mo18316c() {
            C35886c v = this.f88768g.f88755F0;
            if (v != null) {
                v.mo107494b();
            }
            this.f88768g.mo107506B();
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$b */
    public static final class C35885b {
        public /* synthetic */ C35885b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35885b() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$c */
    public interface C35886c {
        /* renamed from: a */
        void mo107493a(int i);

        @C0353k0
        /* renamed from: b */
        void mo107494b();

        /* renamed from: c */
        void mo107495c();
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$d */
    public final class C35887d extends C18553d.C18556c {

        /* renamed from: a */
        public int f88769a;

        /* renamed from: b */
        public int f88770b;

        /* renamed from: c */
        public float f88771c;
        @C12580l

        /* renamed from: d */
        public View f88772d;

        /* renamed from: e */
        public boolean f88773e;

        /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$d$a */
        public /* synthetic */ class C35888a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VerticalPosition.values().length];
                iArr[VerticalPosition.f88541a.ordinal()] = 1;
                iArr[VerticalPosition.BOTTOM.ordinal()] = 2;
                iArr[VerticalPosition.CENTER.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C35887d() {
        }

        /* renamed from: a */
        public int mo18293a(@C12579k View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "child");
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo18294b(@C12579k View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "child");
            int i3 = C35888a.$EnumSwitchMapping$0[ThomasBannerView.this.f88761f.ordinal()];
            if (i3 == 1) {
                return C11409d.m43851L0(C11479u.m44310A((float) i, ((float) this.f88769a) + ThomasBannerView.this.f88760e));
            }
            if (i3 == 2 || i3 == 3) {
                return C11409d.m43851L0(C11479u.m44444t((float) i, ((float) this.f88769a) - ThomasBannerView.this.f88760e));
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: i */
        public void mo18295i(@C12579k View view, int i) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            this.f88772d = view;
            this.f88769a = view.getTop();
            this.f88770b = view.getLeft();
            this.f88771c = 0.0f;
            this.f88773e = false;
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            View view = this.f88772d;
            if (view != null) {
                ThomasBannerView thomasBannerView = ThomasBannerView.this;
                synchronized (this) {
                    C35886c v = thomasBannerView.f88755F0;
                    if (v != null) {
                        v.mo107493a(i);
                    }
                    if (i == 0) {
                        if (this.f88773e) {
                            C35886c v2 = thomasBannerView.f88755F0;
                            if (v2 != null) {
                                v2.mo107495c();
                            }
                            thomasBannerView.removeView(view);
                        }
                        this.f88772d = null;
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }

        /* renamed from: k */
        public void mo18297k(@C12579k View view, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            int height = ThomasBannerView.this.getHeight();
            int abs = Math.abs(i2 - this.f88769a);
            if (height > 0) {
                this.f88771c = ((float) abs) / ((float) height);
            }
            ThomasBannerView.this.invalidate();
        }

        /* renamed from: l */
        public void mo18298l(@C12579k View view, float f, float f2) {
            int i;
            boolean z;
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            float abs = Math.abs(f2);
            VerticalPosition verticalPosition = VerticalPosition.f88541a;
            if ((verticalPosition == ThomasBannerView.this.f88761f && this.f88769a >= view.getTop()) || this.f88769a <= view.getTop()) {
                if (this.f88771c >= 0.4f || abs > ThomasBannerView.this.getMinFlingVelocity() || this.f88771c > 0.1f) {
                    z = true;
                } else {
                    z = false;
                }
                this.f88773e = z;
            }
            if (this.f88773e) {
                if (verticalPosition == ThomasBannerView.this.f88761f) {
                    i = -view.getHeight();
                } else {
                    i = view.getHeight() + ThomasBannerView.this.getHeight();
                }
                C18553d u = ThomasBannerView.this.f88762g;
                if (u != null) {
                    u.mo53495V(this.f88770b, i);
                }
            } else {
                C18553d u2 = ThomasBannerView.this.f88762g;
                if (u2 != null) {
                    u2.mo53495V(this.f88770b, this.f88769a);
                }
            }
            ThomasBannerView.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo18299m(@C12579k View view, int i) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            if (this.f88772d == null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$e */
    public static final class C35889e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ThomasBannerView f88775a;

        /* renamed from: b */
        public final /* synthetic */ boolean f88776b;

        public C35889e(ThomasBannerView thomasBannerView, boolean z) {
            this.f88775a = thomasBannerView;
            this.f88776b = z;
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            C35886c v;
            Intrinsics.checkNotNullParameter(animator, C22218a.f57069g);
            this.f88775a.mo107512H();
            if (!this.f88776b && (v = this.f88775a.f88755F0) != null) {
                v.mo107495c();
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$f */
    public static final class C35890f implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ ThomasBannerView f88777a;

        /* renamed from: b */
        public final /* synthetic */ float f88778b;

        public C35890f(ThomasBannerView thomasBannerView, float f) {
            this.f88777a = thomasBannerView;
            this.f88778b = f;
        }

        public boolean onPreDraw() {
            this.f88777a.setXFraction(this.f88778b);
            this.f88777a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.urbanairship.android.layout.ui.ThomasBannerView$g */
    public static final class C35891g implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ ThomasBannerView f88779a;

        /* renamed from: b */
        public final /* synthetic */ float f88780b;

        public C35891g(ThomasBannerView thomasBannerView, float f) {
            this.f88779a = thomasBannerView;
            this.f88780b = f;
        }

        public boolean onPreDraw() {
            this.f88779a.setYFraction(this.f88780b);
            this.f88779a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThomasBannerView(@C12579k Context context, @C12579k BaseModel<?, ?> baseModel, @C12579k C35572a aVar, @C12579k C35614p pVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(baseModel, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(aVar, "presentation");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69167m0);
        this.f88756a = baseModel;
        this.f88757b = aVar;
        this.f88758c = pVar;
        this.f88764w = new C35884a(this, (long) aVar.mo106577e());
        mo107507C(context);
        setId(baseModel.mo107003r());
        mo107526z();
        mo107511G();
    }

    @C0353k0
    /* renamed from: A */
    public final void mo107505A(boolean z, boolean z2) {
        C35886c cVar;
        this.f88767z = true;
        this.f88764w.mo107584e();
        if (!z || this.f88763v == null || this.f88766y == 0) {
            mo107512H();
            if (!z2 && (cVar = this.f88755F0) != null) {
                cVar.mo107495c();
                return;
            }
            return;
        }
        clearAnimation();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), this.f88766y);
        loadAnimator.setTarget(this.f88763v);
        loadAnimator.addListener(new C35889e(this, z2));
        loadAnimator.start();
    }

    /* renamed from: B */
    public final void mo107506B() {
        mo107505A(true, false);
    }

    /* renamed from: C */
    public final void mo107507C(Context context) {
        if (!isInEditMode()) {
            this.f88762g = C18553d.m83926q(this, new C35887d());
            this.f88759d = (float) ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.f88760e = TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        }
    }

    /* renamed from: D */
    public final boolean mo107508D() {
        return this.f88754E0;
    }

    /* renamed from: E */
    public final ConstrainedFrameLayout mo107509E(ConstrainedSize constrainedSize) {
        ConstrainedFrameLayout constrainedFrameLayout = new ConstrainedFrameLayout(getContext(), constrainedSize);
        constrainedFrameLayout.setId(View.generateViewId());
        constrainedFrameLayout.setLayoutParams(new ConstraintLayout.C16926b(0, 0));
        constrainedFrameLayout.setElevation(C35921m.m148111a(constrainedFrameLayout.getContext(), 16));
        this.f88763v = constrainedFrameLayout;
        return constrainedFrameLayout;
    }

    @C0353k0
    @C0346i
    /* renamed from: F */
    public final void mo107510F() {
        this.f88754E0 = false;
        this.f88764w.mo107584e();
    }

    @C0353k0
    @C0346i
    /* renamed from: G */
    public final void mo107511G() {
        this.f88754E0 = true;
        if (!this.f88767z) {
            this.f88764w.mo107583d();
        }
    }

    @C0353k0
    /* renamed from: H */
    public final void mo107512H() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this);
            this.f88763v = null;
        }
    }

    public void computeScroll() {
        super.computeScroll();
        C18553d dVar = this.f88762g;
        boolean z = false;
        if (dVar != null && dVar.mo53513o(true)) {
            z = true;
        }
        if (z) {
            C18196h2.m82610n1(this);
        }
    }

    @C12579k
    public final C35923o getDisplayTimer() {
        return this.f88764w;
    }

    public final float getMinFlingVelocity() {
        return this.f88759d;
    }

    @Keep
    public final float getXFraction() {
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return getTranslationX() / ((float) width);
    }

    @Keep
    public final float getYFraction() {
        int height = getHeight();
        if (height == 0) {
            return 0.0f;
        }
        return getTranslationY() / ((float) height);
    }

    public boolean onInterceptTouchEvent(@C12579k MotionEvent motionEvent) {
        View v;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        C18553d dVar = this.f88762g;
        if (dVar == null) {
            return false;
        }
        if (dVar.mo53496W(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        if (dVar.mo53479F() != 0 || motionEvent.getActionMasked() != 2 || !dVar.mo53504f(2) || (v = dVar.mo53518v((int) motionEvent.getX(), (int) motionEvent.getY())) == null || v.canScrollVertically(dVar.mo53478E())) {
            return false;
        }
        dVar.mo53502d(v, motionEvent.getPointerId(0));
        if (dVar.mo53479F() == 1) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        View v;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        C18553d dVar = this.f88762g;
        if (dVar == null) {
            return false;
        }
        dVar.mo53486M(motionEvent);
        if (dVar.mo53522z() == null && motionEvent.getActionMasked() == 2 && dVar.mo53504f(2) && (v = dVar.mo53518v((int) motionEvent.getX(), (int) motionEvent.getY())) != null && !v.canScrollVertically(dVar.mo53478E())) {
            dVar.mo53502d(v, motionEvent.getPointerId(0));
        }
        if (dVar.mo53522z() != null) {
            return true;
        }
        return false;
    }

    public final void setAnimations(@C0322b int i, @C0322b int i2) {
        this.f88765x = i;
        this.f88766y = i2;
    }

    public final void setListener(@C12580l C35886c cVar) {
        this.f88755F0 = cVar;
    }

    public final void setMinFlingVelocity(float f) {
        this.f88759d = f;
    }

    public final void setPlacement(@C12579k VerticalPosition verticalPosition) {
        Intrinsics.checkNotNullParameter(verticalPosition, C9166d.f24869j0);
        this.f88761f = verticalPosition;
    }

    @Keep
    public final void setXFraction(float f) {
        if (getVisibility() == 0 && getHeight() == 0) {
            getViewTreeObserver().addOnPreDrawListener(new C35890f(this, f));
            return;
        }
        setTranslationX(f * ((float) getWidth()));
    }

    @Keep
    public final void setYFraction(float f) {
        if (getVisibility() == 0 && getHeight() == 0) {
            getViewTreeObserver().addOnPreDrawListener(new C35891g(this, f));
            return;
        }
        setTranslationY(f * ((float) getHeight()));
    }

    /* renamed from: z */
    public final void mo107526z() {
        C35828a d = this.f88757b.mo106576d();
        Intrinsics.checkNotNullExpressionValue(d, "presentation.defaultPlacement");
        ConstrainedSize f = d.mo107330f();
        Intrinsics.checkNotNullExpressionValue(f, "placement.size");
        C35843n e = d.mo107329e();
        C35840k d2 = d.mo107328d();
        ConstrainedFrameLayout E = mo107509E(f);
        BaseModel baseModel = this.f88756a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        E.addView(baseModel.mo106993h(context, this.f88758c));
        addView(E);
        int id = E.getId();
        C35908c.m148057j(getContext()).mo107562k(e, id).mo107564m(f, id).mo107559g(d2, id).mo107555c().mo50900r(this);
        if (this.f88758c.mo106644f()) {
            C18196h2.m82559a2(E, new C35898g());
        }
        if (this.f88765x != 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), this.f88765x);
            loadAnimator.setTarget(this.f88763v);
            loadAnimator.start();
        }
    }
}
