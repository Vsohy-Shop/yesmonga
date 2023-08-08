package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.z */
public final class C16254z {
    @C16259h
    @C12579k
    /* renamed from: a */
    public static final C16238t m73199a(int i, @C12579k C16209i0 i0Var, int i2, int i3, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16245u0(i, i0Var, i2, eVar, i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C16238t m73200b(int i, C16209i0 i0Var, int i2, int i3, C16201h0.C16206e eVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i4 & 4) != 0) {
            i2 = C16190e0.f40252b.mo46883b();
        }
        if ((i4 & 8) != 0) {
            i3 = C16182c0.f40243b.mo46866b();
        }
        if ((i4 & 16) != 0) {
            eVar = C16201h0.f40264a.mo46904b(i0Var, i2, new C16201h0.C16202a[0]);
        }
        return m73199a(i, i0Var, i2, i3, eVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C16238t m73202d(int i, C16209i0 i0Var, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i3 & 4) != 0) {
            i2 = C16190e0.f40252b.mo46883b();
        }
        return Intrinsics.checkNotNullParameter(i0Var, "weight");
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final C16238t m73203e(int i, @C12579k C16209i0 i0Var, int i2, int i3) {
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        return new C16245u0(i, i0Var, i2, new C16201h0.C16206e(new C16201h0.C16202a[0]), i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C16238t m73204f(int i, C16209i0 i0Var, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i0Var = C16209i0.f40292b.mo46952m();
        }
        if ((i4 & 4) != 0) {
            i2 = C16190e0.f40252b.mo46883b();
        }
        if ((i4 & 8) != 0) {
            i3 = C16182c0.f40243b.mo46866b();
        }
        return m73203e(i, i0Var, i2, i3);
    }

    @C8547h2
    @C12579k
    /* renamed from: g */
    public static final C16242u m73205g(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return C16246v.m73187c(tVar);
    }
}
