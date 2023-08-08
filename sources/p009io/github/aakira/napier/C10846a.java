package p009io.github.aakira.napier;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.Napier;

/* renamed from: io.github.aakira.napier.a */
public abstract class C10846a {
    /* renamed from: a */
    public boolean mo21816a(@C12579k Napier.Level level, @C12580l String str) {
        Intrinsics.checkNotNullParameter(level, "priority");
        return true;
    }

    /* renamed from: b */
    public final void mo21817b(@C12579k Napier.Level level, @C12580l String str, @C12580l Throwable th, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(level, "priority");
        if (mo21816a(level, str)) {
            mo21818c(level, str, th, str2);
        }
    }

    /* renamed from: c */
    public abstract void mo21818c(@C12579k Napier.Level level, @C12580l String str, @C12580l Throwable th, @C12580l String str2);

    /* renamed from: d */
    public final void mo21819d(@C12579k Napier.Level level, @C12580l String str, @C12580l Throwable th, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(level, "priority");
        mo21818c(level, str, th, str2);
    }
}
