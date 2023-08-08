package com.google.mlkit.common.sdkinternal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.android.gms.internal.mlkit_common.C42510s8;
import com.google.android.gms.internal.mlkit_common.C42540v5;
import com.google.android.gms.internal.mlkit_common.C42580z5;
import com.google.android.gms.internal.mlkit_common.zzgu;
import com.google.android.gms.internal.mlkit_common.zzgz;
import com.google.mlkit.common.sdkinternal.C33927a;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.b */
public class C33930b implements Closeable {
    @C40473a

    /* renamed from: d */
    public static final int f82336d = 1;

    /* renamed from: a */
    public final AtomicBoolean f82337a = new AtomicBoolean();

    /* renamed from: b */
    public final String f82338b;

    /* renamed from: c */
    public final C33927a.C33928a f82339c;

    @C40473a
    /* renamed from: com.google.mlkit.common.sdkinternal.b$a */
    public static class C33931a {

        /* renamed from: a */
        public final C33927a f82340a;

        public C33931a(@RecentlyNonNull C33927a aVar) {
            this.f82340a = aVar;
        }

        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        public C33930b mo98704a(@RecentlyNonNull Object obj, int i, @RecentlyNonNull Runnable runnable) {
            return new C33930b(obj, i, this.f82340a, runnable, C42324b9.m171414b("common"));
        }
    }

    public C33930b(Object obj, int i, C33927a aVar, Runnable runnable, C42477p8 p8Var) {
        this.f82338b = obj.toString();
        this.f82339c = aVar.mo98699b(obj, new C33976u(this, i, p8Var, runnable));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo98702a(int i, C42477p8 p8Var, Runnable runnable) {
        if (!this.f82337a.get()) {
            String.format(Locale.ENGLISH, "%s has not been closed", new Object[]{this.f82338b});
            C42580z5 z5Var = new C42580z5();
            C42540v5 v5Var = new C42540v5();
            v5Var.mo137816b(zzgu.m171779b(i));
            z5Var.mo137845h(v5Var.mo137817c());
            p8Var.mo137761c(C42510s8.m171651f(z5Var), zzgz.HANDLE_LEAKED);
        }
        runnable.run();
    }

    public final void close() {
        this.f82337a.set(true);
        this.f82339c.mo98700a();
    }
}
