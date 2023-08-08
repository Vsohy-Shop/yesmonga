package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.collection.C1866a;
import androidx.core.graphics.C17586h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.palette.graphics.b */
public final class C19868b {

    /* renamed from: f */
    public static final int f50749f = 12544;

    /* renamed from: g */
    public static final int f50750g = 16;

    /* renamed from: h */
    public static final float f50751h = 3.0f;

    /* renamed from: i */
    public static final float f50752i = 4.5f;

    /* renamed from: j */
    public static final String f50753j = "Palette";

    /* renamed from: k */
    public static final boolean f50754k = false;

    /* renamed from: l */
    public static final C19872c f50755l = new C19869a();

    /* renamed from: a */
    public final List<C19874e> f50756a;

    /* renamed from: b */
    public final List<C19876d> f50757b;

    /* renamed from: c */
    public final Map<C19876d, C19874e> f50758c = new C1866a();

    /* renamed from: d */
    public final SparseBooleanArray f50759d = new SparseBooleanArray();
    @C0363p0

    /* renamed from: e */
    public final C19874e f50760e = mo58665a();

    /* renamed from: androidx.palette.graphics.b$a */
    public static class C19869a implements C19872c {

        /* renamed from: a */
        public static final float f50761a = 0.05f;

        /* renamed from: b */
        public static final float f50762b = 0.95f;

        /* renamed from: a */
        public boolean mo58685a(int i, float[] fArr) {
            return !mo58688d(fArr) && !mo58686b(fArr) && !mo58687c(fArr);
        }

        /* renamed from: b */
        public final boolean mo58686b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        public final boolean mo58687c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        public final boolean mo58688d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* renamed from: androidx.palette.graphics.b$c */
    public interface C19872c {
        /* renamed from: a */
        boolean mo58685a(@C0354l int i, @C0359n0 float[] fArr);
    }

    /* renamed from: androidx.palette.graphics.b$d */
    public interface C19873d {
        /* renamed from: a */
        void mo58706a(@C0363p0 C19868b bVar);
    }

    public C19868b(List<C19874e> list, List<C19876d> list2) {
        this.f50756a = list;
        this.f50757b = list2;
    }

    @C0359n0
    /* renamed from: b */
    public static C19870b m92257b(@C0359n0 Bitmap bitmap) {
        return new C19870b(bitmap);
    }

    @C0359n0
    /* renamed from: c */
    public static C19868b m92258c(@C0359n0 List<C19874e> list) {
        return new C19870b(list).mo58695g();
    }

    @Deprecated
    /* renamed from: d */
    public static C19868b m92259d(Bitmap bitmap) {
        return m92257b(bitmap).mo58695g();
    }

    @Deprecated
    /* renamed from: e */
    public static C19868b m92260e(Bitmap bitmap, int i) {
        return m92257b(bitmap).mo58697i(i).mo58695g();
    }

    @Deprecated
    /* renamed from: g */
    public static AsyncTask<Bitmap, Void, C19868b> m92261g(Bitmap bitmap, int i, C19873d dVar) {
        return m92257b(bitmap).mo58697i(i).mo58694f(dVar);
    }

    @Deprecated
    /* renamed from: h */
    public static AsyncTask<Bitmap, Void, C19868b> m92262h(Bitmap bitmap, C19873d dVar) {
        return m92257b(bitmap).mo58694f(dVar);
    }

    @C0359n0
    /* renamed from: A */
    public List<C19876d> mo58661A() {
        return Collections.unmodifiableList(this.f50757b);
    }

    @C0354l
    /* renamed from: B */
    public int mo58662B(@C0354l int i) {
        return mo58669k(C19876d.f50807z, i);
    }

    @C0363p0
    /* renamed from: C */
    public C19874e mo58663C() {
        return mo58683y(C19876d.f50807z);
    }

    /* renamed from: D */
    public final boolean mo58664D(C19874e eVar, C19876d dVar) {
        float[] c = eVar.mo58709c();
        if (c[1] < dVar.mo58720e() || c[1] > dVar.mo58718c() || c[2] < dVar.mo58719d() || c[2] > dVar.mo58717b() || this.f50759d.get(eVar.mo58711e())) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: a */
    public final C19874e mo58665a() {
        int size = this.f50756a.size();
        int i = Integer.MIN_VALUE;
        C19874e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C19874e eVar2 = this.f50756a.get(i2);
            if (eVar2.mo58710d() > i) {
                i = eVar2.mo58710d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: f */
    public void mo58666f() {
        int size = this.f50757b.size();
        for (int i = 0; i < size; i++) {
            C19876d dVar = this.f50757b.get(i);
            dVar.mo58726k();
            this.f50758c.put(dVar, mo58668j(dVar));
        }
        this.f50759d.clear();
    }

    /* renamed from: i */
    public final float mo58667i(C19874e eVar, C19876d dVar) {
        int i;
        float f;
        float f2;
        float[] c = eVar.mo58709c();
        C19874e eVar2 = this.f50760e;
        if (eVar2 != null) {
            i = eVar2.mo58710d();
        } else {
            i = 1;
        }
        float f3 = 0.0f;
        if (dVar.mo58722g() > 0.0f) {
            f = dVar.mo58722g() * (1.0f - Math.abs(c[1] - dVar.mo58724i()));
        } else {
            f = 0.0f;
        }
        if (dVar.mo58716a() > 0.0f) {
            f2 = dVar.mo58716a() * (1.0f - Math.abs(c[2] - dVar.mo58723h()));
        } else {
            f2 = 0.0f;
        }
        if (dVar.mo58721f() > 0.0f) {
            f3 = dVar.mo58721f() * (((float) eVar.mo58710d()) / ((float) i));
        }
        return f + f2 + f3;
    }

    @C0363p0
    /* renamed from: j */
    public final C19874e mo58668j(C19876d dVar) {
        C19874e v = mo58680v(dVar);
        if (v != null && dVar.mo58725j()) {
            this.f50759d.append(v.mo58711e(), true);
        }
        return v;
    }

    @C0354l
    /* renamed from: k */
    public int mo58669k(@C0359n0 C19876d dVar, @C0354l int i) {
        C19874e y = mo58683y(dVar);
        if (y != null) {
            return y.mo58711e();
        }
        return i;
    }

    @C0354l
    /* renamed from: l */
    public int mo58670l(@C0354l int i) {
        return mo58669k(C19876d.f50785D, i);
    }

    @C0363p0
    /* renamed from: m */
    public C19874e mo58671m() {
        return mo58683y(C19876d.f50785D);
    }

    @C0354l
    /* renamed from: n */
    public int mo58672n(@C0354l int i) {
        return mo58669k(C19876d.f50782A, i);
    }

    @C0363p0
    /* renamed from: o */
    public C19874e mo58673o() {
        return mo58683y(C19876d.f50782A);
    }

    @C0354l
    /* renamed from: p */
    public int mo58674p(@C0354l int i) {
        C19874e eVar = this.f50760e;
        return eVar != null ? eVar.mo58711e() : i;
    }

    @C0363p0
    /* renamed from: q */
    public C19874e mo58675q() {
        return this.f50760e;
    }

    @C0354l
    /* renamed from: r */
    public int mo58676r(@C0354l int i) {
        return mo58669k(C19876d.f50783B, i);
    }

    @C0363p0
    /* renamed from: s */
    public C19874e mo58677s() {
        return mo58683y(C19876d.f50783B);
    }

    @C0354l
    /* renamed from: t */
    public int mo58678t(@C0354l int i) {
        return mo58669k(C19876d.f50806y, i);
    }

    @C0363p0
    /* renamed from: u */
    public C19874e mo58679u() {
        return mo58683y(C19876d.f50806y);
    }

    @C0363p0
    /* renamed from: v */
    public final C19874e mo58680v(C19876d dVar) {
        int size = this.f50756a.size();
        float f = 0.0f;
        C19874e eVar = null;
        for (int i = 0; i < size; i++) {
            C19874e eVar2 = this.f50756a.get(i);
            if (mo58664D(eVar2, dVar)) {
                float i2 = mo58667i(eVar2, dVar);
                if (eVar == null || i2 > f) {
                    eVar = eVar2;
                    f = i2;
                }
            }
        }
        return eVar;
    }

    @C0354l
    /* renamed from: w */
    public int mo58681w(@C0354l int i) {
        return mo58669k(C19876d.f50784C, i);
    }

    @C0363p0
    /* renamed from: x */
    public C19874e mo58682x() {
        return mo58683y(C19876d.f50784C);
    }

    @C0363p0
    /* renamed from: y */
    public C19874e mo58683y(@C0359n0 C19876d dVar) {
        return this.f50758c.get(dVar);
    }

    @C0359n0
    /* renamed from: z */
    public List<C19874e> mo58684z() {
        return Collections.unmodifiableList(this.f50756a);
    }

    /* renamed from: androidx.palette.graphics.b$e */
    public static final class C19874e {

        /* renamed from: a */
        public final int f50773a;

        /* renamed from: b */
        public final int f50774b;

        /* renamed from: c */
        public final int f50775c;

        /* renamed from: d */
        public final int f50776d;

        /* renamed from: e */
        public final int f50777e;

        /* renamed from: f */
        public boolean f50778f;

        /* renamed from: g */
        public int f50779g;

        /* renamed from: h */
        public int f50780h;
        @C0363p0

        /* renamed from: i */
        public float[] f50781i;

        public C19874e(@C0354l int i, int i2) {
            this.f50773a = Color.red(i);
            this.f50774b = Color.green(i);
            this.f50775c = Color.blue(i);
            this.f50776d = i;
            this.f50777e = i2;
        }

        /* renamed from: a */
        public final void mo58707a() {
            int i;
            int i2;
            if (!this.f50778f) {
                int n = C17586h0.m80577n(-1, this.f50776d, 4.5f);
                int n2 = C17586h0.m80577n(-1, this.f50776d, 3.0f);
                if (n == -1 || n2 == -1) {
                    int n3 = C17586h0.m80577n(-16777216, this.f50776d, 4.5f);
                    int n4 = C17586h0.m80577n(-16777216, this.f50776d, 3.0f);
                    if (n3 == -1 || n4 == -1) {
                        if (n != -1) {
                            i = C17586h0.m80563B(-1, n);
                        } else {
                            i = C17586h0.m80563B(-16777216, n3);
                        }
                        this.f50780h = i;
                        if (n2 != -1) {
                            i2 = C17586h0.m80563B(-1, n2);
                        } else {
                            i2 = C17586h0.m80563B(-16777216, n4);
                        }
                        this.f50779g = i2;
                        this.f50778f = true;
                        return;
                    }
                    this.f50780h = C17586h0.m80563B(-16777216, n3);
                    this.f50779g = C17586h0.m80563B(-16777216, n4);
                    this.f50778f = true;
                    return;
                }
                this.f50780h = C17586h0.m80563B(-1, n);
                this.f50779g = C17586h0.m80563B(-1, n2);
                this.f50778f = true;
            }
        }

        @C0354l
        /* renamed from: b */
        public int mo58708b() {
            mo58707a();
            return this.f50780h;
        }

        @C0359n0
        /* renamed from: c */
        public float[] mo58709c() {
            if (this.f50781i == null) {
                this.f50781i = new float[3];
            }
            C17586h0.m80567d(this.f50773a, this.f50774b, this.f50775c, this.f50781i);
            return this.f50781i;
        }

        /* renamed from: d */
        public int mo58710d() {
            return this.f50777e;
        }

        @C0354l
        /* renamed from: e */
        public int mo58711e() {
            return this.f50776d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C19874e.class != obj.getClass()) {
                return false;
            }
            C19874e eVar = (C19874e) obj;
            if (this.f50777e == eVar.f50777e && this.f50776d == eVar.f50776d) {
                return true;
            }
            return false;
        }

        @C0354l
        /* renamed from: f */
        public int mo58713f() {
            mo58707a();
            return this.f50779g;
        }

        public int hashCode() {
            return (this.f50776d * 31) + this.f50777e;
        }

        public String toString() {
            return C19874e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(mo58711e()) + C12361b.f30261l + " [HSL: " + Arrays.toString(mo58709c()) + C12361b.f30261l + " [Population: " + this.f50777e + C12361b.f30261l + " [Title Text: #" + Integer.toHexString(mo58713f()) + C12361b.f30261l + " [Body Text: #" + Integer.toHexString(mo58708b()) + C12361b.f30261l;
        }

        public C19874e(int i, int i2, int i3, int i4) {
            this.f50773a = i;
            this.f50774b = i2;
            this.f50775c = i3;
            this.f50776d = Color.rgb(i, i2, i3);
            this.f50777e = i4;
        }

        public C19874e(float[] fArr, int i) {
            this(C17586h0.m80564a(fArr), i);
            this.f50781i = fArr;
        }
    }

    /* renamed from: androidx.palette.graphics.b$b */
    public static final class C19870b {
        @C0363p0

        /* renamed from: a */
        public final List<C19874e> f50763a;
        @C0363p0

        /* renamed from: b */
        public final Bitmap f50764b;

        /* renamed from: c */
        public final List<C19876d> f50765c;

        /* renamed from: d */
        public int f50766d;

        /* renamed from: e */
        public int f50767e;

        /* renamed from: f */
        public int f50768f;

        /* renamed from: g */
        public final List<C19872c> f50769g;
        @C0363p0

        /* renamed from: h */
        public Rect f50770h;

        /* renamed from: androidx.palette.graphics.b$b$a */
        public class C19871a extends AsyncTask<Bitmap, Void, C19868b> {

            /* renamed from: a */
            public final /* synthetic */ C19873d f50771a;

            public C19871a(C19873d dVar) {
                this.f50771a = dVar;
            }

            @C0363p0
            /* renamed from: a */
            public C19868b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C19870b.this.mo58695g();
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: b */
            public void onPostExecute(@C0363p0 C19868b bVar) {
                this.f50771a.mo58706a(bVar);
            }
        }

        public C19870b(@C0359n0 Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f50765c = arrayList;
            this.f50766d = 16;
            this.f50767e = C19868b.f50749f;
            this.f50768f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f50769g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C19868b.f50755l);
            this.f50764b = bitmap;
            this.f50763a = null;
            arrayList.add(C19876d.f50806y);
            arrayList.add(C19876d.f50807z);
            arrayList.add(C19876d.f50782A);
            arrayList.add(C19876d.f50783B);
            arrayList.add(C19876d.f50784C);
            arrayList.add(C19876d.f50785D);
        }

        @C0359n0
        /* renamed from: a */
        public C19870b mo58689a(C19872c cVar) {
            if (cVar != null) {
                this.f50769g.add(cVar);
            }
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C19870b mo58690b(@C0359n0 C19876d dVar) {
            if (!this.f50765c.contains(dVar)) {
                this.f50765c.add(dVar);
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C19870b mo58691c() {
            this.f50769g.clear();
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C19870b mo58692d() {
            this.f50770h = null;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C19870b mo58693e() {
            List<C19876d> list = this.f50765c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public AsyncTask<Bitmap, Void, C19868b> mo58694f(@C0359n0 C19873d dVar) {
            if (dVar != null) {
                return new C19871a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f50764b});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        @C0359n0
        /* renamed from: g */
        public C19868b mo58695g() {
            List<C19874e> list;
            C19872c[] cVarArr;
            Bitmap bitmap = this.f50764b;
            if (bitmap != null) {
                Bitmap l = mo58700l(bitmap);
                Rect rect = this.f50770h;
                if (!(l == this.f50764b || rect == null)) {
                    double width = ((double) l.getWidth()) / ((double) this.f50764b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), l.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), l.getHeight());
                }
                int[] h = mo58696h(l);
                int i = this.f50766d;
                if (this.f50769g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<C19872c> list2 = this.f50769g;
                    cVarArr = (C19872c[]) list2.toArray(new C19872c[list2.size()]);
                }
                C19865a aVar = new C19865a(h, i, cVarArr);
                if (l != this.f50764b) {
                    l.recycle();
                }
                list = aVar.mo58645d();
            } else {
                list = this.f50763a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C19868b bVar = new C19868b(list, this.f50765c);
            bVar.mo58666f();
            return bVar;
        }

        /* renamed from: h */
        public final int[] mo58696h(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f50770h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f50770h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f50770h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        @C0359n0
        /* renamed from: i */
        public C19870b mo58697i(int i) {
            this.f50766d = i;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C19870b mo58698j(int i) {
            this.f50767e = i;
            this.f50768f = -1;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: k */
        public C19870b mo58699k(int i) {
            this.f50768f = i;
            this.f50767e = -1;
            return this;
        }

        /* renamed from: l */
        public final Bitmap mo58700l(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f50767e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f50767e;
                if (width > i2) {
                    d = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f50768f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f50768f)) {
                d = ((double) i) / ((double) max);
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(((double) bitmap.getHeight()) * d), false);
        }

        @C0359n0
        /* renamed from: m */
        public C19870b mo58701m(@C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
            if (this.f50764b != null) {
                if (this.f50770h == null) {
                    this.f50770h = new Rect();
                }
                this.f50770h.set(0, 0, this.f50764b.getWidth(), this.f50764b.getHeight());
                if (!this.f50770h.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public C19870b(@C0359n0 List<C19874e> list) {
            this.f50765c = new ArrayList();
            this.f50766d = 16;
            this.f50767e = C19868b.f50749f;
            this.f50768f = -1;
            ArrayList arrayList = new ArrayList();
            this.f50769g = arrayList;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("List of Swatches is not valid");
            }
            arrayList.add(C19868b.f50755l);
            this.f50763a = list;
            this.f50764b = null;
        }
    }
}
