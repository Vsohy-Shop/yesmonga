package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0352k;
import androidx.annotation.C0359n0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.a */
public abstract class C20851a implements C20919r0 {

    /* renamed from: c */
    public static final Set<C20851a> f53916c = new HashSet();

    /* renamed from: a */
    public final String f53917a;

    /* renamed from: b */
    public final String f53918b;

    /* renamed from: androidx.webkit.internal.a$a */
    public static class C20852a {

        /* renamed from: a */
        public static final Set<String> f53919a = new HashSet(Arrays.asList(C20912p1.m96946d().mo62684a()));
    }

    /* renamed from: androidx.webkit.internal.a$b */
    public static class C20853b extends C20851a {
        public C20853b(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$c */
    public static class C20854c extends C20851a {
        public C20854c(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$d */
    public static class C20855d extends C20851a {
        public C20855d(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.a$e */
    public static class C20856e extends C20851a {
        public C20856e(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: androidx.webkit.internal.a$f */
    public static class C20857f extends C20851a {
        public C20857f(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: androidx.webkit.internal.a$g */
    public static class C20858g extends C20851a {
        public C20858g(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: androidx.webkit.internal.a$h */
    public static class C20859h extends C20851a {
        public C20859h(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: androidx.webkit.internal.a$i */
    public static class C20860i extends C20851a {
        public C20860i(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo62607c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public C20851a(@C0359n0 String str, @C0359n0 String str2) {
        this.f53917a = str;
        this.f53918b = str2;
        f53916c.add(this);
    }

    @C0344h1
    @C0359n0
    /* renamed from: b */
    public static Set<String> m96780b() {
        return C20852a.f53919a;
    }

    @C0359n0
    /* renamed from: e */
    public static Set<C20851a> m96781e() {
        return Collections.unmodifiableSet(f53916c);
    }

    @C0359n0
    /* renamed from: a */
    public String mo62606a() {
        return this.f53917a;
    }

    /* renamed from: c */
    public abstract boolean mo62607c();

    @C0352k(api = 21)
    /* renamed from: d */
    public boolean mo62608d() {
        return C12530a.m51110b(C20852a.f53919a, this.f53918b);
    }

    public boolean isSupported() {
        return mo62607c() || mo62608d();
    }
}
