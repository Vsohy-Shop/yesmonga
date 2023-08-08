package com.google.mlkit.vision.text.bundled.common;

import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpl;

/* renamed from: com.google.mlkit.vision.text.bundled.common.u */
public abstract class C34075u {
    /* renamed from: b */
    public static C34075u m137011b(RemoteException remoteException) {
        return new C34059e(zbpl.m121447e(remoteException));
    }

    /* renamed from: c */
    public static C34075u m137012c() {
        return new C34059e(zbpl.m121446d());
    }

    /* renamed from: a */
    public abstract zbpl<RemoteException> mo99028a();

    /* renamed from: d */
    public final boolean mo99042d() {
        return !mo99028a().mo84928c();
    }
}
