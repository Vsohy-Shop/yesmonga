package org.jsoup.nodes;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12891d;

/* renamed from: org.jsoup.nodes.b */
public class C12767b implements Iterable<C12766a>, Cloneable {

    /* renamed from: d */
    public static final String f31599d = "data-";

    /* renamed from: e */
    public static final char f31600e = '/';

    /* renamed from: f */
    public static final int f31601f = 3;

    /* renamed from: g */
    public static final int f31602g = 2;

    /* renamed from: v */
    public static final int f31603v = -1;

    /* renamed from: w */
    public static final String f31604w = "";

    /* renamed from: a */
    public int f31605a = 0;

    /* renamed from: b */
    public String[] f31606b = new String[3];

    /* renamed from: c */
    public String[] f31607c = new String[3];

    /* renamed from: org.jsoup.nodes.b$a */
    public class C12768a implements Iterator<C12766a> {

        /* renamed from: a */
        public int f31608a = 0;

        public C12768a() {
        }

        /* renamed from: b */
        public C12766a next() {
            C12767b bVar = C12767b.this;
            String[] strArr = bVar.f31606b;
            int i = this.f31608a;
            C12766a aVar = new C12766a(strArr[i], bVar.f31607c[i], bVar);
            this.f31608a++;
            return aVar;
        }

        public boolean hasNext() {
            while (this.f31608a < C12767b.this.f31605a) {
                C12767b bVar = C12767b.this;
                if (!bVar.mo29844H0(bVar.f31606b[this.f31608a])) {
                    break;
                }
                this.f31608a++;
            }
            if (this.f31608a < C12767b.this.f31605a) {
                return true;
            }
            return false;
        }

        public void remove() {
            C12767b bVar = C12767b.this;
            int i = this.f31608a - 1;
            this.f31608a = i;
            bVar.mo29850P0(i);
        }
    }

    /* renamed from: org.jsoup.nodes.b$b */
    public static class C12769b extends AbstractMap<String, String> {

        /* renamed from: a */
        public final C12767b f31610a;

        /* renamed from: org.jsoup.nodes.b$b$b */
        public class C12771b extends AbstractSet<Map.Entry<String, String>> {
            public C12771b() {
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new C12770a(C12769b.this, (C12768a) null);
            }

            public int size() {
                int i = 0;
                while (new C12770a(C12769b.this, (C12768a) null).hasNext()) {
                    i++;
                }
                return i;
            }

            public /* synthetic */ C12771b(C12769b bVar, C12768a aVar) {
                this();
            }
        }

        public /* synthetic */ C12769b(C12767b bVar, C12768a aVar) {
            this(bVar);
        }

        /* renamed from: b */
        public String put(String str, String str2) {
            String str3;
            String k = C12767b.m55369k0(str);
            if (this.f31610a.mo29869v0(k)) {
                str3 = this.f31610a.mo29863o0(k);
            } else {
                str3 = null;
            }
            this.f31610a.mo29846J0(k, str2);
            return str3;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return new C12771b(this, (C12768a) null);
        }

        /* renamed from: org.jsoup.nodes.b$b$a */
        public class C12770a implements Iterator<Map.Entry<String, String>> {

            /* renamed from: a */
            public Iterator<C12766a> f31611a;

            /* renamed from: b */
            public C12766a f31612b;

            public C12770a() {
                this.f31611a = C12769b.this.f31610a.iterator();
            }

            /* renamed from: b */
            public Map.Entry<String, String> next() {
                return new C12766a(this.f31612b.getKey().substring(5), this.f31612b.getValue());
            }

            public boolean hasNext() {
                while (this.f31611a.hasNext()) {
                    C12766a next = this.f31611a.next();
                    this.f31612b = next;
                    if (next.mo29834o()) {
                        return true;
                    }
                }
                return false;
            }

            public void remove() {
                C12769b.this.f31610a.mo29851R0(this.f31612b.getKey());
            }

            public /* synthetic */ C12770a(C12769b bVar, C12768a aVar) {
                this();
            }
        }

        public C12769b(C12767b bVar) {
            this.f31610a = bVar;
        }
    }

    /* renamed from: G0 */
    public static String m55363G0(String str) {
        return '/' + str;
    }

    /* renamed from: i0 */
    public static String m55367i0(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* renamed from: k0 */
    public static String m55369k0(String str) {
        return f31599d + str;
    }

    /* renamed from: A */
    public C12767b mo29840A(String str, @Nullable String str2) {
        mo29856h0(this.f31605a + 1);
        String[] strArr = this.f31606b;
        int i = this.f31605a;
        strArr[i] = str;
        this.f31607c[i] = str2;
        this.f31605a = i + 1;
        return this;
    }

    /* renamed from: B0 */
    public int mo29841B0(String str) {
        C12750d.m55073j(str);
        for (int i = 0; i < this.f31605a; i++) {
            if (str.equals(this.f31606b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F0 */
    public final int mo29842F0(String str) {
        C12750d.m55073j(str);
        for (int i = 0; i < this.f31605a; i++) {
            if (str.equalsIgnoreCase(this.f31606b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: H */
    public void mo29843H(C12767b bVar) {
        if (bVar.size() != 0) {
            mo29856h0(this.f31605a + bVar.f31605a);
            Iterator<C12766a> it = bVar.iterator();
            while (it.hasNext()) {
                mo29848M0(it.next());
            }
        }
    }

    /* renamed from: H0 */
    public final boolean mo29844H0(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* renamed from: I0 */
    public void mo29845I0() {
        for (int i = 0; i < this.f31605a; i++) {
            String[] strArr = this.f31606b;
            strArr[i] = C12757d.m55098a(strArr[i]);
        }
    }

    /* renamed from: J0 */
    public C12767b mo29846J0(String str, @Nullable String str2) {
        C12750d.m55073j(str);
        int B0 = mo29841B0(str);
        if (B0 != -1) {
            this.f31607c[B0] = str2;
        } else {
            mo29840A(str, str2);
        }
        return this;
    }

    /* renamed from: L0 */
    public C12767b mo29847L0(String str, boolean z) {
        if (z) {
            mo29849O0(str, (String) null);
        } else {
            mo29851R0(str);
        }
        return this;
    }

    /* renamed from: M0 */
    public C12767b mo29848M0(C12766a aVar) {
        C12750d.m55073j(aVar);
        mo29846J0(aVar.getKey(), aVar.getValue());
        aVar.f31598c = this;
        return this;
    }

    /* renamed from: O0 */
    public void mo29849O0(String str, @Nullable String str2) {
        int F0 = mo29842F0(str);
        if (F0 != -1) {
            this.f31607c[F0] = str2;
            if (!this.f31606b[F0].equals(str)) {
                this.f31606b[F0] = str;
                return;
            }
            return;
        }
        mo29840A(str, str2);
    }

    /* renamed from: P0 */
    public final void mo29850P0(int i) {
        boolean z;
        if (i >= this.f31605a) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55065b(z);
        int i2 = (this.f31605a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f31606b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f31607c;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f31605a - 1;
        this.f31605a = i4;
        this.f31606b[i4] = null;
        this.f31607c[i4] = null;
    }

    /* renamed from: R0 */
    public void mo29851R0(String str) {
        int B0 = mo29841B0(str);
        if (B0 != -1) {
            mo29850P0(B0);
        }
    }

    /* renamed from: S0 */
    public void mo29852S0(String str) {
        int F0 = mo29842F0(str);
        if (F0 != -1) {
            mo29850P0(F0);
        }
    }

    /* renamed from: Y */
    public List<C12766a> mo29853Y() {
        ArrayList arrayList = new ArrayList(this.f31605a);
        for (int i = 0; i < this.f31605a; i++) {
            if (!mo29844H0(this.f31606b[i])) {
                arrayList.add(new C12766a(this.f31606b[i], this.f31607c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12767b bVar = (C12767b) obj;
        if (this.f31605a != bVar.f31605a) {
            return false;
        }
        for (int i = 0; i < this.f31605a; i++) {
            int B0 = bVar.mo29841B0(this.f31606b[i]);
            if (B0 == -1) {
                return false;
            }
            String str = this.f31607c[i];
            String str2 = bVar.f31607c[B0];
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h0 */
    public final void mo29856h0(int i) {
        boolean z;
        if (i >= this.f31605a) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        String[] strArr = this.f31606b;
        int length = strArr.length;
        if (length < i) {
            int i2 = 3;
            if (length >= 3) {
                i2 = this.f31605a * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.f31606b = (String[]) Arrays.copyOf(strArr, i);
            this.f31607c = (String[]) Arrays.copyOf(this.f31607c, i);
        }
    }

    public int hashCode() {
        return (((this.f31605a * 31) + Arrays.hashCode(this.f31606b)) * 31) + Arrays.hashCode(this.f31607c);
    }

    public boolean isEmpty() {
        return this.f31605a == 0;
    }

    public Iterator<C12766a> iterator() {
        return new C12768a();
    }

    /* renamed from: j0 */
    public C12767b clone() {
        try {
            C12767b bVar = (C12767b) super.clone();
            bVar.f31605a = this.f31605a;
            this.f31606b = (String[]) Arrays.copyOf(this.f31606b, this.f31605a);
            this.f31607c = (String[]) Arrays.copyOf(this.f31607c, this.f31605a);
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l0 */
    public Map<String, String> mo29861l0() {
        return new C12769b(this, (C12768a) null);
    }

    /* renamed from: m0 */
    public int mo29862m0(C12891d dVar) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean e = dVar.mo30172e();
        int i2 = 0;
        while (i < this.f31606b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f31606b;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    i = i3;
                } else {
                    if (!e || !strArr[i].equals(str)) {
                        if (!e) {
                            String[] strArr2 = this.f31606b;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    mo29850P0(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: o0 */
    public String mo29863o0(String str) {
        int B0 = mo29841B0(str);
        if (B0 == -1) {
            return "";
        }
        return m55367i0(this.f31607c[B0]);
    }

    /* renamed from: r0 */
    public String mo29864r0(String str) {
        int F0 = mo29842F0(str);
        if (F0 == -1) {
            return "";
        }
        return m55367i0(this.f31607c[F0]);
    }

    /* renamed from: s0 */
    public boolean mo29865s0(String str) {
        int B0 = mo29841B0(str);
        if (B0 == -1 || this.f31607c[B0] == null) {
            return false;
        }
        return true;
    }

    public int size() {
        return this.f31605a;
    }

    public String toString() {
        return mo29871y0();
    }

    /* renamed from: u0 */
    public boolean mo29868u0(String str) {
        int F0 = mo29842F0(str);
        if (F0 == -1 || this.f31607c[F0] == null) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    public boolean mo29869v0(String str) {
        return mo29841B0(str) != -1;
    }

    /* renamed from: w0 */
    public boolean mo29870w0(String str) {
        return mo29842F0(str) != -1;
    }

    /* renamed from: y0 */
    public String mo29871y0() {
        StringBuilder b = C12759f.m55102b();
        try {
            mo29872z0(b, new Document("").mo29671z3());
            return C12759f.m55116p(b);
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    /* renamed from: z0 */
    public final void mo29872z0(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        String f;
        int i = this.f31605a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!mo29844H0(this.f31606b[i2]) && (f = C12766a.m55347f(this.f31606b[i2], outputSettings.mo29687u())) != null) {
                C12766a.m55349m(f, this.f31607c[i2], appendable.append(' '), outputSettings);
            }
        }
    }
}
