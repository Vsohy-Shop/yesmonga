package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
public class TagManagerPreviewActivity extends Activity {
    public void onCreate(@RecentlyNonNull Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getData() != null) {
            C31006h.m124431f(getIntent(), this);
        }
    }
}
