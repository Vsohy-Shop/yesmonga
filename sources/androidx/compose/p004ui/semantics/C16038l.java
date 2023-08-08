package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.semantics.l */
public final class C16038l extends C15988w0 implements C16036k {
    @C12579k

    /* renamed from: e */
    public static final C16039a f39832e = new C16039a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static AtomicInteger f39833f = new AtomicInteger(0);
    @C12579k

    /* renamed from: d */
    public final C16035j f39834d;

    /* renamed from: androidx.compose.ui.semantics.l$a */
    public static final class C16039a {
        public /* synthetic */ C16039a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46172a() {
            return C16038l.f39833f.addAndGet(1);
        }

        public C16039a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16038l(boolean z, boolean z2, C11300l lVar, C11300l<C15983v0, C11079d2> lVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, lVar, (i & 8) != 0 ? InspectableValueKt.m71060b() : lVar2);
    }

    @C12579k
    /* renamed from: Y */
    public C16035j mo46168Y() {
        return this.f39834d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16038l) && Intrinsics.areEqual((Object) mo46168Y(), (Object) ((C16038l) obj).mo46168Y())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo46168Y().hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16038l(boolean z, boolean z2, @C12579k C11300l<? super C16044q, C11079d2> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, "properties");
        Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
        C16035j jVar = new C16035j();
        jVar.mo46156X(z);
        jVar.mo46155W(z2);
        lVar.invoke(jVar);
        this.f39834d = jVar;
    }
}
