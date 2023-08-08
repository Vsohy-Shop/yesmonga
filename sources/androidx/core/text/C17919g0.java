package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: androidx.core.text.g0 */
public final class C17919g0 {

    /* renamed from: a */
    public static final C17917f0 f46378a = new C17924e((C17922c) null, false);

    /* renamed from: b */
    public static final C17917f0 f46379b = new C17924e((C17922c) null, true);

    /* renamed from: c */
    public static final C17917f0 f46380c;

    /* renamed from: d */
    public static final C17917f0 f46381d;

    /* renamed from: e */
    public static final C17917f0 f46382e = new C17924e(C17920a.f46387b, false);

    /* renamed from: f */
    public static final C17917f0 f46383f = C17925f.f46392b;

    /* renamed from: g */
    public static final int f46384g = 0;

    /* renamed from: h */
    public static final int f46385h = 1;

    /* renamed from: i */
    public static final int f46386i = 2;

    /* renamed from: androidx.core.text.g0$a */
    public static class C17920a implements C17922c {

        /* renamed from: b */
        public static final C17920a f46387b = new C17920a(true);

        /* renamed from: a */
        public final boolean f46388a;

        public C17920a(boolean z) {
            this.f46388a = z;
        }

        /* renamed from: a */
        public int mo52363a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C17919g0.m81511a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f46388a) {
                        return 1;
                    }
                } else if (this.f46388a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f46388a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.g0$b */
    public static class C17921b implements C17922c {

        /* renamed from: a */
        public static final C17921b f46389a = new C17921b();

        /* renamed from: a */
        public int mo52363a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C17919g0.m81512b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.g0$c */
    public interface C17922c {
        /* renamed from: a */
        int mo52363a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.g0$d */
    public static abstract class C17923d implements C17917f0 {

        /* renamed from: a */
        public final C17922c f46390a;

        public C17923d(C17922c cVar) {
            this.f46390a = cVar;
        }

        /* renamed from: a */
        public boolean mo52361a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f46390a == null) {
                return mo52364c();
            } else {
                return mo52365d(charSequence, i, i2);
            }
        }

        /* renamed from: b */
        public boolean mo52362b(char[] cArr, int i, int i2) {
            return mo52361a(CharBuffer.wrap(cArr), i, i2);
        }

        /* renamed from: c */
        public abstract boolean mo52364c();

        /* renamed from: d */
        public final boolean mo52365d(CharSequence charSequence, int i, int i2) {
            int a = this.f46390a.mo52363a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo52364c();
            }
            return false;
        }
    }

    /* renamed from: androidx.core.text.g0$e */
    public static class C17924e extends C17923d {

        /* renamed from: b */
        public final boolean f46391b;

        public C17924e(C17922c cVar, boolean z) {
            super(cVar);
            this.f46391b = z;
        }

        /* renamed from: c */
        public boolean mo52364c() {
            return this.f46391b;
        }
    }

    /* renamed from: androidx.core.text.g0$f */
    public static class C17925f extends C17923d {

        /* renamed from: b */
        public static final C17925f f46392b = new C17925f();

        public C17925f() {
            super((C17922c) null);
        }

        /* renamed from: c */
        public boolean mo52364c() {
            return C17927h0.m81524b(Locale.getDefault()) == 1;
        }
    }

    static {
        C17921b bVar = C17921b.f46389a;
        f46380c = new C17924e(bVar, false);
        f46381d = new C17924e(bVar, true);
    }

    /* renamed from: a */
    public static int m81511a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m81512b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
