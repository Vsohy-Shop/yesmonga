package com.urbanairship.iam;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0386z0;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9658k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.iam.d0 */
public class C9168d0 implements C9333e {
    @C0359n0

    /* renamed from: E0 */
    public static final String f24880E0 = "left";
    @C0359n0

    /* renamed from: F0 */
    public static final String f24881F0 = "center";
    @C0359n0

    /* renamed from: G0 */
    public static final String f24882G0 = "bold";
    @C0359n0

    /* renamed from: H0 */
    public static final String f24883H0 = "underline";
    @C0359n0

    /* renamed from: I0 */
    public static final String f24884I0 = "italic";

    /* renamed from: X */
    public static final String f24885X = "font_family";

    /* renamed from: Y */
    public static final String f24886Y = "android_drawable_res_name";
    @C0359n0

    /* renamed from: Z */
    public static final String f24887Z = "right";

    /* renamed from: v */
    public static final String f24888v = "text";

    /* renamed from: w */
    public static final String f24889w = "size";

    /* renamed from: x */
    public static final String f24890x = "color";

    /* renamed from: y */
    public static final String f24891y = "alignment";

    /* renamed from: z */
    public static final String f24892z = "style";

    /* renamed from: a */
    public final String f24893a;
    @C0354l

    /* renamed from: b */
    public final Integer f24894b;

    /* renamed from: c */
    public final Float f24895c;

    /* renamed from: d */
    public final String f24896d;

    /* renamed from: e */
    public final List<String> f24897e;

    /* renamed from: f */
    public final List<String> f24898f;

    /* renamed from: g */
    public final String f24899g;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.d0$b */
    public @interface C9170b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.d0$d */
    public @interface C9172d {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.C0359n0
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.urbanairship.iam.C9168d0 m34366h(@androidx.annotation.C0359n0 com.urbanairship.json.JsonValue r13) throws com.urbanairship.json.JsonException {
        /*
            com.urbanairship.json.b r13 = r13.mo18749A()
            com.urbanairship.iam.d0$c r0 = m34367p()
            java.lang.String r1 = "text"
            boolean r2 = r13.mo18805e(r1)
            if (r2 == 0) goto L_0x001b
            com.urbanairship.json.JsonValue r1 = r13.mo18801A(r1)
            java.lang.String r1 = r1.mo18750B()
            r0.mo18400p(r1)
        L_0x001b:
            java.lang.String r1 = "color"
            boolean r2 = r13.mo18805e(r1)
            if (r2 == 0) goto L_0x004f
            com.urbanairship.json.JsonValue r2 = r13.mo18801A(r1)     // Catch:{ IllegalArgumentException -> 0x0033 }
            java.lang.String r2 = r2.mo18750B()     // Catch:{ IllegalArgumentException -> 0x0033 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0033 }
            r0.mo18396l(r2)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x004f
        L_0x0033:
            r0 = move-exception
            com.urbanairship.json.JsonException r2 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid color: "
            r3.append(r4)
            com.urbanairship.json.JsonValue r13 = r13.mo18801A(r1)
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            r2.<init>(r13, r0)
            throw r2
        L_0x004f:
            java.lang.String r1 = "size"
            boolean r2 = r13.mo18805e(r1)
            if (r2 == 0) goto L_0x0089
            com.urbanairship.json.JsonValue r2 = r13.mo18801A(r1)
            boolean r2 = r2.mo18782x()
            if (r2 == 0) goto L_0x006e
            com.urbanairship.json.JsonValue r1 = r13.mo18801A(r1)
            r2 = 0
            float r1 = r1.mo18760e(r2)
            r0.mo18399o(r1)
            goto L_0x0089
        L_0x006e:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Size must be a number: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r13 = r13.mo18801A(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        L_0x0089:
            java.lang.String r1 = "alignment"
            boolean r2 = r13.mo18805e(r1)
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00f2
            com.urbanairship.json.JsonValue r2 = r13.mo18801A(r1)
            java.lang.String r2 = r2.mo18750B()
            r2.hashCode()
            int r7 = r2.hashCode()
            java.lang.String r8 = "right"
            java.lang.String r9 = "left"
            java.lang.String r10 = "center"
            switch(r7) {
                case -1364013995: goto L_0x00c1;
                case 3317767: goto L_0x00b8;
                case 108511772: goto L_0x00af;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r2 = r6
            goto L_0x00c9
        L_0x00af:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x00b6
            goto L_0x00ad
        L_0x00b6:
            r2 = r3
            goto L_0x00c9
        L_0x00b8:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x00bf
            goto L_0x00ad
        L_0x00bf:
            r2 = r4
            goto L_0x00c9
        L_0x00c1:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00c8
            goto L_0x00ad
        L_0x00c8:
            r2 = r5
        L_0x00c9:
            switch(r2) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00e7;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected alignment: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r13 = r13.mo18801A(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        L_0x00e7:
            r0.mo18395k(r8)
            goto L_0x00f2
        L_0x00eb:
            r0.mo18395k(r9)
            goto L_0x00f2
        L_0x00ef:
            r0.mo18395k(r10)
        L_0x00f2:
            java.lang.String r1 = "style"
            boolean r2 = r13.mo18805e(r1)
            if (r2 == 0) goto L_0x0193
            com.urbanairship.json.JsonValue r2 = r13.mo18801A(r1)
            boolean r2 = r2.mo18776t()
            if (r2 == 0) goto L_0x0178
            com.urbanairship.json.JsonValue r2 = r13.mo18801A(r1)
            com.urbanairship.json.a r2 = r2.mo18784z()
            java.util.Iterator r2 = r2.iterator()
        L_0x0110:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0193
            java.lang.Object r7 = r2.next()
            com.urbanairship.json.JsonValue r7 = (com.urbanairship.json.JsonValue) r7
            java.lang.String r8 = r7.mo18750B()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            r8.hashCode()
            int r9 = r8.hashCode()
            java.lang.String r10 = "bold"
            java.lang.String r11 = "underline"
            java.lang.String r12 = "italic"
            switch(r9) {
                case -1178781136: goto L_0x014a;
                case -1026963764: goto L_0x0141;
                case 3029637: goto L_0x0138;
                default: goto L_0x0136;
            }
        L_0x0136:
            r8 = r6
            goto L_0x0152
        L_0x0138:
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x013f
            goto L_0x0136
        L_0x013f:
            r8 = r3
            goto L_0x0152
        L_0x0141:
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0148
            goto L_0x0136
        L_0x0148:
            r8 = r4
            goto L_0x0152
        L_0x014a:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0151
            goto L_0x0136
        L_0x0151:
            r8 = r5
        L_0x0152:
            switch(r8) {
                case 0: goto L_0x0174;
                case 1: goto L_0x0170;
                case 2: goto L_0x016c;
                default: goto L_0x0155;
            }
        L_0x0155:
            com.urbanairship.json.JsonException r13 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid style: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x016c:
            r0.mo18393i(r10)
            goto L_0x0110
        L_0x0170:
            r0.mo18393i(r11)
            goto L_0x0110
        L_0x0174:
            r0.mo18393i(r12)
            goto L_0x0110
        L_0x0178:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Style must be an array: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r13 = r13.mo18801A(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        L_0x0193:
            java.lang.String r2 = "font_family"
            boolean r3 = r13.mo18805e(r2)
            if (r3 == 0) goto L_0x01fd
            com.urbanairship.json.JsonValue r3 = r13.mo18801A(r2)
            boolean r3 = r3.mo18776t()
            if (r3 == 0) goto L_0x01e2
            com.urbanairship.json.JsonValue r1 = r13.mo18801A(r2)
            com.urbanairship.json.a r1 = r1.mo18784z()
            java.util.Iterator r1 = r1.iterator()
        L_0x01b1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01fd
            java.lang.Object r2 = r1.next()
            com.urbanairship.json.JsonValue r2 = (com.urbanairship.json.JsonValue) r2
            boolean r3 = r2.mo18783y()
            if (r3 == 0) goto L_0x01cb
            java.lang.String r2 = r2.mo18750B()
            r0.mo18392h(r2)
            goto L_0x01b1
        L_0x01cb:
            com.urbanairship.json.JsonException r13 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid font: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x01e2:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fonts must be an array: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r13 = r13.mo18801A(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        L_0x01fd:
            java.lang.String r1 = "android_drawable_res_name"
            com.urbanairship.json.JsonValue r1 = r13.mo18801A(r1)
            java.lang.String r1 = r1.mo18769l()
            r0.mo18398n(r1)
            com.urbanairship.iam.d0 r13 = r0.mo18394j()     // Catch:{ IllegalArgumentException -> 0x020f }
            return r13
        L_0x020f:
            r0 = move-exception
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid text object JSON: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.C9168d0.m34366h(com.urbanairship.json.JsonValue):com.urbanairship.iam.d0");
    }

    @C0359n0
    /* renamed from: p */
    public static C9171c m34367p() {
        return new C9171c();
    }

    @C0359n0
    /* renamed from: r */
    public static C9171c m34368r(@C0359n0 C9168d0 d0Var) {
        return new C9171c();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9168d0 d0Var = (C9168d0) obj;
        String str = this.f24899g;
        if (str == null ? d0Var.f24899g != null : !str.equals(d0Var.f24899g)) {
            return false;
        }
        String str2 = this.f24893a;
        if (str2 == null ? d0Var.f24893a != null : !str2.equals(d0Var.f24893a)) {
            return false;
        }
        Integer num = this.f24894b;
        if (num == null ? d0Var.f24894b != null : !num.equals(d0Var.f24894b)) {
            return false;
        }
        Float f = this.f24895c;
        if (f == null ? d0Var.f24895c != null : !f.equals(d0Var.f24895c)) {
            return false;
        }
        String str3 = this.f24896d;
        if (str3 == null ? d0Var.f24896d != null : !str3.equals(d0Var.f24896d)) {
            return false;
        }
        if (!this.f24897e.equals(d0Var.f24897e)) {
            return false;
        }
        return this.f24898f.equals(d0Var.f24898f);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f24893a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Integer num = this.f24894b;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Float f = this.f24895c;
        if (f != null) {
            i3 = f.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f24896d;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (((((i8 + i4) * 31) + this.f24897e.hashCode()) * 31) + this.f24898f.hashCode()) * 31;
        String str3 = this.f24899g;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return hashCode + i5;
    }

    @C0363p0
    /* renamed from: i */
    public String mo18384i() {
        return this.f24896d;
    }

    @C0363p0
    /* renamed from: j */
    public Integer mo18385j() {
        return this.f24894b;
    }

    @C0375v
    /* renamed from: k */
    public int mo18386k(@C0359n0 Context context) {
        if (this.f24899g != null) {
            try {
                return context.getResources().getIdentifier(this.f24899g, "drawable", context.getPackageName());
            } catch (Resources.NotFoundException unused) {
                C36059m.m148406b("Drawable " + this.f24899g + " no longer exists.", new Object[0]);
            }
        }
        return 0;
    }

    @C0359n0
    /* renamed from: l */
    public List<String> mo18387l() {
        return this.f24898f;
    }

    @C0363p0
    /* renamed from: m */
    public Float mo18388m() {
        return this.f24895c;
    }

    @C0359n0
    /* renamed from: n */
    public List<String> mo18389n() {
        return this.f24897e;
    }

    @C0363p0
    /* renamed from: o */
    public String mo18390o() {
        return this.f24893a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        String str;
        C9323b.C9325b g = C9323b.m35017y().mo18823g("text", this.f24893a);
        Integer num = this.f24894b;
        if (num == null) {
            str = null;
        } else {
            str = C9658k.m36180a(num.intValue());
        }
        return g.mo18826j("color", str).mo18826j(f24889w, this.f24895c).mo18823g(f24891y, this.f24896d).mo18822f("style", JsonValue.m34975U(this.f24897e)).mo18822f(f24885X, JsonValue.m34975U(this.f24898f)).mo18826j(f24886Y, this.f24899g).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: com.urbanairship.iam.d0$c */
    public static class C9171c {

        /* renamed from: a */
        public String f24900a;
        @C0354l

        /* renamed from: b */
        public Integer f24901b;

        /* renamed from: c */
        public Float f24902c;

        /* renamed from: d */
        public String f24903d;

        /* renamed from: e */
        public String f24904e;

        /* renamed from: f */
        public List<String> f24905f;

        /* renamed from: g */
        public List<String> f24906g;

        @C0359n0
        /* renamed from: h */
        public C9171c mo18392h(@C0359n0 String str) {
            this.f24906g.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9171c mo18393i(@C0359n0 String str) {
            if (!this.f24905f.contains(str)) {
                this.f24905f.add(str);
            }
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9168d0 mo18394j() {
            boolean z;
            if (this.f24903d == null && this.f24900a == null) {
                z = false;
            } else {
                z = true;
            }
            C9654i.m36165a(z, "Missing text.");
            return new C9168d0(this);
        }

        @C0359n0
        /* renamed from: k */
        public C9171c mo18395k(@C0359n0 String str) {
            this.f24904e = str;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9171c mo18396l(@C0354l int i) {
            this.f24901b = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9171c mo18397m(@C0359n0 Context context, @C0375v int i) {
            try {
                this.f24903d = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                C36059m.m148406b("Drawable " + i + " no longer exists or has a new identifier.", new Object[0]);
            }
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9171c mo18398n(@C0363p0 String str) {
            this.f24903d = str;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9171c mo18399o(float f) {
            this.f24902c = Float.valueOf(f);
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9171c mo18400p(@C0363p0 @C0386z0(min = 1) String str) {
            this.f24900a = str;
            return this;
        }

        public C9171c() {
            this.f24905f = new ArrayList();
            this.f24906g = new ArrayList();
        }

        public C9171c(@C0359n0 C9168d0 d0Var) {
            this.f24905f = new ArrayList();
            this.f24906g = new ArrayList();
            this.f24900a = d0Var.f24893a;
            this.f24901b = d0Var.f24894b;
            this.f24902c = d0Var.f24895c;
            this.f24904e = d0Var.f24896d;
            this.f24905f = d0Var.f24897e;
            this.f24903d = d0Var.f24899g;
            this.f24906g = d0Var.f24898f;
        }
    }

    public C9168d0(@C0359n0 C9171c cVar) {
        this.f24893a = cVar.f24900a;
        this.f24894b = cVar.f24901b;
        this.f24895c = cVar.f24902c;
        this.f24896d = cVar.f24904e;
        this.f24897e = new ArrayList(cVar.f24905f);
        this.f24899g = cVar.f24903d;
        this.f24898f = new ArrayList(cVar.f24906g);
    }
}
