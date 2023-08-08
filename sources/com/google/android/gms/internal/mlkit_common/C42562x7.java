package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.mlkit_common.x7 */
public final /* synthetic */ class C42562x7 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f107443a;

    public /* synthetic */ C42562x7(String str) {
        this.f107443a = str;
    }

    public final Object call() {
        return Os.lstat(this.f107443a);
    }
}
