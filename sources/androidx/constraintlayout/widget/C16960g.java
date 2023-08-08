package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C16944e;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.g */
public class C16960g {

    /* renamed from: h */
    public static final String f44841h = "ConstraintLayoutStates";

    /* renamed from: i */
    public static final boolean f44842i = false;

    /* renamed from: a */
    public int f44843a = -1;

    /* renamed from: b */
    public C16934c f44844b;

    /* renamed from: c */
    public int f44845c = -1;

    /* renamed from: d */
    public int f44846d = -1;

    /* renamed from: e */
    public SparseArray<C16961a> f44847e = new SparseArray<>();

    /* renamed from: f */
    public SparseArray<C16934c> f44848f = new SparseArray<>();

    /* renamed from: g */
    public C16943d f44849g = null;

    /* renamed from: androidx.constraintlayout.widget.g$a */
    public static class C16961a {

        /* renamed from: a */
        public int f44850a;

        /* renamed from: b */
        public ArrayList<C16962b> f44851b = new ArrayList<>();

        /* renamed from: c */
        public int f44852c = -1;

        /* renamed from: d */
        public boolean f44853d;

        public C16961a(Context context, XmlPullParser xmlPullParser) {
            this.f44853d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.State_android_id) {
                    this.f44850a = obtainStyledAttributes.getResourceId(index, this.f44850a);
                } else if (index == C16944e.C16957m.State_constraints) {
                    this.f44852c = obtainStyledAttributes.getResourceId(index, this.f44852c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44852c);
                    context.getResources().getResourceName(this.f44852c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f44853d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo50996a(C16962b bVar) {
            this.f44851b.add(bVar);
        }

        /* renamed from: b */
        public int mo50997b(float f, float f2) {
            for (int i = 0; i < this.f44851b.size(); i++) {
                if (this.f44851b.get(i).mo50998a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.g$b */
    public static class C16962b {

        /* renamed from: a */
        public int f44854a;

        /* renamed from: b */
        public float f44855b = Float.NaN;

        /* renamed from: c */
        public float f44856c = Float.NaN;

        /* renamed from: d */
        public float f44857d = Float.NaN;

        /* renamed from: e */
        public float f44858e = Float.NaN;

        /* renamed from: f */
        public int f44859f = -1;

        /* renamed from: g */
        public boolean f44860g;

        public C16962b(Context context, XmlPullParser xmlPullParser) {
            this.f44860g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.Variant_constraints) {
                    this.f44859f = obtainStyledAttributes.getResourceId(index, this.f44859f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44859f);
                    context.getResources().getResourceName(this.f44859f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f44860g = true;
                    }
                } else if (index == C16944e.C16957m.Variant_region_heightLessThan) {
                    this.f44858e = obtainStyledAttributes.getDimension(index, this.f44858e);
                } else if (index == C16944e.C16957m.Variant_region_heightMoreThan) {
                    this.f44856c = obtainStyledAttributes.getDimension(index, this.f44856c);
                } else if (index == C16944e.C16957m.Variant_region_widthLessThan) {
                    this.f44857d = obtainStyledAttributes.getDimension(index, this.f44857d);
                } else if (index == C16944e.C16957m.Variant_region_widthMoreThan) {
                    this.f44855b = obtainStyledAttributes.getDimension(index, this.f44855b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo50998a(float f, float f2) {
            if (!Float.isNaN(this.f44855b) && f < this.f44855b) {
                return false;
            }
            if (!Float.isNaN(this.f44856c) && f2 < this.f44856c) {
                return false;
            }
            if (!Float.isNaN(this.f44857d) && f > this.f44857d) {
                return false;
            }
            if (Float.isNaN(this.f44858e) || f2 <= this.f44858e) {
                return true;
            }
            return false;
        }
    }

    public C16960g(Context context, XmlPullParser xmlPullParser) {
        mo50991b(context, xmlPullParser);
    }

    /* renamed from: a */
    public int mo50990a(int i, int i2, float f, float f2) {
        C16961a aVar = this.f44847e.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Iterator<C16962b> it = aVar.f44851b.iterator();
            C16962b bVar = null;
            while (it.hasNext()) {
                C16962b next = it.next();
                if (next.mo50998a(f, f2)) {
                    if (i == next.f44859f) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f44859f;
            }
            return aVar.f44852c;
        } else if (aVar.f44852c == i) {
            return i;
        } else {
            Iterator<C16962b> it2 = aVar.f44851b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f44859f) {
                    return i;
                }
            }
            return aVar.f44852c;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50991b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C16944e.C16957m.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L_0x0010:
            if (r3 >= r1) goto L_0x0025
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C16944e.C16957m.StateSet_defaultState
            if (r4 != r5) goto L_0x0022
            int r5 = r8.f44843a
            int r4 = r0.getResourceId(r4, r5)
            r8.f44843a = r4
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x002d:
            r3 = 1
            if (r0 == r3) goto L_0x00a6
            if (r0 == 0) goto L_0x0095
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0046
            if (r0 == r5) goto L_0x003b
            goto L_0x0098
        L_0x003b:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            boolean r0 = r4.equals(r0)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0098
            return
        L_0x0046:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r7 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            switch(r7) {
                case 80204913: goto L_0x006d;
                case 1301459538: goto L_0x0063;
                case 1382829617: goto L_0x005c;
                case 1901439077: goto L_0x0052;
                default: goto L_0x0051;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0051:
            goto L_0x0077
        L_0x0052:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0077
            r3 = r5
            goto L_0x0078
        L_0x005c:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0063:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0077
            r3 = r2
            goto L_0x0078
        L_0x006d:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0077
            r3 = r6
            goto L_0x0078
        L_0x0077:
            r3 = -1
        L_0x0078:
            if (r3 == r6) goto L_0x0088
            if (r3 == r5) goto L_0x007d
            goto L_0x0098
        L_0x007d:
            androidx.constraintlayout.widget.g$b r0 = new androidx.constraintlayout.widget.g$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            r1.mo50996a(r0)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0088:
            androidx.constraintlayout.widget.g$a r1 = new androidx.constraintlayout.widget.g$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<androidx.constraintlayout.widget.g$a> r0 = r8.f44847e     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r3 = r1.f44850a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r0.put(r3, r1)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0095:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r0 = r10.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x002d
        L_0x009d:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r9 = move-exception
            r9.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C16960g.mo50991b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: c */
    public boolean mo50992c(int i, float f, float f2) {
        Object obj;
        int i2 = this.f44845c;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f44847e.valueAt(0);
        } else {
            obj = this.f44847e.get(i2);
        }
        C16961a aVar = (C16961a) obj;
        int i3 = this.f44846d;
        if ((i3 == -1 || !aVar.f44851b.get(i3).mo50998a(f, f2)) && this.f44846d != aVar.mo50997b(f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo50993d(C16943d dVar) {
        this.f44849g = dVar;
    }

    /* renamed from: e */
    public int mo50994e(int i, int i2, int i3) {
        return mo50995f(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: f */
    public int mo50995f(int i, int i2, float f, float f2) {
        C16961a aVar;
        int b;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.f44847e.valueAt(0);
            } else {
                aVar = this.f44847e.get(this.f44845c);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f44846d != -1 && aVar.f44851b.get(i).mo50998a(f, f2)) || i == (b = aVar.mo50997b(f, f2))) {
                return i;
            }
            if (b == -1) {
                return aVar.f44852c;
            }
            return aVar.f44851b.get(b).f44859f;
        }
        C16961a aVar2 = this.f44847e.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b2 = aVar2.mo50997b(f, f2);
        if (b2 == -1) {
            return aVar2.f44852c;
        }
        return aVar2.f44851b.get(b2).f44859f;
    }
}
