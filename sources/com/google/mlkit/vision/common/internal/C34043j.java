package com.google.mlkit.vision.common.internal;

import com.google.android.odml.image.C31850h;
import java.util.concurrent.Callable;

/* renamed from: com.google.mlkit.vision.common.internal.j */
public final /* synthetic */ class C34043j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ MobileVisionBase f82683a;

    /* renamed from: b */
    public final /* synthetic */ C31850h f82684b;

    public /* synthetic */ C34043j(MobileVisionBase mobileVisionBase, C31850h hVar) {
        this.f82683a = mobileVisionBase;
        this.f82684b = hVar;
    }

    public final Object call() {
        return this.f82683a.mo98976d(this.f82684b);
    }
}
