package com.urbanairship.util;

import androidx.core.util.C17970d;

/* renamed from: com.urbanairship.util.r */
public final /* synthetic */ class C9675r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17970d f26498a;

    /* renamed from: b */
    public final /* synthetic */ int[] f26499b;

    public /* synthetic */ C9675r(C17970d dVar, int[] iArr) {
        this.f26498a = dVar;
        this.f26499b = iArr;
    }

    public final void run() {
        this.f26498a.accept(this.f26499b);
    }
}
