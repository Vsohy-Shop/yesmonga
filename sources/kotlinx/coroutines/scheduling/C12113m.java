package kotlinx.coroutines.scheduling;

import kotlin.jvm.C11287e;
import kotlinx.coroutines.C12090r0;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.m */
public final class C12113m extends C12110j {
    @C12579k
    @C11287e

    /* renamed from: c */
    public final Runnable f29820c;

    public C12113m(@C12579k Runnable runnable, long j, @C12579k C12111k kVar) {
        super(j, kVar);
        this.f29820c = runnable;
    }

    public void run() {
        try {
            this.f29820c.run();
        } finally {
            this.f29818b.mo24657K();
        }
    }

    @C12579k
    public String toString() {
        return "Task[" + C12090r0.m48300a(this.f29820c) + '@' + C12090r0.m48301b(this.f29820c) + ", " + this.f29817a + ", " + this.f29818b + C12361b.f30261l;
    }
}
