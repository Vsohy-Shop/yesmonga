package com.urbanairship.iam.modal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.C9190h;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.view.BoundedLinearLayout;
import com.urbanairship.iam.view.C9247a;
import com.urbanairship.iam.view.C9254e;
import com.urbanairship.iam.view.InAppButtonLayout;
import com.urbanairship.iam.view.MediaView;
import com.urbanairship.webkit.C9704a;

public class ModalActivity extends C9206k implements InAppButtonLayout.ButtonClickListener {

    /* renamed from: c1 */
    public MediaView f25099c1;

    /* renamed from: com.urbanairship.iam.modal.ModalActivity$a */
    public class C9221a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C9225c f25100a;

        public C9221a(C9225c cVar) {
            this.f25100a = cVar;
        }

        public void onClick(@C0359n0 View view) {
            ModalActivity.this.mo18300G(view, this.f25100a.mo18529t());
        }
    }

    /* renamed from: com.urbanairship.iam.modal.ModalActivity$b */
    public class C9222b implements View.OnClickListener {
        public C9222b() {
        }

        public void onClick(View view) {
            if (ModalActivity.this.mo18491D0() != null) {
                ModalActivity.this.mo18491D0().mo18165c(C9163c0.m34349c(), ModalActivity.this.mo18492E0());
            }
            ModalActivity.this.finish();
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
        float f;
        if (mo18493F0() == null) {
            finish();
            return;
        }
        C9225c cVar = (C9225c) mo18493F0().mo18182n();
        if (cVar == null) {
            finish();
            return;
        }
        if (!cVar.mo18534x() || !getResources().getBoolean(C8978x.C8982d.ua_iam_modal_allow_fullscreen_display)) {
            f = cVar.mo18525o();
            setContentView(C8978x.C8989k.ua_iam_modal);
        } else {
            setTheme(C8978x.C8993o.UrbanAirship_InAppModal_Activity_Fullscreen);
            setContentView(C8978x.C8989k.ua_iam_modal_fullscreen);
            f = 0.0f;
        }
        String N0 = mo18518N0(cVar);
        ViewStub viewStub = (ViewStub) findViewById(C8978x.C8986h.modal_content);
        viewStub.setLayoutResource(mo18516L0(N0));
        viewStub.inflate();
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) findViewById(C8978x.C8986h.modal);
        TextView textView = (TextView) findViewById(C8978x.C8986h.heading);
        TextView textView2 = (TextView) findViewById(C8978x.C8986h.body);
        InAppButtonLayout inAppButtonLayout = (InAppButtonLayout) findViewById(C8978x.C8986h.buttons);
        this.f25099c1 = (MediaView) findViewById(C8978x.C8986h.media);
        Button button = (Button) findViewById(C8978x.C8986h.footer);
        ImageButton imageButton = (ImageButton) findViewById(C8978x.C8986h.dismiss);
        if (cVar.mo18531u() != null) {
            C9254e.m34749c(textView, cVar.mo18531u());
            if (C9168d0.f24881F0.equals(cVar.mo18531u().mo18384i())) {
                mo18517M0(textView);
            }
        } else {
            textView.setVisibility(8);
        }
        if (cVar.mo18524n() != null) {
            C9254e.m34749c(textView2, cVar.mo18524n());
        } else {
            textView2.setVisibility(8);
        }
        if (cVar.mo18532v() != null) {
            this.f25099c1.setChromeClient(new C9704a(this));
            C9254e.m34753g(this.f25099c1, cVar.mo18532v(), mo18494G0());
        } else {
            this.f25099c1.setVisibility(8);
        }
        if (!cVar.mo18527r().isEmpty()) {
            inAppButtonLayout.setButtons(cVar.mo18526p(), cVar.mo18527r());
            inAppButtonLayout.setButtonClickListener(this);
        } else {
            inAppButtonLayout.setVisibility(8);
        }
        if (cVar.mo18529t() != null) {
            C9254e.m34747a(button, cVar.mo18529t(), 0);
            button.setOnClickListener(new C9221a(cVar));
        } else {
            button.setVisibility(8);
        }
        C18196h2.m82502I1(boundedLinearLayout, C9247a.m34735b(this).mo18600c(cVar.mo18523m()).mo18601d(f, 15).mo18599a());
        if (f > 0.0f) {
            boundedLinearLayout.setClipPathBorderRadius(f);
        }
        Drawable mutate = C17549d.m80456r(imageButton.getDrawable()).mutate();
        C17549d.m80452n(mutate, cVar.mo18528s());
        imageButton.setImageDrawable(mutate);
        imageButton.setOnClickListener(new C9222b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    @androidx.annotation.C0347i0
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18516L0(@androidx.annotation.C0359n0 java.lang.String r4) {
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
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_modal_media_header_body
            return r4
        L_0x003b:
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_modal_header_media_body
            return r4
        L_0x003e:
            int r4 = com.urbanairship.automation.C8978x.C8989k.ua_iam_modal_header_body_media
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.modal.ModalActivity.mo18516L0(java.lang.String):int");
    }

    /* renamed from: M0 */
    public final void mo18517M0(@C0359n0 TextView textView) {
        int max = Math.max(C18196h2.m82593j0(textView), C18196h2.m82597k0(textView));
        textView.setPadding(max, textView.getPaddingTop(), max, textView.getPaddingBottom());
        textView.requestLayout();
    }

    @C0359n0
    /* renamed from: N0 */
    public String mo18518N0(@C0359n0 C9225c cVar) {
        String w = cVar.mo18533w();
        if (cVar.mo18532v() == null) {
            return "header_body_media";
        }
        if (!w.equals("header_media_body") || cVar.mo18531u() != null || cVar.mo18532v() == null) {
            return w;
        }
        return "media_header_body";
    }

    public void onPause() {
        super.onPause();
        this.f25099c1.mo18591b();
    }

    public void onResume() {
        super.onResume();
        this.f25099c1.mo18592c();
    }
}
