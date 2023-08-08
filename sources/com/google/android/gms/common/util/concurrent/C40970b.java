package com.google.android.gms.common.util.concurrent;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@C40473a
/* renamed from: com.google.android.gms.common.util.concurrent.b */
public class C40970b implements ThreadFactory {

    /* renamed from: a */
    public final String f104212a;

    /* renamed from: b */
    public final ThreadFactory f104213b = Executors.defaultThreadFactory();

    @C40473a
    public C40970b(@C0359n0 String str) {
        C40843u.m166203m(str, "Name must not be null");
        this.f104212a = str;
    }

    @C0359n0
    public final Thread newThread(@C0359n0 Runnable runnable) {
        Thread newThread = this.f104213b.newThread(new C40972d(runnable, 0));
        newThread.setName(this.f104212a);
        return newThread;
    }
}
