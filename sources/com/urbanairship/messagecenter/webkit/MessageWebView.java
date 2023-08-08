package com.urbanairship.messagecenter.webkit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.messagecenter.C9371g;
import com.urbanairship.messagecenter.C9372h;
import com.urbanairship.messagecenter.C9420z;
import com.urbanairship.webkit.AirshipWebView;
import java.util.HashMap;

public class MessageWebView extends AirshipWebView {
    public MessageWebView(@C0359n0 Context context) {
        super(context);
    }

    /* renamed from: v */
    public void mo19077v(@C0359n0 C9371g gVar) {
        C9420z D = C9372h.m35254H().mo19001D();
        HashMap hashMap = new HashMap();
        if (!(D.mo19088d() == null || D.mo19089e() == null)) {
            mo19710t(gVar.mo18976Q(), D.mo19088d(), D.mo19089e());
            hashMap.put(C28534f.f69113B, mo19700j(D.mo19088d(), D.mo19089e()));
        }
        loadUrl(gVar.mo18976Q(), hashMap);
    }

    public MessageWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MessageWebView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
