package com.carrefour.fid.android.shared.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.utils.C37140g;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.fid.android.shared.databinding.C28654e;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseBackDropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBackDropFragment.kt\ncom/carrefour/fid/android/shared/base/BaseBackDropFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n1#2:267\n262#3,2:268\n262#3,2:270\n262#3,2:272\n*S KotlinDebug\n*F\n+ 1 BaseBackDropFragment.kt\ncom/carrefour/fid/android/shared/base/BaseBackDropFragment\n*L\n130#1:268,2\n218#1:270,2\n227#1:272,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.base.e */
public abstract class C28480e<VB extends C20752b> extends C37185a<VB> implements C28500r {

    /* renamed from: E0 */
    public static final int f68611E0 = 2;

    /* renamed from: X */
    public static final long f68612X = 1000;

    /* renamed from: Y */
    public static final long f68613Y = 10000;

    /* renamed from: Z */
    public static final int f68614Z = 1;
    @C12579k

    /* renamed from: y */
    public static final C28481a f68615y = new C28481a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f68616z = 8;
    @C12580l

    /* renamed from: a */
    public Activity f68617a;
    @C12580l

    /* renamed from: b */
    public View f68618b;
    @C12580l

    /* renamed from: c */
    public ImageView f68619c;
    @C12580l

    /* renamed from: d */
    public TextView f68620d;
    @C12580l

    /* renamed from: e */
    public TextView f68621e;
    @C12580l

    /* renamed from: f */
    public Button f68622f;
    @C12580l

    /* renamed from: g */
    public View f68623g;
    @C12580l

    /* renamed from: v */
    public MessageComponent f68624v;
    @C12580l

    /* renamed from: w */
    public MessageComponent f68625w;
    @C12580l

    /* renamed from: x */
    public Timer f68626x;

    /* renamed from: com.carrefour.fid.android.shared.base.e$a */
    public static final class C28481a {
        public /* synthetic */ C28481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28481a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.base.e$b */
    public static final class C28482b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C28480e<VB> f68627a;

        public C28482b(C28480e<VB> eVar) {
            this.f68627a = eVar;
        }

        public final void run() {
            this.f68627a.showMessageErrorView(false);
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 BaseBackDropFragment.kt\ncom/carrefour/fid/android/shared/base/BaseBackDropFragment\n*L\n1#1,148:1\n250#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.base.e$c */
    public static final class C28483c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ C28480e f68628a;

        public C28483c(C28480e eVar) {
            this.f68628a = eVar;
        }

        public void run() {
            this.f68628a.mo83386V0().runOnUiThread(new C28482b(this.f68628a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28480e(@C12579k C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar, @C12579k C11300l<? super View, ? extends VB> lVar, boolean z) {
        super(qVar, lVar, z);
        Intrinsics.checkNotNullParameter(qVar, "inflate");
        Intrinsics.checkNotNullParameter(lVar, "bind");
    }

    /* renamed from: Y0 */
    public static final void m118390Y0(C11289a aVar, C28480e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            eVar.emptyFunction();
        }
    }

    /* renamed from: Z0 */
    public static final void m118391Z0(C11289a aVar, C28480e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            eVar.retryFunction();
        }
    }

    /* renamed from: a1 */
    public static final void m118392a1(C11289a aVar, C28480e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            eVar.retryFunction();
        }
    }

    /* renamed from: b1 */
    public static final void m118393b1(C11289a aVar, C28480e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            eVar.retryFunction();
        }
    }

    @C12579k
    /* renamed from: V0 */
    public final Activity mo83386V0() {
        Activity activity = this.f68617a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Activity should be set on BaseBottomSheetFragment!");
    }

    /* renamed from: W0 */
    public boolean mo83387W0() {
        return false;
    }

    /* renamed from: X0 */
    public final void mo83388X0(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "value");
        this.f68617a = activity;
    }

    @C12580l
    public C11079d2 emptyFunction() {
        return null;
    }

    @C12580l
    public ViewStub emptyLayout() {
        return null;
    }

    @C12580l
    public ViewStub emptyMessageLayout() {
        return null;
    }

    @C12580l
    public ViewStub errorMessageLayout() {
        return null;
    }

    public void hideEmpty() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        View view = this.f68618b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideErrorView() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        View view = this.f68623g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideLoading() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        ShimmerFrameLayout loadingLayout = loadingLayout();
        if (loadingLayout != null) {
            loadingLayout.mo36997h();
            loadingLayout.setVisibility(8);
        }
    }

    @C12580l
    public ShimmerFrameLayout loadingLayout() {
        return null;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroyView() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        this.f68626x = null;
        this.f68618b = null;
        this.f68619c = null;
        this.f68620d = null;
        this.f68621e = null;
        this.f68622f = null;
        this.f68623g = null;
        super.onDestroyView();
    }

    @C12580l
    public C11079d2 retryFunction() {
        return null;
    }

    public void setupEmptyView(@C0375v @C12580l Integer num, @C12580l @C0324b1 Integer num2, @C12580l @C0324b1 Integer num3, @C12580l @C0324b1 Integer num4, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar) {
        int i;
        TextView textView;
        View view;
        if (this.f68618b == null) {
            ViewStub emptyLayout = emptyLayout();
            if (emptyLayout != null) {
                view = emptyLayout.inflate();
            } else {
                view = null;
            }
            this.f68618b = view;
        }
        View view2 = this.f68618b;
        if (view2 != null) {
            this.f68619c = (ImageView) view2.findViewById(C28444b.C28454j.image_view_empty_icon);
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = this.f68619c;
                if (imageView != null) {
                    imageView.setImageResource(intValue);
                }
            }
            this.f68620d = (TextView) view2.findViewById(C28444b.C28454j.text_view_empty_title);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView2 = this.f68620d;
                if (textView2 != null) {
                    textView2.setText(mo83386V0().getString(intValue2));
                }
                if (z2 && (textView = this.f68620d) != null) {
                    C37140g.m152216a(textView, C28444b.C28452h.ds_gr_red_error, C28444b.C28451g.ds_component_image_error_inset_size_l);
                }
            }
            this.f68621e = (TextView) view2.findViewById(C28444b.C28454j.text_view_empty_message);
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView3 = this.f68621e;
                if (textView3 != null) {
                    textView3.setText(mo83386V0().getString(intValue3));
                }
            }
            this.f68622f = (Button) view2.findViewById(C28444b.C28454j.button_empty_view);
            if (num4 != null) {
                int intValue4 = num4.intValue();
                Button button = this.f68622f;
                if (button != null) {
                    button.setText(mo83386V0().getString(intValue4));
                }
            }
            Button button2 = this.f68622f;
            if (button2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                button2.setVisibility(i);
                button2.setOnClickListener(new C28468a(aVar, this));
            }
        }
    }

    public void setupMessageEmptyView(@C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4) {
        Intrinsics.checkNotNullParameter(aVar, "messageViewModel");
        setupMessageView(2, aVar, aVar2, aVar3, aVar4);
    }

    public void setupMessageErrorView(@C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4) {
        Intrinsics.checkNotNullParameter(aVar, "messageViewModel");
        setupMessageView(1, aVar, aVar2, aVar3, aVar4);
    }

    public void setupMessageView(int i, @C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4) {
        View view;
        Intrinsics.checkNotNullParameter(aVar, "messageViewModel");
        View view2 = null;
        if (i == 2) {
            if (this.f68618b == null) {
                ViewStub emptyMessageLayout = emptyMessageLayout();
                if (emptyMessageLayout != null) {
                    view2 = emptyMessageLayout.inflate();
                }
                this.f68618b = view2;
            }
            view = this.f68618b;
        } else {
            if (this.f68623g == null) {
                ViewStub errorMessageLayout = errorMessageLayout();
                if (errorMessageLayout != null) {
                    view2 = errorMessageLayout.inflate();
                }
                this.f68623g = view2;
            }
            view = this.f68623g;
        }
        if (view != null) {
            C28654e a = C28654e.m118636a(view);
            Intrinsics.checkNotNullExpressionValue(a, "bind(it)");
            if (i == 2) {
                this.f68625w = a.f70263b;
            } else {
                this.f68624v = a.f70263b;
            }
            MessageComponent messageComponent = a.f70263b;
            messageComponent.mo112895A(aVar);
            messageComponent.mo112897C(new C28469b(aVar2, this), new C28470c(aVar3, this), new C28479d(aVar4, this));
        }
    }

    public void showEmpty() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        View view = this.f68618b;
        if (view != null) {
            ViewKt.m152123e(view, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    public void showLoading() {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        ShimmerFrameLayout loadingLayout = loadingLayout();
        if (loadingLayout != null) {
            loadingLayout.setVisibility(0);
            loadingLayout.mo36996g();
        }
    }

    public void showMessageErrorView(boolean z) {
        Timer timer = this.f68626x;
        if (timer != null) {
            timer.cancel();
        }
        this.f68626x = null;
        if (z) {
            MessageComponent messageComponent = this.f68624v;
            if (messageComponent != null) {
                messageComponent.mo112898J(false);
            }
            Timer timer2 = new Timer();
            timer2.schedule(new C28483c(this), Random.f28564a.mo22990q(1000, 10000));
            this.f68626x = timer2;
        } else {
            MessageComponent messageComponent2 = this.f68624v;
            if (messageComponent2 != null) {
                messageComponent2.mo112898J(true);
            }
        }
        View view = this.f68623g;
        if (view != null) {
            ViewKt.m152123e(view, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    public int tabTitleId() {
        return -1;
    }
}
