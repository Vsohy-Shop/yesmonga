package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.p027os.C17821p0;
import androidx.emoji2.text.C19019f;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C20495a;
import androidx.startup.C20496b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements C20496b<Boolean> {

    /* renamed from: a */
    public static final long f48357a = 500;

    /* renamed from: b */
    public static final String f48358b = "EmojiCompatInitializer";

    @C0376v0(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C19005a extends C19019f.C19024d {
        public C19005a(Context context) {
            super(new C19006b(context));
            mo55992f(1);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C19006b implements C19019f.C19030j {

        /* renamed from: a */
        public final Context f48361a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        public class C19007a extends C19019f.C19031k {

            /* renamed from: a */
            public final /* synthetic */ C19019f.C19031k f48362a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f48363b;

            public C19007a(C19019f.C19031k kVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f48362a = kVar;
                this.f48363b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo55940a(@C0363p0 Throwable th) {
                try {
                    this.f48362a.mo55940a(th);
                } finally {
                    this.f48363b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo55941b(@C0359n0 C19105p pVar) {
                try {
                    this.f48362a.mo55941b(pVar);
                } finally {
                    this.f48363b.shutdown();
                }
            }
        }

        public C19006b(Context context) {
            this.f48361a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo55938a(@C0359n0 C19019f.C19031k kVar) {
            ThreadPoolExecutor c = C19011c.m88838c(EmojiCompatInitializer.f48358b);
            c.execute(new C19079g(this, kVar, c));
        }

        @C0348i1
        /* renamed from: c */
        public void m88831d(@C0359n0 C19019f.C19031k kVar, @C0359n0 ThreadPoolExecutor threadPoolExecutor) {
            try {
                C19092l a = C19013d.m88842a(this.f48361a);
                if (a != null) {
                    a.mo56283m(threadPoolExecutor);
                    a.mo55987a().mo55938a(new C19007a(kVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                kVar.mo55940a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C19008c implements Runnable {
        public void run() {
            try {
                C17821p0.m81248b("EmojiCompat.EmojiCompatInitializer.run");
                if (C19019f.m88870q()) {
                    C19019f.m88864c().mo55970t();
                }
            } finally {
                C17821p0.m81250d();
            }
        }
    }

    @C0359n0
    /* renamed from: b */
    public Boolean mo55933a(@C0359n0 Context context) {
        C19019f.m88869p(new C19005a(context));
        mo55935c(context);
        return Boolean.TRUE;
    }

    @C0376v0(19)
    /* renamed from: c */
    public void mo55935c(@C0359n0 Context context) {
        final Lifecycle lifecycle = ((C19499w) C20495a.m95528e(context).mo61439f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo57464a(new C19427i() {
            /* renamed from: v */
            public void mo34383v(@C0359n0 C19499w wVar) {
                EmojiCompatInitializer.this.mo55936d();
                lifecycle.mo57467d(this);
            }
        });
    }

    @C0376v0(19)
    /* renamed from: d */
    public void mo55936d() {
        C19011c.m88840e().postDelayed(new C19008c(), 500);
    }

    @C0359n0
    public List<Class<? extends C20496b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
