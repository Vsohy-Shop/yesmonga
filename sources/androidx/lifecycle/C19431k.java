package androidx.lifecycle;

import androidx.annotation.C0328d;
import androidx.annotation.C0353k0;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12064m2;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.k */
public final class C19431k {

    /* renamed from: a */
    public boolean f49809a = true;

    /* renamed from: b */
    public boolean f49810b;

    /* renamed from: c */
    public boolean f49811c;
    @C12579k

    /* renamed from: d */
    public final Queue<Runnable> f49812d = new ArrayDeque();

    /* renamed from: d */
    public static final void m90711d(C19431k kVar, Runnable runnable) {
        Intrinsics.checkNotNullParameter(kVar, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        kVar.mo57590f(runnable);
    }

    @C0353k0
    /* renamed from: b */
    public final boolean mo57587b() {
        return this.f49810b || !this.f49809a;
    }

    @C0328d
    /* renamed from: c */
    public final void mo57588c(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        C12064m2 a0 = C11768d1.m46783e().mo23706a0();
        if (a0.mo23565U(coroutineContext) || mo57587b()) {
            a0.mo23563O(coroutineContext, new C19429j(this, runnable));
        } else {
            mo57590f(runnable);
        }
    }

    @C0353k0
    /* renamed from: e */
    public final void mo57589e() {
        if (!this.f49811c) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.f49812d.isEmpty() ^ z)) {
                        break;
                    } else if (!mo57587b()) {
                        break;
                    } else {
                        Runnable poll = this.f49812d.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f49811c = z;
            } finally {
                this.f49811c = z;
            }
        }
    }

    @C0353k0
    /* renamed from: f */
    public final void mo57590f(Runnable runnable) {
        if (this.f49812d.offer(runnable)) {
            mo57589e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    @C0353k0
    /* renamed from: g */
    public final void mo57591g() {
        this.f49810b = true;
        mo57589e();
    }

    @C0353k0
    /* renamed from: h */
    public final void mo57592h() {
        this.f49809a = true;
    }

    @C0353k0
    /* renamed from: i */
    public final void mo57593i() {
        if (this.f49809a) {
            if (!this.f49810b) {
                this.f49809a = false;
                mo57589e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
