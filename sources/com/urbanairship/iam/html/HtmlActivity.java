package com.urbanairship.iam.html;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import com.carrefour.fid.android.shared.util.C28937k;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.view.BoundedFrameLayout;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.webkit.AirshipWebView;
import com.urbanairship.webkit.C9704a;
import java.lang.ref.WeakReference;

public class HtmlActivity extends C9206k {

    /* renamed from: h1 */
    public static final long f25007h1 = 20000;

    /* renamed from: c1 */
    public AirshipWebView f25008c1;

    /* renamed from: d1 */
    public Integer f25009d1 = null;

    /* renamed from: e1 */
    public Handler f25010e1;

    /* renamed from: f1 */
    public String f25011f1;

    /* renamed from: g1 */
    public final Runnable f25012g1 = new C9191a();

    /* renamed from: com.urbanairship.iam.html.HtmlActivity$a */
    public class C9191a implements Runnable {
        public C9191a() {
        }

        public void run() {
            HtmlActivity.this.mo18448V0();
        }
    }

    /* renamed from: com.urbanairship.iam.html.HtmlActivity$b */
    public class C9192b extends C9201d {

        /* renamed from: h */
        public final /* synthetic */ ProgressBar f25014h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9192b(InAppMessage inAppMessage, ProgressBar progressBar) {
            super(inAppMessage);
            this.f25014h = progressBar;
        }

        /* renamed from: n */
        public void mo18451n(@C0359n0 JsonValue jsonValue) {
            try {
                C9163c0 d = C9163c0.m34350d(jsonValue);
                if (HtmlActivity.this.mo18491D0() != null) {
                    HtmlActivity.this.mo18491D0().mo18165c(d, HtmlActivity.this.mo18492E0());
                }
                HtmlActivity.this.finish();
            } catch (JsonException e) {
                C36059m.m148409e("Unable to parse message resolution JSON", e);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (HtmlActivity.this.f25009d1 != null) {
                int intValue = HtmlActivity.this.f25009d1.intValue();
                if (intValue == -8 || intValue == -6 || intValue == -1) {
                    HtmlActivity.this.mo18449W0(HtmlActivity.f25007h1);
                    return;
                }
                Integer unused = HtmlActivity.this.f25009d1 = null;
                HtmlActivity.this.f25008c1.loadData("", C28937k.f70947d, (String) null);
                return;
            }
            HtmlActivity htmlActivity = HtmlActivity.this;
            htmlActivity.mo18446T0(htmlActivity.f25008c1, this.f25014h);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (str2 != null && str2.equals(HtmlActivity.this.getIntent().getDataString())) {
                C36059m.m148409e("HtmlActivity - Failed to load page %s with error %s %s", str2, Integer.valueOf(i), str);
                Integer unused = HtmlActivity.this.f25009d1 = Integer.valueOf(i);
            }
        }
    }

    /* renamed from: com.urbanairship.iam.html.HtmlActivity$c */
    public class C9193c implements View.OnClickListener {
        public C9193c() {
        }

        public void onClick(View view) {
            if (HtmlActivity.this.mo18491D0() != null) {
                HtmlActivity.this.mo18491D0().mo18165c(C9163c0.m34349c(), HtmlActivity.this.mo18492E0());
            }
            HtmlActivity.this.finish();
        }
    }

    /* renamed from: com.urbanairship.iam.html.HtmlActivity$d */
    public class C9194d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f25017a;

        public C9194d(View view) {
            this.f25017a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f25017a.setVisibility(8);
        }
    }

    /* renamed from: com.urbanairship.iam.html.HtmlActivity$e */
    public class C9195e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f25019a;

        /* renamed from: b */
        public final /* synthetic */ int f25020b;

        /* renamed from: c */
        public final /* synthetic */ int f25021c;

        /* renamed from: d */
        public final /* synthetic */ boolean f25022d;

        public C9195e(WeakReference weakReference, int i, int i2, boolean z) {
            this.f25019a = weakReference;
            this.f25020b = i;
            this.f25021c = i2;
            this.f25022d = z;
        }

        public boolean onPreDraw() {
            int i;
            View view = (View) this.f25019a.get();
            if (view == null) {
                return true;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int min = Math.min(measuredWidth, this.f25020b);
            int min2 = Math.min(measuredHeight, this.f25021c);
            if (this.f25022d && !(min == (i = this.f25020b) && min2 == this.f25021c)) {
                int i2 = this.f25021c;
                float f = (float) measuredWidth;
                float f2 = (float) measuredHeight;
                if (f / f2 > ((float) i) / ((float) i2)) {
                    min = (int) ((((float) i) * f2) / ((float) i2));
                } else {
                    min2 = (int) ((((float) i2) * f) / ((float) i));
                }
            }
            if (min2 > 0) {
                layoutParams.height = min2;
            }
            if (min > 0) {
                layoutParams.width = min;
            }
            view.setLayoutParams(layoutParams);
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: H0 */
    public void mo18414H0(@C0363p0 Bundle bundle) {
        float f;
        if (mo18493F0() == null) {
            finish();
            return;
        }
        C9198c cVar = (C9198c) mo18493F0().mo18182n();
        if (cVar == null) {
            C36059m.m148409e("HtmlActivity - Invalid display type: %s", mo18493F0().mo18182n());
            finish();
            return;
        }
        if (mo18447U0(cVar)) {
            setTheme(C8978x.C8993o.UrbanAirship_InAppHtml_Activity_Fullscreen);
            setContentView(C8978x.C8989k.ua_iam_html_fullscreen);
            f = 0.0f;
        } else {
            setContentView(C8978x.C8989k.ua_iam_html);
            f = cVar.mo18463j();
        }
        ProgressBar progressBar = (ProgressBar) findViewById(C8978x.C8986h.progress);
        ImageButton imageButton = (ImageButton) findViewById(C8978x.C8986h.dismiss);
        BoundedFrameLayout boundedFrameLayout = (BoundedFrameLayout) findViewById(C8978x.C8986h.content_holder);
        mo18445S0(cVar);
        this.f25008c1 = (AirshipWebView) findViewById(C8978x.C8986h.web_view);
        this.f25010e1 = new Handler(Looper.getMainLooper());
        this.f25011f1 = cVar.mo18467n();
        if (!UAirship.m146188Y().mo106206H().mo18743g(this.f25011f1, 2)) {
            C36059m.m148409e("HTML in-app message URL is not allowed. Unable to display message.", new Object[0]);
            finish();
            return;
        }
        this.f25008c1.setWebViewClient(new C9192b(mo18493F0(), progressBar));
        this.f25008c1.setAlpha(0.0f);
        this.f25008c1.getSettings().setSupportMultipleWindows(true);
        this.f25008c1.setWebChromeClient(new C9704a(this));
        Drawable mutate = C17549d.m80456r(imageButton.getDrawable()).mutate();
        C17549d.m80452n(mutate, cVar.mo18464k());
        imageButton.setImageDrawable(mutate);
        imageButton.setOnClickListener(new C9193c());
        int i = cVar.mo18462i();
        boundedFrameLayout.setBackgroundColor(i);
        this.f25008c1.setBackgroundColor(i);
        if (Color.alpha(i) == 255 && f > 0.0f) {
            boundedFrameLayout.setClipPathBorderRadius(f);
        }
    }

    /* renamed from: S0 */
    public void mo18445S0(@C0359n0 C9198c cVar) {
        View findViewById;
        if ((cVar.mo18468o() != 0 || cVar.mo18465l() != 0) && (findViewById = findViewById(C8978x.C8986h.content_holder)) != null) {
            boolean h = cVar.mo18460h();
            findViewById.getViewTreeObserver().addOnPreDrawListener(new C9195e(new WeakReference(findViewById), (int) TypedValue.applyDimension(1, (float) cVar.mo18468o(), getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, (float) cVar.mo18465l(), getResources().getDisplayMetrics()), h));
        }
    }

    /* renamed from: T0 */
    public final void mo18446T0(@C0363p0 View view, @C0363p0 View view2) {
        if (view != null) {
            view.animate().alpha(1.0f).setDuration(200);
        }
        if (view2 != null) {
            view2.animate().alpha(0.0f).setDuration(200).setListener(new C9194d(view2));
        }
    }

    /* renamed from: U0 */
    public final boolean mo18447U0(C9198c cVar) {
        if (!cVar.mo18469p()) {
            return false;
        }
        return getResources().getBoolean(C8978x.C8982d.ua_iam_html_allow_fullscreen_display);
    }

    /* renamed from: V0 */
    public void mo18448V0() {
        mo18449W0(0);
    }

    /* renamed from: W0 */
    public void mo18449W0(long j) {
        AirshipWebView airshipWebView = this.f25008c1;
        if (airshipWebView != null) {
            airshipWebView.stopLoading();
            if (j > 0) {
                this.f25010e1.postDelayed(this.f25012g1, j);
                return;
            }
            C36059m.m148413i("Loading url: %s", this.f25011f1);
            this.f25009d1 = null;
            this.f25008c1.loadUrl(this.f25011f1);
        }
    }

    public void onPause() {
        super.onPause();
        this.f25008c1.onPause();
        this.f25008c1.stopLoading();
        this.f25010e1.removeCallbacks(this.f25012g1);
    }

    public void onResume() {
        super.onResume();
        this.f25008c1.onResume();
        mo18448V0();
    }
}
