package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14681rb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12412q;

/* renamed from: com.contentsquare.android.sdk.le */
public final class C14507le {

    /* renamed from: w */
    public static C14681rb<C14507le> f35871w = new C14681rb<>();

    /* renamed from: x */
    public static final C14681rb.C14682a<C14507le> f35872x = C14508a.f35896a;

    /* renamed from: y */
    public static final C14509b f35873y = new C14509b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public long f35874a;

    /* renamed from: b */
    public int f35875b;

    /* renamed from: c */
    public int f35876c;

    /* renamed from: d */
    public int f35877d;

    /* renamed from: e */
    public int f35878e;

    /* renamed from: f */
    public float f35879f;

    /* renamed from: g */
    public int f35880g;

    /* renamed from: h */
    public C14464k3 f35881h;

    /* renamed from: i */
    public byte[] f35882i;

    /* renamed from: j */
    public boolean f35883j;

    /* renamed from: k */
    public float f35884k;

    /* renamed from: l */
    public boolean f35885l;

    /* renamed from: m */
    public final List<C14507le> f35886m = new ArrayList();

    /* renamed from: n */
    public boolean f35887n;

    /* renamed from: o */
    public boolean f35888o;

    /* renamed from: p */
    public CharSequence f35889p;

    /* renamed from: q */
    public CharSequence f35890q;

    /* renamed from: r */
    public CharSequence f35891r;

    /* renamed from: s */
    public String f35892s;

    /* renamed from: t */
    public long f35893t;

    /* renamed from: u */
    public int f35894u;

    /* renamed from: v */
    public float f35895v;

    /* renamed from: com.contentsquare.android.sdk.le$a */
    public static final class C14508a<T> implements C14681rb.C14682a {

        /* renamed from: a */
        public static final C14508a f35896a = new C14508a();

        /* renamed from: b */
        public final C14507le mo35875a() {
            return new C14507le();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.le$b */
    public static final class C14509b {
        public C14509b() {
        }

        /* renamed from: a */
        public final C14681rb<C14507le> mo35877a() {
            return C14507le.f35871w;
        }

        /* renamed from: c */
        public final void mo35878c(C14507le leVar) {
            Intrinsics.checkNotNullParameter(leVar, "viewLight");
            List<C14507le> x = leVar.mo35872x();
            int size = x.size();
            for (int i = 0; i < size; i++) {
                mo35878c(x.get(i));
            }
            mo35877a().mo36347b(leVar);
        }

        /* renamed from: d */
        public final void mo35879d(StringBuilder sb, C14507le leVar, String str, String str2) {
            sb.append(str);
            sb.append("id=");
            sb.append(leVar.mo35837H());
            sb.append(" pos=");
            sb.append(leVar.mo35835F());
            sb.append(',');
            sb.append(leVar.mo35836G());
            sb.append(';');
            sb.append(leVar.mo35842M());
            sb.append(',');
            sb.append(leVar.mo35832C());
            sb.append(10);
            List<C14507le> x = leVar.mo35872x();
            int size = x.size();
            int i = 0;
            while (i < size) {
                mo35879d(sb, x.get(i), str2 + "├── ", str2 + (i != leVar.mo35872x().size() + -1 ? "│   " : C12412q.f30348a));
                i++;
            }
        }

        /* renamed from: e */
        public final boolean mo35880e(C14507le leVar, C14507le leVar2) {
            Intrinsics.checkNotNullParameter(leVar, "previousViewLight");
            Intrinsics.checkNotNullParameter(leVar2, "currentViewLight");
            return (!leVar2.mo35843N() && leVar.mo35863p() == leVar2.mo35863p() && leVar.mo35869u() == leVar2.mo35869u()) ? false : true;
        }

        /* renamed from: f */
        public final C14507le mo35881f() {
            C14507le a = mo35877a().mo36346a(C14507le.f35872x);
            Intrinsics.checkNotNullExpressionValue(a, "recycler.obtain(OBTAIN_VIEW_LIGHT)");
            C14507le leVar = a;
            leVar.mo35847R();
            return leVar;
        }

        public /* synthetic */ C14509b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: A */
    public final void mo35830A(int i) {
        this.f35875b = i;
    }

    /* renamed from: B */
    public final byte[] mo35831B() {
        return this.f35882i;
    }

    /* renamed from: C */
    public final int mo35832C() {
        return this.f35876c;
    }

    /* renamed from: D */
    public final int mo35833D() {
        return this.f35894u;
    }

    /* renamed from: E */
    public final long mo35834E() {
        return this.f35893t;
    }

    /* renamed from: F */
    public final int mo35835F() {
        return this.f35877d;
    }

    /* renamed from: G */
    public final int mo35836G() {
        return this.f35878e;
    }

    /* renamed from: H */
    public final long mo35837H() {
        return this.f35874a;
    }

    /* renamed from: I */
    public final CharSequence mo35838I() {
        return this.f35889p;
    }

    /* renamed from: J */
    public final float mo35839J() {
        return this.f35884k;
    }

    /* renamed from: K */
    public final C14464k3 mo35840K() {
        return this.f35881h;
    }

    /* renamed from: L */
    public final float mo35841L() {
        return this.f35895v;
    }

    /* renamed from: M */
    public final int mo35842M() {
        return this.f35875b;
    }

    /* renamed from: N */
    public final boolean mo35843N() {
        return this.f35883j;
    }

    /* renamed from: O */
    public final boolean mo35844O() {
        return this.f35887n;
    }

    /* renamed from: P */
    public final boolean mo35845P() {
        return this.f35888o;
    }

    /* renamed from: Q */
    public final boolean mo35846Q() {
        return this.f35885l;
    }

    /* renamed from: R */
    public final void mo35847R() {
        this.f35874a = 0;
        this.f35875b = 0;
        this.f35876c = 0;
        this.f35877d = 0;
        this.f35878e = 0;
        this.f35879f = 0.0f;
        this.f35880g = 0;
        this.f35884k = 0.0f;
        this.f35885l = false;
        this.f35887n = true;
        this.f35881h = null;
        this.f35882i = null;
        this.f35889p = null;
        this.f35890q = null;
        this.f35891r = null;
        this.f35892s = null;
        this.f35893t = -1;
        this.f35894u = -1;
        this.f35886m.clear();
        this.f35888o = true;
        this.f35883j = false;
        this.f35895v = 1.0f;
    }

    /* renamed from: S */
    public final C14348fg mo35848S() {
        return C14689rf.f36358a.mo36358a(this);
    }

    /* renamed from: T */
    public final C14833wb mo35849T() {
        return C14689rf.f36358a.mo36360c(this);
    }

    /* renamed from: b */
    public final void mo35850b(float f) {
        this.f35879f = f;
    }

    /* renamed from: c */
    public final void mo35851c(int i) {
        this.f35880g = i;
    }

    /* renamed from: d */
    public final void mo35852d(long j) {
        this.f35893t = j;
    }

    /* renamed from: e */
    public final void mo35853e(C14464k3 k3Var) {
        this.f35881h = k3Var;
    }

    /* renamed from: f */
    public final void mo35854f(CharSequence charSequence) {
        this.f35890q = charSequence;
    }

    /* renamed from: g */
    public final void mo35855g(String str) {
        this.f35892s = str;
    }

    /* renamed from: h */
    public final void mo35856h(boolean z) {
        this.f35883j = z;
    }

    /* renamed from: i */
    public final void mo35857i(byte[] bArr) {
        this.f35882i = bArr;
    }

    /* renamed from: k */
    public final void mo35858k(float f) {
        this.f35884k = f;
    }

    /* renamed from: l */
    public final void mo35859l(int i) {
        this.f35876c = i;
    }

    /* renamed from: m */
    public final void mo35860m(long j) {
        this.f35874a = j;
    }

    /* renamed from: n */
    public final void mo35861n(CharSequence charSequence) {
        this.f35891r = charSequence;
    }

    /* renamed from: o */
    public final void mo35862o(boolean z) {
        this.f35887n = z;
    }

    /* renamed from: p */
    public final long mo35863p() {
        long j = (long) 31;
        long floatToIntBits = ((((((((((((((((long) this.f35875b) * j) + ((long) this.f35876c)) * j) + ((long) this.f35877d)) * j) + ((long) this.f35878e)) * j) + (this.f35885l ? 1 : 0)) * j) + ((long) Float.floatToIntBits(this.f35884k))) * j) + (this.f35887n ? 1 : 0)) * j) + (this.f35888o ? 1 : 0)) * j;
        CharSequence charSequence = this.f35889p;
        int i = 0;
        long hashCode = (floatToIntBits + ((long) (charSequence != null ? charSequence.hashCode() : 0))) * j;
        String str = this.f35892s;
        long hashCode2 = (hashCode + ((long) (str != null ? str.hashCode() : 0))) * j;
        CharSequence charSequence2 = this.f35890q;
        long hashCode3 = j * (hashCode2 + ((long) (charSequence2 != null ? charSequence2.hashCode() : 0)));
        CharSequence charSequence3 = this.f35891r;
        if (charSequence3 != null) {
            i = charSequence3.hashCode();
        }
        return hashCode3 + ((long) i);
    }

    /* renamed from: q */
    public final void mo35864q(float f) {
        this.f35895v = f;
    }

    /* renamed from: r */
    public final void mo35865r(int i) {
        this.f35894u = i;
    }

    /* renamed from: s */
    public final void mo35866s(CharSequence charSequence) {
        this.f35889p = charSequence;
    }

    /* renamed from: t */
    public final void mo35867t(boolean z) {
        this.f35888o = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(300);
        f35873y.mo35879d(sb, this, "", "");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "treeStr.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final int mo35869u() {
        return this.f35880g;
    }

    /* renamed from: v */
    public final void mo35870v(int i) {
        this.f35877d = i;
    }

    /* renamed from: w */
    public final void mo35871w(boolean z) {
        this.f35885l = z;
    }

    /* renamed from: x */
    public final List<C14507le> mo35872x() {
        return this.f35886m;
    }

    /* renamed from: y */
    public final void mo35873y(int i) {
        this.f35878e = i;
    }

    /* renamed from: z */
    public final float mo35874z() {
        return this.f35879f;
    }
}
