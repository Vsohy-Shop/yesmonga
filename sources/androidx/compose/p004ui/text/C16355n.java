package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import java.util.List;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.n */
public interface C16355n {
    /* renamed from: B */
    static /* synthetic */ void m73696B(C16355n nVar, C15118b2 b2Var, long j, C15205e4 e4Var, C16434j jVar, int i, Object obj) {
        C15205e4 e4Var2;
        C16434j jVar2;
        if (obj == null) {
            if ((i & 2) != 0) {
                j = C15240j2.f37547b.mo42851u();
            }
            long j2 = j;
            if ((i & 4) != 0) {
                e4Var2 = null;
            } else {
                e4Var2 = e4Var;
            }
            if ((i & 8) != 0) {
                jVar2 = null;
            } else {
                jVar2 = jVar;
            }
            nVar.mo46178F(b2Var, j2, e4Var2, jVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* renamed from: D */
    static /* synthetic */ void m73697D(C16355n nVar, C15118b2 b2Var, C15421z1 z1Var, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        float f2;
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        int i3;
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f2 = Float.NaN;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                e4Var2 = null;
            } else {
                e4Var2 = e4Var;
            }
            if ((i2 & 16) != 0) {
                jVar2 = null;
            } else {
                jVar2 = jVar;
            }
            if ((i2 & 32) != 0) {
                hVar2 = null;
            } else {
                hVar2 = hVar;
            }
            if ((i2 & 64) != 0) {
                i3 = C15187e.f37500l.mo42719a();
            } else {
                i3 = i;
            }
            nVar.mo46217w(b2Var, z1Var, f2, e4Var2, jVar2, hVar2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }

    /* renamed from: G */
    static /* synthetic */ int m73698G(C16355n nVar, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return nVar.mo46208m(i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
    }

    /* renamed from: v */
    static /* synthetic */ void m73699v(C16355n nVar, C15118b2 b2Var, long j, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        long j2;
        C15205e4 e4Var2;
        C16434j jVar2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = C15240j2.f37547b.mo42851u();
            } else {
                j2 = j;
            }
            C15192h hVar2 = null;
            if ((i2 & 4) != 0) {
                e4Var2 = null;
            } else {
                e4Var2 = e4Var;
            }
            if ((i2 & 8) != 0) {
                jVar2 = null;
            } else {
                jVar2 = jVar;
            }
            if ((i2 & 16) == 0) {
                hVar2 = hVar;
            }
            if ((i2 & 32) != 0) {
                i3 = C15187e.f37500l.mo42719a();
            } else {
                i3 = i;
            }
            nVar.mo46200g(b2Var, j2, e4Var2, jVar2, hVar2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* renamed from: A */
    float mo46175A(int i);

    @C12579k
    /* renamed from: C */
    List<C15098i> mo46176C();

    /* renamed from: E */
    float mo46177E(int i);

    /* renamed from: F */
    void mo46178F(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar);

    /* renamed from: a */
    float mo46194a();

    /* renamed from: b */
    float mo46195b();

    @C12579k
    /* renamed from: c */
    C15098i mo46196c(int i);

    @C12579k
    /* renamed from: d */
    ResolvedTextDirection mo46197d(int i);

    /* renamed from: e */
    float mo46198e(int i);

    @C12579k
    /* renamed from: f */
    C15098i mo46199f(int i);

    @C16259h
    /* renamed from: g */
    void mo46200g(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i);

    float getHeight();

    float getWidth();

    /* renamed from: h */
    long mo46203h(int i);

    /* renamed from: i */
    float mo46204i();

    /* renamed from: j */
    int mo46205j(long j);

    /* renamed from: k */
    boolean mo46206k(int i);

    /* renamed from: l */
    int mo46207l(int i);

    /* renamed from: m */
    int mo46208m(int i, boolean z);

    /* renamed from: n */
    int mo46209n();

    /* renamed from: o */
    float mo46210o(int i);

    /* renamed from: p */
    float mo46211p(int i);

    /* renamed from: q */
    boolean mo46212q();

    /* renamed from: r */
    int mo46213r(float f);

    @C12579k
    /* renamed from: s */
    C15231i3 mo46214s(int i, int i2);

    /* renamed from: t */
    float mo46215t(int i, boolean z);

    /* renamed from: u */
    float mo46216u(int i);

    @C16259h
    /* renamed from: w */
    void mo46217w(@C12579k C15118b2 b2Var, @C12579k C15421z1 z1Var, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i);

    /* renamed from: x */
    float mo46218x();

    /* renamed from: y */
    int mo46219y(int i);

    @C12579k
    /* renamed from: z */
    ResolvedTextDirection mo46220z(int i);
}
