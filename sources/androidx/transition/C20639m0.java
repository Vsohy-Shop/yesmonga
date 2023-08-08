package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.transition.C20606h0;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.m0 */
public class C20639m0 extends C20606h0 {

    /* renamed from: p1 */
    public static final int f53230p1 = 1;

    /* renamed from: q1 */
    public static final int f53231q1 = 2;

    /* renamed from: r1 */
    public static final int f53232r1 = 4;

    /* renamed from: s1 */
    public static final int f53233s1 = 8;

    /* renamed from: t1 */
    public static final int f53234t1 = 0;

    /* renamed from: u1 */
    public static final int f53235u1 = 1;

    /* renamed from: k1 */
    public ArrayList<C20606h0> f53236k1 = new ArrayList<>();

    /* renamed from: l1 */
    public boolean f53237l1 = true;

    /* renamed from: m1 */
    public int f53238m1;

    /* renamed from: n1 */
    public boolean f53239n1 = false;

    /* renamed from: o1 */
    public int f53240o1 = 0;

    /* renamed from: androidx.transition.m0$a */
    public class C20640a extends C20626j0 {

        /* renamed from: a */
        public final /* synthetic */ C20606h0 f53241a;

        public C20640a(C20606h0 h0Var) {
            this.f53241a = h0Var;
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            this.f53241a.mo61713I0();
            h0Var.mo61767z0(this);
        }
    }

    /* renamed from: androidx.transition.m0$b */
    public static class C20641b extends C20626j0 {

        /* renamed from: a */
        public C20639m0 f53243a;

        public C20641b(C20639m0 m0Var) {
            this.f53243a = m0Var;
        }

        /* renamed from: b */
        public void mo61772b(@C0359n0 C20606h0 h0Var) {
            C20639m0 m0Var = this.f53243a;
            if (!m0Var.f53239n1) {
                m0Var.mo61731T0();
                this.f53243a.f53239n1 = true;
            }
        }

        /* renamed from: d */
        public void mo61667d(@C0359n0 C20606h0 h0Var) {
            C20639m0 m0Var = this.f53243a;
            int i = m0Var.f53238m1 - 1;
            m0Var.f53238m1 = i;
            if (i == 0) {
                m0Var.f53239n1 = false;
                m0Var.mo61700B();
            }
            h0Var.mo61767z0(this);
        }
    }

    public C20639m0() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: A */
    public void mo61699A(ViewGroup viewGroup, C20664q0 q0Var, C20664q0 q0Var2, ArrayList<C20657p0> arrayList, ArrayList<C20657p0> arrayList2) {
        long b0 = mo61738b0();
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            C20606h0 h0Var = this.f53236k1.get(i);
            if (b0 > 0 && (this.f53237l1 || i == 0)) {
                long b02 = h0Var.mo61738b0();
                if (b02 > 0) {
                    h0Var.mo61729S0(b02 + b0);
                } else {
                    h0Var.mo61729S0(b0);
                }
            }
            h0Var.mo61699A(viewGroup, q0Var, q0Var2, arrayList, arrayList2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: G0 */
    public void mo61709G0(View view) {
        super.mo61709G0(view);
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61709G0(view);
        }
    }

    @C0359n0
    /* renamed from: H */
    public C20606h0 mo61710H(int i, boolean z) {
        for (int i2 = 0; i2 < this.f53236k1.size(); i2++) {
            this.f53236k1.get(i2).mo61710H(i, z);
        }
        return super.mo61710H(i, z);
    }

    @C0359n0
    /* renamed from: I */
    public C20606h0 mo61712I(@C0359n0 View view, boolean z) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61712I(view, z);
        }
        return super.mo61712I(view, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: I0 */
    public void mo61713I0() {
        if (this.f53236k1.isEmpty()) {
            mo61731T0();
            mo61700B();
            return;
        }
        mo61850r1();
        if (!this.f53237l1) {
            for (int i = 1; i < this.f53236k1.size(); i++) {
                this.f53236k1.get(i - 1).mo61737b(new C20640a(this.f53236k1.get(i)));
            }
            C20606h0 h0Var = this.f53236k1.get(0);
            if (h0Var != null) {
                h0Var.mo61713I0();
                return;
            }
            return;
        }
        Iterator<C20606h0> it = this.f53236k1.iterator();
        while (it.hasNext()) {
            it.next().mo61713I0();
        }
    }

    @C0359n0
    /* renamed from: J */
    public C20606h0 mo61714J(@C0359n0 Class<?> cls, boolean z) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61714J(cls, z);
        }
        return super.mo61714J(cls, z);
    }

    /* renamed from: J0 */
    public void mo61715J0(boolean z) {
        super.mo61715J0(z);
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61715J0(z);
        }
    }

    @C0359n0
    /* renamed from: K */
    public C20606h0 mo61716K(@C0359n0 String str, boolean z) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61716K(str, z);
        }
        return super.mo61716K(str, z);
    }

    /* renamed from: M0 */
    public void mo61719M0(C20606h0.C20612f fVar) {
        super.mo61719M0(fVar);
        this.f53240o1 |= 8;
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61719M0(fVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: O */
    public void mo61721O(ViewGroup viewGroup) {
        super.mo61721O(viewGroup);
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61721O(viewGroup);
        }
    }

    /* renamed from: Q0 */
    public void mo61725Q0(C20684x xVar) {
        super.mo61725Q0(xVar);
        this.f53240o1 |= 4;
        if (this.f53236k1 != null) {
            for (int i = 0; i < this.f53236k1.size(); i++) {
                this.f53236k1.get(i).mo61725Q0(xVar);
            }
        }
    }

    /* renamed from: R0 */
    public void mo61727R0(C20636l0 l0Var) {
        super.mo61727R0(l0Var);
        this.f53240o1 |= 2;
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61727R0(l0Var);
        }
    }

    /* renamed from: U0 */
    public String mo61733U0(String str) {
        String U0 = super.mo61733U0(str);
        for (int i = 0; i < this.f53236k1.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(U0);
            sb.append("\n");
            sb.append(this.f53236k1.get(i).mo61733U0(str + GlideException.C22148a.f56917d));
            U0 = sb.toString();
        }
        return U0;
    }

    @C0359n0
    /* renamed from: V0 */
    public C20639m0 mo61737b(@C0359n0 C20606h0.C20614h hVar) {
        return (C20639m0) super.mo61737b(hVar);
    }

    @C0359n0
    /* renamed from: W0 */
    public C20639m0 mo61739c(@C0329d0 int i) {
        for (int i2 = 0; i2 < this.f53236k1.size(); i2++) {
            this.f53236k1.get(i2).mo61739c(i);
        }
        return (C20639m0) super.mo61739c(i);
    }

    @C0359n0
    /* renamed from: X0 */
    public C20639m0 mo61744e(@C0359n0 View view) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61744e(view);
        }
        return (C20639m0) super.mo61744e(view);
    }

    @C0359n0
    /* renamed from: Y0 */
    public C20639m0 mo61745f(@C0359n0 Class<?> cls) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61745f(cls);
        }
        return (C20639m0) super.mo61745f(cls);
    }

    @C0359n0
    /* renamed from: Z0 */
    public C20639m0 mo61747h(@C0359n0 String str) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61747h(str);
        }
        return (C20639m0) super.mo61747h(str);
    }

    @C0359n0
    /* renamed from: a1 */
    public C20639m0 mo61835a1(@C0359n0 C20606h0 h0Var) {
        mo61836b1(h0Var);
        long j = this.f53145c;
        if (j >= 0) {
            h0Var.mo61718L0(j);
        }
        if ((this.f53240o1 & 1) != 0) {
            h0Var.mo61722O0(mo61730T());
        }
        if ((this.f53240o1 & 2) != 0) {
            h0Var.mo61727R0(mo61736Z());
        }
        if ((this.f53240o1 & 4) != 0) {
            h0Var.mo61725Q0(mo61735Y());
        }
        if ((this.f53240o1 & 8) != 0) {
            h0Var.mo61719M0(mo61728S());
        }
        return this;
    }

    /* renamed from: b1 */
    public final void mo61836b1(@C0359n0 C20606h0 h0Var) {
        this.f53236k1.add(h0Var);
        h0Var.f53125G0 = this;
    }

    /* renamed from: c1 */
    public int mo61837c1() {
        return this.f53237l1 ^ true ? 1 : 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).cancel();
        }
    }

    @C0363p0
    /* renamed from: d1 */
    public C20606h0 mo61838d1(int i) {
        if (i < 0 || i >= this.f53236k1.size()) {
            return null;
        }
        return this.f53236k1.get(i);
    }

    /* renamed from: e1 */
    public int mo61839e1() {
        return this.f53236k1.size();
    }

    @C0359n0
    /* renamed from: f1 */
    public C20639m0 mo61767z0(@C0359n0 C20606h0.C20614h hVar) {
        return (C20639m0) super.mo61767z0(hVar);
    }

    @C0359n0
    /* renamed from: g1 */
    public C20639m0 mo61701B0(@C0329d0 int i) {
        for (int i2 = 0; i2 < this.f53236k1.size(); i2++) {
            this.f53236k1.get(i2).mo61701B0(i);
        }
        return (C20639m0) super.mo61701B0(i);
    }

    @C0359n0
    /* renamed from: h1 */
    public C20639m0 mo61704D0(@C0359n0 View view) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61704D0(view);
        }
        return (C20639m0) super.mo61704D0(view);
    }

    @C0359n0
    /* renamed from: i1 */
    public C20639m0 mo61706E0(@C0359n0 Class<?> cls) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61706E0(cls);
        }
        return (C20639m0) super.mo61706E0(cls);
    }

    @C0359n0
    /* renamed from: l1 */
    public C20639m0 mo61708F0(@C0359n0 String str) {
        for (int i = 0; i < this.f53236k1.size(); i++) {
            this.f53236k1.get(i).mo61708F0(str);
        }
        return (C20639m0) super.mo61708F0(str);
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        if (mo61753m0(p0Var.f53280b)) {
            Iterator<C20606h0> it = this.f53236k1.iterator();
            while (it.hasNext()) {
                C20606h0 next = it.next();
                if (next.mo61753m0(p0Var.f53280b)) {
                    next.mo61635m(p0Var);
                    p0Var.f53281c.add(next);
                }
            }
        }
    }

    @C0359n0
    /* renamed from: m1 */
    public C20639m0 mo61845m1(@C0359n0 C20606h0 h0Var) {
        this.f53236k1.remove(h0Var);
        h0Var.f53125G0 = null;
        return this;
    }

    @C0359n0
    /* renamed from: n1 */
    public C20639m0 mo61718L0(long j) {
        ArrayList<C20606h0> arrayList;
        super.mo61718L0(j);
        if (this.f53145c >= 0 && (arrayList = this.f53236k1) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f53236k1.get(i).mo61718L0(j);
            }
        }
        return this;
    }

    /* renamed from: o */
    public void mo61755o(C20657p0 p0Var) {
        super.mo61755o(p0Var);
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61755o(p0Var);
        }
    }

    @C0359n0
    /* renamed from: o1 */
    public C20639m0 mo61722O0(@C0363p0 TimeInterpolator timeInterpolator) {
        this.f53240o1 |= 1;
        ArrayList<C20606h0> arrayList = this.f53236k1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f53236k1.get(i).mo61722O0(timeInterpolator);
            }
        }
        return (C20639m0) super.mo61722O0(timeInterpolator);
    }

    @C0359n0
    /* renamed from: p1 */
    public C20639m0 mo61848p1(int i) {
        if (i == 0) {
            this.f53237l1 = true;
        } else if (i == 1) {
            this.f53237l1 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @C0359n0
    /* renamed from: q1 */
    public C20639m0 mo61729S0(long j) {
        return (C20639m0) super.mo61729S0(j);
    }

    /* renamed from: r1 */
    public final void mo61850r1() {
        C20641b bVar = new C20641b(this);
        Iterator<C20606h0> it = this.f53236k1.iterator();
        while (it.hasNext()) {
            it.next().mo61737b(bVar);
        }
        this.f53238m1 = this.f53236k1.size();
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        if (mo61753m0(p0Var.f53280b)) {
            Iterator<C20606h0> it = this.f53236k1.iterator();
            while (it.hasNext()) {
                C20606h0 next = it.next();
                if (next.mo61753m0(p0Var.f53280b)) {
                    next.mo61636s(p0Var);
                    p0Var.f53281c.add(next);
                }
            }
        }
    }

    /* renamed from: v */
    public C20606h0 clone() {
        C20639m0 m0Var = (C20639m0) super.clone();
        m0Var.f53236k1 = new ArrayList<>();
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            m0Var.mo61836b1(this.f53236k1.get(i).clone());
        }
        return m0Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: x0 */
    public void mo61765x0(View view) {
        super.mo61765x0(view);
        int size = this.f53236k1.size();
        for (int i = 0; i < size; i++) {
            this.f53236k1.get(i).mo61765x0(view);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public C20639m0(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53078i);
        mo61848p1(C17483q.m80235k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
