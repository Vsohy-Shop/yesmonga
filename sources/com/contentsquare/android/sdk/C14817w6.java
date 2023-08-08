package com.contentsquare.android.sdk;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.C17465i;
import com.bumptech.glide.load.engine.executor.C22218a;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.sdk.C14898ye;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11079d2;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;

/* renamed from: com.contentsquare.android.sdk.w6 */
public final class C14817w6 {

    /* renamed from: t */
    public static final C14819b f36730t = new C14819b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public View f36731a;

    /* renamed from: b */
    public View f36732b;

    /* renamed from: c */
    public final C14213b7 f36733c;

    /* renamed from: d */
    public AppCompatTextView f36734d;

    /* renamed from: e */
    public AppCompatTextView f36735e;

    /* renamed from: f */
    public AppCompatTextView f36736f;

    /* renamed from: g */
    public AppCompatImageView f36737g;

    /* renamed from: h */
    public AppCompatImageView f36738h;

    /* renamed from: i */
    public ProgressBar f36739i;

    /* renamed from: j */
    public ImageView f36740j;

    /* renamed from: k */
    public WindowManager.LayoutParams f36741k;

    /* renamed from: l */
    public AppCompatButton f36742l;

    /* renamed from: m */
    public ValueAnimator f36743m;

    /* renamed from: n */
    public Runnable f36744n;

    /* renamed from: o */
    public int f36745o;

    /* renamed from: p */
    public int f36746p;

    /* renamed from: q */
    public C14818a f36747q;

    /* renamed from: r */
    public final Context f36748r;

    /* renamed from: s */
    public final WindowManager f36749s;

    /* renamed from: com.contentsquare.android.sdk.w6$a */
    public interface C14818a {
        /* renamed from: a */
        void mo34403a();

        /* renamed from: b */
        void mo34404b();
    }

    /* renamed from: com.contentsquare.android.sdk.w6$b */
    public static final class C14819b {
        public C14819b() {
        }

        public /* synthetic */ C14819b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$c */
    public final class C14820c implements View.OnClickListener {

        /* renamed from: a */
        public final C14822e f36750a;

        /* renamed from: b */
        public final /* synthetic */ C14817w6 f36751b;

        public C14820c(C14817w6 w6Var, C14822e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "mFabTouchedListener");
            this.f36751b = w6Var;
            this.f36750a = eVar;
        }

        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            if (this.f36750a.mo36715c() && this.f36751b.f36747q != null) {
                C14818a d = this.f36751b.f36747q;
                Intrinsics.checkNotNull(d);
                d.mo34403a();
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$d */
    public final class C14821d implements View.OnLongClickListener {

        /* renamed from: a */
        public final C14822e f36752a;

        /* renamed from: b */
        public final /* synthetic */ C14817w6 f36753b;

        public C14821d(C14817w6 w6Var, C14822e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "mFabTouchedListener");
            this.f36753b = w6Var;
            this.f36752a = eVar;
        }

        public boolean onLongClick(View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            if (!this.f36752a.mo36715c() || this.f36753b.f36747q == null) {
                return true;
            }
            C14818a d = this.f36753b.f36747q;
            Intrinsics.checkNotNull(d);
            d.mo34404b();
            return true;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$e */
    public final class C14822e implements View.OnTouchListener {

        /* renamed from: a */
        public int f36754a;

        /* renamed from: b */
        public int f36755b;

        /* renamed from: c */
        public float f36756c;

        /* renamed from: d */
        public float f36757d;

        /* renamed from: e */
        public boolean f36758e = true;

        /* renamed from: com.contentsquare.android.sdk.w6$e$a */
        public static final class C14823a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ C14822e f36760a;

            /* renamed from: b */
            public final /* synthetic */ WindowManager.LayoutParams f36761b;

            /* renamed from: c */
            public final /* synthetic */ int f36762c;

            /* renamed from: d */
            public final /* synthetic */ View f36763d;

            public C14823a(C14822e eVar, WindowManager.LayoutParams layoutParams, int i, View view) {
                this.f36760a = eVar;
                this.f36761b = layoutParams;
                this.f36762c = i;
                this.f36763d = view;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.checkNotNullParameter(valueAnimator, C22218a.f57069g);
                WindowManager.LayoutParams layoutParams = this.f36761b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.x = (int) ((Float) animatedValue).floatValue();
                    C14817w6.this.f36749s.updateViewLayout(this.f36763d, this.f36761b);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        public C14822e() {
        }

        /* renamed from: a */
        public final void mo36713a(MotionEvent motionEvent, WindowManager.LayoutParams layoutParams) {
            Intrinsics.checkNotNull(layoutParams);
            this.f36754a = layoutParams.x;
            this.f36755b = layoutParams.y;
            this.f36756c = motionEvent.getRawX();
            this.f36757d = motionEvent.getRawY();
        }

        /* renamed from: b */
        public final void mo36714b(View view, WindowManager.LayoutParams layoutParams, int i) {
            int l = C14817w6.this.mo36702l(view);
            int i2 = i - l;
            if (layoutParams.x + (l / 2) < i / 2) {
                i2 = 0;
            }
            ValueAnimator n = C14817w6.m63850n(C14817w6.this);
            n.setFloatValues(new float[]{(float) layoutParams.x, (float) i2});
            n.addUpdateListener(new C14823a(this, layoutParams, i2, view));
            n.start();
        }

        /* renamed from: c */
        public final boolean mo36715c() {
            return this.f36758e;
        }

        /* renamed from: d */
        public final boolean mo36716d(MotionEvent motionEvent) {
            return Math.abs(this.f36756c - motionEvent.getRawX()) < 70.0f && Math.abs(this.f36757d - motionEvent.getRawY()) < 70.0f;
        }

        /* renamed from: e */
        public final Pair<Integer, Integer> mo36717e(MotionEvent motionEvent) {
            int u = C11479u.m44447u(this.f36754a - ((int) (motionEvent.getRawX() - this.f36756c)), 0);
            int y = C14817w6.this.f36746p;
            C14817w6 w6Var = C14817w6.this;
            int B = C11479u.m44313B(y - w6Var.mo36702l(w6Var.mo36706r()), u);
            int u2 = C14817w6.this.f36745o / 2;
            return new Pair<>(Integer.valueOf(B), Integer.valueOf(C11479u.m44313B(u2, C11479u.m44447u(this.f36755b + ((int) (motionEvent.getRawY() - this.f36757d)), -u2))));
        }

        /* renamed from: f */
        public final void mo36718f(MotionEvent motionEvent) {
            Pair<Integer, Integer> e = mo36717e(motionEvent);
            WindowManager.LayoutParams s = C14817w6.m63852s(C14817w6.this);
            Object obj = e.first;
            Intrinsics.checkNotNullExpressionValue(obj, "newPosition.first");
            s.x = ((Number) obj).intValue();
            WindowManager.LayoutParams s2 = C14817w6.m63852s(C14817w6.this);
            Object obj2 = e.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "newPosition.second");
            s2.y = ((Number) obj2).intValue();
        }

        /* renamed from: g */
        public final void mo36719g(MotionEvent motionEvent) {
            if (this.f36758e) {
                this.f36758e = mo36716d(motionEvent);
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f36758e = true;
                mo36713a(motionEvent, C14817w6.m63852s(C14817w6.this));
                return false;
            } else if (action == 1) {
                mo36714b(C14817w6.this.mo36706r(), C14817w6.m63852s(C14817w6.this), C14817w6.this.f36746p);
                return false;
            } else if (action != 2) {
                return false;
            } else {
                mo36718f(motionEvent);
                C14817w6.this.f36749s.updateViewLayout(C14817w6.this.mo36706r(), C14817w6.m63852s(C14817w6.this));
                mo36719g(motionEvent);
                return false;
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$f */
    public static final class C14824f implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C14817w6 f36764a;

        public C14824f(C14817w6 w6Var) {
            this.f36764a = w6Var;
        }

        public final void onClick(View view) {
            this.f36764a.mo36686E();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$g */
    public static final class C14825g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C14817w6 f36765a;

        public C14825g(C14817w6 w6Var) {
            this.f36765a = w6Var;
        }

        public final void run() {
            this.f36765a.mo36686E();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.w6$h */
    public static final class C14826h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ C14817w6 f36766a;

        public C14826h(C14817w6 w6Var) {
            this.f36766a = w6Var;
        }

        /* renamed from: a */
        public final void mo36724a(ViewTreeObserver viewTreeObserver) {
            C14662r2.m63242a(viewTreeObserver, this);
        }

        public void onGlobalLayout() {
            C14817w6 w6Var = this.f36766a;
            Pair b = w6Var.mo36694a(w6Var.mo36706r());
            C14817w6 w6Var2 = this.f36766a;
            Object obj = b.first;
            Intrinsics.checkNotNullExpressionValue(obj, "windowSize.first");
            w6Var2.f36745o = ((Number) obj).intValue();
            C14817w6 w6Var3 = this.f36766a;
            Object obj2 = b.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "windowSize.second");
            w6Var3.f36746p = ((Number) obj2).intValue();
            ViewTreeObserver viewTreeObserver = this.f36766a.mo36706r().getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "fabLayout.viewTreeObserver");
            mo36724a(viewTreeObserver);
        }
    }

    public C14817w6(Context context, WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        this.f36748r = context;
        this.f36749s = windowManager;
        C14549na a = C14549na.m62703a(context);
        Intrinsics.checkNotNullExpressionValue(a, "ContentsquareModule.getInstance(context)");
        C14213b7 g = a.mo35986g();
        Intrinsics.checkNotNullExpressionValue(g, "ContentsquareModule.getI…context).preferencesStore");
        this.f36733c = g;
    }

    /* renamed from: n */
    public static final /* synthetic */ ValueAnimator m63850n(C14817w6 w6Var) {
        ValueAnimator valueAnimator = w6Var.f36743m;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabAnimator");
        }
        return valueAnimator;
    }

    /* renamed from: s */
    public static final /* synthetic */ WindowManager.LayoutParams m63852s(C14817w6 w6Var) {
        WindowManager.LayoutParams layoutParams = w6Var.f36741k;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabParams");
        }
        return layoutParams;
    }

    /* renamed from: A */
    public final void mo36683A() {
        AppCompatButton appCompatButton = this.f36742l;
        if (appCompatButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException(OTUXParamsKeys.OT_UX_CLOSE_BUTTON);
        }
        appCompatButton.setVisibility(8);
        AppCompatImageView appCompatImageView = this.f36738h;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spacer");
        }
        appCompatImageView.setVisibility(8);
    }

    /* renamed from: C */
    public final void mo36684C() {
        View view = this.f36731a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
        }
        C14413i3.m62078h(view);
    }

    /* renamed from: D */
    public final void mo36685D() {
        AppCompatTextView appCompatTextView = this.f36735e;
        if (appCompatTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenNameTextView");
        }
        C14413i3.m62078h(appCompatTextView);
    }

    /* renamed from: E */
    public final void mo36686E() {
        mo36687F();
        mo36691J();
        mo36683A();
    }

    /* renamed from: F */
    public final void mo36687F() {
        View view = this.f36732b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        C14413i3.m62078h(view);
    }

    /* renamed from: G */
    public final void mo36688G() {
        this.f36744n = new C14825g(this);
        this.f36743m = mo36703m();
        LayoutInflater from = LayoutInflater.from(this.f36748r);
        Intrinsics.checkNotNullExpressionValue(from, "layoutInflater");
        View c = mo36695c(from);
        c.getViewTreeObserver().addOnGlobalLayoutListener(mo36709w());
        C11079d2 d2Var = C11079d2.f28267a;
        this.f36731a = c;
        View inflate = from.inflate(C14147n.C14154g.contentsquare_snapshot_status_layout, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutInflater.inflate(\n…          false\n        )");
        this.f36732b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        this.f36739i = mo36707t(inflate);
        View view = this.f36732b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById = view.findViewById(C14147n.C14153f.snapshot_status_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "statusLayout.findViewByI…id.snapshot_status_image)");
        this.f36737g = (AppCompatImageView) findViewById;
        View view2 = this.f36732b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById2 = view2.findViewById(C14147n.C14153f.snapshot_status_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "statusLayout.findViewByI….id.snapshot_status_text)");
        this.f36734d = (AppCompatTextView) findViewById2;
        View view3 = this.f36732b;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById3 = view3.findViewById(C14147n.C14153f.snapshot_screenname_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "statusLayout.findViewByI…snapshot_screenname_text)");
        this.f36735e = (AppCompatTextView) findViewById3;
        View view4 = this.f36732b;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById4 = view4.findViewById(C14147n.C14153f.contentsquare_snapshot_failed_tips);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "statusLayout.findViewByI…are_snapshot_failed_tips)");
        this.f36736f = (AppCompatTextView) findViewById4;
        View view5 = this.f36732b;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById5 = view5.findViewById(C14147n.C14153f.snapshot_spacer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "statusLayout.findViewById(R.id.snapshot_spacer)");
        this.f36738h = (AppCompatImageView) findViewById5;
        View view6 = this.f36732b;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        View findViewById6 = view6.findViewById(C14147n.C14153f.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "statusLayout.findViewById(R.id.close_button)");
        this.f36742l = (AppCompatButton) findViewById6;
        WindowManager windowManager = this.f36749s;
        View view7 = this.f36732b;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        windowManager.addView(view7, mo36710z());
    }

    /* renamed from: H */
    public final void mo36689H() {
        int i;
        ImageView imageView;
        if (this.f36733c.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false)) {
            imageView = this.f36740j;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            }
            i = C14147n.C14152e.contentsquare_static_snapshot_camera;
        } else {
            imageView = this.f36740j;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            }
            i = C14147n.C14152e.contentsquare_img_client_mode_fab;
        }
        C14413i3.m62077f(imageView, i);
    }

    /* renamed from: I */
    public final void mo36690I() {
        AppCompatButton appCompatButton = this.f36742l;
        if (appCompatButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException(OTUXParamsKeys.OT_UX_CLOSE_BUTTON);
        }
        appCompatButton.setVisibility(0);
        AppCompatImageView appCompatImageView = this.f36738h;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spacer");
        }
        appCompatImageView.setVisibility(0);
    }

    /* renamed from: J */
    public final void mo36691J() {
        View view = this.f36731a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
        }
        C14413i3.m62079i(view);
    }

    /* renamed from: K */
    public final void mo36692K() {
        View view = this.f36732b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        C14413i3.m62079i(view);
    }

    /* renamed from: L */
    public final void mo36693L() {
        this.f36747q = null;
    }

    /* renamed from: a */
    public final Pair<Integer, Integer> mo36694a(View view) {
        int i;
        int i2;
        View rootView = view.getRootView();
        if (rootView != null) {
            Rect rect = new Rect();
            rootView.getWindowVisibleDisplayFrame(rect);
            i = rect.height();
            i2 = rect.width();
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.f36745o == 0 || this.f36746p == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f36749s.getDefaultDisplay().getMetrics(displayMetrics);
            int i3 = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
            i = i3;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    public final View mo36695c(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C14147n.C14154g.contentsquare_floating_widget_layout, (ViewGroup) null, false);
        WindowManager.LayoutParams v = mo36708v();
        this.f36741k = v;
        WindowManager windowManager = this.f36749s;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabParams");
        }
        windowManager.addView(inflate, v);
        C14822e eVar = new C14822e();
        View findViewById = inflate.findViewById(C14147n.C14153f.client_mode_icon_id);
        ImageView imageView = (ImageView) findViewById;
        imageView.setOnTouchListener(eVar);
        imageView.setOnClickListener(new C14820c(this, eVar));
        imageView.setOnLongClickListener(new C14821d(this, eVar));
        if (this.f36733c.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false)) {
            imageView.setImageResource(C14147n.C14152e.contentsquare_static_snapshot_camera);
        }
        C11079d2 d2Var = C11079d2.f28267a;
        Intrinsics.checkNotNullExpressionValue(findViewById, "floatingButtonLayout.fin…)\n            }\n        }");
        this.f36740j = imageView;
        Intrinsics.checkNotNullExpressionValue(inflate, "floatingButtonLayout");
        return inflate;
    }

    /* renamed from: e */
    public final Triple<Integer, String, String> mo36696e(C14898ye.C14899a.C14900a aVar) {
        Context context;
        int i;
        if (aVar.mo36938a() instanceof C14898ye.C14899a.C14901b.C14903b) {
            context = this.f36748r;
            i = C14147n.C14155h.contentsquare_snapshot_status_failed_no_screenview;
        } else {
            aVar.mo36938a();
            if (this.f36733c.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false)) {
                context = this.f36748r;
                i = C14147n.C14155h.contentsquare_static_snapshot_status_failed;
            } else {
                context = this.f36748r;
                i = C14147n.C14155h.contentsquare_snapshot_status_failed;
            }
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "if (failureReason is NoS…_status_failed)\n        }");
        return new Triple<>(Integer.valueOf(C14147n.C14152e.contentsquare_img_snapshot_fail), string, aVar.mo36939b());
    }

    /* renamed from: f */
    public final void mo36697f() {
        View view = this.f36731a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
        }
        if (view.getWindowToken() != null) {
            WindowManager windowManager = this.f36749s;
            View view2 = this.f36731a;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
            }
            windowManager.removeView(view2);
        }
        View view3 = this.f36732b;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
        }
        if (view3.getWindowToken() != null) {
            View view4 = this.f36732b;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
            }
            Runnable runnable = this.f36744n;
            if (runnable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hideStatusLayoutRunnable");
            }
            view4.removeCallbacks(runnable);
            WindowManager windowManager2 = this.f36749s;
            View view5 = this.f36732b;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
            }
            windowManager2.removeView(view5);
        }
    }

    /* renamed from: g */
    public final void mo36698g(C14818a aVar) {
        this.f36747q = aVar;
    }

    /* renamed from: i */
    public final void mo36699i(C14898ye.C14899a.C14901b bVar) {
        if (Intrinsics.areEqual((Object) bVar, (Object) C14898ye.C14899a.C14901b.C14902a.f36962a)) {
            AppCompatTextView appCompatTextView = this.f36736f;
            if (appCompatTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tipsTextView");
            }
            appCompatTextView.setText(this.f36748r.getString(C14147n.C14155h.contentsquare_snapshot_status_failed_hardware_bitmap));
        }
        AppCompatTextView appCompatTextView2 = this.f36736f;
        if (appCompatTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipsTextView");
        }
        C14413i3.m62079i(appCompatTextView2);
    }

    /* renamed from: j */
    public final void mo36700j(C14898ye.C14899a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "state");
        Triple<Integer, String, String> o = mo36704o(aVar);
        int intValue = o.mo21867a().intValue();
        String b = o.mo21868b();
        String c = o.mo21869c();
        if (aVar instanceof C14898ye.C14899a.C14900a) {
            mo36690I();
            mo36699i(((C14898ye.C14899a.C14900a) aVar).mo36938a());
            AppCompatButton appCompatButton = this.f36742l;
            if (appCompatButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException(OTUXParamsKeys.OT_UX_CLOSE_BUTTON);
            }
            appCompatButton.setOnClickListener(new C14824f(this));
        } else {
            View view = this.f36732b;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusLayout");
            }
            Runnable runnable = this.f36744n;
            if (runnable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hideStatusLayoutRunnable");
            }
            view.postDelayed(runnable, (long) 2000);
        }
        AppCompatImageView appCompatImageView = this.f36737g;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusImage");
        }
        appCompatImageView.setImageResource(intValue);
        AppCompatImageView appCompatImageView2 = this.f36737g;
        if (appCompatImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusImage");
        }
        appCompatImageView2.setTag(Integer.valueOf(intValue));
        AppCompatTextView appCompatTextView = this.f36734d;
        if (appCompatTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        }
        appCompatTextView.setText(b);
        if (c != null) {
            mo36705q(c);
        } else {
            mo36685D();
        }
        ProgressBar progressBar = this.f36739i;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C9874a.f27062g);
        }
        C14413i3.m62078h(progressBar);
        AppCompatImageView appCompatImageView3 = this.f36737g;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusImage");
        }
        C14413i3.m62079i(appCompatImageView3);
    }

    /* renamed from: k */
    public final void mo36701k(String str) {
        int i;
        AppCompatTextView appCompatTextView;
        if (this.f36733c.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false)) {
            appCompatTextView = this.f36734d;
            if (appCompatTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            }
            i = C14147n.C14155h.contentsquare_static_snapshot_status_in_progress;
        } else {
            appCompatTextView = this.f36734d;
            if (appCompatTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            }
            i = C14147n.C14155h.contentsquare_snapshot_status_in_progress;
        }
        appCompatTextView.setText(i);
        if (str != null) {
            mo36705q(str);
        } else {
            mo36685D();
        }
        ProgressBar progressBar = this.f36739i;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C9874a.f27062g);
        }
        C14413i3.m62079i(progressBar);
        AppCompatTextView appCompatTextView2 = this.f36736f;
        if (appCompatTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipsTextView");
        }
        C14413i3.m62078h(appCompatTextView2);
        mo36692K();
        AppCompatImageView appCompatImageView = this.f36737g;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusImage");
        }
        C14413i3.m62078h(appCompatImageView);
        View view = this.f36731a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
        }
        C14413i3.m62078h(view);
    }

    /* renamed from: l */
    public final int mo36702l(View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return view.getWidth();
    }

    /* renamed from: m */
    public final ValueAnimator mo36703m() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimator.setDuration((long) 250);
        return valueAnimator;
    }

    /* renamed from: o */
    public final Triple<Integer, String, String> mo36704o(C14898ye.C14899a aVar) {
        int i;
        Context context;
        if (aVar instanceof C14898ye.C14899a.C14900a) {
            return mo36696e((C14898ye.C14899a.C14900a) aVar);
        }
        if (this.f36733c.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false)) {
            context = this.f36748r;
            i = C14147n.C14155h.contentsquare_static_snapshot_status_saved;
        } else {
            context = this.f36748r;
            i = C14147n.C14155h.contentsquare_snapshot_status_saved;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "if (preferenceStore.getB…atus_saved)\n            }");
        String str = null;
        if (!(aVar instanceof C14898ye.C14899a.C14909g)) {
            aVar = null;
        }
        C14898ye.C14899a.C14909g gVar = (C14898ye.C14899a.C14909g) aVar;
        if (gVar != null) {
            str = gVar.mo36940a();
        }
        return new Triple<>(Integer.valueOf(C14147n.C14152e.contentsquare_img_snapshot_success), string, str);
    }

    /* renamed from: q */
    public final void mo36705q(String str) {
        AppCompatTextView appCompatTextView = this.f36735e;
        if (appCompatTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenNameTextView");
        }
        appCompatTextView.setText(this.f36748r.getString(C14147n.C14155h.contentsquare_snapshot_screenname_prefix, new Object[]{str}));
        AppCompatTextView appCompatTextView2 = this.f36735e;
        if (appCompatTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenNameTextView");
        }
        C14413i3.m62079i(appCompatTextView2);
    }

    /* renamed from: r */
    public final View mo36706r() {
        View view = this.f36731a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fabLayout");
        }
        return view;
    }

    /* renamed from: t */
    public final ProgressBar mo36707t(View view) {
        Intrinsics.checkNotNull(view);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C14147n.C14153f.snapshot_status_progress);
        Intrinsics.checkNotNullExpressionValue(progressBar, C9874a.f27062g);
        C14879y1.m64113a(progressBar.getIndeterminateDrawable(), C17465i.m80173e(this.f36748r.getResources(), C14147n.C14150c.contentsquare_blue, (Resources.Theme) null));
        return progressBar;
    }

    /* renamed from: v */
    public final WindowManager.LayoutParams mo36708v() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 262184, -3);
        layoutParams.windowAnimations = 16973827;
        layoutParams.gravity = 8388629;
        return layoutParams;
    }

    /* renamed from: w */
    public final ViewTreeObserver.OnGlobalLayoutListener mo36709w() {
        return new C14826h(this);
    }

    /* renamed from: z */
    public final WindowManager.LayoutParams mo36710z() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 1024, -3);
        layoutParams.windowAnimations = 16973827;
        return layoutParams;
    }
}
