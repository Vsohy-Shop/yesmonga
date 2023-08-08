package com.urbanairship.iam.fullscreen;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.C9190h;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.view.C9254e;
import com.urbanairship.iam.view.InAppButtonLayout;
import com.urbanairship.iam.view.MediaView;
import com.urbanairship.webkit.C9704a;

public class FullScreenActivity extends C9206k implements InAppButtonLayout.ButtonClickListener {
    @C0363p0

    /* renamed from: c1 */
    public C9185c f24980c1;

    /* renamed from: d1 */
    public MediaView f24981d1;

    /* renamed from: com.urbanairship.iam.fullscreen.FullScreenActivity$a */
    public class C9180a implements View.OnClickListener {
        public C9180a() {
        }

        public void onClick(@C0359n0 View view) {
            FullScreenActivity fullScreenActivity = FullScreenActivity.this;
            fullScreenActivity.mo18300G(view, fullScreenActivity.f24980c1.mo18429p());
        }
    }

    /* renamed from: com.urbanairship.iam.fullscreen.FullScreenActivity$b */
    public class C9181b implements View.OnClickListener {
        public C9181b() {
        }

        public void onClick(View view) {
            if (FullScreenActivity.this.mo18491D0() != null) {
                FullScreenActivity.this.mo18491D0().mo18165c(C9163c0.m34349c(), FullScreenActivity.this.mo18492E0());
            }
            FullScreenActivity.this.finish();
        }
    }

    /* renamed from: com.urbanairship.iam.fullscreen.FullScreenActivity$c */
    public class C9182c implements C18414x1 {
        public C9182c() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(@C0359n0 View view, C18436z4 z4Var) {
            C18196h2.m82582g1(view, z4Var);
            return z4Var;
        }
    }

    /* renamed from: G */
    public void mo18300G(@C0359n0 View view, @C0359n0 C9139b bVar) {
        if (mo18491D0() != null) {
            C9190h.m34481a(bVar);
            mo18491D0().mo18165c(C9163c0.m34347a(bVar), mo18492E0());
            finish();
        }
    }

    /* renamed from: H0 */
    public void mo18414H0(@C0363p0 Bundle bundle) {
        if (mo18493F0() == null) {
            finish();
            return;
        }
        C9185c cVar = (C9185c) mo18493F0().mo18182n();
        this.f24980c1 = cVar;
        if (cVar == null) {
            finish();
            return;
        }
        setContentView(mo18415L0(mo18417N0(cVar)));
        mo106408A0();
        TextView textView = (TextView) findViewById(C8978x.C8986h.heading);
        TextView textView2 = (TextView) findViewById(C8978x.C8986h.body);
        InAppButtonLayout inAppButtonLayout = (InAppButtonLayout) findViewById(C8978x.C8986h.buttons);
        this.f24981d1 = (MediaView) findViewById(C8978x.C8986h.media);
        Button button = (Button) findViewById(C8978x.C8986h.footer);
        ImageButton imageButton = (ImageButton) findViewById(C8978x.C8986h.dismiss);
        View findViewById = findViewById(C8978x.C8986h.content_holder);
        if (this.f24980c1.mo18430r() != null) {
            C9254e.m34749c(textView, this.f24980c1.mo18430r());
            if (C9168d0.f24881F0.equals(this.f24980c1.mo18430r().mo18384i())) {
                mo18416M0(textView);
            }
        } else {
            textView.setVisibility(8);
        }
        if (this.f24980c1.mo18425l() != null) {
            C9254e.m34749c(textView2, this.f24980c1.mo18425l());
        } else {
            textView2.setVisibility(8);
        }
        if (this.f24980c1.mo18431s() != null) {
            this.f24981d1.setChromeClient(new C9704a(this));
            C9254e.m34753g(this.f24981d1, this.f24980c1.mo18431s(), mo18494G0());
        } else {
            this.f24981d1.setVisibility(8);
        }
        if (!this.f24980c1.mo18427n().isEmpty()) {
            inAppButtonLayout.setButtons(this.f24980c1.mo18426m(), this.f24980c1.mo18427n());
            inAppButtonLayout.setButtonClickListener(this);
        } else {
            inAppButtonLayout.setVisibility(8);
        }
        if (this.f24980c1.mo18429p() != null) {
            C9254e.m34747a(button, this.f24980c1.mo18429p(), 0);
            button.setOnClickListener(new C9180a());
        } else {
            button.setVisibility(8);
        }
        Drawable mutate = C17549d.m80456r(imageButton.getDrawable()).mutate();
        C17549d.m80452n(mutate, this.f24980c1.mo18428o());
        imageButton.setImageDrawable(mutate);
        imageButton.setOnClickListener(new C9181b());
        getWindow().getDecorView().setBackgroundColor(this.f24980c1.mo18424k());
        if (C18196h2.m82538U(findViewById)) {
            C18196h2.m82559a2(findViewById, new C9182c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    @androidx.annotation.C0347i0
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18415L0(@androidx.annotation.C0359n0 java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -1783908295(0xffffffff95abb839, float:-6.9357E-26)
            r2 = 1
            if (r0 == r1) goto L_0x0029
            r1 = -589491207(0xffffffffdcdd13f9, float:-4.9782344E17)
            if (r0 == r1) goto L_0x001f
            r1 = 1167596047(0x45981a0f, float:4867.2573)
            if (r0 == r1) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.lang.String r0 = "header_media_body"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = r2
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "header_body_media"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "media_header_body"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x003e
            if (r4 == r2) goto L_0x003b
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_fullscreen_media_header_body
            return r4
        L_0x003b:
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_fullscreen_header_media_body
            return r4
        L_0x003e:
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_fullscreen_header_body_media
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.fullscreen.FullScreenActivity.mo18415L0(java.lang.String):int");
    }

    /* renamed from: M0 */
    public final void mo18416M0(@C0359n0 TextView textView) {
        int max = Math.max(C18196h2.m82593j0(textView), C18196h2.m82597k0(textView));
        textView.setPadding(max, textView.getPaddingTop(), max, textView.getPaddingBottom());
        textView.requestLayout();
    }

    @C0359n0
    /* renamed from: N0 */
    public String mo18417N0(@C0359n0 C9185c cVar) {
        String t = cVar.mo18432t();
        if (cVar.mo18431s() == null) {
            return "header_body_media";
        }
        if (!t.equals("header_media_body") || cVar.mo18430r() != null || cVar.mo18431s() == null) {
            return t;
        }
        return "media_header_body";
    }

    public void onPause() {
        super.onPause();
        this.f24981d1.mo18591b();
    }

    public void onResume() {
        super.onResume();
        this.f24981d1.mo18592c();
    }
}
