package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "TimersKt")
/* renamed from: kotlin.concurrent.c */
public final class C11026c {

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* renamed from: kotlin.concurrent.c$a */
    public static final class C11027a extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ C11300l<TimerTask, C11079d2> f28234a;

        public C11027a(C11300l<? super TimerTask, C11079d2> lVar) {
            this.f28234a = lVar;
        }

        public void run() {
            this.f28234a.invoke(this);
        }
    }

    @C11110f
    /* renamed from: a */
    public static final Timer m42520a(String str, boolean z, long j, long j2, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.scheduleAtFixedRate(new C11027a(lVar), j, j2);
        return k;
    }

    @C11110f
    /* renamed from: b */
    public static final Timer m42521b(String str, boolean z, Date date, long j, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(date, "startAt");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.scheduleAtFixedRate(new C11027a(lVar), date, j);
        return k;
    }

    /* renamed from: c */
    public static /* synthetic */ Timer m42522c(String str, boolean z, long j, long j2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        Timer timer = k;
        timer.scheduleAtFixedRate(new C11027a(lVar), j, j2);
        return k;
    }

    /* renamed from: d */
    public static /* synthetic */ Timer m42523d(String str, boolean z, Date date, long j, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(date, "startAt");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.scheduleAtFixedRate(new C11027a(lVar), date, j);
        return k;
    }

    @C11110f
    /* renamed from: e */
    public static final TimerTask m42524e(Timer timer, long j, long j2, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.schedule(aVar, j, j2);
        return aVar;
    }

    @C11110f
    /* renamed from: f */
    public static final TimerTask m42525f(Timer timer, long j, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.schedule(aVar, j);
        return aVar;
    }

    @C11110f
    /* renamed from: g */
    public static final TimerTask m42526g(Timer timer, Date date, long j, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(date, "time");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.schedule(aVar, date, j);
        return aVar;
    }

    @C11110f
    /* renamed from: h */
    public static final TimerTask m42527h(Timer timer, Date date, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(date, "time");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @C11110f
    /* renamed from: i */
    public static final TimerTask m42528i(Timer timer, long j, long j2, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.scheduleAtFixedRate(aVar, j, j2);
        return aVar;
    }

    @C11110f
    /* renamed from: j */
    public static final TimerTask m42529j(Timer timer, Date date, long j, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(date, "time");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C11027a aVar = new C11027a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j);
        return aVar;
    }

    @C12579k
    @C11532s0
    /* renamed from: k */
    public static final Timer m42530k(@C12580l String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @C11110f
    /* renamed from: l */
    public static final Timer m42531l(String str, boolean z, long j, long j2, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.schedule(new C11027a(lVar), j, j2);
        return k;
    }

    @C11110f
    /* renamed from: m */
    public static final Timer m42532m(String str, boolean z, Date date, long j, C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(date, "startAt");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.schedule(new C11027a(lVar), date, j);
        return k;
    }

    /* renamed from: n */
    public static /* synthetic */ Timer m42533n(String str, boolean z, long j, long j2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        Timer timer = k;
        timer.schedule(new C11027a(lVar), j, j2);
        return k;
    }

    /* renamed from: o */
    public static /* synthetic */ Timer m42534o(String str, boolean z, Date date, long j, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(date, "startAt");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Timer k = m42530k(str, z);
        k.schedule(new C11027a(lVar), date, j);
        return k;
    }

    @C11110f
    /* renamed from: p */
    public static final TimerTask m42535p(C11300l<? super TimerTask, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        return new C11027a(lVar);
    }
}
