package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C19009a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f48365a;

    public /* synthetic */ C19009a(String str) {
        this.f48365a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C19011c.m88839d(this.f48365a, runnable);
    }
}
