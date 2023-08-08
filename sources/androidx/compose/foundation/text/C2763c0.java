package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.c0 */
public final class C2763c0 {

    /* renamed from: a */
    public final int f7266a;
    @C12580l

    /* renamed from: b */
    public C2764a f7267b;
    @C12580l

    /* renamed from: c */
    public C2764a f7268c;

    /* renamed from: d */
    public int f7269d;
    @C12580l

    /* renamed from: e */
    public Long f7270e;

    /* renamed from: f */
    public boolean f7271f;

    public C2763c0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ void m12557g(C2763c0 c0Var, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = C2768e0.m12572a();
        }
        c0Var.mo9507f(textFieldValue, j);
    }

    /* renamed from: a */
    public final void mo9502a() {
        this.f7271f = true;
    }

    /* renamed from: b */
    public final int mo9503b() {
        return this.f7266a;
    }

    /* renamed from: c */
    public final void mo9504c(@C12579k TextFieldValue textFieldValue) {
        TextFieldValue textFieldValue2;
        String str;
        TextFieldValue b;
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        this.f7271f = false;
        C2764a aVar = this.f7267b;
        if (aVar != null) {
            textFieldValue2 = aVar.mo9510b();
        } else {
            textFieldValue2 = null;
        }
        if (!Intrinsics.areEqual((Object) textFieldValue, (Object) textFieldValue2)) {
            String i = textFieldValue.mo47115i();
            C2764a aVar2 = this.f7267b;
            if (aVar2 == null || (b = aVar2.mo9510b()) == null) {
                str = null;
            } else {
                str = b.mo47115i();
            }
            if (Intrinsics.areEqual((Object) i, (Object) str)) {
                C2764a aVar3 = this.f7267b;
                if (aVar3 != null) {
                    aVar3.mo9512d(textFieldValue);
                    return;
                }
                return;
            }
            this.f7267b = new C2764a(this.f7267b, textFieldValue);
            this.f7268c = null;
            int length = this.f7269d + textFieldValue.mo47115i().length();
            this.f7269d = length;
            if (length > this.f7266a) {
                mo9506e();
            }
        }
    }

    @C12580l
    /* renamed from: d */
    public final TextFieldValue mo9505d() {
        C2764a aVar = this.f7268c;
        if (aVar == null) {
            return null;
        }
        this.f7268c = aVar.mo9509a();
        this.f7267b = new C2764a(this.f7267b, aVar.mo9510b());
        this.f7269d += aVar.mo9510b().mo47115i().length();
        return aVar.mo9510b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9506e() {
        /*
            r3 = this;
            androidx.compose.foundation.text.c0$a r0 = r3.f7267b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            androidx.compose.foundation.text.c0$a r2 = r0.mo9509a()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            androidx.compose.foundation.text.c0$a r2 = r0.mo9509a()
            if (r2 == 0) goto L_0x001b
            androidx.compose.foundation.text.c0$a r2 = r2.mo9509a()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            androidx.compose.foundation.text.c0$a r0 = r0.mo9509a()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.mo9511c(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C2763c0.mo9506e():void");
    }

    /* renamed from: f */
    public final void mo9507f(@C12579k TextFieldValue textFieldValue, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        if (!this.f7271f) {
            Long l = this.f7270e;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            if (j <= j2 + ((long) C2766d0.m12571a())) {
                return;
            }
        }
        this.f7270e = Long.valueOf(j);
        mo9504c(textFieldValue);
    }

    @C12580l
    /* renamed from: h */
    public final TextFieldValue mo9508h() {
        C2764a a;
        C2764a aVar = this.f7267b;
        if (aVar == null || (a = aVar.mo9509a()) == null) {
            return null;
        }
        this.f7267b = a;
        this.f7269d -= aVar.mo9510b().mo47115i().length();
        this.f7268c = new C2764a(this.f7268c, aVar.mo9510b());
        return a.mo9510b();
    }

    public C2763c0(int i) {
        this.f7266a = i;
    }

    /* renamed from: androidx.compose.foundation.text.c0$a */
    public static final class C2764a {
        @C12580l

        /* renamed from: a */
        public C2764a f7272a;
        @C12579k

        /* renamed from: b */
        public TextFieldValue f7273b;

        public C2764a(@C12580l C2764a aVar, @C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "value");
            this.f7272a = aVar;
            this.f7273b = textFieldValue;
        }

        @C12580l
        /* renamed from: a */
        public final C2764a mo9509a() {
            return this.f7272a;
        }

        @C12579k
        /* renamed from: b */
        public final TextFieldValue mo9510b() {
            return this.f7273b;
        }

        /* renamed from: c */
        public final void mo9511c(@C12580l C2764a aVar) {
            this.f7272a = aVar;
        }

        /* renamed from: d */
        public final void mo9512d(@C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
            this.f7273b = textFieldValue;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2764a(C2764a aVar, TextFieldValue textFieldValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : aVar, textFieldValue);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2763c0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}
