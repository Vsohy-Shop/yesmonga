package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.p */
public final class C2572p implements C2570o, C15564g0 {
    @C12580l

    /* renamed from: a */
    public final C2620u f6766a;

    /* renamed from: b */
    public final int f6767b;

    /* renamed from: c */
    public final boolean f6768c;

    /* renamed from: d */
    public final float f6769d;
    @C12579k

    /* renamed from: e */
    public final List<C2517l> f6770e;

    /* renamed from: f */
    public final int f6771f;

    /* renamed from: g */
    public final int f6772g;

    /* renamed from: h */
    public final int f6773h;

    /* renamed from: i */
    public final boolean f6774i;
    @C12579k

    /* renamed from: j */
    public final Orientation f6775j;

    /* renamed from: k */
    public final int f6776k;

    /* renamed from: l */
    public final int f6777l;

    /* renamed from: m */
    public final /* synthetic */ C15564g0 f6778m;

    public C2572p(@C12580l C2620u uVar, int i, boolean z, float f, @C12579k C15564g0 g0Var, @C12579k List<? extends C2517l> list, int i2, int i3, int i4, boolean z2, @C12579k Orientation orientation, int i5, int i6) {
        Intrinsics.checkNotNullParameter(g0Var, "measureResult");
        Intrinsics.checkNotNullParameter(list, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f6766a = uVar;
        this.f6767b = i;
        this.f6768c = z;
        this.f6769d = f;
        this.f6770e = list;
        this.f6771f = i2;
        this.f6772g = i3;
        this.f6773h = i4;
        this.f6774i = z2;
        this.f6775j = orientation;
        this.f6776k = i5;
        this.f6777l = i6;
        this.f6778m = g0Var;
    }

    @C12579k
    /* renamed from: a */
    public Orientation mo8370a() {
        return this.f6775j;
    }

    /* renamed from: b */
    public long mo8371b() {
        return C16502r.m74668a(getWidth(), getHeight());
    }

    /* renamed from: c */
    public int mo8372c() {
        return this.f6776k;
    }

    /* renamed from: d */
    public int mo8373d() {
        return this.f6772g;
    }

    /* renamed from: e */
    public int mo8374e() {
        return this.f6773h;
    }

    /* renamed from: f */
    public int mo8375f() {
        return -mo8377h();
    }

    /* renamed from: g */
    public int mo8376g() {
        return this.f6777l;
    }

    public int getHeight() {
        return this.f6778m.getHeight();
    }

    public int getWidth() {
        return this.f6778m.getWidth();
    }

    /* renamed from: h */
    public int mo8377h() {
        return this.f6771f;
    }

    @C12579k
    /* renamed from: i */
    public List<C2517l> mo8378i() {
        return this.f6770e;
    }

    /* renamed from: j */
    public boolean mo8379j() {
        return this.f6774i;
    }

    /* renamed from: q */
    public final boolean mo8817q() {
        return this.f6768c;
    }

    /* renamed from: r */
    public final float mo8818r() {
        return this.f6769d;
    }

    @C12580l
    /* renamed from: s */
    public final C2620u mo8819s() {
        return this.f6766a;
    }

    /* renamed from: t */
    public final int mo8820t() {
        return this.f6767b;
    }

    @C12579k
    /* renamed from: w */
    public Map<C15531a, Integer> mo8593w() {
        return this.f6778m.mo8593w();
    }

    /* renamed from: x */
    public void mo8594x() {
        this.f6778m.mo8594x();
    }
}
