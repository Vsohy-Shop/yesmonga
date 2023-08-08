package com.google.android.gms.internal.mlkit_common;

import android.system.OsConstants;
import android.system.StructStat;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.mlkit_common.j9 */
public final class C42412j9 {

    /* renamed from: a */
    public final long f107143a;

    /* renamed from: b */
    public final long f107144b;

    /* renamed from: c */
    public final boolean f107145c;

    public C42412j9(long j, long j2, boolean z) {
        this.f107143a = j;
        this.f107144b = j2;
        this.f107145c = z;
    }

    /* renamed from: a */
    public static C42412j9 m171552a(FileDescriptor fileDescriptor) throws IOException {
        StructStat structStat = (StructStat) m171554c(new C42551w6(fileDescriptor));
        return new C42412j9(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    /* renamed from: b */
    public static C42412j9 m171553b(String str) throws IOException {
        StructStat structStat = (StructStat) m171554c(new C42562x7(str));
        return new C42412j9(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    /* renamed from: c */
    public static <T> T m171554c(Callable<T> callable) throws IOException {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
