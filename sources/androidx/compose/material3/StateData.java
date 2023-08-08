package androidx.compose.material3;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1920:1\n76#2:1921\n102#2,2:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n*L\n871#1:1921\n871#1:1922,2\n*E\n"})
public final class StateData {
    @C12579k

    /* renamed from: g */
    public static final Companion f19732g = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C11466l f19733a;
    @C12579k

    /* renamed from: b */
    public final C8244m f19734b;
    @C12579k

    /* renamed from: c */
    public C8700z0<C8238l> f19735c;
    @C12579k

    /* renamed from: d */
    public C8700z0<C8238l> f19736d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f19737e;
    @C12579k

    /* renamed from: f */
    public C8700z0<C8208h0> f19738f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<StateData, Object> mo12002a() {
            return ListSaverKt.m31335a(StateData$Companion$Saver$1.f19739f, StateData$Companion$Saver$2.f19740f);
        }

        public Companion() {
        }
    }

    public /* synthetic */ StateData(Long l, Long l2, Long l3, C11466l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, l3, lVar, i);
    }

    @C12579k
    /* renamed from: a */
    public final C8244m mo11987a() {
        return this.f19734b;
    }

    @C12579k
    /* renamed from: b */
    public final C8266q mo11988b() {
        C8244m mVar = this.f19734b;
        return mVar.mo12486b(mVar.mo12487c());
    }

    @C12579k
    /* renamed from: c */
    public final C8700z0<C8208h0> mo11989c() {
        return this.f19738f;
    }

    @C12579k
    /* renamed from: d */
    public final C8266q mo11990d() {
        return (C8266q) this.f19737e.getValue();
    }

    /* renamed from: e */
    public final int mo11991e() {
        return mo11990d().mo12923p(this.f19733a);
    }

    @C12579k
    /* renamed from: f */
    public final C8700z0<C8238l> mo11992f() {
        return this.f19736d;
    }

    @C12579k
    /* renamed from: g */
    public final C8700z0<C8238l> mo11993g() {
        return this.f19735c;
    }

    /* renamed from: h */
    public final int mo11994h() {
        return ((this.f19733a.mo23051w() - this.f19733a.mo23049r()) + 1) * 12;
    }

    @C12579k
    /* renamed from: i */
    public final C11466l mo11995i() {
        return this.f19733a;
    }

    /* renamed from: j */
    public final void mo11996j(@C12579k C8700z0<C8208h0> z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
        this.f19738f = z0Var;
    }

    /* renamed from: k */
    public final void mo11997k(@C12579k C8266q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f19737e.setValue(qVar);
    }

    /* renamed from: l */
    public final void mo11998l(@C12579k C8700z0<C8238l> z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
        this.f19736d = z0Var;
    }

    /* renamed from: m */
    public final void mo11999m(@C12579k C8700z0<C8238l> z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
        this.f19735c = z0Var;
    }

    /* renamed from: n */
    public final void mo12000n(@C12580l Long l, @C12580l Long l2) {
        C8238l lVar;
        boolean z;
        C8238l lVar2 = null;
        if (l != null) {
            lVar = this.f19734b.mo12491h(l.longValue());
        } else {
            lVar = null;
        }
        if (l2 != null) {
            lVar2 = this.f19734b.mo12491h(l2.longValue());
        }
        if (lVar != null && !this.f19733a.mo23056Q(lVar.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + lVar.getYear() + ") is out of the years range of " + this.f19733a + '.').toString());
        } else if (lVar2 == null || this.f19733a.mo23056Q(lVar2.getYear())) {
            if (lVar2 != null) {
                if (lVar != null) {
                    if (lVar.mo12763X() <= lVar2.mo12763X()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("An end date was provided without a start date.".toString());
                }
            }
            this.f19735c.setValue(lVar);
            this.f19736d.setValue(lVar2);
        } else {
            throw new IllegalArgumentException(("The provided end date year (" + lVar2.getYear() + ") is out of the years range of " + this.f19733a + '.').toString());
        }
    }

    /* renamed from: o */
    public final void mo12001o(int i) {
        C8238l value = this.f19735c.getValue();
        if (value != null) {
            mo11997k(this.f19734b.mo12486b(value));
        }
        if (this.f19735c.getValue() == null && this.f19736d.getValue() != null) {
            this.f19736d.setValue(null);
        }
        this.f19738f.setValue(C8208h0.m27129c(i));
    }

    public StateData(Long l, Long l2, Long l3, C11466l lVar, int i) {
        C8266q qVar;
        Intrinsics.checkNotNullParameter(lVar, "yearRange");
        this.f19733a = lVar;
        C8244m a = C8260p.m27432a();
        this.f19734b = a;
        this.f19735c = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f19736d = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        mo12000n(l, l2);
        if (l3 != null) {
            qVar = a.mo12492i(l3.longValue());
            if (!lVar.mo23056Q(qVar.mo12922o())) {
                throw new IllegalArgumentException(("The initial display month's year (" + qVar.mo12922o() + ") is out of the years range of " + lVar + '.').toString());
            }
        } else {
            qVar = mo11988b();
        }
        this.f19737e = C8539f2.m30981g(qVar, (C8410b2) null, 2, (Object) null);
        this.f19738f = C8539f2.m30981g(C8208h0.m27129c(i), (C8410b2) null, 2, (Object) null);
    }
}
