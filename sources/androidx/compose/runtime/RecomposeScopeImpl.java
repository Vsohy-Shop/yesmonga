package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8417b;
import androidx.compose.runtime.collection.C8418c;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n1#2:350\n1726#3,3:351\n159#4,4:354\n152#4,4:358\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n280#1:351,3\n298#1:354,4\n321#1:358,4\n*E\n"})
public final class RecomposeScopeImpl implements C8678t1, C8586m1 {

    /* renamed from: a */
    public int f22702a;
    @C12580l

    /* renamed from: b */
    public C8613s f22703b;
    @C12580l

    /* renamed from: c */
    public C8412c f22704c;
    @C12580l

    /* renamed from: d */
    public C11304p<? super C8592o, ? super Integer, C11079d2> f22705d;

    /* renamed from: e */
    public int f22706e;
    @C12580l

    /* renamed from: f */
    public C8417b f22707f;
    @C12580l

    /* renamed from: g */
    public C8418c<C8404a0<?>, Object> f22708g;

    public RecomposeScopeImpl(@C12580l C8613s sVar) {
        this.f22703b = sVar;
    }

    /* renamed from: A */
    public final void mo15194A(@C12580l C8412c cVar) {
        this.f22704c = cVar;
    }

    /* renamed from: B */
    public final void mo15195B(boolean z) {
        if (z) {
            this.f22702a |= 2;
        } else {
            this.f22702a &= -3;
        }
    }

    /* renamed from: C */
    public final void mo15196C(boolean z) {
        if (z) {
            this.f22702a |= 4;
        } else {
            this.f22702a &= -5;
        }
    }

    /* renamed from: D */
    public final void mo15197D(boolean z) {
        if (z) {
            this.f22702a |= 8;
        } else {
            this.f22702a &= -9;
        }
    }

    /* renamed from: E */
    public final void mo15198E(boolean z) {
        if (z) {
            this.f22702a |= 32;
        } else {
            this.f22702a &= -33;
        }
    }

    /* renamed from: F */
    public final void mo15199F(boolean z) {
        if (z) {
            this.f22702a |= 16;
        } else {
            this.f22702a &= -17;
        }
    }

    /* renamed from: G */
    public final void mo15200G(boolean z) {
        if (z) {
            this.f22702a |= 1;
        } else {
            this.f22702a &= -2;
        }
    }

    /* renamed from: H */
    public final void mo15201H(int i) {
        this.f22706e = i;
        mo15199F(false);
    }

    /* renamed from: a */
    public void mo15202a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        this.f22705d = pVar;
    }

    /* renamed from: g */
    public final void mo15203g(@C12579k C8613s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "composition");
        this.f22703b = sVar;
    }

    /* renamed from: h */
    public final void mo15204h(@C12579k C8592o oVar) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(oVar, "composer");
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar = this.f22705d;
        if (pVar != null) {
            pVar.invoke(oVar, 1);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @C12580l
    /* renamed from: i */
    public final C11300l<C8598p, C11079d2> mo15205i(int i) {
        boolean z;
        C8417b bVar = this.f22707f;
        if (bVar == null || mo15214q()) {
            return null;
        }
        int i2 = bVar.mo15350i();
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            Intrinsics.checkNotNull(bVar.mo15349g()[i3], "null cannot be cast to non-null type kotlin.Any");
            if (bVar.mo15351k()[i3] != i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            return new RecomposeScopeImpl$end$1$2(this, i, bVar);
        }
        return null;
    }

    public void invalidate() {
        C8613s sVar = this.f22703b;
        if (sVar != null) {
            sVar.mo16341M(this, (Object) null);
        }
    }

    @C12580l
    /* renamed from: j */
    public final C8412c mo15207j() {
        return this.f22704c;
    }

    /* renamed from: k */
    public final boolean mo15208k() {
        return this.f22705d != null;
    }

    @C12580l
    /* renamed from: l */
    public final C8613s mo15209l() {
        return this.f22703b;
    }

    /* renamed from: m */
    public final boolean mo15210m() {
        return (this.f22702a & 2) != 0;
    }

    /* renamed from: n */
    public final boolean mo15211n() {
        return (this.f22702a & 4) != 0;
    }

    /* renamed from: o */
    public final boolean mo15212o() {
        return (this.f22702a & 8) != 0;
    }

    /* renamed from: p */
    public final boolean mo15213p() {
        return (this.f22702a & 32) != 0;
    }

    /* renamed from: q */
    public final boolean mo15214q() {
        return (this.f22702a & 16) != 0;
    }

    /* renamed from: r */
    public final boolean mo15215r() {
        return (this.f22702a & 1) != 0;
    }

    /* renamed from: s */
    public final boolean mo15216s() {
        if (this.f22703b == null) {
            return false;
        }
        C8412c cVar = this.f22704c;
        return cVar != null ? cVar.mo15339b() : false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.mo16341M(r1, r2);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult mo15217t(@org.jetbrains.annotations.C12580l java.lang.Object r2) {
        /*
            r1 = this;
            androidx.compose.runtime.s r0 = r1.f22703b
            if (r0 == 0) goto L_0x000a
            androidx.compose.runtime.InvalidationResult r2 = r0.mo16341M(r1, r2)
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            androidx.compose.runtime.InvalidationResult r2 = androidx.compose.runtime.InvalidationResult.IGNORED
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.mo15217t(java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* renamed from: u */
    public final boolean mo15218u() {
        return this.f22708g != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15219v(@org.jetbrains.annotations.C12580l androidx.compose.runtime.collection.C8419d<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.compose.runtime.collection.c<androidx.compose.runtime.a0<?>, java.lang.Object> r1 = r6.f22708g
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            boolean r2 = r7.mo15375H()
            if (r2 == 0) goto L_0x004d
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0018
        L_0x0016:
            r7 = r0
            goto L_0x004a
        L_0x0018:
            java.util.Iterator r7 = r7.iterator()
        L_0x001c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0016
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof androidx.compose.runtime.C8404a0
            if (r4 == 0) goto L_0x0046
            androidx.compose.runtime.a0 r2 = (androidx.compose.runtime.C8404a0) r2
            androidx.compose.runtime.b2 r4 = r2.mo15114a()
            if (r4 != 0) goto L_0x0036
            androidx.compose.runtime.b2 r4 = androidx.compose.runtime.C8415c2.m30254w()
        L_0x0036:
            java.lang.Object r5 = r2.mo15115c()
            java.lang.Object r2 = r1.mo15362f(r2)
            boolean r2 = r4.mo15330c(r5, r2)
            if (r2 == 0) goto L_0x0046
            r2 = r0
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            if (r2 != 0) goto L_0x001c
            r7 = r3
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r3
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.mo15219v(androidx.compose.runtime.collection.d):boolean");
    }

    /* renamed from: w */
    public final void mo15220w(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "instance");
        if (!mo15213p()) {
            C8417b bVar = this.f22707f;
            if (bVar == null) {
                bVar = new C8417b();
                this.f22707f = bVar;
            }
            bVar.mo15343a(obj, this.f22706e);
            if (obj instanceof C8404a0) {
                C8418c<C8404a0<?>, Object> cVar = this.f22708g;
                if (cVar == null) {
                    cVar = new C8418c<>(0, 1, (DefaultConstructorMarker) null);
                    this.f22708g = cVar;
                }
                cVar.mo15371o(obj, ((C8404a0) obj).mo15115c());
            }
        }
    }

    /* renamed from: x */
    public final void mo15221x() {
        this.f22703b = null;
        this.f22707f = null;
        this.f22708g = null;
    }

    /* renamed from: y */
    public final void mo15222y() {
        C8417b bVar;
        C8613s sVar = this.f22703b;
        if (sVar != null && (bVar = this.f22707f) != null) {
            mo15198E(true);
            try {
                int i = bVar.mo15350i();
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = bVar.mo15349g()[i2];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i3 = bVar.mo15351k()[i2];
                    sVar.mo16364o(obj);
                }
            } finally {
                mo15198E(false);
            }
        }
    }

    /* renamed from: z */
    public final void mo15223z() {
        mo15199F(true);
    }
}
