package com.contentsquare.android.internal.features.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.C0475e;
import com.contentsquare.android.internal.features.clientmode.p024ui.tutorial.ClientModeTutorialActivity;
import com.contentsquare.android.internal.features.deeplink.C14136a;
import com.contentsquare.android.sdk.C14549na;
import com.contentsquare.android.sdk.C14586o8;
import com.contentsquare.android.sdk.C14705sb;

public class DeepLinkActivity extends C0475e implements C14136a.C14137a {

    /* renamed from: U0 */
    public C14136a f34969U0;

    /* renamed from: a */
    public void mo34414a() {
        startActivity(new Intent(this, ClientModeTutorialActivity.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34969U0 = new C14136a(this, this, C14549na.m62703a(getApplicationContext()).mo35983c(), new C14586o8(C14549na.m62703a(getApplicationContext()).mo35986g(), new C14705sb(getApplicationContext()), getApplication()));
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!(action == null || data == null)) {
            this.f34969U0.mo34419e(data);
        }
        finish();
    }
}
