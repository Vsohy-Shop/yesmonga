package androidx.compose.p004ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.C16507v;
import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.C11588t1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.m0 */
public final class C15924m0 {
    @C12579k

    /* renamed from: a */
    public final Parcel f39613a;

    public C15924m0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f39613a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* renamed from: a */
    public final int mo45825a() {
        return this.f39613a.dataAvail();
    }

    /* renamed from: b */
    public final float mo45826b() {
        return C16410a.m74022e(mo45829e());
    }

    /* renamed from: c */
    public final byte mo45827c() {
        return this.f39613a.readByte();
    }

    /* renamed from: d */
    public final long mo45828d() {
        return C15240j2.m66077t(mo45840p());
    }

    /* renamed from: e */
    public final float mo45829e() {
        return this.f39613a.readFloat();
    }

    /* renamed from: f */
    public final int mo45830f() {
        byte c = mo45827c();
        if (c == 0) {
            return C16190e0.f40252b.mo46883b();
        }
        if (c == 1) {
            return C16190e0.f40252b.mo46882a();
        }
        return C16190e0.f40252b.mo46883b();
    }

    /* renamed from: g */
    public final int mo45831g() {
        byte c = mo45827c();
        if (c == 0) {
            return C16194f0.f40257b.mo46896b();
        }
        if (c == 1) {
            return C16194f0.f40257b.mo46895a();
        }
        if (c == 3) {
            return C16194f0.f40257b.mo46897c();
        }
        if (c == 2) {
            return C16194f0.f40257b.mo46898d();
        }
        return C16194f0.f40257b.mo46896b();
    }

    @C12579k
    /* renamed from: h */
    public final C16209i0 mo45832h() {
        return new C16209i0(mo45833i());
    }

    /* renamed from: i */
    public final int mo45833i() {
        return this.f39613a.readInt();
    }

    /* renamed from: j */
    public final C15205e4 mo45834j() {
        return new C15205e4(mo45828d(), C15096g.m64898a(mo45829e(), mo45829e()), mo45829e(), (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        r4 = r21;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.text.C16151c0 mo45835k() {
        /*
            r22 = this;
            androidx.compose.ui.platform.b1 r15 = new androidx.compose.ui.platform.b1
            r0 = r15
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20)
            r0 = r22
        L_0x0024:
            android.os.Parcel r1 = r0.f39613a
            int r1 = r1.dataAvail()
            r2 = 1
            if (r1 <= r2) goto L_0x0112
            byte r1 = r22.mo45827c()
            r3 = 8
            if (r1 != r2) goto L_0x0045
            int r1 = r22.mo45825a()
            if (r1 < r3) goto L_0x0112
            long r1 = r22.mo45828d()
            r4 = r21
            r4.mo45697q(r1)
            goto L_0x0024
        L_0x0045:
            r4 = r21
            r5 = 2
            r6 = 5
            if (r1 != r5) goto L_0x005b
            int r1 = r22.mo45825a()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.mo45839o()
            r4.mo45700t(r1)
        L_0x0058:
            r21 = r4
            goto L_0x0024
        L_0x005b:
            r5 = 3
            r7 = 4
            if (r1 != r5) goto L_0x006d
            int r1 = r22.mo45825a()
            if (r1 < r7) goto L_0x0114
            androidx.compose.ui.text.font.i0 r1 = r22.mo45832h()
            r4.mo45703w(r1)
            goto L_0x0058
        L_0x006d:
            if (r1 != r7) goto L_0x0081
            int r1 = r22.mo45825a()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.mo45830f()
            androidx.compose.ui.text.font.e0 r1 = androidx.compose.p004ui.text.font.C16190e0.m72948c(r1)
            r4.mo45701u(r1)
            goto L_0x0058
        L_0x0081:
            if (r1 != r6) goto L_0x0095
            int r1 = r22.mo45825a()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.mo45831g()
            androidx.compose.ui.text.font.f0 r1 = androidx.compose.p004ui.text.font.C16194f0.m72968e(r1)
            r4.mo45702v(r1)
            goto L_0x0058
        L_0x0095:
            r2 = 6
            if (r1 != r2) goto L_0x00a0
            java.lang.String r1 = r22.mo45836l()
            r4.mo45699s(r1)
            goto L_0x0058
        L_0x00a0:
            r2 = 7
            if (r1 != r2) goto L_0x00b1
            int r1 = r22.mo45825a()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.mo45839o()
            r4.mo45704x(r1)
            goto L_0x0058
        L_0x00b1:
            if (r1 != r3) goto L_0x00c5
            int r1 = r22.mo45825a()
            if (r1 < r7) goto L_0x0114
            float r1 = r22.mo45826b()
            androidx.compose.ui.text.style.a r1 = androidx.compose.p004ui.text.style.C16410a.m74021d(r1)
            r4.mo45696p(r1)
            goto L_0x0058
        L_0x00c5:
            r2 = 9
            if (r1 != r2) goto L_0x00d7
            int r1 = r22.mo45825a()
            if (r1 < r3) goto L_0x0114
            androidx.compose.ui.text.style.m r1 = r22.mo45838n()
            r4.mo45679B(r1)
            goto L_0x0058
        L_0x00d7:
            r2 = 10
            if (r1 != r2) goto L_0x00ea
            int r1 = r22.mo45825a()
            if (r1 < r3) goto L_0x0114
            long r1 = r22.mo45828d()
            r4.mo45695o(r1)
            goto L_0x0058
        L_0x00ea:
            r2 = 11
            if (r1 != r2) goto L_0x00fd
            int r1 = r22.mo45825a()
            if (r1 < r7) goto L_0x0114
            androidx.compose.ui.text.style.j r1 = r22.mo45837m()
            r4.mo45678A(r1)
            goto L_0x0058
        L_0x00fd:
            r2 = 12
            if (r1 != r2) goto L_0x0058
            int r1 = r22.mo45825a()
            r2 = 20
            if (r1 < r2) goto L_0x0114
            androidx.compose.ui.graphics.e4 r1 = r22.mo45834j()
            r4.mo45706z(r1)
            goto L_0x0058
        L_0x0112:
            r4 = r21
        L_0x0114:
            androidx.compose.ui.text.c0 r1 = r4.mo45680C()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C15924m0.mo45835k():androidx.compose.ui.text.c0");
    }

    /* renamed from: l */
    public final String mo45836l() {
        return this.f39613a.readString();
    }

    /* renamed from: m */
    public final C16434j mo45837m() {
        boolean z;
        boolean z2;
        int i = mo45833i();
        C16434j.C16435a aVar = C16434j.f40726b;
        if ((aVar.mo47681b().mo47675e() & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & aVar.mo47683f().mo47675e()) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return aVar.mo47680a(CollectionsKt__CollectionsKt.m40448L(aVar.mo47681b(), aVar.mo47683f()));
        } else if (z) {
            return aVar.mo47681b();
        } else {
            if (z2) {
                return aVar.mo47683f();
            }
            return aVar.mo47682d();
        }
    }

    /* renamed from: n */
    public final C16439m mo45838n() {
        return new C16439m(mo45829e(), mo45829e());
    }

    /* renamed from: o */
    public final long mo45839o() {
        long j;
        byte c = mo45827c();
        if (c == 1) {
            j = C16507v.f40911b.mo47909b();
        } else if (c == 2) {
            j = C16507v.f40911b.mo47908a();
        } else {
            j = C16507v.f40911b.mo47910c();
        }
        if (C16507v.m74732g(j, C16507v.f40911b.mo47910c())) {
            return C16504t.f40903b.mo47903b();
        }
        return C16506u.m74700a(mo45829e(), j);
    }

    /* renamed from: p */
    public final long mo45840p() {
        return C11588t1.m44970M(this.f39613a.readLong());
    }
}
