package com.urbanairship.android.layout.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0696c;
import com.carrefour.fid.android.shared.util.C28937k;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.accengage.C35451b;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.MediaModel;
import com.urbanairship.android.layout.property.MediaType;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.C35977a;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.android.layout.widget.TouchAwareWebView;
import com.urbanairship.app.C36032d;
import com.urbanairship.app.C36038h;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.images.C9282f;
import com.urbanairship.util.C9640b0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.C11409d;
import kotlin.text.C11622t;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.intellij.lang.annotations.C12553d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0014\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0015\u0019B\u001f\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006+"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/MediaView;", "Landroid/widget/FrameLayout;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "Lkotlinx/coroutines/flow/e;", "Lkotlin/d2;", "e", "Landroid/view/View;", "changedView", "", "visibility", "onVisibilityChanged", "Lcom/urbanairship/android/layout/model/MediaModel;", "model", "f", "i", "Lcom/urbanairship/android/layout/environment/p;", "a", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "com/urbanairship/android/layout/view/MediaView$e", "b", "Lcom/urbanairship/android/layout/view/MediaView$e;", "activityListener", "Lcom/urbanairship/app/d;", "c", "Lcom/urbanairship/app/d;", "filteredActivityListener", "Lcom/urbanairship/android/layout/view/a$a;", "d", "Lcom/urbanairship/android/layout/view/a$a;", "visibilityChangeListener", "Lcom/urbanairship/android/layout/widget/TouchAwareWebView;", "Lcom/urbanairship/android/layout/widget/TouchAwareWebView;", "webView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/MediaModel;Lcom/urbanairship/android/layout/environment/p;)V", "g", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class MediaView extends FrameLayout implements C35977a, C36026n {
    @C12579k

    /* renamed from: g */
    public static final C35944b f88855g = new C35944b((DefaultConstructorMarker) null);
    @C12579k
    @C12553d("HTML")

    /* renamed from: v */
    public static final String f88856v = "<body style=\"margin:0\">\n    <video playsinline controls height=\"100%%\" width=\"100%%\" src=\"%s\">\n</video></body>";
    @C12579k
    @C12553d("HTML")

    /* renamed from: w */
    public static final String f88857w = "<body style=\"margin:0\">\n    <img height=\"100%%\" width=\"100%%\" src=\"%s\"/>\n</body>";
    @C12579k
    @C12553d("HTML")

    /* renamed from: x */
    public static final String f88858x = "<body style=\"margin:0\">\n    <iframe height=\"100%%\" width=\"100%%\" frameborder=\"0\"\n        src=\"%s?playsinline=1&modestbranding=1\"/>\n</body>";
    @C12579k

    /* renamed from: a */
    public final C35614p f88859a;
    @C12579k

    /* renamed from: b */
    public final C35948e f88860b;
    @C12579k

    /* renamed from: c */
    public final C36032d f88861c;
    @C12580l

    /* renamed from: d */
    public C35977a.C35978a f88862d;
    @C12580l

    /* renamed from: e */
    public TouchAwareWebView f88863e;
    @C12580l

    /* renamed from: f */
    public ImageView f88864f;

    /* renamed from: com.urbanairship.android.layout.view.MediaView$a */
    public static final class C35943a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ MediaView f88865a;

        public C35943a(MediaView mediaView) {
            this.f88865a = mediaView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            MediaView mediaView = this.f88865a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            mediaView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88865a.setEnabled(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$b */
    public static final class C35944b {
        public /* synthetic */ C35944b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35944b() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$c */
    public static abstract class C35945c extends WebViewClient {
        @C12579k

        /* renamed from: d */
        public static final C35946a f88866d = new C35946a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final long f88867e = 1000;
        @C12579k

        /* renamed from: a */
        public final Runnable f88868a;

        /* renamed from: b */
        public boolean f88869b;

        /* renamed from: c */
        public long f88870c = 1000;

        /* renamed from: com.urbanairship.android.layout.view.MediaView$c$a */
        public static final class C35946a {
            public /* synthetic */ C35946a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C35946a() {
            }
        }

        public C35945c(@C12579k Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "onRetry");
            this.f88868a = runnable;
        }

        /* renamed from: a */
        public final boolean mo107607a() {
            return this.f88869b;
        }

        /* renamed from: b */
        public final long mo107608b() {
            return this.f88870c;
        }

        /* renamed from: c */
        public abstract void mo107609c(@C12579k WebView webView);

        /* renamed from: d */
        public final void mo107610d(boolean z) {
            this.f88869b = z;
        }

        /* renamed from: e */
        public final void mo107611e(long j) {
            this.f88870c = j;
        }

        public void onPageFinished(@C12579k WebView webView, @C12579k String str) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(str, "url");
            super.onPageFinished(webView, str);
            if (this.f88869b) {
                webView.postDelayed(this.f88868a, this.f88870c);
                this.f88870c *= (long) 2;
            } else {
                mo107609c(webView);
            }
            this.f88869b = false;
        }

        public void onReceivedError(@C12579k WebView webView, @C12579k WebResourceRequest webResourceRequest, @C12579k WebResourceError webResourceError) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(webResourceRequest, "request");
            Intrinsics.checkNotNullParameter(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f88869b = true;
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$d */
    public /* synthetic */ class C35947d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            iArr[MediaType.IMAGE.ordinal()] = 1;
            iArr[MediaType.VIDEO.ordinal()] = 2;
            iArr[MediaType.YOUTUBE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$e */
    public static final class C35948e extends C36038h {

        /* renamed from: a */
        public final /* synthetic */ MediaView f88871a;

        public C35948e(MediaView mediaView) {
            this.f88871a = mediaView;
        }

        public void onActivityPaused(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            TouchAwareWebView d = this.f88871a.f88863e;
            if (d != null) {
                d.onPause();
            }
        }

        public void onActivityResumed(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            TouchAwareWebView d = this.f88871a.f88863e;
            if (d != null) {
                d.onResume();
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$f */
    public static final class C35949f implements C35977a.C35978a {

        /* renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f88872a;

        /* renamed from: b */
        public final /* synthetic */ String f88873b;

        /* renamed from: c */
        public final /* synthetic */ MediaView f88874c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f88875d;

        public C35949f(Ref.BooleanRef booleanRef, String str, MediaView mediaView, ImageView imageView) {
            this.f88872a = booleanRef;
            this.f88873b = str;
            this.f88874c = mediaView;
            this.f88875d = imageView;
        }

        /* renamed from: a */
        public void mo107598a(int i) {
            if (i == 0) {
                Ref.BooleanRef booleanRef = this.f88872a;
                if (!booleanRef.element) {
                    MediaView.m148162g(this.f88874c, this.f88875d, booleanRef, this.f88873b);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$g */
    public static final class C35950g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ MediaView f88876a;

        /* renamed from: b */
        public final /* synthetic */ int f88877b;

        /* renamed from: c */
        public final /* synthetic */ int f88878c;

        public C35950g(MediaView mediaView, int i, int i2) {
            this.f88876a = mediaView;
            this.f88877b = i;
            this.f88878c = i2;
        }

        public void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams = this.f88876a.getLayoutParams();
            if (layoutParams.height == -2) {
                layoutParams.height = C11409d.m43851L0((((float) this.f88876a.getWidth()) / ((float) this.f88877b)) * ((float) this.f88878c));
            } else {
                float f = ((float) this.f88877b) / ((float) this.f88878c);
                if (f >= ((float) this.f88876a.getWidth()) / ((float) this.f88876a.getHeight())) {
                    layoutParams.height = C11409d.m43851L0(((float) this.f88876a.getWidth()) / f);
                } else {
                    int L0 = C11409d.m43851L0(((float) this.f88876a.getHeight()) * f);
                    if (L0 <= 0) {
                        L0 = -1;
                    }
                    layoutParams.width = L0;
                }
            }
            this.f88876a.setLayoutParams(layoutParams);
            this.f88876a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.MediaView$h */
    public static final class C35951h extends C35945c {

        /* renamed from: f */
        public final /* synthetic */ ProgressBar f88879f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35951h(Runnable runnable, ProgressBar progressBar) {
            super(runnable);
            this.f88879f = progressBar;
        }

        /* renamed from: c */
        public void mo107609c(@C12579k WebView webView) {
            Intrinsics.checkNotNullParameter(webView, C35451b.f87342d);
            webView.setVisibility(0);
            this.f88879f.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaView(@C12579k Context context, @C12579k MediaModel mediaModel, @C12579k C35614p pVar) {
        super(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(mediaModel, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        this.f88859a = pVar;
        C35948e eVar = new C35948e(this);
        this.f88860b = eVar;
        this.f88861c = new C36032d(eVar, pVar.mo106642d());
        C35916j.m148085c(this, mediaModel);
        int i = C35947d.$EnumSwitchMapping$0[mediaModel.mo107071L().ordinal()];
        if (i == 1) {
            mo107604f(mediaModel);
        } else if (i == 2 || i == 3) {
            mo107605i(mediaModel);
        }
        mediaModel.mo106988H(new C35943a(this));
    }

    /* renamed from: g */
    public static final void m148162g(MediaView mediaView, ImageView imageView, Ref.BooleanRef booleanRef, String str) {
        C9282f f = C9282f.m34839f(str).mo18674g(C35921m.m148113c(mediaView.getContext()), C35921m.m148112b(mediaView.getContext())).mo18675h(new C35981d(booleanRef, mediaView, str, imageView)).mo18673f();
        Intrinsics.checkNotNullExpressionValue(f, "newBuilder(url)\n        …\n                .build()");
        UAirship.m146188Y().mo106229t().mo18651a(mediaView.getContext(), imageView, f);
    }

    /* renamed from: h */
    public static final void m148163h(Ref.BooleanRef booleanRef, MediaView mediaView, String str, ImageView imageView, boolean z) {
        Intrinsics.checkNotNullParameter(booleanRef, "$isLoaded");
        Intrinsics.checkNotNullParameter(mediaView, "this$0");
        Intrinsics.checkNotNullParameter(str, "$url");
        Intrinsics.checkNotNullParameter(imageView, "$iv");
        if (z) {
            booleanRef.element = true;
        } else {
            mediaView.f88862d = new C35949f(booleanRef, str, mediaView, imageView);
        }
    }

    /* renamed from: j */
    public static final void m148164j(WeakReference weakReference, MediaModel mediaModel) {
        Intrinsics.checkNotNullParameter(weakReference, "$webViewWeakReference");
        Intrinsics.checkNotNullParameter(mediaModel, "$model");
        TouchAwareWebView touchAwareWebView = (TouchAwareWebView) weakReference.get();
        if (touchAwareWebView != null) {
            int i = C35947d.$EnumSwitchMapping$0[mediaModel.mo107071L().ordinal()];
            if (i == 1) {
                C11368t0 t0Var = C11368t0.f28504a;
                String format = String.format(f88857w, Arrays.copyOf(new Object[]{mediaModel.mo107073N()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                touchAwareWebView.loadData(format, C28937k.f70947d, "UTF-8");
            } else if (i == 2) {
                C11368t0 t0Var2 = C11368t0.f28504a;
                String format2 = String.format(f88856v, Arrays.copyOf(new Object[]{mediaModel.mo107073N()}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                touchAwareWebView.loadData(format2, C28937k.f70947d, "UTF-8");
            } else if (i == 3) {
                C11368t0 t0Var3 = C11368t0.f28504a;
                String format3 = String.format(f88858x, Arrays.copyOf(new Object[]{mediaModel.mo107073N()}, 1));
                Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
                touchAwareWebView.loadData(format3, C28937k.f70947d, "UTF-8");
            }
        }
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        C11907e<MotionEvent> a;
        TouchAwareWebView touchAwareWebView = this.f88863e;
        if (touchAwareWebView != null && (a = touchAwareWebView.mo107670a()) != null) {
            return new MediaView$taps$$inlined$map$1(new MediaView$taps$$inlined$filter$1(a));
        }
        ImageView imageView = this.f88864f;
        if (imageView != null) {
            return ViewExtensionsKt.m148030e(imageView, 0, 1, (Object) null);
        }
        C11907e<C11079d2> n0 = C11909g.m47474n0();
        C36059m.m148406b("MediaView.clicks() was collected before child views were ready!", new Object[0]);
        return n0;
    }

    /* renamed from: f */
    public final void mo107604f(MediaModel mediaModel) {
        String N = mediaModel.mo107073N();
        String str = this.f88859a.mo106640b().get(N);
        if (str != null) {
            N = str;
        }
        if (C11622t.endsWith$default(N, ".svg", false, 2, (Object) null)) {
            mo107605i(mediaModel);
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(mediaModel.mo107072M());
        imageView.setImportantForAccessibility(2);
        C35922n.m148121a(mediaModel.mo107070K(), new MediaView$configureImageView$iv$1$1(imageView));
        this.f88864f = imageView;
        addView(imageView);
        m148162g(this, imageView, new Ref.BooleanRef(), N);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: i */
    public final void mo107605i(MediaModel mediaModel) {
        MediaType L = mediaModel.mo107071L();
        MediaType mediaType = MediaType.VIDEO;
        if (L == mediaType || mediaModel.mo107071L() == MediaType.YOUTUBE) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C35950g(this, 16, 9));
        }
        this.f88859a.mo106641c().mo18484e(this.f88861c);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        TouchAwareWebView touchAwareWebView = new TouchAwareWebView(context);
        this.f88863e = touchAwareWebView;
        touchAwareWebView.setWebChromeClient(this.f88859a.mo106639a().mo18511a());
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f88863e, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.setId(16908301);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressBar, layoutParams2);
        WebSettings settings = touchAwareWebView.getSettings();
        if (mediaModel.mo107071L() == mediaType) {
            settings.setMediaPlaybackRequiresUserGesture(true);
        }
        settings.setJavaScriptEnabled(true);
        if (C9640b0.m36127e()) {
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
        }
        C35982e eVar = new C35982e(new WeakReference(touchAwareWebView), mediaModel);
        C35922n.m148121a(mediaModel.mo107070K(), new MediaView$configureWebView$3(touchAwareWebView));
        touchAwareWebView.setVisibility(4);
        touchAwareWebView.setWebViewClient(new C35951h(eVar, progressBar));
        addView(frameLayout);
        if (!UAirship.m146188Y().mo106206H().mo18743g(mediaModel.mo107073N(), 2)) {
            C36059m.m148409e("URL not allowed. Unable to load: " + mediaModel + ".url", new Object[0]);
            return;
        }
        eVar.run();
    }

    public void onVisibilityChanged(@C12579k View view, int i) {
        Intrinsics.checkNotNullParameter(view, "changedView");
        super.onVisibilityChanged(view, i);
        C35977a.C35978a aVar = this.f88862d;
        if (aVar != null) {
            aVar.mo107598a(i);
        }
    }
}
