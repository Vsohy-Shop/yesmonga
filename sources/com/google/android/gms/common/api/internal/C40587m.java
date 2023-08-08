package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.m */
public interface C40587m {
    @C40473a
    /* renamed from: U */
    boolean mo133926U();

    @C40473a
    /* renamed from: b0 */
    boolean mo133927b0();

    @C0363p0
    @C40473a
    /* renamed from: l0 */
    Activity mo133929l0();

    @C40473a
    /* renamed from: o */
    void mo133930o(@C0359n0 String str, @C0359n0 LifecycleCallback lifecycleCallback);

    @C40473a
    void startActivityForResult(@C0359n0 Intent intent, int i);

    @C0363p0
    @C40473a
    /* renamed from: x */
    <T extends LifecycleCallback> T mo133938x(@C0359n0 String str, @C0359n0 Class<T> cls);
}
