package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.C8567o;
import androidx.interpolator.view.animation.C19319b;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.shared.databinding.C28653d;
import dagger.hilt.android.C10164b;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/presentation/ui/webview/CatalogWebViewActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "g1", "Landroid/net/Uri;", "uri", "", "e1", "f1", "h1", "d1", "Lcom/carrefour/fid/android/shared/databinding/d;", "X0", "Lcom/carrefour/fid/android/shared/databinding/d;", "binding", "Lcom/carrefour/fid/android/shared/presentation/ui/webview/e;", "Y0", "Landroidx/navigation/m;", "c1", "()Lcom/carrefour/fid/android/shared/presentation/ui/webview/e;", "navArgs", "<init>", "()V", "Z0", "a", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogWebViewActivity.kt\ncom/carrefour/fid/android/shared/presentation/ui/webview/CatalogWebViewActivity\n+ 2 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt\n*L\n1#1,143:1\n41#2,6:144\n*S KotlinDebug\n*F\n+ 1 CatalogWebViewActivity.kt\ncom/carrefour/fid/android/shared/presentation/ui/webview/CatalogWebViewActivity\n*L\n31#1:144,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.CatalogWebViewActivity */
public final class CatalogWebViewActivity extends C28866c {
    @C12579k

    /* renamed from: Z0 */
    public static final C28856a f70700Z0 = new C28856a((DefaultConstructorMarker) null);

    /* renamed from: a1 */
    public static final int f70701a1 = 8;

    /* renamed from: b1 */
    public static final int f70702b1 = 100;

    /* renamed from: c1 */
    public static final long f70703c1 = 100;

    /* renamed from: d1 */
    public static final long f70704d1 = 500;
    @C12579k

    /* renamed from: e1 */
    public static final String f70705e1 = "carrefour.fr";

    /* renamed from: X0 */
    public C28653d f70706X0;
    @C12579k

    /* renamed from: Y0 */
    public final C19766m f70707Y0 = new C19766m(C11342l0.m43547d(C28870e.class), new CatalogWebViewActivity$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.CatalogWebViewActivity$a */
    public static final class C28856a {
        public /* synthetic */ C28856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28856a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.CatalogWebViewActivity$b */
    public static final class C28857b extends WebChromeClient {

        /* renamed from: a */
        public final /* synthetic */ CatalogWebViewActivity f70708a;

        public C28857b(CatalogWebViewActivity catalogWebViewActivity) {
            this.f70708a = catalogWebViewActivity;
        }

        public void onProgressChanged(@C12580l WebView webView, int i) {
            if (i >= 100) {
                this.f70708a.mo83980d1();
            } else if (i <= 0) {
                this.f70708a.mo83984h1();
            }
            C28653d X0 = this.f70708a.f70706X0;
            if (X0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                X0 = null;
            }
            X0.f70261c.setProgress(i);
        }
    }

    /* renamed from: c1 */
    public final C28870e mo83979c1() {
        return (C28870e) this.f70707Y0.getValue();
    }

    /* renamed from: d1 */
    public final void mo83980d1() {
        C28653d dVar = this.f70706X0;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        dVar.f70261c.animate().alpha(0.0f).setStartDelay(0).setDuration(500).setInterpolator(new AccelerateInterpolator()).start();
    }

    /* renamed from: e1 */
    public final boolean mo83981e1(Uri uri) {
        boolean z;
        String path = uri.getPath();
        if (path == null || C11622t.isBlank(path)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !Intrinsics.areEqual((Object) uri.getPath(), (Object) "/")) {
            return false;
        }
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) host, f70705e1, 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            String substring = host.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (C11622t.isBlank(substring) || StringsKt__StringsKt.contains$default((CharSequence) substring, (CharSequence) "www", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f1 */
    public final void mo83982f1() {
        C28653d dVar = this.f70706X0;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        dVar.f70260b.setWebChromeClient(new C28857b(this));
    }

    /* renamed from: g1 */
    public final void mo83983g1() {
        mo83982f1();
        C28653d dVar = this.f70706X0;
        C28653d dVar2 = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        WebSettings settings = dVar.f70260b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        C28653d dVar3 = this.f70706X0;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar3 = null;
        }
        dVar3.f70260b.setWebViewClient(new CatalogWebViewActivity$setupWebView$2(this));
        C28653d dVar4 = this.f70706X0;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar4 = null;
        }
        dVar4.f70260b.getSettings().setDisplayZoomControls(false);
        HashMap hashMap = new HashMap();
        WebView.setWebContentsDebuggingEnabled(false);
        C28653d dVar5 = this.f70706X0;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dVar2 = dVar5;
        }
        dVar2.f70260b.loadUrl(mo83979c1().mo84043m(), hashMap);
    }

    /* renamed from: h1 */
    public final void mo83984h1() {
        C28653d dVar = this.f70706X0;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        dVar.f70261c.animate().alpha(1.0f).setStartDelay(0).setDuration(100).setInterpolator(new C19319b()).start();
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C28653d c = C28653d.m118633c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c, "inflate(layoutInflater)");
        this.f70706X0 = c;
        if (c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        mo83983g1();
    }
}
