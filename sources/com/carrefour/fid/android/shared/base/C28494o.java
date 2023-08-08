package com.carrefour.fid.android.shared.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0346i;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.utils.C37140g;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.fid.android.shared.databinding.C28654e;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/carrefour/fid/android/shared/base/BaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,306:1\n1#2:307\n262#3,2:308\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/carrefour/fid/android/shared/base/BaseFragment\n*L\n163#1:308,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.base.o */
public abstract class C28494o<VB extends C20752b> extends Fragment implements C28500r {
    public static final int $stable = 8;
    @C12579k
    public static final C28495a Companion = new C28495a((DefaultConstructorMarker) null);
    public static final long DEFAULT_ERROR_DELAY_MAX = 10000;
    public static final long DEFAULT_ERROR_DELAY_MIN = 1000;
    private static final int MESSAGE_VIEW_TYPE_EMPTY = 2;
    private static final int MESSAGE_VIEW_TYPE_ERROR = 1;
    @C12580l
    private VB _binding;
    @C12579k
    private final C11305q<LayoutInflater, ViewGroup, Boolean, VB> binder;
    @C12580l
    private Button emptyButton;
    @C12580l
    private ImageView emptyIconImageView;
    @C12580l
    private TextView emptyMessageTextView;
    @C12580l
    private TextView emptyTitleTextView;
    @C12580l
    private View emptyViewInflated;
    @C12580l
    private View errorViewInflated;
    @C12580l
    private MessageComponent messageComponentEmpty;
    @C12580l
    private MessageComponent messageComponentError;
    @C12580l
    private Timer timer;

    /* renamed from: com.carrefour.fid.android.shared.base.o$a */
    public static final class C28495a {
        public /* synthetic */ C28495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28495a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.base.o$b */
    public static final class C28496b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C28494o<VB> f68647a;

        public C28496b(C28494o<VB> oVar) {
            this.f68647a = oVar;
        }

        public final void run() {
            this.f68647a.showMessageErrorView(false);
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 BaseFragment.kt\ncom/carrefour/fid/android/shared/base/BaseFragment\n*L\n1#1,148:1\n281#2:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.base.o$c */
    public static final class C28497c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ C28494o f68648a;

        public C28497c(C28494o oVar) {
            this.f68648a = oVar;
        }

        public void run() {
            this.f68648a.requireActivity().runOnUiThread(new C28496b(this.f68648a));
        }
    }

    public C28494o(@C12579k C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "binder");
        this.binder = qVar;
    }

    /* renamed from: M0 */
    public static final void m118410M0(C11289a aVar, C28494o oVar, View view) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            oVar.emptyFunction();
        }
    }

    /* renamed from: N0 */
    public static final void m118411N0(C11289a aVar, C28494o oVar, View view) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            oVar.retryFunction();
        }
    }

    /* renamed from: O0 */
    public static final void m118412O0(C11289a aVar, C28494o oVar, View view) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            oVar.retryFunction();
        }
    }

    /* renamed from: P0 */
    public static final void m118413P0(C11289a aVar, C28494o oVar, View view) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        if (aVar != null) {
            aVar.invoke();
        } else {
            oVar.retryFunction();
        }
    }

    public final void cleanBinding() {
        this._binding = null;
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

    @C12579k
    public final VB getBinding() {
        VB vb = this._binding;
        if (vb != null) {
            return vb;
        }
        throw new IllegalStateException("ViewBinding is missing from BaseFragment param -> Theoretically impossible as it is mandatory".toString());
    }

    public void hideEmpty() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        View view = this.emptyViewInflated;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideErrorView() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        View view = this.errorViewInflated;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideLoading() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        ShimmerFrameLayout loadingLayout = loadingLayout();
        if (loadingLayout != null) {
            loadingLayout.mo36997h();
            ViewKt.m152126h(loadingLayout, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
        }
    }

    public void insetPolicy() {
        C28504t tVar;
        C19232h activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "it.window");
            C28512v.m118429a(window);
            Window window2 = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "it.window");
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
            C28512v.m118430b(window2, applicationContext);
        }
        C19232h activity2 = getActivity();
        if (activity2 instanceof C28504t) {
            tVar = (C28504t) activity2;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            tVar.mo83423j();
        }
    }

    @C12580l
    public ShimmerFrameLayout loadingLayout() {
        return null;
    }

    @C12580l
    @C0346i
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this._binding = (C20752b) this.binder.invoke(layoutInflater, viewGroup, Boolean.FALSE);
        return getBinding().getRoot();
    }

    public void onDestroyView() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.timer = null;
        this.emptyViewInflated = null;
        this.emptyIconImageView = null;
        this.emptyTitleTextView = null;
        this.emptyMessageTextView = null;
        this.emptyButton = null;
        this.errorViewInflated = null;
        super.onDestroyView();
    }

    public void onPause() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        super.onPause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0.isShown() == true) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            r3.insetPolicy()
            android.view.View r0 = r3.errorViewInflated
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isShown()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            if (r2 == 0) goto L_0x0019
            r3.showMessageErrorView(r1)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.base.C28494o.onResume():void");
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ShimmerFrameLayout loadingLayout = loadingLayout();
        if (loadingLayout != null) {
            loadingLayout.setVisibility(0);
        }
    }

    @C12580l
    public C11079d2 retryFunction() {
        return null;
    }

    @C12580l
    public final Bundle saveRecyclerViewState(@C12579k String str, @C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        return C17779d.m81164b(C11078d1.m42659a(str, layoutManager.mo59432w1()));
    }

    public void setupEmptyView(@C0375v @C12580l Integer num, @C12580l @C0324b1 Integer num2, @C12580l @C0324b1 Integer num3, @C12580l @C0324b1 Integer num4, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar) {
        int i;
        String str;
        TextView textView;
        String str2;
        View view;
        String str3 = null;
        if (this.emptyViewInflated == null) {
            ViewStub emptyLayout = emptyLayout();
            if (emptyLayout != null) {
                view = emptyLayout.inflate();
            } else {
                view = null;
            }
            this.emptyViewInflated = view;
        }
        View view2 = this.emptyViewInflated;
        if (view2 != null) {
            this.emptyIconImageView = (ImageView) view2.findViewById(C28444b.C28454j.image_view_empty_icon);
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = this.emptyIconImageView;
                if (imageView != null) {
                    imageView.setImageResource(intValue);
                }
            }
            this.emptyTitleTextView = (TextView) view2.findViewById(C28444b.C28454j.text_view_empty_title);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView2 = this.emptyTitleTextView;
                if (textView2 != null) {
                    Context context = getContext();
                    if (context != null) {
                        str2 = context.getString(intValue2);
                    } else {
                        str2 = null;
                    }
                    textView2.setText(str2);
                }
                if (z2 && (textView = this.emptyTitleTextView) != null) {
                    C37140g.m152216a(textView, C28444b.C28452h.ds_gr_red_error, C28444b.C28451g.ds_component_image_error_inset_size_l);
                }
            }
            this.emptyMessageTextView = (TextView) view2.findViewById(C28444b.C28454j.text_view_empty_message);
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView3 = this.emptyMessageTextView;
                if (textView3 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        str = context2.getString(intValue3);
                    } else {
                        str = null;
                    }
                    textView3.setText(str);
                }
            }
            this.emptyButton = (Button) view2.findViewById(C28444b.C28454j.button_empty_view);
            if (num4 != null) {
                int intValue4 = num4.intValue();
                Button button = this.emptyButton;
                if (button != null) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        str3 = context3.getString(intValue4);
                    }
                    button.setText(str3);
                }
            }
            Button button2 = this.emptyButton;
            if (button2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                button2.setVisibility(i);
                button2.setOnClickListener(new C28490k(aVar, this));
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
            if (this.emptyViewInflated == null) {
                ViewStub emptyMessageLayout = emptyMessageLayout();
                if (emptyMessageLayout != null) {
                    view2 = emptyMessageLayout.inflate();
                }
                this.emptyViewInflated = view2;
            }
            view = this.emptyViewInflated;
        } else {
            if (this.errorViewInflated == null) {
                ViewStub errorMessageLayout = errorMessageLayout();
                if (errorMessageLayout != null) {
                    view2 = errorMessageLayout.inflate();
                }
                this.errorViewInflated = view2;
            }
            view = this.errorViewInflated;
        }
        if (view != null) {
            C28654e a = C28654e.m118636a(view);
            Intrinsics.checkNotNullExpressionValue(a, "bind(it)");
            if (i == 2) {
                this.messageComponentEmpty = a.f70263b;
            } else {
                this.messageComponentError = a.f70263b;
            }
            MessageComponent messageComponent = a.f70263b;
            messageComponent.mo112895A(aVar);
            messageComponent.mo112897C(new C28491l(aVar2, this), new C28492m(aVar3, this), new C28493n(aVar4, this));
        }
    }

    public void showEmpty() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        View view = this.emptyViewInflated;
        if (view != null) {
            ViewKt.m152123e(view, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    public void showLoading() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        ShimmerFrameLayout loadingLayout = loadingLayout();
        if (loadingLayout != null) {
            ViewKt.m152123e(loadingLayout, (Integer) null, false, (C11289a) null, 7, (Object) null);
            loadingLayout.mo36996g();
        }
    }

    public void showMessageErrorView(boolean z) {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.timer = null;
        if (z) {
            MessageComponent messageComponent = this.messageComponentError;
            if (messageComponent != null) {
                messageComponent.mo112898J(false);
            }
            Timer timer3 = new Timer();
            timer3.schedule(new C28497c(this), Random.f28564a.mo22990q(1000, 10000));
            this.timer = timer3;
        } else {
            MessageComponent messageComponent2 = this.messageComponentError;
            if (messageComponent2 != null) {
                messageComponent2.mo112898J(true);
            }
        }
        View view = this.errorViewInflated;
        if (view != null) {
            ViewKt.m152123e(view, (Integer) null, false, (C11289a) null, 7, (Object) null);
        }
    }

    public int tabTitleId() {
        return -1;
    }
}
