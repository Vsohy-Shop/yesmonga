package com.carrefour.fid.android.design.components.widgets.counter;

import android.os.CountDownTimer;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class CustomCountDownTimer extends CountDownTimer {
    @C12579k

    /* renamed from: d */
    public static final C37212a f93338d = new C37212a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f93339e = 8;
    @C12580l

    /* renamed from: f */
    public static volatile CustomCountDownTimer f93340f;
    @C12579k

    /* renamed from: a */
    public CountDownState f93341a;

    /* renamed from: b */
    public long f93342b;
    @C12580l

    /* renamed from: c */
    public C37213b f93343c;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer$CountDownState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum CountDownState {
        IDLE,
        STARTED,
        FINISHED
    }

    @C11363r0({"SMAP\nCustomCountDownTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCountDownTimer.kt\ncom/carrefour/fid/android/design/components/widgets/counter/CustomCountDownTimer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    /* renamed from: com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$a */
    public static final class C37212a {
        public /* synthetic */ C37212a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CustomCountDownTimer mo113339a(long j, long j2) {
            CustomCountDownTimer a = CustomCountDownTimer.f93340f;
            if (a == null) {
                synchronized (this) {
                    a = CustomCountDownTimer.f93340f;
                    if (a == null) {
                        a = new CustomCountDownTimer(j, j2, (DefaultConstructorMarker) null);
                        C37212a aVar = CustomCountDownTimer.f93338d;
                        CustomCountDownTimer.f93340f = a;
                    }
                }
            }
            return a;
        }

        public C37212a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer$b */
    public interface C37213b {
        /* renamed from: a */
        void mo113331a();

        /* renamed from: b */
        void mo113332b(long j);
    }

    public /* synthetic */ CustomCountDownTimer(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: c */
    public final void mo113333c() {
        cancel();
        f93340f = null;
        this.f93342b = 0;
        this.f93341a = CountDownState.IDLE;
    }

    /* renamed from: d */
    public final long mo113334d() {
        return this.f93342b;
    }

    @C12579k
    /* renamed from: e */
    public final CountDownState mo113335e() {
        return this.f93341a;
    }

    /* renamed from: f */
    public final void mo113336f(@C12579k C37213b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "onResultListener");
        this.f93343c = bVar;
    }

    public void onFinish() {
        this.f93342b = 0;
        this.f93341a = CountDownState.FINISHED;
        C37213b bVar = this.f93343c;
        if (bVar != null) {
            bVar.mo113331a();
        }
    }

    public void onTick(long j) {
        this.f93342b = j;
        this.f93341a = CountDownState.STARTED;
        C37213b bVar = this.f93343c;
        if (bVar != null) {
            bVar.mo113332b(j);
        }
    }

    public CustomCountDownTimer(long j, long j2) {
        super(j, j2);
        this.f93341a = CountDownState.IDLE;
    }
}
