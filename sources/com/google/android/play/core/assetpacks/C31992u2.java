package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.u2 */
public final /* synthetic */ class C31992u2 implements ThreadFactory {

    /* renamed from: b */
    public static final ThreadFactory f78139b = new C31992u2();

    /* renamed from: c */
    public static final ThreadFactory f78140c = new C31992u2((byte[]) null);

    /* renamed from: a */
    public final /* synthetic */ int f78141a = 0;

    public C31992u2() {
    }

    public final Thread newThread(Runnable runnable) {
        return this.f78141a != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }

    public C31992u2(byte[] bArr) {
    }
}
