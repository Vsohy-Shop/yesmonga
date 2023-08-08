package com.carrefour.fid.android.utils;

import android.content.DialogInterface;
import com.carrefour.fid.android.app.p021ui.BaseActivity;

/* renamed from: com.carrefour.fid.android.utils.e */
public final /* synthetic */ class C22703e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BaseActivity f58157a;

    public /* synthetic */ C22703e(BaseActivity baseActivity) {
        this.f58157a = baseActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceSecurityHelper.m102760i(this.f58157a, dialogInterface, i);
    }
}
