package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2851y;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16280c;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16293h;
import androidx.compose.p004ui.text.input.C16315q0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n74#2,5:433\n80#2:439\n74#2,7:440\n1#3:438\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n408#1:433,5\n408#1:439\n412#1:440,7\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.p */
public final class C2840p extends C2820a<C2840p> {
    @C12579k

    /* renamed from: j */
    public final TextFieldValue f7466j;
    @C12580l

    /* renamed from: k */
    public final C2851y f7467k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2840p(TextFieldValue textFieldValue, C16281c0 c0Var, C2851y yVar, C2843s sVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i & 2) != 0 ? C16281c0.f40467a.mo47176a() : c0Var, yVar, (i & 8) != 0 ? new C2843s() : sVar);
    }

    @C12580l
    /* renamed from: h0 */
    public final List<C16293h> mo9896h0(@C12579k C11300l<? super C2840p, ? extends C16293h> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "or");
        if (C16356n0.m73736h(mo9788B())) {
            C16293h hVar = (C16293h) lVar.invoke(this);
            if (hVar != null) {
                return C10976s.m41419k(hVar);
            }
            return null;
        }
        return CollectionsKt__CollectionsKt.m40448L(new C16280c("", 0), new C16315q0(C16356n0.m73740l(mo9788B()), C16356n0.m73740l(mo9788B())));
    }

    @C12579k
    /* renamed from: i0 */
    public final TextFieldValue mo9897i0() {
        return this.f7466j;
    }

    @C12580l
    /* renamed from: j0 */
    public final C2851y mo9898j0() {
        return this.f7467k;
    }

    @C12579k
    /* renamed from: k0 */
    public final TextFieldValue mo9899k0() {
        return TextFieldValue.m73307d(this.f7466j, mo9824g(), mo9788B(), (C16356n0) null, 4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9900l0(androidx.compose.foundation.text.C2851y r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.o r0 = r6.mo9926c()
            if (r0 == 0) goto L_0x0015
            androidx.compose.ui.layout.o r1 = r6.mo9925b()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.i r2 = androidx.compose.p004ui.layout.C15588o.m69281C(r1, r0, r3, r4, r2)
        L_0x0013:
            if (r2 != 0) goto L_0x001b
        L_0x0015:
            androidx.compose.ui.geometry.i$a r0 = androidx.compose.p004ui.geometry.C15098i.f37261e
            androidx.compose.ui.geometry.i r2 = r0.mo42285a()
        L_0x001b:
            androidx.compose.ui.text.input.c0 r0 = r5.mo9834s()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.f7466j
            long r3 = r1.mo47113h()
            int r1 = androidx.compose.p004ui.text.C16356n0.m73737i(r3)
            int r0 = r0.mo9514b(r1)
            androidx.compose.ui.text.h0 r1 = r6.mo9930i()
            androidx.compose.ui.geometry.i r0 = r1.mo47049e(r0)
            float r1 = r0.mo42279t()
            float r0 = r0.mo42249B()
            long r2 = r2.mo42284z()
            float r2 = androidx.compose.p004ui.geometry.C15104m.m65016m(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            androidx.compose.ui.text.input.c0 r7 = r5.mo9834s()
            androidx.compose.ui.text.h0 r6 = r6.mo9930i()
            long r0 = androidx.compose.p004ui.geometry.C15096g.m64898a(r1, r0)
            int r6 = r6.mo47070x(r0)
            int r6 = r7.mo9513a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C2840p.mo9900l0(androidx.compose.foundation.text.y, int):int");
    }

    @C12579k
    /* renamed from: m0 */
    public final C2840p mo9901m0() {
        boolean z;
        C2851y yVar;
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (yVar = this.f7467k) != null) {
            mo9815b0(mo9900l0(yVar, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @C12579k
    /* renamed from: n0 */
    public final C2840p mo9902n0() {
        boolean z;
        C2851y yVar;
        if (mo9790D().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (yVar = this.f7467k) != null) {
            mo9815b0(mo9900l0(yVar, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2840p(@C12579k TextFieldValue textFieldValue, @C12579k C16281c0 c0Var, @C12580l C2851y yVar, @C12579k C2843s sVar) {
        super(textFieldValue.mo47111f(), textFieldValue.mo47113h(), yVar != null ? yVar.mo9930i() : null, c0Var, sVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(textFieldValue, "currentValue");
        Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
        Intrinsics.checkNotNullParameter(sVar, "state");
        this.f7466j = textFieldValue;
        this.f7467k = yVar;
    }
}
