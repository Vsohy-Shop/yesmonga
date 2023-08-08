package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C16944e;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
public class C16930a {

    /* renamed from: h */
    public static final String f44393h = "ConstraintLayoutStates";

    /* renamed from: i */
    public static final boolean f44394i = false;

    /* renamed from: a */
    public final ConstraintLayout f44395a;

    /* renamed from: b */
    public C16934c f44396b;

    /* renamed from: c */
    public int f44397c = -1;

    /* renamed from: d */
    public int f44398d = -1;

    /* renamed from: e */
    public SparseArray<C16931a> f44399e = new SparseArray<>();

    /* renamed from: f */
    public SparseArray<C16934c> f44400f = new SparseArray<>();

    /* renamed from: g */
    public C16943d f44401g = null;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static class C16931a {

        /* renamed from: a */
        public int f44402a;

        /* renamed from: b */
        public ArrayList<C16932b> f44403b = new ArrayList<>();

        /* renamed from: c */
        public int f44404c = -1;

        /* renamed from: d */
        public C16934c f44405d;

        public C16931a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.State_android_id) {
                    this.f44402a = obtainStyledAttributes.getResourceId(index, this.f44402a);
                } else if (index == C16944e.C16957m.State_constraints) {
                    this.f44404c = obtainStyledAttributes.getResourceId(index, this.f44404c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44404c);
                    context.getResources().getResourceName(this.f44404c);
                    if ("layout".equals(resourceTypeName)) {
                        C16934c cVar = new C16934c();
                        this.f44405d = cVar;
                        cVar.mo50822G(context, this.f44404c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo50756a(C16932b bVar) {
            this.f44403b.add(bVar);
        }

        /* renamed from: b */
        public int mo50757b(float f, float f2) {
            for (int i = 0; i < this.f44403b.size(); i++) {
                if (this.f44403b.get(i).mo50758a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public static class C16932b {

        /* renamed from: a */
        public int f44406a;

        /* renamed from: b */
        public float f44407b = Float.NaN;

        /* renamed from: c */
        public float f44408c = Float.NaN;

        /* renamed from: d */
        public float f44409d = Float.NaN;

        /* renamed from: e */
        public float f44410e = Float.NaN;

        /* renamed from: f */
        public int f44411f = -1;

        /* renamed from: g */
        public C16934c f44412g;

        public C16932b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.Variant_constraints) {
                    this.f44411f = obtainStyledAttributes.getResourceId(index, this.f44411f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44411f);
                    context.getResources().getResourceName(this.f44411f);
                    if ("layout".equals(resourceTypeName)) {
                        C16934c cVar = new C16934c();
                        this.f44412g = cVar;
                        cVar.mo50822G(context, this.f44411f);
                    }
                } else if (index == C16944e.C16957m.Variant_region_heightLessThan) {
                    this.f44410e = obtainStyledAttributes.getDimension(index, this.f44410e);
                } else if (index == C16944e.C16957m.Variant_region_heightMoreThan) {
                    this.f44408c = obtainStyledAttributes.getDimension(index, this.f44408c);
                } else if (index == C16944e.C16957m.Variant_region_widthLessThan) {
                    this.f44409d = obtainStyledAttributes.getDimension(index, this.f44409d);
                } else if (index == C16944e.C16957m.Variant_region_widthMoreThan) {
                    this.f44407b = obtainStyledAttributes.getDimension(index, this.f44407b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo50758a(float f, float f2) {
            if (!Float.isNaN(this.f44407b) && f < this.f44407b) {
                return false;
            }
            if (!Float.isNaN(this.f44408c) && f2 < this.f44408c) {
                return false;
            }
            if (!Float.isNaN(this.f44409d) && f > this.f44409d) {
                return false;
            }
            if (Float.isNaN(this.f44410e) || f2 <= this.f44410e) {
                return true;
            }
            return false;
        }
    }

    public C16930a(Context context, ConstraintLayout constraintLayout, int i) {
        this.f44395a = constraintLayout;
        mo50751a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50751a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r1 = 0
        L_0x000d:
            r2 = 1
            if (r0 == r2) goto L_0x008b
            if (r0 == 0) goto L_0x007a
            r3 = 2
            if (r0 == r3) goto L_0x0017
            goto L_0x007d
        L_0x0017:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x004c;
                case 80204913: goto L_0x0042;
                case 1382829617: goto L_0x0039;
                case 1657696882: goto L_0x002f;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
        L_0x0024:
            goto L_0x0056
        L_0x0025:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r6
            goto L_0x0057
        L_0x002f:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = 0
            goto L_0x0057
        L_0x0039:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0042:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r3
            goto L_0x0057
        L_0x004c:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r5
            goto L_0x0057
        L_0x0056:
            r2 = -1
        L_0x0057:
            if (r2 == r3) goto L_0x006d
            if (r2 == r6) goto L_0x0062
            if (r2 == r5) goto L_0x005e
            goto L_0x007d
        L_0x005e:
            r7.mo50753c(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x0062:
            androidx.constraintlayout.widget.a$b r0 = new androidx.constraintlayout.widget.a$b     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r1 == 0) goto L_0x007d
            r1.mo50756a(r0)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x006d:
            androidx.constraintlayout.widget.a$a r1 = new androidx.constraintlayout.widget.a$a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r1.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            android.util.SparseArray<androidx.constraintlayout.widget.a$a> r0 = r7.f44399e     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            int r2 = r1.f44402a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x007a:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
        L_0x007d:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x000d
        L_0x0082:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x008b
        L_0x0087:
            r8 = move-exception
            r8.printStackTrace()
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C16930a.mo50751a(android.content.Context, int):void");
    }

    /* renamed from: b */
    public boolean mo50752b(int i, float f, float f2) {
        Object obj;
        int i2 = this.f44397c;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f44399e.valueAt(0);
        } else {
            obj = this.f44399e.get(i2);
        }
        C16931a aVar = (C16931a) obj;
        int i3 = this.f44398d;
        if ((i3 == -1 || !aVar.f44403b.get(i3).mo50758a(f, f2)) && this.f44398d != aVar.mo50757b(f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo50753c(Context context, XmlPullParser xmlPullParser) {
        int i;
        C16934c cVar = new C16934c();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1 && attributeValue.length() > 1) {
                    i = Integer.parseInt(attributeValue.substring(1));
                }
                cVar.mo50918x0(context, xmlPullParser);
                this.f44400f.put(i, cVar);
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo50754d(C16943d dVar) {
        this.f44401g = dVar;
    }

    /* renamed from: e */
    public void mo50755e(int i, float f, float f2) {
        C16934c cVar;
        int i2;
        C16931a aVar;
        int b;
        C16934c cVar2;
        int i3;
        int i4 = this.f44397c;
        if (i4 == i) {
            if (i == -1) {
                aVar = this.f44399e.valueAt(0);
            } else {
                aVar = this.f44399e.get(i4);
            }
            int i5 = this.f44398d;
            if ((i5 == -1 || !aVar.f44403b.get(i5).mo50758a(f, f2)) && this.f44398d != (b = aVar.mo50757b(f, f2))) {
                if (b == -1) {
                    cVar2 = this.f44396b;
                } else {
                    cVar2 = aVar.f44403b.get(b).f44412g;
                }
                if (b == -1) {
                    i3 = aVar.f44404c;
                } else {
                    i3 = aVar.f44403b.get(b).f44411f;
                }
                if (cVar2 != null) {
                    this.f44398d = b;
                    C16943d dVar = this.f44401g;
                    if (dVar != null) {
                        dVar.mo50983b(-1, i3);
                    }
                    cVar2.mo50900r(this.f44395a);
                    C16943d dVar2 = this.f44401g;
                    if (dVar2 != null) {
                        dVar2.mo50982a(-1, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f44397c = i;
        C16931a aVar2 = this.f44399e.get(i);
        int b2 = aVar2.mo50757b(f, f2);
        if (b2 == -1) {
            cVar = aVar2.f44405d;
        } else {
            cVar = aVar2.f44403b.get(b2).f44412g;
        }
        if (b2 == -1) {
            i2 = aVar2.f44404c;
        } else {
            i2 = aVar2.f44403b.get(b2).f44411f;
        }
        if (cVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            return;
        }
        this.f44398d = b2;
        C16943d dVar3 = this.f44401g;
        if (dVar3 != null) {
            dVar3.mo50983b(i, i2);
        }
        cVar.mo50900r(this.f44395a);
        C16943d dVar4 = this.f44401g;
        if (dVar4 != null) {
            dVar4.mo50982a(i, i2);
        }
    }
}
