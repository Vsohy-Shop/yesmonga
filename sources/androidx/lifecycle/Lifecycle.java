package androidx.lifecycle;

import androidx.annotation.C0353k0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class Lifecycle {
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public AtomicReference<Object> f49685a = new AtomicReference<>();

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Landroidx/lifecycle/Lifecycle$State;", "w", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.Lifecycle$Event */
    public enum C19372Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @C12579k
        public static final C19373a Companion = null;

        /* renamed from: androidx.lifecycle.Lifecycle$Event$a */
        public static final class C19373a {

            /* renamed from: androidx.lifecycle.Lifecycle$Event$a$a */
            public /* synthetic */ class C19374a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        $EnumSwitchMapping$0 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Lifecycle.C19372Event.C19373a.C19374a.<clinit>():void");
                }
            }

            public /* synthetic */ C19373a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12580l
            @C11384m
            /* renamed from: a */
            public final C19372Event mo57470a(@C12579k State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C19374a.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return C19372Event.ON_DESTROY;
                }
                if (i == 2) {
                    return C19372Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return C19372Event.ON_PAUSE;
            }

            @C12580l
            @C11384m
            /* renamed from: b */
            public final C19372Event mo57471b(@C12579k State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C19374a.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return C19372Event.ON_STOP;
                }
                if (i == 2) {
                    return C19372Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return C19372Event.ON_DESTROY;
            }

            @C12580l
            @C11384m
            /* renamed from: c */
            public final C19372Event mo57472c(@C12579k State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C19374a.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return C19372Event.ON_START;
                }
                if (i == 2) {
                    return C19372Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return C19372Event.ON_CREATE;
            }

            @C12580l
            @C11384m
            /* renamed from: d */
            public final C19372Event mo57473d(@C12579k State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C19374a.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return C19372Event.ON_CREATE;
                }
                if (i == 2) {
                    return C19372Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return C19372Event.ON_RESUME;
            }

            public C19373a() {
            }
        }

        /* renamed from: androidx.lifecycle.Lifecycle$Event$b */
        public /* synthetic */ class C19375b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.C19372Event.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.C19372Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Lifecycle.C19372Event.C19375b.<clinit>():void");
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C19373a((DefaultConstructorMarker) null);
        }

        @C12580l
        @C11384m
        /* renamed from: q */
        public static final C19372Event m90523q(@C12579k State state) {
            return Companion.mo57470a(state);
        }

        @C12580l
        @C11384m
        /* renamed from: r */
        public static final C19372Event m90524r(@C12579k State state) {
            return Companion.mo57471b(state);
        }

        @C12580l
        @C11384m
        /* renamed from: y */
        public static final C19372Event m90525y(@C12579k State state) {
            return Companion.mo57472c(state);
        }

        @C12580l
        @C11384m
        /* renamed from: z */
        public static final C19372Event m90526z(@C12579k State state) {
            return Companion.mo57473d(state);
        }

        @C12579k
        /* renamed from: w */
        public final State mo57469w() {
            switch (C19375b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "state", "", "q", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "lifecycle-common"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: q */
        public final boolean mo57474q(@C12579k State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    @C0353k0
    /* renamed from: a */
    public abstract void mo57464a(@C12579k C19475v vVar);

    @C0353k0
    @C12579k
    /* renamed from: b */
    public abstract State mo57465b();

    @C12579k
    /* renamed from: c */
    public final AtomicReference<Object> mo57466c() {
        return this.f49685a;
    }

    @C0353k0
    /* renamed from: d */
    public abstract void mo57467d(@C12579k C19475v vVar);

    /* renamed from: e */
    public final void mo57468e(@C12579k AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.f49685a = atomicReference;
    }
}
