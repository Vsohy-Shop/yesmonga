package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.hardware.camera2.params.InputConfiguration;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.util.Objects;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.params.a */
public final class C1089a {

    /* renamed from: a */
    public final C1092c f3304a;

    @C0344h1
    /* renamed from: androidx.camera.camera2.internal.compat.params.a$b */
    public static final class C1091b implements C1092c {

        /* renamed from: a */
        public final int f3306a;

        /* renamed from: b */
        public final int f3307b;

        /* renamed from: c */
        public final int f3308c;

        public C1091b(int i, int i2, int i3) {
            this.f3306a = i;
            this.f3307b = i2;
            this.f3308c = i3;
        }

        /* renamed from: b */
        public Object mo4345b() {
            return null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1091b)) {
                return false;
            }
            C1091b bVar = (C1091b) obj;
            if (bVar.getWidth() == this.f3306a && bVar.getHeight() == this.f3307b && bVar.getFormat() == this.f3308c) {
                return true;
            }
            return false;
        }

        public int getFormat() {
            return this.f3308c;
        }

        public int getHeight() {
            return this.f3307b;
        }

        public int getWidth() {
            return this.f3306a;
        }

        public int hashCode() {
            int i = 31 ^ this.f3306a;
            int i2 = this.f3307b ^ ((i << 5) - i);
            return this.f3308c ^ ((i2 << 5) - i2);
        }

        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", new Object[]{Integer.valueOf(this.f3306a), Integer.valueOf(this.f3307b), Integer.valueOf(this.f3308c)});
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.a$c */
    public interface C1092c {
        @C0363p0
        /* renamed from: b */
        Object mo4345b();

        int getFormat();

        int getHeight();

        int getWidth();
    }

    public C1089a(int i, int i2, int i3) {
        this.f3304a = new C1090a(i, i2, i3);
    }

    @C0363p0
    /* renamed from: e */
    public static C1089a m4681e(@C0363p0 Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1089a(new C1090a(obj));
    }

    /* renamed from: a */
    public int mo4338a() {
        return this.f3304a.getFormat();
    }

    /* renamed from: b */
    public int mo4339b() {
        return this.f3304a.getHeight();
    }

    /* renamed from: c */
    public int mo4340c() {
        return this.f3304a.getWidth();
    }

    @C0363p0
    /* renamed from: d */
    public Object mo4341d() {
        return this.f3304a.mo4345b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1089a)) {
            return false;
        }
        return this.f3304a.equals(((C1089a) obj).f3304a);
    }

    public int hashCode() {
        return this.f3304a.hashCode();
    }

    public String toString() {
        return this.f3304a.toString();
    }

    @C0376v0(23)
    /* renamed from: androidx.camera.camera2.internal.compat.params.a$a */
    public static final class C1090a implements C1092c {

        /* renamed from: a */
        public final InputConfiguration f3305a;

        public C1090a(@C0359n0 Object obj) {
            this.f3305a = (InputConfiguration) obj;
        }

        @C0363p0
        /* renamed from: b */
        public Object mo4345b() {
            return this.f3305a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1092c)) {
                return false;
            }
            return Objects.equals(this.f3305a, ((C1092c) obj).mo4345b());
        }

        public int getFormat() {
            return this.f3305a.getFormat();
        }

        public int getHeight() {
            return this.f3305a.getHeight();
        }

        public int getWidth() {
            return this.f3305a.getWidth();
        }

        public int hashCode() {
            return this.f3305a.hashCode();
        }

        public String toString() {
            return this.f3305a.toString();
        }

        public C1090a(int i, int i2, int i3) {
            this(new InputConfiguration(i, i2, i3));
        }
    }

    public C1089a(@C0359n0 C1092c cVar) {
        this.f3304a = cVar;
    }
}
