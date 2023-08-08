package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public final class StartedWhileSubscribed implements C11948r {

    /* renamed from: b */
    public final long f29455b;

    /* renamed from: c */
    public final long f29456c;

    public StartedWhileSubscribed(long j, long j2) {
        boolean z;
        this.f29455b = j;
        this.f29456c = j2;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(j2 < 0 ? false : z2)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @C12579k
    /* renamed from: a */
    public C11907e<SharingCommand> mo24207a(@C12579k C11952u<Integer> uVar) {
        return C11909g.m47451g0(C11909g.m47465k0(C11909g.m47441d2(uVar, new StartedWhileSubscribed$command$1(this, (C11045c<? super StartedWhileSubscribed$command$1>) null)), new StartedWhileSubscribed$command$2((C11045c<? super StartedWhileSubscribed$command$2>) null)));
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f29455b == startedWhileSubscribed.f29455b && this.f29456c == startedWhileSubscribed.f29456c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f29455b) * 31) + Long.hashCode(this.f29456c);
    }

    @C12579k
    public String toString() {
        List j = C10976s.m41418j(2);
        if (this.f29455b > 0) {
            j.add("stopTimeout=" + this.f29455b + "ms");
        }
        if (this.f29456c < Long.MAX_VALUE) {
            j.add("replayExpiration=" + this.f29456c + "ms");
        }
        List a = C10976s.m41409a(j);
        return "SharingStarted.WhileSubscribed(" + CollectionsKt___CollectionsKt.m40639h3(a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null) + ')';
    }
}
