package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.interpolator.view.animation.C19319b;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28555j2;
import com.carrefour.fid.android.shared.databinding.C28650a;
import com.carrefour.fid.android.shared.util.C28903a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.hilt.android.C10164b;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0002\u0004\n\u0002\b\u0019¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/presentation/ui/webview/WebViewActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "j1", "r1", "", "url", "", "k1", "m1", "q1", "s1", "i1", "secureToken", "l1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/shared/databinding/a;", "X0", "Lcom/carrefour/fid/android/shared/databinding/a;", "binding", "Lcom/carrefour/fid/android/shared/util/a;", "Y0", "Lcom/carrefour/fid/android/shared/util/a;", "e1", "()Lcom/carrefour/fid/android/shared/util/a;", "n1", "(Lcom/carrefour/fid/android/shared/util/a;)V", "activityUtil", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "Z0", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "h1", "()Lcom/carrefour/fid/android/domain/interactors/logm/a;", "p1", "(Lcom/carrefour/fid/android/domain/interactors/logm/a;)V", "remoteLogUseCase", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "a1", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f1", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "o1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "environment", "Lcom/carrefour/fid/android/shared/presentation/ui/webview/e;", "b1", "Landroidx/navigation/m;", "g1", "()Lcom/carrefour/fid/android/shared/presentation/ui/webview/e;", "navArgs", "<init>", "()V", "c1", "a", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewActivity.kt\ncom/carrefour/fid/android/shared/presentation/ui/webview/WebViewActivity\n+ 2 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n41#2,6:208\n1#3:214\n*S KotlinDebug\n*F\n+ 1 WebViewActivity.kt\ncom/carrefour/fid/android/shared/presentation/ui/webview/WebViewActivity\n*L\n54#1:208,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity */
public final class WebViewActivity extends C28868d {
    @C12579k

    /* renamed from: c1 */
    public static final C28858a f70710c1 = new C28858a((DefaultConstructorMarker) null);

    /* renamed from: d1 */
    public static final int f70711d1 = 8;

    /* renamed from: e1 */
    public static final int f70712e1 = 100;

    /* renamed from: f1 */
    public static final long f70713f1 = 100;

    /* renamed from: g1 */
    public static final long f70714g1 = 500;
    @C12579k

    /* renamed from: h1 */
    public static final String f70715h1 = "?page=";

    /* renamed from: X0 */
    public C28650a f70716X0;
    @Inject

    /* renamed from: Y0 */
    public C28903a f70717Y0;
    @Inject

    /* renamed from: Z0 */
    public C37694a f70718Z0;
    @Inject

    /* renamed from: a1 */
    public AppEnvironment f70719a1;
    @C12579k

    /* renamed from: b1 */
    public final C19766m f70720b1 = new C19766m(C11342l0.m43547d(C28870e.class), new WebViewActivity$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$a */
    public static final class C28858a {
        public /* synthetic */ C28858a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28858a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$b */
    public static final class C28859b extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ WebViewActivity f70721a;

        public C28859b(WebViewActivity webViewActivity) {
            this.f70721a = webViewActivity;
        }

        public void onPageFinished(@C12580l WebView webView, @C12580l String str) {
            super.onPageFinished(webView, str);
            if (this.f70721a.mo83989g1().mo84042l() == null) {
                this.f70721a.mo83992j1();
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$c */
    public static final class C28860c extends WebChromeClient {

        /* renamed from: a */
        public final /* synthetic */ WebViewActivity f70722a;

        public C28860c(WebViewActivity webViewActivity) {
            this.f70722a = webViewActivity;
        }

        public void onProgressChanged(@C12580l WebView webView, int i) {
            if (i >= 100) {
                this.f70722a.mo83991i1();
            } else if (i <= 0) {
                this.f70722a.mo84001s1();
            }
            C28650a X0 = this.f70722a.f70716X0;
            if (X0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                X0 = null;
            }
            X0.f70250c.setProgress(i);
        }
    }

    @C12579k
    /* renamed from: e1 */
    public final C28903a mo83987e1() {
        C28903a aVar = this.f70717Y0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityUtil");
        return null;
    }

    @C12579k
    /* renamed from: f1 */
    public final AppEnvironment mo83988f1() {
        AppEnvironment appEnvironment = this.f70719a1;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C28534f.f69167m0);
        return null;
    }

    /* renamed from: g1 */
    public final C28870e mo83989g1() {
        return (C28870e) this.f70720b1.getValue();
    }

    @C12579k
    /* renamed from: h1 */
    public final C37694a mo83990h1() {
        C37694a aVar = this.f70718Z0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("remoteLogUseCase");
        return null;
    }

    /* renamed from: i1 */
    public final void mo83991i1() {
        C28650a aVar = this.f70716X0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f70250c.animate().alpha(0.0f).setStartDelay(0).setDuration(500).setInterpolator(new AccelerateInterpolator()).start();
    }

    /* renamed from: j1 */
    public final void mo83992j1() {
        C28650a aVar = this.f70716X0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f70251d.setContent(C8553b.m31049c(-1219072811, true, new WebViewActivity$initHeader$1(this)));
    }

    /* renamed from: k1 */
    public final boolean mo83993k1(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "https://www.carrefour.fr/?page=", false, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo83994l1(java.lang.String r27, java.lang.String r28, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r26 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.presentation.p047ui.webview.WebViewActivity$logSecureTokenForArsenal$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$logSecureTokenForArsenal$1 r1 = (com.carrefour.fid.android.shared.presentation.p047ui.webview.WebViewActivity$logSecureTokenForArsenal$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r26
            goto L_0x001e
        L_0x0017:
            com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$logSecureTokenForArsenal$1 r1 = new com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$logSecureTokenForArsenal$1
            r2 = r26
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L_0x003c
            if (r4 != r5) goto L_0x0034
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            r0.mo21858l()
            goto L_0x00a2
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            kotlin.C11661u0.m45747n(r0)
            r0 = 40
            r4 = r27
            java.lang.String r0 = kotlin.text.StringsKt___StringsKt.takeLast((java.lang.String) r4, (int) r0)
            boolean r4 = kotlin.text.C11622t.isBlank(r0)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            com.carrefour.fid.android.domain.interactors.logm.a r4 = r26.mo83990h1()
            com.carrefour.fid.android.domain.models.logm.LogMAction r8 = com.carrefour.fid.android.domain.models.logm.LogMAction.ARSENAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "**"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r21 = r6.toString()
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r16 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.INFO
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "token STS sent on webview header for "
            r0.append(r6)
            r6 = r28
            r0.append(r6)
            java.lang.String r20 = r0.toString()
            com.carrefour.fid.android.domain.models.logm.LogMEntry r0 = new com.carrefour.fid.android.domain.models.logm.LogMEntry
            r6 = r0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 105981(0x19dfd, float:1.48511E-40)
            r25 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.label = r5
            java.lang.Object r0 = r4.m172966invokegIAlus(r0, r1)
            if (r0 != r3) goto L_0x00a2
            return r3
        L_0x00a2:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.presentation.p047ui.webview.WebViewActivity.mo83994l1(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m1 */
    public final void mo83995m1() {
        C28650a aVar = this.f70716X0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f70249b.setWebViewClient(new C28859b(this));
    }

    /* renamed from: n1 */
    public final void mo83996n1(@C12579k C28903a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f70717Y0 = aVar;
    }

    /* renamed from: o1 */
    public final void mo83997o1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f70719a1 = appEnvironment;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C28650a c = C28650a.m118621c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c, "inflate(layoutInflater)");
        this.f70716X0 = c;
        if (c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        mo83992j1();
        mo84000r1();
    }

    /* renamed from: p1 */
    public final void mo83998p1(@C12579k C37694a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f70718Z0 = aVar;
    }

    /* renamed from: q1 */
    public final void mo83999q1() {
        C28650a aVar = this.f70716X0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f70249b.setWebChromeClient(new C28860c(this));
    }

    /* renamed from: r1 */
    public final void mo84000r1() {
        mo83995m1();
        mo83999q1();
        C28650a aVar = this.f70716X0;
        C28650a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        WebSettings settings = aVar.f70249b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        HashMap hashMap = new HashMap();
        String j = mo83989g1().mo84040j();
        String k = mo83989g1().mo84041k();
        if (!(j == null || k == null)) {
            hashMap.put(j, k);
            if (Intrinsics.areEqual((Object) j, (Object) C28555j2.f69460a)) {
                C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new WebViewActivity$setupWebView$2(this, k, (C11045c<? super WebViewActivity$setupWebView$2>) null), 3, (Object) null);
            }
            C28650a aVar3 = this.f70716X0;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aVar3 = null;
            }
            aVar3.f70249b.setWebViewClient(new WebViewActivity$setupWebView$3(j, k, this));
        }
        WebView.setWebContentsDebuggingEnabled(false);
        C28650a aVar4 = this.f70716X0;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aVar2 = aVar4;
        }
        aVar2.f70249b.loadUrl(mo83989g1().mo84043m(), hashMap);
    }

    /* renamed from: s1 */
    public final void mo84001s1() {
        C28650a aVar = this.f70716X0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f70250c.animate().alpha(1.0f).setStartDelay(0).setDuration(100).setInterpolator(new C19319b()).start();
    }
}
