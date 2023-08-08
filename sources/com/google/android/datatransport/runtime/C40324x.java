package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C40107f;
import com.google.android.datatransport.runtime.dagger.C40124b;
import com.google.android.datatransport.runtime.dagger.C40126d;
import com.google.android.datatransport.runtime.scheduling.C40214f;
import com.google.android.datatransport.runtime.scheduling.C40216h;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.scheduling.persistence.C40260f;
import com.google.android.datatransport.runtime.time.C40312d;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Singleton
@C40126d(modules = {C40107f.class, C40260f.class, C40192k.class, C40216h.class, C40214f.class, C40312d.class})
/* renamed from: com.google.android.datatransport.runtime.x */
public abstract class C40324x implements Closeable {

    @C40126d.C40127a
    /* renamed from: com.google.android.datatransport.runtime.x$a */
    public interface C40325a {
        @C40124b
        /* renamed from: a */
        C40325a mo132787a(Context context);

        /* renamed from: g */
        C40324x mo132789g();
    }

    /* renamed from: a */
    public abstract C40255d mo132784a();

    /* renamed from: b */
    public abstract C40323w mo132785b();

    public void close() throws IOException {
        mo132784a().close();
    }
}
