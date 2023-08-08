package androidx.work.impl;

import androidx.work.C21377l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.c0 */
public final class C21136c0 {
    @C12579k

    /* renamed from: a */
    public static final String f54583a;
    @C12579k

    /* renamed from: b */
    public static final String f54584b = "androidx.work.workdb";
    @C12579k

    /* renamed from: c */
    public static final String[] f54585c = {"-journal", "-shm", "-wal"};

    static {
        String i = C21377l.m98584i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"WrkDbPathHelper\")");
        f54583a = i;
    }
}
