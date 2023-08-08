package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.s0 */
public abstract class C32087s0 implements Closeable {
    /* renamed from: a */
    public abstract long mo92549a();

    /* renamed from: b */
    public abstract InputStream mo92550b(long j, long j2) throws IOException;

    /* renamed from: c */
    public final synchronized InputStream mo92814c() throws IOException {
        return mo92550b(0, mo92549a());
    }
}
