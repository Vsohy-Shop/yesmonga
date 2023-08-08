package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.grid.n */
public final class C2499n implements C2498m, C15564g0 {
    @C12580l

    /* renamed from: a */
    public final C2501p f6607a;

    /* renamed from: b */
    public final int f6608b;

    /* renamed from: c */
    public final boolean f6609c;

    /* renamed from: d */
    public final float f6610d;
    @C12579k

    /* renamed from: e */
    public final List<C2492h> f6611e;

    /* renamed from: f */
    public final int f6612f;

    /* renamed from: g */
    public final int f6613g;

    /* renamed from: h */
    public final int f6614h;

    /* renamed from: i */
    public final boolean f6615i;
    @C12579k

    /* renamed from: j */
    public final Orientation f6616j;

    /* renamed from: k */
    public final int f6617k;

    /* renamed from: l */
    public final int f6618l;

    /* renamed from: m */
    public final /* synthetic */ C15564g0 f6619m;

    public C2499n(@C12580l C2501p pVar, int i, boolean z, float f, @C12579k C15564g0 g0Var, @C12579k List<? extends C2492h> list, int i2, int i3, int i4, boolean z2, @C12579k Orientation orientation, int i5, int i6) {
        Intrinsics.checkNotNullParameter(g0Var, "measureResult");
        Intrinsics.checkNotNullParameter(list, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f6607a = pVar;
        this.f6608b = i;
        this.f6609c = z;
        this.f6610d = f;
        this.f6611e = list;
        this.f6612f = i2;
        this.f6613g = i3;
        this.f6614h = i4;
        this.f6615i = z2;
        this.f6616j = orientation;
        this.f6617k = i5;
        this.f6618l = i6;
        this.f6619m = g0Var;
    }

    @C12579k
    /* renamed from: a */
    public Orientation mo8546a() {
        return this.f6616j;
    }

    /* renamed from: b */
    public long mo8547b() {
        return C16502r.m74668a(getWidth(), getHeight());
    }

    /* renamed from: c */
    public int mo8548c() {
        return this.f6617k;
    }

    /* renamed from: d */
    public int mo8549d() {
        return this.f6613g;
    }

    /* renamed from: e */
    public int mo8550e() {
        return this.f6614h;
    }

    /* renamed from: f */
    public int mo8551f() {
        return -mo8553h();
    }

    /* renamed from: g */
    public int mo8552g() {
        return this.f6618l;
    }

    public int getHeight() {
        return this.f6619m.getHeight();
    }

    public int getWidth() {
        return this.f6619m.getWidth();
    }

    /* renamed from: h */
    public int mo8553h() {
        return this.f6612f;
    }

    @C12579k
    /* renamed from: i */
    public List<C2492h> mo8554i() {
        return this.f6611e;
    }

    /* renamed from: j */
    public boolean mo8555j() {
        return this.f6615i;
    }

    /* renamed from: k */
    public final boolean mo8589k() {
        return this.f6609c;
    }

    /* renamed from: l */
    public final float mo8590l() {
        return this.f6610d;
    }

    @C12580l
    /* renamed from: m */
    public final C2501p mo8591m() {
        return this.f6607a;
    }

    /* renamed from: n */
    public final int mo8592n() {
        return this.f6608b;
    }

    @C12579k
    /* renamed from: w */
    public Map<C15531a, Integer> mo8593w() {
        return this.f6619m.mo8593w();
    }

    /* renamed from: x */
    public void mo8594x() {
        this.f6619m.mo8594x();
    }
}
