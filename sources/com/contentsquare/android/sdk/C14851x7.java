package com.contentsquare.android.sdk;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.contentsquare.android.sdk.x7 */
public final class C14851x7 {

    /* renamed from: com.contentsquare.android.sdk.x7$a */
    public class C14852a implements C14853b {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f36833a;

        /* renamed from: b */
        public final /* synthetic */ C14501lb f36834b;

        /* renamed from: c */
        public final /* synthetic */ C14325f5 f36835c;

        public C14852a(AtomicBoolean atomicBoolean, C14501lb lbVar, C14325f5 f5Var) {
            this.f36833a = atomicBoolean;
            this.f36834b = lbVar;
            this.f36835c = f5Var;
        }

        public void close() {
            if (this.f36833a.compareAndSet(false, true)) {
                this.f36834b.mo34978c(this.f36835c);
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.x7$b */
    public interface C14853b extends Closeable {
        void close();
    }

    /* renamed from: a */
    public static C14853b m64003a(C14501lb lbVar, C14325f5 f5Var) {
        lbVar.mo34979d(f5Var);
        return new C14852a(new AtomicBoolean(), lbVar, f5Var);
    }
}
