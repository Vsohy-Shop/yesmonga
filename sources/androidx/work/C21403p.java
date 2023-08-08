package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0376v0;
import androidx.work.C21414w;
import androidx.work.impl.utils.C21301d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p073j$.time.Duration;

/* renamed from: androidx.work.p */
public final class C21403p extends C21414w {
    @C12579k

    /* renamed from: h */
    public static final C21405b f55148h = new C21405b((DefaultConstructorMarker) null);
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: i */
    public static final long f55149i = 900000;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: j */
    public static final long f55150j = 300000;

    /* renamed from: androidx.work.p$b */
    public static final class C21405b {
        public /* synthetic */ C21405b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21405b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21403p(@C12579k C21404a aVar) {
        super(aVar.mo63864e(), aVar.mo63866h(), aVar.mo63865f());
        Intrinsics.checkNotNullParameter(aVar, "builder");
    }

    /* renamed from: androidx.work.p$a */
    public static final class C21404a extends C21414w.C21415a<C21404a, C21403p> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21404a(@C12579k Class<? extends C21372k> cls, long j, @C12579k TimeUnit timeUnit) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            Intrinsics.checkNotNullParameter(timeUnit, "repeatIntervalTimeUnit");
            mo63866h().mo63459G(timeUnit.toMillis(j));
        }

        @C12579k
        /* renamed from: A */
        public C21403p mo63787c() {
            boolean z;
            if (!mo63863d() || !mo63866h().f54813j.mo63133h()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            } else if (!mo63866h().f54820q) {
                return new C21403p(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
        }

        @C12579k
        /* renamed from: B */
        public C21404a mo63788g() {
            return this;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C0376v0(26)
        public C21404a(@C12579k Class<? extends C21372k> cls, @C12579k Duration duration) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            Intrinsics.checkNotNullParameter(duration, "repeatInterval");
            mo63866h().mo63459G(C21301d.m98372a(duration));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21404a(@C12579k Class<? extends C21372k> cls, long j, @C12579k TimeUnit timeUnit, long j2, @C12579k TimeUnit timeUnit2) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            Intrinsics.checkNotNullParameter(timeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(timeUnit2, "flexIntervalTimeUnit");
            mo63866h().mo63460H(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C0376v0(26)
        public C21404a(@C12579k Class<? extends C21372k> cls, @C12579k Duration duration, @C12579k Duration duration2) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            Intrinsics.checkNotNullParameter(duration, "repeatInterval");
            Intrinsics.checkNotNullParameter(duration2, "flexInterval");
            mo63866h().mo63460H(C21301d.m98372a(duration), C21301d.m98372a(duration2));
        }
    }
}
