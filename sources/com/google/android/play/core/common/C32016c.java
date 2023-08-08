package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.common.c */
public final class C32016c {

    /* renamed from: a */
    public final Map<String, Object> f78212a = new HashMap();

    /* renamed from: b */
    public final AtomicBoolean f78213b = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized boolean mo92715a() {
        if (!this.f78213b.get()) {
            mo92716b();
        }
        Object obj = this.f78212a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: b */
    public final synchronized void mo92716b() {
        this.f78212a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
