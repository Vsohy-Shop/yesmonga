package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: androidx.customview.widget.b */
public class C18548b {

    /* renamed from: androidx.customview.widget.b$a */
    public interface C18549a<T> {
        /* renamed from: a */
        void mo53464a(T t, Rect rect);
    }

    /* renamed from: androidx.customview.widget.b$b */
    public interface C18550b<T, V> {
        /* renamed from: a */
        V mo53466a(T t, int i);

        /* renamed from: b */
        int mo53467b(T t);
    }

    /* renamed from: androidx.customview.widget.b$c */
    public static class C18551c<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f47336a = new Rect();

        /* renamed from: b */
        public final Rect f47337b = new Rect();

        /* renamed from: c */
        public final boolean f47338c;

        /* renamed from: d */
        public final C18549a<T> f47339d;

        public C18551c(boolean z, C18549a<T> aVar) {
            this.f47338c = z;
            this.f47339d = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f47336a;
            Rect rect2 = this.f47337b;
            this.f47339d.mo53464a(t, rect);
            this.f47339d.mo53464a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f47338c) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f47338c) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f47338c) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f47338c) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: a */
    public static boolean m83907a(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2, @C0359n0 Rect rect3) {
        boolean b = m83908b(i, rect, rect2);
        if (m83908b(i, rect, rect3) || !b) {
            return false;
        }
        if (!m83916j(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (m83917k(i, rect, rect2) < m83919m(i, rect, rect3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m83908b(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static <L, T> T m83909c(@C0359n0 L l, @C0359n0 C18550b<L, T> bVar, @C0359n0 C18549a<T> aVar, @C0363p0 T t, @C0359n0 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int b = bVar.mo53467b(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < b; i2++) {
            T a = bVar.mo53466a(l, i2);
            if (a != t) {
                aVar.mo53464a(a, rect3);
                if (m83914h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m83910d(@C0359n0 L l, @C0359n0 C18550b<L, T> bVar, @C0359n0 C18549a<T> aVar, @C0363p0 T t, int i, boolean z, boolean z2) {
        int b = bVar.mo53467b(l);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo53466a(l, i2));
        }
        Collections.sort(arrayList, new C18551c(z, aVar));
        if (i == 1) {
            return m83912f(t, arrayList, z2);
        }
        if (i == 2) {
            return m83911e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static <T> T m83911e(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static <T> T m83912f(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m83913g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m83914h(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2, @C0359n0 Rect rect3) {
        if (!m83915i(rect, rect2, i)) {
            return false;
        }
        if (!m83915i(rect, rect3, i) || m83907a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m83907a(i, rect, rect3, rect2) && m83913g(m83917k(i, rect, rect2), m83921o(i, rect, rect2)) < m83913g(m83917k(i, rect, rect3), m83921o(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m83915i(@C0359n0 Rect rect, @C0359n0 Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    public static boolean m83916j(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public static int m83917k(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        return Math.max(0, m83918l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m83918l(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m83919m(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        return Math.max(1, m83920n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m83920n(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m83921o(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
