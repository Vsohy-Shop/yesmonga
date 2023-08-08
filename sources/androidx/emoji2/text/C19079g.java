package androidx.emoji2.text;

import androidx.emoji2.text.C19019f;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.g */
public final /* synthetic */ class C19079g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.C19006b f48548a;

    /* renamed from: b */
    public final /* synthetic */ C19019f.C19031k f48549b;

    /* renamed from: c */
    public final /* synthetic */ ThreadPoolExecutor f48550c;

    public /* synthetic */ C19079g(EmojiCompatInitializer.C19006b bVar, C19019f.C19031k kVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f48548a = bVar;
        this.f48549b = kVar;
        this.f48550c = threadPoolExecutor;
    }

    public final void run() {
        this.f48548a.m88831d(this.f48549b, this.f48550c);
    }
}
