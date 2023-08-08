package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.emoji2.text.b */
public final /* synthetic */ class C19010b implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f48366a;

    public /* synthetic */ C19010b(Handler handler) {
        this.f48366a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f48366a.post(runnable);
    }
}
