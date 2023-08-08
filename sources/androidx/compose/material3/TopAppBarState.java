package androidx.compose.material3;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1664:1\n76#2:1665\n102#2,2:1666\n76#2:1668\n102#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n833#1:1665\n833#1:1666,2\n860#1:1668\n860#1:1669,2\n*E\n"})
public final class TopAppBarState {
    @C12579k

    /* renamed from: d */
    public static final C8163a f19960d = new C8163a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f19961e = 0;
    @C12579k

    /* renamed from: f */
    public static final C8628e<TopAppBarState, ?> f19962f = ListSaverKt.m31335a(TopAppBarState$Companion$Saver$1.f19966f, TopAppBarState$Companion$Saver$2.f19967f);
    @C12579k

    /* renamed from: a */
    public final C8700z0 f19963a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f19964b;
    @C12579k

    /* renamed from: c */
    public C8700z0<Float> f19965c;

    /* renamed from: androidx.compose.material3.TopAppBarState$a */
    public static final class C8163a {
        public /* synthetic */ C8163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<TopAppBarState, ?> mo12419a() {
            return TopAppBarState.f19962f;
        }

        public C8163a() {
        }
    }

    public TopAppBarState(float f, float f2, float f3) {
        this.f19963a = C8539f2.m30981g(Float.valueOf(f), (C8410b2) null, 2, (Object) null);
        this.f19964b = C8539f2.m30981g(Float.valueOf(f3), (C8410b2) null, 2, (Object) null);
        this.f19965c = C8539f2.m30981g(Float.valueOf(f2), (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: b */
    public final float mo12411b() {
        boolean z;
        if (mo12414e() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo12413d() / mo12414e();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo12412c() {
        return ((Number) this.f19964b.getValue()).floatValue();
    }

    /* renamed from: d */
    public final float mo12413d() {
        return this.f19965c.getValue().floatValue();
    }

    /* renamed from: e */
    public final float mo12414e() {
        return ((Number) this.f19963a.getValue()).floatValue();
    }

    /* renamed from: f */
    public final float mo12415f() {
        boolean z;
        if (mo12414e() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return ((float) 1) - (C11479u.m44331H(mo12414e() - mo12412c(), mo12414e(), 0.0f) / mo12414e());
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void mo12416g(float f) {
        this.f19964b.setValue(Float.valueOf(f));
    }

    /* renamed from: h */
    public final void mo12417h(float f) {
        this.f19965c.setValue(Float.valueOf(C11479u.m44331H(f, mo12414e(), 0.0f)));
    }

    /* renamed from: i */
    public final void mo12418i(float f) {
        this.f19963a.setValue(Float.valueOf(f));
    }
}
