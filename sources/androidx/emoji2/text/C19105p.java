package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.C0328d;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17821p0;
import androidx.core.util.C18001r;
import androidx.emoji2.text.flatbuffer.C19065o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@C0328d
@C0376v0(19)
/* renamed from: androidx.emoji2.text.p */
public final class C19105p {

    /* renamed from: e */
    public static final int f48613e = 1024;

    /* renamed from: f */
    public static final String f48614f = "EmojiCompat.MetadataRepo.create";
    @C0359n0

    /* renamed from: a */
    public final C19065o f48615a;
    @C0359n0

    /* renamed from: b */
    public final char[] f48616b;
    @C0359n0

    /* renamed from: c */
    public final C19106a f48617c = new C19106a(1024);
    @C0359n0

    /* renamed from: d */
    public final Typeface f48618d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.emoji2.text.p$a */
    public static class C19106a {

        /* renamed from: a */
        public final SparseArray<C19106a> f48619a;

        /* renamed from: b */
        public C19109r f48620b;

        public C19106a() {
            this(1);
        }

        /* renamed from: a */
        public C19106a mo56315a(int i) {
            SparseArray<C19106a> sparseArray = this.f48619a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: b */
        public final C19109r mo56316b() {
            return this.f48620b;
        }

        /* renamed from: c */
        public void mo56317c(@C0359n0 C19109r rVar, int i, int i2) {
            C19106a a = mo56315a(rVar.mo56353b(i));
            if (a == null) {
                a = new C19106a();
                this.f48619a.put(rVar.mo56353b(i), a);
            }
            if (i2 > i) {
                a.mo56317c(rVar, i + 1, i2);
            } else {
                a.f48620b = rVar;
            }
        }

        public C19106a(int i) {
            this.f48619a = new SparseArray<>(i);
        }
    }

    public C19105p(@C0359n0 Typeface typeface, @C0359n0 C19065o oVar) {
        this.f48618d = typeface;
        this.f48615a = oVar;
        this.f48616b = new char[(oVar.mo56218K() * 2)];
        mo56308a(oVar);
    }

    @C0359n0
    /* renamed from: b */
    public static C19105p m89417b(@C0359n0 AssetManager assetManager, @C0359n0 String str) throws IOException {
        try {
            C17821p0.m81248b(f48614f);
            return new C19105p(Typeface.createFromAsset(assetManager, str), C19100o.m89400b(assetManager, str));
        } finally {
            C17821p0.m81250d();
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: c */
    public static C19105p m89418c(@C0359n0 Typeface typeface) {
        try {
            C17821p0.m81248b(f48614f);
            return new C19105p(typeface, new C19065o());
        } finally {
            C17821p0.m81250d();
        }
    }

    @C0359n0
    /* renamed from: d */
    public static C19105p m89419d(@C0359n0 Typeface typeface, @C0359n0 InputStream inputStream) throws IOException {
        try {
            C17821p0.m81248b(f48614f);
            return new C19105p(typeface, C19100o.m89401c(inputStream));
        } finally {
            C17821p0.m81250d();
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C19105p m89420e(@C0359n0 Typeface typeface, @C0359n0 ByteBuffer byteBuffer) throws IOException {
        try {
            C17821p0.m81248b(f48614f);
            return new C19105p(typeface, C19100o.m89402d(byteBuffer));
        } finally {
            C17821p0.m81250d();
        }
    }

    /* renamed from: a */
    public final void mo56308a(C19065o oVar) {
        int K = oVar.mo56218K();
        for (int i = 0; i < K; i++) {
            C19109r rVar = new C19109r(this, i);
            Character.toChars(rVar.mo56358g(), this.f48616b, i * 2);
            mo56314k(rVar);
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public char[] mo56309f() {
        return this.f48616b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public C19065o mo56310g() {
        return this.f48615a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public int mo56311h() {
        return this.f48615a.mo56224S();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public C19106a mo56312i() {
        return this.f48617c;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: j */
    public Typeface mo56313j() {
        return this.f48618d;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: k */
    public void mo56314k(@C0359n0 C19109r rVar) {
        boolean z;
        C18001r.m81776m(rVar, "emoji metadata cannot be null");
        if (rVar.mo56354c() > 0) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81765b(z, "invalid metadata codepoint length");
        this.f48617c.mo56317c(rVar, 0, rVar.mo56354c() - 1);
    }
}
