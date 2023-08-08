package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.collections.a */
public abstract class C10899a<T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public State f28129a = State.NotReady;
    @C12580l

    /* renamed from: b */
    public T f28130b;

    /* renamed from: kotlin.collections.a$a */
    public /* synthetic */ class C10900a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kotlin.collections.State[] r0 = kotlin.collections.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.State r1 = kotlin.collections.State.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.collections.State r1 = kotlin.collections.State.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10899a.C10900a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public abstract void mo22036b();

    /* renamed from: c */
    public final void mo22037c() {
        this.f28129a = State.Done;
    }

    /* renamed from: d */
    public final void mo22038d(T t) {
        this.f28130b = t;
        this.f28129a = State.Ready;
    }

    /* renamed from: e */
    public final boolean mo22039e() {
        this.f28129a = State.Failed;
        mo22036b();
        if (this.f28129a == State.Ready) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        boolean z;
        State state = this.f28129a;
        if (state != State.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C10900a.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return mo22039e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f28129a = State.NotReady;
            return this.f28130b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
