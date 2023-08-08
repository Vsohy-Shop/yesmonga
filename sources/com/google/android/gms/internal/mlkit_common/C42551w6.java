package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.mlkit_common.w6 */
public final /* synthetic */ class C42551w6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FileDescriptor f107428a;

    public /* synthetic */ C42551w6(FileDescriptor fileDescriptor) {
        this.f107428a = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.f107428a);
    }
}
