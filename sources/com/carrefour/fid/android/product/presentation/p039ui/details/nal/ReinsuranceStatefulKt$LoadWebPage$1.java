package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$LoadWebPage$1 */
public final class ReinsuranceStatefulKt$LoadWebPage$1 extends Lambda implements C11300l<Context, WebView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReinsuranceType $reinsuranceType;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$LoadWebPage$1$a */
    public /* synthetic */ class C27851a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType[] r0 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceType.GUARANTEE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceStatefulKt$LoadWebPage$1.C27851a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsuranceStatefulKt$LoadWebPage$1(Context context, ReinsuranceType reinsuranceType) {
        super(1);
        this.$context = context;
        this.$reinsuranceType = reinsuranceType;
    }

    @C12579k
    /* renamed from: a */
    public final WebView invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        WebView webView = new WebView(this.$context);
        ReinsuranceType reinsuranceType = this.$reinsuranceType;
        webView.setWebViewClient(new WebViewClient());
        int i = C27851a.$EnumSwitchMapping$0[reinsuranceType.ordinal()];
        if (i == 1) {
            webView.loadUrl("file:///android_asset/refund_condition.html");
        } else if (i == 2) {
            webView.loadUrl("file:///android_asset/guarantee_condition.html");
        }
        return webView;
    }
}
