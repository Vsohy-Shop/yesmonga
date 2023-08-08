package com.carrefour.fid.android.design.components.widgets.swipetorefresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"DrawAllocation"})
@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 V2\u00020\u0001:\u0004.\u00139WB'\b\u0007\u0012\u0006\u0010R\u001a\u00020Q\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010S\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J0\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u0012\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\u001a\u0010(\u001a\u00020\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%J\u0014\u0010+\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)J\u0014\u0010,\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)R$\u00102\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8\u0004@BX\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00108\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0016\u0010=\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010@\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0016\u0010A\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010<R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\bI\u0010GR&\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020)0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010M¨\u0006X"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout;", "Landroid/view/ViewGroup;", "Lkotlin/d2;", "l", "i", "j", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$a;", "childView", "", "widthMeasureSpec", "heightMeasureSpec", "k", "q", "onFinishInflate", "onMeasure", "", "changed", "t", "r", "b", "onLayout", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "event", "onTouchEvent", "", "customDuration", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "checkLayoutParams", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/b;", "f", "Landroid/util/AttributeSet;", "attrs", "g", "generateLayoutParams", "Lkotlin/Function1;", "", "onProgressListener", "n", "Lkotlin/Function0;", "onTriggerListener", "o", "p", "<set-?>", "a", "I", "getTriggerOffSetTop", "()I", "triggerOffSetTop", "Z", "h", "()Z", "setCollapsedAppBar", "(Z)V", "isCollapsedAppBar", "c", "maxOffSetTop", "d", "F", "downX", "e", "downY", "offsetY", "lastPullFraction", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$State;", "v", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$State;", "currentState", "w", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$a;", "topChildView", "x", "contentChildView", "", "y", "Ljava/util/Collection;", "onProgressListeners", "z", "onTriggerListeners", "Landroid/content/Context;", "context", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "E0", "State", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasePullToRefreshLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePullToRefreshLayout.kt\ncom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1549#2:287\n1620#2,3:288\n1855#2,2:291\n*S KotlinDebug\n*F\n+ 1 BasePullToRefreshLayout.kt\ncom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout\n*L\n68#1:287\n68#1:288,3\n224#1:291,2\n*E\n"})
public class BasePullToRefreshLayout extends ViewGroup {
    @C12579k

    /* renamed from: E0 */
    public static final C37401b f93974E0 = new C37401b((DefaultConstructorMarker) null);

    /* renamed from: F0 */
    public static final int f93975F0 = 8;

    /* renamed from: G0 */
    public static final float f93976G0 = 0.66f;

    /* renamed from: H0 */
    public static final float f93977H0 = 0.75f;

    /* renamed from: I0 */
    public static final long f93978I0 = 400;

    /* renamed from: a */
    public int f93979a;

    /* renamed from: b */
    public boolean f93980b;

    /* renamed from: c */
    public int f93981c;

    /* renamed from: d */
    public float f93982d;

    /* renamed from: e */
    public float f93983e;

    /* renamed from: f */
    public float f93984f;

    /* renamed from: g */
    public float f93985g;
    @C12579k

    /* renamed from: v */
    public State f93986v;

    /* renamed from: w */
    public C37400a f93987w;

    /* renamed from: x */
    public C37400a f93988x;
    @C12579k

    /* renamed from: y */
    public final Collection<C11300l<Float, C11079d2>> f93989y;
    @C12579k

    /* renamed from: z */
    public final Collection<C11289a<C11079d2>> f93990z;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$State;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum State {
        IDLE,
        ROLLING,
        TRIGGERING
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$a */
    public static final class C37400a {

        /* renamed from: c */
        public static final int f93995c = 8;
        @C12579k

        /* renamed from: a */
        public final View f93996a;
        @C12579k

        /* renamed from: b */
        public final C37402c f93997b;

        public C37400a(@C12579k View view, @C12579k C37402c cVar) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(cVar, "positionAttr");
            this.f93996a = view;
            this.f93997b = cVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C37400a m153614d(C37400a aVar, View view, C37402c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                view = aVar.f93996a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.f93997b;
            }
            return aVar.mo114022c(view, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final View mo114020a() {
            return this.f93996a;
        }

        @C12579k
        /* renamed from: b */
        public final C37402c mo114021b() {
            return this.f93997b;
        }

        @C12579k
        /* renamed from: c */
        public final C37400a mo114022c(@C12579k View view, @C12579k C37402c cVar) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(cVar, "positionAttr");
            return new C37400a(view, cVar);
        }

        @C12579k
        /* renamed from: e */
        public final C37402c mo114023e() {
            return this.f93997b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37400a)) {
                return false;
            }
            C37400a aVar = (C37400a) obj;
            return Intrinsics.areEqual((Object) this.f93996a, (Object) aVar.f93996a) && Intrinsics.areEqual((Object) this.f93997b, (Object) aVar.f93997b);
        }

        @C12579k
        /* renamed from: f */
        public final View mo114025f() {
            return this.f93996a;
        }

        public int hashCode() {
            return (this.f93996a.hashCode() * 31) + this.f93997b.hashCode();
        }

        @C12579k
        public String toString() {
            View view = this.f93996a;
            C37402c cVar = this.f93997b;
            return "ChildView(view=" + view + ", positionAttr=" + cVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37400a(View view, C37402c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i & 2) != 0 ? new C37402c(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null) : cVar);
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$b */
    public static final class C37401b {
        public /* synthetic */ C37401b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37401b() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$c */
    public static final class C37402c {

        /* renamed from: f */
        public static final int f93998f = 0;

        /* renamed from: a */
        public final int f93999a;

        /* renamed from: b */
        public final int f94000b;

        /* renamed from: c */
        public final int f94001c;

        /* renamed from: d */
        public final int f94002d;

        /* renamed from: e */
        public final int f94003e;

        public C37402c() {
            this(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C37402c m153620g(C37402c cVar, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = cVar.f93999a;
            }
            if ((i6 & 2) != 0) {
                i2 = cVar.f94000b;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = cVar.f94001c;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = cVar.f94002d;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = cVar.f94003e;
            }
            return cVar.mo114034f(i, i7, i8, i9, i5);
        }

        /* renamed from: a */
        public final int mo114028a() {
            return this.f93999a;
        }

        /* renamed from: b */
        public final int mo114029b() {
            return this.f94000b;
        }

        /* renamed from: c */
        public final int mo114030c() {
            return this.f94001c;
        }

        /* renamed from: d */
        public final int mo114031d() {
            return this.f94002d;
        }

        /* renamed from: e */
        public final int mo114032e() {
            return this.f94003e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37402c)) {
                return false;
            }
            C37402c cVar = (C37402c) obj;
            return this.f93999a == cVar.f93999a && this.f94000b == cVar.f94000b && this.f94001c == cVar.f94001c && this.f94002d == cVar.f94002d && this.f94003e == cVar.f94003e;
        }

        @C12579k
        /* renamed from: f */
        public final C37402c mo114034f(int i, int i2, int i3, int i4, int i5) {
            return new C37402c(i, i2, i3, i4, i5);
        }

        /* renamed from: h */
        public final int mo114035h() {
            return this.f94002d;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f93999a) * 31) + Integer.hashCode(this.f94000b)) * 31) + Integer.hashCode(this.f94001c)) * 31) + Integer.hashCode(this.f94002d)) * 31) + Integer.hashCode(this.f94003e);
        }

        /* renamed from: i */
        public final int mo114037i() {
            return this.f94003e;
        }

        /* renamed from: j */
        public final int mo114038j() {
            return this.f93999a;
        }

        /* renamed from: k */
        public final int mo114039k() {
            return this.f94001c;
        }

        /* renamed from: l */
        public final int mo114040l() {
            return this.f94000b;
        }

        @C12579k
        public String toString() {
            int i = this.f93999a;
            int i2 = this.f94000b;
            int i3 = this.f94001c;
            int i4 = this.f94002d;
            int i5 = this.f94003e;
            return "PositionAttr(left=" + i + ", top=" + i2 + ", right=" + i3 + ", bottom=" + i4 + ", height=" + i5 + ")";
        }

        public C37402c(int i, int i2, int i3, int i4, int i5) {
            this.f93999a = i;
            this.f94000b = i2;
            this.f94001c = i3;
            this.f94002d = i4;
            this.f94003e = i5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37402c(int r5, int r6, int r7, int r8, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.C37402c.<init>(int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$d */
    public /* synthetic */ class C37403d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.type.ViewType[] r0 = com.carrefour.fid.android.design.components.type.ViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.type.ViewType r1 = com.carrefour.fid.android.design.components.type.ViewType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.type.ViewType r1 = com.carrefour.fid.android.design.components.type.ViewType.TOP_VIEW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.type.ViewType r1 = com.carrefour.fid.android.design.components.type.ViewType.CONTENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.C37403d.<clinit>():void");
        }
    }

    @C11363r0({"SMAP\nBasePullToRefreshLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePullToRefreshLayout.kt\ncom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$stopRefreshing$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1855#2,2:287\n*S KotlinDebug\n*F\n+ 1 BasePullToRefreshLayout.kt\ncom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout$stopRefreshing$1$2\n*L\n170#1:287,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$e */
    public static final class C37404e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f94004a;

        /* renamed from: b */
        public final /* synthetic */ BasePullToRefreshLayout f94005b;

        public C37404e(int i, BasePullToRefreshLayout basePullToRefreshLayout) {
            this.f94004a = i;
            this.f94005b = basePullToRefreshLayout;
        }

        public void onAnimationEnd(@C12579k Animator animator) {
            Intrinsics.checkNotNullParameter(animator, C22218a.f57069g);
            if (this.f94004a == 0 || this.f94005b.f93986v != State.ROLLING) {
                this.f94005b.f93986v = State.IDLE;
                this.f94005b.f93984f = 0.0f;
                return;
            }
            this.f94005b.f93986v = State.TRIGGERING;
            this.f94005b.f93984f = (float) this.f94004a;
            for (C11289a invoke : this.f94005b.f93990z) {
                invoke.invoke();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasePullToRefreshLayout(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: m */
    public static final boolean m153598m(BasePullToRefreshLayout basePullToRefreshLayout, MotionEvent motionEvent, float f, float f2) {
        C37400a aVar = basePullToRefreshLayout.f93988x;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
            aVar = null;
        }
        if (aVar.mo114025f().canScrollVertically(-1) || motionEvent.getY() <= basePullToRefreshLayout.f93983e || Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static /* synthetic */ void m153599s(BasePullToRefreshLayout basePullToRefreshLayout, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 400;
            }
            basePullToRefreshLayout.mo114018r(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRefreshing");
    }

    /* renamed from: t */
    public static final void m153600t(BasePullToRefreshLayout basePullToRefreshLayout, int i, float f, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(basePullToRefreshLayout, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator2, "it");
        C37400a aVar = basePullToRefreshLayout.f93987w;
        C37400a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar = null;
        }
        View f2 = aVar.mo114025f();
        C37400a aVar3 = basePullToRefreshLayout.f93987w;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar3 = null;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        f2.setY(((float) (aVar3.mo114023e().mo114040l() + i)) + (((Float) animatedValue).floatValue() * f));
        C37400a aVar4 = basePullToRefreshLayout.f93988x;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
            aVar4 = null;
        }
        View f3 = aVar4.mo114025f();
        C37400a aVar5 = basePullToRefreshLayout.f93988x;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
        } else {
            aVar2 = aVar5;
        }
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        f3.setY(((float) (aVar2.mo114023e().mo114040l() + i)) + (f * ((Float) animatedValue2).floatValue()));
    }

    public boolean checkLayoutParams(@C12580l ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C37408b);
    }

    @C12579k
    /* renamed from: f */
    public C37408b generateDefaultLayoutParams() {
        return new C37408b(-2, -2);
    }

    @C12579k
    /* renamed from: g */
    public C37408b generateLayoutParams(@C12580l AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        return new C37408b(context, attributeSet);
    }

    public final int getTriggerOffSetTop() {
        return this.f93979a;
    }

    /* renamed from: h */
    public final boolean mo114004h() {
        return this.f93980b;
    }

    /* renamed from: i */
    public final void mo114005i() {
        C37400a aVar;
        C37400a aVar2 = this.f93988x;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
            aVar2 = null;
        }
        View f = aVar2.mo114025f();
        ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayoutParams");
        C37408b bVar = (C37408b) layoutParams;
        int paddingLeft = getPaddingLeft() + bVar.leftMargin;
        int paddingTop = getPaddingTop() + bVar.topMargin;
        int measuredWidth = f.getMeasuredWidth() + paddingLeft;
        int measuredHeight = paddingTop + f.getMeasuredHeight();
        C37400a aVar3 = this.f93988x;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
            aVar = null;
        } else {
            aVar = aVar3;
        }
        View view = f;
        C37402c cVar = r7;
        C37402c cVar2 = new C37402c(paddingLeft, paddingTop, measuredWidth, measuredHeight, 0, 16, (DefaultConstructorMarker) null);
        this.f93988x = C37400a.m153614d(aVar, (View) null, cVar, 1, (Object) null);
        view.layout(paddingLeft, paddingTop, measuredWidth, measuredHeight);
    }

    /* renamed from: j */
    public final void mo114006j() {
        C37400a aVar = this.f93987w;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar = null;
        }
        View f = aVar.mo114025f();
        C37400a aVar2 = this.f93987w;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar2 = null;
        }
        C37402c e = aVar2.mo114023e();
        ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayoutParams");
        C37408b bVar = (C37408b) layoutParams;
        int paddingLeft = getPaddingLeft() + bVar.leftMargin;
        int paddingTop = (getPaddingTop() + bVar.topMargin) - e.mo114037i();
        int measuredWidth = f.getMeasuredWidth() + paddingLeft;
        C37400a aVar3 = this.f93987w;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar3 = null;
        }
        this.f93987w = C37400a.m153614d(aVar3, (View) null, new C37402c(paddingLeft, paddingTop, measuredWidth, 0, 0, 16, (DefaultConstructorMarker) null), 1, (Object) null);
        f.layout(paddingLeft, paddingTop, measuredWidth, 0);
    }

    /* renamed from: k */
    public final void mo114007k(C37400a aVar, int i, int i2) {
        measureChildWithMargins(aVar.mo114025f(), i, 0, i2, 0);
    }

    /* renamed from: l */
    public final void mo114008l() {
        boolean z;
        float f;
        if (this.f93980b) {
            float f2 = this.f93984f;
            if (f2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = 0.0f;
            } else {
                int i = this.f93979a;
                if (((float) i) > f2) {
                    f = f2 / ((float) i);
                } else {
                    f = 1.0f;
                }
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else {
                int i2 = this.f93981c;
                if (f2 > ((float) i2)) {
                    f2 = (float) i2;
                }
            }
            this.f93984f = f2;
            for (C11300l invoke : this.f93989y) {
                invoke.invoke(Float.valueOf(f));
            }
            this.f93985g = f;
            C37400a aVar = this.f93987w;
            C37400a aVar2 = null;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topChildView");
                aVar = null;
            }
            View f3 = aVar.mo114025f();
            C37400a aVar3 = this.f93987w;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topChildView");
                aVar3 = null;
            }
            f3.setY(((float) aVar3.mo114023e().mo114040l()) + this.f93984f);
            C37400a aVar4 = this.f93988x;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
                aVar4 = null;
            }
            View f4 = aVar4.mo114025f();
            C37400a aVar5 = this.f93988x;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
            } else {
                aVar2 = aVar5;
            }
            f4.setY(((float) aVar2.mo114023e().mo114040l()) + this.f93984f);
        }
    }

    /* renamed from: n */
    public final void mo114009n(@C12579k C11300l<? super Float, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onProgressListener");
        if (this.f93980b) {
            this.f93989y.add(lVar);
        } else {
            this.f93989y.remove(lVar);
        }
    }

    /* renamed from: o */
    public final void mo114010o(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onTriggerListener");
        if (this.f93980b) {
            this.f93990z.add(aVar);
        } else {
            this.f93990z.remove(aVar);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
            C11466l W1 = C11479u.m44378W1(0, getChildCount());
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                View childAt = getChildAt(((C10953k0) it).mo6374c());
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayoutParams");
                int i = C37403d.$EnumSwitchMapping$0[((C37408b) layoutParams).mo114047a().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Intrinsics.checkNotNullExpressionValue(childAt, "child");
                        this.f93987w = new C37400a(childAt, (C37402c) null, 2, (DefaultConstructorMarker) null);
                    } else if (i == 3) {
                        Intrinsics.checkNotNullExpressionValue(childAt, "child");
                        this.f93988x = new C37400a(childAt, (C37402c) null, 2, (DefaultConstructorMarker) null);
                    }
                    arrayList.add(C11079d2.f28267a);
                } else {
                    throw new IllegalStateException("Could not parse layout type");
                }
            }
            return;
        }
        int childCount = getChildCount();
        throw new IllegalStateException("Only a contentView and a topView are allowed. Exactly 2 children are expected, but was " + childCount);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.C12579k android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$State r0 = com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.State.IDLE
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            r2 = 2
            if (r0 == r2) goto L_0x0012
            goto L_0x0031
        L_0x0012:
            float r0 = r5.getX()
            float r2 = r4.f93982d
            float r0 = r0 - r2
            float r2 = r5.getY()
            float r3 = r4.f93983e
            float r2 = r2 - r3
            boolean r5 = m153598m(r4, r5, r2, r0)
            goto L_0x0032
        L_0x0025:
            float r0 = r5.getX()
            r4.f93982d = r0
            float r5 = r5.getY()
            r4.f93983e = r5
        L_0x0031:
            r5 = r1
        L_0x0032:
            if (r5 == 0) goto L_0x0039
            boolean r5 = r4.f93980b
            if (r5 == 0) goto L_0x0039
            r1 = 1
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo114006j();
        mo114005i();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C37400a aVar = this.f93987w;
        C37400a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar = null;
        }
        mo114007k(aVar, i, i2);
        C37400a aVar3 = this.f93988x;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentChildView");
        } else {
            aVar2 = aVar3;
        }
        mo114007k(aVar2, i, i2);
        mo114017q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != 3) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@org.jetbrains.annotations.C12579k android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$State r0 = r6.f93986v
            com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$State r1 = com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.State.IDLE
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r3
        L_0x0010:
            android.view.ViewParent r1 = r6.getParent()
            r1.requestDisallowInterceptTouchEvent(r3)
            int r1 = r7.getAction()
            if (r1 == r3) goto L_0x0035
            r4 = 2
            if (r1 == r4) goto L_0x0024
            r7 = 3
            if (r1 == r7) goto L_0x0035
            goto L_0x003f
        L_0x0024:
            float r7 = r7.getY()
            float r1 = r6.f93983e
            float r7 = r7 - r1
            r1 = 1057048494(0x3f0147ae, float:0.505)
            float r7 = r7 * r1
            r6.f93984f = r7
            r6.mo114008l()
            goto L_0x003f
        L_0x0035:
            com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout$State r7 = com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.State.ROLLING
            r6.f93986v = r7
            r4 = 0
            r7 = 0
            m153599s(r6, r4, r3, r7)
        L_0x003f:
            if (r0 == 0) goto L_0x0046
            boolean r7 = r6.f93980b
            if (r7 == 0) goto L_0x0046
            r2 = r3
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.swipetorefresh.BasePullToRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo114016p(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onTriggerListener");
        this.f93990z.remove(aVar);
    }

    /* renamed from: q */
    public final void mo114017q() {
        C37400a aVar = this.f93987w;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar = null;
        }
        View f = aVar.mo114025f();
        ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.swipetorefresh.PullToRefreshLayoutParams");
        C37408b bVar = (C37408b) layoutParams;
        int measuredHeight = f.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
        C37400a aVar2 = this.f93987w;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topChildView");
            aVar2 = null;
        }
        this.f93987w = C37400a.m153614d(aVar2, (View) null, new C37402c(0, 0, 0, 0, measuredHeight, 15, (DefaultConstructorMarker) null), 1, (Object) null);
        int i = this.f93979a;
        if (i < 0) {
            i = measuredHeight / 2;
        }
        this.f93979a = i;
        int i2 = this.f93981c;
        if (i2 >= 0) {
            measuredHeight = i2;
        }
        this.f93981c = measuredHeight;
    }

    /* renamed from: r */
    public void mo114018r(long j) {
        float f;
        boolean z;
        float f2 = this.f93984f;
        int i = this.f93979a;
        if (f2 > ((float) i)) {
            f = f2 - ((float) i);
        } else {
            f = f2;
        }
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C37407a(this, i, f, ofFloat));
        ofFloat.addListener(new C37404e(i, this));
        ofFloat.start();
    }

    public final void setCollapsedAppBar(boolean z) {
        this.f93980b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasePullToRefreshLayout(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    public ViewGroup.LayoutParams generateLayoutParams(@C12580l ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasePullToRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasePullToRefreshLayout(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93980b = true;
        this.f93986v = State.IDLE;
        this.f93989y = new ArrayList();
        this.f93990z = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.PullToRefreshLayout, i, 0);
        try {
            int applyDimension = (int) TypedValue.applyDimension(1, -1.0f, context.getResources().getDisplayMetrics());
            this.f93979a = obtainStyledAttributes.getDimensionPixelOffset(C36896b.C36914r.PullToRefreshLayout_trigger_offset_top, applyDimension);
            this.f93981c = obtainStyledAttributes.getDimensionPixelOffset(C36896b.C36914r.PullToRefreshLayout_max_offset_top, applyDimension);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
