package com.CritizrSDK;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class CritizrActivity extends Activity {

    /* renamed from: b */
    public static final String f55172b = "extra_api_key";

    /* renamed from: c */
    public static final String f55173c = "extra_url";

    /* renamed from: a */
    public String f55174a;

    /* renamed from: com.CritizrSDK.CritizrActivity$a */
    public class C21419a extends WebChromeClient {
        public C21419a() {
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }
    }

    /* renamed from: com.CritizrSDK.CritizrActivity$b */
    public class C21420b extends WebViewClient {

        /* renamed from: com.CritizrSDK.CritizrActivity$b$a */
        public class C21421a implements DialogInterface.OnClickListener {
            public C21421a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CritizrActivity.this.finish();
            }
        }

        public C21420b() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (str.contains("widgets/sdk/success/")) {
                C21424c.m98769c(CritizrActivity.this.f55174a).mo63896e();
                CritizrActivity.this.finish();
            } else if (str.contains("widgets/sdk/exit/") || str.contains("store_locator/sdk/exit/")) {
                CritizrActivity.this.finish();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            sb.append("errorCode ");
            sb.append(i);
            if (!CritizrActivity.this.isFinishing()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CritizrActivity.this);
                builder.setTitle("Erreur de chargement");
                builder.setMessage("Merci de vérifier que vous êtes bien connecté à Internet, puis réessayez.");
                builder.setCancelable(true).setNeutralButton("OK", new C21421a());
                builder.create().show();
            }
        }
    }

    @TargetApi(11)
    /* renamed from: b */
    public void mo63886b() {
        if (getActionBar() != null) {
            getActionBar().hide();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        WebView webView = new WebView(this);
        linearLayout.addView(webView, layoutParams);
        setContentView(linearLayout, layoutParams);
        String stringExtra = getIntent().getStringExtra("extra_url");
        this.f55174a = getIntent().getStringExtra("extra_api_key");
        webView.setWebChromeClient(new C21419a());
        webView.setWebViewClient(new C21420b());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(stringExtra);
        mo63886b();
    }
}
