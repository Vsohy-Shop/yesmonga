package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8635a0;
import androidx.compose.runtime.snapshots.C8638b0;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.C8665r;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,298:1\n2180#2:299\n2101#2,2:300\n1686#2:302\n2103#2,5:304\n2180#2:309\n2180#2:310\n70#3:303\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n131#1:299\n133#1:300,2\n133#1:302\n133#1:304,5\n174#1:309\n210#1:310\n133#1:303\n*E\n"})
public class SnapshotMutableStateImpl<T> implements C8635a0, C8665r<T> {
    @C12579k

    /* renamed from: a */
    public final C8410b2<T> f22751a;
    @C12579k

    /* renamed from: b */
    public C8398a<T> f22752b;

    /* renamed from: androidx.compose.runtime.SnapshotMutableStateImpl$a */
    public static final class C8398a<T> extends C8638b0 {

        /* renamed from: d */
        public T f22753d;

        public C8398a(T t) {
            this.f22753d = t;
        }

        /* renamed from: a */
        public void mo15124a(@C12579k C8638b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "value");
            this.f22753d = ((C8398a) b0Var).f22753d;
        }

        @C12579k
        /* renamed from: b */
        public C8638b0 mo15125b() {
            return new C8398a(this.f22753d);
        }

        /* renamed from: g */
        public final T mo15302g() {
            return this.f22753d;
        }

        /* renamed from: h */
        public final void mo15303h(T t) {
            this.f22753d = t;
        }
    }

    public SnapshotMutableStateImpl(T t, @C12579k C8410b2<T> b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        this.f22751a = b2Var;
        this.f22752b = new C8398a<>(t);
    }

    /* renamed from: k */
    public static /* synthetic */ void m30151k() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m30152l() {
    }

    @C12579k
    /* renamed from: a */
    public C8410b2<T> mo15298a() {
        return this.f22751a;
    }

    @C12579k
    /* renamed from: d */
    public C11300l<T, C11079d2> mo15189d() {
        return new SnapshotMutableStateImpl$component2$1(this);
    }

    /* renamed from: e */
    public void mo15116e(@C12579k C8638b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "value");
        this.f22752b = (C8398a) b0Var;
    }

    @C11314h(name = "getDebuggerDisplayValue")
    /* renamed from: g */
    public final T mo15299g() {
        return ((C8398a) SnapshotKt.m31444B(this.f22752b)).mo15302g();
    }

    public T getValue() {
        return ((C8398a) SnapshotKt.m31464V(this.f22752b, this)).mo15302g();
    }

    @C12579k
    /* renamed from: i */
    public C8638b0 mo15119i() {
        return this.f22752b;
    }

    /* renamed from: j */
    public T mo15191j() {
        return getValue();
    }

    @C12580l
    /* renamed from: q */
    public C8638b0 mo15300q(@C12579k C8638b0 b0Var, @C12579k C8638b0 b0Var2, @C12579k C8638b0 b0Var3) {
        Intrinsics.checkNotNullParameter(b0Var, "previous");
        Intrinsics.checkNotNullParameter(b0Var2, "current");
        Intrinsics.checkNotNullParameter(b0Var3, "applied");
        C8398a aVar = (C8398a) b0Var;
        C8398a aVar2 = (C8398a) b0Var2;
        C8398a aVar3 = (C8398a) b0Var3;
        if (mo15298a().mo15330c(aVar2.mo15302g(), aVar3.mo15302g())) {
            return b0Var2;
        }
        Object b = mo15298a().mo15337b(aVar.mo15302g(), aVar2.mo15302g(), aVar3.mo15302g());
        if (b == null) {
            return null;
        }
        C8638b0 b2 = aVar3.mo15125b();
        Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((C8398a) b2).mo15303h(b);
        return b2;
    }

    public void setValue(T t) {
        C8646f b;
        C8398a aVar = (C8398a) SnapshotKt.m31444B(this.f22752b);
        if (!mo15298a().mo15330c(aVar.mo15302g(), t)) {
            C8398a<T> aVar2 = this.f22752b;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                ((C8398a) SnapshotKt.m31460R(aVar2, this, b, aVar)).mo15303h(t);
                C11079d2 d2Var = C11079d2.f28267a;
            }
            SnapshotKt.m31457O(b, this);
        }
    }

    @C12579k
    public String toString() {
        return "MutableState(value=" + ((C8398a) SnapshotKt.m31444B(this.f22752b)).mo15302g() + ")@" + hashCode();
    }
}
