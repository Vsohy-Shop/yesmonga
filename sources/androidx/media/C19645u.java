package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.C19649v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.media.u */
public abstract class C19645u {

    /* renamed from: f */
    public static final int f50264f = 0;

    /* renamed from: g */
    public static final int f50265g = 1;

    /* renamed from: h */
    public static final int f50266h = 2;

    /* renamed from: a */
    public final int f50267a;

    /* renamed from: b */
    public final int f50268b;

    /* renamed from: c */
    public int f50269c;

    /* renamed from: d */
    public C19647b f50270d;

    /* renamed from: e */
    public Object f50271e;

    /* renamed from: androidx.media.u$a */
    public class C19646a implements C19649v.C19651b {
        public C19646a() {
        }

        /* renamed from: a */
        public void mo58019a(int i) {
            C19645u.this.mo58016f(i);
        }

        /* renamed from: b */
        public void mo58020b(int i) {
            C19645u.this.mo58015e(i);
        }
    }

    /* renamed from: androidx.media.u$b */
    public static abstract class C19647b {
        /* renamed from: a */
        public abstract void mo579a(C19645u uVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.u$c */
    public @interface C19648c {
    }

    public C19645u(int i, int i2, int i3) {
        this.f50267a = i;
        this.f50268b = i2;
        this.f50269c = i3;
    }

    /* renamed from: a */
    public final int mo58011a() {
        return this.f50269c;
    }

    /* renamed from: b */
    public final int mo58012b() {
        return this.f50268b;
    }

    /* renamed from: c */
    public final int mo58013c() {
        return this.f50267a;
    }

    /* renamed from: d */
    public Object mo58014d() {
        if (this.f50271e == null) {
            this.f50271e = C19649v.m91277a(this.f50267a, this.f50268b, this.f50269c, new C19646a());
        }
        return this.f50271e;
    }

    /* renamed from: e */
    public void mo58015e(int i) {
    }

    /* renamed from: f */
    public void mo58016f(int i) {
    }

    /* renamed from: g */
    public void mo58017g(C19647b bVar) {
        this.f50270d = bVar;
    }

    /* renamed from: h */
    public final void mo58018h(int i) {
        this.f50269c = i;
        Object d = mo58014d();
        if (d != null) {
            C19649v.m91278b(d, i);
        }
        C19647b bVar = this.f50270d;
        if (bVar != null) {
            bVar.mo579a(this);
        }
    }
}
